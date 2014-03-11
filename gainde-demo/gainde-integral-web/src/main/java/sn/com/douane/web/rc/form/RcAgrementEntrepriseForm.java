/*
 * Cr�� le 19 mai 2011
 *
 * TODO Pour changer le mod�le de ce fichier g�n�r�, allez � :
 * Fen�tre - Pr�f�rences - Java - Style de code - Mod�les de code
 */
package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import sn.com.douane.ejb.rc.model.entities.AgrementEntreprise;
import sn.com.douane.ejb.rc.model.entities.AgrementRgrpProd;
import sn.com.douane.utils.sysEnv;


public class RcAgrementEntrepriseForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String pk;
	private String etat;
	 
	/*** Attributs Table AGREMENTENTREPRISE ***/
	 
	private String numRcAgrentOB;
	private String numRcRgrPaysOB;
	private String numListRcCodPaysOB;
	private String numRcTitreEnt;
	private String numRcrSocialeCent; 
	private String numRcAdresseEnt; 
	private String datRcDateAgrement;   
	private String datRcDatCloture;       
	 
	/*** Attributs Table AGREMENTRGRPPROD ***/
	      
	private String numListRcCodePaysOB;
	private String numRcNumEntrepriseOB;   
	private String numListRcCodeProdOB;       
	private String numListRcPrecuemoaProdOB;       
	private String numListRcPrecsenProdOB;
	private String numRcCodeImpExpOB;
	private String numRcCodeRegroupementOB;
	private String numListRcCodeTaxe;   
	private String datRcDateApplication;
	private String numListRcCodeTaux;
	private String numRcValquotite;
	private String datRcDateClotureProd; 

	//Champs de recherche 
	
	private String numRcAgrentOBrech;  
	private String numListRcCodPaysOBrech;          
	private String numListRcCodeProdOBrech;  
	private String numListRcPrecuemoaProdOBrech;
	private String numListRcPrecsenProdOBrech; 
	private String libelle;
	/**
	 * variables du Grid 
	 */
	private Integer rows ;
	private Integer page ;
	private String  sord;
	private String  sidx;
	private Integer total;
	private Integer records;
	private String index;
	
	private List listeRegroupement=new ArrayList();
	private List listeRcAgrementEntrprise = new ArrayList();
	private List listeRcAgrementRgrprpod = new ArrayList();
	private AgrementEntreprise agrementEntrepriseVO = new AgrementEntreprise();
	private AgrementRgrpProd agrementrgrpprodVO = new AgrementRgrpProd();
	

	/*** M�thode getNewAGREMENTENTREPRISEVO () ***/
	public AgrementEntreprise getNewRcAgrementEntrepriseVO() {
		AgrementEntreprise agrementEntreprisevo = new AgrementEntreprise();
		
		agrementEntreprisevo.setRcAgrent(getNumRcAgrentOB().trim());
		agrementEntreprisevo.setRcCodPays(getNumListRcCodPaysOB().trim());
		agrementEntreprisevo.setRcAdresseEnt(getNumRcAdresseEnt().trim());
		if (getDatRcDatCloture()!=null && !getDatRcDatCloture().equals("")){
		agrementEntreprisevo.setRcDatCloture(new Timestamp(sysEnv.strToTimestamp(getDatRcDatCloture()).getTime()));
		}
		if (getDatRcDateAgrement()!=null && !getDatRcDateAgrement().equals("")){
		agrementEntreprisevo.setRcDateAgrement(new Timestamp(sysEnv.strToTimestamp(getDatRcDateAgrement()).getTime()));
		}
		agrementEntreprisevo.setRcRgrPays(getNumRcRgrPaysOB().trim());
		agrementEntreprisevo.setRcrSocialeCent(getNumRcrSocialeCent().trim());
		agrementEntreprisevo.setRcTitreEnt(getNumRcTitreEnt().trim());
		
		return agrementEntreprisevo;
	}
	
	/*** M�thode setAGREMENTENTREPRISEVO () ***/
	public void setAgrementEntreprise (AgrementEntreprise agrementEntrepriseVO) {
		setNumRcAdresseEnt(agrementEntrepriseVO.getRcAdresseEnt());
		setNumRcAgrentOB(agrementEntrepriseVO.getRcAgrent());
		setNumListRcCodPaysOB(agrementEntrepriseVO.getRcCodPays());
		if (agrementEntrepriseVO.getRcDatCloture()!=null){
		setDatRcDatCloture(sysEnv.dateToStr(new Date(agrementEntrepriseVO.getRcDatCloture().getTime())));
		}
		if (agrementEntrepriseVO.getRcDateAgrement()!=null){
		setDatRcDateAgrement(sysEnv.dateToStr(new Date(agrementEntrepriseVO.getRcDateAgrement().getTime())));
		}
		setNumRcRgrPaysOB(agrementEntrepriseVO.getRcRgrPays());
		setNumRcrSocialeCent(agrementEntrepriseVO.getRcrSocialeCent());
		setNumRcTitreEnt(agrementEntrepriseVO.getRcTitreEnt());
	}
	 
	
	/*** M�thode getNewAgrementrgrpprodVO () ***/
	public AgrementRgrpProd getNewRcAgrementrgrpprodVO() {
		AgrementRgrpProd agrementrgrpprodVO = new AgrementRgrpProd();
		
		agrementrgrpprodVO.setRcCodeImpExp(getNumRcCodeImpExpOB());
		agrementrgrpprodVO.setRcCodePays(getNumListRcCodePaysOB());
		agrementrgrpprodVO.setRcCodeProd(getNumListRcCodeProdOB());
		agrementrgrpprodVO.setRcCodeRegroupement(getNumRcCodeRegroupementOB());
		agrementrgrpprodVO.setRcCodeTaux(getNumListRcCodeTaux());
		agrementrgrpprodVO.setRcCodeTaxe(getNumListRcCodeTaxe());
		if (getDatRcDateApplication()!=null && !getDatRcDateApplication().equals("")){
		agrementrgrpprodVO.setRcDateApplication(new Date(sysEnv.strToDate(getDatRcDateApplication()).getTime()));
		}
		if (getDatRcDateClotureProd()!=null && !getDatRcDateClotureProd().equals("")){
		agrementrgrpprodVO.setRcDateCloture(new Date(sysEnv.strToDate(getDatRcDateClotureProd()).getTime()));
		}
		agrementrgrpprodVO.setRcNumEntreprise(getNumRcNumEntrepriseOB());
		agrementrgrpprodVO.setRcPrecSenProd(getNumListRcPrecsenProdOB());
		agrementrgrpprodVO.setRcPrecUemoaProd(getNumListRcPrecuemoaProdOB());
		if (getNumRcValquotite()!=null && !getNumRcValquotite().equals("")){
		agrementrgrpprodVO.setRcValQuotite(new BigDecimal(getNumRcValquotite()));
		}
		return agrementrgrpprodVO;
	}
	
	/*** M�thode setAgrementrgrpprodVO () ***/
	public void setAgrementRgrpProd (AgrementRgrpProd agrementrgrpprodVO) {
		setNumRcCodeImpExpOB(agrementrgrpprodVO.getRcCodeImpExp());
		setNumListRcCodePaysOB(agrementrgrpprodVO.getRcCodePays());
		setNumListRcCodeProdOB(agrementrgrpprodVO.getRcCodeProd());
		setNumRcCodeRegroupementOB(agrementrgrpprodVO.getRcCodeRegroupement());
		setNumListRcCodeTaux(agrementrgrpprodVO.getRcCodeTaux());
		setNumListRcCodeTaxe(agrementrgrpprodVO.getRcCodeTaxe());
		if (agrementrgrpprodVO.getRcDateApplication()!=null){
			setDatRcDateApplication(sysEnv.dateToStr(new Date(agrementrgrpprodVO.getRcDateApplication().getTime())));
		}
		if (agrementrgrpprodVO.getRcDateCloture()!=null){
			setDatRcDateClotureProd(sysEnv.dateToStr(new Date(agrementrgrpprodVO.getRcDateCloture().getTime())));
		}
		setNumRcNumEntrepriseOB(agrementrgrpprodVO.getRcNumEntreprise());
		setNumListRcPrecsenProdOB(agrementrgrpprodVO.getRcPrecSenProd());
		setNumListRcPrecuemoaProdOB(agrementrgrpprodVO.getRcPrecUemoaProd());
		setNumRcValquotite(sysEnv.BigdecimalToStr(agrementrgrpprodVO.getRcValQuotite()));
	}
	
	/*** M�thode reset() pour produit ***/
	public void resetProduits(HttpServletRequest arg1) {
		
		numListRcCodePaysOB="";
		numRcNumEntrepriseOB="";   
		numListRcCodeProdOB="";       
	    numListRcPrecuemoaProdOB="";       
		numListRcPrecsenProdOB="";
		numRcCodeImpExpOB="";
		numRcCodeRegroupementOB="";
		numListRcCodeTaxe="";   
	    datRcDateApplication="";
	    numListRcCodeTaux="";
	    numRcValquotite="";
		datRcDateClotureProd=""; 
	}
	
	/*** M�thode reset() pour entreprise ***/
	public void resetEntreprise(HttpServletRequest arg1) {

	    numRcAgrentOB="";
		numRcRgrPaysOB="";
		numListRcCodPaysOB="";
		numRcTitreEnt="";
	    numRcrSocialeCent=""; 
	    numRcAdresseEnt=""; 
	    datRcDateAgrement="";   
	    datRcDatCloture="";  
	}
	
	/*** M�thode reset() pour recherche produits ***/
	public void resetrechercheProduits(HttpServletRequest arg1) {         
		 numListRcCodeProdOBrech="";  
		 numListRcPrecuemoaProdOBrech="";
		 numListRcPrecsenProdOBrech="";
	}

	public String getPk() {
		return pk;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

	public String getEtat() {
		return etat;
	}

	public void setEtat(String etat) {
		this.etat = etat;
	}

	public String getNumRcAgrentOB() {
		String []pk = numRcAgrentOB.split(",");
		return pk[0];
	}

	public void setNumRcAgrentOB(String numRcAgrentOB) {
		this.numRcAgrentOB = numRcAgrentOB;
	}

	public String getNumRcRgrPaysOB() {
		return numRcRgrPaysOB;
	}

	public void setNumRcRgrPaysOB(String numRcRgrPaysOB) {
		this.numRcRgrPaysOB = numRcRgrPaysOB;
	}

	public String getNumListRcCodPaysOB() {
		return numListRcCodPaysOB;
	}

	public void setNumListRcCodPaysOB(String numListRcCodPaysOB) {
		this.numListRcCodPaysOB = numListRcCodPaysOB;
	}

	public String getNumRcTitreEnt() {
		return numRcTitreEnt;
	}

	public void setNumRcTitreEnt(String numRcTitreEnt) {
		this.numRcTitreEnt = numRcTitreEnt;
	}

	public String getNumRcrSocialeCent() {
		return numRcrSocialeCent;
	}

	public void setNumRcrSocialeCent(String numRcrSocialeCent) {
		this.numRcrSocialeCent = numRcrSocialeCent;
	}

	public String getNumRcAdresseEnt() {
		return numRcAdresseEnt;
	}

	public void setNumRcAdresseEnt(String numRcAdresseEnt) {
		this.numRcAdresseEnt = numRcAdresseEnt;
	}

	public String getDatRcDateAgrement() {
		return datRcDateAgrement;
	}

	public void setDatRcDateAgrement(String datRcDateAgrement) {
		this.datRcDateAgrement = datRcDateAgrement;
	}

	public String getDatRcDatCloture() {
		return datRcDatCloture;
	}

	public void setDatRcDatCloture(String datRcDatCloture) {
		this.datRcDatCloture = datRcDatCloture;
	}

	public String getNumListRcCodePaysOB() {
		return numListRcCodePaysOB;
	}

	public void setNumListRcCodePaysOB(String numListRcCodePaysOB) {
		this.numListRcCodePaysOB = numListRcCodePaysOB;
	}

	public String getNumRcNumEntrepriseOB() {
		return numRcNumEntrepriseOB;
	}

	public void setNumRcNumEntrepriseOB(String numRcNumEntrepriseOB) {
		this.numRcNumEntrepriseOB = numRcNumEntrepriseOB;
	}

	public String getNumListRcCodeProdOB() {
		return numListRcCodeProdOB;
	}

	public void setNumListRcCodeProdOB(String numListRcCodeProdOB) {
		this.numListRcCodeProdOB = numListRcCodeProdOB;
	}

	public String getNumListRcPrecuemoaProdOB() {
		return numListRcPrecuemoaProdOB;
	}

	public void setNumListRcPrecuemoaProdOB(String numListRcPrecuemoaProdOB) {
		this.numListRcPrecuemoaProdOB = numListRcPrecuemoaProdOB;
	}

	public String getNumListRcPrecsenProdOB() {
		return numListRcPrecsenProdOB;
	}

	public void setNumListRcPrecsenProdOB(String numListRcPrecsenProdOB) {
		this.numListRcPrecsenProdOB = numListRcPrecsenProdOB;
	}

	public String getNumRcCodeImpExpOB() {
		return numRcCodeImpExpOB;
	}

	public void setNumRcCodeImpExpOB(String numRcCodeImpExpOB) {
		this.numRcCodeImpExpOB = numRcCodeImpExpOB;
	}

	public String getNumRcCodeRegroupementOB() {
		return numRcCodeRegroupementOB;
	}

	public void setNumRcCodeRegroupementOB(String numRcCodeRegroupementOB) {
		this.numRcCodeRegroupementOB = numRcCodeRegroupementOB;
	}

	public String getNumListRcCodeTaxe() {
		return numListRcCodeTaxe;
	}

	public void setNumListRcCodeTaxe(String numListRcCodeTaxe) {
		this.numListRcCodeTaxe = numListRcCodeTaxe;
	}

	public String getDatRcDateApplication() {
		return datRcDateApplication;
	}

	public void setDatRcDateApplication(String datRcDateApplication) {
		this.datRcDateApplication = datRcDateApplication;
	}

	public String getNumListRcCodeTaux() {
		return numListRcCodeTaux;
	}

	public void setNumListRcCodeTaux(String numListRcCodeTaux) {
		this.numListRcCodeTaux = numListRcCodeTaux;
	}

	public String getNumRcValquotite() {
		return numRcValquotite;
	}

	public void setNumRcValquotite(String numRcValquotite) {
		this.numRcValquotite = numRcValquotite;
	}

	public String getDatRcDateClotureProd() {
		return datRcDateClotureProd;
	}

	public void setDatRcDateClotureProd(String datRcDateClotureProd) {
		this.datRcDateClotureProd = datRcDateClotureProd;
	}

	public String getNumRcAgrentOBrech() {
		return numRcAgrentOBrech;
	}

	public void setNumRcAgrentOBrech(String numRcAgrentOBrech) {
		this.numRcAgrentOBrech = numRcAgrentOBrech;
	}

	public String getNumListRcCodPaysOBrech() {
		return numListRcCodPaysOBrech;
	}

	public void setNumListRcCodPaysOBrech(String numListRcCodPaysOBrech) {
		this.numListRcCodPaysOBrech = numListRcCodPaysOBrech;
	}

	public String getNumListRcCodeProdOBrech() {
		return numListRcCodeProdOBrech;
	}

	public void setNumListRcCodeProdOBrech(String numListRcCodeProdOBrech) {
		this.numListRcCodeProdOBrech = numListRcCodeProdOBrech;
	}

	public String getNumListRcPrecuemoaProdOBrech() {
		return numListRcPrecuemoaProdOBrech;
	}

	public void setNumListRcPrecuemoaProdOBrech(String numListRcPrecuemoaProdOBrech) {
		this.numListRcPrecuemoaProdOBrech = numListRcPrecuemoaProdOBrech;
	}

	public String getNumListRcPrecsenProdOBrech() {
		return numListRcPrecsenProdOBrech;
	}

	public void setNumListRcPrecsenProdOBrech(String numListRcPrecsenProdOBrech) {
		this.numListRcPrecsenProdOBrech = numListRcPrecsenProdOBrech;
	}

	public List getListeRegroupement() {
		return listeRegroupement;
	}

	public void setListeRegroupement(List listeRegroupement) {
		this.listeRegroupement = listeRegroupement;
	}

	public List getListeRcAgrementEntrprise() {
		return listeRcAgrementEntrprise;
	}

	public void setListeRcAgrementEntrprise(List listeRcAgrementEntrprise) {
		this.listeRcAgrementEntrprise = listeRcAgrementEntrprise;
	}

	public List getListeRcAgrementRgrprpod() {
		return listeRcAgrementRgrprpod;
	}

	public void setListeRcAgrementRgrprpod(List listeRcAgrementRgrprpod) {
		this.listeRcAgrementRgrprpod = listeRcAgrementRgrprpod;
	}

	public AgrementEntreprise getAgrementEntrepriseVO() {
		return agrementEntrepriseVO;
	}

	public void setAgrementEntrepriseVO(AgrementEntreprise agrementEntrepriseVO) {
		this.agrementEntrepriseVO = agrementEntrepriseVO;
	}

	public AgrementRgrpProd getAgrementrgrpprodVO() {
		return agrementrgrpprodVO;
	}

	public void setAgrementrgrpprodVO(AgrementRgrpProd agrementrgrpprodVO) {
		this.agrementrgrpprodVO = agrementrgrpprodVO;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public String getSord() {
		return sord;
	}

	public void setSord(String sord) {
		this.sord = sord;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Integer getRecords() {
		return records;
	}

	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
