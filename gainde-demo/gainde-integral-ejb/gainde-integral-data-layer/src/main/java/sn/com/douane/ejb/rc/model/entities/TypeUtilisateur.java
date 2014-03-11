package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="TYPEUTILISATEUR")
public class TypeUtilisateur implements Serializable{

	private static final long serialVersionUID = 7095979199747586041L;

	@Id
	@Column(name="RCTYPEUSER", length=1, nullable=false)
	private String rcTypeUser;
	
	@Column(name="RCLIBELLEUSER", length=255, nullable=false)
    private String rcLibelleUser;
	
	@OneToMany(mappedBy = "typeUser", targetEntity = Utilisateur.class)
    private List<Utilisateur> utilisateurs;
   
   /**
    * 0-args constructeur
    */
	public TypeUtilisateur() {
    }
    
    /**
     * 2-args constructeurs
     * @param rcTypeUser
     * @param rcLibelleUser
     */
    public TypeUtilisateur(
            String rcTypeUser,
            String rcLibelleUser) {
    	super(); 
		this.rcTypeUser= rcTypeUser;
		this.rcLibelleUser = rcLibelleUser;
	}

    /**
	 * Get accessor for persistent attribute: rcTypeUser
     * @return rcTypeUser
     */
    public String getRcTypeUser() {
        return rcTypeUser;
    }

    /**
	 * Set accessor for persistent attribute: rctypeuser
     * @param rcTypeUser
     */
	public void setRcTypeUser(String rcTypeUser) {
        this.rcTypeUser = rcTypeUser;
    }

    /**
	 * Get accessor for persistent attribute: rcLibelleUser
	 * @return rcLibelleUser
	 */
    public String getRcLibelleUser() {
        return rcLibelleUser;
    }

    /**
	 * Set accessor for persistent attribute: rcLibelleUser
     * @param rcLibelleUser
     */
	public void setRcLibelleUser(String rcLibelleUser) {
        this.rcLibelleUser = rcLibelleUser;
    }
	
	/**
	 * This method was generated for supporting the relationship role named utilisateur.
	 * @return utilisateurs
	 */
	
    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    /**
	 * This method was generated for supporting the relationship role named utilisateur.
     * @param utilisateurs
     */
	public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }

}
