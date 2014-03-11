package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.ScoreConsignataireKey;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@IdClass(ScoreConsignataireKey.class)
@Table(name = "SCORECONSIGNATAIRE")
public class ScoreConsignataire implements Serializable {

	private static final long serialVersionUID = 1194504777521492688L;

	@Id
	@Column(name = "RCCODECONSIGNATAIRE", length = 3, nullable = false)
	private String rcCodeConsignataire;

	@Id
	@Column(name = "RCCODEBUREAU", columnDefinition = "CHAR(3)", nullable = false)
	private String rcCodeBureau;

	@Column(name = "RCDATEDEBUT", nullable = false)
	private Date rcDateDebut;

	@Column(name = "RCDATEFIN", nullable = false)
	private Date rcDateFin;

	@Column(name = "RCSCORECONSIGN", nullable = false)
	private Integer rcScoreConsign;

	@ManyToOne(targetEntity = Consignataire.class)
	@JoinColumn(name = "RCCODECONSIGNATAIRE", insertable = false, updatable = false)
	private Consignataire consigScoreC;

	public ScoreConsignataire() {

	}

	public ScoreConsignataire(String rcCodeConsignataire, String rcCodeBureau,
			Date rcDateDebut, Date rcDateFin, Integer rcScoreConsign) {
		super();
		this.rcCodeConsignataire = rcCodeConsignataire;
		this.rcCodeBureau = rcCodeBureau;
		this.rcDateDebut = rcDateDebut;
		this.rcDateFin = rcDateFin;
		this.rcScoreConsign = rcScoreConsign;
	}

	public String getRcCodeConsignataire() {
		return rcCodeConsignataire;
	}

	public void setRcCodeConsignataire(String rcCodeConsignataire) {
		this.rcCodeConsignataire = rcCodeConsignataire;
	}

	public String getRcCodeBureau() {
		return rcCodeBureau;
	}

	public void setRcCodeBureau(String rcCodeBureau) {
		this.rcCodeBureau = rcCodeBureau;
	}

	public Date getRcDateDebut() {
		return rcDateDebut;
	}

	public void setRcDateDebut(Date rcDateDebut) {
		this.rcDateDebut = rcDateDebut;
	}

	public Date getRcDateFin() {
		return rcDateFin;
	}

	public void setRcDateFin(Date rcDateFin) {
		this.rcDateFin = rcDateFin;
	}

	public Integer getRcScoreConsign() {
		return rcScoreConsign;
	}

	public void setRcScoreConsign(Integer rcScoreConsign) {
		this.rcScoreConsign = rcScoreConsign;
	}

	public Consignataire getConsigScoreC() {
		return consigScoreC;
	}

	public void setConsigScoreC(Consignataire consigScoreC) {
		this.consigScoreC = consigScoreC;
	}

	
	
}
