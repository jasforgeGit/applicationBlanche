package sn.com.douane.ejb.demat.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;

@Entity
@Table(name = "UVISITEPHYSIQUE")
public class UniteDeVisitePhysique implements Serializable{

	private static final long serialVersionUID = 3341609615129449434L;

	@Id
	@Column(name = "IDUVP", nullable = false)
	private long idUvp;

	@Column(name = "VERSION", nullable = false)
	private Integer version;

	@Column(name = "NUMERO", length = 35)
	private String numero;

	@Column(name = "ETAT")
	private Integer etat;

	@Column(name = "NBOUVERTURE")
	private Integer nbOuverture;

	@Column(name = "NOMSAGENTS", length = 200)
	private String nomsAgents;

	@Column(name = "BUREAU", length = 3)
	private String bureau;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "BUREAU", referencedColumnName = "RCCODEBURDOUANE", insertable = false, updatable = false)
	private List<BureauDouane> bureauDouane;

	@OneToMany(mappedBy = "uniteVisitePhysique")
	private List<AgentDouane> agentDouanes;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public List<AgentDouane> getAgentDouanes() {
		return agentDouanes;
	}

	public void setAgentDouanes(List<AgentDouane> agentDouanes) {
		this.agentDouanes = agentDouanes;
	}

	public String getNomsAgents() {
		return nomsAgents;
	}

	public void setNomsAgents(String nomsAgents) {
		this.nomsAgents = nomsAgents;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public long getIdUvp() {
		return idUvp;
	}

	public void setIdUvp(long idUvp) {
		this.idUvp = idUvp;
	}

	public Integer getEtat() {
		return etat;
	}

	public void setEtat(Integer etat) {
		this.etat = etat;
	}

	public Integer getNbOuverture() {
		return nbOuverture;
	}

	public void setNbOuverture(Integer nbOuverture) {
		this.nbOuverture = nbOuverture;
	}

	public String getBureau() {
		return bureau;
	}

	public void setBureau(String bureau) {
		this.bureau = bureau;
	}

	public List<BureauDouane> getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(List<BureauDouane> bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

}