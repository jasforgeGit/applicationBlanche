package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.RegeCoprodFiniBurKey;


/**
 * RegeCoprodFiniBur EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(RegeCoprodFiniBurKey.class)
@Table(name = "REGECOPRODFINIBUR")
public class RegeCoprodFiniBur implements Serializable {

	private static final long serialVersionUID = 222074687326597072L;
	
	@Id
	@Column(name = "RCANNEEREGECO", length = 4, nullable = false)	
	private String rcanneeregeco;
	
	@Id
	@Column(name = "RCCODEPPM", length = 5, nullable = false)	
	private String rccodeppm;

	@Id
	@Column(name = "RCCODEREGECO", length = 6, nullable = false)
	private String rccoderegeco;

	@Id
	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rccodeprod;

	@Id
	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcprecuemoa;

	@Id
	@Column(name = "RCCODEBUREAU", length = 3, nullable = false)
	private String rccodeburdouane;

	@Id
	@Column(name = "RCPRECSEN", length = 2, nullable = false)
	private String rcprecsenegal;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "RCCODEBUREAU", insertable=false, updatable=false)
	private BureauDouane burregecopfbr;
	
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
		@JoinColumn(name = "RCCODEPROD", referencedColumnName = "rccodeprod", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "RCPRECUEMOA", referencedColumnName = "rcprecuemoa", insertable = false, updatable = false, nullable = false),
		@JoinColumn(name = "RCPRECSEN", referencedColumnName = "rcprecsenegal", insertable = false, updatable = false, nullable = false) })
	private Produit pdrecopfbur;

	/**
	 * Enable JPA optimstic lock.
	 */
//	@Version
//	@Column(nullable = false)
//	private int version;
//	
	
	public RegeCoprodFiniBur(String rcanneeregeco, String rccoderegeco,
			String rccodeburdouane, String rccodeprod, String rcprecuemoa,
			String rcprecsenegal, String rccodeppm) {
		super();
		this.rcanneeregeco = rcanneeregeco;
		this.rccoderegeco = rccoderegeco;
		this.rccodeburdouane = rccodeburdouane;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
		this.rccodeppm = rccodeppm;
	}

	/**
	 * 0-args constructor.
	 */
	public RegeCoprodFiniBur() {
		super();
	}	

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
	}

	public BureauDouane getBurregecopfbr() {
		return burregecopfbr;
	}

	public void setBurregecopfbr(BureauDouane burregecopfbr) {
		this.burregecopfbr = burregecopfbr;
	}

	public Produit getPdrecopfbur() {
		return pdrecopfbur;
	}

	public void setPdrecopfbur(Produit pdrecopfbur) {
		this.pdrecopfbur = pdrecopfbur;
	}
	

	public String getRcanneeregeco() {
		return rcanneeregeco;
	}

	public void setRcanneeregeco(String rcanneeregeco) {
		this.rcanneeregeco = rcanneeregeco;
	}

	public String getRccoderegeco() {
		return rccoderegeco;
	}

	public void setRccoderegeco(String rccoderegeco) {
		this.rccoderegeco = rccoderegeco;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
	}

	public String getRccodeprod() {
		return rccodeprod;
	}

	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}

	public String getRcprecuemoa() {
		return rcprecuemoa;
	}

	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}

	public String getRcprecsenegal() {
		return rcprecsenegal;
	}

	public void setRcprecsenegal(String rcprecsenegal) {
		this.rcprecsenegal = rcprecsenegal;
	}

	
}
