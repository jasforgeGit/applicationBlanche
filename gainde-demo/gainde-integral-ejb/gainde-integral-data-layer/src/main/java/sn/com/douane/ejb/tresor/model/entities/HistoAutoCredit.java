package sn.com.douane.ejb.tresor.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;


import sn.com.douane.ejb.tresor.model.keys.HistoAutoCreditKey;

@Entity
@IdClass(HistoAutoCreditKey.class)
@Table(name="HISTOAUTOCREDIT")
public class HistoAutoCredit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2511045752248902433L;
	
	
	@Id
	@Column(name="DATEHISTOAUTO", length=1, nullable=false)
	private java.sql.Timestamp dateHistoAuto;
	
	@Id
	@Column(name="PPMAUTORISANT", length=1, nullable=false)
    private java.lang.String ppmAutorisant;
	
	@Id
	@Column(name="PPMAUTORISE", length=1, nullable=false)
    private java.lang.String ppmAutorise;
	
	@Id
	@Column(name="DATEAUTORISATION", length=1, nullable=false)
    private java.sql.Date dateAutorisation;
	
	@Id
	@Column(name="USERAUTORISATION", length=1, nullable=false)
    private java.lang.String userAutorisation;
	
	@Id
	@Column(name="REFAUTORISATION", length=1, nullable=false)
    private java.lang.String refAutorisation;

	public HistoAutoCredit(Timestamp dateHistoAuto, String ppmAutorisant,
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

	public HistoAutoCredit() {
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
