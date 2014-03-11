/**
 * @author Zackaria
 *
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.VerifBureauKey;

@Entity
@IdClass(VerifBureauKey.class)
@Table(name="VERIFBUREAU")
@NamedQueries (@NamedQuery(name = "findByListeVerifDispo", 
               query = "select object(o) from VerifBureau o where  o.decCodeBureau = ?1 and o.decIndicDispo = ?2"))

public class VerifBureau implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2977870540000856174L;
	
	@Id
	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;
	
	@Id
	@Column(name="DECCODEVERIF", length=5, nullable=false)
    private java.lang.String decCodeVerif;
	
	@Column(name="DECINDICDISPO", length=1, nullable=false)
    private java.lang.String decIndicDispo;
	
	@Column(name="DECVALCAPACITE", nullable=false)
    private java.lang.Integer decValCapacite;
	
	@Column(name="DECVALCHARGE", nullable=false)
    private java.lang.Integer decValCharge;

	public VerifBureau() {
		super();
		// TODO Auto-generated constructor stub
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecCodeVerif() {
		return decCodeVerif;
	}

	public void setDecCodeVerif(java.lang.String decCodeVerif) {
		this.decCodeVerif = decCodeVerif;
	}

	public java.lang.String getDecIndicDispo() {
		return decIndicDispo;
	}

	public void setDecIndicDispo(java.lang.String decIndicDispo) {
		this.decIndicDispo = decIndicDispo;
	}

	public java.lang.Integer getDecValCapacite() {
		return decValCapacite;
	}

	public void setDecValCapacite(java.lang.Integer decValCapacite) {
		this.decValCapacite = decValCapacite;
	}

	public java.lang.Integer getDecValCharge() {
		return decValCharge;
	}

	public void setDecValCharge(java.lang.Integer decValCharge) {
		this.decValCharge = decValCharge;
	}

}
