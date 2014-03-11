package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.Table;
import javax.persistence.ManyToOne;

import sn.com.douane.ejb.declaration.model.keys.DdeAnnulDeclKey;
import java.sql.Date;
import java.sql.Timestamp;


/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: DdeAnnulDecl
 */


@Entity
@Table(name = "DDEANNULDECL")
@IdClass(DdeAnnulDeclKey.class)

public class DdeAnnulDecl implements Serializable {

	private static final long serialVersionUID = 5445938091849052936L;

	@Id
	@Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private String decAnneeEnregDec;
	
	@Id
	@Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private String decBurEnregDec;
	
	@Id
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;
	
	@Column(name = "DECDATEDEMANDE" , nullable = false)
	private Timestamp decDateDemande;
	
	@Column(name = "DECDATEDECLARATION" , nullable = false)
	private Date decDateDeclaration;
	
	@Column(name = "DECPPMDECLARANT" , length = 5)
	private String decPpmDeclarant;
	
	@Column(name = "DECDATEVALIDATION")
	private Timestamp decDateValidation;
	
	@Column(name = "DECMOTIFANNULATION" , length = 255)
	private String decMotifAnnulation;
	
	@Column(name = "DECCODEAGENT" , length = 5)
	private String decCodeAgent;

	@ManyToOne(targetEntity = SegGenDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false) })
	private SegGenDec segGenDec;

	public DdeAnnulDecl(String decAnneeEnregDec , 
			String decBurEnregDec , 
			Integer decNumDeclaration , 
			Timestamp decDateDemande , 
			Date decDateDeclaration ) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decDateDemande = decDateDemande;
		this.decDateDeclaration = decDateDeclaration;  
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Timestamp getDecDateDemande() {
		return decDateDemande;
	}

	public void setDecDateDemande(Timestamp decDateDemande) {
		this.decDateDemande = decDateDemande;
	}

	public Date getDecDateDeclaration() {
		return decDateDeclaration;
	}

	public void setDecDateDeclaration(Date decDateDeclaration) {
		this.decDateDeclaration = decDateDeclaration;
	}

	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}

	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}

	public Timestamp getDecDateValidation() {
		return decDateValidation;
	}

	public void setDecDateValidation(Timestamp decDateValidation) {
		this.decDateValidation = decDateValidation;
	}

	public String getDecMotifAnnulation() {
		return decMotifAnnulation;
	}

	public void setDecMotifAnnulation(String decMotifAnnulation) {
		this.decMotifAnnulation = decMotifAnnulation;
	}

	public String getDecCodeAgent() {
		return decCodeAgent;
	}

	public void setDecCodeAgent(String decCodeAgent) {
		this.decCodeAgent = decCodeAgent;
	}

	public DdeAnnulDecl() {
	}


	public SegGenDec getSegGenDec() {
		return segGenDec;
	}

	public void setSegGenDec(SegGenDec segGenDec) {
		this.segGenDec = segGenDec;
	}
}