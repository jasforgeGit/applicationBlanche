package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

/**
 * Classe EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "Classe")
public class Classe implements Serializable {
	
	private static final long serialVersionUID = -3228859101630144119L;

	@Id
	@Column(name = "RCCODECLASSE", nullable = false)	
    private Integer rccodeclasse;
    
	@Column(name = "RCLIBELLECLASSE", nullable = false)	
    private String rclibelleclasse;
    
	@OneToMany(mappedBy = "classe", targetEntity = Produit.class)
    private List<Produit> produits = new ArrayList<Produit>();
	
	@OneToMany(mappedBy = "hclassProduit", targetEntity = HistoProduit.class)
    private List<HistoProduit> histoProduits = new ArrayList<HistoProduit>();
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

	/**
	 * 0-args constructor.
	 */
	public Classe() {
		super();
	}
	
	/**
	 * 2-args constructor.
	 * 
	 * @param rccodeclasse
	 * @param rclibelleclasse
	 */
    public Classe(Integer rccodeclasse, String rclibelleclasse) {
		super();
		this.rccodeclasse = rccodeclasse;
		this.rclibelleclasse = rclibelleclasse;
	}

	/**
	 * Get accessor for persistent attribute: rccodeclasse
	 */	
    public Integer getRccodeclasse() {
        return rccodeclasse;
    }
    
	/**
	 * Set accessor for persistent attribute: rccodeclasse
	 */
	public void setRccodeclasse(Integer rccodeclasse) {
        this.rccodeclasse = rccodeclasse;
    }

    /**
	 * Get accessor for persistent attribute: rclibelleclasse
	 */	
    public String getRclibelleclasse() {
        return rclibelleclasse;
    }

    /**
	 * Set accessor for persistent attribute: rclibelleclasse
	 */
	public void setRclibelleclasse(String rclibelleclasse) {
        this.rclibelleclasse = rclibelleclasse;
    }
	
	public List<Produit> getProduits() {
		return produits;
	}

	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rccodeclasse == null) ? 0 : rccodeclasse.hashCode());
		result = prime * result
				+ ((rclibelleclasse == null) ? 0 : rclibelleclasse.hashCode());
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
		Classe other = (Classe) obj;
		if (rccodeclasse == null) {
			if (other.rccodeclasse != null){
				return false;
			}
		} else if (!rccodeclasse.equals(other.rccodeclasse)){
			return false;
		}
		if (rclibelleclasse == null) {
			if (other.rclibelleclasse != null){
				return false;
			}
		} else if (!rclibelleclasse.equals(other.rclibelleclasse)){
			return false;
		}
		return true;
	}

	/**
	 * @return the histoProduits
	 */
	public List<HistoProduit> getHistoProduits() {
		return histoProduits;
	}

	/**
	 * @param histoProduits the histoProduits to set
	 */
	public void setHistoProduits(List<HistoProduit> histoProduits) {
		this.histoProduits = histoProduits;
	}   
	
}

