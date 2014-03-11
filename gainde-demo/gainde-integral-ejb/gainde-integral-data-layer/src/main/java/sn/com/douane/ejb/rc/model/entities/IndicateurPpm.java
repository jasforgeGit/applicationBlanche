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

import sn.com.douane.ejb.rc.model.keys.IndicateurPpmKey;

@Entity
@IdClass(IndicateurPpmKey.class)
@Table(name="INDICATEURPPM")
public class IndicateurPpm implements Serializable{

	private static final long serialVersionUID = 980344605396558194L;
	
	@Id
	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
	
	@Id
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
    private String rcCodeIndicateur;
	
	@Id
	@Column(name="RCDATEVALIDITE", nullable=false)
	private Date rcDateValidite;
	
	@Column(name="RCDATECLOTURE")
    private Date rcDateCloture;
      
	@ManyToOne(targetEntity = Indicateur.class)
	@JoinColumn(name="RCCODEINDICATEUR", insertable=false, updatable=false)
    private Indicateur indIndRegime;
    
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name="RCCODEPPM", insertable=false, updatable=false)
    private Ppm ppmIndPpm;
    
	public IndicateurPpm() {
	}
	
	public IndicateurPpm(String rcCodePpm, String rcCodeIndicateur,
			Date rcDateValidite) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
	}
	public Date getRcDateValidite() {
		return rcDateValidite;
	}
	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}
	public Date getRcDateCloture() {
		return rcDateCloture;
	}
	public void setRcDateCloture(Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}
	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}
	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}
	public String getRcCodePpm() {
		return rcCodePpm;
	}
	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}
	public Indicateur getIndIndRegime() {
		return indIndRegime;
	}
	public void setIndIndRegime(Indicateur indIndRegime) {
		this.indIndRegime = indIndRegime;
	}
	public Ppm getPpmIndPpm() {
		return ppmIndPpm;
	}
	public void setPpmIndPpm(Ppm ppmIndPpm) {
		this.ppmIndPpm = ppmIndPpm;
	}

}
