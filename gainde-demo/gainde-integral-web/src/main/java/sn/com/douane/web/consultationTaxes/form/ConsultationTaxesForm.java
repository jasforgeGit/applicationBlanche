package sn.com.douane.web.consultationTaxes.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ConsultationTaxesForm implements Serializable {

	private static final long serialVersionUID = 1L;
	private String etat;
	private String pk;
	
	//Attributs de recherche taxes
	private String numRcCodeTaxeRech;
	private String numRcLibelleTaxeRech;
	
	//Attributs de recherche taux
	private String numRcCodeTauxRech;
	private String numRcLibelleTauxRech;
	
	private String rccodetaxe;
	
	private List listeTaxes = new ArrayList();
	private List listeTaux = new ArrayList();
	
	public String getEtat() {
		return etat;
	}
	public void setEtat(String etat) {
		this.etat = etat;
	}
	public String getPk() {
		return pk;
	}
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getNumRcCodeTaxeRech() {
		return numRcCodeTaxeRech;
	}
	public void setNumRcCodeTaxeRech(String numRcCodeTaxeRech) {
		this.numRcCodeTaxeRech = numRcCodeTaxeRech;
	}
	public String getNumRcLibelleTaxeRech() {
		return numRcLibelleTaxeRech;
	}
	public void setNumRcLibelleTaxeRech(String numRcLibelleTaxeRech) {
		this.numRcLibelleTaxeRech = numRcLibelleTaxeRech;
	}
	public String getNumRcCodeTauxRech() {
		return numRcCodeTauxRech;
	}
	public void setNumRcCodeTauxRech(String numRcCodeTauxRech) {
		this.numRcCodeTauxRech = numRcCodeTauxRech;
	}
	public String getNumRcLibelleTauxRech() {
		return numRcLibelleTauxRech;
	}
	public void setNumRcLibelleTauxRech(String numRcLibelleTauxRech) {
		this.numRcLibelleTauxRech = numRcLibelleTauxRech;
	}
	public String getRccodetaxe() {
		return rccodetaxe;
	}
	public void setRccodetaxe(String rccodetaxe) {
		this.rccodetaxe = rccodetaxe;
	}
	public List getListeTaxes() {
		return listeTaxes;
	}
	public void setListeTaxes(List listeTaxes) {
		this.listeTaxes = listeTaxes;
	}
	public List getListeTaux() {
		return listeTaux;
	}
	public void setListeTaux(List listeTaux) {
		this.listeTaux = listeTaux;
	}	
}
