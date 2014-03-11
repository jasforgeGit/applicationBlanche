package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;


@Entity
@Table(name = "TYPEVOIE")
public class TypeVoie implements Serializable {
	
	private static final long serialVersionUID = -1163175763505719700L;
	
	@Id
	@Column(name = "CODETYPEVOIE", length = 5, nullable = false)
	private String codetypevoie;
	
	@Column(name = "LIBELLETYPEVOIE", length = 50, nullable = false)
    private String libelletypevoie;
	
	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;
   
    public TypeVoie() {
    }
    
	public TypeVoie(String codetypevoie) {
		super();
		this.codetypevoie=codetypevoie;
	}

	public TypeVoie(String codetypevoie, String libelletypevoie) {
		super();
		this.codetypevoie=codetypevoie;
		this.libelletypevoie=libelletypevoie;
	}

    /**
	 * Get accessor for persistent attribute: codetypevoie
	 */

    public java.lang.String getCodetypevoie() {
        return codetypevoie;
    }

    /**
	 * Set accessor for persistent attribute: codetypevoie
	 */
	public void setCodetypevoie(java.lang.String codetypevoie) {
        this.codetypevoie = codetypevoie;
    }

    /**
	 * Get accessor for persistent attribute: libelletypevoie
	 */
	
    public java.lang.String getLibelletypevoie() {
        return libelletypevoie;
    }

    /**
	 * Set accessor for persistent attribute: libelletypevoie
	 */
	public void setLibelletypevoie(java.lang.String libelletypevoie) {
        this.libelletypevoie = libelletypevoie;
    }

   

   
}
