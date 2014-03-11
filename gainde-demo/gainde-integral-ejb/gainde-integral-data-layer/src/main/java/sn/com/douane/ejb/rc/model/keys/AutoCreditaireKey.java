package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class AutoCreditaireKey implements Serializable {
	
	
	private static final long serialVersionUID = -4121114864175000006L;

	@Column(name = "PPMAUTORISANT",length = 5,nullable = false)
	private String ppmAutorisant;
	
	@Column(name = "PPMAUTORISE",length = 5,nullable = false)		
	private String ppmAutorise;
	
	@Column(name = "DATEAUTORISATION",nullable = false)
	private java.sql.Date dateAutorisation;
	
	@Column(name = "USERAUTORISATION",length = 8,nullable = false)
    private String userAutorisation;
	
	@Column(name = "REFAUTORISATION",length = 100,nullable = false)
    private String refAutorisation;
	
	
	public AutoCreditaireKey(){
		
	}	
	
	public AutoCreditaireKey(String ppmAutorisant, String ppmAutorise,
			Date dateAutorisation, String userAutorisation,
			String refAutorisation) {
		super();
		this.ppmAutorisant = ppmAutorisant;
		this.ppmAutorise = ppmAutorise;
		this.dateAutorisation = dateAutorisation;
		this.userAutorisation = userAutorisation;
		this.refAutorisation = refAutorisation;
	}

	public String getPpmAutorisant() {
		return ppmAutorisant;
	}

	public void setPpmAutorisant(String ppmAutorisant) {
		this.ppmAutorisant = ppmAutorisant;
	}

	public String getPpmAutorise() {
		return ppmAutorise;
	}

	public void setPpmAutorise(String ppmAutorise) {
		this.ppmAutorise = ppmAutorise;
	}

	public java.sql.Date getDateAutorisation() {
		return dateAutorisation;
	}

	public void setDateAutorisation(java.sql.Date dateAutorisation) {
		this.dateAutorisation = dateAutorisation;
	}

	public String getUserAutorisation() {
		return userAutorisation;
	}

	public void setUserAutorisation(String userAutorisation) {
		this.userAutorisation = userAutorisation;
	}

	public String getRefAutorisation() {
		return refAutorisation;
	}

	public void setRefAutorisation(String refAutorisation) {
		this.refAutorisation = refAutorisation;
	}
	
	
	

}
