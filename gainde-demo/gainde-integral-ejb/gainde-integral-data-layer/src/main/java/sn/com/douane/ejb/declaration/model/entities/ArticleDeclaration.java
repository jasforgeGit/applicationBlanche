package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ArticleDeclarationKey;


@Entity
@IdClass(ArticleDeclarationKey.class)
@Table(name = "ARTICLE_DECLARATION")
public class ArticleDeclaration implements Serializable{

	private static final long serialVersionUID = -2664404651475372834L;

	@Id
	@Column(name = "ANNEE", columnDefinition = "CHAR(4)", nullable = false)
	private String annee;
	
	@Id
	@Column(name = "BUREAU", columnDefinition = "CHAR(3)", nullable = false)
	private String bureau;
	
	@Id
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;
	
	@Id
	@Column(name = "ARTDCL", nullable = false)
	private Integer artDcl;
	
	@Id
	@Column(name = "CODTTX", columnDefinition = "CHAR(2)", nullable = false)
	private String codTtx;
	
	@Column(name = "MNTTXL",columnDefinition = "DECIMAL(11 , 0)", nullable = false)
	private BigDecimal mntTxl;
	
	@Column(name = "CODDEC", length=5, nullable = false)
	private String codDec;
	
	@Column(name = "DATLIQ",nullable = false)
	private Timestamp datLiq;
	
	@Column(name = "DATPAY",nullable = false)
	private Timestamp datPay;
	
	@Column(name = "NUMQUIT", columnDefinition = "CHAR(9)", nullable = false)
	private String numQuit;
	
	@Column(name = "DATTRAN", columnDefinition = "CHAR(8)", nullable = false)
	private String datTran;
	
	@ManyToOne(targetEntity = Declaration.class)
	@JoinColumns({
			@JoinColumn(name = "ANNEE", referencedColumnName = "ANDCL", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "BUREAU", referencedColumnName = "BUR", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "NUMDCL", referencedColumnName = "NUMDCL", insertable = false, updatable = false, nullable = false) })
	private Declaration declaration;


	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}

	public ArticleDeclaration(String annee, String bureau, Integer numDcl,
			Integer artDcl, String codTtx, BigDecimal mntTxl, String codDec,
			Timestamp datLiq, Timestamp datPay, String numQuit, String datTran) {
		super();
		this.annee = annee;
		this.bureau = bureau;
		this.numDcl = numDcl;
		this.artDcl = artDcl;
		this.codTtx = codTtx;
		this.mntTxl = mntTxl;
		this.codDec = codDec;
		this.datLiq = datLiq;
		this.datPay = datPay;
		this.numQuit = numQuit;
		this.datTran = datTran;
	}

	public ArticleDeclaration() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annee == null) ? 0 : annee.hashCode());
		result = prime * result + ((artDcl == null) ? 0 : artDcl.hashCode());
		result = prime * result + ((bureau == null) ? 0 : bureau.hashCode());
		result = prime * result + ((codDec == null) ? 0 : codDec.hashCode());
		result = prime * result + ((codTtx == null) ? 0 : codTtx.hashCode());
		result = prime * result + ((datLiq == null) ? 0 : datLiq.hashCode());
		result = prime * result + ((datPay == null) ? 0 : datPay.hashCode());
		result = prime * result + ((datTran == null) ? 0 : datTran.hashCode());
		result = prime * result + ((mntTxl == null) ? 0 : mntTxl.hashCode());
		result = prime * result + ((numDcl == null) ? 0 : numDcl.hashCode());
		result = prime * result + ((numQuit == null) ? 0 : numQuit.hashCode());
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
		ArticleDeclaration other = (ArticleDeclaration) obj;
		if (annee == null) {
			if (other.annee != null){
				return false;
			}
		} else if (!annee.equals(other.annee)){
			return false;
		}
		if (artDcl == null) {
			if (other.artDcl != null){
				return false;
			}
		} else if (!artDcl.equals(other.artDcl)){
			return false;
		}
		if (bureau == null) {
			if (other.bureau != null){
				return false;
			}
		} else if (!bureau.equals(other.bureau)){
			return false;
		}
		if (codDec == null) {
			if (other.codDec != null){
				return false;
			}
		} else if (!codDec.equals(other.codDec)){
			return false;
		}
		if (codTtx == null) {
			if (other.codTtx != null){
				return false;
			}
		} else if (!codTtx.equals(other.codTtx)){
			return false;
		}
		if (datLiq == null) {
			if (other.datLiq != null){
				return false;
			}
		} else if (!datLiq.equals(other.datLiq)){
			return false;
		}
		if (datPay == null) {
			if (other.datPay != null){
				return false;
			}
		} else if (!datPay.equals(other.datPay)){
			return false;
		}
		if (datTran == null) {
			if (other.datTran != null){
				return false;
			}
		} else if (!datTran.equals(other.datTran)){
			return false;
		}
		if (mntTxl == null) {
			if (other.mntTxl != null){
				return false;
			}
		} else if (!mntTxl.equals(other.mntTxl)){
			return false;
		}
		if (numDcl == null) {
			if (other.numDcl != null){
				return false;
			}
		} else if (!numDcl.equals(other.numDcl)){
			return false;
		}
		if (numQuit == null) {
			if (other.numQuit != null){
				return false;
			}
		} else if (!numQuit.equals(other.numQuit)){
			return false;
		}
		return true;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

	public Integer getNumDcl() {
		return numDcl;
	}

	public void setNumDcl(Integer numDcl) {
		this.numDcl = numDcl;
	}

	public Integer getArtDcl() {
		return artDcl;
	}

	public void setArtDcl(Integer artDcl) {
		this.artDcl = artDcl;
	}

	public String getCodTtx() {
		return codTtx;
	}

	public void setCodTtx(String codTtx) {
		this.codTtx = codTtx;
	}

	public BigDecimal getMntTxl() {
		return mntTxl;
	}

	public void setMntTxl(BigDecimal mntTxl) {
		this.mntTxl = mntTxl;
	}

	public String getCodDec() {
		return codDec;
	}

	public void setCodDec(String codDec) {
		this.codDec = codDec;
	}

	public Timestamp getDatLiq() {
		return datLiq;
	}

	public void setDatLiq(Timestamp datLiq) {
		this.datLiq = datLiq;
	}

	public Timestamp getDatPay() {
		return datPay;
	}

	public void setDatPay(Timestamp datPay) {
		this.datPay = datPay;
	}

	public String getNumQuit() {
		return numQuit;
	}

	public void setNumQuit(String numQuit) {
		this.numQuit = numQuit;
	}

	public String getDatTran() {
		return datTran;
	}

	public void setDatTran(String datTran) {
		this.datTran = datTran;
	}	
	
	
	
	
	
	
	
	
}
