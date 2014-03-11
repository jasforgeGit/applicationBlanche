package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;

import sn.com.douane.ejb.rc.model.keys.NumerotationKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="NUMEROTATION")
@IdClass(NumerotationKey.class)
public class Numerotation implements Serializable{

	private static final long serialVersionUID = -3260985637117437802L;

	@Id
	@Column(name="RCCODEFONCTION", length=15, nullable=false)
	private String rcCodeFonction;
	
	@Id
	@Column(name="RCOPERATION", length=20, nullable=false)
	private String rcOperation;
	
	@Column(name="VALEURINDICE", columnDefinition="DECIMAL(10,0)", nullable=false)
    private BigDecimal valeurIndice;
	
	@Column(name="RCANNEE", length=4)
    private String rcAnnee; 
	
	@ManyToOne(targetEntity = Fonctionnalite.class)
	@JoinColumn(name="RCCODEFONCTION",insertable=false, updatable=false)
	private Fonctionnalite numeroFonctions;
	

	/**
	 * 0-args constructors
	 */
    public Numerotation() {
    }
    
    /**
     * 3-args constructors 
     * @param rcCodeFonction
     * @param rcOperation
     * @param valeurIndice
     */
	public Numerotation(String rcCodeFonction, String rcOperation,
			BigDecimal valeurIndice) {
		super();
		this.rcCodeFonction = rcCodeFonction;
		this.rcOperation = rcOperation;
		this.valeurIndice = valeurIndice;
	}
	
	/**
	 * Get accessor for persistent attribute: rcCodeFonction
	 * @return rcCodeFonction
	 */
	public String getRcCodeFonction() {
		return rcCodeFonction;
	}

	/**
	 * Set accessor for persistent attribute: rcCodeFonction
	 * @param rcCodeFonction
	 */
	public void setRcCodeFonction(String rcCodeFonction) {
		this.rcCodeFonction = rcCodeFonction;
	}

	/**
	 * Get accessor for persistent attribute: rcOperation
	 * @return
	 */
    public String getRcOperation() {
        return rcOperation;
    }

    /**
	 * Set accessor for persistent attribute: rcOperation
     * @param rcOperation
     */
	public void setrRcOperation(String rcOperation) {
        this.rcOperation = rcOperation;
    }

    /**
	 * Get accessor for persistent attribute: valeurIndice
	 * @return
	 */
    public BigDecimal getValeurIndice() {
        return valeurIndice;
    }

    /**
	 * Set accessor for persistent attribute: valeurindice
     * @param valeurIndice
     */
	public void setValeurIndice(BigDecimal valeurIndice) {
        this.valeurIndice = valeurIndice;
    }
	
	/**
	 * Get accessor for persistent attribute: rcannee
	 * @return rcAnnee
	 */
    public String getRcAnnee() {
        return rcAnnee;
    }

    /**
	 * Set accessor for persistent attribute: rcannee
     * @param rcAnnee
     */
	public void setRcannee(String rcAnnee) {
        this.rcAnnee = rcAnnee;
    }

    /**
	 * This method was generated for supporting the relationship role named numeroFonctions
	 */
    public Fonctionnalite getNumeroFonctions() {
        return numeroFonctions;
    }

    /**
	 * This method was generated for supporting the relationship role named numeroFonctions
	 */
	public void setNumeroFonctions(Fonctionnalite numeroFonctions) {
        this.numeroFonctions = numeroFonctions;
    }


}
