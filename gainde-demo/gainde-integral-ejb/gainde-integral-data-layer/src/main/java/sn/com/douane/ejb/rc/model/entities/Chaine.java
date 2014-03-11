package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.TransactionAttribute;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "CHAINE")
public class Chaine implements Serializable {

	private static final long serialVersionUID = -2634898726672375065L;

	@Id
	@Column(name = "RCCODECHAINE", nullable = false)
	private Integer rcCodeChaine;

	@Column(name = "RCLIBELLECHAINE", length = 500, nullable = false)
	private String rcLibelleChaine;

	@Column(name = "RCCODECRITERELOGIQUE", nullable = false)
	private Integer rcCodeCritereLogique;

	@OneToMany(mappedBy = "chaine", targetEntity = DetailChaine.class)
	private List<DetailChaine> detailchaine = new ArrayList<DetailChaine>();

	@ManyToOne(targetEntity = CritereLogique.class)
	@JoinColumn(name = "rcCodeCritereLogique", insertable = false, updatable = false)
	private CritereLogique critereLogique;

	@Transient
	private String rcCircuitVisite; 
	
	public Chaine() {

	}

	public Chaine(Integer rccodechaine) {
		this.rcCodeChaine = rccodechaine;
	}

	public Chaine(Integer rcCodeChaine, String rcLibelleChaine,
			Integer rcCodeCritereLogique) {
		super();
		this.rcCodeChaine = rcCodeChaine;
		this.rcLibelleChaine = rcLibelleChaine;
		this.rcCodeCritereLogique = rcCodeCritereLogique;
	}

	public Integer getRcCodeChaine() {
		return rcCodeChaine;
	}

	public void setRcCodeChaine(Integer rcCodeChaine) {
		this.rcCodeChaine = rcCodeChaine;
	}

	public String getRcLibelleChaine() {
		return rcLibelleChaine;
	}

	public void setRcLibelleChaine(String rcLibelleChaine) {
		this.rcLibelleChaine = rcLibelleChaine;
	}

	public Integer getRcCodeCritereLogique() {
		return rcCodeCritereLogique;
	}

	public void setRcCodeCritereLogique(Integer rcCodeCritereLogique) {
		this.rcCodeCritereLogique = rcCodeCritereLogique;
	}

	public CritereLogique getCritereLogique() {
		return critereLogique;
	}

	public void setCritereLogique(CritereLogique critereLogique) {
		this.critereLogique = critereLogique;
	}

	public List<DetailChaine> getDetailchaine() {
		return detailchaine;
	}

	public void setDetailchaine(List<DetailChaine> detailchaine) {
		this.detailchaine = detailchaine;
	}

	public String getRcCircuitVisite() {
		return rcCircuitVisite;
	}

	public void setRcCircuitVisite(String rcCircuitVisite) {
		this.rcCircuitVisite = rcCircuitVisite;
	}

}