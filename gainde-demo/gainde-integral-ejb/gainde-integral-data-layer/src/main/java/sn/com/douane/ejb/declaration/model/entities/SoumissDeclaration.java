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

import sn.com.douane.ejb.declaration.model.keys.SoumissDeclarationKey;

/**
 * @author thouraya 
 * 
 * Bean implementation class for Enterprise Bean: Soumissdeclaration
 */
@Entity()
@IdClass(SoumissDeclarationKey.class)
@Table(name = "SOUMISSDECLARATION")
public class SoumissDeclaration implements Serializable {
	
	private static final long serialVersionUID = -3027820862341032314L;

	@Id @Column(name = "DECPPMDECLARANT",length = 5, nullable = false)
	private String decPpmDeclarant;
    
	@Id @Column(name = "DECANNEEENREGDEC",length = 4, nullable = false)
    private String decAnneeEnregDec;
    
	@Id @Column(name = "DECBURENREGDEC",length = 3, nullable = false)
    private String decBurEnregDec;
    
	@Id @Column(name = "DECNUMDECLARATION",nullable = false)
    private Integer decNumDeclaration;
    
	@Id @Column(name = "DECNUMARTDEC",nullable = false)
    private Integer decNumArtDec;
    
	@Column(name = "DECDATEENREGDECL")
    private Date decDateEnregDecl;
	
	@Column(name = "DECTYPEREGIME", length = 1)
    private String decTypeRegime;
	
	@Column(name = "DECREGDOUANIER", length = 1)
    private String decRegDouanier;
	
	@Column(name = "DECCODEVERIFICATEUR", length = 5)
    private String decCodeVerificateur;
	
	@Column(name = "DECDATEBAE")
    private Date decDateBae;
	
	@Column(name = "DECNOMDESTINATAIRE", length = 255)
    private String decNomDestinataire;
    
	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;


    public SoumissDeclaration(String decPpmDeclarant,String decAnneeEnregDec, String decBurEnregDec,Integer decNumDeclaration, Integer decNumArtDec) {
    	this.decPpmDeclarant = decPpmDeclarant;
    	this.decAnneeEnregDec = decAnneeEnregDec;
    	this.decBurEnregDec = decBurEnregDec;
    	this.decNumDeclaration = decNumDeclaration;
    	this.decNumArtDec = decNumArtDec;
    	
    }

    public SoumissDeclaration() {
    }

	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
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

	public Date getDecDateEnregDecl() {
		return decDateEnregDecl;
	}

	public void setDecDateEnregDecl(Date decDateEnregDecl) {
		this.decDateEnregDecl = decDateEnregDecl;
	}

	public String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public String getDecRegDouanier() {
		return decRegDouanier;
	}

	public void setDecRegDouanier(String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}

	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}

	public Date getDecDateBae() {
		return decDateBae;
	}

	public void setDecDateBae(Date decDateBae) {
		this.decDateBae = decDateBae;
	}

	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}

	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}

	public SegArtDec getSegArtDec() {
		return segArtDec;
	}

	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}


}