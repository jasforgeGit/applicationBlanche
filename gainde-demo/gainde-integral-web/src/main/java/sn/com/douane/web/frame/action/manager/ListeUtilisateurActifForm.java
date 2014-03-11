package sn.com.douane.web.frame.action.manager;

import java.io.Serializable;
import java.util.List;

public class ListeUtilisateurActifForm implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7627984482505087028L;

	private String abonne;
	
	private String adresseIp;
	
	private List listeUser;

	private String pk ;

	
	
	public String getPk() {
		return abonne;
	}

	public void setPk(String pk) {
		this.pk = pk;
	}

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

	public List getListeUser() {
		return listeUser;
	}

	public void setListeUser(List listeUser) {
		this.listeUser = listeUser;
	}

	

}
