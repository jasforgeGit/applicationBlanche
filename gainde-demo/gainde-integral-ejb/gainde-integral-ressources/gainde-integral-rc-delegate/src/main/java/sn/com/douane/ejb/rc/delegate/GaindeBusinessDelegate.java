package sn.com.douane.ejb.rc.delegate;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;
import java.util.Properties;
import java.util.Vector;

import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.log4j.Logger;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IAutoCreditaireDao;
import sn.com.douane.ejb.rc.model.dao.ICtrlUserDao;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.AgrementEntrepriseDto;
import sn.com.douane.ejb.rc.model.dto.AgrementRgrpProdDto;
import sn.com.douane.ejb.rc.model.dto.AmbassadeOrganismeDto;
import sn.com.douane.ejb.rc.model.dto.BasesTaxableDto;
import sn.com.douane.ejb.rc.model.dto.BurModDeclDto;
import sn.com.douane.ejb.rc.model.dto.BureauDouaneTypeManifesteDto;
import sn.com.douane.ejb.rc.model.dto.BureauUemoaDto;
import sn.com.douane.ejb.rc.model.dto.CatreGroupDto;
import sn.com.douane.ejb.rc.model.dto.ClasseDto;
import sn.com.douane.ejb.rc.model.dto.CompBureauDto;
import sn.com.douane.ejb.rc.model.dto.CompagnieassisteeDto;
import sn.com.douane.ejb.rc.model.dto.ConsignataireDto;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.dto.DelegationDto;
import sn.com.douane.ejb.rc.model.dto.DevisesDto;
import sn.com.douane.ejb.rc.model.dto.DispenseDto;
import sn.com.douane.ejb.rc.model.dto.DispensePieceJointeDto;
import sn.com.douane.ejb.rc.model.dto.EcheancierReglementDto;
import sn.com.douane.ejb.rc.model.dto.ExceptionsTaxesDto;
import sn.com.douane.ejb.rc.model.dto.FonctionnaliteDto;
import sn.com.douane.ejb.rc.model.dto.GroupefonctionDto;
import sn.com.douane.ejb.rc.model.dto.ImportExportDto;
import sn.com.douane.ejb.rc.model.dto.IndicateurDto;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegdouDto;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegimeDto;
import sn.com.douane.ejb.rc.model.dto.LieuDepotDto;
import sn.com.douane.ejb.rc.model.dto.LieuEmbarquementDto;
import sn.com.douane.ejb.rc.model.dto.ModeConditionnementDto;
import sn.com.douane.ejb.rc.model.dto.ModeDeclValeurDto;
import sn.com.douane.ejb.rc.model.dto.ModeDeclarationDto;
import sn.com.douane.ejb.rc.model.dto.ModeTransportDto;
import sn.com.douane.ejb.rc.model.dto.NatureFiscaliteDto;
import sn.com.douane.ejb.rc.model.dto.NumerotationDto;
import sn.com.douane.ejb.rc.model.dto.PaysDto;
import sn.com.douane.ejb.rc.model.dto.ProduitDto;
import sn.com.douane.ejb.rc.model.dto.ProduitPjtDto;
import sn.com.douane.ejb.rc.model.dto.ProfilDto;
import sn.com.douane.ejb.rc.model.dto.RegDouModeDeclDto;
import sn.com.douane.ejb.rc.model.dto.RegapuregapureDto;
import sn.com.douane.ejb.rc.model.dto.RegimeBurInterditDto;
import sn.com.douane.ejb.rc.model.dto.RegimeDeclarantDto;
import sn.com.douane.ejb.rc.model.dto.RegimeDestinataireDto;
import sn.com.douane.ejb.rc.model.dto.RegimeDouanierDto;
import sn.com.douane.ejb.rc.model.dto.RegimeDto;
import sn.com.douane.ejb.rc.model.dto.RegimeEconomiqueDto;
import sn.com.douane.ejb.rc.model.dto.RegimeFiscalDto;
import sn.com.douane.ejb.rc.model.dto.RegimeProduitDto;
import sn.com.douane.ejb.rc.model.dto.RegroupPaysDto;
import sn.com.douane.ejb.rc.model.dto.RegroupementDto;
import sn.com.douane.ejb.rc.model.dto.SoumissionCreditaireDto;
import sn.com.douane.ejb.rc.model.dto.SoumissionDocDto;
import sn.com.douane.ejb.rc.model.dto.TarifDto;
import sn.com.douane.ejb.rc.model.dto.TauxDto;
import sn.com.douane.ejb.rc.model.dto.TaxeDto;
import sn.com.douane.ejb.rc.model.dto.TaxesRegDouDto;
import sn.com.douane.ejb.rc.model.dto.TaxesRegimeDto;
import sn.com.douane.ejb.rc.model.dto.TypeApurementDto;
import sn.com.douane.ejb.rc.model.dto.TypeBureauDto;
import sn.com.douane.ejb.rc.model.dto.TypeConteneurDto;
import sn.com.douane.ejb.rc.model.dto.TypeLieuEmbDto;
import sn.com.douane.ejb.rc.model.dto.TypeManifesteDto;
import sn.com.douane.ejb.rc.model.dto.TypeRegimeDouaneDto;
import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.AgrementEntreprise;
import sn.com.douane.ejb.rc.model.entities.AgrementRgrpProd;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.ejb.rc.model.entities.AutoCreditaire;
import sn.com.douane.ejb.rc.model.entities.BasesTaxable;
import sn.com.douane.ejb.rc.model.entities.BurModDecl;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.BureauDouaneTypeManifeste;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;
import sn.com.douane.ejb.rc.model.entities.CatreGroup;
import sn.com.douane.ejb.rc.model.entities.ChapitreSection;
import sn.com.douane.ejb.rc.model.entities.CircuitVisite;
import sn.com.douane.ejb.rc.model.entities.Classe;
import sn.com.douane.ejb.rc.model.entities.CompBureau;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.CtrlUser;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.entities.Devises;
import sn.com.douane.ejb.rc.model.entities.Dispense;
import sn.com.douane.ejb.rc.model.entities.DispensePieceJointe;
import sn.com.douane.ejb.rc.model.entities.EcheancierReglement;
import sn.com.douane.ejb.rc.model.entities.ExceptionsTaxes;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GenreBureau;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.ImportExport;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegdou;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegime;
import sn.com.douane.ejb.rc.model.entities.Indicateur;
import sn.com.douane.ejb.rc.model.entities.Langue;
import sn.com.douane.ejb.rc.model.entities.LieuDepot;
import sn.com.douane.ejb.rc.model.entities.LieuEmbarquement;
import sn.com.douane.ejb.rc.model.entities.Messages;
import sn.com.douane.ejb.rc.model.entities.ModeConditionnement;
import sn.com.douane.ejb.rc.model.entities.ModeDeclValeur;
import sn.com.douane.ejb.rc.model.entities.ModeDeclaration;
import sn.com.douane.ejb.rc.model.entities.ModeTransport;
import sn.com.douane.ejb.rc.model.entities.NatApureManif;
import sn.com.douane.ejb.rc.model.entities.NatureFiscalite;
import sn.com.douane.ejb.rc.model.entities.Numerotation;
import sn.com.douane.ejb.rc.model.entities.Pays;
import sn.com.douane.ejb.rc.model.entities.PieceJointe;
import sn.com.douane.ejb.rc.model.entities.PositionProduit;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.Rcsite;
import sn.com.douane.ejb.rc.model.entities.RegDouModeDecl;
import sn.com.douane.ejb.rc.model.entities.RegEcoProdFini;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import sn.com.douane.ejb.rc.model.entities.Regime;
import sn.com.douane.ejb.rc.model.entities.RegimeBurInterdit;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;
import sn.com.douane.ejb.rc.model.entities.RegimeProduit;
import sn.com.douane.ejb.rc.model.entities.ReglementExport;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.entities.RegroupPays;
import sn.com.douane.ejb.rc.model.entities.Regroupement;
import sn.com.douane.ejb.rc.model.entities.ReprodFiniBur;
import sn.com.douane.ejb.rc.model.entities.ScoreSensVoy;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeDestFiscal;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeNatCarg;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeNavire;
import sn.com.douane.ejb.rc.model.entities.SectionProduit;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;
import sn.com.douane.ejb.rc.model.entities.SoumissionDoc;
import sn.com.douane.ejb.rc.model.entities.Tarif;
import sn.com.douane.ejb.rc.model.entities.Taux;
import sn.com.douane.ejb.rc.model.entities.Taxation2;
import sn.com.douane.ejb.rc.model.entities.Taxe;
import sn.com.douane.ejb.rc.model.entities.TaxesRegDou;
import sn.com.douane.ejb.rc.model.entities.TaxesRegime;
import sn.com.douane.ejb.rc.model.entities.TypeApurRegInterdit;
import sn.com.douane.ejb.rc.model.entities.TypeApurement;
import sn.com.douane.ejb.rc.model.entities.TypeBureau;
import sn.com.douane.ejb.rc.model.entities.TypeConteneur;
import sn.com.douane.ejb.rc.model.entities.TypeLieuEmb;
import sn.com.douane.ejb.rc.model.entities.TypeManifeste;
import sn.com.douane.ejb.rc.model.entities.TypeRegimeDouane;
import sn.com.douane.ejb.rc.model.entities.TypeVoie;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.ejb.rc.model.keys.AgrementRgrpProdKey;
import sn.com.douane.ejb.rc.model.keys.BasesTaxableKey;
import sn.com.douane.ejb.rc.model.keys.BurDouaneTypeManPK;
import sn.com.douane.ejb.rc.model.keys.BurModDeclKey;
import sn.com.douane.ejb.rc.model.keys.DelegationKey;
import sn.com.douane.ejb.rc.model.keys.DispensePieceJointeKey;
import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;
import sn.com.douane.ejb.rc.model.keys.ExceptionsTaxesKey;
import sn.com.douane.ejb.rc.model.keys.IndicateurRegdouKey;
import sn.com.douane.ejb.rc.model.keys.IndicateurRegimeKey;
import sn.com.douane.ejb.rc.model.keys.NumerotationKey;
import sn.com.douane.ejb.rc.model.keys.ProduitKey;
import sn.com.douane.ejb.rc.model.keys.ProduitPjtKey;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;
import sn.com.douane.ejb.rc.model.keys.RegapuregapureKey;
import sn.com.douane.ejb.rc.model.keys.RegdouModeDeclKey;
import sn.com.douane.ejb.rc.model.keys.RegimeBurInterditKey;
import sn.com.douane.ejb.rc.model.keys.RegimeDeclarantKey;
import sn.com.douane.ejb.rc.model.keys.RegimeDestinataireKey;
import sn.com.douane.ejb.rc.model.keys.RegimeDouanierKey;
import sn.com.douane.ejb.rc.model.keys.RegimeEconomiqueKey;
import sn.com.douane.ejb.rc.model.keys.RegimeKey;
import sn.com.douane.ejb.rc.model.keys.RegimeProduitKey;
import sn.com.douane.ejb.rc.model.keys.ReglementExportKey;
import sn.com.douane.ejb.rc.model.keys.ReglementImportKey;
import sn.com.douane.ejb.rc.model.keys.RegroupFonctionsKey;
import sn.com.douane.ejb.rc.model.keys.RegroupPaysKey;
import sn.com.douane.ejb.rc.model.keys.SoumissionCreditaireKey;
import sn.com.douane.ejb.rc.model.keys.TarifsKey;
import sn.com.douane.ejb.rc.model.keys.TauxKey;
import sn.com.douane.ejb.rc.model.keys.Taxation2Key;
import sn.com.douane.ejb.rc.model.keys.TaxesRegDouKey;
import sn.com.douane.ejb.rc.model.keys.TaxesRegimeKey;
import sn.com.douane.ejb.rc.services.IAuthenticator;
import sn.com.douane.ejb.rc.services.IGaindeSessionFacade;
import sn.com.douane.utils.GaindePropertiesReader;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.ListeFonc;
import sn.com.douane.utils.ListeGroupe;
import sn.com.douane.utils.sysEnv;


/**
 * This component is a Business Delegate for the Gainde application. It delegates the client requests to the session facade 
 * bean deployed in the application server.
 *  
 * @author Wadii
 */
public class GaindeBusinessDelegate implements Serializable{	

	private static final long serialVersionUID = -3453535019126389445L;

	private static final Logger log = Logger.getLogger(GaindeBusinessDelegate.class);
	/** The context. */
	private static Context context;		
	
	/** The business delegate. */
	private static GaindeBusinessDelegate businessDelegate = GaindeBusinessDelegate.getBusinessDelegate();
	
	/** The gainde service locator. */
	private static GaindeServiceLocator gaindeServiceLocator;	
	
	/**
	 * Instantiates a new gainde business delegate.
	 */
	private GaindeBusinessDelegate() {
		super();		
	}
	/**
	 * Gets the business delegate.
	 *
	 * @return the business delegate
	 */
	public static synchronized GaindeBusinessDelegate getBusinessDelegate() {
		if (businessDelegate == null) {
			businessDelegate = new GaindeBusinessDelegate();
		} 
		return businessDelegate;
	}
	

	/**
	 * Initializes the initial jndi context to lookup the EJBs.
	 *
	 * @param container the container
	 */
	public static void initContext(String container) throws NamingException {

		Properties p = new Properties();
		// OpenEJB
		if ("openejb".equalsIgnoreCase(container))
		{
			p.put(Context.INITIAL_CONTEXT_FACTORY,
					"org.apache.openejb.client.LocalInitialContextFactory");
			context = new InitialContext(p);
		}
		else
		{
			context = new InitialContext();
		}
	}
	
	/**
	 * Gets the gainde service locator.
	 *
	 * @return the gainde service locator
	 */
	public static synchronized GaindeServiceLocator getGaindeServiceLocator() {
		
		if(gaindeServiceLocator == null){
			
			String container = GaindePropertiesReader.getInstance().getProperty(
					"gainde.container");
			try {
				initContext(container);
			} catch (NamingException e) {
				log.error(e.getMessage(),e);
			}
			
			gaindeServiceLocator = GaindeServiceLocator.getServiceLocator(context,container);
		}
		
		return gaindeServiceLocator;
	}
	
	/**
	 * Gets the context.
	 *
	 * @return the context
	 */
	public Context getContext() {
		return context;
	}	
	
	/**
	 * Gets the ppm value.
	 *
	 * @param codePpm the code ppm
	 * @return the ppm value
	 * @throws FinderException the finder exception
	 * @throws RcEjbException the rc ejb exception
	 */
//	public Ppm getPpmValue(String codePpm) throws FinderException, RcEjbException{		
//		return getFacade().getUtilisateurSB().getPpmValue(codePpm);
//	}
//	
	/**
	 * Recherche utilisateur.
	 *
	 * @param login the login
	 * @return the utilisateur
	 */
	public Utilisateur rechercheUtilisateur(String login){
		long debut = System.currentTimeMillis();
		IAuthenticator authenticatorDao = getFacade().getAuthenticator();
		long fininvoque = System.currentTimeMillis();
		System.out.print("temps invocation autheticator = "+(fininvoque -debut));
		Utilisateur user = authenticatorDao.rechercheUtilisateur(login);
		long fin = System.currentTimeMillis();
		System.out.print("temps recherche user= "+(fin -debut));
		return user;
	}
	
	/**
	 * Rechercher ctrl utilisateur.
	 *
	 * @param login the login
	 * @return the ctrl user
	 * @throws RcEjbException the rc ejb exception
	 * @throws FinderException 
	 */
	public CtrlUser rechercherCtrlUtilisateur(String login) throws RcEjbException, FinderException{
		long debut = System.currentTimeMillis();
		ICtrlUserDao ctrlUserDao = getFacade().getCtrlUserDao();
		long finInvoque = System.currentTimeMillis();
		System.out.print("invocation ctrlUserDao "+(finInvoque-debut));
		List<CtrlUser> listUser = (List<CtrlUser>) ctrlUserDao.rechercherByWhere(" from CtrlUser where abonne='"+login+"'");
		long fin = System.currentTimeMillis();
		System.out.print("recherche ctrlUser = "+(fin-debut));
		if(listUser != null && !listUser.isEmpty()){
			return listUser.get(0);
		}else return null;
	}
	
	/**
	 * Chercher utilisateur by primary key.
	 *
	 * @param key the key
	 * @return the utilisateur
	 * @throws FinderException the finder exception
	 */
	public Utilisateur chercherUtilisateurByPrimaryKey(Object key) throws FinderException {
		return getFacade().getUtilisateurDao().findByPrimaryKey(key);
	}
	
	/**
	 * Inserer utilisateur.
	 *
	 * @param ctrlUser the ctrl user
	 * @throws RcEjbException the rc ejb exception
	 * @throws CreateException 
	 */
	public void insererUtilisateur(CtrlUser ctrlUser)throws RcEjbException, CreateException {
		getFacade().getCtrlUserDao().create(ctrlUser);	
	}
	
	/**
	 * Rechercher by where.
	 *
	 * @param object the object
	 * @param where the where
	 * @return the list
	 */
//	public List<?> rechercherByWhere(Object object,String where){	
//		return (List<?>) getFacade().getAccueilManagerBean().rechercherByWhere(object,where);
//	}
	
	/**
	 * Gets the where ppm creditaire.
	 *
	 * @param codePpm the code ppm
	 * @return the where ppm creditaire
	 */
	public String getWherePpmCreditaire(String codePpm){
		return getFacade().getCreditaireDao().getWherePpmCreditaire(codePpm);
	}
	
	public List<IndicateurRegime> whereRegime(String rccoderegimedouanier, String rctyperegime, String indicateur){
		return getFacade().getIndicateurRegimeDao().whereRegime( rccoderegimedouanier,  rctyperegime, indicateur);
	}
	
	
	/**
	 * Rechercher.
	 *
	 * @param numeroRef the numero ref
	 * @return the object
	 * @throws FinderException the finder exception
	 */
//	public Object rechercher(String numeroRef) throws FinderException {	
//		return getFacade().getAccueilManagerBean().rechercher(numeroRef);
//	}	

	/**
	 * 
	 * @param numRegimePref
	 * @return
	 * @throws FinderException
	 */
	public AmbassadeOrganisme getAmbassadeOrganisme (String numRegimePref) throws FinderException{
		List<AmbassadeOrganisme> listAmbassade = (List<AmbassadeOrganisme>)getFacade().getAmbassadeOrganismeDao().
		rechercherByWhere("from AmbassadeOrganisme where rcNumRegimePref ='"+numRegimePref+"'"); 
		if(listAmbassade != null && !listAmbassade.isEmpty()){
			return listAmbassade.get(0);
		}else{
			return null;
		}
	}
	/**
	 * Gets result of soumission consignation.
	 *
	 * @param codeCreditaire the code creditaire
	 * @param sousmission the sousmission
	 * @return the where soumission consignation
	 */
	public List<SoumissionCreditaire> getWhereSoumissionConsignation(String codeCreditaire,String sousmission){
		return getFacade().getSoumissionCreditaireDao().getWhereSoumissionConsignation(codeCreditaire,sousmission);		
	}
	
	/**
	 * Gets list soummissionCreditaire
	 * @param where
	 * @return
	 */
	public List<SoumissionCreditaire> rechercherByWhereSoumissionCreditaire (String where){
		return (List<SoumissionCreditaire>) getFacade().getSoumissionCreditaireDao().rechercherByWhere(where); 
	}
	
	/**
	 * Insert comp bureau.
	 *
	 * @param compBureau the comp bureau
	 * @throws TwreException the twre exception
	 */
	public void insertCompBureau(CompBureau compBureau) throws TwreException {
		getFacade().getCompBureauDao().insert(compBureau); 
	}
		
	/**
	 * Rechercher by where comp bureau.
	 *
	 * @param compBureau the comp bureau
	 * @param where the where
	 * @return the list
	 * @throws RcEjbException 
	 */
	@SuppressWarnings("unchecked")
	public List<CompBureauDto> rechercherByWhereCompBureau(String where) throws RcEjbException {
		return (List<CompBureauDto>) getFacade().getCompBureauDao().rechercheByWhereCompBureau( where); 
	}

	/**
	 * Rechercher creditaire by where.
	 *
	 * @param where the where
	 * @return the list
	 */
	public List<Creditaire> rechercherCreditaireByWhere(String codePpm) {
		return (List<Creditaire>) getFacade().getCreditaireDao().getCreditairesByCodePpm(codePpm); 
	}
		
	/**
	 * Find by primary key comp bureau.
	 *
	 * @param key the key
	 * @return the comp bureau
	 * @throws FinderException the finder exception
	 */
	public CompBureau findByPrimaryKeyCompBureau (String key) throws FinderException {
		return (CompBureau) getFacade().getCompBureauDao().findByPrimaryKey(key); 
	}
	
	/**
	 * Update comp bureau.
	 *
	 * @param compBureau the comp bureau
	 * @throws TwreException the twre exception
	 * @throws RcEjbException the rc ejb exception
	 */
	public void updateCompBureau (CompBureau compBureau) throws TwreException, RcEjbException {
		getFacade().getCompBureauDao().update(compBureau); 
	}
	
	/**
	 * Find all comp bureau.
	 *
	 * @return the list
	 * @throws FinderException the finder exception
	 */
	public List<CompBureau> findAllCompBureau () throws FinderException {
		return (List<CompBureau>) getFacade().getCompBureauDao().findAll(); 
	}

    /**
     * Ajouter compagnie assistee.
     *
     * @param compagnieAssistee the compagnie assistee
     * @throws CreateException the create exception
     */
    public void ajouterCompagnieAssistee(CompagnieAssistee compagnieAssistee) throws CreateException {
    	getFacade().getCompagnieAssisteeDao().create(compagnieAssistee);   
    }
    
    /**
     * Modifier compagnie assistee.
     *
     * @param compagnieAssistee the compagnie assistee
     * @throws RcEjbException the rc ejb exception
     */
    public void modifierCompagnieAssistee(CompagnieAssistee compagnieAssistee) throws RcEjbException {
    	getFacade().getCompagnieAssisteeDao().merge(compagnieAssistee);   
    }
    
    /**
     * Supprimer compagnie assistee.
     *
     * @param compagnieAssistee the compagnie assistee
     * @throws RemoveException the remove exception
     * @throws RcEjbException the rc ejb exception
     * @throws FinderException the finder exception
     */
    public void supprimerCompagnieAssistee(CompagnieAssistee compagnieAssistee) throws RemoveException, RcEjbException, FinderException {
    	getFacade().getCompagnieAssisteeDao().remove(compagnieAssistee);   
    }
   
	/**
	 * Delete comp bureau.
	 *
	 * @param key the key
	 * @throws TwreException the twre exception
	 * @throws RcEjbException the rc ejb exception
	 */
	public void deleteCompBureau (String key) throws TwreException, RcEjbException {
		getFacade().getCompBureauDao().delete(key); 
	}
	
	/**
	 * Find all ppm.
	 *
	 * @return the list
	 * @throws FinderException the finder exception
	 */
	public List<Ppm> findAllPpm () throws FinderException {
		return (List<Ppm>) getFacade().getPpmDao().findAll(); 
	}
	
	/**
	 * Find all pays.
	 *
	 * @return the list
	 * @throws FinderException the finder exception
	 */
	public List<Pays> findAllPays () throws FinderException {
		return (List<Pays>) getFacade().getPaysDao().findAll(); 
	}

	/**
	 * Gets the list bureau douane.
	 *
	 * @return the list bureau douane
	 * @throws FinderException the finder exception
	 */
	public List<BureauDouane> getListBureauDouane() throws FinderException {
		return (List<BureauDouane>) getFacade().getBureauDouaneDao().getListBureauDouane();
	}
	
	
	/**
	 * Gets the list type navire.
	 *
	 * @return the list type navire
	 * @throws FinderException the finder exception
	 */
	public List<ScoreTypeNavire> getListTypeNavire() throws FinderException {
		return (List<ScoreTypeNavire>) getFacade().getScoreTypeNavireDao().getListTypeNavire();
	}
	
	/**
	 * Gets the list compagnieassistee.
	 *
	 * @return the list compagnieassistee
	 * @throws FinderException the finder exception
	 */
	public List<CompagnieAssistee> getListCompagnieassistee () throws FinderException {
		return (List<CompagnieAssistee>) getFacade().getCompagnieAssisteeDao().getListCompagnieassistee();	
	}
	
	/**
	 * Gets the bur douane type man string.
	 *
	 * @return the bur douane type man string
	 * @throws FinderException the finder exception
	 */
	public String getBurDouaneTypeManString() throws FinderException {
		return getFacade().getBureauDouaneTypeManDao().getBurDouaneTypeManString(); 
	}
	
	/**
	 * Gets the bureau douane string.
	 *
	 * @return the bureau douane string
	 * @throws RcEjbException the rc ejb exception
	 */
	public String getBureauDouaneString() throws RcEjbException {
		return getFacade().getBureauDouaneDao().getBureauDouaneString();
	}
	
	/**
	 * Gets the list type voie destinataire.
	 *
	 * @return the list type voie destinataire
	 * @throws TwreException the twre exception
	 * @throws FinderException the finder exception
	 */
	public List<LabelValue> getListTypeVoieDestinataire () throws TwreException, FinderException {
		return getFacade().getTypeVoieDao().getListTypeVoieDestinataire(); 
	}
	
	/**
	 * Gets the facade.
	 *
	 * @return the facade
	 */
	private IGaindeSessionFacade getFacade() {
		return (IGaindeSessionFacade) GaindeBusinessDelegate.getGaindeServiceLocator().getEjbReference(IGaindeSessionFacade.class, GaindeBusinessDelegate.getBusinessDelegate().getContext());		
	}
		
	/**
	 * Ajouter circuit visite.
	 *
	 * @param circuitVisite the circuit visite
	 * @throws RcEjbException the rc ejb exception
	 */
	public void ajouterCircuitVisite(CircuitVisite circuitVisite) throws RcEjbException{
		getFacade().getCircuitVisteDao().insert(circuitVisite);
	}

	/**
	 * Gets the list type sens voyage.
	 *
	 * @return the list type sens voyage
	 * @throws TwreException the twre exception
	 */
	public List<LabelValue> getListTypeSensVoyage() throws TwreException {
		return getFacade().getScoreSensVoyageDao().getListTypeSensVoyage();
	}

	/**
	 * Gets the list nature cargaison.
	 *
	 * @return the list nature cargaison
	 * @throws TwreException the twre exception
	 */
	public List<LabelValue> getListNatureCargaison() throws TwreException {
		return getFacade().getScoreTypeNatCargDao().getListNatureCargaison();
	}

	/**
	 * Gets the list dest fiscale.
	 *
	 * @return the list dest fiscale
	 * @throws TwreException the twre exception
	 */
	public List<LabelValue> getListDestFiscale() throws TwreException {
		return getFacade().getScoreTypeDestFiscalDao().getListDestFiscale();
	}
	

	/**
	 * Find ppm by primary key.
	 *
	 * @param numListManifCodePPMDest the num list manif code ppm dest
	 * @return the ppm
	 * @throws FinderException the finder exception
	 */
	public Ppm findPPMByPrimaryKey(String numListManifCodePPMDest) throws FinderException {
		return getFacade().getPpmDao().findByPrimaryKey(numListManifCodePPMDest);
	}

	/**
	 * 
	 * @param where
	 * @return
	 */
	public List<Ppm> findPPMByWhere(String where) {
		return (List<Ppm>) getFacade().getPpmDao().rechercherByWhere(where);
	}
	
	 public String getImpExpRegime(String type) throws FinderException {
	    	return getFacade().getTypeRegimeDouaneDao().getImpExpRegime(type);
	    }


	/**
	 * Gets the list soumission doc.
	 *
	 * @return the list soumission doc
	 * @throws FinderException the finder exception
	 */
	public List<SoumissionDoc> getListSoumissionDoc() throws FinderException {
		return getFacade().getSoumissionDocDao().getListSoumissionDoc();
	}

	/**
	 * Gets the list dispense.
	 *
	 * @return the list dispense
	 * @throws FinderException the finder exception
	 */
	public List<Dispense> getListDispense() throws FinderException {
		return getFacade().getDispenseDao().getListDispense();
	}

	/**
	 * Get Pays by primaryKey
	 * @param codePays
	 * @return
	 * @throws FinderException
	 */
	public Pays findPaysByPrimaryKey  (String codePays) throws FinderException {
		return getFacade().getPaysDao().findByPrimaryKey(codePays); 
	}

	public NatApureManif chercherNatApureManifByKey(String manifNatureApurement) throws FinderException {
		return getFacade().getNatApureManifDao().findByPrimaryKey(manifNatureApurement);
	}
	
	public List<TypeApurRegInterdit> rechercheTypeRegimeApureInterdit(String typeApurement, String typeRegime, String codeRegime) throws FinderException {
		 return getFacade().getTypeApureRegInterditDao().rechercheTypeRegimeApureInterdit(typeApurement, typeRegime, codeRegime);
	}

	public List<Rcsite> findAllRcsite() throws FinderException {
		return getFacade().getRcsiteDao().findAll();
	}
	
	public List<AutoCreditaire> rechercherByWhereAutoCreditaire(String ppmDest, String ppmDecl){	
		return (List<AutoCreditaire>) getFacade().getAutoCreditaireDao().getWhereAutorisation(ppmDest, ppmDecl);		
	}
	
	public List<AutoCreditaire> rechercherByWhereAutoCreditaire(String clause){	
		return (List<AutoCreditaire>) getFacade().getAutoCreditaireDao().rechercherByWhere(clause);		
	}

	public BigDecimal getMontantCreditDeclarantDisp(String ppmdeclarant, Double mntCredit) throws RcEjbException {		
		return getFacade().getReferenceCommunSB().controlerCredit(ppmdeclarant, mntCredit);
	}

	public Consignataire findConsignataireByPrimaryKey(String codeConsig) throws FinderException {
		return getFacade().getConsignataireDao().findByPrimaryKey(codeConsig);
	}
	
	public List<Consignataire> getConsignataires (String codePpm) {
		return (List<Consignataire>) getFacade().getConsignataireDao().getConsignataireByCodePpm(codePpm);
	}

	public String getLibelleTarifaire(String decCodeProd,String decPrecuemoa,String decPrecSenegal) throws RcEjbException {		
		return getFacade().getProduitDao().getLibelleTarifProduit(decCodeProd,decPrecuemoa,decPrecSenegal);
	}
	
	public ReglementImport rechercherReglementImport(ReglementImportKey reglementImportKey) throws FinderException {
		return getFacade().getReglementImportDao().findByPrimaryKey(reglementImportKey);	
	}
	public TypeRegimeDouane rechercherTypeRegimeDouane(String typeRegime) throws FinderException {
		return getFacade().getTypeRegimeDouaneDao().findByPrimaryKey(typeRegime);
	}
	public Regime rechercherRegime(String typeregime, String coderegime, String decRegFiscal) throws FinderException {
		return getFacade().getRegimeDao().findByPrimaryKey(new RegimeKey(typeregime, coderegime, decRegFiscal));
	}
	public Produit findByActif(String decCodeProd, String decPrecuemoa, String decPrecSenegal) throws FinderException {
		return getFacade().getProduitDao().findByPrimaryKey(new ProduitKey(decCodeProd, decPrecuemoa, decPrecSenegal));
	}
	
	public Produit rechercherProduit(ProduitKey produitsKey) throws FinderException {
		return getFacade().getProduitDao().findByPrimaryKey(produitsKey);
	}
	
	public List<LabelValue> getListeEtatDossier() throws RcEjbException, FinderException {
		return getFacade().getEtatDossierDao().getListeEtatDossier();
	}
	
	 
	public AgentDouane rechercherAgentDouane(String rcCodeAgent) throws FinderException {
		return getFacade().getAgentDouaneDao().findByPrimaryKey(rcCodeAgent);
    }
	 
	public List<AgentDouane> getAgentDouanes(String codeUser) {
		return (List<AgentDouane>) getFacade().getAgentDouaneDao().getAgentDouaneByCodeUser(codeUser);
    }
	
	public Ppm rechercherPpm(String decCodeDestinataire) throws FinderException {
		return getFacade().getPpmDao().findByPrimaryKey(decCodeDestinataire);
	}

	public ScoreTypeDestFiscal rechercherTypeDestFiscal(Integer integer) throws FinderException {
		
		return getFacade().getScoreTypeDestFiscalDao().findByPrimaryKey(integer);
	}
	public BureauDouane rechercherBureauDouane(String sgmanifbureauenregmanif) throws FinderException {
		
		return getFacade().getBureauDouaneDao().findByPrimaryKey(sgmanifbureauenregmanif);
	}
	public ScoreSensVoy rechercherScoreSensVoy(Integer integer) throws FinderException {
		
		return getFacade().getScoreSensVoyageDao().findByPrimaryKey(integer);
	}
	public ScoreTypeNatCarg rechercherScoreTypeNatCarg(Integer integer) throws FinderException {
		
		return getFacade().getScoreTypeNatCargDao().findByPrimaryKey(integer);
	}
	public ScoreTypeNavire rechercherScoreTypeNavire(Integer integer) throws FinderException {
		
		return getFacade().getScoreTypeNavireDao().findByPrimaryKey(integer);
	}
	public CompagnieAssistee rechercherCompagnieAssistee(Integer integer) throws FinderException {
		
		return getFacade().getCompagnieAssisteeDao().findByPrimaryKey(integer);
	}
	
	/**
	 * Rechercher echeancier reglement by dossier1.
	 *
	 * @param numdossierProv the numdossier prov
	 * @return the list
	 * @throws RcEjbException the rc ejb exception
	 */
	public List<EcheancierReglement> rechercherEcheancierReglementByDossier1(Integer numdossierProv) throws RcEjbException {
		return  getFacade().getEcheancierReglementDao().rechercherByDossier1(numdossierProv);
	}
	
	/**
	 * Find echeancier reglement by primary key.
	 *
	 * @param echeancierReglementKey the echeancier reglement key
	 * @return the echeancier reglement
	 * @throws FinderException the finder exception
	 */
	public EcheancierReglement findEcheancierReglementByPrimaryKey(EcheancierReglementKey echeancierReglementKey) throws FinderException {
		return getFacade().getEcheancierReglementDao().findByPrimaryKey(echeancierReglementKey);
	}
	
	public TypeVoie rechercherTypeVoie(String typevoie) throws FinderException {		
		return getFacade().getTypeVoieDao().findByPrimaryKey(typevoie);
	}
	
	/**
	 * Update echeancier reglement without ctrl.
	 *
	 * @param echeancierReglement the echeancier reglement
	 * @throws RcEjbException the rc ejb exception
	 */
	public void updateEcheancierReglementWithoutCtrl(EcheancierReglement echeancierReglement) throws RcEjbException {
		
		if(echeancierReglement.getTrTvaCredit()==null){
			echeancierReglement.setTrTvaCredit(BigDecimal.ZERO);
		}
		getFacade().getEcheancierReglementDao().merge(echeancierReglement);
		
	}
	
	public EcheancierReglementDto getEcheancierReglementDto(EcheancierReglement vo){		
		return getFacade().getEcheancierReglementDao().getEcheancierReglementDto(vo);
	}
	
	public List<EcheancierReglementDto> getEcheancierReglementDto(List<EcheancierReglement> listEcheancier){		
		return getFacade().getEcheancierReglementDao().getEcheancierReglementDto(listEcheancier);
	}
	
	public int getVerificateurBureauActivite(String codeAgent1,	String bureaupv, String profiliv) throws RcEjbException {
		return getFacade().getAgentDouaneDao().getVerificateurBureauActivite(codeAgent1, bureaupv, profiliv);
	}
	
	public List<LabelValue> getListNatApureManif() throws RcEjbException {
		return getFacade().getNatApureManifDao().getListNatApureManif();
	}
	public List<SectionProduit> rechercherByWhereSectionProduit(String where) {
		
		return (List<SectionProduit>) getFacade().getSectionProduitDao().rechercherByWhere(where);
	}
	
	
public List<Produit> rechercherByWhereProduit(String where) {
		
		return (List<Produit>) getFacade().getProduitDao().rechercherByWhere(where);
	}
public List<ChapitreSection> rechercherByWhereChapitreSection(String where) {
	
	return (List<ChapitreSection>) getFacade().getChapitreSectionDao().rechercherByWhere(where);
}
public List<PositionProduit> rechercherByWherePositionProduit(String where) {
	
	return (List<PositionProduit>) getFacade().getPositionProduitDao().rechercherByWhere(where);
}
public List<Tarif> rechercherByWhereTarif(String whereImp) {
	
	return (List<Tarif>) getFacade().getTarifsDao().rechercherByWhere(whereImp);
}
public List<Taux> rechercherByWhereTaux(String whereTaux) {
	
	return (List<Taux>) getFacade().getTauxDao().rechercherByWhere(whereTaux);
}
public List<ProduitPjt> rechercherByWhereProduitPjt(String wherePjt) {
	
	return (List<ProduitPjt>) getFacade().getProduitPjtDao().rechercherByWhere(wherePjt);
}
public PieceJointe rechercherPiecesJointe(String rccodepiecejointe) throws RcEjbException {
	
	try {
		return getFacade().getPieceJointeDao().findByPrimaryKey(rccodepiecejointe);
	} catch (FinderException e) {
		throw new RcEjbException(ConstErrCod.rowNotFound);
	}
}
public ReglementExport rechercherReglementExport(ReglementExportKey reglementExportKey) throws RcEjbException {
	
	try {
		return getFacade().getReglementExportDao().findByPrimaryKey(reglementExportKey);
	} catch (FinderException e) {
		throw new RcEjbException(ConstErrCod.rowNotFound);
	}
}

	public List<LabelValue> getListeTypeCredit() throws RcEjbException  {
		return getFacade().getTypeCreditDao().getListeTypeCredit(); 
	}
	
	public List<LabelValue> getListAgentdouane() throws FinderException, RcEjbException {
		
		return getFacade().getAgentDouaneDao().getListAgentdouane() ;
	}

	public List<LabelValue> getListTypeUtilisateurs() throws RcEjbException {		
		return getFacade().getTypeUtilisateurDao().getListTypeUtilisateur();
	}
	public void modifierUtilisateur(Utilisateur vo) throws RcEjbException {
		
		getFacade().getUtilisateurDao().update(vo);
		
	}
	

//**************************************************************
public List<?> rechercherListeUtilisateur(String where)  {		
	return (List<?>) getFacade().getCtrlUserDao().rechercherByWhere(where);
}
public void libererSignature(String abonne) throws RcEjbException  {
	
	 try {
		getFacade().getCtrlUserDao().remove(abonne);
	} catch (FinderException e) {
		throw new RcEjbException(e);
	} catch (RemoveException e) {
		throw new RcEjbException(e);
	}	
}

public void libererSignatureAll()  {		
	 getFacade().getCtrlUserDao().deleteAllUser();
}
public void modifierCtrlUser(CtrlUser c) throws RcEjbException {
	 try {
	 getFacade().getCtrlUserDao().merge(c);
	 }catch(EJBException e){
		 throw new RcEjbException(e);
	 }
}
public CtrlUser chercherCtrlUserByPrimaryKey(String key) throws RcEjbException  {
	 try {
		return getFacade().getCtrlUserDao().findByPrimaryKey(key);
	} catch (FinderException e) {
		throw new RcEjbException(e);
	}
}
public void supprimerConsignataire(String key) throws FinderException, RemoveException {
	 getFacade().getConsignataireDao().remove(key);
}
public void modifierConsignataire(Consignataire consignataire){
	 getFacade().getConsignataireDao().merge(consignataire);
}
public void ajouterConsignataire(Consignataire consignataire) throws CreateException{
	 getFacade().getConsignataireDao().create(consignataire);
}
public int ConsVerifierExistencePpm(Consignataire consignataire) throws RcEjbException  {
	 return getFacade().getPpmDao().consVerifierExistencePpm(consignataire);
}
public int ConsVerifierExistenceNinea(Consignataire consignataire) throws RcEjbException  {
	 return getFacade().getPpmDao().consVerifierExistencePpm(consignataire);
}
public int ConsVerifierExistanceCreditaire(Consignataire consignataire) throws RcEjbException  {
	 return getFacade().getCreditaireDao().consVerifierExistanceCreditaire(consignataire);
}
public Creditaire findCreditaireByPrimaryKey(String num) throws FinderException {
	return getFacade().getCreditaireDao().findByPrimaryKey(num);
}
public void supprimerCreditaire(String key) throws FinderException, RemoveException {
	 getFacade().getCreditaireDao().remove(key);
}
public void modifierCreditaire(Creditaire creditaire){
	 getFacade().getCreditaireDao().merge(creditaire);
}
public int VerifierExistenceNinea(Creditaire creditaire) throws RcEjbException  {
	 return getFacade().getPpmDao().verifierExistenceNinea(creditaire);
}
public int VerifierExistenceCreditaire(Creditaire creditaire) throws RcEjbException  {
	 return getFacade().getPpmDao().verifierExistanceCreditaire(creditaire);
}
public void ajouterCreditaire(Creditaire creditaire) throws CreateException{
	 getFacade().getCreditaireDao().create(creditaire);
}

public String getLibelleCircuit(String codecircuit) throws RcEjbException{	
	return getFacade().getCircuitVisteDao().getLibelleCircuit(codecircuit);
}
public void ajouterPpm(Ppm ppm) throws CreateException{
	 getFacade().getPpmDao().create(ppm);
}
public void modifierPpm(Ppm ppm){
	 getFacade().getPpmDao().merge(ppm);
}
public void supprimerPpm(String key) throws FinderException, RemoveException {
	 getFacade().getPpmDao().remove(key);
}
public void supprimerAgree(String key) throws FinderException, RemoveException {
	 getFacade().getAgreeDao().remove(key);
}
public Agree findAgreeByPrimaryKey(String num) throws FinderException {
	return getFacade().getAgreeDao().findByPrimaryKey(num);
}
public void modifierAgree(Agree agree){
	 getFacade().getAgreeDao().merge(agree);
}
public void ajouterAgree(Agree agree) throws CreateException{
	 getFacade().getAgreeDao().create(agree);
}
public int AgreeVerifierExistencePpm(Agree agree) throws RcEjbException  {
	 return getFacade().getPpmDao().agreeVerifierExistencePpm(agree);
}
public int AgreeVerifierExistenceNinea(Agree agree) throws RcEjbException  {
	 return getFacade().getPpmDao().agreeVerifierExistenceNinea(agree);
}
public int AgreeVerifierExistanceCreditaire(Agree agree) throws RcEjbException  {
	 return getFacade().getCreditaireDao().agreeVerifierExistanceCreditaire(agree);
}
public AmbassadeOrganisme findAmbassadeOrganismeByPrimaryKey(String num) throws FinderException {
	return getFacade().getAmbassadeOrganismeDao().findByPrimaryKey(num);
}
public void supprimerAmbassadeOrganisme(String key) throws FinderException, RemoveException {
	 getFacade().getAmbassadeOrganismeDao().remove(key);
}
public void modifierAmbassadeOrganisme(AmbassadeOrganisme ambassadeOrganisme){
	 getFacade().getAmbassadeOrganismeDao().merge(ambassadeOrganisme);
}
public int AmbVerifierExistencePpm(AmbassadeOrganisme ambassadeOrganisme) throws RcEjbException  {
	 return getFacade().getPpmDao().ambVerifierExistencePpm(ambassadeOrganisme);
}
public int AmbVerifierExistenceNinea(AmbassadeOrganisme ambassadeOrganisme) throws RcEjbException  {
	 return getFacade().getPpmDao().ambVerifierExistenceNinea(ambassadeOrganisme);
}
public void ajouterAmbassadeOrganisme(AmbassadeOrganisme ambassadeOrganisme) throws CreateException{
	 getFacade().getAmbassadeOrganismeDao().create(ambassadeOrganisme);
}
public ImportExport findImportExportByPrimaryKey(String num) throws FinderException {
	return getFacade().getImportExportDao().findByPrimaryKey(num);
}
public void supprimerImportExport(String key) throws FinderException, RemoveException {
	 getFacade().getImportExportDao().remove(key);
}
public void modifierImportExport(ImportExport importExport){
	 getFacade().getImportExportDao().merge(importExport);
}
public int ImpVerifierExistencePpm(ImportExport importExport) throws RcEjbException  {
	 return getFacade().getPpmDao().impVerifierExistencePpm(importExport);
}
public int ImpVerifierExistenceNinea(ImportExport importExport) throws RcEjbException  {
	 return getFacade().getPpmDao().impVerifierExistenceNinea(importExport);
}
public void ajouterImportExport(ImportExport importExport) throws CreateException{
	 getFacade().getImportExportDao().create(importExport);
}

public List<RegimeEconomique> rechercherByWhereRegimeEconomique(String where) {
	 return (List<RegimeEconomique>) getFacade().getRegimeEconomiqueDao().rechercherByWhere(where);
}

public List<RegEcoProdFini> rechercherByWhereRegEcoProdFini(String where) {
	 return (List<RegEcoProdFini>) getFacade().getRegEcoProdFiniDao().rechercherByWhere(where);
}
public List<ReprodFiniBur> rechercherByWhereReprodFiniBur(String where) {
	 return (List<ReprodFiniBur>) getFacade().getReprodFiniBurDao().rechercherByWhere(where);
}
public void supprimerRegimeEconomique(String rcanneeregeco,String rcnumregeco) throws FinderException, RemoveException {
	 getFacade().getRegimeEconomiqueDao().remove(new RegimeEconomiqueKey(rcanneeregeco, rcnumregeco));
}
public void modifierRegimeEconomique(RegimeEconomique regimeEconomique) throws RcEjbException {
	getFacade().getRegimeEconomiqueDao().merge(regimeEconomique);   
}
public void ajouterRegimeEconomique(RegimeEconomique regimeEconomique) throws CreateException {
	getFacade().getRegimeEconomiqueDao().create(regimeEconomique);   
}
public List<Pays> rechercherByWherePays(String where) {
	 return (List<Pays>) getFacade().getPaysDao().rechercherByWhere(where);
}

public List<Taxe> rechercherByWherePaysTaxe(String where) {
	 return (List<Taxe>) getFacade().getTaxeDao().rechercherByWhere(where);
}


public void ajouterTaux(Taux taux) throws CreateException{
	 getFacade().getTauxDao().create(taux);
}
public void modifierTaux(Taux taux){
	 getFacade().getTauxDao().merge(taux);
}
public void supprimerTaux(String rccodetaux,String rccodetaxe,Date rcdatevaleur) throws FinderException, RemoveException {
	 getFacade().getTauxDao().remove(new TauxKey(rccodetaux,rccodetaxe,rcdatevaleur));
}
public Taux findTauxByPrimaryKey(String rccodetaux,String rccodetaxe,Date rcdatevaleur) throws FinderException {
	return getFacade().getTauxDao().findByPrimaryKey(new TauxKey(rccodetaux,rccodetaxe,rcdatevaleur));
}
public List<TauxDto> rechercherTaux(String whereTaux) throws RcEjbException {
	return (List<TauxDto>) getFacade().getTauxDao().rechercheByWhere(whereTaux);
}
public List<Taux> findAllTaux () throws FinderException{
	return (List<Taux>) getFacade().getTauxDao().findAll(); 
}


public List<Produit> findAllProduit() throws FinderException {
	
	return getFacade().getProduitDao().findAll();
}
public List<BureauDouane> findAllBureau() throws FinderException {
	
	return getFacade().getBureauDouaneDao().findAll();
}
public List<Regime> findAllRegime() throws FinderException {
	
	return getFacade().getRegimeDao().findAll();
}

public List<CreditaireDto> rechercherCreditaire(String where) throws RcEjbException {
	return (List<CreditaireDto>) getFacade().getCreditaireDao().rechercheByWhereCreditaire(where);
}
public List<CompagnieassisteeDto> rechercherCompagnieAssistee(String where) throws RcEjbException {
	return (List<CompagnieassisteeDto>) getFacade().getCompagnieAssisteeDao().rechercheByWhereCompagnieAssistee(where);
}
public List<ConsignataireDto> rechercherConsignataire(String where) throws RcEjbException {
	return (List<ConsignataireDto>) getFacade().getConsignataireDao().rechercheByWhereConsignataire(where);
}
public List<AgreeDto> rechercherAgree(String where) throws RcEjbException {
	return (List<AgreeDto>) getFacade().getAgreeDao().rechercheByWhereAgree(where);
}
public List<AmbassadeOrganismeDto> rechercherAmbassadeOrganisme(String where) throws RcEjbException {
	return (List<AmbassadeOrganismeDto>) getFacade().getAmbassadeOrganismeDao().rechercheByWhereAmbassadeOrganisme(where);
}
public List<Agree> findAllAgree () throws FinderException{
	return (List<Agree>) getFacade().getAgreeDao().findAll(); 
}
public List<String> rechercherAgreeCodePpm(String code) throws FinderException  {
	return (List<String>) getFacade().getAgreeDao().rechercherByWhere("select rcCodePpm from Agree where rcCodePpm LIKE '%"+code+"%'");
}
public List<UtilisateurDto> rechercherUtilisateur(String where) throws RcEjbException{
	return (List<UtilisateurDto>) getFacade().getUtilisateurDao().rechercheByWhereUtilisateur(where);
}
public List<ImportExportDto> rechercherImportExport(String where) throws RcEjbException {
	return (List<ImportExportDto>) getFacade().getImportExportDao().rechercheByWhereImportExport(where);
}
public List<Produit> getListProduitsPetroliers() throws RcEjbException{
	return (List<Produit>) getFacade().getProduitDao().getListProduitsPetroliers();
}
public List<Taxation2> getTaxtaionStructure(Date dsql) throws RcEjbException{
	return (List<Taxation2>) getFacade().getTaxation2Dao().getTaxtaionStructure(dsql);
}
public Taxation2 findTaxation2ByProdAndDate(Date dtesql, String codeproduit,
		String precu, String precsen) throws RcEjbException {
	return getFacade().getTaxation2Dao().findTaxation2(dtesql, codeproduit, precu, precsen);
}
public void saveOrUpdateTaxation(Taxation2 taxation) throws RcEjbException{
	getFacade().getTaxation2Dao().merge(taxation);
}
public Taxation2 findTaxation2ByKey(Taxation2Key taxationkey) throws RcEjbException {
	try{
		return getFacade().getTaxation2Dao().findByPrimaryKey(taxationkey);
	}catch(Exception e){
		throw new RcEjbException(e);
	}
}
public void deleteTaxation2(Taxation2Key taxationkey) throws RcEjbException{
	try{
		getFacade().getTaxation2Dao().remove(taxationkey);
	}catch(Exception e){
		throw new RcEjbException(e);
	}
}
public boolean ajouterAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws CreateException, RcEjbException{
	return getFacade().getAgrementEntrepriseDao().createAgrementEntreprise(agrementEntreprise);
}
public boolean modifierAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws RcEjbException{
	return getFacade().getAgrementEntrepriseDao().updateAgrementEntreprise(agrementEntreprise);
}
public List<AgrementEntrepriseDto> rechercherAgrementEntreprise(String where) throws RcEjbException {
	return (List<AgrementEntrepriseDto>) getFacade().getAgrementEntrepriseDao().rechercherByWhereAgrementEntreprise(where);
}
public boolean supprimerAgrementEntreprise(String rcagrent,String rcrgrpays,String rccodpays) throws RcEjbException{
	return getFacade().getAgrementEntrepriseDao().removeAgrementEntreprise(rcagrent,rcrgrpays,rccodpays);
}
public List<Regroupement> rechercherRegroupement(String where) {
	return (List<Regroupement>) getFacade().getRegroupementDao().rechercherByWhere(where);
}
public List<AgrementEntreprise> rechercherbyWhereAgrementEntreprise(String where) throws RcEjbException {
	return (List<AgrementEntreprise>) getFacade().getAgrementEntrepriseDao().rechercherByWhere(where);
}
public List<AgrementRgrpProdDto> rechercherAgrementRgrpProd(String where) throws RcEjbException {
	return (List<AgrementRgrpProdDto>) getFacade().getAgrementRgrpProdDao().rechercherByWhereAgrementRgrpProd(where);
}
	
	/**
	 * Gets the list of {@link CompBureau}.
	 * 
	 * @return list of {@link CompBureau}.
	 * @throws RcEjbException
	 *             thrown if error occurred in DAO layer.
	 */
	public List<CompBureau> getListCompBureau() throws RcEjbException{
		try {
			return getFacade().getCompBureauDao()
					.getListCompBureau();
		} catch (FinderException e) {
			throw new RcEjbException(e);
		}
	}
	
	/**
	 * Gets the list of {@link GenreBureau}.
	 * 
	 * @return list of {@link GenreBureau}.
	 * @throws RcEjbException
	 *             thrown if error occurred in DAO layer.
	 */
	public List<GenreBureau> getListGenreBureau() throws RcEjbException {
		try {
			return getFacade().getGenreBureauDao()
					.getListGenreBureau();
		} catch (FinderException e) {
			throw new RcEjbException(e);
		}
	}
	public AgrementRgrpProd findAgrementRgrpProdByPrimaryKey(String rcCodePays,String rcNumEntreprise,String rcCodeProd,String rcPrecUemoaProd,String rcPrecSenProd,String rcCodeImpExp,String rcCodeRegroupement) throws FinderException {
		return getFacade().getAgrementRgrpProdDao().findByPrimaryKey(new AgrementRgrpProdKey(rcCodePays, rcNumEntreprise, rcCodeProd, rcPrecUemoaProd, rcPrecSenProd, rcCodeImpExp, rcCodeRegroupement));
	}
	public void ajouterAgrementRgrpProd(AgrementRgrpProd agrementRgrpProd) throws CreateException{
		 getFacade().getAgrementRgrpProdDao().create(agrementRgrpProd);
	}
	public Produit findProduitByPrimaryKey(String rccodeprod,String rcprecuemoa,String rcprecsenegal) throws FinderException {
		return getFacade().getProduitDao().findByPrimaryKey(new ProduitKey(rccodeprod, rcprecuemoa, rcprecsenegal));
	}
	public void modifierAgrementRgrpProd(AgrementRgrpProd agrementRgrpProd){
		 getFacade().getAgrementRgrpProdDao().merge(agrementRgrpProd);
	}
	public void supprimerAgrementRgrpProd(String rcCodePays,String rcNumEntreprise,String rcCodeProd,String rcPrecUemoaProd,String rcPrecSenProd,String rcCodeImpExp,String rcCodeRegroupement) throws FinderException, RemoveException {
		 getFacade().getAgrementRgrpProdDao().remove(new AgrementRgrpProdKey(rcCodePays, rcNumEntreprise, rcCodeProd, rcPrecUemoaProd, rcPrecSenProd, rcCodeImpExp, rcCodeRegroupement));
	}
	/**
	 * Gets the list of {@link BureauDouane} corresponding to the search criteria.
	 * 
	 * @return list of {@link BureauDouane}.
	 * @throws RcEjbException
	 *             thrown if error occurred in DAO layer.
	 */
	@SuppressWarnings("unchecked")
	public List<BureauDouane> rechercherBureauByWhereWithLibelle(
			String condition) throws RcEjbException {
		return (List<BureauDouane>) getFacade().getBureauDouaneDao().rechercherByWhere(condition);
	}
	
	/**
	 * The method {@link #ajouterBureauDouane(BureauDouane)} saves a BureauDouane to the database.
	 * 
	 * @param bureauDouane
	 *            bureau douane to save in the database.
	 * @throws CreateException
	 *             Thrown if an exception occurs when trying to save the entity to the data base.
	 */
	public void ajouterBureauDouane(BureauDouane bureauDouane)throws CreateException{
		getFacade().createBureauDouane(bureauDouane);
	}
	
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
	public void modifierBureauDouane(BureauDouane bureauDouane) throws RcEjbException{
		getFacade().modifierBureauDouane(bureauDouane);
	}
	
	/**
	 * The method {@link #deleteBureauDouane(String)} deletes the BureauDouane
	 * having primary key received as parameter from the database.
	 * 
	 * @param pk
	 *            primary key of {@link BureauDouane} entity.
	 * @throws RcEjbException
	 *             Thrown if an exception occurs when trying to delete the
	 *             entity from the data base.
	 */
	public void deleteBureauDouane(String pk) throws RcEjbException{
		try{
			getFacade().getBureauDouaneDao().remove(pk);
		}catch (Exception e) {
			throw new RcEjbException(e);
		}
	}
	public void ajouterFonctionnalite(Fonctionnalite fonctionnalite) throws CreateException{
		 getFacade().getFonctionnalitesDao().create(fonctionnalite);
	}
	public void modifierFonctionnalite(Fonctionnalite fonctionnalite){
		 getFacade().getFonctionnalitesDao().merge(fonctionnalite);
	}
	public List<FonctionnaliteDto> rechercherFonctionnalite(String where) throws RcEjbException {
		return (List<FonctionnaliteDto>) getFacade().getFonctionnalitesDao().rechercheByWhereFonctionnalite(where);
	}
	public void supprimerFonctionnalite(String key) throws RcEjbException {
		 getFacade().getFonctionnalitesDao().delete(key);
	}
	public Fonctionnalite findFonctionnaliteByPrimaryKey(String num) throws FinderException {
		return getFacade().getFonctionnalitesDao().findByPrimaryKey(num);
	}
	public List<GroupefonctionDto> rechercherGroupefonction(String where) throws RcEjbException {
		return (List<GroupefonctionDto>) getFacade().getGroupefonctionDao().rechercheByWhereGroupefonction(where);
	}
	public void supprimerGroupefonction(Integer key) throws RcEjbException {
		 getFacade().getGroupefonctionDao().delete(key);
	}
	public void modifierGroupeFonction(GroupeFonction groupeFonction) throws RcEjbException{
		 getFacade().getGroupefonctionDao().update(groupeFonction);
	}
	public void supprimerRegroupFonctions(String rcCodeFonction, Integer rcCodeGroupe) throws RcEjbException {
		 getFacade().getRegroupFonctionsDao().delete(new RegroupFonctionsKey(rcCodeFonction, rcCodeGroupe));
	}
	public void ajouterRegroupFonctions(RegroupFonctions regroupFonctions) throws RcEjbException {
		 getFacade().getRegroupFonctionsDao().insert(regroupFonctions);
	}
	public List<RegroupFonctions> rechercherByCodeGroupe(Integer code) throws RcEjbException {
		return (List<RegroupFonctions>) getFacade().getRegroupFonctionsDao().findByCodegroupeQuery(code);
	}
	public void ajouterGroupeFonction(GroupeFonction groupeFonction) throws RcEjbException {
		 getFacade().getGroupefonctionDao().insert(groupeFonction);
	}
	public GroupeFonction findGroupeFonctionByPrimaryKey(Integer key) throws FinderException {
		return getFacade().getGroupefonctionDao().findByPrimaryKey(key);
	}
//	public GroupeFonction rechercherByPere(Integer keyPere) throws RcEjbException {
//		return (GroupeFonction) getFacade().getGroupefonctionDao().rechercherByCodeGroupePereInOrder(keyPere);
//	}
	public ListeFonc getListeFonctionnalites(String code) throws Exception {
		return  getFacade().getFonctionnalitesDao().getListeFonctionnalites(code);
	}
	public FonctionnaliteDto getFonctionnaliteDto(Fonctionnalite vo) throws Exception {
		return  getFacade().getFonctionnalitesDao().getFonctionnaliteDto(vo);
	}
	public GroupefonctionDto getGroupefonctionDto(GroupeFonction vo) throws Exception {
		return  getFacade().getGroupefonctionDao().getGroupefonctionDto(vo);
	}
	public ListeGroupe getListeGroupe(String codegroupe) throws Exception {
		return  getFacade().getGroupefonctionDao().getListeGroupe(codegroupe);
	}
	public List<ProfilDto> rechercherByWhereProfil(String where) throws RcEjbException {
		return (List<ProfilDto>) getFacade().getProfilDao().rechercheByWhereProfil(where);
	}
	public Profil findProfilByPrimaryKey(String num) throws FinderException {
		return getFacade().getProfilDao().findByPrimaryKey(num);
	}
	public void supprimerProfil(String key) throws RcEjbException {
		 getFacade().getProfilDao().delete(key);
	}
	public void supprimerProfilGroupe(Integer rcCodeGroupe, String rcCodeProfil) throws RcEjbException{
		 getFacade().getProfilGroupeDao().delete(new ProfilGroupeKey(rcCodeGroupe, rcCodeProfil));
	}
	public void ajouterProfilGroupe(ProfilGroupe profilGroupe) throws RcEjbException {
		 getFacade().getProfilGroupeDao().insert(profilGroupe);
	}
	public void modifierProfil(Profil profil) throws RcEjbException{
		 getFacade().getProfilDao().update(profil);
	}
	public List<ProfilGroupe> rechercherByCodeProfil(String code) throws RcEjbException {
		return (List<ProfilGroupe>) getFacade().getProfilGroupeDao().findProfilGroupeQuery(code);
	}
	public void ajouterProfil(Profil profil) throws RcEjbException {
		 getFacade().getProfilDao().insert(profil);
	}
    public void ajouterSoumissionCreditaire(SoumissionCreditaire soumissionCreditaire) throws RcEjbException{
	 getFacade().getSoumissionCreditaireDao().insert(soumissionCreditaire);
    }	
    public void modifierSoumissionCreditaire(SoumissionCreditaire soumissionCreditaire) throws RcEjbException{
	 getFacade().getSoumissionCreditaireDao().update(soumissionCreditaire);
     }
     public void supprimerSoumissionCreditaire(String rcCodeIndicateur, String rcCodeCreditaire) throws RcEjbException {
	 getFacade().getSoumissionCreditaireDao().delete(new SoumissionCreditaireKey(rcCodeIndicateur, rcCodeCreditaire));
     }
     public SoumissionCreditaire findSoumissionCreditaireByPrimaryKey(String rcCodeIndicateur, String rcCodeCreditaire) throws FinderException {
	     return getFacade().getSoumissionCreditaireDao().findByPrimaryKey(new SoumissionCreditaireKey(rcCodeIndicateur, rcCodeCreditaire));
     }
 	public List<SoumissionCreditaireDto> rechercherSoumissionCreditaire (String where) throws RcEjbException{
	    return (List<SoumissionCreditaireDto>) getFacade().getSoumissionCreditaireDao().rechercheByWhereSoumissionCreditaire(where);
	}
    public void supprimerUtilisateur(String key) throws RcEjbException {
	   getFacade().getUtilisateurDao().delete(key);
    }
    public void ajouterUtilisateur(Utilisateur utilisateur) throws RcEjbException {
	   getFacade().getUtilisateurDao().insert(utilisateur);
    }
    public Ppm recherchePPM(String codeppm) throws FinderException {
	     try {
			return getFacade().getPpmDao().findByPrimaryKey(codeppm);
		} catch (FinderException e) {
			throw new FinderException(ConstErrCodRC.ppmNotFound);
		}
    }
	public AgentDouane rechercheAgentDouane(String rcCodeAgent) throws FinderException {
		try {
			return getFacade().getAgentDouaneDao().findByPrimaryKey(rcCodeAgent);
		} catch (FinderException e) {
			throw new FinderException(ConstErrCodRC.agentNotFound);
		}
    }
	public void ajouterBureauDouaneTypeManifeste(BureauDouaneTypeManifeste bureauDouaneTypeManifeste) throws CreateException{
		 getFacade().getBureauDouaneTypeManDao().create(bureauDouaneTypeManifeste);
	}
	public void modifierBureauDouaneTypeManifeste(BureauDouaneTypeManifeste bureauDouaneTypeManifeste){
		 getFacade().getBureauDouaneTypeManDao().merge(bureauDouaneTypeManifeste);
	}
	public void supprimerBureauDouaneTypeManifeste(String rccodeburdouane, Integer rccodetypemanif) throws FinderException, RemoveException {
		 getFacade().getBureauDouaneTypeManDao().remove(new BurDouaneTypeManPK(rccodeburdouane, rccodetypemanif));
	}
	public BureauDouaneTypeManifeste findBureauDouaneTypeManifesteByPrimaryKey(String rccodeburdouane, Integer rccodetypemanif) throws FinderException {
		return getFacade().getBureauDouaneTypeManDao().findByPrimaryKey(new BurDouaneTypeManPK(rccodeburdouane, rccodetypemanif));
	}
	public List<BureauDouaneTypeManifesteDto> rechercherBureauDouaneTypeManifeste(String where) throws RcEjbException {
		return (List<BureauDouaneTypeManifesteDto>) getFacade().getBureauDouaneTypeManDao().rechercheByWhereBureauDouaneTypeManifeste(where);
	}
	public void ajouterBasesTaxable(BasesTaxable basesTaxable) throws CreateException{
		 getFacade().getBasesTaxableDao().create(basesTaxable);
	}
	public void modifierBasesTaxable(BasesTaxable basesTaxable){
		 getFacade().getBasesTaxableDao().merge(basesTaxable);
	}
	public List<BasesTaxableDto> rechercherBasesTaxable(String where) throws RcEjbException {
		return (List<BasesTaxableDto>) getFacade().getBasesTaxableDao().rechercheByWhereBasesTaxable(where);
	}
	public void supprimerBasesTaxable(String rccodetaxe, String rccodetaxebase) throws FinderException, RemoveException {
		 getFacade().getBasesTaxableDao().remove(new BasesTaxableKey(rccodetaxe, rccodetaxebase));
	}
	public BasesTaxable findBasesTaxableByPrimaryKey(String rccodetaxe, String rccodetaxebase) throws FinderException {
		return getFacade().getBasesTaxableDao().findByPrimaryKey(new BasesTaxableKey(rccodetaxe, rccodetaxebase));
	}
	
	public List<EcheancierReglement> rechercherByDossier1(Integer numdossierProv) throws RcEjbException{
		return getFacade().getEcheancierReglementDao().rechercherByDossier1(numdossierProv);
	}
	
	public void ajouterBureauUemoa(BureauUemoa bureauUemoa) throws CreateException{
		 getFacade().getBureauUemoaDao().create(bureauUemoa);
	}
	
	public void modifierBureauUemoa(BureauUemoa bureauUemoa){
		 getFacade().getBureauUemoaDao().merge(bureauUemoa);
	}
	
	public void supprimerBureauUemoa(String key) throws FinderException, RemoveException {
		 getFacade().getBureauUemoaDao().remove(key);
	}
	public BureauUemoa findBureauUemoaByPrimaryKey(String num) throws FinderException {
		return getFacade().getBureauUemoaDao().findByPrimaryKey(num);
	}
	public List<BureauUemoaDto> rechercherBureauUemoa(String where) throws RcEjbException {
		return (List<BureauUemoaDto>) getFacade().getBureauUemoaDao().rechercheByWhereBureauUemoa(where);
	}
	public void ajouterBurModDecl(BurModDecl burModDecl) throws CreateException{
		 getFacade().getBurModDeclDao().create(burModDecl);
	}
	public void modifierBurModDecl(BurModDecl burModDecl){
		 getFacade().getBurModDeclDao().merge(burModDecl);
	}
	public List<BurModDeclDto> rechercherBurModDecl(String where) throws RcEjbException {
		return (List<BurModDeclDto>) getFacade().getBurModDeclDao().rechercheByWhereBurModDecl(where);
	}
	public void supprimerBurModDecl(BurModDeclKey key) throws FinderException, RemoveException {
		 getFacade().getBurModDeclDao().remove(key);
	}
	public BurModDecl findBurModDeclByPrimaryKey(BurModDeclKey key) throws FinderException {
		return getFacade().getBurModDeclDao().findByPrimaryKey(key);
	}
	
	public List getListeDelegations(String where) throws RcEjbException {
		return getFacade().getDelegationDao().rechercherByWhere(where);
	}
	public String getFonctionnalitesString() throws RcEjbException{
		return getFacade().getFonctionnalitesDao().getFonctionnaliteString();
	}
	
	public String getRegroupFoncString() throws RcEjbException, FinderException {
		return getFacade().getRegroupFonctionsDao().getRegroupFoncString();
	}
	
	public List getListeGroupefonctionDelegations(String codeprofil) throws TwreException, RcEjbException {
		return getFacade().getGroupefonctionDao().getListeGroupefonctionDelegations(codeprofil);
	}
	
	public List rechercherByWhereDelegation(String where) throws TwreException, RcEjbException {
		return getFacade().getDelegationDao().rechercherByWhere(where);
	}
	
	public void supprimerDelegation(DelegationKey key) throws RcEjbException {
		 getFacade().getDelegationDao().delete(key);
	}
	
	public Delegation findDelegation(DelegationKey key) throws FinderException {
		return getFacade().getDelegationDao().findByPrimaryKey(key);
	}
	
	public void ajouterDelegation(Delegation delegation) throws CreateException {
		 getFacade().getDelegationDao().create(delegation);
	}
	
	public List rechercheByWhereRegimeDeclarant(String codePpm) throws RcEjbException {
		return getFacade().getRegimeDeclarantDao().getRegimeDeclarantByCodePpm(codePpm);
	}
	public void ajouterProduit(Produit produit) throws CreateException{
		 getFacade().getProduitDao().create(produit);
	}
	public void modifierProduit(Produit produit){
		 getFacade().getProduitDao().merge(produit);
	}
	public void supprimerProduit(ProduitKey key) throws FinderException, RemoveException {
		 getFacade().getProduitDao().remove(key);
	}
	public List<ProduitDto> rechercherByWhereProduits(String where) throws RcEjbException {
		return (List<ProduitDto>) getFacade().getProduitDao().rechercheByWhereProduits(where);
	}
	
	public void ajouterPiecesJointes(PieceJointe piecesjointesvo) throws CreateException {
		 getFacade().getPieceJointeDao().create(piecesjointesvo);
		
	}
	public void modifierPiecesJointes(PieceJointe piecesjointesvo) {
		 getFacade().getPieceJointeDao().merge(piecesjointesvo);
	}
	public void supprimerPiecesJointes(PieceJointe piecesjointesVO) throws FinderException, RemoveException {
		 getFacade().getPieceJointeDao().remove(piecesjointesVO);
	}

	public List<PieceJointe>  rechercherByWherePieceJointe(String string) {
		
		return (List<PieceJointe>) getFacade().getPieceJointeDao().rechercherByWhere(string);
	}
	
	public void ajouterClasse(Classe classe) throws CreateException{
		 getFacade().getClasseDao().create(classe);
	}
	
	public void modifierClasse(Classe classe){
		 getFacade().getClasseDao().merge(classe);
	}
	
	public List<ClasseDto> rechercherClasse(String where) throws RcEjbException {
		return (List<ClasseDto>) getFacade().getClasseDao().rechercheByWhereClasse(where);
	}
	
	public void supprimerClasse(Integer key) throws FinderException, RemoveException {
		 getFacade().getClasseDao().remove(key);
	}
	
	public Classe findClasseByPrimaryKey(Integer key) throws FinderException {
		return getFacade().getClasseDao().findByPrimaryKey(key);
	}
	

	public void ajouterDispense(Dispense dispense) throws CreateException{
		 getFacade().getDispenseDao().create(dispense);
	}
	
	public void modifierDispense(Dispense dispense){
		 getFacade().getDispenseDao().merge(dispense);
	}
	
	public List<DispenseDto> rechercherDispense(String where) throws RcEjbException {
		return (List<DispenseDto>) getFacade().getDispenseDao().rechercheByWhereDispense(where);
	}
	
	public void supprimerDispense(String key) throws FinderException, RemoveException {
		 getFacade().getDispenseDao().remove(key);
	}
	
	public Dispense findDispenseByPrimaryKey(String num) throws FinderException {
		return getFacade().getDispenseDao().findByPrimaryKey(num);
	}
	
	public void ajouterDispensePieceJointe(DispensePieceJointe dispensePieceJointe) throws CreateException{
		 getFacade().getDispensePieceJointeDao().create(dispensePieceJointe);
	}
	
	public void modifierDispensePieceJointe(DispensePieceJointe dispensePieceJointe){
		 getFacade().getDispensePieceJointeDao().merge(dispensePieceJointe);
	}
	
	public List<DispensePieceJointeDto> rechercherDispensePieceJointe(String where) throws RcEjbException {
		return (List<DispensePieceJointeDto>) getFacade().getDispensePieceJointeDao().rechercheByWhereDispensePieceJointe(where);
	}
	
	public void supprimerDispensePieceJointe(DispensePieceJointeKey key) throws FinderException, RemoveException {
		 getFacade().getDispensePieceJointeDao().remove(key);
	}
	
	public DispensePieceJointe findDispensePieceJointeByPrimaryKey(DispensePieceJointeKey key) throws FinderException {
		return getFacade().getDispensePieceJointeDao().findByPrimaryKey(key);
	}
	
	public List<Dispense> getListDispenses() throws FinderException {
		return getFacade().getDispenseDao().findAll();
	}
	
	public List<CatreGroupDto> rechercherCatreGroup(String where) throws RcEjbException {
		return (List<CatreGroupDto>) getFacade().getCatreGroupDao().rechercheByWhereCatreGroup(where);
	}
	
	public CatreGroup findCatreGroupByPrimaryKey(String key) throws FinderException {
		return getFacade().getCatreGroupDao().findByPrimaryKey(key);
	}
	
	public Devises findDevisesByPrimaryKey(String key) throws FinderException {
		return getFacade().getDevisesDao().findByPrimaryKey(key);
	}
	
	public List<DevisesDto> rechercherDevises(String where) throws RcEjbException {
		return (List<DevisesDto>) getFacade().getDevisesDao().rechercheByWhereDevises(where);
	}
	
	public List<RegimeDto> rechercherRegime(String where) throws RcEjbException {
		return (List<RegimeDto>) getFacade().getRegimeDao().rechercheByWhereRegime(where);
	}
	

	public void ajouterPays(Pays pays) throws CreateException{
		 getFacade().getPaysDao().create(pays);
	}
	
	public void modifierPays(Pays pays){
		 getFacade().getPaysDao().merge(pays);
	}
	
	public List<PaysDto> rechercherPays(String where) throws RcEjbException {
		return (List<PaysDto>) getFacade().getPaysDao().rechercheByWherePays(where);
	}
	
	public void supprimerPays(String key) throws FinderException, RemoveException {
		 getFacade().getPaysDao().remove(key);
	}
	
	public List<LabelValue> getListCircuitVisite() throws RcEjbException {
		return getFacade().getCircuitVisteDao().getListCircuitVisite();
	}
	
	
	public List<Regime> rechercheRegimeApurant(String where) {
		return getFacade().getRegapuregapureDao().rechercheRegimeApurant(where);
	}

	
	public List<LabelValue> getListTypeIndicateur() throws RcEjbException {
		return getFacade().getTypeIndicateurDao().getListTypeIndicateur();
	}
	
	public void ajouterIndicateurRegdou(IndicateurRegdou indicateurRegdou) throws CreateException{
		 getFacade().getIndicateurRegdouDao().create(indicateurRegdou);
	}
	
	public void modifierIndicateurRegdou(IndicateurRegdou indicateurRegdou){
		 getFacade().getIndicateurRegdouDao().merge(indicateurRegdou);
	}
	
	public List<IndicateurRegdouDto> rechercherIndicateurRegdou(String where) throws RcEjbException {
		return (List<IndicateurRegdouDto>) getFacade().getIndicateurRegdouDao().rechercheByWhereIndicateurRegdou(where);
	}
	
	public void supprimerIndicateurRegdou(IndicateurRegdouKey key) throws FinderException, RemoveException {
		 getFacade().getIndicateurRegdouDao().remove(key);
	}
	
	public IndicateurRegdou findIndicateurRegdouByPrimaryKey(IndicateurRegdouKey key) throws FinderException {
		return getFacade().getIndicateurRegdouDao().findByPrimaryKey(key);
	}


	public void ajouterProduitPjt(ProduitPjt produitPjt) throws CreateException{
		 getFacade().getProduitPjtDao().create(produitPjt);
	}
	
	public void modifierProduitPjt(ProduitPjt produitPjt){
		 getFacade().getProduitPjtDao().merge(produitPjt);
	}
	
	public List<ProduitPjtDto> rechercherProduitPjt(String where) throws RcEjbException {
		return (List<ProduitPjtDto>) getFacade().getProduitPjtDao().rechercheByWhereProduitPjt(where);
	}
	
	public void supprimerProduitPjt(ProduitPjtKey key) throws FinderException, RemoveException {
		 getFacade().getProduitPjtDao().remove(key);
	}
	
	public ProduitPjt findProduitPjtByPrimaryKey(ProduitPjtKey key) throws FinderException {
		return getFacade().getProduitPjtDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegapuregapure(Regapuregapure regapuregapure) throws CreateException{
		 getFacade().getRegapuregapureDao().create(regapuregapure);
	}
	
	public void modifierRegapuregapure(Regapuregapure regapuregapure){
		 getFacade().getRegapuregapureDao().merge(regapuregapure);
	}
	
	public List<RegapuregapureDto> rechercherRegapuregapure(String where) throws RcEjbException {
		return (List<RegapuregapureDto>) getFacade().getRegapuregapureDao().rechercheByWhereRegapuregapure(where);
	}
	
	public void supprimerRegapuregapure(RegapuregapureKey key) throws FinderException, RemoveException {
		 getFacade().getRegapuregapureDao().remove(key);
	}
	
	public Regapuregapure findRegapuregapureByPrimaryKey(RegapuregapureKey key) throws FinderException {
		return getFacade().getRegapuregapureDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegDouModeDecl(RegDouModeDecl regDouModeDecl) throws CreateException{
		 getFacade().getRegDouModeDeclDao().create(regDouModeDecl);
	}
	
	public void modifierRegDouModeDecl(RegDouModeDecl regDouModeDecl){
		 getFacade().getRegDouModeDeclDao().merge(regDouModeDecl);
	}
	
	public List<RegDouModeDeclDto> rechercherRegDouModeDecl(String where) throws RcEjbException {
		return (List<RegDouModeDeclDto>) getFacade().getRegDouModeDeclDao().rechercheByWhereRegDouModeDecl(where);
	}
	
	public void supprimerRegDouModeDecl(RegdouModeDeclKey key) throws FinderException, RemoveException {
		 getFacade().getRegDouModeDeclDao().remove(key);
	}
	
	public RegDouModeDecl findRegDouModeDeclByPrimaryKey(RegdouModeDeclKey key) throws FinderException {
		return getFacade().getRegDouModeDeclDao().findByPrimaryKey(key);
	}
	
	public void supprimerDevises(String pk) throws FinderException, RemoveException  {
		getFacade().getDevisesDao().remove(pk);
	}
	
	public void ajouterRcDevises(Devises devisesvo) throws CreateException {
		  getFacade().getDevisesDao().create(devisesvo);
		}
		
	public void modifierDevises(Devises devisesvo) {
			getFacade().getDevisesDao().merge(devisesvo);
		}
	
	public void ajouterRegimeDestinataire(RegimeDestinataire regimeDestinataire) throws CreateException{
		 getFacade().getRegimeDestinataireDao().create(regimeDestinataire);
	}
	
	public void modifierRegimeDestinataire(RegimeDestinataire regimeDestinataire){
		 getFacade().getRegimeDestinataireDao().merge(regimeDestinataire);
	}
	
	public List<RegimeDestinataireDto> rechercherRegimeDestinataire(String where) throws RcEjbException {
		return (List<RegimeDestinataireDto>) getFacade().getRegimeDestinataireDao().rechercheByWhereRegimeDestinataire(where);
	}
	
	public void supprimerRegimeDestinataire(RegimeDestinataireKey key) throws FinderException, RemoveException {
		 getFacade().getRegimeDestinataireDao().remove(key);
	}
	
	public RegimeDestinataire findRegimeDestinataireByPrimaryKey(RegimeDestinataireKey key) throws FinderException {
		return getFacade().getRegimeDestinataireDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegimeDouanier(RegimeDouanier regimeDouanier) throws CreateException{
		 getFacade().getRegimeDouanierDao().create(regimeDouanier);
	}
	
	public void modifierRegimeDouanier(RegimeDouanier regimeDouanier){
		 getFacade().getRegimeDouanierDao().merge(regimeDouanier);
	}
	
	public List<RegimeDouanierDto> rechercherRegimeDouanier(String where) throws RcEjbException {
		return (List<RegimeDouanierDto>) getFacade().getRegimeDouanierDao().rechercheByWhereRegimeDouanier(where);
	}
	
	public void supprimerRegimeDouanier(RegimeDouanierKey key) throws FinderException, RemoveException {
		 getFacade().getRegimeDouanierDao().remove(key);
	}
	
	public RegimeDouanier findRegimeDouanierByPrimaryKey(RegimeDouanierKey key) throws FinderException {
		return getFacade().getRegimeDouanierDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegimeFiscal(RegimeFiscal regimeFiscal) throws CreateException{
		 getFacade().getRegimeFiscalDao().create(regimeFiscal);
	}
	
	public void modifierRegimeFiscal(RegimeFiscal regimeFiscal){
		 getFacade().getRegimeFiscalDao().merge(regimeFiscal);
	}
	
	public List<RegimeFiscalDto> rechercherRegimeFiscal(String where) throws RcEjbException {
		return (List<RegimeFiscalDto>) getFacade().getRegimeFiscalDao().rechercheByWhereRegimeFiscal(where);
	}
	
	public void supprimerRegimeFiscal(String key) throws FinderException, RemoveException {
		 getFacade().getRegimeFiscalDao().remove(key);
	}
	
	public RegimeFiscal findRegimeFiscalByPrimaryKey(String key) throws FinderException {
		return getFacade().getRegimeFiscalDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegroupement(Regroupement regroupement) throws CreateException{
		 getFacade().getRegroupementDao().create(regroupement);
	}
	
	public void modifierRegroupement(Regroupement regroupement){
		 getFacade().getRegroupementDao().merge(regroupement);
	}
	
	public List<RegroupementDto> rechercherByWhereRegroupement(String where) throws RcEjbException {
		return (List<RegroupementDto>) getFacade().getRegroupementDao().rechercheByWhereRegroupement(where);
	}
	
	public void supprimerRegroupement(String key) throws FinderException, RemoveException {
		 getFacade().getRegroupementDao().remove(key);
	}
	
	public Regroupement findRegroupementByPrimaryKey(String key) throws FinderException {
		return getFacade().getRegroupementDao().findByPrimaryKey(key);
	}
	
	public void ajouterTypeRegimeDouane(TypeRegimeDouane typeRegimeDouane) throws CreateException{
		 getFacade().getTypeRegimeDouaneDao().create(typeRegimeDouane);
	}
	
	public void modifierTypeRegimeDouane(TypeRegimeDouane typeRegimeDouane){
		 getFacade().getTypeRegimeDouaneDao().merge(typeRegimeDouane);
	}
	
	public List<TypeRegimeDouaneDto> rechercherByWhereTypeRegimeDouane(String where) throws RcEjbException {
		return (List<TypeRegimeDouaneDto>) getFacade().getTypeRegimeDouaneDao().rechercheByWhereTypeRegimeDouane(where);
	}
	
	public void supprimerTypeRegimeDouane(String key) throws FinderException, RemoveException {
		 getFacade().getTypeRegimeDouaneDao().remove(key);
	}
	
	public TypeRegimeDouane findTypeRegimeDouaneByPrimaryKey(String key) throws FinderException {
		return getFacade().getTypeRegimeDouaneDao().findByPrimaryKey(key);
	}
	
	public void ajouterTaxesRegime(TaxesRegime taxesRegime) throws CreateException{
		 getFacade().getTaxesRegimeDao().create(taxesRegime);
	}
	
	public void modifierTaxesRegime(TaxesRegime taxesRegime){
		 getFacade().getTaxesRegimeDao().merge(taxesRegime);
	}
	
	public List<TaxesRegimeDto> rechercherTaxesRegime(String where) throws RcEjbException {
		return (List<TaxesRegimeDto>) getFacade().getTaxesRegimeDao().rechercheByWhereTaxesRegime(where);
	}
	
	public void supprimerTaxesRegime(TaxesRegimeKey key) throws FinderException, RemoveException {
		 getFacade().getTaxesRegimeDao().remove(key);
	}
	
	public TaxesRegime findTaxesRegimeByPrimaryKey(TaxesRegimeKey key) throws FinderException {
		return getFacade().getTaxesRegimeDao().findByPrimaryKey(key);
	}
	
	public void ajouterTaxesRegDou(TaxesRegDou taxesRegDou) throws CreateException{
		 getFacade().getTaxesRegDouDao().create(taxesRegDou);
	}
	
	public void modifierTaxesRegDou(TaxesRegDou taxesRegDou){
		 getFacade().getTaxesRegDouDao().merge(taxesRegDou);
	}
	
	public List<TaxesRegDouDto> rechercherTaxesRegDou(String where) throws RcEjbException {
		return (List<TaxesRegDouDto>) getFacade().getTaxesRegDouDao().rechercheByWhereTaxesRegDou(where);
	}
	
	public void supprimerTaxesRegDou(TaxesRegDouKey key) throws FinderException, RemoveException {
		 getFacade().getTaxesRegDouDao().remove(key);
	}
	
	public TaxesRegDou findTaxesRegDouByPrimaryKey(TaxesRegDouKey key) throws FinderException {
		return getFacade().getTaxesRegDouDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegroupPays(RegroupPays regroupPays) throws CreateException{
		 getFacade().getRegroupPaysDao().create(regroupPays);
	}
	
	public void modifierRegroupPays(RegroupPays regroupPays){
		 getFacade().getRegroupPaysDao().merge(regroupPays);
	}
	
	public List<RegroupPaysDto> rechercherRegroupPays(String where) throws RcEjbException {
		return (List<RegroupPaysDto>) getFacade().getRegroupPaysDao().rechercheByWhereRegroupPays(where);
	}
	
	public void supprimerRegroupPays(RegroupPaysKey key) throws FinderException, RemoveException {
		 getFacade().getRegroupPaysDao().remove(key);
	}
	
	public RegroupPays findAgreeByPrimaryKey(RegroupPaysKey key) throws FinderException {
		return getFacade().getRegroupPaysDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegimeBurInterdit(RegimeBurInterdit regimeBurInterdit) throws CreateException{
		 getFacade().getRegimeBurInterditDao().create(regimeBurInterdit);
	}
	
	public void modifierRegimeBurInterdit(RegimeBurInterdit regimeBurInterdit){
		 getFacade().getRegimeBurInterditDao().merge(regimeBurInterdit);
	}
	
	public List<RegimeBurInterditDto> rechercherRegimeBurInterdit(String where) throws RcEjbException {
		return (List<RegimeBurInterditDto>) getFacade().getRegimeBurInterditDao().rechercheByWhereRegimeBurInterdit(where);
	}
	
	public void supprimerRegimeBurInterdit(RegimeBurInterditKey key) throws FinderException, RemoveException {
		 getFacade().getRegimeBurInterditDao().remove(key);
	}
	
	public RegimeBurInterdit findRegimeBurInterditByPrimaryKey(RegimeBurInterditKey key) throws FinderException {
		return getFacade().getRegimeBurInterditDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegime(Regime regime) throws CreateException{
		 getFacade().getRegimeDao().create(regime);
	}
	
	public void modifierRegime(Regime regime){
		 getFacade().getRegimeDao().merge(regime);
	}
	
	public void supprimerRegime(String typeregime,String coderegime,String decRegFiscal) throws FinderException, RemoveException {
		 getFacade().getRegimeDao().remove(new RegimeKey(typeregime, coderegime, decRegFiscal));
	}
	
	public void ajouterRegimeDeclarant(RegimeDeclarant regimeDeclarant) throws CreateException{
		 getFacade().getRegimeDeclarantDao().create(regimeDeclarant);
	}
	
	public void modifierRegimeDeclarant(RegimeDeclarant regimeDeclarant){
		 getFacade().getRegimeDeclarantDao().merge(regimeDeclarant);
	}
	
	public List<RegimeDeclarantDto> rechercherRegimeDeclarant(String where) throws RcEjbException {
		return (List<RegimeDeclarantDto>) getFacade().getRegimeDeclarantDao().rechercheByWhereRegimeDeclarant(where);
	}
	
	public void supprimerRegimeDeclarant(RegimeDeclarantKey key) throws FinderException, RemoveException {
		 getFacade().getRegimeDeclarantDao().remove(key);
	}
	
	public RegimeDeclarant findRegimeDeclarantByPrimaryKey(RegimeDeclarantKey key) throws FinderException {
		return getFacade().getRegimeDeclarantDao().findByPrimaryKey(key);
	}
	
	public void ajouterSoumissionDoc(SoumissionDoc soumissionDoc) throws CreateException{
		 getFacade().getSoumissionDocDao().create(soumissionDoc);
	}
	
	public void modifierSoumissionDoc(SoumissionDoc soumissionDoc){
		 getFacade().getSoumissionDocDao().merge(soumissionDoc);
	}
	
	public List<SoumissionDocDto> rechercherSoumissionDoc(String where) throws RcEjbException {
		return (List<SoumissionDocDto>) getFacade().getSoumissionDocDao().rechercheByWhereSoumissionDoc(where);
	}
	
	public void supprimerSoumissionDoc(String key) throws FinderException, RemoveException {
		 getFacade().getSoumissionDocDao().remove(key);
	}
	
	public SoumissionDoc findSoumissionDocByPrimaryKey(String key) throws FinderException {
		return getFacade().getSoumissionDocDao().findByPrimaryKey(key);
	}
	
	public void modifierCircuitVisite(CircuitVisite circuitvisitevo) {
		getFacade().getCircuitVisteDao().merge(circuitvisitevo);
		
	}
	public List rechercherByWhereCircuitVisite(String where) throws RcEjbException {
		return getFacade().getCircuitVisteDao().rechercheByWhereCircuitVisite(where);
		 
	}
	public void supprimerCircuitVisite(String pk) throws FinderException, RemoveException {
		getFacade().getCircuitVisteDao().remove(pk);
	}
	public CircuitVisite rechercherCircuitVisite(String pk) throws FinderException {
		return getFacade().getCircuitVisteDao().findByPrimaryKey(pk);
	}
	
	
	public Langue rechercherLangueByPrimaryKey(String pk) throws FinderException {
		return getFacade().getLangueDao().findByPrimaryKey(pk);
	}

	public void supprimerLangue(String pk) throws FinderException, RemoveException {
		getFacade().getLangueDao().remove(pk);
	}

	public List rechercherLangue() throws FinderException {
		return (List<Langue>) getFacade().getLangueDao().findAll();
	}
	
	public void modifierLangue(Langue languevo) throws RcEjbException {
		getFacade().getLangueDao().merge(languevo);
	
	}
	
	public void ajouterRcLangue(Langue languevo) throws CreateException  {
		  getFacade().getLangueDao().create(languevo);
	}
	
	public List rechercherLangueByWhere(String condition) throws RcEjbException {
		return getFacade().getLangueDao().rechercherByWhereLangue(condition);
	}
	
	public GenreBureau rechercherGenreBureauByPrimaryKey(String pk) throws FinderException {
		return getFacade().getGenreBureauDao().findByPrimaryKey(pk);
	}
	
	public List rechercherGenreBureau() throws FinderException {
		return (List<GenreBureau>) getFacade().getGenreBureauDao().findAll(); 
	}

	public List rechercherGenreBureauByWhere(String condition) throws RcEjbException {
		return getFacade().getGenreBureauDao().rechercherByWhereGenreBureau(condition);
	}
	
	public void modifierGenreBureau(GenreBureau genrebureauvo) throws RcEjbException {
		getFacade().getGenreBureauDao().merge(genrebureauvo);
	}
	
	public void ajouterRcGenreBureau(GenreBureau genreBureauvo) throws CreateException  {
		  getFacade().getGenreBureauDao().create(genreBureauvo);
		
	}
	
	public void supprimerGenreBureau(String pk) throws FinderException, RemoveException {
		getFacade().getGenreBureauDao().remove(pk);
	}
	
	
	public Ppm rechercherPpmByWhere(String where) {
		List<Ppm> listPpm = (List<Ppm>)getFacade().getPpmDao().rechercherByWhere(where);
		if(listPpm != null && !listPpm.isEmpty()){
			return listPpm.get(0);
		}else{
			return null;
		}
	}
	
	public void ajouterTaxe(Taxe taxe) throws CreateException{
		 getFacade().getTaxeDao().create(taxe);
	}
	
	public void modifierTaxe(Taxe taxe){
		 getFacade().getTaxeDao().merge(taxe);
	}
	
	public List<TaxeDto> rechercherTaxe(String where) throws RcEjbException {
		return (List<TaxeDto>) getFacade().getTaxeDao().rechercheByWhereTaxe(where);
	}
	
	public void supprimerTaxe(String key) throws FinderException, RemoveException {
		 getFacade().getTaxeDao().remove(key);
	}
	
	public Taxe findTaxeByPrimaryKey(String num) throws FinderException {
		return getFacade().getTaxeDao().findByPrimaryKey(num);
	}

	
	public void ajouterIndicateurRegime(IndicateurRegime indicateurRegime) throws CreateException{
		 getFacade().getIndicateurRegimeDao().create(indicateurRegime);
	}
	
	public void modifierIndicateurRegime(IndicateurRegime indicateurRegime){
		 getFacade().getIndicateurRegimeDao().merge(indicateurRegime);
	}
	
	public List<IndicateurRegimeDto> rechercherIndicateurRegime(String where) throws RcEjbException {
		return (List<IndicateurRegimeDto>) getFacade().getIndicateurRegimeDao().rechercheByWhereIndicateurRegime(where);
	}
	
	public void supprimerIndicateurRegime(IndicateurRegimeKey key) throws FinderException, RemoveException {
		 getFacade().getIndicateurRegimeDao().remove(key);
	}
	
	public IndicateurRegime findIndicateurRegimeByPrimaryKey(IndicateurRegimeKey key) throws FinderException {
		return getFacade().getIndicateurRegimeDao().findByPrimaryKey(key);
	}
	
	public void ajouterRegimeProduit(RegimeProduit regimeProduit) throws CreateException{
		 getFacade().getRegimeProduitDao().create(regimeProduit);
	}
	
	public void modifierRegimeProduit(RegimeProduit regimeProduit){
		 getFacade().getRegimeProduitDao().merge(regimeProduit);
	}
	
	public List<RegimeProduitDto> rechercherRegimeProduit(String where) throws RcEjbException {
		return (List<RegimeProduitDto>) getFacade().getRegimeProduitDao().rechercheByWhereRegimeProduit(where);
	}
	
	public void supprimerRegimeProduit(RegimeProduitKey key) throws FinderException, RemoveException {
		 getFacade().getRegimeProduitDao().remove(key);
	}
	
	public RegimeProduit findRegimeProduitByPrimaryKey(RegimeProduitKey key) throws FinderException {
		return getFacade().getRegimeProduitDao().findByPrimaryKey(key);
	}
	
	public void ajouterReglementImport(ReglementImport reglementImport) throws CreateException{
		 getFacade().getReglementImportDao().create(reglementImport);
	}
	
	public void ajouterReglementExport(ReglementExport reglementExport) throws CreateException{
		 getFacade().getReglementExportDao().create(reglementExport);
	}
	
	public void ajouterTarif(Tarif tarif) throws CreateException{
		 getFacade().getTarifsDao().create(tarif);
	}
	
	public void modifierTarif(Tarif tarif){
		 getFacade().getTarifsDao().merge(tarif);
	}
	
	public void modifierReglementImport(ReglementImport reglementImport) throws CreateException{
		 getFacade().getReglementImportDao().merge(reglementImport);
	}
	
	public void modifierReglementExport(ReglementExport reglementExport) throws CreateException{
		 getFacade().getReglementExportDao().merge(reglementExport);
	}
	
	
	public Tarif findTarifByPrimaryKey(TarifsKey key) throws FinderException {
		return getFacade().getTarifsDao().findByPrimaryKey(key);
	}
	
	public List<ReglementImport> rechercherReglementImport(String where) {
		return (List<ReglementImport>) getFacade().getReglementImportDao().rechercherByWhere(where);	
	}
	
	public List<ReglementExport> rechercherReglementExport(String where) {
		return (List<ReglementExport>) getFacade().getReglementExportDao().rechercherByWhere(where);	
	}
	
	public List<TarifDto> rechercherTarif(String where) throws RcEjbException {
		return (List<TarifDto>) getFacade().getTarifsDao().rechercheByWhereTarif(where);	
	}
	
	public List<RegimeEconomiqueDto> rechercherByWhereRegimeEconomiqueDto(String where) throws RcEjbException {
		 return (List<RegimeEconomiqueDto>) getFacade().getRegimeEconomiqueDao().rechercheByWhereRegimeEconomique(where);
	}
	public List<?> F9Recherche(String pks, String where, String tableName,
			List vFieldTyp, String field) throws RcEjbException {

		return getFacade().getF9Dao().f9Recherche(pks, where, tableName,
				vFieldTyp, field);
	}
}
