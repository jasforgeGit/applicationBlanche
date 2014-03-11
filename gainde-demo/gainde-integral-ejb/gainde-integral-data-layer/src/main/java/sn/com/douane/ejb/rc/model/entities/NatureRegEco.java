package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table(name = "NATUREREGECO")
	public class NatureRegEco implements Serializable {
	    /**
		 * 
		 */
		private static final long serialVersionUID = -4862432158845789392L;
		
		@Id
		@Column(name = "RCCODENATREGECO",length = 1,nullable = false)
		private String rcCodeNatRegEco;		

		@Column(name = "RCLIBNATREGECO",length = 100,nullable = false)
	    private String rcLibNatRegEco;
		
		@javax.persistence.OneToMany(mappedBy = "natRegEco", targetEntity = RegimeEconomique.class)
	    private List<RegimeEconomique> regimeeconomique = new ArrayList<RegimeEconomique>();	  
	  

		public NatureRegEco(){
	    	
	    }
	    
		public NatureRegEco(String rcCodeNatRegEco) {
			super();
			this.rcCodeNatRegEco=rcCodeNatRegEco;
		}


		public NatureRegEco(String rcCodeNatRegEco, String rcLibNatRegEco) {
			super();
			this.rcCodeNatRegEco=rcCodeNatRegEco;
			this.rcLibNatRegEco=rcLibNatRegEco;
			
		}
			
		public String getRcCodeNatRegEco() {
			return rcCodeNatRegEco;
		}

		public void setRcCodeNatRegEco(String rcCodeNatRegEco) {
			this.rcCodeNatRegEco = rcCodeNatRegEco;
		}

		public String getRcLibNatRegEco() {
			return rcLibNatRegEco;
		}

		public void setRcLibNatRegEco(String rcLibNatRegEco) {
			this.rcLibNatRegEco = rcLibNatRegEco;
		}
		
		  public List<RegimeEconomique> getRegimeeconomique() {
				return regimeeconomique;
			}

			public void setRegimeeconomique(List<RegimeEconomique> regimeeconomique) {
				this.regimeeconomique = regimeeconomique;
			}

	}
