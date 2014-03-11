package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="ETATDOSSIER")
public class EtatDossier implements Serializable {

	private static final long serialVersionUID = 8971466674965721463L;

	@Id
	@Column(name="RCCODETATDOSSIER", length=1, nullable=false)
	private String rcCodEtatDossier;

	@Column(name="RCLIBETATDOSSIER", length=100, nullable=false)
	private String rcLibEtatDossier;
	 
	@OneToMany(mappedBy = "etatDossier", targetEntity = EcheancierReglement.class)
	private List<EcheancierReglement> echeancierReglements;

	public EtatDossier() {
	}

	public EtatDossier(String rcCodEtatDossier, String rcLibEtatDossier) {
		super();
		this.rcCodEtatDossier = rcCodEtatDossier;
		this.rcLibEtatDossier = rcLibEtatDossier;
	}

	public String getRcCodEtatDossier() {
		return rcCodEtatDossier;
	}

	public void setRcCodEtatDossier(String rcCodEtatDossier) {
		this.rcCodEtatDossier = rcCodEtatDossier;
	}

	public String getRcLibEtatDossier() {
		return rcLibEtatDossier;
	}

	public void setRcLibEtatDossier(String rcLibEtatDossier) {
		this.rcLibEtatDossier = rcLibEtatDossier;
	}

	public List<EcheancierReglement> getEcheancierReglements() {
		return echeancierReglements;
	}

	public void setEcheancierReglements(List<EcheancierReglement> echeancierReglements) {
		this.echeancierReglements = echeancierReglements;
	}
	 
}
