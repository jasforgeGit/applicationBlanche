package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DeclarationKey;

@Entity
@IdClass(DeclarationKey.class)
@Table(name = "DECLARATION")
public class Declaration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4628015391320627454L;

	@Id
	@Column(name = "ANDCL", columnDefinition = "CHAR(4)", nullable = false)
	private String anDcl;
	@Id
	@Column(name = "BUR", columnDefinition = "CHAR(3)", nullable = false)
	private String bur;
	@Id
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;
	
	@Column(name = "BURDCL", columnDefinition = "CHAR(3)", nullable = false)
	private String burDcl;

	@Column(name = "DATDCL", nullable = false)
	private Timestamp datDcl;

	@Column(name = "CODDEC", length = 5, nullable = false)
	private String codDec;

	@Column(name = "NOMDES", columnDefinition = "CHAR(30)", nullable = false)
	private String nomDes;

	@Column(name = "MODPAY", columnDefinition = "CHAR(1)", nullable = false)
	private String modPay;

	@Column(name = "NODOS", nullable = false)
	private Integer noDos;

	@Column(name = "DATTRAN", columnDefinition = "CHAR(8)", nullable = false)
	private String datTran;	
	
	@Column(name="CODCRD",length = 3)
	private String codCrd;		

	@OneToMany(mappedBy = "declaration", targetEntity = ArticleDeclaration.class)
	private List<ArticleDeclaration> listeArticleDeclaration = new ArrayList<ArticleDeclaration>();
	
	public List<ArticleDeclaration> getListeArticleDeclaration() {
		return listeArticleDeclaration;
	}

	public void setListeArticleDeclaration(
			List<ArticleDeclaration> listeArticleDeclaration) {
		this.listeArticleDeclaration = listeArticleDeclaration;
	}

	public Declaration(String anDcl, String bur, Integer numDcl, String burDcl,
			Timestamp datDcl, String codDec, String nomDes, String modPay,
			Integer noDos, String datTran) {
		super();
		this.anDcl = anDcl;
		this.bur = bur;
		this.numDcl = numDcl;
		this.burDcl = burDcl;
		this.datDcl = datDcl;
		this.codDec = codDec;
		this.nomDes = nomDes;
		this.modPay = modPay;
		this.noDos = noDos;
		this.datTran = datTran;
	}

	public Declaration() {
		super();
	}

	public String getAnDcl() {
		return anDcl;
	}

	public void setAnDcl(String anDcl) {
		this.anDcl = anDcl;
	}

	public String getBur() {
		return bur;
	}

	public void setBur(String bur) {
		this.bur = bur;
	}

	public Integer getNumDcl() {
		return numDcl;
	}

	public void setNumDcl(Integer numDcl) {
		this.numDcl = numDcl;
	}

	public String getBurDcl() {
		return burDcl;
	}

	public void setBurDcl(String burDcl) {
		this.burDcl = burDcl;
	}

	public Timestamp getDatDcl() {
		return datDcl;
	}

	public void setDatDcl(Timestamp datDcl) {
		this.datDcl = datDcl;
	}

	public String getCodDec() {
		return codDec;
	}

	public void setCodDec(String codDec) {
		this.codDec = codDec;
	}

	public String getNomDes() {
		return nomDes;
	}

	public void setNomDes(String nomDes) {
		this.nomDes = nomDes;
	}

	public String getModPay() {
		return modPay;
	}

	public void setModPay(String modPay) {
		this.modPay = modPay;
	}

	public Integer getNoDos() {
		return noDos;
	}

	public void setNoDos(Integer noDos) {
		this.noDos = noDos;
	}

	public String getDatTran() {
		return datTran;
	}

	public void setDatTran(String datTran) {
		this.datTran = datTran;
	}
	
	public String getCodCrd() {
		return codCrd;
	}

	public void setCodCrd(String codCrd) {
		this.codCrd = codCrd;
	}
	
}