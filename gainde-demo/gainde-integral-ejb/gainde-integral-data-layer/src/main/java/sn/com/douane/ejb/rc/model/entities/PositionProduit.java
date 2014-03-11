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
@Table(name="POSITIONPRODUIT")
public class PositionProduit implements Serializable{

	private static final long serialVersionUID = 5111960727867808175L;

	@Id
	@Column(name="RCCODEPOSITION", length=4, nullable=false)
	private String rcCodePosition;
    
	@Column(name="RCLIBELLEPOSITION", length=1000, nullable=false)
	private String rcLibellePosition;
    
	@Column(name="RCCODECHAPITRE", length=2, nullable=false)
	private String rcCodeChapitre;
    
	@OneToMany(mappedBy = "posPhProduit", targetEntity = HistoProduit.class)
	private List<HistoProduit> histoProduits= new ArrayList<HistoProduit>();
	
	public PositionProduit() {
		
	}

	public PositionProduit(String rcCodePosition, String rcLibellePosition,
			String rcCodeChapitre) {
		super();
		this.rcCodePosition = rcCodePosition;
		this.rcLibellePosition = rcLibellePosition;
		this.rcCodeChapitre = rcCodeChapitre;
	}

	/**
	 * @return the rcCodePosition
	 */
	public String getRcCodePosition() {
		return rcCodePosition;
	}

	/**
	 * @param rcCodePosition the rcCodePosition to set
	 */
	public void setRcCodePosition(String rcCodePosition) {
		this.rcCodePosition = rcCodePosition;
	}

	/**
	 * @return the rcLibellePosition
	 */
	public String getRcLibellePosition() {
		return rcLibellePosition;
	}

	/**
	 * @param rcLibellePosition the rcLibellePosition to set
	 */
	public void setRcLibellePosition(String rcLibellePosition) {
		this.rcLibellePosition = rcLibellePosition;
	}

	/**
	 * @return the rcCodeChapitre
	 */
	public String getRcCodeChapitre() {
		return rcCodeChapitre;
	}

	/**
	 * @param rcCodeChapitre the rcCodeChapitre to set
	 */
	public void setRcCodeChapitre(String rcCodeChapitre) {
		this.rcCodeChapitre = rcCodeChapitre;
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
