package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TYPEAVOIR")
public class TypeAvoir implements Serializable{

	private static final long serialVersionUID = 8343518201014806455L;

	@Id
	@Column(name = "TRTYPEAVOIR", length = 1, nullable = false)
	private java.lang.String trTypeAvoir;

	@Column(name = "TRLIBELLEAVOIR", length = 100, nullable = false)
	private java.lang.String trLibelleAvoir;

	@OneToMany(mappedBy = "typLigneAvoir", targetEntity = LigneAvoir.class)
	private Set<LigneAvoir> lignesAvoir;

	public java.lang.String getTrTypeAvoir() {
		return trTypeAvoir;
	}

	public void setTrTypeAvoir(java.lang.String trTypeAvoir) {
		this.trTypeAvoir = trTypeAvoir;
	}

	public java.lang.String getTrLibelleAvoir() {
		return trLibelleAvoir;
	}

	public void setTrLibelleAvoir(java.lang.String trLibelleAvoir) {
		this.trLibelleAvoir = trLibelleAvoir;
	}

	public Set<LigneAvoir> getLignesAvoir() {
		return lignesAvoir;
	}

	public void setLignesAvoir(Set<LigneAvoir> lignesAvoir) {
		this.lignesAvoir = lignesAvoir;
	}

}
