package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.Taxation2Key;

@Entity
@Table(name = "TAXATION2")
@IdClass(Taxation2Key.class)
public class Taxation2 implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7300343116616922741L;
	@Id
	@Column(name = "PRODUIT", length = 100, nullable = false)
	private String produit;
	@Id
	@Column(name = "DATE_EFFET", nullable = false)
	private Date dateEffet;

	@Column(name = "UNITE", length = 50, nullable = false)
	private String unite;

	@Column(name = "PPI")
	private Double ppi;

	@Column(name = "VALEURCAF")
	private Double valeurCaf;

	@Column(name = "DROIT_PORTE")
	private Double droitPorte;

	@Column(name = "DROIT_DOUANE")
	private Double droitDouane;

	@Column(name = "REDEVANCE_STATISTIQUE")
	private Double redevanceStatistique;

	@Column(name = "BASETVA")
	private Double baseTva;

	@Column(name = "RCPRECSENEGAL", length = 6)
	private String rcPrecSenegal;
	
	@Column(name = "RCPRECUEMOA", length = 6)
	private String rcPrecUemoa;
	
	@Column(name = "RCCODEPROD", length = 6)
	private String rcCodeProd;
	
	@Column(name = "RCPOSITION", length = 4)
	private String rcPosition;

	public String getProduit() {
		return produit;
	}

	public void setProduit(String produit) {
		this.produit = produit;
	}

	public Date getDateEffet() {
		return dateEffet;
	}

	public void setDateEffet(Date dateEffet) {
		this.dateEffet = dateEffet;
	}

	public String getUnite() {
		return unite;
	}

	public void setUnite(String unite) {
		this.unite = unite;
	}

	public Double getPpi() {
		return ppi;
	}

	public void setPpi(Double ppi) {
		this.ppi = ppi;
	}

	public Double getValeurCaf() {
		return valeurCaf;
	}

	public void setValeurCaf(Double valeurCaf) {
		this.valeurCaf = valeurCaf;
	}

	public Double getDroitPorte() {
		return droitPorte;
	}

	public void setDroitPorte(Double droitPorte) {
		this.droitPorte = droitPorte;
	}

	public Double getDroitDouane() {
		return droitDouane;
	}

	public void setDroitDouane(Double droitDouane) {
		this.droitDouane = droitDouane;
	}

	public Double getRedevanceStatistique() {
		return redevanceStatistique;
	}

	public void setRedevanceStatistique(Double redevanceStatistique) {
		this.redevanceStatistique = redevanceStatistique;
	}

	public Double getBaseTva() {
		return baseTva;
	}

	public void setBaseTva(Double baseTva) {
		this.baseTva = baseTva;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPosition() {
		return rcPosition;
	}

	public void setRcPosition(String rcPosition) {
		this.rcPosition = rcPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((baseTva == null) ? 0 : baseTva.hashCode());
		result = prime * result
				+ ((dateEffet == null) ? 0 : dateEffet.hashCode());
		result = prime * result
				+ ((droitDouane == null) ? 0 : droitDouane.hashCode());
		result = prime * result
				+ ((droitPorte == null) ? 0 : droitPorte.hashCode());
		result = prime * result + ((ppi == null) ? 0 : ppi.hashCode());
		result = prime * result + ((produit == null) ? 0 : produit.hashCode());
		result = prime * result
				+ ((rcCodeProd == null) ? 0 : rcCodeProd.hashCode());
		result = prime * result
				+ ((rcPosition == null) ? 0 : rcPosition.hashCode());
		result = prime * result
				+ ((rcPrecSenegal == null) ? 0 : rcPrecSenegal.hashCode());
		result = prime * result
				+ ((rcPrecUemoa == null) ? 0 : rcPrecUemoa.hashCode());
		result = prime
				* result
				+ ((redevanceStatistique == null) ? 0 : redevanceStatistique
						.hashCode());
		result = prime * result + ((unite == null) ? 0 : unite.hashCode());
		result = prime * result
				+ ((valeurCaf == null) ? 0 : valeurCaf.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		Taxation2 other = (Taxation2) obj;
		if (baseTva == null) {
			if (other.baseTva != null){
				return false;
			}
		} else if (!baseTva.equals(other.baseTva)){
			return false;
		}
		if (dateEffet == null) {
			if (other.dateEffet != null){
				return false;
			}
		} else if (!dateEffet.equals(other.dateEffet)){
			return false;
		}
		if (droitDouane == null) {
			if (other.droitDouane != null){
				return false;
			}
		} else if (!droitDouane.equals(other.droitDouane)){
			return false;
		}
		if (droitPorte == null) {
			if (other.droitPorte != null){
				return false;
			}
		} else if (!droitPorte.equals(other.droitPorte)){
			return false;
		}
		if (ppi == null) {
			if (other.ppi != null){
				return false;
			}
		} else if (!ppi.equals(other.ppi)){
			return false;
		}
		if (produit == null) {
			if (other.produit != null){
				return false;
			}
		} else if (!produit.equals(other.produit)){
			return false;
		}
		if (rcCodeProd == null) {
			if (other.rcCodeProd != null){
				return false;
			}
		} else if (!rcCodeProd.equals(other.rcCodeProd)){
			return false;
		}
		if (rcPosition == null) {
			if (other.rcPosition != null){
				return false;
			}
		} else if (!rcPosition.equals(other.rcPosition)){
			return false;
		}
		if (rcPrecSenegal == null) {
			if (other.rcPrecSenegal != null){
				return false;
			}
		} else if (!rcPrecSenegal.equals(other.rcPrecSenegal)){
			return false;
		}
		if (rcPrecUemoa == null) {
			if (other.rcPrecUemoa != null){
				return false;
			}
		} else if (!rcPrecUemoa.equals(other.rcPrecUemoa)){
			return false;
		}
		if (redevanceStatistique == null) {
			if (other.redevanceStatistique != null){
				return false;
			}
		} else if (!redevanceStatistique.equals(other.redevanceStatistique)){
			return false;
		}
		if (unite == null) {
			if (other.unite != null){
				return false;
			}
		} else if (!unite.equals(other.unite)){
			return false;
		}
		if (valeurCaf == null) {
			if (other.valeurCaf != null){
				return false;
			}
		} else if (!valeurCaf.equals(other.valeurCaf)){
			return false;
		}
		return true;
	}
	
	
	

}
