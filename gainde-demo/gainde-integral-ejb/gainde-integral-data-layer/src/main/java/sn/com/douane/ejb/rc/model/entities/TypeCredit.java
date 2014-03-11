package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany; 

/**
 * 
 * @author nesrine 
 *
 */
@Entity
@Table(name="TYPECREDIT")
public class TypeCredit implements Serializable{
	
	private static final long serialVersionUID = 5773171878479274319L;

	@Id
	@Column(name="RCCODETYPECREDIT", length=1, nullable=false)
	private String rcCodeTypeCredit;
	 
	@Column(name="RCLIBELLETYPECREDIT", length=100, nullable=false)
	private String rcLibelleTypeCredit;
	 
	@OneToMany(mappedBy = "rcTypeCreditaire", targetEntity = Creditaire.class)
	private List<Creditaire> creditaires;
	
	 /**
	  * 0-args constructeurs
	  */
	 public TypeCredit (){		 
	 }
	 
	 /**
	  * 2-args constructeurs
	  * @param codeTypeCredit
	  * @param libelleTypeCredit
	  */
	 public TypeCredit(String codeTypeCredit,
	            String libelleTypeCredit) {
		 super(); 
		 this.rcCodeTypeCredit = codeTypeCredit;
		 this.rcLibelleTypeCredit = libelleTypeCredit;
	}

	 /**
	  * Get accessor for persistent attribute: codeTypeCredit
	  * @return
	  */
	public String getRcCodeTypeCredit() {
		return rcCodeTypeCredit;
	}

	/**
	 * Set accessor for persistent attribute: codeTypeCredit
	 * @param codeTypeCredit
	 */
	public void setRcCodeTypeCredit(String rcCodeTypeCredit) {
		this.rcCodeTypeCredit = rcCodeTypeCredit;
	}

	/**
	 * Get accessor for persistent attribute: codeLibelleCredit
	 * @return
	 */
	public String getRcLibelleTypeCredit() {
		return rcLibelleTypeCredit;
	}

	/**
	 * Set accessor for persistent attribute: libelleTypeCredit
	 * @param libelleTypeCredit
	 */
	public void setRcLibelleTypeCredit(String rcLibelleTypeCredit) {
		this.rcLibelleTypeCredit = rcLibelleTypeCredit;
	}

	/**
	 * Get accessor for persistent attribute creditaires
	 * @return creditaires
	 */
	public List<Creditaire> getCreditaires() {
		return creditaires;
	}

	/**
	 * Set accessor for persistent attribute : creditaires
	 * @param creditaires
	 */
	public void setCreditaires(List<Creditaire> creditaires) {
		this.creditaires = creditaires;
	}
}
