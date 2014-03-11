package sn.com.douane.web.rc.action;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.FinderException;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.interceptor.ScopedModelDriven;
import sn.com.douane.ejb.rc.delegate.GaindeBusinessDelegate;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.DelegationDto;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.keys.DelegationKey;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.ConstRC;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.sysEnv;
import sn.com.douane.web.rc.GeneralDispatchAction;
import sn.com.douane.web.rc.Session;
import sn.com.douane.web.rc.form.RcDelegationsForm;


public class RcDelegationsAction extends GeneralDispatchAction implements ScopedModelDriven<RcDelegationsForm> {

	private static final long serialVersionUID = 1L;
	private RcDelegationsForm rcDelegationsForm;
	private String scopeKey;
	private GaindeBusinessDelegate gaindeBusinessDelegate = GaindeBusinessDelegate
			.getBusinessDelegate();
	
	/** ************************************* */      
	/** * AJOUT D'UNE LIGNE DE DELEGATIONS ** */
	/** ************************************* */
	public String ajouterDelegations() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;       
		String page = request.getParameter(ConstManif.PAGE); 
		String pk = null;
		String agentDestinataire = rcDelegationsForm.getNumListAgentDestinataireOB();
		String agentEmetteur = rcDelegationsForm.getNumListAgentEmetteurOB();
		String codeGroupe = rcDelegationsForm.getNumCodeGroupeOB();
		String codeFonction = rcDelegationsForm.getNumCodeFonctionOB();
		String dateDebut = rcDelegationsForm.getDatDateDebutOB();
		
//		List listeDelegations = new ArrayList(); 
		try {
			codeGroupe = codeGroupe.split(" - ")[0];
			codeFonction = codeFonction.split(" - ")[0];
			pk = agentDestinataire + ConstManif.TIELD + agentEmetteur
					+ ConstManif.TIELD + codeGroupe + ConstManif.TIELD
					+ codeFonction + ConstManif.TIELD + dateDebut;
			Integer i = getIndexPk(rcDelegationsForm.getListeDelegations(), pk);
			
			String burdelege = null;			
			List<AgentDouane> vagent = null;
		    vagent = gaindeBusinessDelegate.getAgentDouanes(agentDestinataire);
		   if (vagent != null && vagent.size() > 0) {
		    AgentDouane agentdouaneVO = (AgentDouane) vagent.get(0);
		    burdelege = agentdouaneVO.getRcCodeBurAct();
		   }
		    String burdelegant = Session.getCodeBurAct(request);
		    
		    if (burdelegant != null && burdelegant.equals(burdelege) ) {
			if(i == 0) {
			rcDelegationsForm.addNewDelegation();
			} else {
				addActionError(getText(ConstErrCodRC.delegationExistante));
				
			}
		    } else {
		    	addActionError(getText(ConstErrCodRC.burDelegationIncompatible));
		    }
		} catch (TwreException e) {
			addActionError(getText(e.getMessage()));  
		} finally {
			setupDelegations(rcDelegationsForm);  

			forward = page;      
		}
		return forward; 
	}

	/** *************************************** */
	/** * SUPPRIMER UNE LIGNE DE DELEGATIONS ** */
	/** *************************************** */  
	public String supprimerDelegations() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);
		String pk = request.getParameter(ConstManif.PK);

		try {
			if (pk != null) {
				List v = rcDelegationsForm.getListeDelegations();
				v.remove(getIndexPk(rcDelegationsForm.getListeDelegations(), pk));  
				sysEnv.removeSession("delegationsFB", request);
				rcDelegationsForm.setListeDelegations(v);
				rcDelegationsForm.getDelegations().remove(pk);
				request.getSession().setAttribute("delegationsFB",rcDelegationsForm);
				throw new TwreException(ConstErrCodRC.delegationSupprimee);
			}

		} catch (TwreException e) {
			addActionError(getText(e.getMessage())); 
		} finally {
			setupDelegations(rcDelegationsForm);
			forward = page;  
		}
		return forward; 
	}

	/** **************** */ 
	/** * ENREGISTRER ** */
	/** ***************** */ 
	public String enregistrerRcDelegations() throws Exception {

		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null; 
		//Le VO
		Delegation delegationsVO = new Delegation(); 

		//La page de forward
		String page = (request.getParameter(ConstManif.PAGE) == null ? "saisieRcDelegations"
				: request.getParameter(ConstManif.PAGE));

		List vOldDeleg = null;
		List vNewDeleg = null;
		
		String messageRetour = ConstErrCodRC.SUCCESFUL_INSERT;  

		try {
			//On vide la table delegations avant de rajouter les nouvelles 
			//delegations
			vOldDeleg = gaindeBusinessDelegate.rechercherByWhereDelegation("from Delegation where 1 = 1 and agentEmetteur = '"
							+ rcDelegationsForm.getNumListAgentEmetteurOB()	+ "'");

			if (vOldDeleg.size() > 0) {
				for (int i = 0; i < vOldDeleg.size(); i++) {
					Delegation vo = (Delegation)  vOldDeleg.get(i);
					
					gaindeBusinessDelegate.supprimerDelegation(new DelegationKey(vo.getDateDebut(), vo.getAgentEmetteur(), vo
							.getAgentDestinataire(), vo.getCodeFonction(), vo
							.getCodeGroupe()));
				}
				messageRetour = ConstErrCodRC.succesDelegation; 
			}

			vNewDeleg = rcDelegationsForm.getListeDelegations();
			if (vNewDeleg.size() > 0) {
				//On ajoute l'ensemble des fonctionnalit�s choisies
				for (int i = 0; i < vNewDeleg.size(); i++) {
					DelegationDto delegationDto = (DelegationDto) vNewDeleg.get(i);
					delegationsVO.setAgentDestinataire(delegationDto.getAgentDestinataire());
					delegationsVO.setAgentEmetteur(delegationDto.getAgentEmetteur());
					delegationsVO.setCodeFonction(delegationDto.getCodeFonction());
					delegationsVO.setCodeGroupe(delegationDto.getCodeGroupe());
					delegationsVO.setCodeProfil(delegationDto.getCodeProfil());
					delegationsVO.setDateDebut(delegationDto.getDateDebut());
					delegationsVO.setDatefin(delegationDto.getDateFin());

					//On ex�cute la commande d'ajout
					gaindeBusinessDelegate.ajouterDelegation(delegationsVO);
				}
			}

			addActionError(getText(messageRetour));
			//On forward si succes
			forward = page;

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
			//On forward
			forward = "saisieRcDelegations";
		} finally {
			setupDelegations(rcDelegationsForm);
			forward = page;
		}

		return forward;
	}

	/** ******************* */
	/** * INITIALISATION ** */
	/** ******************* */
	public String unspecified() throws Exception {
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String forward = null;
		String page = request.getParameter(ConstManif.PAGE);

		String buruser = Session.getCodeBurAct(request);

		try {
			// On doit r�cup�rer le bureau de l'agent connect�
			if(Session.getCodeuser(request).equals("A00001")) {
				rcDelegationsForm.setBuragent("10S");
			} else {
				rcDelegationsForm.setBuragent(buruser);
			}
			List<Delegation> listeDelegation = gaindeBusinessDelegate
					.getListeDelegations("from Delegation where 1 = 1  and agentEmetteur = '"+Session.getCodeuser(request)+"'");
			List<DelegationDto> liste = new ArrayList<DelegationDto>();
			for (Delegation list : listeDelegation) {
				
				DelegationDto delegationDto = new DelegationDto();
				
				delegationDto.setAgentDestinataire(list.getAgentDestinataire());
				delegationDto.setAgentEmetteur(list.getAgentEmetteur());
				delegationDto.setCodeFonction(list.getCodeFonction());
				delegationDto.setCodeGroupe(list.getCodeGroupe());
				delegationDto.setCodeProfil(list.getCodeProfil());
				delegationDto.setDateDebut(list.getDateDebut());
				delegationDto.setDateFin(list.getDateFin());
				delegationDto.setLibgroupe(gaindeBusinessDelegate.findGroupeFonctionByPrimaryKey(list.getCodeGroupe()).getRcLibGroupe());
				delegationDto.setLibfonction(gaindeBusinessDelegate.findFonctionnaliteByPrimaryKey(list.getCodeFonction()).getRcLibFonction());
								
				liste.add(delegationDto);
			}
			
			
			rcDelegationsForm.setListeDelegations(liste);
			rcDelegationsForm.setNumListAgentEmetteurOB(Session
					.getCodeuser(request));
			rcDelegationsForm.reset();

		} catch (Exception e) {
			addActionError(getText(e.getMessage()));
		} finally {
			setupDelegations(rcDelegationsForm);
			forward = page;
		}
		return forward; 
	}

	private void setupDelegations(RcDelegationsForm delegationsFB) throws TwreException, RcEjbException, FinderException {
	
		HttpServletRequest request = ServletActionContext.getRequest();
		String codeprofil = Session.getUtilisateurSession(request)
				.getRcCodeProfil();
	
		List v = null;
		List vGroupe = new ArrayList();
		
		// On r�cup�re les groupes de fonctions attribu�s au profil
		v = gaindeBusinessDelegate.getListeGroupefonctionDelegations(codeprofil);
		GroupeFonction vo = null;
		vGroupe.add(new LabelValue("", ""));
		for (int i = 0; i < v.size(); i++) {
			vo = (GroupeFonction) v.get(i);
			vGroupe.add(new LabelValue(ConvertUtil.converToString(vo
					.getRcCodeGroupe())
					+ " - " + vo.getRcLibGroupe(), ConvertUtil
					.converToString(vo.getRcCodeGroupe())
					+ " - " + vo.getRcLibGroupe()));
		}

		request.setAttribute(ConstRC.LISTEGROUPEFONC, vGroupe);
		delegationsFB.setListGroupeFonc(vGroupe);

		request.setAttribute(ConstRC.LISTEFONCTIONNALITE, new ArrayList());
		delegationsFB.setListFonctionnalite(new ArrayList());

		delegationsFB.setFonctionnalites(gaindeBusinessDelegate
				.getFonctionnalitesString());
		delegationsFB.setRegroupfonction(gaindeBusinessDelegate
				.getRegroupFoncString());

	}

	private int getIndexPk(List listeDelegations, String pk) {
		int j = 0;
		for (int i = 0; i < listeDelegations.size(); i++) {
			DelegationDto delegationsVO = (DelegationDto) listeDelegations
					.get(i);
			if (delegationsVO.getPk() != null
					&& delegationsVO.getPk().equals(pk)) {
				j = i;
				break;
			}
		}
		return j;
	}
	@Override
	public RcDelegationsForm getModel() {		
		return rcDelegationsForm;
	}


	@Override
	public String getScopeKey() {		
		return scopeKey;
	}


	@Override
	public void setModel(RcDelegationsForm form) {
		this.rcDelegationsForm = form;
		
	}

	@Override
	public void setScopeKey(String scope) {
		this.scopeKey = scope;
		
	}


	public RcDelegationsForm getRcDelegationsForm() {
		return rcDelegationsForm;
	}


	public void setRcDelegationsForm(RcDelegationsForm rcDelegationsForm) {
		this.rcDelegationsForm = rcDelegationsForm;
	}
}