package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DispensesArtDecKey;

/**
 * @author thouraya
 * 
 * Bean implementation class for Enterprise Bean: Dispensesartdec
 */
@Entity()
@IdClass(DispensesArtDecKey.class)
@Table(name = "DISPENSESARTDEC")
@NamedQueries(@javax.persistence.NamedQuery(name = "DispensesArtDec.findDispenseByArticle" ,
query = "select object(o) from DispensesArtDec o where o.decAnneeEnregDec = ?1 and o.decBurEnregDec = ?2 and  o.decNumDeclaration = ?3 and o.decNumArtDec = ?4"))

public class DispensesArtDec implements Serializable {

	private static final long serialVersionUID = -8225095541659554543L;


	@Id @Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private String decBurEnregDec;

	@Id @Column(name = "DECCODEDISPENSE" , length = 5 , nullable = false)
	private String decCodeDispense;

	@Id @Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDEC" , nullable = false)
	private Integer decNumArtDec;
	
    /***ce champs est ajoute pour calcul pieces jointes**/
	private transient String decCodePieceJointe;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	public DispensesArtDec(String decAnneeEnregDec , String decBurEnregDec , String decCodeDispense , Integer decNumDeclaration , Integer decNumArtDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decCodeDispense = decCodeDispense;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;

	}

	public DispensesArtDec() {
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public String getDecCodeDispense() {
		return decCodeDispense;
	}

	public void setDecCodeDispense(String decCodeDispense) {
		this.decCodeDispense = decCodeDispense;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

	/**
	 * @return the decCodePieceJointe
	 */
	public String getDecCodePieceJointe() {
		return decCodePieceJointe;
	}

	/**
	 * @param decCodePieceJointe the decCodePieceJointe to set
	 */
	public void setDecCodePieceJointe(String decCodePieceJointe) {
		this.decCodePieceJointe = decCodePieceJointe;
	}


}