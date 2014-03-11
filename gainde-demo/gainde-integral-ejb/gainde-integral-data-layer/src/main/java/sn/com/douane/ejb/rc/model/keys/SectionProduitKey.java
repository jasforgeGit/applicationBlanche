package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class SectionProduitKey implements Serializable{

	private static final long serialVersionUID = -5042036037874431053L;

	@Column(name="RCCODESECTION", length=2, nullable=false)
	private String rcCodeSection;
	
	@Column(name="RCCODEROMAINSECTION", length=5, nullable=false)
    private String rcCodeRomainSection;
	
	
	public SectionProduitKey() {

	}

	public SectionProduitKey(String rcCodeSection, String rcCodeRomainSection) {
		super();
		this.rcCodeSection = rcCodeSection;
		this.rcCodeRomainSection = rcCodeRomainSection;
	}


	public String getRcCodeSection() {
		return rcCodeSection;
	}

	public void setRcCodeSection(String rcCodeSection) {
		this.rcCodeSection = rcCodeSection;
	}

	public String getRcCodeRomainSection() {
		return rcCodeRomainSection;
	}

	public void setRcCodeRomainSection(String rcCodeRomainSection) {
		this.rcCodeRomainSection = rcCodeRomainSection;
	}

	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof SectionProduitKey) {
			SectionProduitKey o = (SectionProduitKey) otherKey;
			return ((this.rcCodeSection.equals(o.rcCodeSection))
					&& (this.rcCodeRomainSection.equals(o.rcCodeRomainSection)));
		}
		return false;
	}
	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeSection.hashCode()+rcCodeRomainSection.hashCode());
	}
	
	
}
