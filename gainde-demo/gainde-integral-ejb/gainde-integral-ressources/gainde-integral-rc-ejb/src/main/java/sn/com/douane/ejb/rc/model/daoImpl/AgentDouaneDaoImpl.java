package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAgentDouaneDao;
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.utils.LabelValue;

@Stateless(name="IAgentDouaneDao")
public class AgentDouaneDaoImpl extends GenericDaoImpl<AgentDouane> implements IAgentDouaneDao{
	
	@EJB
	private IFonctionnalitesDao fonctionnalitesDao;  

	@SuppressWarnings("unchecked")
	@Override
	public List<AgentDouane> findAgentByCodeprofilBurActQuery(String codeProfil,
			String codeBurAct) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findAgentByCodeprofilBurAct");
	        qry.setParameter(1, codeProfil);
	        qry.setParameter(2, codeBurAct);
	        return (List<AgentDouane>) qry.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AgentDouane> findVerifBurAffQuery(String rcCodeBurAff,
			String rcCodeProfil, String rcCodeAgent) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findVerifBurAff");
	        qry.setParameter(1, rcCodeBurAff);
	        qry.setParameter(2, rcCodeProfil);
	        qry.setParameter(3, rcCodeAgent);
	        return (List<AgentDouane>) qry.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<AgentDouane> findVerifBurActiviteQuery(String rcCodeBurAct,
			String rcCodeProfil, String rcCodeAgent) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findVerifBurActivite");
	        qry.setParameter(1, rcCodeBurAct);
	        qry.setParameter(2, rcCodeProfil);
	        qry.setParameter(3, rcCodeAgent);
	        return (List<AgentDouane>) qry.getResultList();
	}


	public List<AgentDouane> getAgentDouaneByCodeUser(String codeUser){
		Query query = createQuery("from AgentDouane where  rcCodeUser = ?1 "); 
		query.setParameter(1, codeUser); 
		return query.getResultList(); 
	}
	
	/**
	 * cette methode permet de rechercher le code user de l'agent recepteur qui
     * est à son tour recherché par le code profil et le code bureu d'activite.
     * le code profil et tiré à partir de la fonctionnlité.
     * 
	 */
	@Override
	public String getCodeUserRecepteur(String codeFonction, String codeburactivite) throws RcEjbException {
        Fonctionnalite fonctVO = null;
        AgentDouane local = null;
        try {
            fonctVO = fonctionnalitesDao.findByPrimaryKey(codeFonction);
            String codeprofil = fonctVO.getRcCodeProfil();

            if ((codeprofil == null) || (codeprofil.trim().equals(""))){
                throw new RcEjbException(ConstErrCodRC.NOMATCHPROFILFORTHISFONCTION);
            }
            Hashtable<String, String> ht= new Hashtable<String, String>();
            ht.put("15M_CS","SM");
            ht.put("13L_CV","VL");
            ht.put("12Y_CS","SY");
            ht.put("12Y_CV","VY");
            ht.put("12Y_CB","BY");
            ht.put("15M_CB","BM");
            
            if(ht.containsKey(codeburactivite+"_"+codeprofil)){
              codeprofil=(String)ht.get(codeburactivite+"_"+codeprofil);
            }
            Iterator<AgentDouane> it = findAgentByCodeprofilBurActQuery(codeprofil,
                    codeburactivite).iterator();
           
          
            while(it.hasNext()){
            	local =(AgentDouane) it.next();
            	break;
            }
            if (local != null){
                return local.getRcCodeUser();
            }
            return "";
        
        } catch (FinderException e) {
            throw new RcEjbException(ConstErrCodRC.CODEUSERRECEPTEUR_NOTFOUND);
        } catch (EJBException e) {
            throw new RcEjbException(ConstErrCod.ejbExp);
        } catch (Exception e) {
            throw new RcEjbException(ConstErrCod.InspecifiedError);
        }
	
	}

	@Override
	public List<LabelValue> getListAgentdouane() throws FinderException, RcEjbException {
		 List<AgentDouane> vector = null;
		 List<LabelValue> vector2 = new ArrayList<LabelValue>();
	        try {
	        	AgentDouane agentdouaneVO = null;
	            vector =(List<AgentDouane>) rechercherByWhere("  From AgentDouane where  1=1   ");
	            vector2.add(new LabelValue("", ""));
	            for (int i = 0; i < vector.size(); i++) {
	                agentdouaneVO = (AgentDouane) vector.get(i);
	                
	                vector2.add(new LabelValue(agentdouaneVO.getRcNomAgent()
	                        + " - " + agentdouaneVO.getRcPrenomAgent(),
	                        agentdouaneVO.getRcCodeAgent()));
	            }
	        } catch (Exception e) {
	            throw new RcEjbException(e.getMessage());
	        }
	        return vector2;
	}

	 /**
     * cette fonction permet de vérifier que le vérificateur appartient au
     * bureau spécifié.
     * 
     * @param codefonction
     * @param codeburactivite
     * @return
     * @throws RcEjbException
     */
    public int getVerificateurBureauActivite(String codeagent, String codeburactivite,
            String codeprofil) throws RcEjbException {
        int i = 0;
        try {
            i = findVerifBurActiviteQuery(codeburactivite, codeprofil,codeagent).size();
            return i;
        } catch (RcEjbException e) {
            throw e;
        } catch (EJBException e) {
            throw new RcEjbException(ConstErrCod.ejbExp);
        } catch (Exception e) {
            throw new RcEjbException(ConstErrCod.InspecifiedError);
        }
    }
	
}
