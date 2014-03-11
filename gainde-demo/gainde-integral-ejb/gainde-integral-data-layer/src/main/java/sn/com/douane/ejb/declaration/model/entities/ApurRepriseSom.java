package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ApurRepriseSomKey;



@Entity
@IdClass(ApurRepriseSomKey.class)
@Table(name="APURREPRISESOM")
public class ApurRepriseSom implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6290841939446478825L;

	
	@Id
	@Column(name="DECANNEESOMAPURE", length=4, nullable=false)
	private java.lang.String decAnneeDec;
	
	@Id
	@Column(name="DECBURSOMAPURE", length=3, nullable=false)
    private java.lang.String decBurEnregDec;
	
	@Id
	@Column(name="DECNUMSOMAPURE", nullable=false)
    private java.lang.Integer decNumDeclaration;
	
	@Id
	@Column(name="DECNUMARTSOMAPURE", nullable=false)
    private java.lang.Integer decNumArtDec;
   	
	@Id
	@Column(name="DECANNEEAPURANT", length=4, nullable=false)
	 private java.lang.String decAnneeApurant;
	
	@Id
	@Column(name="DECBURAPURANT", length=3, nullable=false)
    private java.lang.String decBurApurant;
	
	

	@Id
	@Column(name="DECNUMARTAPURANT", nullable=false)
    private java.lang.Integer decNumArtApurant;
	
	@Id
	@Column(name="DECNUMDECAPURANT", nullable=false)
    private java.lang.Integer decNumDecApurant;
	
	
	@Column(name="DECDATEENREGDEC")
    private java.sql.Date decDateEnregDec;
	
	@Column(name="DECDATEPREAPUREMENT")
    private java.sql.Date decDatePreapurement;
	
	@Column(name="DECDATEPUREMENT")
    private java.sql.Date decDatePurement;
	
	@Column(name="DECNBRECOLISAPURCOMPTA")
    private java.lang.Integer decNbreColisApurCompta;
	
	@Column(name="DECNBRECOLISAPURESPHY")
    private java.lang.Integer decNbreColisApuresPhy;
	
	@Column(name="DECPDSAPURCOMPTA", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decPdsApurCompta;
	
	@Column(name="DECPDSAPURESPHY", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decPdsApuresPhy;
	
	@Column(name="DECQTEAPURCOMPTA", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decQteApurCompta;
	
	@Column(name="DECQTEAPURESPHY", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decQteApuresPhy;
	
	@Column(name="DECUSERAPUREMENT", length=8)
    private java.lang.String decUserApurement;
	
	@Column(name="DECUSERPREAPUREMENT", length=8)
    private java.lang.String decuserpreapurement;
	
	@Column(name="DECVALEURAPURCOMPTA", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decValeurApurCompta;
	
	@Column(name="DECVALEURAPURESPHY", columnDefinition = "DECIMAL(11,0)")
    private java.math.BigDecimal decValeurApuresPhy;

	public ApurRepriseSom(String decAnneeDec, String decBurEnregDec,
			Integer decNumDeclaration, Integer decNumArtDec,
			String decAnneeApurant, String decBurApurant,
			Integer decNumArtApurant, Integer decNumDecApurant,
			Date decDateEnregDec, Date decDatePreapurement,
			Date decDatePurement, Integer decNbreColisApurCompta,
			Integer decNbreColisApuresPhy, BigDecimal decPdsApurCompta,
			BigDecimal decPdsApuresPhy, BigDecimal decQteApurCompta,
			BigDecimal decQteApuresPhy, String decUserApurement,
			String decuserpreapurement, BigDecimal decValeurApurCompta,
			BigDecimal decValeurApuresPhy) {
		super();
		this.decAnneeDec = decAnneeDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decAnneeApurant = decAnneeApurant;
		this.decBurApurant = decBurApurant;
		this.decNumArtApurant = decNumArtApurant;
		this.decNumDecApurant = decNumDecApurant;
		this.decDateEnregDec = decDateEnregDec;
		this.decDatePreapurement = decDatePreapurement;
		this.decDatePurement = decDatePurement;
		this.decNbreColisApurCompta = decNbreColisApurCompta;
		this.decNbreColisApuresPhy = decNbreColisApuresPhy;
		this.decPdsApurCompta = decPdsApurCompta;
		this.decPdsApuresPhy = decPdsApuresPhy;
		this.decQteApurCompta = decQteApurCompta;
		this.decQteApuresPhy = decQteApuresPhy;
		this.decUserApurement = decUserApurement;
		this.decuserpreapurement = decuserpreapurement;
		this.decValeurApurCompta = decValeurApurCompta;
		this.decValeurApuresPhy = decValeurApuresPhy;
	}

	public ApurRepriseSom() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getDecAnneeDec() {
		return decAnneeDec;
	}

	public void setDecAnneeDec(java.lang.String decAnneeDec) {
		this.decAnneeDec = decAnneeDec;
	}

	public java.lang.String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(java.lang.String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public java.lang.Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(java.lang.Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	public java.lang.String getDecAnneeApurant() {
		return decAnneeApurant;
	}

	public void setDecAnneeApurant(java.lang.String decAnneeApurant) {
		this.decAnneeApurant = decAnneeApurant;
	}

	public java.lang.String getDecBurApurant() {
		return decBurApurant;
	}

	public void setDecBurApurant(java.lang.String decBurApurant) {
		this.decBurApurant = decBurApurant;
	}

	public java.lang.Integer getDecNumArtApurant() {
		return decNumArtApurant;
	}

	public void setDecNumArtApurant(java.lang.Integer decNumArtApurant) {
		this.decNumArtApurant = decNumArtApurant;
	}

	public java.lang.Integer getDecNumDecApurant() {
		return decNumDecApurant;
	}

	public void setDecNumDecApurant(java.lang.Integer decNumDecApurant) {
		this.decNumDecApurant = decNumDecApurant;
	}

	public java.sql.Date getDecDateEnregDec() {
		return decDateEnregDec;
	}

	public void setDecDateEnregDec(java.sql.Date decDateEnregDec) {
		this.decDateEnregDec = decDateEnregDec;
	}

	public java.sql.Date getDecDatePreapurement() {
		return decDatePreapurement;
	}

	public void setDecDatePreapurement(java.sql.Date decDatePreapurement) {
		this.decDatePreapurement = decDatePreapurement;
	}

	public java.sql.Date getDecDatePurement() {
		return decDatePurement;
	}

	public void setDecDatePurement(java.sql.Date decDatePurement) {
		this.decDatePurement = decDatePurement;
	}

	public java.lang.Integer getDecNbreColisApurCompta() {
		return decNbreColisApurCompta;
	}

	public void setDecNbreColisApurCompta(java.lang.Integer decNbreColisApurCompta) {
		this.decNbreColisApurCompta = decNbreColisApurCompta;
	}

	public java.lang.Integer getDecNbreColisApuresPhy() {
		return decNbreColisApuresPhy;
	}

	public void setDecNbreColisApuresPhy(java.lang.Integer decNbreColisApuresPhy) {
		this.decNbreColisApuresPhy = decNbreColisApuresPhy;
	}

	public java.math.BigDecimal getDecPdsApurCompta() {
		return decPdsApurCompta;
	}

	public void setDecPdsApurCompta(java.math.BigDecimal decPdsApurCompta) {
		this.decPdsApurCompta = decPdsApurCompta;
	}

	public java.math.BigDecimal getDecPdsApuresPhy() {
		return decPdsApuresPhy;
	}

	public void setDecPdsApuresPhy(java.math.BigDecimal decPdsApuresPhy) {
		this.decPdsApuresPhy = decPdsApuresPhy;
	}

	public java.math.BigDecimal getDecQteApurCompta() {
		return decQteApurCompta;
	}

	public void setDecQteApurCompta(java.math.BigDecimal decQteApurCompta) {
		this.decQteApurCompta = decQteApurCompta;
	}

	public java.math.BigDecimal getDecQteApuresPhy() {
		return decQteApuresPhy;
	}

	public void setDecQteApuresPhy(java.math.BigDecimal decQteApuresPhy) {
		this.decQteApuresPhy = decQteApuresPhy;
	}

	public java.lang.String getDecUserApurement() {
		return decUserApurement;
	}

	public void setDecUserApurement(java.lang.String decUserApurement) {
		this.decUserApurement = decUserApurement;
	}

	public java.lang.String getDecuserpreapurement() {
		return decuserpreapurement;
	}

	public void setDecuserpreapurement(java.lang.String decuserpreapurement) {
		this.decuserpreapurement = decuserpreapurement;
	}

	public java.math.BigDecimal getDecValeurApurCompta() {
		return decValeurApurCompta;
	}

	public void setDecValeurApurCompta(java.math.BigDecimal decValeurApurCompta) {
		this.decValeurApurCompta = decValeurApurCompta;
	}

	public java.math.BigDecimal getDecValeurApuresPhy() {
		return decValeurApuresPhy;
	}

	public void setDecValeurApuresPhy(java.math.BigDecimal decValeurApuresPhy) {
		this.decValeurApuresPhy = decValeurApuresPhy;
	}

	
//
//	@ManyToOne(targetEntity = RepriseSommier.class)
//	@JoinColumns( value = {
//		@JoinColumn(name="DECANNEESOMAPURE", referencedColumnName="DECANNEEDEC", insertable=false, updatable=false), 
//		@JoinColumn(name="DECBURSOMAPURE", referencedColumnName="DECBURENREGDEC", insertable=false, updatable=false),
//		@JoinColumn(name="DECNUMSOMAPURE", referencedColumnName="DECNUMDECLARATION", insertable=false, updatable=false),
//		@JoinColumn(name="DECNUMARTSOMAPURE", referencedColumnName="DECNUMARTDEC", insertable=false, updatable=false)
//		})  
// private RepriseSommier sRepApurSom;
	
	
	
	
    //private ReprisesommierLocal ce_repapursom;
	
	
}
