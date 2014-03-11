package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.Query;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.dao.IProfilDao;
import sn.com.douane.ejb.rc.model.dao.ITypeUtilisateurDao;
import sn.com.douane.ejb.rc.model.dao.IUtilisateurDao;
import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.TypeUtilisateur;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;


@Stateless(name="IUtilisateurDao")
public class UtilisateurDaoImpl extends GenericDaoImpl<Utilisateur> implements IUtilisateurDao {
	
	@EJB
	private IProfilDao profilDao; 
	
	@EJB
	private ITypeUtilisateurDao typeUtilisateurDao; 
	
	@EJB
	private IPpmDao ppmDao; 
	
	 /**
	  * Controler l'insertion et la modification de l'entite Utilisateur
	  * 
	  * @param Utilisateur
	  */
	public void ctrlInsertUpdate(Utilisateur userVo) throws RcEjbException {
		 if (userVo.getRcCodUser() == null || userVo.getRcCodUser().trim().equals("")){
	            throw new RcEjbException(ConstErrCodRC.CODUSER_OB);}
	        if (userVo.getRcIdentification() == null
	                || userVo.getRcIdentification().trim().equals("")){
	            throw new RcEjbException(ConstErrCodRC.LOGIN_OB);}
	        if (userVo.getRcCodeProfil() == null
	                || userVo.getRcCodeProfil().trim().equals("")){
	            throw new RcEjbException(ConstErrCodRC.PROFIL_OB);}
	        if (userVo.getRcMotPasse() == null || userVo.getRcMotPasse().trim().equals("")){
	            throw new RcEjbException(ConstErrCodRC.MOTPASSE_OB);}
	        if (userVo.getRcTypeUser() == null || userVo.getRcTypeUser().trim().equals("")){
	            throw new RcEjbException(ConstErrCodRC.TYPEUSER_OB);}

		 try {
	            if (userVo.getRcCodeProfil() != null
	                    && !userVo.getRcCodeProfil().trim().equals("")) {	               
	                Profil profilLocal = (Profil) profilDao
	                		.findByPrimaryKey(userVo.getRcCodeProfil());
	                userVo.setProfilUser(profilLocal);
	            }
	        } catch(FinderException e1 ) {
	            throw new RcEjbException(ConstErrCodRC.PROFILKEY);
	        }

	        try {
	            if (userVo.getRcTypeUser() != null
	                    && !userVo.getRcTypeUser().trim().equals("")) {	                
	                TypeUtilisateur typeuserlocal = (TypeUtilisateur) typeUtilisateurDao
	                		.findByPrimaryKey(userVo.getRcTypeUser());
	                // ajouter le test de typeuserLocal s'il est null ---> type user n'existe pas dans la base
	                userVo.setTypeUser(typeuserlocal);
	            }
	        } catch (FinderException e) {
	            throw new RcEjbException(ConstErrCodRC.TYPEUTILISATEURKEY);
	        }
	}
	
	/**
     * Chercher un utilisateur donnée selon son login et mot de passe
     * 
     * @param where
     * @return
     * @throws sn.com.douane.ejb.rc.exception.RcEjbException
     */
    public Utilisateur getUtilisateurByLoginPwd(String login,
            String pwd) throws RcEjbException {
    	Utilisateur user; 
        try {
			Query query = entityManager.createQuery("SELECT object(user) FROM Utilisateur user "
			              + "WHERE user.rcCodUser = '"+ login+ "' AND user.rcMotPasse = '"+pwd+"'");
			 user = (Utilisateur) query.getSingleResult(); 
            if (user==null){
            	throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
            }
        } catch (NonUniqueResultException e1) {
            throw new RcEjbException(ConstErrCod.NONUNIQUERESULTEXCEPTION);
        } catch(NoResultException e){
        	throw new RcEjbException(ConstErrCod.NORESULTEXCEPTION);
        }
        return user; 
    }

    /**
     * Ajouter un nouvel utilisateur
     */
	@Override
	public void insert(Utilisateur user) throws RcEjbException {		
		try {
            ctrlInsertUpdate(user);
            create(user);
        } catch (DuplicateKeyException e1) {
            throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
        } catch (CreateException e1) {
            throw new RcEjbException(ConstErrCodRC.INSERTEXP);
        }		
	}
	
	@Override
	public void update (Utilisateur objvo) throws RcEjbException  {
		
	    ctrlInsertUpdate(objvo);
	    merge(objvo); 
	        
	}
	
	
	@Override
	public void delete(String objkey) throws RcEjbException {
        try {
            remove(objkey);
        }  catch (EJBException e) {
            throw new RcEjbException(ConstErrCodRC.EJBEXP);
        } catch (RemoveException e) {
            throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
        } catch (FinderException e) {
        	throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
    }
	
	public List<UtilisateurDto> rechercheByWhereUtilisateur(String where) throws RcEjbException{
		List<UtilisateurDto> result = new ArrayList<UtilisateurDto>(); 	
		try {
			List<Utilisateur> listeUtilisateur = (List<Utilisateur>) rechercherByWhere(where);
			for (int i=0; i<listeUtilisateur.size(); i++) {
				UtilisateurDto utilisateurDto = getUtilisateurDto(listeUtilisateur.get(i));
				result.add(utilisateurDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public UtilisateurDto getUtilisateurDto(Utilisateur utilisateur) {
		UtilisateurDto utilisateurDto = new UtilisateurDto();
		if (utilisateur!=null){
			utilisateurDto.setCodeagree(utilisateur.getCodeagree());
			utilisateurDto.setCodecreditaire(utilisateur.getCodecreditaire());
			utilisateurDto.setCodeppm(utilisateur.getCodeppm());
			utilisateurDto.setModule1(utilisateur.getModule1());
			utilisateurDto.setNomxml(utilisateur.getNomXml());
			utilisateurDto.setRccodeprofil(utilisateur.getRcCodeProfil());
			utilisateurDto.setRccoduser(utilisateur.getRcCodUser());
			utilisateurDto.setRcemail(utilisateur.getRcEmail());
			utilisateurDto.setRcetatactif(utilisateur.getRcEtatActif());
			utilisateurDto.setRcidentification(utilisateur.getRcIdentification());
			utilisateurDto.setRcindconnect(utilisateur.getRcIndconnect());
			utilisateurDto.setRcindenr(utilisateur.getRcIndEnr());
			utilisateurDto.setRcindprereg(utilisateur.getRcIndprereg());
			utilisateurDto.setRcisadmin(utilisateur.getRcIsAdmin());
			utilisateurDto.setRcmotpasse(utilisateur.getRcMotPasse());
			utilisateurDto.setRctypeuser(utilisateur.getRcTypeUser());
			utilisateurDto.setXml(utilisateur.getXml());
			utilisateurDto.setDelCell(utilisateurDto.getPk());
			utilisateurDto.setEditCell(utilisateurDto.getPk()); 
			}
		return utilisateurDto;
	}


	public Utilisateur rechercheUtilisateur(String codeUser) throws RcEjbException {
		
		Utilisateur utilisateurVO = null;		
		Ppm ppmVO;		
		try {
			utilisateurVO = findByPrimaryKey(codeUser);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}			
		try {
			ppmVO = ppmDao.findByPrimaryKey("00000");
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		utilisateurVO.setCodeagree(ppmVO.getRccodeagree());
		utilisateurVO.setCodecreditaire(ppmVO.getRccodecreditaire());		
	return utilisateurVO;
}
}
