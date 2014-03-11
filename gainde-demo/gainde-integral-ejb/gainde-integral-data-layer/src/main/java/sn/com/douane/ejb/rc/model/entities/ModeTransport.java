package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
import sn.com.douane.ejb.declaration.model.entities.DdeModifSegenDec;

@Entity
@Table(name = "MODETRANSPORT")
@NamedQueries(@NamedQuery(name = "ModeTransport.findAll", query = "select object(o) from ModeTransport o"))
public class ModeTransport implements Serializable {

	private static final long serialVersionUID = -3344035678124939451L;

	@Id
	@Column(name = "RCCODEMODETRANS", length = 2, nullable = false)
	private String rcCodeModeTrans;

	@Column(name = "RCLIBELLEMODETRANS", length = 50, nullable = false)
	private String rcLibelleModeTrans;

	@OneToMany(mappedBy = "modeTransport", targetEntity = TaxesTransport.class)
	private List<TaxesTransport> taxesTransport = new ArrayList<TaxesTransport>();

	@OneToMany(mappedBy = "modeTransport", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonSegGendec;

	@OneToMany(mappedBy = "modeTransport", targetEntity = DdeModifSegenDec.class)
	private List<DdeModifSegenDec> listDdeModifSegenDec;
	
	

	public ModeTransport() {

	}

	public ModeTransport(String rcCodeModeTrans) {
		super();
		this.rcCodeModeTrans = rcCodeModeTrans;

	}

	public ModeTransport(String rcCodeModeTrans, String rcLibelleModeTrans) {
		super();
		this.rcCodeModeTrans = rcCodeModeTrans;
		this.rcLibelleModeTrans = rcLibelleModeTrans;
	}

	public String getRcCodeModeTrans() {
		return rcCodeModeTrans;
	}

	public void setRcCodeModeTrans(String rcCodeModeTrans) {
		this.rcCodeModeTrans = rcCodeModeTrans;
	}

	public String getRcLibelleModeTrans() {
		return rcLibelleModeTrans;
	}

	public void setRcLibelleModeTrans(String rcLibelleModeTrans) {
		this.rcLibelleModeTrans = rcLibelleModeTrans;
	}

	public List<TaxesTransport> getTaxesTransport() {
		return taxesTransport;
	}

	public void setTaxesTransport(List<TaxesTransport> taxesTransport) {
		this.taxesTransport = taxesTransport;
	}

	public List<BrouillonSegGenDec> getListBrouillonSegGendec() {
		return listBrouillonSegGendec;
	}

	public void setListBrouillonSegGendec(
			List<BrouillonSegGenDec> listBrouillonSegGendec) {
		this.listBrouillonSegGendec = listBrouillonSegGendec;
	}

	public List<DdeModifSegenDec> getListDdeModifSegenDec() {
		return listDdeModifSegenDec;
	}

	public void setListDdeModifSegenDec(
			List<DdeModifSegenDec> listDdeModifSegenDec) {
		this.listDdeModifSegenDec = listDdeModifSegenDec;
	}	

}
