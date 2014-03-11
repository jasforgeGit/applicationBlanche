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
@Table(name="ETATREGLEMENT")
public class EtatReglement implements Serializable{


	private static final long serialVersionUID = -5588845157507407324L;
	
	@Id
	@Column(name="RCCODETATREGLEMENT", length=1, nullable=false)
	private String rcCodEtatReglement;
	
	@Column(name="RCLIBETATREGLEMENT", length=100, nullable=false)
	private String rcLibEtatReglement;

	public EtatReglement(){
		
	}
	
	public EtatReglement(String rcCodEtatReglement, String rcLibEtatReglement) {
		super();
		this.rcCodEtatReglement = rcCodEtatReglement;
		this.rcLibEtatReglement = rcLibEtatReglement;
	}

	public String getRcCodEtatReglement() {
		return rcCodEtatReglement;
	}

	public void setRcCodEtatReglement(String rcCodEtatReglement) {
		this.rcCodEtatReglement = rcCodEtatReglement;
	}

	public String getRcLibEtatReglement() {
		return rcLibEtatReglement;
	}

	public void setRcLibEtatReglement(String rcLibEtatReglement) {
		this.rcLibEtatReglement = rcLibEtatReglement;
	}
}
