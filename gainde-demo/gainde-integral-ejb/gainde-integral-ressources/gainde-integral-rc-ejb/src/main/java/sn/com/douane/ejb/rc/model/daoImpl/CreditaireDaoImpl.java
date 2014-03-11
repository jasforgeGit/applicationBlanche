package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICreditaireDao;
import sn.com.douane.ejb.rc.model.dao.ITypeCreditDao;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;
import sn.com.douane.ejb.rc.model.entities.TypeCredit;
import sn.com.douane.utils.ConstManif;

@Stateless(name="ICreditaireDao")
public class CreditaireDaoImpl extends GenericDaoImpl<Creditaire> implements ICreditaireDao {

	private static final Logger log = Logger.getLogger(CreditaireDaoImpl.class); 
	@EJB
	private ITypeCreditDao typeCreditDao; 
	
	
	@Override
	public String getWherePpmCreditaire(String rccodeppm) {
		return "  rcCodePpm ='" + rccodeppm + "'";
	}

	@Override
	public void insert(Creditaire objVo) throws RcEjbException {
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
	public void update(Creditaire objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo); 
		merge(objVo); 
		
	}

	@Override
	public void ctrlInsertUpdate(Creditaire vo) throws RcEjbException {
		//System.out.println("vo.getRctypecreditaire() : "+vo.getRctypecreditaire());
		if (vo.getRcCodeCreditaire() == null
				|| vo.getRcCodeCreditaire().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODECREDITAIRE_OB);}
		try {
			if (vo.getRcTypeCreditaire() != null
					&& !vo.getRcTypeCreditaire().trim().equals("")) {				
				TypeCredit typecreditLocal = (TypeCredit) typeCreditDao
						.findByPrimaryKey(vo.getRcTypeCreditaire());
				if (typecreditLocal == null) {
					throw new RcEjbException(ConstErrCodRC.TYPECREDITKEY);
				}
				vo.setTypeCreditaire(typecreditLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.TYPECREDITKEY);
		}
		
	}

	@Override
	public void delete(String key) throws RcEjbException {
		try {
			remove(key);
		} catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
		
	}

	@Override
	public List<SoumissionCreditaire> rechercherDetailCreditairesSoumissioncreditaire(
			String key) throws RcEjbException {
		try {
			Creditaire creditaireslocal = findByPrimaryKey(key);
			List<SoumissionCreditaire> vector = new ArrayList<SoumissionCreditaire>();
			List<SoumissionCreditaire> collection = creditaireslocal.getSoumissioncreditaire();
			Iterator<SoumissionCreditaire> it = collection.iterator();
			while (it.hasNext()) {
				SoumissionCreditaire rmt = (SoumissionCreditaire) it
						.next();
				vector.add(rmt);
			}
			return vector;
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.DETAILNOTFOUND);
		}
	}

	@Override
	public String getWherePkCreditaire(String codecreditaire) {
		return " and rcCodeCreditaire='" + codecreditaire + "'";
	}
	
	public List<Creditaire> getCreditairesByCodePpm(String codePPM){
		Query query =  createQuery("from Creditaire where rcCodePpm = ?1 ");
		query.setParameter(1, codePPM);
		return query.getResultList();
	}
	
	public int consVerifierExistanceCreditaire (Consignataire objvo) {
		int result =0;
		Consignataire consignatairesvo = objvo;		
		List<Creditaire> list =  getCreditairesByCodePpm(consignatairesvo.getRcCodePpm());
		
		try {
			for(Creditaire c:list){
				if ((c.getRcCodeCreditaire()!=null && !c.getRcCodeCreditaire().equals(""))){
					result =1;
				}
			}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage()); 
	        } 
	        return result;
	}	
	
	public int agreeVerifierExistanceCreditaire (Agree objvo) {
		int result =0;
		Agree agreevo = objvo;
	
		List<Creditaire> list =  getCreditairesByCodePpm(agreevo.getRcCodePpm());
		
		try {
			for(Creditaire c:list){
				if ((c.getRcCodeCreditaire()!=null && !c.getRcCodeCreditaire().equals(""))){
					result =1;
				}
			}
	        }
	        catch(Exception e1){
	        	log.error(e1.getMessage()); 
	        }
	        return result;
	}
	
	public List<CreditaireDto> rechercheByWhereCreditaire(String where) throws RcEjbException{
		List<CreditaireDto> result = new ArrayList<CreditaireDto>(); 	
		try {
			List<Creditaire> listeCreditaire = (List<Creditaire>) rechercherByWhere(where);
			for (int i=0; i<listeCreditaire.size(); i++) {
				CreditaireDto creditaireDto = getCreditaireDto(listeCreditaire.get(i));
				result.add(creditaireDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public CreditaireDto getCreditaireDto(Creditaire creditaire) {
		CreditaireDto creditaireDto = new CreditaireDto();
		if (creditaire!=null){
			creditaireDto.setRcBonAvoir(creditaire.getRcBonAvoir());
			creditaireDto.setRcCodeCreditaire(creditaire.getRcCodeCreditaire());
			creditaireDto.setRcCodePpm(creditaire.getRcCodePpm());		
			creditaireDto.setRcCodeSuspension(creditaire.getRcCodeSuspension());
			creditaireDto.setRcDateCredit(creditaire.getRcDateCredit());
			creditaireDto.setRcDateDecision(creditaire.getRcDateDecision());
			creditaireDto.setRcDateExtension(creditaire.getRcDateExtension());
			creditaireDto.setRcDateRetrait(creditaire.getRcDateRetrait());		
			creditaireDto.setRcDateSuspension(creditaire.getRcDateSuspension());
			creditaireDto.setRcEtatCredit(creditaire.getRcEtatCredit());
			creditaireDto.setRcMontantAvoir(creditaire.getRcMontantAvoir());
			creditaireDto.setRcMontantMini(creditaire.getRcMontantMini());
			creditaireDto.setRcMontantResiduel(creditaire.getRcMontantResiduel());
			creditaireDto.setRcNumDecision(creditaire.getRcNumDecision());
			creditaireDto.setRcNumeroDossier(creditaire.getRcNumeroDossier());
			creditaireDto.setRcNumeroRetrait(creditaire.getRcNumeroRetrait());
			creditaireDto.setRcNumSuspension(creditaire.getRcNumSuspension());
			creditaireDto.setRcTypeCreditaire(creditaire.getRcTypeCreditaire());
			creditaireDto.setRcTypeDecision(creditaire.getRcTypeDecision());	
			creditaireDto.setDelCell(creditaireDto.getPk());
			creditaireDto.setEditCell(creditaireDto.getPk()); 
			}
		return creditaireDto;
	}
}
