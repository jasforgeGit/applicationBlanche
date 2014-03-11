package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.BurDouaneTypeManPK;

/**
 * BurDouaneTypeMan EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "BURDOUANETYPEMAN")
@IdClass(BurDouaneTypeManPK.class)
public class BureauDouaneTypeManifeste implements Serializable {

	private static final long serialVersionUID = -2969939129657000720L;

	@Id
	@Column(name = "RCCODEBURDOUANE", length = 3, nullable = false)
	private String rcCodeBurDouane;

	@Id
	@Column(name = "RCCODETYPEMANIF", nullable = false)
	private Integer rcCodeTypeManif;

	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "RCCODEBURDOUANE",referencedColumnName = "RCCODEBURDOUANE", insertable = false, updatable = false, nullable = false)
	private BureauDouane bureauDouane;

	@ManyToOne(targetEntity = TypeManifeste.class)
	@JoinColumn(name = "RCCODETYPEMANIF",referencedColumnName = "RCCODETYPEMANIF", insertable = false, updatable = false, nullable = false)
	private TypeManifeste typeManifeste;

	/**
	 * 0-args constructor.
	 */
	public BureauDouaneTypeManifeste() {
		super();
	}

	public BureauDouaneTypeManifeste(String rcCodeBurDouane,
			Integer rcCodeTypeManif) {
		super();
		this.rcCodeBurDouane = rcCodeBurDouane;
		this.rcCodeTypeManif = rcCodeTypeManif;
	}

	public TypeManifeste getTypeManifeste() {
		return typeManifeste;
	}

	public void setTypeManifeste(TypeManifeste typeManifeste) {
		this.typeManifeste = typeManifeste;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}

	public String getRcCodeBurDouane() {
		return rcCodeBurDouane;
	}

	public void setRcCodeBurDouane(String rcCodeBurDouane) {
		this.rcCodeBurDouane = rcCodeBurDouane;
	}

	public Integer getRcCodeTypeManif() {
		return rcCodeTypeManif;
	}

	public void setRcCodeTypeManif(Integer rcCodeTypeManif) {
		this.rcCodeTypeManif = rcCodeTypeManif;
	}

}
