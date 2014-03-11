package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CTRLUSER")
public class CtrlUser implements Serializable {

	private static final long serialVersionUID = 6742040975264943411L;
		
	@Id
	@Column(name = "ABONNE",length = 8,nullable = false)	
	private String abonne;
	
	@Column(name = "ADRESSEIP",length = 20,nullable = false)
	private String adresseIp;

	public String getAbonne() {
		return abonne;
	}

	public void setAbonne(String abonne) {
		this.abonne = abonne;
	}

	public String getAdresseIp() {
		return adresseIp;
	}

	public void setAdresseIp(String adresseIp) {
		this.adresseIp = adresseIp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((abonne == null) ? 0 : abonne.hashCode());
		result = prime * result
				+ ((adresseIp == null) ? 0 : adresseIp.hashCode());
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
		CtrlUser other = (CtrlUser) obj;
		if (abonne == null) {
			if (other.abonne != null){
				return false;
			}
		} else if (!abonne.equals(other.abonne)){
			return false;
		}
		if (adresseIp == null) {
			if (other.adresseIp != null){
				return false;
			}
		} else if (!adresseIp.equals(other.adresseIp)){
			return false;
		}
		return true;
	} 
	
	
	
	
}
