package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.AgrementEntrepriseKey;

@Entity
@IdClass(AgrementEntrepriseKey.class)
@Table(name="AGREMENTENTREPRISE")
public class AgrementEntreprise implements Serializable{

	private static final long serialVersionUID = -2870706797281671978L;
	
	@Id
	@Column(name="RCAGRENT", length=4, nullable=false)
	private String rcAgrent;   
	
	@Id
	@Column(name="RCRGRPAYS", length=10, nullable=false)   
	private String rcRgrPays; 
	
	@Id
	@Column(name="RCCODPAYS", length=3, nullable=false)  
	private String rcCodPays; 
	
	@Column(name="RCTITREENT", length=3)  
	private String rcTitreEnt;  
	
	@Column(name="RCRSOCIALECENT", length=30)  
	private String rcrSocialeCent; 
	
	@Column(name="RCADRESSEENT", length=60)   
	private String rcAdresseEnt;
	
	@Column(name="RCDATEAGREMENT")
	private Timestamp rcDateAgrement;
	
	@Column(name="RCDATCLOTURE")
	private Timestamp rcDatCloture; 
	
	@ManyToOne(targetEntity = Pays.class)
    @JoinColumn(name="RCCODPAYS",referencedColumnName = "RCCODEPAYS",insertable=false, updatable=false,nullable = false)
    private Pays pays;
	
	@ManyToOne(targetEntity = Regroupement.class)
	@JoinColumn(name="RCRGRPAYS",referencedColumnName = "RCCODEREGROUP",insertable=false, updatable=false)
    private Regroupement regroupement;
	
	
	public AgrementEntreprise() {
	}

	public String getRcAgrent() {
		return rcAgrent;
	}
	public AgrementEntreprise(String rcAgrent, String rcRgrPays, String rcCodPays, String rcTitreEnt,
			 String rcrSocialeCent, String rcAdresseEnt,
			Timestamp rcDateAgrement, Timestamp rcDatCloture){
		this.rcAgrent = rcAgrent;
		this.rcRgrPays = rcRgrPays;
		this.rcCodPays = rcCodPays;
		this.rcTitreEnt  = rcTitreEnt;
		this.rcrSocialeCent = rcrSocialeCent;
		this.rcAdresseEnt = rcAdresseEnt;
		this.rcDateAgrement  = rcDateAgrement;
		this.rcDatCloture = rcDatCloture;
	}
	
	public void setRcAgrent(String rcAgrent) {
		this.rcAgrent = rcAgrent;
	}

	public String getRcRgrPays() {
		return rcRgrPays;
	}

	public void setRcRgrPays(String rcRgrPays) {
		this.rcRgrPays = rcRgrPays;
	}

	public String getRcCodPays() {
		return rcCodPays;
	}

	public void setRcCodPays(String rcCodPays) {
		this.rcCodPays = rcCodPays;
	}

	public String getRcTitreEnt() {
		return rcTitreEnt;
	}

	public void setRcTitreEnt(String rcTitreEnt) {
		this.rcTitreEnt = rcTitreEnt;
	}

	public String getRcrSocialeCent() {
		return rcrSocialeCent;
	}

	public void setRcrSocialeCent(String rcrSocialeCent) {
		this.rcrSocialeCent = rcrSocialeCent;
	}

	public String getRcAdresseEnt() {
		return rcAdresseEnt;
	}

	public void setRcAdresseEnt(String rcAdresseEnt) {
		this.rcAdresseEnt = rcAdresseEnt;
	}

	public Timestamp getRcDateAgrement() {
		return rcDateAgrement;
	}

	public void setRcDateAgrement(Timestamp rcDateAgrement) {
		this.rcDateAgrement = rcDateAgrement;
	}

	public Timestamp getRcDatCloture() {
		return rcDatCloture;
	}

	public void setRcDatCloture(Timestamp rcDatCloture) {
		this.rcDatCloture = rcDatCloture;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

	public Regroupement getRegroupement() {
		return regroupement;
	}

	public void setRegroupement(Regroupement regroupement) {
		this.regroupement = regroupement;
	}
	
}
