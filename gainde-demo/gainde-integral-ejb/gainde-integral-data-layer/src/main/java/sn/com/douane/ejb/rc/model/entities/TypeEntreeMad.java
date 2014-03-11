package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPEENTREEMAD")
public class TypeEntreeMad implements Serializable {

	private static final long serialVersionUID = 7541082634344343673L;

	@Id
	@Column(name="CODETYPEENTREE", length=1, nullable=false)
	private String codeTypeEntree;
	
	@Column(name="LIBELLETYPEENTREE", length=100, nullable=false)
    private String libelleTypeEntree;

	public TypeEntreeMad() {

	}

	public TypeEntreeMad(String codeTypeEntree, String libelleTypeEntree) {
		super();
		this.codeTypeEntree = codeTypeEntree;
		this.libelleTypeEntree = libelleTypeEntree;
	}

	/**
	 * @return the codeTypeEntree
	 */
	public String getCodeTypeEntree() {
		return codeTypeEntree;
	}

	/**
	 * @param codeTypeEntree the codeTypeEntree to set
	 */
	public void setCodeTypeEntree(String codeTypeEntree) {
		this.codeTypeEntree = codeTypeEntree;
	}

	/**
	 * @return the libelleTypeEntree
	 */
	public String getLibelleTypeEntree() {
		return libelleTypeEntree;
	}

	/**
	 * @param libelleTypeEntree the libelleTypeEntree to set
	 */
	public void setLibelleTypeEntree(String libelleTypeEntree) {
		this.libelleTypeEntree = libelleTypeEntree;
	}
    
    
}
