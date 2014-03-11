package sn.com.douane.ejb.rc.services;

import javax.ejb.CreateException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
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
import sn.com.douane.utils.sysEnv;



/**
 * Session facade of the Gainde application.
 * 
 * @author Wadii 
 *
 */
@Stateless(name = "IGaindeSessionFacade")
public class GaindeSessionFacade implements IGaindeSessionFacade {
	
	
	@EJB
	private IAuthenticator authenticator;

	@EJB 
	private ICreditaireDao creditaireDao;
	
	@EJB 
	private ISoumissionCreditaireDao soumissionCreditaireDao;
	
	@EJB 
	private IAgentDouaneDao agentDouaneDao;
	
	@EJB
	private ICompBureauDao compBureauDao; 
	
	@EJB
	private ICompagnieAssisteeDao compagnieAssisteeDao;
	
	@EJB 
	private ICircuitVisiteDao circuitVisiteDao;
	
	@EJB
	private IPpmDao ppmDao; 
	
	@EJB
	private IPaysDao paysDao; 
	
	@EJB
	private IBureauDouaneDao bureauDouaneDao; 
	

	@EJB
	private IScoreSensVoyDao scoreSensVoyageDao; 
	
	@EJB
	private IBureauDouaneTypeManDao bureauDouaneTypeManDao; 
	
	@EJB
	private IScoreTypeNavireDao scoreTypeNavireDao; 
	
	@EJB
	private ITypeVoieDao typeVoieDao; 
	
	@EJB
	private IUtilisateurDao utilisateurDao;
	
	@EJB
	private IScoreTypeDestFiscalDao scoreTypeDestFiscalDao; 
	
	@EJB
	private IScoreTypeNatCargDao scoreTypeNatCargDao; 
	
	@EJB
	private ITypeRegimeDouaneDao typeRegimeDouaneDao;
	
	@EJB
	private ISoumissionDocDao soumissionDocDao;

	@EJB
	private IDispenseDao dispenseDao; 
	
	@EJB
	private INatApureManifDao natApureManifDao;
	
	@EJB
	private ITypeApureRegInterditDao typeApureRegInterditDao;
	
	@EJB
	private IRcsiteDao rcsiteDao;
	
	@EJB
	private IAutoCreditaireDao autoCreditaireDao;
	
	@EJB
	private IReferenceCommunSB referenceCommunSB;
	
	@EJB
	private IConsignataireDao consignataireDao; 
	
	@EJB
	private IProduitDao produitDao;
	
	@EJB
	private IReglementImportDao reglementImportDao;
	
	@EJB
	private IRegimeDao regimeDao;
	
	@EJB
	private IIndicateurRegimeDao indicateurRegimeDao;
	
	@EJB
	private IEtatDossierDao etatDossierDao;
	
	@EJB
	private IEcheanchierReglementDao echeancierReglementDao;
	
	@EJB
	private ISectionProduitDao sectionProduitDao;
	
	@EJB
	private IChapitreSectionDao chapitreSectionDao;
	
	@EJB
	private IPositionProduitDao positionProduitDao;
	
	@EJB
	private ITarifsDao tarifDao;
	
	@EJB
	private ITauxDao tauxDao;
	
	@EJB
	private IProduitPjtDao produitPjtDao;
	
	@EJB
	private IPieceJointeDao pieceJointeDao;
	
	@EJB
	private IReglementExportDao reglementExportDao;
	
	@EJB
	private ITypeCreditDao typeCreditDao; 
	
	@EJB
	private ITypeUtilisateurDao typeUtilisateurDao;
	
	@EJB
	private ICtrlUserDao ctrlUserDao;
	
	@EJB
	private IAgreeDao agreeDao;
	
	@EJB
	private IAmbassadeOrganismeDao ambassadeOrganismeDao;
	
	@EJB
	private IImportExportDao importExportDao;
	
	@EJB
	private IRegimeEconomiqueDao regimeEconomiqueDao;
	
	@EJB
	private IRegEcoProdFiniDao regEcoProdFiniDao;
	
	@EJB
	private IReprodFiniBurDao reprodFiniBurDao;
	
	@EJB
	private ITaxeDao taxeDao;
	
	@EJB
	private ITaxation2Dao taxation2Dao;
	
	@EJB
	private IAgrementEntrepriseDao agrementEntrepriseDao;
	
	@EJB
	private IRegroupementDao regroupementDao;
	
	@EJB
	private IAgrementRgrpProdDao agrementRgrpProdDao;
	
	@EJB
	private IGenreBureauDao genreBureauDao;
	
	@EJB
	private IFonctionnalitesDao fonctionnalitesDao;
	
	@EJB
	private IGroupeFonctionDao groupefonctionDao;
	
	@EJB
	private IRegroupFonctionsDao regroupFonctionsDao;
	
	@EJB
	private IProfilDao profilDao;
	
	@EJB
	private IProfilGroupeDao profilGroupeDao;
	
	@EJB
	private IBasesTaxableDao basesTaxableDao;
	
	@EJB
	private IBureauUemoaDao bureauUemoaDao;
	
	@EJB
	private IBurModDeclDao burModDeclDao;
	
	@EJB
	private IDelegationDao delegationDao;
	
	@EJB
	private IRegimeDeclarantDao regimeDeclarantDao;
	
	@EJB
	private IClasseDao classeDao;
	
	@EJB
	private IDispensePieceJointeDao dispensePieceJointeDao;
	
	@EJB
	private ICatreGroupDao catreGroupDao;
	
	@EJB
	private IDevisesDao devisesDao;
	
	@EJB
	private IRegapuregapureDao regapuregapureDao;
	
	@EJB
	private ITypeIndicateurDao typeIndicateurDao;
	
	
	@EJB
	private IIndicateurRegDouDao indicateurRegDouDao;
	
	@EJB
	private IRegDouModeDeclDao regDouModeDeclDao;
	
	@EJB
	private IRegimeDestinataireDao regimeDestinataireDao;
	
	@EJB
	private IRegimeDouanierDao regimeDouanierDao;
	
	@EJB
	private IRegimeFiscalDao regimeFiscalDao;
	
	@EJB
	private ITaxesRegimeDao taxesRegimeDao;
	
	@EJB
	private ITaxesRegDouDao taxesRegDouDao;
	
	@EJB
	private IRegroupPaysDao regroupPaysDao;
	
	@EJB
	private IRegimeBurInterditDao regimeBurInterditDao;
	
	@EJB
	private ILangueDao langueDao;
	
	@EJB
	private IRegimeProduitDao regimeProduitDao;
	
	@EJB
	private IF9 f9Dao;
	
	public IAuthenticator getAuthenticator() {
		return authenticator;
	}


	public IAgentDouaneDao getAgentDouaneDao() {
		return agentDouaneDao;
	}


	public ISoumissionCreditaireDao getSoumissionCreditaireDao() {
		return soumissionCreditaireDao;
	}


	public ICreditaireDao getCreditaireDao() {
		return creditaireDao;
	}

	public ICompBureauDao getCompBureauDao() {
		return compBureauDao; 
	}
	public ICompagnieAssisteeDao getCompagnieAssisteeDao() {
		return compagnieAssisteeDao;
	}


	public ICircuitVisiteDao getCircuitVisteDao() {		
		return circuitVisiteDao;
	}


	public IPpmDao getPpmDao() {
		return ppmDao;
	}

	public IPaysDao getPaysDao() {
		return paysDao;
	}


	public IBureauDouaneDao getBureauDouaneDao() {
		return bureauDouaneDao;
	}


	public IScoreSensVoyDao getScoreSensVoyageDao() {
		return scoreSensVoyageDao;
	}


	public IBureauDouaneTypeManDao getBureauDouaneTypeManDao() {
		return bureauDouaneTypeManDao;
	}

	public IScoreTypeNavireDao getScoreTypeNavireDao() {
		return scoreTypeNavireDao;
	}

	public ITypeVoieDao getTypeVoieDao() {
		return typeVoieDao;
	}

	@Override
	public IUtilisateurDao getUtilisateurDao() {
		return utilisateurDao;
	}
	
	public IScoreTypeDestFiscalDao getScoreTypeDestFiscalDao() {
		return scoreTypeDestFiscalDao; 
	}
	
	public IScoreTypeNatCargDao getScoreTypeNatCargDao() {
		return scoreTypeNatCargDao; 
	}

	public ITypeRegimeDouaneDao getTypeRegimeDouaneDao() {
		return typeRegimeDouaneDao;
	}
		
	@Override
	public ISoumissionDocDao getSoumissionDocDao() {
		return soumissionDocDao;
	}

	@Override
	public IDispenseDao getDispenseDao() {
		return dispenseDao;
	}

	@Override
	public INatApureManifDao getNatApureManifDao() {
		return natApureManifDao;
	}

	public ITypeApureRegInterditDao getTypeApureRegInterditDao() {
		return typeApureRegInterditDao;
	}

	/**
	 * @return the rcsiteDao
	 */
	@Override
	public IRcsiteDao getRcsiteDao() {
		return rcsiteDao;
	}
	
	
	public IAutoCreditaireDao getAutoCreditaireDao(){
		 return autoCreditaireDao;
	}

	public IReferenceCommunSB getReferenceCommunSB() {
		return referenceCommunSB;
	}

	public void setReferenceCommunSB(IReferenceCommunSB referenceCommunSB) {
		this.referenceCommunSB = referenceCommunSB;
	}

	@Override
	public IConsignataireDao getConsignataireDao() {
		return consignataireDao;
	}

	@Override
	public IProduitDao getProduitDao() {
		return produitDao;
	}

	@Override
	public IReglementImportDao getReglementImportDao() {		
		return reglementImportDao;
	}

	@Override
	public IRegimeDao getRegimeDao() {
		return regimeDao;
	}


	public IIndicateurRegimeDao getIndicateurRegimeDao() {
		
		return indicateurRegimeDao;
	}

	public IEtatDossierDao getEtatDossierDao() {
		return etatDossierDao;
	}
	
	public IEcheanchierReglementDao getEcheancierReglementDao(){
		return echeancierReglementDao;
	}
	
	public ISectionProduitDao getSectionProduitDao(){
		
		return sectionProduitDao;
	}
	
	public IChapitreSectionDao getChapitreSectionDao(){
		return chapitreSectionDao;
		
	}
	
	public IPositionProduitDao getPositionProduitDao(){
		
		return positionProduitDao;
	}
	
	
	public ITarifsDao getTarifsDao(){		
		return tarifDao;
	}
	
	public ITauxDao getTauxDao(){
		
		return tauxDao;
	}
	
	public IProduitPjtDao getProduitPjtDao(){
		
		return produitPjtDao;
	}
	
	public IPieceJointeDao getPieceJointeDao(){
		
		return pieceJointeDao;
	}
	
	public IReglementExportDao getReglementExportDao(){
		
		return reglementExportDao;
	}

	public ITypeCreditDao getTypeCreditDao() {
		return typeCreditDao;
	}
	
	public ITypeUtilisateurDao getTypeUtilisateurDao(){
		
		return typeUtilisateurDao;
	}
	
	public ICtrlUserDao getCtrlUserDao(){
		
		return ctrlUserDao;
	}
	
	public IAgreeDao getAgreeDao(){
		
		return agreeDao;
	}

	public IAmbassadeOrganismeDao getAmbassadeOrganismeDao(){
		
		return ambassadeOrganismeDao;
	}
	
	public IImportExportDao getImportExportDao(){
		
		return importExportDao;
	}
	
	public IRegimeEconomiqueDao getRegimeEconomiqueDao(){
		
		return regimeEconomiqueDao;
	}
	
	public IRegEcoProdFiniDao getRegEcoProdFiniDao(){
		
		return regEcoProdFiniDao;
	}

	public IReprodFiniBurDao getReprodFiniBurDao(){
		
		return reprodFiniBurDao;
	}

	public ITaxeDao getTaxeDao(){
		
		return taxeDao;
	}

	public ITaxation2Dao getTaxation2Dao() {
		return taxation2Dao;
	}
	
public IAgrementEntrepriseDao getAgrementEntrepriseDao(){
		
		return agrementEntrepriseDao;
	}

	public IRegroupementDao getRegroupementDao(){
		
		return regroupementDao;
	}
	
	public IAgrementRgrpProdDao getAgrementRgrpProdDao(){
		
		return agrementRgrpProdDao;
	}


	public IGenreBureauDao getGenreBureauDao() {
		return genreBureauDao;
	}
	
	public IFonctionnalitesDao getFonctionnalitesDao() {
		return fonctionnalitesDao;
	}
	
	public IGroupeFonctionDao getGroupefonctionDao() {
		return groupefonctionDao;
	}
	
	public IRegroupFonctionsDao getRegroupFonctionsDao() {
		return regroupFonctionsDao;
	}
	
	public IProfilDao getProfilDao() {
		return profilDao;
	}
	
	public IProfilGroupeDao getProfilGroupeDao() {
		return profilGroupeDao;
	}
	
	public IBasesTaxableDao getBasesTaxableDao() {
		return basesTaxableDao;
	}
	
	public IBureauUemoaDao getBureauUemoaDao() {
		return bureauUemoaDao;
	}
	
	public IBurModDeclDao getBurModDeclDao() {
		return burModDeclDao;
	}
	
	public IDelegationDao getDelegationDao() {
		return delegationDao;
	}
	
	public IRegimeDeclarantDao getRegimeDeclarantDao() {
		return regimeDeclarantDao;
	}
	
	public IClasseDao getClasseDao() {
		return classeDao;
	}
	
	public IDispensePieceJointeDao getDispensePieceJointeDao() {
		return dispensePieceJointeDao;
	}
	
	public ICatreGroupDao getCatreGroupDao() {
		return catreGroupDao;
	}
	
	public IDevisesDao getDevisesDao() {
		return devisesDao;
	}
	
	public IRegapuregapureDao getRegapuregapureDao() {
		return regapuregapureDao;
	}
	

	public ITypeIndicateurDao getTypeIndicateurDao() {
		return typeIndicateurDao;
	}
	
	public IIndicateurRegDouDao getIndicateurRegdouDao() {
		return indicateurRegDouDao;
	}
	
	public IRegDouModeDeclDao getRegDouModeDeclDao() {
		return regDouModeDeclDao;
	}
	
	public IRegimeDestinataireDao getRegimeDestinataireDao() {
		return regimeDestinataireDao;
	}
	
	public IRegimeDouanierDao getRegimeDouanierDao() {
		return regimeDouanierDao;
	}
	
	public IRegimeFiscalDao getRegimeFiscalDao() {
		return regimeFiscalDao;
	}
	
	public ITaxesRegimeDao getTaxesRegimeDao() {
		return taxesRegimeDao;
	}
	
	public ITaxesRegDouDao getTaxesRegDouDao() {
		return taxesRegDouDao;
	}
	
	public IRegroupPaysDao getRegroupPaysDao() {
		return regroupPaysDao;
	}
	
	public IRegimeBurInterditDao getRegimeBurInterditDao() {
		return regimeBurInterditDao;
	}
	
	public ILangueDao getLangueDao() {
		return langueDao;
	}
	
	public IRegimeProduitDao getRegimeProduitDao() {
		return regimeProduitDao;
	}
	
	/**
	 * {@inheritDoc}
	 */
	public void createBureauDouane(BureauDouane bureauDouane) throws CreateException{
		//cheking parameter
		if (sysEnv.isNullOrEmpty(bureauDouane.getRccodeburdouane())){			
			throw new CreateException(ConstErrCodRC.RCCODEBURDOUANE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcCompetence())){			
			throw new CreateException(ConstErrCodRC.RCCOMPETENCE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcGenreBur())){			
			throw new CreateException(ConstErrCodRC.RCGENREBUR_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcTypeBurDouane())){			
			throw new CreateException(ConstErrCodRC.RCTYPEBURDOUANE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRclibelleburdouane())){			
			throw new CreateException(ConstErrCodRC.RCLIBELLEBURDOUANE_OB);
		}
		
		//saving entity
		getBureauDouaneDao().create(bureauDouane);

	}

	/**
	 * {@inheritDoc}
	 */
	public void modifierBureauDouane(BureauDouane bureauDouane) throws RcEjbException{
		//cheking parameter
		if (sysEnv.isNullOrEmpty(bureauDouane.getRccodeburdouane())){			
			throw new RcEjbException(ConstErrCodRC.RCCODEBURDOUANE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcCompetence())){			
			throw new RcEjbException(ConstErrCodRC.RCCOMPETENCE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcGenreBur())){			
			throw new RcEjbException(ConstErrCodRC.RCGENREBUR_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRcTypeBurDouane())){			
			throw new RcEjbException(ConstErrCodRC.RCTYPEBURDOUANE_OB);
		}
		if (sysEnv.isNullOrEmpty(bureauDouane.getRclibelleburdouane())){			
			throw new RcEjbException(ConstErrCodRC.RCLIBELLEBURDOUANE_OB);
		}

		try{
			//updating entity
			getBureauDouaneDao().merge(bureauDouane);
		}catch (EJBException e) {
			throw new RcEjbException(e);
		}

	}

	
	public IF9 getF9Dao() {
		return f9Dao;
	}
}
