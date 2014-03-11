package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;


public class TarifsKey implements Serializable{
	

	private static final long serialVersionUID = -1091787877957109024L;

	@Column(name = "RCCODEPROD",length = 6,nullable = false)
	private String rcCodeProd;
	
	@Column(name = "RCPRECUEMOA",length = 2,nullable = false)
	private String rcPrecueMoa;
	
	@Column(name = "RCPRECSENEGAL",length = 2,nullable = false)
	private String rcPrecSenegal;
	
	@Column(name = "RCCODETAXE",length = 2,nullable = false)
	private String rcCodeTaxe;
	
	@Column(name = "RCCODETAUX",length = 3,nullable = false)
    private String rcCodeTaux;
	
	@Column(name = "RCDATEVALEUR",nullable = false)
    private java.sql.Date rcDateValeur;	
	
	@Column(name = "RCCODECIMEX", columnDefinition="CHAR(1)", nullable = false)
    private String rcCodeCimex;

	public TarifsKey(){
		
	}	
	
	public TarifsKey(String rcCodeProd, String rcPrecueMoa,
			String rcPrecSenegal, String rcCodeTaxe, String rcCodeTaux,
			Date rcDateValeur, String rcCodeCimex) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecueMoa = rcPrecueMoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeTaxe = rcCodeTaxe;
		this.rcCodeTaux = rcCodeTaux;
		this.rcDateValeur = rcDateValeur;
		this.rcCodeCimex = rcCodeCimex;
	}

	public String getRcCodeProd() {
		return rcCodeProd;
	}

	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}

	public String getRcPrecueMoa() {
		return rcPrecueMoa;
	}

	public void setRcPrecueMoa(String rcPrecueMoa) {
		this.rcPrecueMoa = rcPrecueMoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeTaxe() {
		return rcCodeTaxe;
	}

	public void setRcCodeTaxe(String rcCodeTaxe) {
		this.rcCodeTaxe = rcCodeTaxe;
	}

	public String getRcCodeTaux() {
		return rcCodeTaux;
	}

	public void setRcCodeTaux(String rcCodeTaux) {
		this.rcCodeTaux = rcCodeTaux;
	}

	public java.sql.Date getRcDateValeur() {
		return rcDateValeur;
	}

	public void setRcDateValeur(java.sql.Date rcDateValeur) {
		this.rcDateValeur = rcDateValeur;
	}

	public String getRcCodeCimex() {
		return rcCodeCimex;
	}

	public void setRcCodeCimex(String rcCodeCimex) {
		this.rcCodeCimex = rcCodeCimex;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((rcCodeCimex == null) ? 0 : rcCodeCimex.hashCode());
		result = prime * result
				+ ((rcCodeProd == null) ? 0 : rcCodeProd.hashCode());
		result = prime * result
				+ ((rcCodeTaux == null) ? 0 : rcCodeTaux.hashCode());
		result = prime * result
				+ ((rcCodeTaxe == null) ? 0 : rcCodeTaxe.hashCode());
		result = prime * result
				+ ((rcDateValeur == null) ? 0 : rcDateValeur.hashCode());
		result = prime * result
				+ ((rcPrecSenegal == null) ? 0 : rcPrecSenegal.hashCode());
		result = prime * result
				+ ((rcPrecueMoa == null) ? 0 : rcPrecueMoa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		TarifsKey other = (TarifsKey) obj;
		if (rcCodeCimex == null) {
			if (other.rcCodeCimex != null){
				return false;
			}
		} else if (!rcCodeCimex.equals(other.rcCodeCimex)){
			return false;
		}
		if (rcCodeProd == null) {
			if (other.rcCodeProd != null){
				return false;
			}
		} else if (!rcCodeProd.equals(other.rcCodeProd)){
			return false;
		}
		if (rcCodeTaux == null) {
			if (other.rcCodeTaux != null){
				return false;
			}
		} else if (!rcCodeTaux.equals(other.rcCodeTaux)){
			return false;
		}
		if (rcCodeTaxe == null) {
			if (other.rcCodeTaxe != null){
				return false;
			}
		} else if (!rcCodeTaxe.equals(other.rcCodeTaxe)){
			return false;
		}
		if (rcDateValeur == null) {
			if (other.rcDateValeur != null){
				return false;
			}
		} else if (!rcDateValeur.equals(other.rcDateValeur)){
			return false;
		}
		if (rcPrecSenegal == null) {
			if (other.rcPrecSenegal != null){
				return false;
			}
		} else if (!rcPrecSenegal.equals(other.rcPrecSenegal)){
			return false;
		}
		if (rcPrecueMoa == null) {
			if (other.rcPrecueMoa != null){
				return false;
			}
		} else if (!rcPrecueMoa.equals(other.rcPrecueMoa)){
			return false;
		}
		return true;
	}
	
	
    
    
    
}
