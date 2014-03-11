package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.dto.AgrementEntrepriseDto;
import sn.com.douane.ejb.rc.model.dto.AgrementRgrpProdDto;
import sn.com.douane.ejb.rc.model.entities.AgrementEntreprise;
import sn.com.douane.ejb.rc.model.entities.AgrementRgrpProd;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.Regroupement;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.form.RcAgrementEntrepriseForm;
import tn.com.tw.java.exception.ConstErrCodRC;
import tn.com.tw.java.exception.TwreException;
import sn.com.douane.utils.ConstManif;

public class RcAgrementEntrepriseAction extends GeneralDispatchAction implements
		ScopedModelDriven<RcAgrementEntrepriseForm> {

	private static final long serialVersionUID = 1L;
	private RcAgrementEntrepriseForm rcAgrementEntrepriseForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();

	/***************************************/
	/*** ENREGISTREMENT ***/
	/***************************************/
	public String enregistrerRcTarifsUemoa() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		AgrementEntreprise agrementEntrepriseVO = null;
		String page = request.getParameter("pageContext");

		try {
			agrementEntrepriseVO = rcAgrementEntrepriseForm
					.getNewRcAgrementEntrepriseVO();
			boolean result = gaindeBusinessDelegate
					.ajouterAgrementEntreprise(agrementEntrepriseVO);

			if (result) {
				addActionError(getText(ConstErrCodRC.succefulInsert));
			} else {
				addActionError(getText(ConstErrCodRC.erreurUpdate));
			}
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			if (page != null) {
				forward = page;
			}
			setupRecherche(request);
		}
		return forward;
	}

	/***************************************/
	/*** MODIFICATION ***/
	/***************************************/
	public String modifierRcTarifsUemoa() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		AgrementEntreprise agrementEntrepriseVO = null;
		String page = request.getParameter("pageContext");

		try {
			agrementEntrepriseVO = rcAgrementEntrepriseForm
					.getNewRcAgrementEntrepriseVO();
			boolean result = gaindeBusinessDelegate
					.modifierAgrementEntreprise(agrementEntrepriseVO);
			if (result) {
				addActionError(getText(ConstErrCodRC.succefulUpdate));
			} else {
				addActionError(getText(ConstErrCodRC.erreurUpdate));
			}
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			if (page != null) {
				forward = page;
			}
			setupRecherche(request);
		}

		return forward;
	}

	/***************************************/
	/*** RECHERCHE ***/
	/***************************************/
	public String rechercherRcTarifsUemoa() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		rcAgrementEntrepriseForm.resetEntreprise(request);
		rcAgrementEntrepriseForm.resetrechercheProduits(request);
		rcAgrementEntrepriseForm.setListeRcAgrementRgrprpod(new ArrayList());
		String pageResult = request.getParameter("pageContext");
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		String condition = " ";
		String codEntreprise = rcAgrementEntrepriseForm.getNumRcAgrentOBrech();
		String codePays = rcAgrementEntrepriseForm.getNumListRcCodPaysOBrech();

		if (codEntreprise != null && !codEntreprise.equals("")){
			condition += " and rcAgrent='" + codEntreprise + "' ";
		}
		if (codePays != null && !codePays.equals("")){
			condition += " and rcCodPays='" + codePays + "' ";
		}
		try {
			List<AgrementEntrepriseDto> listeRcAgrementEntreprise = gaindeBusinessDelegate
					.rechercherAgrementEntreprise("from AgrementEntreprise where 1 = 1 "
							+ condition);
			// pour la pagination du grid
			if (listeRcAgrementEntreprise != null) {
				rcAgrementEntrepriseForm.setRecords(listeRcAgrementEntreprise
						.size());
				rcAgrementEntrepriseForm.setTotal((int) Math
						.ceil((double) rcAgrementEntrepriseForm.getRecords()
								/ (double) rcAgrementEntrepriseForm.getRows()));
				int to = (rcAgrementEntrepriseForm.getRows() * rcAgrementEntrepriseForm
						.getPage());
				int from = to - rcAgrementEntrepriseForm.getRows();
				if (to > rcAgrementEntrepriseForm.getRecords()) {
					to = rcAgrementEntrepriseForm.getRecords();
				}
				listeRcAgrementEntreprise = listeRcAgrementEntreprise.subList(from, to);
			}
			rcAgrementEntrepriseForm
					.setListeRcAgrementEntrprise(listeRcAgrementEntreprise);

			if (listeRcAgrementEntreprise != null && listeRcAgrementEntreprise.size() != 0){

				if (!ctxmenu.equals("C")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {
				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcTarifsUemoa";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!codEntreprise.equals("")) {
						rcAgrementEntrepriseForm
								.setNumRcAgrentOB(codEntreprise);
					}
					if (!codePays.equals("")){
						rcAgrementEntrepriseForm
								.setNumListRcCodPaysOB(codePays);
					}
				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")){
					rcAgrementEntrepriseForm.resetEntreprise(request);
				}
			}
		} catch (Exception e) {
			log.error("Erreur de recherche d�rogations");
		}

		setupRecherche(request);
		if (pageResult == null){
			return SUCCESS;
		} else {
			return pageResult;
		}
	}

	/***************************************/
	/*** SUPPRESSION ***/
	/***************************************/
	public String supprimerRcTarifsUemoa() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter("pageContext");
		String cle = request.getParameter(ConstManif.PK);
		String[] pk = cle.split(ConstManif.TIELD);
		String rcagrent = pk[0];
		String rcrgrpays = pk[1];
		String rccodpays = pk[2];

		try {
			boolean result = gaindeBusinessDelegate
					.supprimerAgrementEntreprise(rcagrent, rcrgrpays, rccodpays);
			if (result ) {
				addActionError(getText(ConstErrCodRC.succefulDelete));
			} else {
				addActionError(getText(ConstErrCodRC.erreurUpdate));
			}
			rechercherRcTarifsUemoa();
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			setupRecherche(request);
		}
		return page;
	}

	/***************************************/
	/*** AFFICHAGE ***/
	/***************************************/
	public String afficherRcTarifsUemoa() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter("pageContext");
		String cle = request.getParameter(ConstManif.PK);
		String[] pk = cle.split(ConstManif.TIELD);
		String rcagrent = pk[0];
		String rcrgrpays = pk[1];

		String condition = "";
		if (rcagrent != null && !rcagrent.equals("")) {
			condition += " and rcAgrent='" + rcagrent + "' ";
		}
		if (rcrgrpays != null && !rcrgrpays.equals("")) {
			condition += " and rcRgrPays='" + rcrgrpays + "' ";
		}
		List<AgrementEntreprise> listeRcAgrementEntreprise = gaindeBusinessDelegate
				.rechercherbyWhereAgrementEntreprise("from AgrementEntreprise where 1 = 1 "
						+ condition);
		AgrementEntreprise vo = (AgrementEntreprise) listeRcAgrementEntreprise.get(0);
		rcAgrementEntrepriseForm.setAgrementEntreprise(vo);
		return page;
	}

	/***************************************/
	/*** INITIALISATION ***/
	/***************************************/
	public String unspecified() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter(ConstManif.PAGE);
		if (page == null) {
			page = request.getParameter("pageContext");
		}

		try {
			rcAgrementEntrepriseForm.resetEntreprise(request);
			rcAgrementEntrepriseForm
					.setListeRcAgrementEntrprise(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} 
		return page;
	}

	/***************************************/
	/*** RECHERCHE AGREMENTRGRPPROD ***/
	/***************************************/
	public String rechercherRcAgrementProduit() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		rcAgrementEntrepriseForm.resetProduits(request);
		String pageResult = request.getParameter("pageContext");
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
		String condition = " ";

		String codEntreprise = rcAgrementEntrepriseForm.getNumRcAgrentOB();
		String codeProduit = rcAgrementEntrepriseForm
				.getNumListRcCodeProdOBrech();
		String precUemoa = rcAgrementEntrepriseForm
				.getNumListRcPrecuemoaProdOBrech();
		String precSenegal = rcAgrementEntrepriseForm
				.getNumListRcPrecsenProdOBrech();

		if (codEntreprise != null && !codEntreprise.equals("")) {
			condition += " and rcNumEntreprise='" + codEntreprise + "' ";
		}

		if (codeProduit != null && !codeProduit.equals("")) {
			condition += " and rcCodeProd='" + codeProduit + "' ";
		}
		if (precUemoa != null && !precUemoa.equals("")) {
			condition += " and rcPrecUemoaProd='" + precUemoa + "' ";
		}
		if (precSenegal != null && !precSenegal.equals("")){
			condition += " and rcPrecSenProd='" + precSenegal + "' ";
		}

		try {

			List<AgrementRgrpProdDto> listeRcProduits = gaindeBusinessDelegate
					.rechercherAgrementRgrpProd("from AgrementRgrpProd where 1 = 1 "
							+ condition);
			Produit vo;
			if (listeRcProduits != null) {
				for (AgrementRgrpProdDto liste : listeRcProduits) {
					vo = gaindeBusinessDelegate.findProduitByPrimaryKey(
							liste.getRcCodeProd(), liste.getRcPrecUemoaProd(),
							liste.getRcPrecSenProd());
					if (vo != null) {
						liste.setLibelle(vo.getRclibelletarif());
					}
				}
			}
			// pour la pagination du grid
			if (listeRcProduits != null) {
				rcAgrementEntrepriseForm.setRecords(listeRcProduits.size());
				rcAgrementEntrepriseForm.setTotal((int) Math
						.ceil((double) rcAgrementEntrepriseForm.getRecords()
								/ (double) rcAgrementEntrepriseForm.getRows()));
				int to = (rcAgrementEntrepriseForm.getRows() * rcAgrementEntrepriseForm
						.getPage());
				int from = to - rcAgrementEntrepriseForm.getRows();
				if (to > rcAgrementEntrepriseForm.getRecords()) {
					to = rcAgrementEntrepriseForm.getRecords();
				}
				listeRcProduits = listeRcProduits.subList(from, to);
			}
			rcAgrementEntrepriseForm
					.setListeRcAgrementRgrprpod(listeRcProduits);
			if (listeRcProduits != null && listeRcProduits.size() != 0){
				if (ctxmenu.equals("SM")){
					pageResult = "modificationRcTarifsUemoa";
				}
				if (ctxmenu.equals("C")){
					pageResult = "consultationRcTarifsUemoa";
				}
				if (!ctxmenu.equals("C")){
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				}
			} else {
				if (ctxmenu.equals("SM")) {
					pageResult = "saisieRcProduitsUemoa";

					request.getSession().setAttribute(ConstManif.CTXMENU, "S");

					if (!codEntreprise.equals("")){
						rcAgrementEntrepriseForm
								.setNumRcNumEntrepriseOB(codEntreprise);
					}
					if (!precUemoa.equals("")){
						rcAgrementEntrepriseForm
								.setNumListRcPrecuemoaProdOB(precUemoa);
					}
					if (!precSenegal.equals("")){
						rcAgrementEntrepriseForm
								.setNumListRcPrecsenProdOB(precSenegal);
					}
					if (!codeProduit.equals("")){
						rcAgrementEntrepriseForm
								.setNumListRcCodeProdOB(codeProduit);
					}
					rcAgrementEntrepriseForm
							.setNumListRcCodePaysOB(rcAgrementEntrepriseForm
									.getNumListRcCodPaysOB());
					rcAgrementEntrepriseForm
							.setNumRcCodeRegroupementOB(rcAgrementEntrepriseForm
									.getNumRcRgrPaysOB());

				} else if (ctxmenu.equals("S")) {
					request.getSession().setAttribute(ConstManif.CTXMENU, "SM");
				} else {
					pageResult = "consultationRcTarifsUemoa";
					addActionError(getText(ConstErrCodRC.rcRowNotFound));
				}

				if (!ctxmenu.equals("C")) {
					rcAgrementEntrepriseForm.resetrechercheProduits(request);
				}

			}
		} catch (Exception e) {
			log.error(e.getMessage());
		}

		setupRecherche(request);
		if (pageResult == null){
			return SUCCESS;
		} else {
			return pageResult;
		}
	}

	/***************************************/
	/*** AFFICHAGE AGREMENTRGRPPROD ***/
	/***************************************/
	public String afficherRcAgrementProduit() throws Exception {
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter("pageContext");
		String cle = request.getParameter(ConstManif.PK);
		String[] pk = cle.split(ConstManif.TIELD);
		String rccodepays = pk[0];
		String rcnumentreprise = pk[1];
		String rccodeprod = pk[2];
		String rcprecuemoa = pk[3];
		String rcprecsenegal = pk[4];
		String rccodeimpexp = pk[5];
		String rccoderegroupement = pk[6];

		AgrementRgrpProd agrementrgrpprodVO = gaindeBusinessDelegate
				.findAgrementRgrpProdByPrimaryKey(rccodepays, rcnumentreprise,
						rccodeprod, rcprecuemoa, rcprecsenegal, rccodeimpexp,
						rccoderegroupement);
		rcAgrementEntrepriseForm.setAgrementRgrpProd(agrementrgrpprodVO);
		forward = page;
		setupRecherche(request);
		return forward;
	}

	/***************************************/
	/*** ENREGISTREMENT AGREMENTRGRPPROD ***/
	/***************************************/
	public String enregistrerRcAgrementProduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String page = request.getParameter("pageContext");
		try {

			AgrementRgrpProd agrementrgrpprodVO = rcAgrementEntrepriseForm
					.getNewRcAgrementrgrpprodVO();
			Produit produit = gaindeBusinessDelegate.findProduitByPrimaryKey(
					agrementrgrpprodVO.getRcCodeProd(),
					agrementrgrpprodVO.getRcPrecUemoaProd(),
					agrementrgrpprodVO.getRcPrecSenProd());
			if (produit != null) {
				gaindeBusinessDelegate
						.ajouterAgrementRgrpProd(agrementrgrpprodVO);
				addActionError(getText(ConstErrCodRC.succefulInsert));

			} else {
				addActionError(getText(ConstErrCodRC.errorNewProduits));
			}
		} catch (Exception e) {
			log.error(e.getMessage());
			addActionError(getText(e.getMessage()));
		} finally {
			setupRecherche(request);
		}

		return page;
	}

	/***************************************/
	/*** MODIFICATION AGREMENTRGRPPROD ***/
	/***************************************/
	public String modifierRcAgrementProduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter("pageContext");

		try {
			AgrementRgrpProd agrementrgrpprodVO = rcAgrementEntrepriseForm
					.getNewRcAgrementrgrpprodVO();
			gaindeBusinessDelegate.modifierAgrementRgrpProd(agrementrgrpprodVO);
			addActionError(getText(ConstErrCodRC.succefulUpdate));
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			if (page != null) {
				forward = page;
			}
			setupRecherche(request);
		}

		return forward;
	}

	/***************************************/
	/*** SUPPRESSION AGREMENTRGRPPROD ***/
	/***************************************/
	public String supprimerRcAgrementProduit() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();

		// Cl� de l'enregistrement � supprimer
		String cle = request.getParameter(ConstManif.PK);
		String[] pk = cle.split(ConstManif.TIELD);
		String rccodepays = pk[0];
		String rcnumentreprise = pk[1];
		String rccodeprod = pk[2];
		String rcprecuemoa = pk[3];
		String rcprecsenegal = pk[4];
		String rccodeimpexp = pk[5];
		String rccoderegroupement = pk[6];

		// String page = request.getParameter(ConstManif.PAGE);
		String page = request.getParameter("pageContext");

		try {
			gaindeBusinessDelegate.supprimerAgrementRgrpProd(rccodepays,
					rcnumentreprise, rccodeprod, rcprecuemoa, rcprecsenegal,
					rccodeimpexp, rccoderegroupement);
			String codEntreprise = rcAgrementEntrepriseForm.getNumRcAgrentOB();
			String codeProduit = rcAgrementEntrepriseForm
					.getNumListRcCodeProdOBrech();
			String precUemoa = rcAgrementEntrepriseForm
					.getNumListRcPrecuemoaProdOBrech();
			String precSenegal = rcAgrementEntrepriseForm
					.getNumListRcPrecsenProdOBrech();
			String condition = "";

			if (codEntreprise != null && !codEntreprise.equals("")) {
				condition += " and rcNumEntreprise='" + codEntreprise + "' ";
			}
			if (codeProduit != null && !codeProduit.equals("")){
				condition += " and rcCodeProd='" + codeProduit + "' ";
			}
			if (precUemoa != null && !precUemoa.equals("")){
				condition += " and rcPrecUemoaProd='" + precUemoa + "' ";
			}
			if (precSenegal != null && !precSenegal.equals("")){
				condition += " and rcPrecSenProd='" + precSenegal + "' ";
			}
			List<AgrementRgrpProdDto> listeRcProduits = gaindeBusinessDelegate
					.rechercherAgrementRgrpProd("from AgrementRgrpProd where 1 = 1 "
							+ condition);
			rcAgrementEntrepriseForm
					.setListeRcAgrementRgrprpod(listeRcProduits);

			addActionError(getText(ConstErrCodRC.succefulDelete));

		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.ejbExp)){
				addActionError(getText(ConstErrCodRC.rcImpossibleDelete));
			}
		} finally {
			setupRecherche(request);
		}

		return page;
	}

	/** ************************************ */
	/** * REMPLIR LA ZONE DE LISTE ** */
	/** ************************************ */
	private void setupRecherche(HttpServletRequest request)
			throws TwreException {

		List<LabelValue> vector2 = new ArrayList<LabelValue>();
		Regroupement regroupementVO;
		List<Regroupement> vector = gaindeBusinessDelegate
				.rechercherRegroupement("from Regroupement where 1 = 1");
		vector2.add(new LabelValue("", ""));
		for (int i = 0; i < vector.size(); i++) {
			regroupementVO = (Regroupement) vector.get(i);
			vector2.add(new LabelValue(regroupementVO.getRcLibelleRegroup(),
					ConvertUtil.converToString(regroupementVO
							.getRcCodeRegroup())));
		}
		rcAgrementEntrepriseForm.setListeRegroupement(vector2);
	}

	@Override
	public RcAgrementEntrepriseForm getModel() {
		return rcAgrementEntrepriseForm;
	}

	@Override
	public String getScopeKey() {
		return scopeKey;
	}

	@Override
	public void setModel(RcAgrementEntrepriseForm form) {
		this.rcAgrementEntrepriseForm = form;

	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;

	}

	public RcAgrementEntrepriseForm getRcAgrementEntrepriseForm() {
		return rcAgrementEntrepriseForm;
	}

	public void setRcAgrementEntrepriseForm(
			RcAgrementEntrepriseForm rcAgrementEntrepriseForm) {
		this.rcAgrementEntrepriseForm = rcAgrementEntrepriseForm;
	}

}
