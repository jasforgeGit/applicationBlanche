package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ArticleDeclarationKey implements Serializable {
	

	private static final long serialVersionUID = 2062388546551758699L;


	@Column(name = "ANNEE", columnDefinition = "CHAR(4)", nullable = false)
	private String annee;
	
	
	@Column(name = "BUREAU", columnDefinition = "CHAR(3)", nullable = false)
	private String bureau;
	
	
	@Column(name = "NUMDCL", nullable = false)
	private Integer numDcl;
	
	
	@Column(name = "ARTDCL", nullable = false)
	private Integer artDcl;
	
	
	@Column(name = "CODTTX", columnDefinition = "CHAR(2)", nullable = false)
	private String codTtx;


	public ArticleDeclarationKey(String annee, String bureau, Integer numDcl,
			Integer artDcl, String codTtx) {
		super();
		this.annee = annee;
		this.bureau = bureau;
		this.numDcl = numDcl;
		this.artDcl = artDcl;
		this.codTtx = codTtx;
	}


	public ArticleDeclarationKey() {
		super();
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((annee == null) ? 0 : annee.hashCode());
		result = prime * result + ((artDcl == null) ? 0 : artDcl.hashCode());
		result = prime * result + ((bureau == null) ? 0 : bureau.hashCode());
		result = prime * result + ((codTtx == null) ? 0 : codTtx.hashCode());
		result = prime * result + ((numDcl == null) ? 0 : numDcl.hashCode());
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
		ArticleDeclarationKey other = (ArticleDeclarationKey) obj;
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
		if (codTtx == null) {
			if (other.codTtx != null){
				return false;
			}
		} else if (!codTtx.equals(other.codTtx)){
			return false;
		}
		if (numDcl == null) {
			if (other.numDcl != null){
				return false;
			}
		} else if (!numDcl.equals(other.numDcl)){
			return false;
		}
		return true;
	}
	
	

	
	
	
}
