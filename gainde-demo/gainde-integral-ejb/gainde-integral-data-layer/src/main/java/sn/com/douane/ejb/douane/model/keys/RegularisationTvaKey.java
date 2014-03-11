package sn.com.douane.ejb.douane.model.keys;

public class RegularisationTvaKey {

	private String anneeDec;

	private String bureauDec;

	private int numeroDec;

	private int numArtDec;

	private String codeTaxe;

	private String pk;

	public RegularisationTvaKey(String pk) {
		String temp[] = pk.split("-");
		this.anneeDec = temp[0];
		this.bureauDec = temp[1];
		this.numeroDec = Integer.parseInt(temp[2]);
		this.numArtDec = Integer.parseInt(temp[3]);
		this.codeTaxe = temp[4];
	}

	/**
	 * @return Renvoie anneeDec.
	 */
	public String getAnneeDec() {
		return anneeDec;
	}

	/**
	 * @param anneeDec
	 */
	public void setAnneeDec(String anneeDec) {
		this.anneeDec = anneeDec;
	}

	/**
	 * @return Renvoie bureauDec.
	 */
	public String getBureauDec() {
		return bureauDec;
	}

	/**
	 * @param bureauDec
	 */
	public void setBureauDec(String bureauDec) {
		this.bureauDec = bureauDec;
	}

	/**
	 * @return Renvoie numeroDec.
	 */
	public int getNumeroDec() {
		return numeroDec;
	}

	/**
	 * @param numeroDec
	 */
	public void setNumeroDec(int numeroDec) {
		this.numeroDec = numeroDec;
	}

	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		pk= anneeDec + "-" + bureauDec + "-" + numeroDec + "-" + numArtDec
				+ "-" + codeTaxe;
		return pk; 
	}

	/**
	 * @param pk
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * @return Renvoie codeTaxe.
	 */
	public String getCodeTaxe() {
		return codeTaxe;
	}

	/**
	 * @param codeTaxe
	 */
	public void setCodeTaxe(String codeTaxe) {
		this.codeTaxe = codeTaxe;
	}

	/**
	 * @return Renvoie numArtDec.
	 */
	public int getNumArtDec() {
		return numArtDec;
	}

	/**
	 * @param numArtDec
	 */
	public void setNumArtDec(int numArtDec) {
		this.numArtDec = numArtDec;
	}
}
