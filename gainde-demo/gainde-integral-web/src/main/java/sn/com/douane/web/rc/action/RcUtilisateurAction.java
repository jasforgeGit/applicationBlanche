package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.acegisecurity.providers.encoding.ShaPasswordEncoder;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.ConstRC;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcUtilisateurForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import tn.com.tw.java.exception.TwreException;
import sn.com.douane.utils.ConstManif;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;


public class RcUtilisateurAction extends GeneralDispatchAction implements ScopedModelDriven<RcUtilisateurForm> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1927007489226950505L;
	private RcUtilisateurForm rcUtilisateurForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	private transient final Log log = LogFactory.getLog(getClass());
    /** ************************************ */
    /** * ENREGISTREMENT ** */
    /** ************************************ */
    public String enregistrerRcUtilisateur() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String forward = null;
        String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcUtilisateur"
                : request.getParameter(ConstManif.PAGE));
        ShaPasswordEncoder encoder = new ShaPasswordEncoder();        
        
        try {
        	Utilisateur utilisateurvo = rcUtilisateurForm.getNewRcUtilisateurVO();

            //On contr�le que le code utilisateur correspond au type
            String code = utilisateurvo.getRcCodUser().substring(0, 1);
            if (!code.equals(utilisateurvo.getRcTypeUser())) {
                throw new TwreException(ConstErrCodRC.profilNotMatch);
            }

            //On contr�le sur le type utilisateur CONS ou TRAN
            if (utilisateurvo.getRcTypeUser().equals(ConstRC.typeUserCons)
                    || utilisateurvo.getRcTypeUser().equals(
                            ConstRC.typeUserDecl)) {
                String codeppm = utilisateurvo.getRcCodUser().substring(1, 6);
                gaindeBusinessDelegate.recherchePPM(codeppm);
            }

            //On contr�le sur le type utilisateur DOUA
            if (utilisateurvo.getRcTypeUser().equals(ConstRC.typeUserDoua)) {
                String codeagent = utilisateurvo.getRcCodUser().substring(1, 5);
                gaindeBusinessDelegate.rechercheAgentDouane(codeagent);
            }
            //Encodage du mot de passe            
            utilisateurvo.setRcMotPasse(encoder.encodePassword(utilisateurvo.getRcMotPasse().trim(),null));
            gaindeBusinessDelegate.ajouterUtilisateur(utilisateurvo);
            addActionError(getText(ConstErrCodRC.succefulInsert));
            rcUtilisateurForm.reset();
            forward = page;

        } catch (Exception e) {
        	addActionError(getText(e.getMessage()));
            forward = "saisieRcUtilisateur";
        } 
        return forward;
    }

    /** ************************************ */
    /** * MODIFICATION ** */
    /** ************************************ */
    public String modifierRcUtilisateur() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String forward = null;
        String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcUtilisateur"
                : request.getParameter(ConstManif.PAGE));

        ShaPasswordEncoder encoder = new ShaPasswordEncoder();
        try {
        	Utilisateur utilisateurvo = rcUtilisateurForm.getNewRcUtilisateurVO();
            //Encodage du mot de passe
            utilisateurvo.setRcMotPasse(encoder.encodePassword(utilisateurvo.getRcMotPasse().trim(),null));
            gaindeBusinessDelegate.modifierUtilisateur(utilisateurvo);
            addActionError(getText(ConstErrCodRC.succefulUpdate));
            forward = page;

        } catch (Exception e) {
        	addActionError(getText(e.getMessage()));
            forward = "modificationRcUtilisateur";
        } 
        return forward;
    }

    /** ************************************ */
    /** * RECHERCHE ** */
    /** ************************************ */
    public String rechercherRcUtilisateur() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();

        String pageResult = request.getParameter("pageContext");
        String condition = " ";
        String ctxmenu = (String) request.getSession().getAttribute(
        		sn.com.douane.utils.ConstManif.CTXMENU);

        String rccodeprofil = (rcUtilisateurForm.getNumListRcCodeProfilRech() == null ? ""
                : rcUtilisateurForm.getNumListRcCodeProfilRech());
        String rccoduser = (rcUtilisateurForm.getNumRcCodUserRech() == null ? ""
                : rcUtilisateurForm.getNumRcCodUserRech());
        String rcidentification = (rcUtilisateurForm
                .getNumRcIdentificationRech() == null ? "" : rcUtilisateurForm
                .getNumRcIdentificationRech());
        String rctypeuser = (rcUtilisateurForm.getNumListRcTypeUserRech() == null ? ""
                : rcUtilisateurForm.getNumListRcTypeUserRech());

        //Condition de recherche
        if (!rccodeprofil.equals("")){
            condition += " and rcCodeProfil LIKE '%" + rccodeprofil + "%' ";
        }
        if (!rccoduser.equals("")){
            condition += " and rcCodUser LIKE '%" + rccoduser + "%' ";
        }
        if (!rcidentification.equals("")){
            condition += " and rcIdentification LIKE '%" + rcidentification
                    + "%' ";
        }
        if (!rctypeuser.equals("")){
            condition += " and rcTypeUser = '" + rctypeuser + "' ";
        }
        try {

            List<UtilisateurDto> listeRcUtilisateur = gaindeBusinessDelegate.rechercherUtilisateur("from Utilisateur where 1=1"+condition);
             // pour la pagination du grid 
         			if (listeRcUtilisateur!=null) {
         				rcUtilisateurForm.setRecords(listeRcUtilisateur.size()); 
         				rcUtilisateurForm.setTotal(
         						(int) Math.ceil((double)rcUtilisateurForm.getRecords() 
         								/ (double)rcUtilisateurForm.getRows())); 
         				int to = (rcUtilisateurForm.getRows() * rcUtilisateurForm.getPage());
         			    int from = to - rcUtilisateurForm.getRows();
         			    if (to > rcUtilisateurForm.getRecords()) {
         			    	to = rcUtilisateurForm.getRecords();
         			    }
         			   listeRcUtilisateur = listeRcUtilisateur.subList(from, to);
         			  rcUtilisateurForm.setListeRcUtilisateur(listeRcUtilisateur);
        			}
           

            if (listeRcUtilisateur!=null && listeRcUtilisateur.size() != 0){

                if (!ctxmenu.equals("C")){
                    request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
                }
            } else {

                if (ctxmenu.equals("SM")) {
                	pageResult = "saisieRcUtilisateur";

                    request.getSession().setAttribute(ConstManif.CTXMENU, "S");

                    if (!rccodeprofil.equals("")){
                    	rcUtilisateurForm
                                .setNumListRcCodeProfilOB(rccodeprofil);
                    }
                    if (!rccoduser.equals("")){
                    	rcUtilisateurForm.setNumRcCodUserOB(rccoduser);
                    }
                    if (!rcidentification.equals("")){
                    	rcUtilisateurForm
                                .setNumRcIdentificationOB(rcidentification);
                    }
                    if (!rctypeuser.equals("")){
                    	rcUtilisateurForm.setNumListRcTypeUserOB(rctypeuser);
                    }
                } else if (ctxmenu.equals("S")) {
                    request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
                } else {
                    addActionError(getText(ConstErrCodRC.rcRowNotFound));
                }

                if (!ctxmenu.equals("C")){
                	rcUtilisateurForm.resetChampsRecherche();
                }
            }
        } catch (Exception e) {
           log.error(e.getMessage(), e);
        } 

		if (pageResult==null){
			return SUCCESS; 
		} else {
			return pageResult;
		}
    }

    /** ************************************ */
    /** * SUPPRESSION ** */
    /** ************************************ */
    public String supprimerRcUtilisateur() throws Exception {
      
    	HttpServletRequest request = ServletActionContext.getRequest();
        String pk = request.getParameter(ConstManif.PK);
        String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcUtilisateur"
                : request.getParameter(ConstManif.PAGE));
        try {
            gaindeBusinessDelegate.supprimerUtilisateur(pk);
            List<UtilisateurDto> listeRcUtilisateur = gaindeBusinessDelegate.rechercherUtilisateur("from Utilisateur ");
            rcUtilisateurForm.setListeRcUtilisateur(listeRcUtilisateur);
            addActionError(getText(ConstErrCodRC.succefulDelete));

        } catch (Exception e) {
            if (e.getMessage() != null
                    && e.getMessage().equals(ConstErrCodRC.ejbExp)){
            	addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
            } else {
            	addActionError(getText(e.getMessage()));
            }
        } 
        return page;
    }

    /** ************************************ */
    /** * AFFICHAGE ** */
    /** ************************************ */
    public String afficherRcUtilisateur() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String page = (request.getParameter("pageContext") == null ? "rechercheRcUtilisateur"
                : request.getParameter("pageContext"));
        String pk = request.getParameter(ConstManif.PK);
        Utilisateur utilisateurvo =  gaindeBusinessDelegate.chercherUtilisateurByPrimaryKey(pk);
        rcUtilisateurForm.setUtilisateur(utilisateurvo);
        return page;

    }

    /** ************************************ */
    /** * INITIALISATION ** */
    /** ************************************ */
    public String unspecified() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String page = request.getParameter(ConstManif.PAGE);
		if (page==null){
			page = request.getParameter("pageContext");
		}
        try {
        	rcUtilisateurForm.reset();
        	rcUtilisateurForm.setListeRcUtilisateur(new ArrayList());

        } catch (Exception e) {
        	addActionError(getText(e.getMessage()));
        } 
        return page;
    }

    /**
     * Renvoie 0 si ok, 1 si nouveau mot != mot confirm� 2 si ancien mot erron�
     */
//    private int motPasseOk(RcUtilisateurForm fb, boolean saisie) {
//
//        int ok = 0;
//        if (saisie) {
//            //saisie d'un nouvel utilisateur
//            if (!fb.getTNUM_RCMOTPASSEOB().equals(
//                    fb.getTNUM_RCMOTPASSEBISOB()))
//                ok = 1;
//        } else {
//            if (fb.getTNUM_RCMOTPASSEOLD() != null
//                    && !fb.getTNUM_RCMOTPASSEOLD().trim().equals(""))
//            //modification du mot de passe
//            {
//                if (!fb.getTNUM_RCMOTPASSEOLD().equals(
//                        fb.getTNUM_RCMOTPASSE_BD()))
//                    ok = 2;
//                else if (!fb.getTNUM_RCMOTPASSE().equals(
//                        fb.getTNUM_RCMOTPASSEBIS()))
//                    ok = 1;
//            }
//        }
//        return ok;
//    }
//    
//    /** ************************************ */
//    /** * METTRE A JOUR LES MOTS DE PASSE DES UTILISATEURS ** */
//    /** ************************************ */
//    public ActionForward majUsersPassword(ActionMapping mapping,
//            ActionForm form, HttpServletRequest request,
//            HttpServletResponse response) throws Exception {
//
//        ActionErrors errors = new ActionErrors();
//        ActionForward forward = new ActionForward(); // return value
//
//        //La classe des commandes
//        ReferencesCommunsCmd referencesCommunsCmd = new ReferencesCommunsCmd();
//
//        //Le Form Bean
//        RcUtilisateurForm rcutilisateurfb = (RcUtilisateurForm) form;
//
//        //Le VO
//        UtilisateurVO utilisateurvo = new UtilisateurVO();
//
//        //On r�cup�re la cl� primaire
//       // String pk = rcutilisateurfb.getPk();
//        //La page de forward
//        String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcUtilisateur"
//                : request.getParameter(ConstManif.PAGE));
//        
//        // Classe d'encodage du mot de passe
//        ShaPasswordEncoder encoder = new ShaPasswordEncoder();
//        
//        // On d�clare le vecteur utilisateur
//        Vector Uservect = new Vector();
//        
//        try {
//           
//            //On remplit les attributs du VO
//            //utilisateurvo = rcutilisateurfb.getNewRcUtilisateurVO();
//
//            //On cr�� la cl�
//           // UtilisateurKey utilisateurkey = createUtilisateurKey(pk);
//        	
//            System.out.println("majUsersPassword ");
//        	// On recup�re la liste des utilisateurs
//        	Uservect = referencesCommunsCmd.rechercherByWhere(utilisateurvo,"");
//        	//if(sysEnv.differenceFrom2Date(sysEnv.ToDayTimeStamp(),ConstManif.DATEMAJPWD))
//        	//Session.getMessageProperties("DateMiseAjourPwd",
//              //      request.getLocale());
//        	for(int i=0;i<Uservect.size();i++){
//        		
//        		utilisateurvo = (UtilisateurVO)Uservect.get(i);
//        		UtilisateurKey utilisateurkey = createUtilisateurKey(utilisateurvo.getRccoduser());
//        		utilisateurvo.setRcmotpasse(encoder.encodePassword(utilisateurvo.getRcmotpasse().toUpperCase(),null));
//        		referencesCommunsCmd.modifier(utilisateurvo,utilisateurkey);
//        		
//        	}
//           
//
//            errors.add("name", new ActionError(ConstErrCodRC.succefulUpdate));
//            //On forward si succes
//            forward = mapping.findForward(page);
//
//        } catch (Exception e) {
//            errors.add("name", new ActionError(e.getMessage()));
//            //On forward
//            forward = mapping.findForward("modificationRcUtilisateur");
//        } finally {
//            if (!errors.isEmpty()) {
//                saveErrors(request, errors);
//            }
//        }
//
//        return forward;
//    }
    @Override
    public RcUtilisateurForm getModel() {		
    	return rcUtilisateurForm;
    }


    @Override
    public String getScopeKey() {		
    	return scopeKey;
    }


    @Override
    public void setModel(RcUtilisateurForm form) {
    	this.rcUtilisateurForm = form;
    	
    }

    @Override
    public void setScopeKey(String scope) {
    	this.scopeKey = scope;
    	
    }


    public RcUtilisateurForm getRcUtilisateurForm() {
    	return rcUtilisateurForm;
    }


    public void setRcUtilisateurForm(RcUtilisateurForm rcUtilisateurForm) {
    	this.rcUtilisateurForm = rcUtilisateurForm;
    }
}