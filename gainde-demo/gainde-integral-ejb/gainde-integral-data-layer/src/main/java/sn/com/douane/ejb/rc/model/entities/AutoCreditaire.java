package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.rc.model.keys.AutoCreditaireKey;
import sn.com.douane.utils.DateUtil;


	@Entity
	@IdClass(AutoCreditaireKey.class)
	@NamedQueries(
			@NamedQuery(name = "findbyPpmautorisant", query = "select object(o) from AutoCreditaire o where o.ppmAutorisant = ?1"))
	@Table(name="AUTOCREDITAIRES")
	public class AutoCreditaire implements Serializable {
	   
	
		private static final long serialVersionUID = 3618586430943422136L;

		@Id
		@Column(name = "PPMAUTORISANT",length = 5,nullable = false)
		private String ppmAutorisant;
		
		@Id
		@Column(name = "PPMAUTORISE",length = 5,nullable = false)		
		private String ppmAutorise;
		
		@Id
		@Column(name = "DATEAUTORISATION",nullable = false)
		private java.sql.Date dateAutorisation;
		
		@Id
		@Column(name = "USERAUTORISATION",length = 8,nullable = false)
	    private String userAutorisation;
		
		@Id
		@Column(name = "REFAUTORISATION",length = 100,nullable = false)
	    private String refAutorisation;
	   
		@ManyToOne(targetEntity = Ppm.class)
		@JoinColumn(name = "PPMAUTORISANT",insertable = false,updatable = false)
	    private Ppm ppmAutorisants;
		
		@javax.persistence.ManyToOne(targetEntity = Ppm.class)
		@JoinColumn(name = "PPMAUTORISE",insertable = false,updatable = false)
	    private Ppm ppmAutorises;

		@Transient
		private java.lang.String codeAgree;

		@Transient
		private java.lang.String nomAgree;
		
		@Transient
		private String dateAutorisationString;
		
	    public AutoCreditaire() {
	    
	    }
	    
	    public AutoCreditaire(String ppmAutorisant,String ppmAutorise,java.sql.Date dateAutorisation,
	    						String userAutorisation,String refAutorisation) {
	    	
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

		public Ppm getPpmAutorisants() {
			return ppmAutorisants;
		}

		public void setPpmAutorisants(Ppm ppmAutorisants) {
			this.ppmAutorisants = ppmAutorisants;
		}

		public Ppm getPpmAutorises() {
			return ppmAutorises;
		}

		public void setPpmAutorises(Ppm ppmAutorises) {
			this.ppmAutorises = ppmAutorises;
		}

		public java.lang.String getCodeAgree() {
			return codeAgree;
		}

		public void setCodeAgree(java.lang.String codeAgree) {
			this.codeAgree = codeAgree;
		}

		public java.lang.String getNomAgree() {
			return nomAgree;
		}

		public void setNomAgree(java.lang.String nomAgree) {
			this.nomAgree = nomAgree;
		}

		public String getDateAutorisationString() {
			return DateUtil.getDate(getDateAutorisation());
		}

		public void setDateAutorisationString(String dateAutorisationString) {
			this.dateAutorisationString = dateAutorisationString;
		}
	    
		
	}
