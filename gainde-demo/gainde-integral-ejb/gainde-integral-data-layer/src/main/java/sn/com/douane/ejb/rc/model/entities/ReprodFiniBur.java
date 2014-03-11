package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.ReprodFiniBurKey;

/**
 * ReprodFiniBur EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(ReprodFiniBurKey.class)
@Table(name = "Reprodfinibur")
public class ReprodFiniBur implements Serializable {
    
	private static final long serialVersionUID = -5412776176451712851L;
		
	@Id
	@Column(name = "RCCODEPPM", nullable = false, length = 5)
	private String rccodeppm;
	
	@Id
	@Column(name = "RCANNEEREGECO", nullable = false, length = 4)
    private String rcanneeregeco;
    
	@Id
	@Column(name = "RCCODEREGECO", nullable = false, length = 6)
    private String rccoderegeco;
    
	@Id
	@Column(name = "RCCODEPROD", nullable = false, length = 6)
    private String rccodeprod;
    
	@Id
	@Column(name = "RCPRECUEMOA", nullable = false, length = 2)
    private String rcprecuemoa;
    
	@Id	
	@Column(name = "RCPRECSEN", nullable = false, length = 2)
    private String rcprecsen;
	
	@Id	
	@Column(name="RCCODEBUREAU", nullable = false, length = 3)
	private String rccodeburdouane;
    
    @ManyToOne(targetEntity = BureauDouane.class)
    @JoinColumn(name = "RCCODEBUREAU", insertable=false, updatable=false)
    private BureauDouane burrepfbur;

	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

    /**
     * 0-args default constructor.
     */
    public ReprodFiniBur() { 
    	super();
    }
    
    public ReprodFiniBur(String rccodeppm, String rcanneeregeco, String rccoderegeco, String rccodeprod, String rcprecuemoa,
						 String rcprecsen, String rccodeburdouane) {
		super();
		this.rccodeppm = rccodeppm;
		this.rcanneeregeco = rcanneeregeco;
		this.rccoderegeco = rccoderegeco;
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsen = rcprecsen;
		this.rccodeburdouane = rccodeburdouane;	
	}

	public BureauDouane getBurrepfbur() {
		return burrepfbur;
	}

	public void setBurrepfbur(BureauDouane burrepfbur) {
		this.burrepfbur = burrepfbur;
	}
	

	public String getRccodeppm() {
		return rccodeppm;
	}

	public void setRccodeppm(String rccodeppm) {
		this.rccodeppm = rccodeppm;
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

	public String getRcprecsen() {
		return rcprecsen;
	}

	public void setRcprecsen(String rcprecsen) {
		this.rcprecsen = rcprecsen;
	}

	public String getRccodeburdouane() {
		return rccodeburdouane;
	}

	public void setRccodeburdouane(String rccodeburdouane) {
		this.rccodeburdouane = rccodeburdouane;
	}
   
}
