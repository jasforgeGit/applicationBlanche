package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.RegularisationManifKey;

/**
 * @author thouraya
 * 
 * Bean implementation class for Enterprise Bean: Regularisationmanif
 */
@Entity()
@IdClass(RegularisationManifKey.class)
@Table(name="REGULARISATIONMANIF")
public class RegularisationManif implements Serializable{

	private static final long serialVersionUID = -6952699655732716330L;

	@Id @Column(name = "DECANNEEENREGDECL",length = 4,nullable = false)
	private String decAnneeEnregDecl;

	@Id @Column(name = "DECBURENREGDECL",nullable = false)
	private String decBurEnregDecl;

	@Id @Column(name = "DECNUMDECLARATION",nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDECL",nullable = false)
	private Integer decNumArtDecl;

	@Column(name = "DECPPMDECLARANT", length = 5, nullable = false)
	private String decPpmDeclarant;

	@Column(name = "DECNUMTITRETRANS", length = 12)
	private String decNumTitreTrans;

	@Column(name = "DECDATECREATION")
	private Date decDateCreation;

	@Column(name = "DECDATEECHEANCE")
	private Date decDateEcheance;


	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDECL", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDECL", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	
	public RegularisationManif() {
		super();
	}


	public RegularisationManif(String decAnneeEnregDecl,
			String decBurEnregDecl, Integer decNumDeclaration,
			Integer decNumArtDecl, String decPpmDeclarant) {
		super();
		this.decAnneeEnregDecl = decAnneeEnregDecl;
		this.decBurEnregDecl = decBurEnregDecl;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDecl;
		this.decPpmDeclarant = decPpmDeclarant;
	}


	public String getDecAnneeEnregDecl() {
		return decAnneeEnregDecl;
	}


	public void setDecAnneeEnregDecl(String decAnneeEnregDecl) {
		this.decAnneeEnregDecl = decAnneeEnregDecl;
	}


	public String getDecBurEnregDecl() {
		return decBurEnregDecl;
	}


	public void setDecBurEnregDecl(String decBurEnregDecl) {
		this.decBurEnregDecl = decBurEnregDecl;
	}


	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}


	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}


	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}


	public void setDecNumArtDecl(Integer decNumArtDecl) {
		this.decNumArtDecl = decNumArtDecl;
	}


	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}


	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}


	public String getDecNumTitreTrans() {
		return decNumTitreTrans;
	}


	public void setDecNumTitreTrans(String decNumTitreTrans) {
		this.decNumTitreTrans = decNumTitreTrans;
	}


	public Date getDecDateCreation() {
		return decDateCreation;
	}


	public void setDecDateCreation(Date decDateCreation) {
		this.decDateCreation = decDateCreation;
	}


	public Date getDecDateEcheance() {
		return decDateEcheance;
	}


	public void setDecDateEcheance(Date decDateEcheance) {
		this.decDateEcheance = decDateEcheance;
	}


	public SegArtDec getSegArtDec() {
		return segArtDec;
	}


	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}

	

	
	
}