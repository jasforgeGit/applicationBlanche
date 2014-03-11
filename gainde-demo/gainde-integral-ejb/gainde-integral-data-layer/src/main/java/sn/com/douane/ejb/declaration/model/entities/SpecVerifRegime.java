package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SpecVerifRegimeKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;



@Entity
@IdClass(SpecVerifRegimeKey.class)
@NamedQueries({
	@NamedQuery(name = "findByCodeVerificateur",
		query = "select object(o) from SpecVerifRegime o where  o.decCodeBureau = ?1 and  o.decVerificateur = ?2 and  o.decTypeRegime = ?3 " +
				"and  o.decRegDouanier = ?4 and  o.decRegimeFiscal = ?5")
	})
@Table(name = "SPECVERIFREGIME")
public class SpecVerifRegime implements Serializable {
	

	private static final long serialVersionUID = -2276336527718651738L;
	
	

	@Id
	@Column(name="DECCODEBUREAU", length=3, nullable=false)
	private java.lang.String decCodeBureau;
	
	@Id
	@Column(name="DECVERIFICATEUR", length=5, nullable=false)
	 private java.lang.String decVerificateur;
	
	@Id
	@Column(name="DECTYPEREGIME", length=1, nullable=false)
	private java.lang.String decTypeRegime;
	
	@Id
	@Column(name="DECREGDOUANIER", length=1, nullable=false)
	private java.lang.String decRegDouanier;
	
	@Id
	@Column(name="DECREGIMEFISCAL", length=2, nullable=false)
	private java.lang.String decRegimeFiscal;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "DECCODEBUREAU", insertable = false, updatable = false,nullable = false)
	private BureauDouane bureauDouane;	
	
	

	public SpecVerifRegime() {
		super();
	}

	public SpecVerifRegime(String decCodeBureau, String decVerificateur,
			String decTypeRegime, String decRegDouanier, String decRegimeFiscal) {
		super();
		this.decCodeBureau = decCodeBureau;
		this.decVerificateur = decVerificateur;
		this.decTypeRegime = decTypeRegime;
		this.decRegDouanier = decRegDouanier;
		this.decRegimeFiscal = decRegimeFiscal;
	}

	public java.lang.String getDecCodeBureau() {
		return decCodeBureau;
	}

	public void setDecCodeBureau(java.lang.String decCodeBureau) {
		this.decCodeBureau = decCodeBureau;
	}

	public java.lang.String getDecVerificateur() {
		return decVerificateur;
	}

	public void setDecVerificateur(java.lang.String decVerificateur) {
		this.decVerificateur = decVerificateur;
	}

	public java.lang.String getDecTypeRegime() {
		return decTypeRegime;
	}

	public void setDecTypeRegime(java.lang.String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}

	public java.lang.String getDecRegDouanier() {
		return decRegDouanier;
	}

	public void setDecRegDouanier(java.lang.String decRegDouanier) {
		this.decRegDouanier = decRegDouanier;
	}

	public java.lang.String getDecRegimeFiscal() {
		return decRegimeFiscal;
	}

	public void setDecRegimeFiscal(java.lang.String decRegimeFiscal) {
		this.decRegimeFiscal = decRegimeFiscal;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}
	
	

}
