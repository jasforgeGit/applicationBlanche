package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;




@Entity

@javax.persistence.NamedQueries(@javax.persistence.NamedQuery(name = "findByCdCreditaire", query = "select object(o) from LigneAvoir o where  o.trCodeCreditaire= ?1"))
@Table(name="LIGNEAVOIR")
public class LigneAvoir implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	  
	@Id
	@Column(name="TRNUMQUITTANCE", length=20, nullable=false)
	private java.lang.String trNumQuittance;
	

	@Column(name="TRMTQUITTANCE", columnDefinition="DECIMAL(18,0)", nullable=false)
	    private java.math.BigDecimal trMtQuittance;
	

	@Column(name="TRCODECREDITAIRE", length=3, nullable=false)
	    private java.lang.String trCodeCreditaire;
	
	@Column(name="TRDATEAVOIR", nullable=false)
	    private java.sql.Date trDateAvoir;
	
	@Column(name="TRTYPEAVOIR", length=1, nullable=false)
	    private java.lang.String trTypeAvoir;
	
	@ManyToOne(targetEntity = TypeAvoir.class)	
	  @JoinColumn(name="TRTYPEAVOIR", referencedColumnName="TRTYPEAVOIR", insertable=false, updatable=false)
	    private TypeAvoir typLigneAvoir;

	public java.lang.String getTrNumQuittance() {
		return trNumQuittance;
	}

	public void setTrNumQuittance(java.lang.String trNumQuittance) {
		this.trNumQuittance = trNumQuittance;
	}

	public java.math.BigDecimal getTrMtQuittance() {
		return trMtQuittance;
	}

	public void setTrMtQuittance(java.math.BigDecimal trMtQuittance) {
		this.trMtQuittance = trMtQuittance;
	}

	public java.lang.String getTrCodeCreditaire() {
		return trCodeCreditaire;
	}

	public void setTrCodeCreditaire(java.lang.String trCodeCreditaire) {
		this.trCodeCreditaire = trCodeCreditaire;
	}

	public java.sql.Date getTrDateAvoir() {
		return trDateAvoir;
	}

	public void setTrDateAvoir(java.sql.Date trDateAvoir) {
		this.trDateAvoir = trDateAvoir;
	}

	public java.lang.String getTrTypeAvoir() {
		return trTypeAvoir;
	}

	public void setTrTypeAvoir(java.lang.String trTypeAvoir) {
		this.trTypeAvoir = trTypeAvoir;
	}

	

	public TypeAvoir getTypLigneAvoir() {
		return typLigneAvoir;
	}

	public void setTypLigneAvoir(TypeAvoir typLigneAvoir) {
		this.typLigneAvoir = typLigneAvoir;
	}

	public LigneAvoir(String trNumQuittance, BigDecimal trMtQuittance,
			String trCodeCreditaire, Date trDateAvoir, String trTypeAvoir) {
		super();
		this.trNumQuittance = trNumQuittance;
		this.trMtQuittance = trMtQuittance;
		this.trCodeCreditaire = trCodeCreditaire;
		this.trDateAvoir = trDateAvoir;
		this.trTypeAvoir = trTypeAvoir;
	}

	public LigneAvoir() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
