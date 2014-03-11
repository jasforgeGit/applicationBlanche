package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.ExceptionsTaxesKey;


@Entity
@Table(name = "EXCEPTIONSTAXES")
@IdClass(ExceptionsTaxesKey.class)
@NamedQueries({
	@javax.persistence.NamedQuery(name = "findByCodetaxeDate", 
		query = "select object(o) from ExceptionsTaxes o where o.rcCodeTaxe = ?1 and (o.rcDateValeur<= ?2 and (?2 <= o.rcDateCloture or o.rcDateCloture is null))"),
	@javax.persistence.NamedQuery(name = "findByCodetaxeDateNiveauexception", 
		query = "select object(o) from ExceptionsTaxes o where o.rcCodeTaxe = ?1 and (o.rcDateValeur<= ?2 and (?2 <= o.rcDateCloture or o.rcDateCloture is null))  " +
				"  and o.rcNiveauException= ?3")})
public class ExceptionsTaxes implements Serializable {
	
	
   
	private static final long serialVersionUID = 4694844734776684927L;
	
	@Id
	@Column(name = "RCCODEEXCEPTION",length = 4,nullable = false)
	private String rcCodeException;
	
	@Id
	@Column(name = "RCCODETAXE",length = 2,nullable = false)
    private String rcCodeTaxe;
	
	@Id
	@Column(name = "RCDATEVALEUR",nullable = false)
	private java.sql.Date rcDateValeur;
	
	@Id
	@Column(name = "RCNIVEAUEXCEPTION",length = 15,nullable = false)	
    private String rcNiveauException;
	
	
	@ManyToOne(targetEntity = Exceptions.class)
	@JoinColumn(name = "rcCodeException",insertable=false, updatable=false)
	private Exceptions exception;
  
	@ManyToOne(targetEntity = Taxe.class)
	@JoinColumn(name = "rcCodeTaxe",insertable=false, updatable=false)
	private Taxe taxe;
	
	@Column(name = "RCDATECLOTURE")
    private java.sql.Date rcDateCloture;    
	

	@Column(name = "RCFORMULE",length = 100,nullable = false)
    private String rcFormule;
    
	@Column(name = "RCCONDITION",length = 1000,nullable = false)
    private String rcCondition;
  
	public ExceptionsTaxes() {
	    
	}
   
	public ExceptionsTaxes(java.sql.Date rcdatevaleur, String rcniveauexception,
            				String rccodeexception,String rccodetaxe) {
		super(); 
		this.rcDateValeur = rcdatevaleur;
		this.rcNiveauException = rcniveauexception;
		this.rcCodeException = rccodeexception;
		this.rcCodeTaxe = rccodetaxe;
		
	}
    
	public Taxe getTaxe() {
		return taxe;
	}


	public void setTaxe(Taxe taxe) {
		this.taxe = taxe;
	}


	public Exceptions getException() {
		return exception;
	}


	public void setException(Exceptions exception) {
		this.exception = exception;
	}	
	
	public String getRcCodeException() {
		return rcCodeException;
	}

	public void setRcCodeException(String rcCodeException) {
		this.rcCodeException = rcCodeException;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcNiveauException() {
		return rcNiveauException;
	}

	public void setRcNiveauException(String rcNiveauException) {
		this.rcNiveauException = rcNiveauException;
	}

	public java.sql.Date getRcDateCloture() {
		return rcDateCloture;
	}

	public void setRcDateCloture(java.sql.Date rcDateCloture) {
		this.rcDateCloture = rcDateCloture;
	}

	public String getRcFormule() {
		return rcFormule;
	}

	public void setRcFormule(String rcFormule) {
		this.rcFormule = rcFormule;
	}

	public String getRcCondition() {
		return rcCondition;
	}

	public void setRcCondition(String rcCondition) {
		this.rcCondition = rcCondition;
	}

   

    
}
