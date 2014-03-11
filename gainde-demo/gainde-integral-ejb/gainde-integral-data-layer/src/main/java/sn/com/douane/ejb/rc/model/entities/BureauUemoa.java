package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="BUREAUUEMOA")
public class BureauUemoa implements Serializable{

	private static final long serialVersionUID = 2953397184685436387L;

	@Id
	@Column(name="RCCODEBURUEMOA", length=4, nullable=false)
	private String rcCodeBurUemoa;
	
	@Column(name="RCLIBELLEBURUEMOA", length=100, nullable=false)
    private String rcLibelleBurUemoa;
	
	
	@OneToMany(mappedBy = "bureauMoa", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listBrouillonSegGenDec;
	

	public BureauUemoa() {
		
	}
	
	public BureauUemoa(String rcCodeBurUemoa, String rcLibelleBurUemoa) {
		super();
		this.rcCodeBurUemoa = rcCodeBurUemoa;
		this.rcLibelleBurUemoa = rcLibelleBurUemoa;
	}

	public String getRcCodeBurUemoa() {
		return rcCodeBurUemoa;
	}

	public void setRcCodeBurUemoa(String rcCodeBurUemoa) {
		this.rcCodeBurUemoa = rcCodeBurUemoa;
	}

	public String getRcLibelleBurUemoa() {
		return rcLibelleBurUemoa;
	}

	public void setRcLibelleBurUemoa(String rcLibelleBurUemoa) {
		this.rcLibelleBurUemoa = rcLibelleBurUemoa;
	}

	public List<BrouillonSegGenDec> getListBrouillonSegGenDec() {
		return listBrouillonSegGenDec;
	}

	public void setListBrouillonSegGenDec(List<BrouillonSegGenDec> listBrouillonSegGenDec) {
		this.listBrouillonSegGenDec = listBrouillonSegGenDec;
	}
}
