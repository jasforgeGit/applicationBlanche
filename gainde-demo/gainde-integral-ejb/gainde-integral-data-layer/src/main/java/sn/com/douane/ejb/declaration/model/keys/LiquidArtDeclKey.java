package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author: issam
 * Key class for Entity Bean: Liquidartdecl
 */

public class LiquidArtDeclKey implements Serializable {
 
	/**
	 * 
	 */
	private static final long serialVersionUID = 692911723195625796L;
	
	
	
	@Column(name = "DECANNEELIQUID" , length = 4 , nullable = false)
	private String decAnneeLiquid;
	
	@Column(name = "DECBUREAUENREGDEC" , length = 3 , nullable = false)
	private String decBureauEnregDec;
	
	@Column(name = "DECNUMDEC" , nullable = false)
	private Integer decNumDec;
	
	@Column(name = "DECNUMARTDEC" , nullable = false)
	private Integer decNumArtDec;
	
	@Column(name = "DECCODETAXE" , length = 2 , nullable = false)
	private String decCodeTaxe;
    
    public LiquidArtDeclKey(){
    	
    }
    public LiquidArtDeclKey(String decAnneeLiquid,String decBurEnregDec,Integer decNumDec,
							Integer decNumArtDec,String decCodeTaxe) {
			this.decAnneeLiquid=decAnneeLiquid;
			this.decBureauEnregDec=decBurEnregDec;
			this.decNumDec=decNumDec;
			this.decNumArtDec=decNumArtDec;
			this.decCodeTaxe=decCodeTaxe;
    }

    
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof LiquidArtDeclKey) {
			LiquidArtDeclKey o = (LiquidArtDeclKey) otherKey;
			return ((this.decCodeTaxe.equals(o.decCodeTaxe))
				&& (this.decNumArtDec.equals(o.decNumArtDec))
				&& (this.decAnneeLiquid.equals(o.decAnneeLiquid))
				&& (this.decBureauEnregDec.equals(o.decBureauEnregDec)) 
				&& (this.decNumDec.equals(o.decNumDec)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (decCodeTaxe.hashCode()
			+ decNumArtDec.hashCode()
			+ decAnneeLiquid.hashCode()
			+ decBureauEnregDec.hashCode() 
			+ decNumDec.hashCode());
	}
	public java.lang.String getDecAnneeLiquid() {
		return decAnneeLiquid;
	}
	public void setDecAnneeLiquid(java.lang.String decAnneeLiquid) {
		this.decAnneeLiquid = decAnneeLiquid;
	}
	
	public java.lang.Integer getDecNumDec() {
		return decNumDec;
	}
	public void setDecNumDec(java.lang.Integer decNumDec) {
		this.decNumDec = decNumDec;
	}
	public java.lang.Integer getDecNumArtDec() {
		return decNumArtDec;
	}
	public void setDecNumArtDec(java.lang.Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}
	public java.lang.String getDecCodeTaxe() {
		return decCodeTaxe;
	}
	public void setDecCodeTaxe(java.lang.String decCodeTaxe) {
		this.decCodeTaxe = decCodeTaxe;
	}
	public String getDecBureauEnregDec() {
		return decBureauEnregDec;
	}
	public void setDecBureauEnregDec(String decBureauEnregDec) {
		this.decBureauEnregDec = decBureauEnregDec;
	}
	
	
	
}