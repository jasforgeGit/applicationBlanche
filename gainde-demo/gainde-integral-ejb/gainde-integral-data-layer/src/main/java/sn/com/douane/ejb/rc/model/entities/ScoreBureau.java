package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ScoreBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "ScoreBureau")
public class ScoreBureau implements Serializable {

	private static final long serialVersionUID = 8350131897628134637L;

	@Id
	@Column(name = "RCSCORE", nullable = false)
	private Integer rcscore;

	@Column(name = "RCANNEESCORE", nullable = false, length = 4)
	private String rcanneescore;

	@ManyToOne
	@JoinColumn(name = "RCCODEBUR", nullable = false)
	private BureauDouane burscorebur;

	/**
	 * Enable JPA optimstic lock.
	 */
	// @SuppressWarnings("unused")
	// @Version
	// @Column(nullable = false)
	// private int version;
	//
	/**
	 * 0-args constructor.
	 */
	public ScoreBureau() {
		super();
	}

	/**
	 * 2-args constructor.
	 */
	public ScoreBureau(Integer rcscore, String rcanneescore) {
		super();
		this.rcscore = rcscore;
		this.rcanneescore = rcanneescore;
	}

	/**
	 * Get accessor for persistent attribute: rcanneescore
	 */
	public String getRcanneescore() {
		return rcanneescore;
	}

	/**
	 * Set accessor for persistent attribute: rcanneescore
	 */
	public void setRcanneescore(String rcanneescore) {
		this.rcanneescore = rcanneescore;
	}

	/**
	 * Get accessor for persistent attribute: rcscore
	 */
	public Integer getRcscore() {
		return rcscore;
	}

	/**
	 * Set accessor for persistent attribute: rcscore
	 */
	public void setRcscore(Integer rcscore) {
		this.rcscore = rcscore;
	}

	public BureauDouane getBurscorebur() {
		return burscorebur;
	}

	public void setBurscorebur(BureauDouane burscorebur) {
		this.burscorebur = burscorebur;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((burscorebur == null) ? 0 : burscorebur.hashCode());
		result = prime * result
				+ ((rcanneescore == null) ? 0 : rcanneescore.hashCode());
		result = prime * result + ((rcscore == null) ? 0 : rcscore.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		ScoreBureau other = (ScoreBureau) obj;
		if (burscorebur == null) {
			if (other.burscorebur != null) {
				return false;
			}
		} else if (!burscorebur.equals(other.burscorebur)) {
			return false;
		}
		if (rcanneescore == null) {
			if (other.rcanneescore != null) {
				return false;
			}
		} else if (!rcanneescore.equals(other.rcanneescore)) {
			return false;
		}
		if (rcscore == null) {
			if (other.rcscore != null) {
				return false;
			}
		} else if (!rcscore.equals(other.rcscore)) {
			return false;
		}
		return true;
	}
}
