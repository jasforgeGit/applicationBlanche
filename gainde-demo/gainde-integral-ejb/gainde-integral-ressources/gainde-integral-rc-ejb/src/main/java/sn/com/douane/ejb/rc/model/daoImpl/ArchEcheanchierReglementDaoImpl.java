package sn.com.douane.ejb.rc.model.daoImpl;

import java.math.BigDecimal;
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
import sn.com.douane.ejb.rc.model.dao.IArchEcheanchierReglementDao;
import sn.com.douane.ejb.rc.model.dao.IEtatDossierDao;
import sn.com.douane.ejb.rc.model.entities.ArchEcheancierReglement;
import sn.com.douane.ejb.rc.model.entities.EcheancierReglement;
import sn.com.douane.ejb.rc.model.entities.EtatDossier;
import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;

@Stateless(name="IArchEcheanchierReglementDao")
public class ArchEcheanchierReglementDaoImpl extends GenericDaoImpl<ArchEcheancierReglement> implements IArchEcheanchierReglementDao {

	
	@EJB
	private IEtatDossierDao etatDossierDao; 
	
	public void insertWithoutCtrl(ArchEcheancierReglement vo) throws RcEjbException {
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
	
	
	
	public void insert(ArchEcheancierReglement vo) throws RcEjbException {
		
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

	private void ctrlInsertUpdate(ArchEcheancierReglement vo)
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

	public void update(ArchEcheancierReglement vo) throws RcEjbException {
		
		if(vo.getTrTvaCredit() == null){
			vo.setTrTvaCredit(BigDecimal.ZERO);
		}
		ctrlInsertUpdate(vo);
		merge(vo);
	}

	
	public BigDecimal getMontantCredit(String where){
		
		BigDecimal montant = BigDecimal.ZERO;
		
		String sql="select sum(trMontantCredit) as montant from EcheancierReglement where 1=1 ";
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
	
	
	
	
	
		
	
	
	
	

	

}
