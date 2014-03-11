package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "REGROUPEMENT")
public class Regroupement implements Serializable{

	private static final long serialVersionUID = 9180524379497783379L;

		@Id
		@Column(name = "RCCODEREGROUP",length = 10,nullable = false)
	 	private String rcCodeRegroup;

		@Column(name = "RCLIBELLEREGROUP",length = 100,nullable = false)
	    private String rcLibelleRegroup;
		
		

		@OneToMany(mappedBy = "regroupement", targetEntity = RegroupPays.class)	    
	    private List<RegroupPays> regroupPays = new ArrayList<RegroupPays>();

		@OneToMany(mappedBy = "regroupement", targetEntity = TaxesRegroup.class)	   
	    private List<TaxesRegroup> taxesRegroup;

		@OneToMany(mappedBy = "regroupement", targetEntity = AgrementEntreprise.class)	   
	    private List<AgrementEntreprise> agrementEntreprises;
		
		public Regroupement(){
			
		}
		
		public Regroupement(String rcCodeRegroup) {
				super();
				this.rcCodeRegroup=rcCodeRegroup;
			
		}
	
		public Regroupement(String rcCodeRegroup, String rcLibelleRegroup) {
			super();
			this.rcCodeRegroup=rcCodeRegroup;
			this.rcLibelleRegroup=rcLibelleRegroup;
		}

		public String getRcCodeRegroup() {
			return rcCodeRegroup;
		}

		public void setRcCodeRegroup(String rcCodeRegroup) {
			this.rcCodeRegroup = rcCodeRegroup;
		}

		public String getRcLibelleRegroup() {
			return rcLibelleRegroup;
		}

		public void setRcLibelleRegroup(String rcLibelleRegroup) {
			this.rcLibelleRegroup = rcLibelleRegroup;
		}

		public List<TaxesRegroup> getTaxesRegroup() {
			return taxesRegroup;
		}

		public void setTaxesRegroup(List<TaxesRegroup> taxesRegroup) {
			this.taxesRegroup = taxesRegroup;
		}
		
		public List<RegroupPays> getRegroupPays() {
			return regroupPays;
		}

		public void setRegroupPays(List<RegroupPays> regroupPays) {
			this.regroupPays = regroupPays;
		}

		public List<AgrementEntreprise> getAgrementEntreprises() {
			return agrementEntreprises;
		}

		public void setAgrementEntreprises(List<AgrementEntreprise> agrementEntreprises) {
			this.agrementEntreprises = agrementEntreprises;
		}

		

}