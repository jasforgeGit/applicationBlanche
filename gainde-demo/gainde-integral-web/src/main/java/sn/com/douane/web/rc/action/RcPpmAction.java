package sn.com.douane.web.rc.action;


import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcPpmForm;
import tn.com.tw.java.exception.ConstErrCodRC;

import com.opensymphony.xwork2.interceptor.ScopedModelDriven;

public class RcPpmAction extends GeneralDispatchAction implements ScopedModelDriven<RcPpmForm> {

	private static final long serialVersionUID = 1L;
	private RcPpmForm rcPpmForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	/** ************************************ */
	/** * ENREGISTREMENT ** */
	/** ************************************ */
	public String enregistrerRcPpm() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcPpm"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			Ppm ppmvo = rcPpmForm.getNewRcPpmVO();

			//On ex�cute la commande d'ajout
			if(ppmEnregistrable(ppmvo)){
				gaindeBusinessDelegate.ajouterPpm(ppmvo);
			}else {
				throw new TwreException("error.ppmNonrattache");
			}
			addActionError(getText(ConstErrCodRC.succefulInsert));

			//On vide les champs du formulaire
			//rcppmfb.reset(mapping, request);
			
			//l'indicateur de cr�ation prend la valeur true pour signifier que
			//la PPM est cr��e. On peut la rattacher � un consignataire, cr�ditaire,etc
			request.getSession().setAttribute("ppmExiste","true");
			updateIndicateur(ppmvo,rcPpmForm);

			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRcPpm";
		} 

		return forward;
	}

	/** ************************************ */
	/** * MODIFICATION ** */
	/** ************************************ */
	public String modifierRcPpm() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRcPpm"
				: request.getParameter(ConstManif.PAGE));

		try {
			//On remplit les attributs du VO
			Ppm ppmvo = rcPpmForm.getNewRcPpmVO();

			if (ppmEnregistrable(ppmvo)){//On ex�cute la commande de modification
				gaindeBusinessDelegate.modifierPpm(ppmvo);
			}else {
				throw new TwreException("error.ppmNonrattache");
			}

			addActionError(getText(ConstErrCodRC.succefulUpdate));
			//mise � jour des indicateurs de cr�ation modification
			updateIndicateur(ppmvo, rcPpmForm);
			
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = page;
		} 
		return forward;
	}

	/** ************************************ */
	/** * RECHERCHE ** */
	/** ************************************ */
	public String rechercherRcPpm() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcPpm"
				: request.getParameter(ConstManif.PAGE));
		String condition = " "; //condition pour la recherche de consultation

		//On r�cup�re le contexte menu
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);

		//R�cup�ration des crit�res saisis
		String rccodeagree = (rcPpmForm.getNumListRcCodeAgreeRech() == null ? ""
				: rcPpmForm.getNumListRcCodeAgreeRech());
		rcPpmForm.setNumListRcCodeAgree(rcPpmForm.getNumListRcCodeAgreeRech());
		rcPpmForm.setNumListRcCodeAmborg(rcPpmForm.getNumListRcCodeAmborgRech());
		String rccodeconsignataire = (rcPpmForm
				.getNumListRcCodeConsignataireRech() == null ? "" : rcPpmForm.getNumListRcCodeConsignataireRech());
		rcPpmForm.setNumListRcCodeConsignataire(rcPpmForm.getNumListRcCodeConsignataireRech());
		String rccodecontribuable = (rcPpmForm.getNumRcCodeContribuableRech() == null ? ""
				: rcPpmForm.getNumRcCodeContribuableRech());
		rcPpmForm.setNumRcCodeContribuable(rcPpmForm.getNumRcCodeContribuableRech());
		String rccodecreditaire = (rcPpmForm.getNumListRcCodeCreditaireRech() == null ? ""
				: rcPpmForm.getNumListRcCodeCreditaireRech());
		rcPpmForm.setNumListRcCodeCreditaire(rcPpmForm.getNumListRcCodeCreditaireRech());
		String rccodeppm = (rcPpmForm.getNumRcCodePPMRech() == null ? ""
				: rcPpmForm.getNumRcCodePPMRech());
		rcPpmForm.setNumRcCodePPMOB(rcPpmForm.getNumRcCodePPMRech() );
		String rcninea = (rcPpmForm.getNumRcNineaRech() == null ? "" : rcPpmForm
				.getNumRcNineaRech());
		rcPpmForm.setNumRcNinea(rcPpmForm.getNumRcNineaRech());
		
		String rcnumimportexport = (rcPpmForm
				.getNumListRcNumImportExportRech() == null ? "" : rcPpmForm
				.getNumListRcNumImportExportRech());
		rcPpmForm.setNumListRcNumImportExport(rcPpmForm.getNumListRcNumImportExportRech());
		String rcnumregpreferentiel = (rcPpmForm
				.getNumListRcNumRegPreferentielRech() == null ? "" : rcPpmForm
				.getNumListRcNumRegPreferentielRech());
		rcPpmForm.setNumListRcNumRegPreferentiel(rcPpmForm.getNumListRcNumRegPreferentielRech());
		
		String nom = (rcPpmForm.getNumRcNomPPM() == null ? "" : rcPpmForm
				.getNumRcNomPPM());
		
		String prenom = (rcPpmForm.getNumRcPrenomPPM() == null ? "" : rcPpmForm
				.getNumRcPrenomPPM());
		
		if (!rccodeagree.equals("")){ 
			condition += " and rccodeagree LIKE '%" + rccodeagree + "%' ";
		}
		if (!rccodeconsignataire.equals("")) {
			condition += " and rccodeconsignataire LIKE '%"
					+ rccodeconsignataire + "%' ";
		}
		if (!rccodecontribuable.equals("")){
			condition += " and rccodecontribuable LIKE '%" + rccodecontribuable
					+ "%' ";
		}
		if (!rccodecreditaire.equals("")) { 
			condition += " and rccodecreditaire LIKE '%" + rccodecreditaire	+ "%'";
		}
		if (!rccodeppm.equals("")){
			condition += " and rccodeppm LIKE '%" + rccodeppm + "%' ";
		}
		if (!rcninea.equals("")) {
			condition += " and rcninea = '" + rcninea + "' ";
		}
		if (!rcnumimportexport.equals("")) {
			condition += " and rcnumimportexport LIKE '%" + rcnumimportexport+ "%' ";
		}
		if (!rcnumregpreferentiel.equals("")) { 
			condition += " and rcnumregpreferentiel LIKE '%"
					+ rcnumregpreferentiel + "%' ";
		}
		if(!nom.equals("")) {
			condition+= " and rcnomppm like '%"+nom+"%'";
		}
		if(!prenom.equals("")) {
			condition+= " and rcprenomppm like '%"+prenom+"%'";
		}
		try {
			//consultation
			List<Ppm> listeRcPpm = gaindeBusinessDelegate.findPPMByWhere("from Ppm where 1 = 1  "+condition);
			rcPpmForm.setListeRcPpm(listeRcPpm);
			if (listeRcPpm.size() == 0){
				addActionError(getText(ConstErrCodRC.rcRowNotFound));
				if (ctxmenu.equals("SM")){
					page = "saisieRcPpm";
				}
			}else{				
				page = "rechercheRcPpm";
			}

		} catch (Exception e) {
			rcPpmForm.setListeRcPpm(new ArrayList());
			addActionError(getText(e.getMessage()));
		} 

		return page;
	}

	/** ************************************ */
	/** * SUPPRESSION ** */
	/** ************************************ */
	public String supprimerRcPpm() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		//Cl� de l'enregistrement � supprimer
		String pk = request.getParameter(ConstManif.PK);

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcPpm"
				: request.getParameter(ConstManif.PAGE));

		try {

            gaindeBusinessDelegate.supprimerPpm(pk);
			//Raffraichissement de la liste des PPM
            rcPpmForm.setListeRcPpm(new ArrayList());

            addActionError(getText(ConstErrCodRC.succefulDeleteTable," de la PPM n� "+ pk));

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
	public String afficherRcPpm() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "rechercheRcPpm"
				: request.getParameter(ConstManif.PAGE));
		String pk = request.getParameter(ConstManif.PK);
		//Le VO
		Ppm ppmvo = gaindeBusinessDelegate.findPPMByPrimaryKey(pk);
		//mise � jour des indicateurs de cr�ation modification
		
		updateIndicateur(ppmvo, rcPpmForm);

		//Affichage dans le formulaire
		rcPpmForm.setPpm(ppmvo);

		return page;

	}

	/** ************************************ */
	/** * INITIALISATION ** */
	/** ************************************ */
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		request.getSession().setAttribute("codePpm",
				rcPpmForm.getNumRcCodePPMOB());

		try {

			rcPpmForm.setNumRcNomPPM("");
			rcPpmForm.setNumRcPrenomPPM("");
			rcPpmForm.setListeRcPpm(new ArrayList());
			if (page.equals("saisieRcPpm") || page.equals("modificationRcPpm")) {
				String pageRetour = (String) request.getSession().getAttribute(
						"pageRetour");
				if (pageRetour != null){
					page = pageRetour;
				}
			} 
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		}
		return page;
	}

	/** ************************************ */
	/** * VERIFICATION CREATION PPM ** */
	/** ************************************ */
	/* Cette m�thode permet de v�rifier que la PPM cr��e est
	 * rattach�e au moins � un agr�� ou consignataire ou ....
	 * Dans le cas contraire, on supprime le PPM qui vien d'�tre cr��
	 * La v�rification s'effectue lors du click sur le bouton retour
	 */
	public String supprimerPpmSolitaire() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

		String page = request.getParameter(ConstManif.PAGE);
		String etatPpm = (String)request.getSession().getAttribute("ppmExiste");

		try {
			if (etatPpm!=null && etatPpm.equals("true")) {
				// la PPM est cr��e mais non rattach�e. on la supprime

                gaindeBusinessDelegate.supprimerPpm(rcPpmForm.getNumRcCodePPMOB());	

                addActionError(getText(ConstErrCodRC.succefulDeleteTable," de la PPM n� "+
                		rcPpmForm.getNumRcCodePPMOB()));
				request.getSession().setAttribute("ppmExiste",null);
			} 
			rcPpmForm.reset();

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			forward = page;
		}
		return forward;
	}
	
	private void updateIndicateur(Ppm ppmvo, RcPpmForm rcppmfb) {
		if (ppmvo.getRccodeagree() != null
				&& !ppmvo.getRccodeagree().trim().equals("")){
			rcppmfb.setAgreerACreer(false);
		} else {
			rcppmfb.setAgreerACreer(true);
		}
		if (ppmvo.getRcnumregpreferentiel() != null
				&& !ppmvo.getRcnumregpreferentiel().trim().equals("")){
			rcppmfb.setRegimePreferentielACreer(false);
		} else {
			rcppmfb.setRegimePreferentielACreer(true);
		}

		if (ppmvo.getRccodeconsignataire() != null
				&& !ppmvo.getRccodeconsignataire().trim().equals("")) {
			rcppmfb.setConsignataireACreer(false);
		} else {
			rcppmfb.setConsignataireACreer(true);
		}
		if (ppmvo.getRccodecreditaire() != null
				&& !ppmvo.getRccodecreditaire().trim().equals("")) {
			rcppmfb.setCreditaireACreer(false);
		}else {
			rcppmfb.setCreditaireACreer(true);
		}
		if (ppmvo.getRcnumimportexport() != null
				&& !ppmvo.getRcnumimportexport().trim().equals("")){
			rcppmfb.setImportExportACreer(false);
		} else {
			rcppmfb.setImportExportACreer(true);
		}
		if (ppmvo.getRcninea() != null
				&& !ppmvo.getRcninea().trim().equals("")){
			rcppmfb.setNineaACreer(false);
		}else {
			rcppmfb.setNineaACreer(true);
		}
		if (ppmvo.getRccodecontribuable() != null
				&& !ppmvo.getRccodecontribuable().trim().equals("")) {
			rcppmfb.setContribuableACreer(false);
		} else {
			rcppmfb.setContribuableACreer(true);
		}
	}
	
	private boolean ppmEnregistrable(Ppm ppmvo) {

		boolean valeur = false;
		if (ppmvo.getRccodeppm() != null
				&& !ppmvo.getRccodeppm().trim().equals("")) {
			if (ppmvo.getRccodeagree() != null
					&& !ppmvo.getRccodeagree().trim().equals("")){
				valeur = true;
			} else if (ppmvo.getRcnumregpreferentiel() != null
					&& !ppmvo.getRcnumregpreferentiel().trim().equals("")){
				valeur = true;
			}else if (ppmvo.getRccodeconsignataire() != null
					&& !ppmvo.getRccodeconsignataire().trim().equals("")){
				valeur = true;
			} else if (ppmvo.getRccodecreditaire() != null
					&& !ppmvo.getRccodecreditaire().trim().equals("")){
				valeur = true;
			} else if (ppmvo.getRcnumimportexport() != null
					&& !ppmvo.getRcnumimportexport().trim().equals("")) {
				valeur = true;
			} else if (ppmvo.getRccodecontribuable() != null
					&& !ppmvo.getRccodecontribuable().trim().equals("")){
				valeur = true;
			} else if (ppmvo.getRcninea() != null
					&& !ppmvo.getRcninea().trim().equals("")){
				valeur = true;
			}
		}
		return valeur;
	}
	@Override
	public RcPpmForm getModel() {		
		return rcPpmForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcPpmForm form) {
		this.rcPpmForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcPpmForm getRcPpmForm() {
		return rcPpmForm;
	}


	public void setRcPpmForm(RcPpmForm rcPpmForm) {
		this.rcPpmForm = rcPpmForm;
	}

}
