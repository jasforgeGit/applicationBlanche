package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="DESIGNATIONPROD")
public class DesignationProd implements Serializable{

	private static final long serialVersionUID = -7805291053800089086L;

	@Id
	@Column(name="CODE", nullable=false)
	private Integer code;
	
    @Column(name="LIBELLE", length=255, nullable=false)
	private String libelle;
    
    @Column(name="CODEPROD", length=15)
    private String codeprod;

    public DesignationProd() {
    	
    }
    
	public DesignationProd(Integer code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getCodeprod() {
		return codeprod;
	}

	public void setCodeprod(String codeprod) {
		this.codeprod = codeprod;
	}
}
