package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ChapitreSection")
public class ChapitreSection implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RCCODECHAPITRE" ,length = 2)
	private String rccodechapitre;
	
	@Column(name = "RCLIBELLECHAPITRE" ,length = 2000 ,nullable = false)
	private String rclibellechapitre;
	
	
	@Column(name = "RCCODESECTION" ,length = 2,nullable = false)
	private String rccodesection;
	
	@Column(name = "RCCODEROMAINSECTION" ,length = 5,nullable = false)
	private String rccoderomainsection;
	
	@Column(name = "RCNOTECHAPITRE" ,length = 255)
	private String rcnotechapitre;
	
	@OneToMany(mappedBy = "chapitreSection", targetEntity = Produit.class)
	private List<Produit> produits = new ArrayList<Produit>();
	

	public ChapitreSection() {
		
	}

	public ChapitreSection(String rccodechapitre, String rclibellechapitre,
			String rccodesection, String rccoderomainsection) {
		super();
		this.rccodechapitre = rccodechapitre;
		this.rclibellechapitre = rclibellechapitre;
		this.rccodesection = rccodesection;
		this.rccoderomainsection = rccoderomainsection;
	}

	public java.lang.String getRccodechapitre() {
		return rccodechapitre;
	}

	public void setRccodechapitre(java.lang.String rccodechapitre) {
		this.rccodechapitre = rccodechapitre;
	}

	public java.lang.String getRclibellechapitre() {
		return rclibellechapitre;
	}

	public void setRclibellechapitre(java.lang.String rclibellechapitre) {
		this.rclibellechapitre = rclibellechapitre;
	}

	public java.lang.String getRccodesection() {
		return rccodesection;
	}

	public void setRccodesection(java.lang.String rccodesection) {
		this.rccodesection = rccodesection;
	}

	public java.lang.String getRccoderomainsection() {
		return rccoderomainsection;
	}

	public void setRccoderomainsection(java.lang.String rccoderomainsection) {
		this.rccoderomainsection = rccoderomainsection;
	}

	public java.lang.String getRcnotechapitre() {
		return rcnotechapitre;
	}

	public void setRcnotechapitre(java.lang.String rcnotechapitre) {
		this.rcnotechapitre = rcnotechapitre;
	}

	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

}