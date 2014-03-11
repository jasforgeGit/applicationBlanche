package sn.com.douane.ejb.declaration.model.keys;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class JournalCreditKey implements Serializable{

	private static final long serialVersionUID = 8311187266556347261L;
	
	@Id @Column(name = "DECCODECREDITAIRE", length = 3, nullable = false)
	private String decCodeCreditaire;

	@Id @Column(name = "DECDATEIMPUTATION", nullable = false)
	private Timestamp decDateImputation;

	public JournalCreditKey(String decCodeCreditaire, Timestamp decDateImputation) {
		this.decCodeCreditaire = decCodeCreditaire;
		this.decDateImputation = decDateImputation;
	}

	public JournalCreditKey() {
	}

	public String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public Timestamp getDecDateImputation() {
		return decDateImputation;
	}

	public void setDecDateImputation(Timestamp decDateImputation) {
		this.decDateImputation = decDateImputation;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decCodeCreditaire == null) ? 0 : decCodeCreditaire
						.hashCode());
		result = prime
				* result
				+ ((decDateImputation == null) ? 0 : decDateImputation
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JournalCreditKey) {
			JournalCreditKey o = (JournalCreditKey) obj;
			return ((this.decCodeCreditaire.equals(o.decCodeCreditaire))
				&& (this.decDateImputation.equals(o.decDateImputation)));
		}
		return false;
	}
	
	

}
