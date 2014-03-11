package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

public class SaisieQuittanceExclueDto implements Serializable {

	private static final long serialVersionUID = 4551830460285717442L;
	private String trNumQuittanceExclue;
    private String pk;
    private String trDateQuittanceExclue;

	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		return pk;
	}
	/**
	 * @param pk pk � d�finir.
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}
	public String getTrNumQuittanceExclue() {
		return trNumQuittanceExclue;
	}
	/**
	 * @param trNumQuittanceExclue trNumQuittanceExclue � d�finir.
	 */
	public void setTrNumQuittanceExclue(String trNumQuittanceExclue) {
		this.trNumQuittanceExclue = trNumQuittanceExclue;
	}
	/**
	 * @return Renvoie trDateQuittanceExclue.
	 */
	public String getTrDateQuittanceExclue() {
		return trDateQuittanceExclue;
	}
	/**
	 * @param trDateQuittanceExclue trDateQuittanceExclue � d�finir.
	 */
	public void setTrDateQuittanceExclue(String trDateQuittanceExclue) {
		this.trDateQuittanceExclue = trDateQuittanceExclue;
	}
}
