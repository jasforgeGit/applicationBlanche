package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="MODEDECLVALEUR")
public class ModeDeclValeur implements Serializable{

	private static final long serialVersionUID = -2507760741782273423L;

	@Id
	@Column(name="RCCODEMODEDEC", length=4, nullable=false )
	private String rcCodeModeDec;
	
	@Column(name="RCVALEURINITIALE", columnDefinition="DECIMAL(19,2)")
	private BigDecimal rcValeurInitiale;
    
	@Column(name="RCVALEURFINALE", columnDefinition="DECIMAL(19,2)")
	private BigDecimal rcValeurFinale;

	@ManyToOne(targetEntity = ModeDeclaration.class)
	@JoinColumn(name="rcCodeModeDec",  insertable=false, updatable=false)
    private ModeDeclaration modeDeclValeur;

	/**
	 * 
	 */
	public ModeDeclValeur() {
		
	}
	
	public ModeDeclValeur(String rcCodeModeDec) {
		super();
		this.rcCodeModeDec = rcCodeModeDec;
	}

	/**
	 * 
	 * @return
	 */
	public String getRcCodeModeDec() {
		return rcCodeModeDec;
	}

	/**
	 * 
	 * @param rcCodeModeDec
	 */
	public void setRcCodeModeDec(String rcCodeModeDec) {
		this.rcCodeModeDec = rcCodeModeDec;
	}
    /**
     * 
     * @return
     */
	public BigDecimal getRcValeurInitiale() {
		return rcValeurInitiale;
	}

	/**
	 * 
	 * @param rcValeurInitiale
	 */
	public void setRcValeurInitiale(BigDecimal rcValeurInitiale) {
		this.rcValeurInitiale = rcValeurInitiale;
	}

	/**
	 * 
	 * @return
	 */
	public BigDecimal getRcValeurFinale() {
		return rcValeurFinale;
	}

	/**
	 * 
	 * @param rcValeurFinale
	 */
	public void setRcValeurFinale(BigDecimal rcValeurFinale) {
		this.rcValeurFinale = rcValeurFinale;
	}

	/**
	 * 
	 * @return
	 */
	public ModeDeclaration getModeDeclValeur() {
		return modeDeclValeur;
	}

	/**
	 * 
	 * @param modeDeclValeur
	 */
	public void setModeDeclValeur(ModeDeclaration modeDeclValeur) {
		this.modeDeclValeur = modeDeclValeur;
	}
    
}
