package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "REGIMEFISCAL")
public class RegimeFiscal implements Serializable {

	private static final long serialVersionUID = 7854479206937818554L;

	@Id
	@Column(name = "RCCODEREGIMEFISCAL", length = 2, nullable = false)
	private String rcCodeRegimeFiscal;

	@Column(name = "RCLIBELLEREGIMEFISCAL", length = 250, nullable = false)
	private String rcLibelleRegimeFiscal;

	@Column(name = "INDREGEXO", length = 1, nullable = false)
	private String indRegExo;

	@Column(name = "RCINDSUSPENSION", length = 1, nullable = false)
	private String rcIndSuspension;

	@OneToMany(mappedBy = "regFscRegime", targetEntity = Regime.class)
	private List<Regime> regimes;

	@OneToMany(mappedBy = "regimeFiscale", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonArtDec;

	public RegimeFiscal() {
	}

	public RegimeFiscal(String rcCodeRegimeFiscal,
			String rcLibelleRegimeFiscal, String indRegExo,
			String rcIndSuspension) {
		super();
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
		this.rcLibelleRegimeFiscal = rcLibelleRegimeFiscal;
		this.indRegExo = indRegExo;
		this.rcIndSuspension = rcIndSuspension;
	}

	public String getRcCodeRegimeFiscal() {
		return rcCodeRegimeFiscal;
	}

	public void setRcCodeRegimeFiscal(String rcCodeRegimeFiscal) {
		this.rcCodeRegimeFiscal = rcCodeRegimeFiscal;
	}

	public String getRcLibelleRegimeFiscal() {
		return rcLibelleRegimeFiscal;
	}

	public void setRcLibelleRegimeFiscal(String rcLibelleRegimeFiscal) {
		this.rcLibelleRegimeFiscal = rcLibelleRegimeFiscal;
	}

	public String getIndRegExo() {
		return indRegExo;
	}

	public void setIndRegExo(String indRegExo) {
		this.indRegExo = indRegExo;
	}

	public String getRcIndSuspension() {
		return rcIndSuspension;
	}

	public void setRcIndSuspension(String rcIndSuspension) {
		this.rcIndSuspension = rcIndSuspension;
	}

	public List<Regime> getRegimes() {
		return regimes;
	}

	public void setRegimes(List<Regime> regimes) {
		this.regimes = regimes;
	}

	public List<BrouillonArtDec> getListBrouillonArtDec() {
		return listBrouillonArtDec;
	}

	public void setListBrouillonArtDec(List<BrouillonArtDec> listBrouillonArtDec) {
		this.listBrouillonArtDec = listBrouillonArtDec;
	}

}
