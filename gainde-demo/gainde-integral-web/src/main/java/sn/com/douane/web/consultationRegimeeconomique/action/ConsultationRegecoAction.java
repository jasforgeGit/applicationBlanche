package sn.com.douane.web.consultationRegimeeconomique.action;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.RegEcoProdFini;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;
import sn.com.douane.ejb.rc.model.entities.ReprodFiniBur;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.consultationRegimeeconomique.form.ConsultationRegecoForm;
import sn.com.douane.web.rc.GeneralDispatchAction;
import tn.com.tw.java.exception.ConstErrCodRC;
import sn.com.douane.utils.ConstManif;

public class ConsultationRegecoAction extends GeneralDispatchAction implements ScopedModelDriven<ConsultationRegecoForm> {

	private static final long serialVersionUID = 1L;
	private ConsultationRegecoForm consultationRegecoForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
  
    public String rechercherRegimeeconomique() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();

        String page = request.getParameter(ConstManif.PAGE_CONTEXT);

        String rcanneeregeco = (consultationRegecoForm
                .getNumRcAnneeRegEcoRech() == null ? ""
                : consultationRegecoForm.getNumRcAnneeRegEcoRech());
        String rcnumregeco = (consultationRegecoForm.getNumRcNumRegEcoRech() == null ? ""
                : consultationRegecoForm.getNumRcNumRegEcoRech());
        String rcppmbeneficiaire = (consultationRegecoForm
                .getNumListRcPPMBeneficiaireRech() == null ? ""
                : consultationRegecoForm.getNumListRcPPMBeneficiaireRech());
        String rccodecreditaire = (consultationRegecoForm
                .getNumRcCodeCreditaireRech() == null ? ""
                : consultationRegecoForm.getNumRcCodeCreditaireRech());
        String rccodenatregeco = (consultationRegecoForm
                .getNumListRcCodeNatRegEcoRech() == null ? ""
                : consultationRegecoForm.getNumListRcCodeNatRegEcoRech());
        String rcdatevaliditeregeco = (consultationRegecoForm
                .getDatRcDateValiditeRegEcoRech() == null ? ""
                : consultationRegecoForm.getDatRcDateValiditeRegEcoRech());

        String where = ""; 

        if (!rccodecreditaire.equals("")) {
            Creditaire creditairesVO = gaindeBusinessDelegate.findCreditaireByPrimaryKey(rccodecreditaire);
            rcppmbeneficiaire = creditairesVO.getRcCodePpm();
        }

        if (!rcanneeregeco.equals("")){
            where += " AND rcanneeregeco = '" + rcanneeregeco + "'";
        }
        if (!rcnumregeco.equals("")){
            where += " AND rcnumregeco = '" + rcnumregeco + "'";
        }
        if (!rcppmbeneficiaire.equals("")){
            where += " AND rcppmbeneficiaire = '" + rcppmbeneficiaire + "'";
        }
        if (!rccodenatregeco.equals("")){
            where += " AND rccodenatregeco = '" + rccodenatregeco + "'";
        }
        if (!rcdatevaliditeregeco.equals("")){
            where += " AND rcdatevaliditeregeco = '" + sysEnv.strToDate(rcdatevaliditeregeco) + "'";
        }
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
        try {
            List listeRegeco = null;
            listeRegeco = gaindeBusinessDelegate.rechercherByWhereRegimeEconomiqueDto("from RegimeEconomique where 1 = 1 "+where);
           
         // pour la pagination du grid 
         			if (listeRegeco!=null) {
         				consultationRegecoForm.setRecords(listeRegeco.size()); 
         				consultationRegecoForm.setTotal(
         						(int) Math.ceil((double)consultationRegecoForm.getRecords() 
         								/ (double)consultationRegecoForm.getRows())); 
         				int to = (consultationRegecoForm.getRows() * consultationRegecoForm.getPage());
         			    int from = to - consultationRegecoForm.getRows();
         			    if (to > consultationRegecoForm.getRecords()) {
         			    	to = consultationRegecoForm.getRecords();
         			    }
         			   listeRegeco = listeRegeco.subList(from, to);
         			}
            
            consultationRegecoForm.setListeRegimeeconomique(listeRegeco);
            
            if (listeRegeco.size() <= 0){
            	
            	page = "saisieRegimeEconomique"; 
            	request.getSession().setAttribute(ConstManif.CTXMENU, "SM");

				if (ctxmenu.equals("SM")) {			

					if (!rcanneeregeco.equals("")){
						consultationRegecoForm.setNumRcAnneeRegEcoOB(rcanneeregeco);
					}
					if (!rcnumregeco.equals("")){
						consultationRegecoForm.setNumRcNumRegEcoOB(rcnumregeco);
					}
					if (!rcppmbeneficiaire.equals("")){
						consultationRegecoForm.setNumRcPPMBeneficiaire(rcppmbeneficiaire); 
					}
					if (!rccodenatregeco.equals("")){
						consultationRegecoForm.setNumRcCodeNatRegEco(rccodenatregeco);
					}
				} else {
				//	page = "cherchesRegimeeconomique"; 
					addActionError(getText(
							ConstErrCodRC.produitRowNotFound));  
				}

				if (!ctxmenu.equals("consultationRegimeeconomique")){
					consultationRegecoForm.resetChampDeRecherche(); 
				}
			}
        } catch (Exception e) {
        	addActionError(getText(e.getMessage()));
        }

  
        if (page==null) {
			return SUCCESS; 
		} else {
			return page;
		}
    }


    public String rechercherProduitsfinis() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String forward = null;

        String page = request.getParameter(ConstManif.PAGE);
        
        if (page == null) {
        	page = request.getParameter(ConstManif.PAGE_CONTEXT);
        }

        String pk = consultationRegecoForm.getPkSelected();
        if(pk.equals("")){
        	pk=consultationRegecoForm.getPk();
        }
        String param[] = pk.split(ConstManif.TIELD); 

        try {
        String rcanneeregeco = param[0];
        String rcnumregeco = param[1];

        consultationRegecoForm.setRcanneeregeco(rcanneeregeco);
        consultationRegecoForm.setRcnumregeco(rcnumregeco);
        List<RegimeEconomique> listRegimeEconomique =  gaindeBusinessDelegate
                .rechercherByWhereRegimeEconomique(" from RegimeEconomique where " +
                		" rcanneeregeco='"+rcanneeregeco+"' and rcnumregeco = '"+rcnumregeco+"'");
        
        RegimeEconomique regimeeconomiqueVO = listRegimeEconomique.get(0);
        String rccodeppm = regimeeconomiqueVO.getRcppmbeneficiaire();
        consultationRegecoForm.setRccodeppm(rccodeppm);

        String rccodeprod = (consultationRegecoForm.getNumRcCodeProdRech() == null ? ""
                : consultationRegecoForm.getNumRcCodeProdRech());
        String rcprecuemoa = (consultationRegecoForm.getNumRcPrecuemoaRech() == null ? ""
                : consultationRegecoForm.getNumRcPrecuemoaRech());
        String rcprecsen = (consultationRegecoForm.getNumRcPrecsenRech() == null ? ""
                : consultationRegecoForm.getNumRcPrecsenRech());

        String where = "";

        if (!rccodeppm.equals("")){
            where += " AND rcCodePpm = '" + rccodeppm + "'";
        }
        if (!rcanneeregeco.equals("")){
            where += " AND rcAnneeRegEco = '" + rcanneeregeco + "'";
        }
        if (!rcnumregeco.equals("")){
            where += " AND rcNumRegEco = '" + rcnumregeco + "'";
        }
        if (!rccodeprod.equals("")){
            where += " AND rcCodeProd = '" + rccodeprod + "'";
        }
        if (!rcprecuemoa.equals("")){
            where += " AND rcPrecUemoa = '" + rcprecuemoa + "'";
        }
        if (!rcprecsen.equals("")){
            where += " AND rcPrecSen = '" + rcprecsen + "'";
        }
            List listeProduitsfinis = null;
            listeProduitsfinis = gaindeBusinessDelegate.rechercherByWhereRegEcoProdFini("from RegEcoProdFini where 1 = 1 "+where);

            consultationRegecoForm.setListeProduitsfinis(listeProduitsfinis);
        } catch (Exception e) {
            addActionError(getText(e.getMessage()));
        }

        forward = page;

        return forward;
    }


    public String rechercherBureaux() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String forward = null;

        String page = request.getParameter(ConstManif.PAGE);
        if (page == null) {
        	page = request.getParameter(ConstManif.PAGE_CONTEXT);
        }
        String pk = consultationRegecoForm.getPkSelected();
        String param[] = pk.split(ConstManif.TIELD);

        String rccodeppm = param[2];
        String rcanneeregeco = param[0];
        String rccoderegeco = param[1];
        String rccodeprod = param[3];
        String rcprecuemoa = param[4];
        String rcprecsen = param[5];

        consultationRegecoForm.setRccodeprod(rccodeprod);
        consultationRegecoForm.setRcprecuemoa(rcprecuemoa);
        consultationRegecoForm.setRcprecsen(rcprecsen);

        String where = "";

        if (!rccodeppm.equals("")){
            where += " AND rccodeppm = '" + rccodeppm + "'";
        }
        if (!rcanneeregeco.equals("")){
            where += " AND rcanneeregeco = '" + rcanneeregeco + "'";
        }
        if (!rccoderegeco.equals("")){
            where += " AND rccoderegeco = '" + rccoderegeco + "'";
        }
        if (!rccodeprod.equals("")){
            where += " AND rccodeprod = '" + rccodeprod + "'";
        }
        if (!rcprecuemoa.equals("")){
            where += " AND rcprecuemoa = '" + rcprecuemoa + "'";
        }
        if (!rcprecsen.equals("")){
            where += " AND rcprecsen = '" + rcprecsen + "'";
        }
        try {
            List listeBureaux = null;
            listeBureaux  = gaindeBusinessDelegate.rechercherByWhereReprodFiniBur("from ReprodFiniBur where 1 = 1 "+where);
            consultationRegecoForm.setListeBureaux(listeBureaux);
        } catch (Exception e) {
        	log.error(e.getMessage());
            addActionError(getText(e.getMessage()));
        }

        forward = page;

        return forward;
    }


    public String rechercherGammes() throws Exception {

    	HttpServletRequest request = ServletActionContext.getRequest();
        String forward = null;

        String page = request.getParameter(ConstManif.PAGE);
        if (page == null) {
        	page = request.getParameter(ConstManif.PAGE_CONTEXT);
        }
        String pk = consultationRegecoForm.getPkSelected();
        String param[] = pk.split(ConstManif.TIELD);

        String rccodeppm = param[2];
        String rcanneeregeco = param[0];
        String rcnumregeco = param[1];
        String rccodeprod = param[3];
        String rcprecuemoa = param[4];
        String rcprecsen = param[5];

        consultationRegecoForm.setRccodeprod(rccodeprod);
        consultationRegecoForm.setRcprecuemoa(rcprecuemoa);
        consultationRegecoForm.setRcprecsen(rcprecsen);

        String where = "";

        if (!rccodeppm.equals("")){
            where += " AND rcCodePpm = '" + rccodeppm + "'";
        }
        if (!rcanneeregeco.equals("")){
            where += " AND rcAnneeRegEco = '" + rcanneeregeco + "'";
        }
        if (!rcnumregeco.equals("")){
            where += " AND rcNumRegEco = '" + rcnumregeco + "'";
        }
        if (!rccodeprod.equals("")){
            where += " AND rcCodeProd = '" + rccodeprod + "'";
        }
        if (!rcprecuemoa.equals("")){
            where += " AND rcPrecUemoa = '" + rcprecuemoa + "'";
        }
        if (!rcprecsen.equals("")){
            where += " AND rcPrecSen = '" + rcprecsen + "'";
        }
        try {
            List listeGammes = null;
            listeGammes =  gaindeBusinessDelegate.rechercherByWhereRegEcoProdFini("from RegEcoProdFini where 1 = 1 "+where);
            consultationRegecoForm.setListeGammes(listeGammes);
        } catch (Exception e) {
        	log.error(e.getMessage());            
            addActionError(getText(e.getMessage())); 
        }
        forward = page;      
        return forward;
    }
	public String unspecified() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;  

		String page = request.getParameter(ConstManif.PAGE);  

		try {
			consultationRegecoForm.setListeRegimeeconomique(new ArrayList());

		} catch (Exception e) {
			addActionError(getText(e.getMessage())); 
		} finally {
			forward = page; 
		}
		return forward;
	}
	public String supprimerRegEconomique() {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String laCle = request.getParameter(ConstManif.PK);
        String param[] = laCle.split(ConstManif.TIELD);
  
		String page = (request.getParameter(ConstManif.PAGE) == null ? "cherchesRegimeeconomique"
				: request.getParameter(ConstManif.PAGE));

		try {
	        String rcanneeregeco = param[0];
	        String rcnumregeco = param[1];

	        consultationRegecoForm.setRcanneeregeco(rcanneeregeco); 
	        consultationRegecoForm.setRcnumregeco(rcnumregeco);
			
			gaindeBusinessDelegate.supprimerRegimeEconomique(rcanneeregeco, rcnumregeco);

			addActionError(getText(ConstErrCodRC.succefulDelete)); 

		} catch (Exception e) {
			if (e.getMessage() != null
					&& e.getMessage().equals(ConstErrCodRC.ejbExp)){
				addActionError(getText(
						ConstErrCodRC.rcImpossibleDelete));
			}else{
				addActionError(getText(e.getMessage()));
			}
		} finally {
			if (page != null) {
				forward = page;  
			}
		}

		return forward; 

	}
	
	public String afficherRegimeEconomique() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;

        RegimeEconomique regecoprodfiniVO = null;

		String page = (request.getParameter(ConstManif.PAGE) == null ? "cherchesRegimeeconomique"
				: request.getParameter(ConstManif.PAGE));

		String laCle = request.getParameter(ConstManif.PK); 
	    String param[] = laCle.split(ConstManif.TIELD);
	    String rcanneeregeco = param[0];
        String rcnumregeco = param[1];
		
		List<RegimeEconomique> listRegimeEconomique =  gaindeBusinessDelegate
                .rechercherByWhereRegimeEconomique(" from RegimeEconomique where " +
                		" rcanneeregeco='"+rcanneeregeco+"' and rcnumregeco = '"+rcnumregeco+"'");
        
		regecoprodfiniVO = listRegimeEconomique.get(0);
		consultationRegecoForm.setRegimeEconomique(regecoprodfiniVO);

		forward = page; 
		return forward; 
	}
	
	public String modifierRegimeEconomique() {

		HttpServletRequest request = ServletActionContext.getRequest(); 
		String forward = null;
        RegimeEconomique regecoprodfiniVO = null;
		String page = (request.getParameter(ConstManif.PAGE) == null ? "modificationRegimeEconomique"
				: request.getParameter(ConstManif.PAGE));

		try {
			regecoprodfiniVO = consultationRegecoForm.getNewRegimeRconomique();
			gaindeBusinessDelegate.modifierRegimeEconomique(regecoprodfiniVO);
			consultationRegecoForm.resetChampDeSaisie();
			addActionError(getText(ConstErrCodRC.succefulUpdate));
			forward = page;
		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "modificationRegimeEconomique";
		} 
		return forward;
	}
	public String ajouterRegimeEconomique() {

		HttpServletRequest request = ServletActionContext.getRequest(); 
		String forward = null;

        RegimeEconomique regecoprodfiniVO = new RegimeEconomique();
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRegimeEconomique"
				: request.getParameter(ConstManif.PAGE));
		try {
			regecoprodfiniVO.setRcanneeregeco(consultationRegecoForm.getNumRcAnneeRegEcoOB());
			regecoprodfiniVO.setRccodenatregeco(consultationRegecoForm.getNumRcCodeNatRegEco());
			regecoprodfiniVO.setRcdatedecisionregeco(sysEnv.strToDate(consultationRegecoForm.getDatRcDateDecisionRegEco()));
			regecoprodfiniVO.setRcdateprororegeco(sysEnv.strToDate(consultationRegecoForm.getDatRcDateProRoRegEco()));
			regecoprodfiniVO.setRcdatesuspensionregeco(sysEnv.strToDate(consultationRegecoForm.getDatRcDateSuspensionRegEco()));
			regecoprodfiniVO.setRcdatevaliditeregeco(sysEnv.strToDate(consultationRegecoForm.getDatRcDateValiditeRegEco()));
			regecoprodfiniVO.setRcdureeprororegeco(consultationRegecoForm.getNumRcDureeProRoRegEco());
			regecoprodfiniVO.setRcdureeregeco(consultationRegecoForm.getNumRcDureeRegEco());
			regecoprodfiniVO.setRcetatregeco(consultationRegecoForm.getNumRcEtatRegEco());
			regecoprodfiniVO.setRcmoderegeco(consultationRegecoForm.getNumRcModeRegEco());
			regecoprodfiniVO.setRcnbreprororegeco(consultationRegecoForm.getNumRcNbreProRoRegEco());
			regecoprodfiniVO.setRcnumregeco(consultationRegecoForm.getNumRcNumRegEcoOB());
			regecoprodfiniVO.setRcppmbeneficiaire(consultationRegecoForm.getNumRcPPMBeneficiaire());
			regecoprodfiniVO.setRcrefjuridiqueregeco(consultationRegecoForm.getNumRcRefJuridiqueRegEco());

			gaindeBusinessDelegate.ajouterRegimeEconomique(regecoprodfiniVO); 
			String condition="";
			if (regecoprodfiniVO.getRcanneeregeco()!= null && !regecoprodfiniVO.getRcanneeregeco().equals("")){
				condition += " and rcanneeregeco = '" + regecoprodfiniVO.getRcanneeregeco() + "' ";
			}
			if (regecoprodfiniVO.getRcnumregeco() != null && !regecoprodfiniVO.getRcnumregeco().equals("")){
				condition += " and rcnumregeco = '" + regecoprodfiniVO.getRcnumregeco() + "' "; 
			}
			List listeRegimeEconomique = null;
			listeRegimeEconomique = gaindeBusinessDelegate.rechercherByWhereRegimeEconomique("from RegimeEconomique where 1 = 1 "+condition);
			if(listeRegimeEconomique.size()>0){
				addActionError(getText(ConstErrCodRC.succefulInsert));
			}else{
				addActionError(getText(ConstErrCodRC.notSuccefulInsert));
			}
			consultationRegecoForm.resetChampDeSaisie();
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			forward = "saisieRegimeEconomique";
		}
		return forward;
	}
	
	public String ajouterProduitFini() {

//		HttpServletRequest request = ServletActionContext.getRequest(); 
		String forward = null;
//
//        RegimeEconomique regecoprodfiniVO = new RegimeEconomique();
//		String page = "saisieProduitFinis" ;
//		try {  
//			regecoprodfiniVO.setRcppmbeneficiaire(consultationRegecoForm.getNumRcPPMBeneficiaireOB());
//			regecoprodfiniVO.setRcanneeregeco(consultationRegecoForm.getNumRcAnneeRegEcoOB());
//			regecoprodfiniVO.setRcnumregeco(consultationRegecoForm.getNumRcNumRegEcoOB());
//			regecoprodfiniVO.setRccodeproduit(consultationRegecoForm.getNumCodeProduitOB());
//			regecoprodfiniVO.setRcprecisionsen(consultationRegecoForm.getNumPrecisionSenOB());
//			regecoprodfiniVO.setRcprecisionuemoa(consultationRegecoForm.getNumPrecisionUemoaOB());
//			regecoprodfiniVO.setRcnumgamme(consultationRegecoForm.getNumRcNumGammeOB());
//			regecoprodfiniVO.setRcnaturrdmt(consultationRegecoForm.getNumNatureRendMT());
//			regecoprodfiniVO.setRcquantiteunitaire(consultationRegecoForm.getNumQteUnitaire());
//			regecoprodfiniVO.setRcunitmesure(consultationRegecoForm.getNumUniteMesure());
//			regecoprodfiniVO.setRcnbrematpremiere(consultationRegecoForm.getNumRcNbreMatPremieres());		
//
//			referencesCommunsCmd.ajouterProduitFini(regecoprodfiniVO) ; 
//			addActionError(getText(ConstErrCodRC.succefulInsert));
//			consultationRegecoForm.resetChampDeSaisie();
//			forward = page;
//
//		} catch (Exception e) {
//			addActionError(getText(e.getMessage()));
//			forward = "saisieProduitFinis";
//		}
		return forward;
	}

	public String ajouterMatierePremiere() {

		
		String forward = null;
//        RegimeEconomique regecoprodfiniVO = new RegimeEconomique();
//		String page =  "saisieMatierePremiere" ;
//		try {
//			regecoprodfiniVO.setRcppmbeneficiaire(consultationRegecoForm.getNumRcPPMBeneficiaireOB());
//			regecoprodfiniVO.setRcanneeregeco(consultationRegecoForm.getNumRcAnneeRegEcoOB());
//			regecoprodfiniVO.setRcnumregeco(consultationRegecoForm.getNumRcNumRegEcoOB());
//			regecoprodfiniVO.setRccodeproduit(consultationRegecoForm.getNumCodeProduitOB());
//			regecoprodfiniVO.setRcprecisionsen(consultationRegecoForm.getNumPrecisionSenOB());
//			regecoprodfiniVO.setRcprecisionuemoa(consultationRegecoForm.getNumPrecisionUemoaOB());
//			regecoprodfiniVO.setRcnumgamme(consultationRegecoForm.getNumRcNumGammeOB());
//			regecoprodfiniVO.setRccodemp(consultationRegecoForm.getNumCodeMPOB());
//			regecoprodfiniVO.setRcprecisionsenmp(consultationRegecoForm.getNumPrecisionSENMPOB());
//			regecoprodfiniVO.setRcprecisionuemoamp(consultationRegecoForm.getNumPrecisionUEMOAMPOB());
//			regecoprodfiniVO.setRcquantiteimport(consultationRegecoForm.getNumQteImport());
//			regecoprodfiniVO.setRcunitmesure(consultationRegecoForm.getNumUniteMesure());
//			regecoprodfiniVO.setRctauxrdmt(consultationRegecoForm.getNumTauxRendMNT());
//			regecoprodfiniVO.setRcquantiteunitaire(consultationRegecoForm.getNumQteUnitaire());
//			regecoprodfiniVO.setRcnatureproduit(consultationRegecoForm.getNumRcNatProd());
//			regecoprodfiniVO.setRctypedechet(consultationRegecoForm.getNumTypeDechet());
//			regecoprodfiniVO.setRctauxdechet(consultationRegecoForm.getNumTauxDechet());
//			
//			referencesCommunsCmd.ajouterMatieresPremiere(regecoprodfiniVO) ; 
//			addActionError(getText(ConstErrCodRC.succefulInsert));
//			consultationRegecoForm.resetChampDeSaisie();
//			forward = page;
//		} catch (Exception e) {
//			addActionError(getText(e.getMessage()));
//			forward = "saisieMatierePremiere";
//		}
		return forward;
	}
	
	 public String returnPrecedentProduitsfinis() throws Exception {
	    	HttpServletRequest request = ServletActionContext.getRequest();
	        return request.getParameter(ConstManif.PAGE_CONTEXT);       
	    }
	 
    @Override
	public ConsultationRegecoForm getModel() {		
		return consultationRegecoForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(ConsultationRegecoForm form) {
		this.consultationRegecoForm = form;
		
	}


	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public ConsultationRegecoForm getConsultationRegecoForm() {
		return consultationRegecoForm;
	}


	public void setConsultationRegecoForm(ConsultationRegecoForm consultationRegecoForm) {
		this.consultationRegecoForm = consultationRegecoForm;
	}

}