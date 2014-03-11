package sn.com.douane.ejb.rc.model.daoImpl;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IEcheanchierReglementDao;
import sn.com.douane.ejb.rc.model.dao.IEtatDossierDao;
import sn.com.douane.ejb.rc.model.dto.EcheancierReglementDto;
import sn.com.douane.ejb.rc.model.entities.EcheancierReglement;
import sn.com.douane.ejb.rc.model.entities.EtatDossier;
import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;
import sn.com.douane.utils.DateUtil;
import sn.com.douane.utils.sysEnv;

@Stateless(name="IEcheanchierReglementDao")
public class EcheanchierReglementDaoImpl extends GenericDaoImpl<EcheancierReglement> implements IEcheanchierReglementDao {

	
	@EJB
	private IEtatDossierDao etatDossierDao; 
	
	public void insertWithoutCtrl(EcheancierReglement vo) throws RcEjbException {
		try {
			if(vo.getTrTvaCredit()==null){
				vo.setTrTvaCredit(BigDecimal.ZERO);
			}
			create(vo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCod.dupkeyinsert);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCod.insertExp);
		}
	}
	
	public List<EcheancierReglement> rechercherBySegGenDec(String decanneeenregdec
			  , String decburenregdec , Integer decnumdec) throws RcEjbException {
		String where = " from EcheancierReglement where"
		+" trAnneeDecl = '" + decanneeenregdec
		+ "' and trBurDeclaration = '" + decburenregdec
		+ "' and trNumDeclaration = " + decnumdec.intValue() ;
		return (List<EcheancierReglement>) rechercherByWhere(where);
}
	
	public void insert(EcheancierReglement vo) throws RcEjbException {
		
		try {
			ctrlInsertUpdate(vo);
			if(vo.getTrTvaCredit() == null){
				vo.setTrTvaCredit(BigDecimal.ZERO);
			}
			create(vo);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCod.dupkeyinsert);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCod.insertExp);
		}
	}
	
	
	public void delete(EcheancierReglementKey objkey) throws RcEjbException {
		
		try {
			remove(objkey);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCod.rowNotFound);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCod.removeExp);
		}
	}

	private void ctrlInsertUpdate(EcheancierReglement vo)
			throws RcEjbException {
		if (vo.getTrAnneeDecl() == null
				|| vo.getTrAnneeDecl().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.TRANNEEDECL_OB);
		}
		if (vo.getTrBurDeclaration() == null
				|| vo.getTrBurDeclaration().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.TRBURDECLARATION_OB);
		}
		if (vo.getTrCodeCreditaire() == null
				|| vo.getTrCodeCreditaire().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.TRCODECREDITAIRE_OB);
		}
		if (vo.getTrDateBae() == null){
			throw new RcEjbException(ConstErrCodRC.TRDATEBAE_OB);
		}
		if (vo.getTrEtat() == null || vo.getTrEtat().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.TRETAT_OB);
		}
		if (vo.getTrMontantComptant() == null){
			throw new RcEjbException(ConstErrCodRC.TRMONTANTCOMPTANT_OB);
		}
		if (vo.getTrMontantCredit() == null){
			throw new RcEjbException(ConstErrCodRC.TRMONTANTCREDIT_OB);
		}
		if (vo.getTrNumDeclaration() == null){
			throw new RcEjbException(ConstErrCodRC.TRNUMDECLARATION_OB);
		}
		try {
			if (vo.getTrEtat() != null && !vo.getTrEtat().trim().equals("")) {
				
				EtatDossier etatdossierLocal = etatDossierDao.findByPrimaryKey(vo.getTrEtat());
				if(etatdossierLocal == null){
					throw new FinderException(ConstErrCodRC.ROWNOTFOUND);
				}
				
			}
		} catch (FinderException e2) {			
			throw new RcEjbException(ConstErrCodRC.etatdossierKey);
		}
	}

	public void update(EcheancierReglement vo) throws RcEjbException {
		
		if(vo.getTrTvaCredit() == null){
			vo.setTrTvaCredit(BigDecimal.ZERO);
		}
		ctrlInsertUpdate(vo);
		merge(vo);
	}

	
	public BigDecimal getMontantCredit(String where){
		
		BigDecimal montant = BigDecimal.ZERO;
		
		String sql="select sum(trMontantCredit) as montant from EcheancierReglement where 1=1 "+" ";
		if(where!=null && !where.equals("")){
			sql=sql+where;
		}
			List<BigDecimal> rs = (List<BigDecimal>) rechercherByWhere(sql);
			Iterator<BigDecimal> iterator = rs.iterator();
			while (iterator.hasNext()) {
				montant = iterator.next();
			}
		
		return montant;

	}

	public List<EcheancierReglement> listEcheanciers(String codeCreditaire){
		List<EcheancierReglement> listEcheancier = new ArrayList<EcheancierReglement>();
		BigDecimal montant=null;
		Date[] tab = new Date[16];
		tab[0]=sysEnv.ToDay();
		for(int i = 1; i < 16; i++){
			tab[i]=sysEnv.addJour(tab[i-1], 1);
		}
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
		for(int j=0; j < tab.length; j++){
			EcheancierReglement echeancierReglement=new EcheancierReglement();
		String where = "" 
	    +" and trCodeCreditaire = '" + codeCreditaire
	    + "' and trDateBae = '" + sysEnv.addJour(tab[j], -15)+"'";
		montant=getMontantCredit(where);
		String dateReglement=sdf.format(tab[j]);
		echeancierReglement.setTrDateReglementPrevu(dateReglement);
		echeancierReglement.setTrMontantReglement(montant);
		listEcheancier.add(echeancierReglement);
		}

		return listEcheancier;

	}
	
	
	@SuppressWarnings("unchecked")
	public List<EcheancierReglement> findByCodeCreditaire(String codcrd){
		
		String where = " from EcheancierReglement where trCodeCreditaire = '" + codcrd +"'";
		return (List<EcheancierReglement>) rechercherByWhere(where);
		
	}
	
	public List<EcheancierReglement> rechercherByDossier1(Integer numdossierProv) throws RcEjbException{
		try {
				return findByNumDoss(numdossierProv);

			
		} catch (Exception e) {
			if(e.getMessage()!=null && e.getMessage().indexOf("CORBA NO_MEMORY")!=-1){
				throw new RcEjbException(ConstErrCod.outOfMemory);
			}
			throw new RcEjbException(ConstErrCodRC.DetailNotFound);
		}
	}

	/**
	 * Find by numero dossier prov.
	 *
	 * @param numdossierProv the numdossierprov
	 * @return the list
	 */
	@SuppressWarnings("unchecked")
	private List<EcheancierReglement> findByNumDoss(Integer numdossierProv) {
		Query query1 = entityManager
				.createNamedQuery("EcheancierReglement.findByNumDoss");
		query1.setParameter(1, numdossierProv);
		return (List<EcheancierReglement>) query1.getResultList();

	}
	
	
	public EcheancierReglementDto getEcheancierReglementDto(EcheancierReglement vo){
		
		EcheancierReglementDto dto = new EcheancierReglementDto();	
		if(vo != null){
		dto.setTranneedecl(vo.getTrAnneeDecl());
		dto.setTrburdeclaration(vo.getTrBurDeclaration());
		dto.setTrcodecreditaire(vo.getTrCodeCreditaire());
		dto.setTrdatebae(vo.getTrDateBae());
		dto.setTrdateReglementPrevu(vo.getTrDateReglementPrevu());
		dto.setTretat(vo.getTrEtat());
		dto.setTrjournaltresor(vo.getTrJournalTresor());
		dto.setListeModeReglement(vo.getListeModeReglement());
		dto.setListetaxes(vo.getListeTaxes());
		dto.setTrdatereglement(vo.getTrDateReglement());
		dto.setTrmontantcomptant(vo.getTrMontantComptant());
		dto.setTrmontantcredit(vo.getTrMontantCredit());
		dto.setTrMontantReglement(vo.getTrMontantReglement());
		dto.setTrnumdeclaration(vo.getTrNumDeclaration());
		dto.setTrnumdossierprov(vo.getTrNumDossierProv());
		dto.setTrtvacredit(vo.getTrTvaCredit());
		}
		return dto;
		
	}
	
	public List<EcheancierReglementDto> getEcheancierReglementDto(List<EcheancierReglement> 
					listEcheancier){
		
		List<EcheancierReglementDto> listEcheancierDto = new ArrayList<EcheancierReglementDto>();
		
		if(listEcheancier != null){
			
			for (EcheancierReglement vo : listEcheancier) {
				listEcheancierDto.add(getEcheancierReglementDto(vo));
			}
		}
		
		return listEcheancierDto;
		
		
		
	}
		
	
	public void recupererDeclPcs(int numDossProv) throws RcEjbException{
	    try 
	      { 
  	  		String sql = "SELECT trAnneeDecl, trBurDeclaration, trNumDeclaration FROM EcheancierReglement E WHERE " +
  	  			" E.trNumDossierProv='"+numDossProv+"'";
  	  		List<Object[]> rs = (List<Object[]>) rechercherByWhere(sql); 
  	  		String anDcl = "";
  	  		String burDcl = "";
  	  		Integer numDcl ;

  	  		for(Object[] array : rs)
  	  			{
  	  			anDcl  = (String) array[0];
  	  			burDcl = (String) array[1];
  	  			numDcl = (Integer) array[2];
  	  			updateDeclPcs(anDcl, burDcl, numDcl, numDossProv);
  	  			}
    		}  catch (Exception e) {
	            	throw new RcEjbException(" "+e.getMessage());
	        }
	}
	
	public void updateDeclPcs(String anDcl, String burDcl, int numDcl,
			int numDossProv) throws RcEjbException {

		String sql = "UPDATE Declaration SET noDos =" + numDossProv
				+ " WHERE  anDcl='" + anDcl + "' AND burDcl='" + burDcl
				+ "' AND numDcl=" + numDcl;
		Query query = entityManager.createQuery(sql);
		query.executeUpdate();

	}

	@Override
	public EcheancierReglement getEcheancierReglementFromDto(
			EcheancierReglementDto dto) {
		EcheancierReglement echeancierReglement = new EcheancierReglement();	
		if(dto != null){
		echeancierReglement.setTrAnneeDecl(dto.getTranneedecl());
		echeancierReglement.setTrBurDeclaration(dto.getTrburdeclaration());
		echeancierReglement.setTrCodeCreditaire(dto.getTrcodecreditaire());
		echeancierReglement.setTrDateBae(dto.getTrdatebae());
		echeancierReglement.setTrDateReglementPrevu(dto.getTrdateReglementPrevu());
		echeancierReglement.setTrEtat(dto.getTretat());
		echeancierReglement.setTrJournalTresor(dto.getTrjournaltresor());
		echeancierReglement.setListeModeReglement(dto.getListeModeReglement());
		echeancierReglement.setListeTaxes(dto.getListetaxes());
		
		if((dto.getTrdatereglement() == null) || (sysEnv.dateToStr(dto.getTrdatereglement()).compareTo("") == 0)){
			echeancierReglement.setTrDateReglement(sysEnv.utilDateToSqlDate(DateUtil.convertStringToDate("01/01/1901")));
	    }else{
	    	echeancierReglement.setTrDateReglement(dto.getTrdatereglement());
	    }		
		echeancierReglement.setTrMontantComptant(dto.getTrmontantcomptant());
		echeancierReglement.setTrMontantCredit(dto.getTrmontantcredit());
		echeancierReglement.setTrMontantReglement(dto.getTrMontantReglement());
		echeancierReglement.setTrNumDeclaration(dto.getTrnumdeclaration());
		echeancierReglement.setTrNumDossierProv(dto.getTrnumdossierprov());
		echeancierReglement.setTrTvaCredit(dto.getTrtvacredit());
		}
		return echeancierReglement;
	}
	
	public EcheancierReglement copyTo(EcheancierReglement vo) {
		
		EcheancierReglement newEchancier = new EcheancierReglement();
		
		if(vo != null){			
		
		newEchancier.setTrNumDeclaration(vo.getTrNumDeclaration());
		newEchancier.setTrTvaCredit(vo.getTrTvaCredit());		
		newEchancier.setTrBurDeclaration(vo.getTrBurDeclaration());
		newEchancier.setTrNumDossierProv(vo.getTrNumDossierProv());
		newEchancier.setTrMontantCredit(vo.getTrMontantCredit());
		newEchancier.setTrDateBae(vo.getTrDateBae());
		newEchancier.setTrCodeCreditaire(vo.getTrCodeCreditaire());
		newEchancier.setTrMontantComptant(vo.getTrMontantComptant());
		newEchancier.setTrDateReglement(vo.getTrDateReglement());
		newEchancier.setTrAnneeDecl(vo.getTrAnneeDecl());
		}
		
		return newEchancier;
		
	}

}
