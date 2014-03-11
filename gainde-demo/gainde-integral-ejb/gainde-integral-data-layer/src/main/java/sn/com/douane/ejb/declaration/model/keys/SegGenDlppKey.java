package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * 
 * @author thouraya
 *
 */
public class SegGenDlppKey implements Serializable{

	private static final long serialVersionUID = -6536459798019891895L;

	@Id @Column(name = "DLPPANNEEDLPP", length = 4, nullable = false)
	private String dlppAnneeDlpp;

	@Id @Column(name = "DLPPCODEBUREAU",length = 3, nullable = false)
	private String dlppCodeBureau;

	@Id @Column(name = "DLPPNUMDLPP",nullable = false)
	private Integer dlppNumDlpp;

	public SegGenDlppKey(String dlppAnneeDlpp, String dlppCodeBureau, Integer dlppNumDlpp) {
		this.dlppAnneeDlpp = dlppAnneeDlpp;
		this.dlppCodeBureau = dlppCodeBureau;
		this.dlppNumDlpp = dlppNumDlpp;
	}

	public SegGenDlppKey() {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result	+ ((dlppAnneeDlpp == null) ? 0 : dlppAnneeDlpp.hashCode());
		result = prime * result	+ ((dlppCodeBureau == null) ? 0 : dlppCodeBureau.hashCode());
		result = prime * result	+ ((dlppNumDlpp == null) ? 0 : dlppNumDlpp.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof SegGenDlppKey) {
			SegGenDlppKey o = (SegGenDlppKey) obj;
			return ((this.dlppAnneeDlpp.equals(o.dlppAnneeDlpp))
					&& (this.dlppCodeBureau.equals(o.dlppCodeBureau))
					&& (this.dlppNumDlpp.equals(o.dlppNumDlpp)));
		}
		return false;
	}



}
