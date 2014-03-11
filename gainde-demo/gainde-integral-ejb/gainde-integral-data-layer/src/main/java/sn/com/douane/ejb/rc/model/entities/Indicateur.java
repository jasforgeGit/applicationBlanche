package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Column; 

/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="INDICATEUR")
public class Indicateur implements Serializable{

	private static final long serialVersionUID = -6124718140862896702L;

	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
	private String rcCodeIndicateur;

	@Column(name="RCLIBELLEINDICATEUR", length=250, nullable=false)
	private String rcLibelleIndicateur;

	@Column(name="RCTYPEINDICATEUR", length=10, nullable=false)
	private String rcTypeIndicateur;


	@OneToMany(mappedBy = "indIndRegdou", targetEntity = IndicateurRegdou.class)
	private List<IndicateurRegdou> indicateurRegdous;
		 

	@OneToMany(mappedBy = "indIndRegime", targetEntity = IndicateurRegime.class)
	private List<IndicateurRegime> indicateurRegimes;
		 
	
	@OneToMany(mappedBy = "indSoumCred", targetEntity = SoumissionCreditaire.class)
	private List<SoumissionCreditaire> soumissionCreditaire;
		
	@OneToMany(mappedBy = "indicateurProd", targetEntity = SoumissionProduit.class)
	private List<SoumissionProduit> soumissionProduits;
 
	@OneToMany(mappedBy = "indTaxSusp", targetEntity = TaxesSuspendus.class)
	private List<TaxesSuspendus> taxesSuspendus;
	
	@OneToMany(mappedBy = "indIndRegime", targetEntity = IndicateurPpm.class)
	private List<IndicateurPpm> indicateurPpms;

	/**
	 * 0-args constructeur
	 */
	public Indicateur() {		
	}
	
	/**
	 * 
	 * @param rcCodeIndicateur
	 */
	public Indicateur(String rcCodeIndicateur) {
		super();
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	/**
	 * 3-args constructeurs
	 * @param codeIndicateur
	 * @param libelleIndicateur
	 * @param typeIndicateur
	 */
	public Indicateur(String codeIndicateur, 
			String libelleIndicateur, String typeIndicateur) {
		super(); 
		this.rcCodeIndicateur = codeIndicateur;
		this.rcLibelleIndicateur = libelleIndicateur; 
		this.rcTypeIndicateur = typeIndicateur; 
	}
	
	/**
	 * Get accessor for persistent attribute : codeIndicateur
	 */
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	/**
	 * Set accessor for persistent attribute: codeIndicateur
	 * @param codeIndicateur
	 */
	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	/**
	 * Get accessor for persistent attribute : libelleIndicateur
	 */
	public String getRcLibelleIndicateur() {
		return rcLibelleIndicateur;
	}

	/**
	 * Set accessor for persistent attribute: libelleIndicateur
	 * @param libelleIndicateur
	 */
	public void setRcLibelleIndicateur(String rcLibelleIndicateur) {
		this.rcLibelleIndicateur = rcLibelleIndicateur;
	}

	/**
	 * Get accessor for persistent attribute : typeIndicateur
	 */
	public String getRcTypeIndicateur() {
		return rcTypeIndicateur;
	}

	/**
	 * Set accessor for persistent attribute: typeIndicateur
	 * @param typeIndicateur
	 */
	public void setRcTypeIndicateur(String rcTypeIndicateur) {
		this.rcTypeIndicateur = rcTypeIndicateur;
	}

	 /**
		 * This method was generated for supporting the relationship role named
		 * soumissioncreditaire. 
		 */
	    public List<SoumissionCreditaire> getSoumissionCreditaire() {
	        return soumissionCreditaire;
	    }

	    /**
		 * This method was generated for supporting the relationship role named
		 * soumissioncreditaire. 
		 */
		public void setSoumissioncreditaire(
				List<SoumissionCreditaire> soumissionCreditaire) {
	        this.soumissionCreditaire = soumissionCreditaire;
	    }

		public List<IndicateurRegdou> getIndicateurRegdous() {
			return indicateurRegdous;
		}

		public void setIndicateurRegdous(List<IndicateurRegdou> indicateurRegdous) {
			this.indicateurRegdous = indicateurRegdous;
		}

		public List<IndicateurRegime> getIndicateurRegimes() {
			return indicateurRegimes;
		}

		public void setIndicateurRegimes(List<IndicateurRegime> indicateurRegimes) {
			this.indicateurRegimes = indicateurRegimes;
		}

		public List<TaxesSuspendus> getTaxesSuspendus() {
			return taxesSuspendus;
		}

		public void setTaxesSuspendus(List<TaxesSuspendus> taxesSuspendus) {
			this.taxesSuspendus = taxesSuspendus;
		}

		public List<SoumissionProduit> getSoumissionProduits() {
			return soumissionProduits;
		}

		public void setSoumissionProduits(List<SoumissionProduit> soumissionProduits) {
			this.soumissionProduits = soumissionProduits;
		}

		public List<IndicateurPpm> getIndicateurPpms() {
			return indicateurPpms;
		}

		public void setIndicateurPpms(List<IndicateurPpm> indicateurPpms) {
			this.indicateurPpms = indicateurPpms;
		}
}
