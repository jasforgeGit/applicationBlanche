package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.ExclusionPpmKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Ppm;

@Entity
@Table(name = "EXCLUSIONPPM")
@IdClass(ExclusionPpmKey.class)
public class ExclusionPpm implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6290859294998330998L;

	@Id
	@Column(name = "CODEBUREAU" , length = 3 , nullable = false)
	private String codeBureau;

	@Id
	@Column(name = "CODEPPM" , length = 5 , nullable = false)
	private String codePpm;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumns({
		@JoinColumn(name = "CODEBUREAU", referencedColumnName = "RCCODEBURDOUANE", insertable = false, updatable = false, nullable = false)})
	private BureauDouane bureauDaoune;
	
	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumns({
		@JoinColumn(name = "CODEPPM", referencedColumnName = "RCCODEPPM", insertable = false, updatable = false, nullable = false)})
	private Ppm ppm;

	public ExclusionPpm(String codeBureau, String codePpm) {
		super();
		this.codeBureau = codeBureau;
		this.codePpm = codePpm;
	}

	public ExclusionPpm() {
		super();
	}

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodePpm() {
		return codePpm;
	}

	public void setCodePpm(String codePpm) {
		this.codePpm = codePpm;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codeBureau == null) ? 0 : codeBureau.hashCode());
		result = prime * result + ((codePpm == null) ? 0 : codePpm.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ExclusionPpm other = (ExclusionPpm) obj;
		if (codeBureau == null) {
			if (other.codeBureau != null){
				return false;
			}
		} else if (!codeBureau.equals(other.codeBureau)){
			return false;
		}
		if (codePpm == null) {
			if (other.codePpm != null){
				return false;
			}
		} else if (!codePpm.equals(other.codePpm)){
			return false;
		}
		return true;
	}

	public BureauDouane getBureauDaoune() {
		return bureauDaoune;
	}

	public void setBureauDaoune(BureauDouane bureauDaoune) {
		this.bureauDaoune = bureauDaoune;
	}

	public Ppm getPpm() {
		return ppm;
	}

	public void setPpm(Ppm ppm) {
		this.ppm = ppm;
	}
	
	
	
	

}
