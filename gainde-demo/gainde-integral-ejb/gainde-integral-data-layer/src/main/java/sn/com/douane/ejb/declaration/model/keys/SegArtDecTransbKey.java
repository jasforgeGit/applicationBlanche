/**
 * 
 */
package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author moussakare
 *
 */
public class SegArtDecTransbKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1731281992396082497L;
	
	@Column(name = "DECANNEEENREG",length  = 4, nullable = false)
	private String decAnneeDec;
	
	@Column(name = "DECBURENREGTRANS",length  = 3, nullable = false)
	private String decBurEnregTrans;
	
	@Column(name = "DECNUMENREGTRANS", nullable = false)
	private Integer decNumDecTrans;
	
	@Column(name = "DECNUMARTTRANS", nullable = false)
	private Integer decNumArtTrans;

	public SegArtDecTransbKey() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SegArtDecTransbKey(String decanneedec, String decBurEnregTrans,
			Integer decNumDecTrans, Integer decNumArtTrans) {
		super();
		this.decAnneeDec = decanneedec;
		this.decBurEnregTrans = decBurEnregTrans;
		this.decNumDecTrans = decNumDecTrans;
		this.decNumArtTrans = decNumArtTrans;
	}

	public String getDecanneedec() {
		return decAnneeDec;
	}

	public void setDecanneedec(String decanneedec) {
		this.decAnneeDec = decanneedec;
	}

	public String getDecBurEnregTrans() {
		return decBurEnregTrans;
	}

	public void setDecBurEnregTrans(String decBurEnregTrans) {
		this.decBurEnregTrans = decBurEnregTrans;
	}

	public Integer getDecNumDecTrans() {
		return decNumDecTrans;
	}

	public void setDecNumDecTrans(Integer decNumDecTrans) {
		this.decNumDecTrans = decNumDecTrans;
	}

	public Integer getDecNumArtTrans() {
		return decNumArtTrans;
	}

	public void setDecNumArtTrans(Integer decNumArtTrans) {
		this.decNumArtTrans = decNumArtTrans;
	}

}
