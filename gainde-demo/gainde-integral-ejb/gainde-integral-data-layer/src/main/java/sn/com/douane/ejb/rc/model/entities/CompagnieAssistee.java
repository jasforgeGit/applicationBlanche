package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="COMPAGNIEASSISTEE")
public class CompagnieAssistee implements Serializable{

	private static final long serialVersionUID = -5288435942087764989L;

	@Id
	@Column(name="CODECIEASSISTEE", nullable=false)
	private Integer codeCieAssistee;
    
	@Column(name="NOMCIEASSISTEE", length=100, nullable=false)
	private String nomCieAssistee;
	
	@OneToMany(mappedBy = "compagnieAssistee",targetEntity = BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listbrouillonSegen;
	
	public CompagnieAssistee() {
		
	}
	
	public CompagnieAssistee(Integer codeCieAssistee) {
		super();
		this.codeCieAssistee = codeCieAssistee;
	}

	public CompagnieAssistee(Integer codeCieAssistee, String nomCieAssistee) {
		super();
		this.codeCieAssistee = codeCieAssistee;
		this.nomCieAssistee = nomCieAssistee;
	}

	public Integer getCodeCieAssistee() {
		return codeCieAssistee;
	}

	public void setCodeCieAssistee(Integer codeCieAssistee) {
		this.codeCieAssistee = codeCieAssistee;
	}

	public String getNomCieAssistee() {
		return nomCieAssistee;
	}

	public void setNomCieAssistee(String nomCieAssistee) {
		this.nomCieAssistee = nomCieAssistee;
	}

	public List<BrouillonSegenMan> getListbrouillonSegen() {
		return listbrouillonSegen;
	}

	public void setListbrouillonSegen(List<BrouillonSegenMan> listbrouillonSegen) {
		this.listbrouillonSegen = listbrouillonSegen;
	}
}
