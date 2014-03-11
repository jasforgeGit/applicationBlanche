package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ArticleDlppKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3606053415774166807L;

	@Column(name = "DLPPANNEEDLPP", length = 4, nullable = false)
	private String dlppAnneeDlpp;

	@Column(name = "DLPPCODEBUREAU", length = 3, nullable = false)
	private String dlppCodeBureau;

	@Column(name = "DLPPNUMDLPP", nullable = false)
	private Integer dlppNumDlpp;

	@Column(name = "DLPPNUMARTICLE", nullable = false)
	private Integer dlppNumArticle;

	public ArticleDlppKey(String dlppAnneeDlpp, String dlppCodeBureau,
			Integer dlppNumDlpp, Integer dlppNumArticle) {
		super();
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodeBureau = dlppCodeBureau;
		this.dlppNumDlpp = dlppNumDlpp;
		this.dlppNumArticle = dlppNumArticle;
	}
	
	

	public ArticleDlppKey() {
		super();
	}



	public String getDlppAnneeDlpp() {
		return dlppAnneeDlpp;
	}

	public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
	}

	public String getDlppCodeBureau() {
		return dlppCodeBureau;
	}

	public void setDlppCodeBureau(String dlppCodeBureau) {
		this.dlppCodeBureau = dlppCodeBureau;
	}

	public Integer getDlppNumDlpp() {
		return dlppNumDlpp;
	}

	public void setDlppNumDlpp(Integer dlppNumDlpp) {
		this.dlppNumDlpp = dlppNumDlpp;
	}

	public Integer getDlppNumArticle() {
		return dlppNumArticle;
	}

	public void setDlppNumArticle(Integer dlppNumArticle) {
		this.dlppNumArticle = dlppNumArticle;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((dlppAnneeDlpp == null) ? 0 : dlppAnneeDlpp.hashCode());
		result = prime * result
				+ ((dlppCodeBureau == null) ? 0 : dlppCodeBureau.hashCode());
		result = prime * result
				+ ((dlppNumArticle == null) ? 0 : dlppNumArticle.hashCode());
		result = prime * result
				+ ((dlppNumDlpp == null) ? 0 : dlppNumDlpp.hashCode());
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
		ArticleDlppKey other = (ArticleDlppKey) obj;
		if (dlppAnneeDlpp == null) {
			if (other.dlppAnneeDlpp != null){
				return false;
			}
		} else if (!dlppAnneeDlpp.equals(other.dlppAnneeDlpp)){
			return false;
		}
		if (dlppCodeBureau == null) {
			if (other.dlppCodeBureau != null){
				return false;
			}
		} else if (!dlppCodeBureau.equals(other.dlppCodeBureau)){
			return false;
		}
		if (dlppNumArticle == null) {
			if (other.dlppNumArticle != null){
				return false;
			}
		} else if (!dlppNumArticle.equals(other.dlppNumArticle)){
			return false;
		}
		if (dlppNumDlpp == null) {
			if (other.dlppNumDlpp != null){
				return false;
			}
		} else if (!dlppNumDlpp.equals(other.dlppNumDlpp)){
			return false;
		}
		return true;
	}

	
	
	
	
	
	
	
}
