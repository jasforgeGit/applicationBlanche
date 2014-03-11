package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class IndicateurPpmKey implements Serializable{

	private static final long serialVersionUID = 4730971856376195262L;
	
	@Column(name="RCCODEPPM", length=5, nullable=false)
	private String rcCodePpm;
	
	@Column(name="RCCODEINDICATEUR", length=15, nullable=false)
    private String rcCodeIndicateur;
	
	@Column(name="RCDATEVALIDITE", nullable=false)
	private Date rcDateValidite;

	public IndicateurPpmKey() {

	}

	public IndicateurPpmKey(String rcCodePpm, String rcCodeIndicateur,
			Date rcDateValidite) {
		super();
		this.rcCodePpm = rcCodePpm;
		this.rcCodeIndicateur = rcCodeIndicateur;
		this.rcDateValidite = rcDateValidite;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public String getRcCodeIndicateur() {
		return rcCodeIndicateur;
	}

	public void setRcCodeIndicateur(String rcCodeIndicateur) {
		this.rcCodeIndicateur = rcCodeIndicateur;
	}

	public Date getRcDateValidite() {
		return rcDateValidite;
	}

	public void setRcDateValidite(Date rcDateValidite) {
		this.rcDateValidite = rcDateValidite;
	}

}
