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
@Table(name="TYPEREGIMEDOUANE")
public class TypeRegimeDouane implements Serializable {

	private static final long serialVersionUID = -8347302819000726499L;

	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;
	 
	@Column(name="RCLIBELLEREGIME", length=250)
	private String rcLibelleRegime;
	 
	@Column(name="RCIMPORTEXPORT", length=1)
	private String rcImportExport;
	
	@OneToMany(mappedBy = "typeRegRegdou", targetEntity = RegimeDouanier.class)
	private List<RegimeDouanier> regimeDouaniers;
	
	@OneToMany(mappedBy = "tRegDTRInterd", targetEntity = DispTRegimeInterdit.class)
	private List<DispTRegimeInterdit> dispTRegimInterdits;

	public TypeRegimeDouane() {
		
	}
	/**
	 * 
	 * @param rcTypeRegime
	 */
	public TypeRegimeDouane(String rcTypeRegime) {
		super();
		this.rcTypeRegime = rcTypeRegime;
	}
	
	public String getRcTypeRegime() {
		return rcTypeRegime;
	}

	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}

	public String getRcLibelleRegime() {
		return rcLibelleRegime;
	}

	public void setRcLibelleRegime(String rcLibelleRegime) {
		this.rcLibelleRegime = rcLibelleRegime;
	}

	public String getRcImportExport() {
		return rcImportExport;
	}

	public void setRcImportExport(String rcImportExport) {
		this.rcImportExport = rcImportExport;
	}

	public List<RegimeDouanier> getRegimeDouaniers() {
		return regimeDouaniers;
	}

	public void setRegimeDouaniers(List<RegimeDouanier> regimeDouaniers) {
		this.regimeDouaniers = regimeDouaniers;
	}
	public List<DispTRegimeInterdit> getDispTRegimInterdits() {
		return dispTRegimInterdits;
	}
	public void setDispTRegimInterdits(List<DispTRegimeInterdit> dispTRegimInterdits) {
		this.dispTRegimInterdits = dispTRegimInterdits;
	}
	 


}
