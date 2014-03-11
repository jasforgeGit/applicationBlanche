package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="TYPEMISEENDEPOT")
public class TypeMiseEnDepot implements Serializable{

	private static final long serialVersionUID = -9102778488153631810L;

	@Id
	@Column(name="RCCODETYPEMISEDEPOT", length=1, nullable=false)
	private String rcCodeTypeMiseDepot;
	   
	@Column(name="RCLIBELLETYPEMISEDEPOT", length=100, nullable=false) 
	private String rcLibelleTypeMiseDepot;

	public TypeMiseEnDepot() {

	}

	public TypeMiseEnDepot(String rcCodeTypeMiseDepot,
			String rcLibelleTypeMiseDepot) {
		super();
		this.rcCodeTypeMiseDepot = rcCodeTypeMiseDepot;
		this.rcLibelleTypeMiseDepot = rcLibelleTypeMiseDepot;
	}

	public String getRcCodeTypeMiseDepot() {
		return rcCodeTypeMiseDepot;
	}

	public void setRcCodeTypeMiseDepot(String rcCodeTypeMiseDepot) {
		this.rcCodeTypeMiseDepot = rcCodeTypeMiseDepot;
	}

	public String getRcLibelleTypeMiseDepot() {
		return rcLibelleTypeMiseDepot;
	}

	public void setRcLibelleTypeMiseDepot(String rcLibelleTypeMiseDepot) {
		this.rcLibelleTypeMiseDepot = rcLibelleTypeMiseDepot;
	}
	 
	 
}
