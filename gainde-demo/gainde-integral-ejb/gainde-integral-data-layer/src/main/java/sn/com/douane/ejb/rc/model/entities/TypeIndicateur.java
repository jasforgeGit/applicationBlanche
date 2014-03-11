package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity()
@Table(name ="TYPEINDICATEUR")
public class TypeIndicateur implements Serializable{

	private static final long serialVersionUID = -4087548517595053314L;

	@Id
	@Column(name="RCCODETYPEINDICATEUR", length=10, nullable=false)
	private String rcCodeTypeIndicateur;
	
	@Column(name="RCLIBTYPEINDICATEUR", length=100, nullable=false)
	private String rcLibTypeIndicateur;
	
	@Column(name="RCNOMTABLEUTILISEE", length=25, nullable=false)
	private String rcNomTableUtilisee;
	
	public TypeIndicateur() {
		
	}

	public TypeIndicateur(String rcCodeTypeIndicateur,
			String rcLibTypeIndicateur, String rcNomTableUtilisee) {
		super();
		this.rcCodeTypeIndicateur = rcCodeTypeIndicateur;
		this.rcLibTypeIndicateur = rcLibTypeIndicateur;
		this.rcNomTableUtilisee = rcNomTableUtilisee;
	}

	/**
	 * Get accessor for persistent attribute: rccodetypeindicateur
	 */
	public java.lang.String getRcCodeTypeIndicateur() {
		return rcCodeTypeIndicateur;
	}

	/**
	 * Set accessor for persistent attribute: rccodetypeindicateur
	 */
	public void setrcCodeTypeIndicateur(String rcCodeTypeIndicateur) {
		this.rcCodeTypeIndicateur = rcCodeTypeIndicateur;
	}

	/**
	 * Get accessor for persistent attribute: rclibtypeindicateur
	 */
	@Basic
	public String getRclibtypeindicateur() {
		return rcLibTypeIndicateur;
	}

	/**
	 * Set accessor for persistent attribute: rclibtypeindicateur
	 */
	public void setRcLibTypeIndicateur(String rcLibTypeIndicateur) {
		this.rcLibTypeIndicateur = rcLibTypeIndicateur;
	}

	/**
	 * Get accessor for persistent attribute: rcnomtableutilisee
	 */
	public String getRcNomTableUtilisee() {
		return rcNomTableUtilisee;
	}

	/**
	 * Set accessor for persistent attribute: rcnomtableutilisee
	 */
	public void setrcNomTableUtilisee(String rcNomTableUtilisee) {
		this.rcNomTableUtilisee = rcNomTableUtilisee;
	}
}
