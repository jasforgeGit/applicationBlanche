package sn.com.douane.ejb.rc.model.daoImpl;

import java.io.IOException;
import java.util.Properties;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.embeddable.EJBContainer;
import javax.naming.Context;
import javax.naming.NamingException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.*;
import sn.com.douane.utils.GaindePropertiesReader;


/**
 * This class is a generic unit test that should be extended by each test case.
 * 
 * @author Wadii
 */
public abstract class GenericUnitTest {

	protected IBureauDouaneDao bureauDouaneDao;
	protected ICompBureauDao compBureauDao;
	protected IGenreBureauDao genreBureauDao;
	protected IBureauDouaneTypeManDao burDouaneTypeManDao;
	protected IBacDepotPetrolierDao bacDepotPetrolierContext;
	protected IDepotPetrolierDao depotPetrolierContext;
	protected IJournalTresorDao journalTresorContext;
	protected IModeReglementDao modeReglementContext;
	protected IEtatModeReglementDao etatModeReglementContext;
	protected ITypeCreditDao typeCreditContext;
	protected ICreditaireDao creditaireContext;
	protected ITypeIndicateurDao typeIndicateurContext;
	protected ITypeLiquidationDao typeLiquidationContext;
	protected IFonctionnalitesDao fonctionnalitesContext;
	protected ITypeUtilisateurDao typeUtilisateurContext;
	protected IProfilDao profilContext;
	protected ICircuitVisiteDao circuitVisiteDao;
	protected IDevisesDao devises;
	protected ILangueDao langues;
	protected IPaysDao paysContext;
	protected IRegroupementDao regroupements;
	protected IRegroupPaysDao regroupPaysContext;
	protected IUniteVisiteDao uniteVisteContext;
	protected IProfilGroupeDao profilGroupeContext;
	protected IGroupeFonctionDao groupeFonctionContext;
	protected IUtilisateurDao utilisateurContext;
	protected IDelegationDao delegationContext;
	protected IRegroupFonctionsDao regroupFonctionsContext;
	protected IBureauProduitDao bureauProduitDao;
	protected IScoreBureauDao scoreBureauDao;
	protected IPpmEtrangerDao ppmEtrangerContext;
	protected IBaremeDao baremeDao;
	protected ITypeApuBurInterditDao typeApuBurInterditDao;
	protected IRegeCoprodFiniBurDao regeCoprodFiniBurDao;
	protected ITypeRegimeDouaneDao typeRegimeDouaneContext;
	protected IRegimeDouanierDao regimeDouanierContext;
	protected IRegDouModeDeclDao regDouModeDeclContext;
	protected IIndicateurRegDouDao indicateurRegDouContext;
	protected IIndicateurRegimeDao indicateurRegimeContext;
	protected IRegimeDao regimeContext;
	protected IRegimeFiscalDao regimeFiscalContext;
	protected IRegimeDestinataireDao regimeDestinataireContext;
	protected IPpmDao ppmContext;
	protected IRegapuregapureDao regapuregapureContext;
	protected IRegDouIndRecDao regDouIndRecContext;
	protected ITypeApureRegInterditDao typeApureRegInterditContext;
	protected IDispTRegimeInterditDao dispTRegimeInterditContext;
	protected ITaxesRegimeDao taxesRegimeContext;
	protected IIndicateurPpmDao indicateurPpmContext;
	protected IDocumentDao documentContext;
	protected ICritereLogiqueDao critereLogiqueContext;
	protected ITaxeDao taxeDao;
	protected IEtatDossierDao etatDossierContext;
	protected IEcheanchierReglementDao echeancierReglementContext;
	protected IEtatReglementDao etatReglementContext;
	protected ITaxesRegDouDao taxesRegDouContext;
	protected IRegimeDeclarantDao regimeDeclarantContext;
	protected ITaxesSuspendusDao taxesSuspendusContext;
	protected IAgreeDao agreeContext;
	protected IAgentDouaneDao agentDouaneContext;
	protected IAgrementRgrpProdDao agrementRgrpProdContext;
	protected IAmbassadeOrganismeDao ambassadeOrganismeContext;
	protected ITypeMadDao typeMadContext;
	protected IMadDao madContext;
	protected IBurModDeclDao burModDeclContext;
	protected IBureauUemoaDao bureauUemoaContext;
	protected ICompagnieAssisteeDao compagnieAssisteeContext;
	protected IConsignataireDao consignataireContext;
	protected IScoreConsignataireDao scoreConsignataireContext;
	protected IDesignationProdDao designationProdContext;
	protected IChapitreSectionDao chapitreSectionContext;
	protected ITypeSoumissionDao typeSoumissionContext;
	protected ISoumissionProduitDao soumissionProduitContext;
	protected IProduitDao produitContext;
	protected IDispenseDao dispenseContext;
	protected IPositionProduitDao positionProduitContext;
	protected IHistoProduitDao histoProduitContext;
	protected IHReglementExportDao hReglementExportContext;
	protected IImportExportDao importExportContext;
	protected IModeDeclarationDlppDao modeDeclarationDlppContext;
	protected IModeExpeditionDao modeExpeditionContext;
	protected INatApureManifDao natApureManifContext;
	protected INaturePVDao naturePVContext;
	protected INbreConnaissementDao nbreConnaissementContext;
	protected IOperateurDao operateurContext;
	protected ITypeChampOperateurDao typeChampOperateurContext;
	protected IReprodFiniBurDao reprodFiniBurDao;
	protected IParamModifDao paramModifContext;
	protected IRegEcoProdFiniDao regEcoProdFiniContext;
	protected IReglementImportDao reglementImportContext;
	protected IRgepFinImpDao rgepFinImpContext;
	protected ITypeConvocationDao typeConvocationContext;
	protected IMessagesErreurDao messagesErreurDao;
	protected IScoreSensVoyDao scoreSensVoyDao;
	protected IScoreTypeNavireDao scoreTypeNavireDao;
	protected IScoreTonnageDebarqueDao scoreTonnageDebDao;
	protected ITypeDecisionDao typeDecisionContext;
	protected ITypeEntreeMadDao typeEntreeMadContext;
	protected ITypeImputCreditDao typeImputCreditContext;
	protected IUniteFacturationDao uniteFacturationContext;
	protected ITypeMiseEnDepotDao typeMiseEnDepotContext;
	protected IScoreTypeDestFiscalDao scoreTypeDestFiscalDao;
	protected IScoreTypeNatCargDao scoreTypeNatCargDao;
	protected ISectionProduitDao sectionProduitContext;
	protected ITypeLiquidationSuppDao typeLiquidationSuppContext;
	protected IChaineDao chaineContext;
	protected ICritereDao critereContext;
	protected IDetailChaineDao detailChaineContext;
	protected IOrigineCritereDao origineCritereContext;
	protected IBasesTaxableDao basesTaxableContext;
	protected IExceptionsDao exceptionsContext;
	protected IRegimeBurInterditDao regimeBurInterditDao;
	protected IPieceJointeDao pieceJointeDao;
	protected INaturePieceJointeDao naturePieceJointeDao;
	protected ISoumissionDocDao soumissionDocDao;
	protected IBureauFranchiseDao bureauFranchiseDao;
	protected INatureRegEcoDao natureRegEcoDao;
	protected IProduitPjtDao ProduitPjtDao;
	protected ICatreGroupDao catreGroupDao;
	protected ICatreGroupPieceJointeDao catreGroupPieceJointeDao;
	protected IClasseDao classeDao;
	protected IDispenseDao dispenseDao;
	protected IDispensePieceJointeDao dispensePieceJointeDao;
	protected IPieceJointeRegimeDao pieceJointeRegimeDao;
	protected ITypeVoieDao typeVoieDao;
	protected ITarifsDao tarifDao;
	protected ITauxDao tauxDao;
	protected IHreglementImportDao hreglementImportDao;
	protected IAutoCreditaireDao autoCreditaireDao;
	protected IRegimeEconomiqueDao regimeEconomiqueDao;
	protected IReglementExportDao reglementExportDao;
	protected IRcsiteDao rcsiteDao;
	protected ITaxesRegroupDao taxesRegroupDao;
	protected ITaxesTransportDao taxesTransportDao;
	protected ITitreExonerationDao titreExonerationDao;
	protected IQuittancesValidesDao quittancesValidesDao;
	protected IQuittancesExcluesDao quittancesExcluesDao;
	protected IHistoQuittancesValidesDao histoQuittancesValidesDao;
	protected IAgrementEntrepriseDao agrementEntrepriseDao;
	protected IAgendaDao agendaDao;
	protected ICompteDao compteDao;
	protected IAgreeDao agreeDao;
	protected static IFactureDao factureDao;
	protected ITypeMadDao typeMadDao;
	protected IDeclarationExtDao declarationExtDao;

	EJBContainer ejbContainer;
	Context context;

	@SuppressWarnings("unchecked")
	@Before
	public void setUp() throws Exception {
		createContainer();
	}

	public void createContainer() throws IOException {
		final Properties p = new Properties();

		p.put("jdbc/gaindeds", "new://Resource?type=DataSource");
		p.put("jdbc/gaindeds.JdbcDriver", GaindePropertiesReader.getInstance().getProperty("jdbc.gaindeds.JdbcDriver"));
		p.put("jdbc/gaindeds.JdbcUrl", GaindePropertiesReader.getInstance().getProperty("jdbc.gaindeds.JdbcUrl"));
		p.put("jdbc/gaindeds.UserName", GaindePropertiesReader.getInstance().getProperty("jdbc.gaindeds.username"));
		p.put("jdbc/gaindeds.Password", GaindePropertiesReader.getInstance().getProperty("jdbc.gaindeds.password"));
		p.put("jdbc/gaindeds.JtaManaged", GaindePropertiesReader.getInstance().getProperty("jdbc.gaindeds.jtamanaged"));

		p.put("log4j.category.OpenEJB.startup ", "debug");
		p.put("openejb.validation.output.level", "verbose");
		p.put("openejb.deployments.classpath.filter.descriptors", "true");
		// p.put("openejb.deployments.classpath.exclude", ".*");
		p.put("openejb.deployments.classpath.include", GaindePropertiesReader.getInstance().getProperty("openejb.deployments.classpath.include"));

		ejbContainer = EJBContainer.createEJBContainer(p);
		context = ejbContainer.getContext();

		bureauProduitDao = lookupBy(IBureauProduitDao.class);
		bureauDouaneDao = lookupBy(IBureauDouaneDao.class);
		compBureauDao = lookupBy(ICompBureauDao.class);
		creditaireContext = lookupBy(ICreditaireDao.class);
		circuitVisiteDao = lookupBy(ICircuitVisiteDao.class);
		delegationContext = lookupBy(IDelegationDao.class);
		depotPetrolierContext = lookupBy(IDepotPetrolierDao.class);
		devises = lookupBy(IDevisesDao.class);
		fonctionnalitesContext = lookupBy(IFonctionnalitesDao.class);
		genreBureauDao = lookupBy(IGenreBureauDao.class);
		groupeFonctionContext = lookupBy(IGroupeFonctionDao.class);
		
		langues = lookupBy(ILangueDao.class);
		
		modeReglementContext = lookupBy(IModeReglementDao.class);
		profilContext = lookupBy(IProfilDao.class);
		paysContext = lookupBy(IPaysDao.class);
		profilGroupeContext = lookupBy(IProfilGroupeDao.class);
		
		regroupFonctionsContext = lookupBy(IRegroupFonctionsDao.class);
		regroupPaysContext = lookupBy(IRegroupPaysDao.class);
		
		typeUtilisateurContext = lookupBy(ITypeUtilisateurDao.class);
		typeCreditContext = lookupBy(ITypeCreditDao.class);
		typeIndicateurContext = lookupBy(ITypeIndicateurDao.class);
		typeLiquidationContext = lookupBy(ITypeLiquidationDao.class);
		typeVoieDao = lookupBy(ITypeVoieDao.class);
		
		uniteVisteContext = lookupBy(IUniteVisiteDao.class);
		utilisateurContext = lookupBy(IUtilisateurDao.class);
		
	}

	public <T> T lookupBy(Class<T> type) {
		String naming = "java:global/";
		T myClass;
		try {
			myClass = (T) context.lookup(naming + "gainde-integral-rc-ejb/" + type.getSimpleName());
			System.out.println("Standard-myClass:" + myClass);
			return myClass;
		} catch (NamingException ex) {
			// lookup with cobertura
			naming = "java:global/cobertura/";
			try {
				myClass = (T) context.lookup(naming + type.getSimpleName() + "!" + type.getName());
				System.out.println("Cobertura-myClasse:" + myClass);
				return myClass;
			} catch (NamingException e) {
				e.printStackTrace();
				return null;
			}
		}
	}

	/*
	 * Abstract Unit test for CRUD operation.
	 * 
	 * @throws CreateException, FinderException, EJBException, RemoveException
	 */
	@Test
	public void testCRUD() throws CreateException, FinderException,
			EJBException, RemoveException {
		testCreate();
		testUpdate();
		testDelete();
	}

	/**
	 * Abstract Unit test for creation operation.
	 * 
	 * @throws RcEjbException
	 */
	public abstract void testCreate() throws CreateException, FinderException;

	/**
	 * Abstract Unit test for updating operation.
	 * 
	 * @throws RemoveException
	 */
	public abstract void testUpdate() throws FinderException, EJBException,
			RemoveException;

	/**
	 * Abstract Unit test for deleting operation.
	 * 
	 * @throws RcEjbException
	 */
	public abstract void testDelete() throws RemoveException, FinderException;

	/**
	 * JUnit method called once all the test methods have been completed !
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		// ejbContainer.close();
	}

}