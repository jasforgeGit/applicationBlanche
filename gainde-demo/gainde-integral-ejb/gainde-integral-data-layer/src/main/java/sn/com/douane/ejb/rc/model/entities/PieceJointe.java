package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

/**
 * BureauProduit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "PiecesJointes")
public class PieceJointe implements Serializable {
	
	private static final long serialVersionUID = 308539576767346788L;
	
	@Id
	@Column(name = "RCCODEPIECEJOINTE", length = 3, nullable = false)
	private String rcCodePieceJointe;
	
	@Column(name = "RCDESPIECEJOINTE", length = 200, nullable = false)
    private String rcDesPieceJointe;
    
	@Column(name = "RCDATEPIECEJOINTE", nullable = false)
    private java.sql.Date rcDatePieceJointe;
	
	@Column(name = "RCNATUREPIECEJOINTE", length = 1)
    private String rcNaturePieceJointe;
    
	@OneToMany(mappedBy = "pieceJointe", targetEntity = DispensePieceJointe.class)
    private List<DispensePieceJointe> dispenses;
    
	@OneToMany(mappedBy = "pieceJointe", targetEntity = CatreGroupPieceJointe.class)
    private List<CatreGroupPieceJointe> catregrouppjs;
    
	@OneToMany(mappedBy = "pieceJointe", targetEntity = PieceJointeRegime.class)
    private List<PieceJointeRegime> pjtregimes;
    
	@OneToMany(mappedBy = "pieceJointe", targetEntity = ProduitPjt.class)
    private List<ProduitPjt> produitsPjt;
    
	@OneToMany(mappedBy = "pieceJointe", targetEntity = SoumissionDoc.class)
    private List<SoumissionDoc> soumissiondocs;    
	
	@ManyToOne	
	@JoinColumn(name = "RCNATUREPIECEJOINTE", insertable = false, updatable = false)
    private NaturePieceJointe naturePieceJointe;
	
	/**
	 * 0-args constructor.
	 */    
    public PieceJointe() {
		super();
	}

    public PieceJointe(String rccodepiecejointe) {
		super();
		this.rcCodePieceJointe = rccodepiecejointe;
	}

	

	public String getRcCodePieceJointe() {
		return rcCodePieceJointe;
	}



	public void setRcCodePieceJointe(String rcCodePieceJointe) {
		this.rcCodePieceJointe = rcCodePieceJointe;
	}



	public String getRcDesPieceJointe() {
		return rcDesPieceJointe;
	}



	public void setRcDesPieceJointe(String rcDesPieceJointe) {
		this.rcDesPieceJointe = rcDesPieceJointe;
	}



	public java.sql.Date getRcDatePieceJointe() {
		return rcDatePieceJointe;
	}



	public void setRcDatePieceJointe(java.sql.Date rcDatePieceJointe) {
		this.rcDatePieceJointe = rcDatePieceJointe;
	}

	public List<DispensePieceJointe> getDispenses() {
		return dispenses;
	}



	public void setDispenses(List<DispensePieceJointe> dispenses) {
		this.dispenses = dispenses;
	}



	public List<CatreGroupPieceJointe> getCatregrouppjs() {
		return catregrouppjs;
	}



	public void setCatregrouppjs(List<CatreGroupPieceJointe> catregrouppjs) {
		this.catregrouppjs = catregrouppjs;
	}




	public List<PieceJointeRegime> getPjtregimes() {
		return pjtregimes;
	}

	public void setPjtregimes(List<PieceJointeRegime> pjtregimes) {
		this.pjtregimes = pjtregimes;
	}



	public NaturePieceJointe getNaturePieceJointe() {
		return naturePieceJointe;
	}



	public void setNaturePieceJointe(NaturePieceJointe naturePieceJointe) {
		this.naturePieceJointe = naturePieceJointe;
	}



	public List<ProduitPjt> getProduitsPjt() {
		return produitsPjt;
	}



	public void setProduitsPjt(List<ProduitPjt> produitsPjt) {
		this.produitsPjt = produitsPjt;
	}



	public List<SoumissionDoc> getSoumissiondocs() {
		return soumissiondocs;
	}



	public void setSoumissiondocs(List<SoumissionDoc> soumissiondocs) {
		this.soumissiondocs = soumissiondocs;
	}



	public String getRcNaturePieceJointe() {
		return rcNaturePieceJointe;
	}



	public void setRcNaturePieceJointe(String rcNaturePieceJointe) {
		this.rcNaturePieceJointe = rcNaturePieceJointe;
	}
	
	
	
}
