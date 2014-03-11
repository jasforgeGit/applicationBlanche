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
@Table(name = "TYPEAPUREMENT")
public class TypeApurement implements Serializable {

	private static final long serialVersionUID = -308593017900388734L;

	@Id
	@Column(name = "RCCODEAPUREMENT", length = 1, nullable = false)
	private String rcCodeApurement;

	@Column(name = "RCLIBELLEAPUREMENT", length = 100, nullable = false)
	private String rcLibelleApurement;

	@OneToMany(mappedBy = "typeApurement", targetEntity = BrouillonSegGenDec.class)
	private List<BrouillonSegGenDec> listeTypeApurement;
	

	public TypeApurement() {

	}

	public TypeApurement(String rcCodeApurement, String rcLibelleApurement) {
		super();
		this.rcCodeApurement = rcCodeApurement;
		this.rcLibelleApurement = rcLibelleApurement;
	}

	/**
	 * @return the rcCodeApurement
	 */
	public String getRcCodeApurement() {
		return rcCodeApurement;
	}

	/**
	 * @param rcCodeApurement
	 *            the rcCodeApurement to set
	 */
	public void setRcCodeApurement(String rcCodeApurement) {
		this.rcCodeApurement = rcCodeApurement;
	}

	/**
	 * @return the rcLibelleApurement
	 */
	public String getRcLibelleApurement() {
		return rcLibelleApurement;
	}

	/**
	 * @param rcLibelleApurement
	 *            the rcLibelleApurement to set
	 */
	public void setRcLibelleApurement(String rcLibelleApurement) {
		this.rcLibelleApurement = rcLibelleApurement;
	}

	public List<BrouillonSegGenDec> getListeTypeApurement() {
		return listeTypeApurement;
	}

	public void setListeTypeApurement(
			List<BrouillonSegGenDec> listeTypeApurement) {
		this.listeTypeApurement = listeTypeApurement;
	}

	@Override
	public String toString() {
		return rcLibelleApurement;
	}

	
}
