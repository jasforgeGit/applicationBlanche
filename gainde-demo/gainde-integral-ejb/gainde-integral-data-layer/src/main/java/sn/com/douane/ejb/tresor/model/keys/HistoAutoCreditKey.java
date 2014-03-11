package sn.com.douane.ejb.tresor.model.keys;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Id;

public class HistoAutoCreditKey implements Serializable{

	private static final long serialVersionUID = -4255231772562033816L;
	
	
	@Column(name="DATEHISTOAUTO", length=1, nullable=false)
	private java.sql.Timestamp dateHistoAuto;

	
	@Column(name="PPMAUTORISANT", length=1, nullable=false)
    private java.lang.String ppmAutorisant;
	
	
	@Column(name="PPMAUTORISE", length=1, nullable=false)
    private java.lang.String ppmAutorise;
	
	
	@Column(name="DATEAUTORISATION", length=1, nullable=false)
    private java.sql.Date dateAutorisation;
	
	
	@Column(name="USERAUTORISATION", length=1, nullable=false)
    private java.lang.String userAutorisation;
	
	
	@Column(name="REFAUTORISATION", length=1, nullable=false)
    private java.lang.String refAutorisation;


	public HistoAutoCreditKey(Timestamp dateHistoAuto, String ppmAutorisant,
			String ppmAutorise, Date dateAutorisation, String userAutorisation,
			String refAutorisation) {
		super();
		this.dateHistoAuto = dateHistoAuto;
		this.ppmAutorisant = ppmAutorisant;
		this.ppmAutorise = ppmAutorise;
		this.dateAutorisation = dateAutorisation;
		this.userAutorisation = userAutorisation;
		this.refAutorisation = refAutorisation;
	}


	public HistoAutoCreditKey() {
		super();
		// TODO Auto-generated constructor stub
	}


	public java.sql.Timestamp getDateHistoAuto() {
		return dateHistoAuto;
	}


	public void setDateHistoAuto(java.sql.Timestamp dateHistoAuto) {
		this.dateHistoAuto = dateHistoAuto;
	}


	public java.lang.String getPpmAutorisant() {
		return ppmAutorisant;
	}


	public void setPpmAutorisant(java.lang.String ppmAutorisant) {
		this.ppmAutorisant = ppmAutorisant;
	}


	public java.lang.String getPpmAutorise() {
		return ppmAutorise;
	}


	public void setPpmAutorise(java.lang.String ppmAutorise) {
		this.ppmAutorise = ppmAutorise;
	}


	public java.sql.Date getDateAutorisation() {
		return dateAutorisation;
	}


	public void setDateAutorisation(java.sql.Date dateAutorisation) {
		this.dateAutorisation = dateAutorisation;
	}


	public java.lang.String getUserAutorisation() {
		return userAutorisation;
	}


	public void setUserAutorisation(java.lang.String userAutorisation) {
		this.userAutorisation = userAutorisation;
	}


	public java.lang.String getRefAutorisation() {
		return refAutorisation;
	}


	public void setRefAutorisation(java.lang.String refAutorisation) {
		this.refAutorisation = refAutorisation;
	}
	
	

}
