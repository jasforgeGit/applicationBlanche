package sn.com.douane.ejb.rc.services;


import javax.ejb.CreateException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAgentDouaneDao;
import sn.com.douane.ejb.rc.model.dao.IAgreeDao;
import sn.com.douane.ejb.rc.model.dao.IAgrementEntrepriseDao;
import sn.com.douane.ejb.rc.model.dao.IAgrementRgrpProdDao;
import sn.com.douane.ejb.rc.model.dao.IAmbassadeOrganismeDao;
import sn.com.douane.ejb.rc.model.dao.IAutoCreditaireDao;
import sn.com.douane.ejb.rc.model.dao.IBasesTaxableDao;
import sn.com.douane.ejb.rc.model.dao.IBurModDeclDao;
import sn.com.douane.ejb.rc.model.dao.IBureauDouaneDao;
import sn.com.douane.ejb.rc.model.dao.IBureauDouaneTypeManDao;
import sn.com.douane.ejb.rc.model.dao.IBureauUemoaDao;
import sn.com.douane.ejb.rc.model.dao.ICatreGroupDao;
import sn.com.douane.ejb.rc.model.dao.IChapitreSectionDao;
import sn.com.douane.ejb.rc.model.dao.ICircuitVisiteDao;
import sn.com.douane.ejb.rc.model.dao.IClasseDao;
import sn.com.douane.ejb.rc.model.dao.ICompBureauDao;
import sn.com.douane.ejb.rc.model.dao.ICompagnieAssisteeDao;
import sn.com.douane.ejb.rc.model.dao.IConsignataireDao;
import sn.com.douane.ejb.rc.model.dao.ICreditaireDao;
import sn.com.douane.ejb.rc.model.dao.ICtrlUserDao;
import sn.com.douane.ejb.rc.model.dao.IDelegationDao;
import sn.com.douane.ejb.rc.model.dao.IDevisesDao;
import sn.com.douane.ejb.rc.model.dao.IDispenseDao;
import sn.com.douane.ejb.rc.model.dao.IDispensePieceJointeDao;
import sn.com.douane.ejb.rc.model.dao.IEcheanchierReglementDao;
import sn.com.douane.ejb.rc.model.dao.IEtatDossierDao;
import sn.com.douane.ejb.rc.model.dao.IF9;
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;
import sn.com.douane.ejb.rc.model.dao.IGenreBureauDao;
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dao.IImportExportDao;
import sn.com.douane.ejb.rc.model.dao.IIndicateurRegDouDao;
import sn.com.douane.ejb.rc.model.dao.IIndicateurRegimeDao;
import sn.com.douane.ejb.rc.model.dao.ILangueDao;
import sn.com.douane.ejb.rc.model.dao.INatApureManifDao;
import sn.com.douane.ejb.rc.model.dao.IPaysDao;
import sn.com.douane.ejb.rc.model.dao.IPieceJointeDao;
import sn.com.douane.ejb.rc.model.dao.IPositionProduitDao;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.dao.IProduitDao;
import sn.com.douane.ejb.rc.model.dao.IProduitPjtDao;
import sn.com.douane.ejb.rc.model.dao.IProfilDao;
import sn.com.douane.ejb.rc.model.dao.IProfilGroupeDao;
import sn.com.douane.ejb.rc.model.dao.IRcsiteDao;
import sn.com.douane.ejb.rc.model.dao.IRegDouModeDeclDao;
import sn.com.douane.ejb.rc.model.dao.IRegEcoProdFiniDao;
import sn.com.douane.ejb.rc.model.dao.IRegapuregapureDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeBurInterditDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeDeclarantDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeDestinataireDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeDouanierDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeEconomiqueDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeFiscalDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeProduitDao;
import sn.com.douane.ejb.rc.model.dao.IReglementExportDao;
import sn.com.douane.ejb.rc.model.dao.IReglementImportDao;
import sn.com.douane.ejb.rc.model.dao.IRegroupFonctionsDao;
import sn.com.douane.ejb.rc.model.dao.IRegroupPaysDao;
import sn.com.douane.ejb.rc.model.dao.IRegroupementDao;
import sn.com.douane.ejb.rc.model.dao.IReprodFiniBurDao;
import sn.com.douane.ejb.rc.model.dao.IScoreSensVoyDao;
import sn.com.douane.ejb.rc.model.dao.IScoreTypeDestFiscalDao;
import sn.com.douane.ejb.rc.model.dao.IScoreTypeNatCargDao;
import sn.com.douane.ejb.rc.model.dao.IScoreTypeNavireDao;
import sn.com.douane.ejb.rc.model.dao.ISectionProduitDao;
import sn.com.douane.ejb.rc.model.dao.ISoumissionCreditaireDao;
import sn.com.douane.ejb.rc.model.dao.ISoumissionDocDao;
import sn.com.douane.ejb.rc.model.dao.ITarifsDao;
import sn.com.douane.ejb.rc.model.dao.ITauxDao;
import sn.com.douane.ejb.rc.model.dao.ITaxation2Dao;
import sn.com.douane.ejb.rc.model.dao.ITaxeDao;
import sn.com.douane.ejb.rc.model.dao.ITaxesRegDouDao;
import sn.com.douane.ejb.rc.model.dao.ITaxesRegimeDao;
import sn.com.douane.ejb.rc.model.dao.ITypeApureRegInterditDao;
import sn.com.douane.ejb.rc.model.dao.ITypeCreditDao;
import sn.com.douane.ejb.rc.model.dao.ITypeIndicateurDao;
import sn.com.douane.ejb.rc.model.dao.ITypeRegimeDouaneDao;
import sn.com.douane.ejb.rc.model.dao.ITypeUtilisateurDao;
import sn.com.douane.ejb.rc.model.dao.ITypeVoieDao;
import sn.com.douane.ejb.rc.model.dao.IUtilisateurDao;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;

@Local
public interface IGaindeSessionFacade {

	public IAuthenticator getAuthenticator();

	public IAgentDouaneDao getAgentDouaneDao();

	public ISoumissionCreditaireDao getSoumissionCreditaireDao();

	public ICreditaireDao getCreditaireDao();

	public ICompBureauDao getCompBureauDao();

	public ICompagnieAssisteeDao getCompagnieAssisteeDao();

	public IPpmDao getPpmDao();


	public IPaysDao getPaysDao();

	public IBureauDouaneDao getBureauDouaneDao();
	
	public IScoreSensVoyDao getScoreSensVoyageDao() ;

	public IBureauDouaneTypeManDao getBureauDouaneTypeManDao() ;
	
	public IScoreTypeNavireDao getScoreTypeNavireDao(); 
	
	public ITypeVoieDao getTypeVoieDao(); 
	
	public ICircuitVisiteDao getCircuitVisteDao();
	

	public IUtilisateurDao getUtilisateurDao();
	
	IScoreTypeDestFiscalDao getScoreTypeDestFiscalDao(); 
	
	IScoreTypeNatCargDao getScoreTypeNatCargDao(); 

	public ISoumissionDocDao getSoumissionDocDao();

	public IDispenseDao getDispenseDao();  
	
	public INatApureManifDao getNatApureManifDao();
 
	public ITypeRegimeDouaneDao getTypeRegimeDouaneDao();
	
	public ITypeApureRegInterditDao getTypeApureRegInterditDao();
	
	public IRcsiteDao getRcsiteDao();
	
	public IAutoCreditaireDao getAutoCreditaireDao();
	
	public IReferenceCommunSB getReferenceCommunSB();

	IConsignataireDao getConsignataireDao();
	
	public IProduitDao getProduitDao();
	
	public IReglementImportDao getReglementImportDao();
	
	public IRegimeDao  getRegimeDao();
 
	public IIndicateurRegimeDao getIndicateurRegimeDao();
	
	IEtatDossierDao getEtatDossierDao(); 
	
	public IEcheanchierReglementDao getEcheancierReglementDao();
	
	public ISectionProduitDao getSectionProduitDao();
	
	public IChapitreSectionDao getChapitreSectionDao();
	
	public IPositionProduitDao getPositionProduitDao();
	
	public ITarifsDao getTarifsDao();
	
	public ITauxDao getTauxDao();
	
	public IProduitPjtDao getProduitPjtDao();
	
	public IPieceJointeDao getPieceJointeDao();
	
	public IReglementExportDao getReglementExportDao();
	
	ITypeCreditDao getTypeCreditDao(); 
	
	public ITypeUtilisateurDao getTypeUtilisateurDao();
	
	public ICtrlUserDao getCtrlUserDao();
	
	public IAgreeDao getAgreeDao();
	
	public IAmbassadeOrganismeDao getAmbassadeOrganismeDao();
	
	public IImportExportDao getImportExportDao();
	
	public IRegimeEconomiqueDao getRegimeEconomiqueDao();
	
	public IRegEcoProdFiniDao getRegEcoProdFiniDao();
	
	public IReprodFiniBurDao getReprodFiniBurDao();
	
	public ITaxeDao getTaxeDao();
	
	public IAgrementEntrepriseDao getAgrementEntrepriseDao();
	
	public IRegroupementDao getRegroupementDao();
	
	public IAgrementRgrpProdDao getAgrementRgrpProdDao();
	
	ITaxation2Dao getTaxation2Dao();
	
	IGenreBureauDao getGenreBureauDao();
    
	public IFonctionnalitesDao getFonctionnalitesDao();
	
	public IGroupeFonctionDao getGroupefonctionDao();
	
	public IRegroupFonctionsDao getRegroupFonctionsDao();
	
	public IProfilDao getProfilDao();
	
	public IProfilGroupeDao getProfilGroupeDao();
	
	public IBasesTaxableDao getBasesTaxableDao();
	
	public IBureauUemoaDao getBureauUemoaDao();
	
	public IBurModDeclDao getBurModDeclDao();
	
	public IDelegationDao getDelegationDao();
	
	public IRegimeDeclarantDao getRegimeDeclarantDao();
	
	public IClasseDao getClasseDao();
	

	public IDispensePieceJointeDao getDispensePieceJointeDao();
	
	public ICatreGroupDao getCatreGroupDao();
	
	public IDevisesDao getDevisesDao();
	
	public IRegapuregapureDao getRegapuregapureDao();
	
	public ITypeIndicateurDao getTypeIndicateurDao();
	
	public IIndicateurRegDouDao getIndicateurRegdouDao();
	
	public IRegDouModeDeclDao getRegDouModeDeclDao();
	
	public IRegimeDestinataireDao getRegimeDestinataireDao();
	
	public IRegimeDouanierDao getRegimeDouanierDao();
	
	public IRegimeFiscalDao getRegimeFiscalDao();
	
	public ITaxesRegimeDao getTaxesRegimeDao();
	
	public ITaxesRegDouDao getTaxesRegDouDao();
	
	public IRegroupPaysDao getRegroupPaysDao();
	
	public IRegimeBurInterditDao getRegimeBurInterditDao();
	
	public ILangueDao getLangueDao();
	
	public IRegimeProduitDao getRegimeProduitDao();
	
	public IF9 getF9Dao();
	/**
	 * The method {@link #createBureauDouane(BureauDouane)} saves a BureauDouane to the database.
	 * 
	 * @param bureauDouane
	 *            bureau douane to save in the database.
	 * @throws CreateException
	 *             Thrown if an exception occurs when trying to save the entity to the data base.
	 */
	void createBureauDouane(BureauDouane bureauDouane) throws CreateException;

	/**
	 * The method {@link #modifierBureauDouane(BureauDouane)} updates a
	 * BureauDouane to the database.
	 * 
	 * @param bureauDouane
	 *            bureau douane to save in the database.
	 * @throws RcEjbException
	 *             Thrown if an exception occurs when trying to update the
	 *             entity to the data base.
	 */
	void modifierBureauDouane(BureauDouane bureauDouane) throws RcEjbException;
	
}
