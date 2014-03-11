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
@Table(name="NATAPUREMANIF")
public class NatApureManif implements Serializable{

	private static final long serialVersionUID = -6038770310999809911L;

	@Id
	@Column(name="RCCODENATUREMANIF", length=1, nullable=false)
	private String rcCodeNatureManif;
	 
	@Column(name="RCNATUREAPUREMANIF", length=50, nullable=false)
	private String rcNatureApureManif;

	public NatApureManif() {

	}

	public NatApureManif(String rcCodeNatureManif, String rcNatureApureManif) {
		super();
		this.rcCodeNatureManif = rcCodeNatureManif;
		this.rcNatureApureManif = rcNatureApureManif;
	}

	public String getRcCodeNatureManif() {
		return rcCodeNatureManif;
	}

	public void setRcCodeNatureManif(String rcCodeNatureManif) {
		this.rcCodeNatureManif = rcCodeNatureManif;
	}

	public String getRcNatureApureManif() {
		return rcNatureApureManif;
	}

	public void setRcNatureApureManif(String rcNatureApureManif) {
		this.rcNatureApureManif = rcNatureApureManif;
	}
	
	
}
