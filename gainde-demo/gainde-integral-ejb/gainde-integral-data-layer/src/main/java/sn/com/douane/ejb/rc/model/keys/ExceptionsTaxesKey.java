package sn.com.douane.ejb.rc.model.keys;

import java.sql.Date;

import javax.persistence.Column;

public class ExceptionsTaxesKey implements java.io.Serializable{

	
	private static final long serialVersionUID = 6369245861730239928L;

	@Column(name = "RCCODEEXCEPTION",length = 4,nullable = false)
	private String rcCodeException;	
	
	@Column(name = "RCCODETAXE",length = 2,nullable = false)
    private String rcCodeTaxe;	
	
	private java.sql.Date rcDateValeur;	

	@Column(name = "RCNIVEAUEXCEPTION",length = 15,nullable = false)	
    private java.lang.String rcNiveauException;
		
	
	public ExceptionsTaxesKey(){
		
	}
	
	public ExceptionsTaxesKey(String codeException,String codeTaxe
							,Date dateValeur,String niveauException){
		super(); 
		this.rcCodeException = codeException;
		this.rcCodeTaxe = codeTaxe;
		this.rcDateValeur = dateValeur;
		this.rcNiveauException = niveauException;		
		
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

	public java.lang.String getRcNiveauException() {
		return rcNiveauException;
	}

	public void setRcNiveauException(java.lang.String rcNiveauException) {
		this.rcNiveauException = rcNiveauException;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeException == null) ? 0 : rcCodeException.hashCode());
		result = prime * result
				+ ((rcCodeTaxe == null) ? 0 : rcCodeTaxe.hashCode());
		result = prime * result
				+ ((rcDateValeur == null) ? 0 : rcDateValeur.hashCode());
		result = prime
				* result
				+ ((rcNiveauException == null) ? 0 : rcNiveauException
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;}
		if (obj == null){
			return false;}
		if (getClass() != obj.getClass()){
			return false;}
		ExceptionsTaxesKey other = (ExceptionsTaxesKey) obj;
		if (rcCodeException == null) {
			if (other.rcCodeException != null){
				return false;}
		} else if (!rcCodeException.equals(other.rcCodeException)){
			return false;}
		if (rcCodeTaxe == null) {
			if (other.rcCodeTaxe != null){
				return false;}
		} else if (!rcCodeTaxe.equals(other.rcCodeTaxe)){
			return false;}
		if (rcDateValeur == null) {
			if (other.rcDateValeur != null){
				return false;}
		} else if (!rcDateValeur.equals(other.rcDateValeur)){
			return false;}
		if (rcNiveauException == null) {
			if (other.rcNiveauException != null){
				return false;}
		} else if (!rcNiveauException.equals(other.rcNiveauException)){
			return false;}
		return true;
	}

	
	
	
}
