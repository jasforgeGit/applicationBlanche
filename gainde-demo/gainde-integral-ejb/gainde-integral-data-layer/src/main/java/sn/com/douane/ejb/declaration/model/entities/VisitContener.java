package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.VisitContenerKey;

/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: VisitContener
 */

@Entity
@Table(name = "VISITCONTENER")
@IdClass(VisitContenerKey.class)

@javax.persistence.NamedQueries({
	@javax.persistence.NamedQuery(name = "findConteneursOfDeclaration", query = "select object(o) from VisitContener o where o.decAnneeEnregDec = ?1 and o.decBurEnregDec = ?2 and o.decNumDeclaration = ?3"), 
	@javax.persistence.NamedQuery(name = "findVisitConteneurOfArticleDecl", query = "select object(o) from VisitContener o where o.decAnneeEnregDec = ?1 and o.decBurEnregDec = ?2 and o.decNumDeclaration = ?3 and o.decNumArtDec = ?4")})

public class VisitContener implements Serializable {

	private static final long serialVersionUID = 3032287475086261295L;

	@Id @Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Id @Column(name = "DECNUMDECLARATION",  nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDEC",  nullable = false)
	private Integer decNumArtDec;

	@Id @Column(name = "DECNUMARTCONTENEUR", nullable = false)
	private Integer decNumArtConteneur;

	@Column(name = "DECNUMCHASSIS", length = 17)
	private String decNumChassis;

	@Column(name = "DECNUMCONTENEUR", length = 11)
	private String decNumConteneur;

	@Column(name = "DECNUMEROPLOMB", length = 8)
	private String decNumeroPlomb;

	@Column(name = "DECTAILLECONTENEUR", length = 8)
	private String decTailleConteneur;

	@Column(name = "DECTYPECONTENEUR", length = 4)
	private String decTypeConteneur;


	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public VisitContener() {
	
	}

	public VisitContener(String decAnneeEnregDec,String decBurEnregDec,Integer decNumDeclaration,Integer decNumArtDec,Integer decNumArtConteneur) {
		this.decAnneeEnregDec=decAnneeEnregDec;
		this.decBurEnregDec=decBurEnregDec;
		this.decNumDeclaration=decNumDeclaration;
		this.decNumArtDec=decNumArtDec;
		this.decNumArtConteneur=decNumArtConteneur;
	
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

	public Integer getDecNumArtConteneur() {
		return decNumArtConteneur;
	}

	public void setDecNumArtConteneur(Integer decNumArtConteneur) {
		this.decNumArtConteneur = decNumArtConteneur;
	}

	public String getDecNumChassis() {
		return decNumChassis;
	}

	public void setDecNumChassis(String decNumChassis) {
		this.decNumChassis = decNumChassis;
	}

	public String getDecNumConteneur() {
		return decNumConteneur;
	}

	public void setDecNumConteneur(String decNumConteneur) {
		this.decNumConteneur = decNumConteneur;
	}

	public String getDecNumeroPlomb() {
		return decNumeroPlomb;
	}

	public void setDecNumeroPlomb(String decNumeroPlomb) {
		this.decNumeroPlomb = decNumeroPlomb;
	}

	public String getDecTailleConteneur() {
		return decTailleConteneur;
	}

	public void setDecTailleConteneur(String decTailleConteneur) {
		this.decTailleConteneur = decTailleConteneur;
	}

	public String getDecTypeConteneur() {
		return decTypeConteneur;
	}

	public void setDecTypeConteneur(String decTypeConteneur) {
		this.decTypeConteneur = decTypeConteneur;
	}

}