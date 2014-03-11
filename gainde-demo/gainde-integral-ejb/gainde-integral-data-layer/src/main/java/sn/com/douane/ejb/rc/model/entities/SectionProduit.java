package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.SectionProduitKey;

@Entity
@IdClass(SectionProduitKey.class)
@Table(name="SECTIONPRODUIT")
public class SectionProduit implements Serializable{
	
	private static final long serialVersionUID = 3876553173852863007L;

	@Id
	@Column(name="RCCODESECTION", length=2, nullable=false)
	private String rcCodeSection;
	
	@Id
	@Column(name="RCCODEROMAINSECTION", length=5, nullable=false)
    private String rcCodeRomainSection;
    
	@Column(name="RCLIBELLESECTION", length=255, nullable=false)
    private String rcLibelleSection;

	public SectionProduit() {
		
	}

	public SectionProduit(String rcCodeSection, String rcCodeRomainSection,
			String rcLibelleSection) {
		super();
		this.rcCodeSection = rcCodeSection;
		this.rcCodeRomainSection = rcCodeRomainSection;
		this.rcLibelleSection = rcLibelleSection;
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

	public String getRcLibelleSection() {
		return rcLibelleSection;
	}

	public void setRcLibelleSection(String rcLibelleSection) {
		this.rcLibelleSection = rcLibelleSection;
	}

}
