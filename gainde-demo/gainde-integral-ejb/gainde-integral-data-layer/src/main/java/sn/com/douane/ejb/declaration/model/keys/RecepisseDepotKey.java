package sn.com.douane.ejb.declaration.model.keys;

import javax.persistence.Column;

/**
 * @author issam Key class for Entity Bean: Recepissedepot
 */
public class RecepisseDepotKey implements java.io.Serializable {

	private static final long serialVersionUID = -9152566047873883104L;
	@Column(name = "ANNEERECEPISSE", columnDefinition = "CHAR(4)", nullable = false)
	private String anneeRecepisse;
	@Column(name = "BUREAURECEPISSE", length = 3, nullable = false)
	private String bureauRecepisse;
	@Column(name = "NUMRECEPISSE", nullable = false)
	private Integer numRecepisse;

	public RecepisseDepotKey() {

	}

	public RecepisseDepotKey(String anneeRecepisse, String bureauRecepisse,
			Integer numRecepisse) {
		this.anneeRecepisse = anneeRecepisse;
		this.bureauRecepisse = bureauRecepisse;
		this.numRecepisse = numRecepisse;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof RecepisseDepotKey) {
			RecepisseDepotKey o = (RecepisseDepotKey) otherKey;
			return ((this.anneeRecepisse.equals(o.anneeRecepisse))
					&& (this.bureauRecepisse.equals(o.bureauRecepisse)) && (this.numRecepisse
						.equals(o.numRecepisse)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (anneeRecepisse.hashCode() + bureauRecepisse.hashCode() + numRecepisse
				.hashCode());
	}

	public String getAnneeRecepisse() {
		return anneeRecepisse;
	}

	public void setAnneeRecepisse(String anneeRecepisse) {
		this.anneeRecepisse = anneeRecepisse;
	}

	public String getBureauRecepisse() {
		return bureauRecepisse;
	}

	public void setBureauRecepisse(String bureauRecepisse) {
		this.bureauRecepisse = bureauRecepisse;
	}

	public Integer getNumRecepisse() {
		return numRecepisse;
	}

	public void setNumRecepisse(Integer numRecepisse) {
		this.numRecepisse = numRecepisse;
	}
}