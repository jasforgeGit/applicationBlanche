package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodDECL;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.ImportExport;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;
import sn.com.douane.utils.ConstManif;


@Stateless(name="IPpmDao")
public class PpmDaoImpl extends GenericDaoImpl<Ppm> implements IPpmDao {
	
	private transient final Log log = LogFactory.getLog(getClass());	

	@Override
	public void insert(Ppm objVo) throws RcEjbException {
		try {
			ctrlInsertUpdate(objVo);
			create(objVo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
		
	}

	@Override
	public void ctrlInsertUpdate(Ppm vo) throws RcEjbException {
		if (vo.getRccodeppm() == null || vo.getRccodeppm().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODEPPM_OB);}
		
	}

	@Override
	public void update(Ppm objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 	
	}

	@Override
	public void delete(String key) throws RcEjbException {
		try {
			remove(key);
		}  catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
		
	}

	// +++++++++++++++ tester le changement en retournant directement ppm.getAgrees
	@Override
	public List<Agree> rechercherDetailPpmAgree(String ppmkey) throws RcEjbException {
	//	PpmLocal ppmlocal = null;
	//	PpmLocalHome home = (PpmLocalHome) EntitiesRcSB
	//			._getclassHome(PpmLocalHome.class);
		try {
			Ppm ppmlocal = findByPrimaryKey(ppmkey);
			//Collection collection = new ArrayList();
			List<Agree> vector = new ArrayList<Agree>();
			List<Agree> collection = ppmlocal.getAgrees();
			Iterator<Agree> it = collection.iterator();
			//Agree agreevo = new Agree();
			while (it.hasNext()) {
				Agree rmt = (Agree) it.next();
				//agreevo = rmt.getAgreeVO();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public List<RegimeDeclarant> rechercherDetailPpmRegimedeclarant(String ppmkey)
			throws RcEjbException {
		//Ppm ppmlocal = null;
		//PpmLocalHome home = (PpmLocalHome) EntitiesRcSB
		//		._getclassHome(PpmLocalHome.class);
		try {
			Ppm ppmlocal = findByPrimaryKey(ppmkey);
			//Collection collection = new ArrayList();
			List<RegimeDeclarant> vector = new ArrayList<RegimeDeclarant>();
			List<RegimeDeclarant> collection = ppmlocal.getRegimeDeclarants();
			Iterator<RegimeDeclarant> it = collection.iterator();
			//RegimedeclarantVO regimedeclarantvo = new RegimedeclarantVO();
			while (it.hasNext()) {
				RegimeDeclarant rmt = (RegimeDeclarant) it.next();
				//regimedeclarantvo = rmt.getRegimedeclarantVO();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public List<RegimeDestinataire> rechercherDetailPpmRegimedestinataire(String ppmkey)
			throws RcEjbException {
		try {
			Ppm ppmlocal = findByPrimaryKey(ppmkey);
		//	Collection collection = new ArrayList();
			List<RegimeDestinataire> vector = new ArrayList<RegimeDestinataire>();
			List<RegimeDestinataire> collection = ppmlocal.getRegimeDestinataires();
			Iterator<RegimeDestinataire> it = collection.iterator();
			//RegimedestinataireVO regimedestinatairevo = new RegimedestinataireVO();
			while (it.hasNext()) {
				RegimeDestinataire rmt = (RegimeDestinataire) it
						.next();
				//regimedestinatairevo = rmt.getRegimedestinataireVO();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}


	/**
	 * @param codppm
	 * @return
	 */
	public String getPkPpm(String codppm) {
		return "and rccodeppm='" + codppm + "'";
	}

	/**
	 * @param trcodecreditaire
	 * @return
	 */
	public static String getCodecreditaire(String trcodecreditaire) {
		return "and rccodecreditaire='" + trcodecreditaire + "'";
	}
	


	@Override
	public String getAdresse(String key) throws RcEjbException {
		Ppm ppmVO;
		String temp = "";
		try {
			ppmVO = findByPrimaryKey(key);
			temp = ppmVO.getRcnomvoieetablsec() + ConstManif.SPACE
					+ ppmVO.getRctypevoieppm() + ConstManif.SPACE
					+ ppmVO.getRcnumvoieetablsec() + ConstManif.SPACE
					+ ppmVO.getRcquartierppm() + ConstManif.SPACE
					+ ppmVO.getRcvilleppm();
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.PPMKEY);
		}
		return temp;
	}
	
	
	/**
	 * cette methode permet de rechercher
	 * le circuit visite dans la table PPM par son code	 
	 */
	public String findCvByPpm(String codePpm) {		
		
		String circuitVisite = null;	
		try {
			Ppm ppm = findByPrimaryKey(codePpm);
			if(ppm == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}else {
				circuitVisite = ppm.getRccircuitvisite();
			}
		} catch (FinderException e) {
			log.error(e.getMessage(),e);
		}
		
		return circuitVisite;
	}

	/**
	 * permet de verifier l'existance de l'element passé en paramètre
	 * 
	 * @param key
	 * @return
	 * @throws TwreException
	 */
	public void checkExistance(String codePpm) throws TwreException {
		Ppm ppm = null;
		try {
			ppm = findByPrimaryKey(codePpm);
			if(ppm == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}
		} catch (FinderException e) {
			throw new TwreException(ConstErrCod.foreignKeyPpm);
		} 
	}
public int consVerifierExistencePpm (Consignataire objvo) {
		
		int result = 0;
		Consignataire consignatairesvo = objvo;
		List<Ppm> list = null;
		try {
			list = (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+consignatairesvo.getRcCodePpm()+"'");
            for(Ppm p : list){
	           if (p.getRccodeppm()!=null && !p.getRccodeppm().equals("")){	
		    result =1;
	}
}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	public int consVerifierExistenceNinea (Consignataire objvo){
		int result = 0;
		Consignataire consignatairesvo = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+consignatairesvo.getRcCodePpm()+"'");
	        for(Ppm p:list){
		       if ((p.getRcninea()!=null && !p.getRcninea().equals(""))){
			result =1;
		}
	}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	public int verifierExistenceNinea(Creditaire objvo){
		int result = 0;
		Creditaire creditaire = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+creditaire.getRcCodePpm()+"'");
	        for(Ppm p:list){
		        if ((p.getRcninea()!=null && !p.getRcninea().equals(""))){
			result =1;
		}
	}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}	
	public int verifierExistanceCreditaire (Creditaire objvo) {
		int result =0;
		Creditaire creditaire = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+creditaire.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRccodecreditaire()!=null && !p.getRccodecreditaire().equals(""))){
					result =1;
				}
			}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
		}
	
	public int agreeVerifierExistencePpm (Agree objvo) {
		int result = 0;
		Agree agreevo = objvo;
		List<Ppm> list = null;
		try {
			list = (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+agreevo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRccodeppm()!=null && !p.getRccodeppm().equals(""))){
					result =1;
				}
	        }}
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	public int agreeVerifierExistenceNinea (Agree objvo) {
		int result = 0;
		Agree agreevo = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+agreevo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRcninea()!=null && !p.getRcninea().equals(""))){
					result =1;
				}
	            }
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	public int ambVerifierExistencePpm (AmbassadeOrganisme objvo) {
		int result = 0;
		AmbassadeOrganisme ambassadeorganismevo = objvo;
		List<Ppm> list = null;
		try {
			list = (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+ambassadeorganismevo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRccodeppm()!=null && !p.getRccodeppm().equals(""))){
					result =1;
				}
	        }
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	public int ambVerifierExistenceNinea (AmbassadeOrganisme objvo)  {
		int result = 0;
		AmbassadeOrganisme ambassadeorganismevo = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+ambassadeorganismevo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRcninea()!=null && !p.getRcninea().equals(""))){
					result =1;
				}
	            }
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}	
	public int impVerifierExistencePpm (ImportExport objvo){
		int result = 0;
		ImportExport importexportvo = objvo;
		List<Ppm> list = null;
		try {
			list = (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+importexportvo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRccodeppm()!=null && !p.getRccodeppm().equals(""))){
					result =1;
				}
	        }
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}
	
	public int impVerifierExistenceNinea (ImportExport objvo) {
		int result = 0;
		ImportExport importexportvo = objvo;
		List<Ppm> list = null;
		try {
			list =  (List<Ppm>) rechercherByWhere("from Ppm where rccodeppm = '"+importexportvo.getRcCodePpm()+"'");
			for(Ppm p:list){
				if ((p.getRcninea()!=null && !p.getRcninea().equals(""))){
					result =1;
				}
	            }
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage());
	        }
	        return result;
	}	
	public Ppm exist(String key) throws TwreException {
		Ppm ppm = null;
		try {
			ppm = findByPrimaryKey(key);
		} catch (FinderException e) {
			throw new TwreException(ConstErrCod.foreignKeyPpm);
		}
    return ppm;
	}
	
	public String rechercheNomPPm(String codeppm) throws TwreException {
        String nomdecppm=null;
    	Ppm ppm = null;
	try {
		ppm = findByPrimaryKey(codeppm);
           if (ppm != null) {
        	     if(ppm.getRcprenomppm()!=null)
        	     {
                     nomdecppm= ppm.getRcprenomppm();
        	     }
        	     else 
        	    	 nomdecppm=ppm.getRcnomppm();
           }
           
           
	} catch (FinderException e) {
		throw new TwreException(ConstErrCod.foreignKeyPpm);
	}
	return nomdecppm;
}
}
