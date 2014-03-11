package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.DecSoumVisitKey;


/**
 * @author: issam
 * Bean implementation class for Enterprise Bean: DecSoumVisit
 */


@Entity(name = "Decsoumvisit")
@Table(name = "DECSOUMVISIT")
@IdClass(DecSoumVisitKey.class)
public class DecSoumVisit implements Serializable {

	private static final long serialVersionUID = -8120473355074329442L;
	@Id
	@Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private String decAnneeEnregDec;
	@Id
	@Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private String decBurEnregDec;
	@Id
	@Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;
	@Id
	@Column(name = "DECNUMARTDECL" , nullable = false)
	private Integer decNumArtDecl;
	@Column(name = "DECPPMDECLARANT" , length = 5 , nullable = false)
	private String decPpmDeclarant;
	@Column(name = "DECDATEENREGDEC" , nullable = false)
	private Date decDateEnregDec;
	@Column(name = "DECTYPEREGIME" , length = 1 , nullable = false)
	private String decTypeRegime;
	@Column(name = "DECCODEREGDOU" , length = 1 , nullable = false)
	private String decCodeRegDou;
	@Column(name = "DECCODEVERIFICATEUR" , length = 5 , nullable = false)
	private String decCodeVerificateur;
	@Column(name = "DECDATEBAE" , nullable = false)
	private Date decDateBae;
	@Column(name = "DECNOMDESTINATAIRE" , length = 255 , nullable = false)
	private String decNomDestinataire;
	@Column(name = "DECCODESOUMFACT" , length = 1)
	private String decCodeSoumFact;
	@Column(name = "DECSOUMORIGINE" , length = 1)
	private String decSoumOrigine;

	@ManyToOne(targetEntity = SegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECNUMARTDECL", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false) })
	private SegArtDec segArtDec;

	public DecSoumVisit() {
	}
	public DecSoumVisit(String decAnneeEnregDec , String decBurEnregDec , Integer decNumDeclaration , 
			Integer decNumArtDec , String decPpmDeclarant , Date decDateEnregDec , String decTypeRegime , 
			String decCodeRegDou , String decCodeVerificateur , Date decDateBae , String decNomDestinataire) {
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDecl = decNumArtDec;
		this.decPpmDeclarant = decPpmDeclarant;
		this.decDateEnregDec = decDateEnregDec;
		this.decTypeRegime = decTypeRegime;
		this.decCodeRegDou = decCodeRegDou;
		this.decCodeVerificateur = decCodeVerificateur;
		this.decDateBae = decDateBae;
		this.decNomDestinataire = decNomDestinataire;
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
	public Integer getDecNumArtDecl() {
		return decNumArtDecl;
	}
	public void setDecNumArtDecl(Integer decNumArtDec) {
		this.decNumArtDecl = decNumArtDec;
	}
	public String getDecPpmDeclarant() {
		return decPpmDeclarant;
	}
	public void setDecPpmDeclarant(String decPpmDeclarant) {
		this.decPpmDeclarant = decPpmDeclarant;
	}
	public Date getDecDateEnregDec() {
		return decDateEnregDec;
	}
	public void setDecDateEnregDec(Date decDateEnregDec) {
		this.decDateEnregDec = decDateEnregDec;
	}
	public String getDecTypeRegime() {
		return decTypeRegime;
	}
	public void setDecTypeRegime(String decTypeRegime) {
		this.decTypeRegime = decTypeRegime;
	}
	public String getDecCodeRegDou() {
		return decCodeRegDou;
	}
	public void setDecCodeRegDou(String decCodeRegDou) {
		this.decCodeRegDou = decCodeRegDou;
	}
	public String getDecCodeVerificateur() {
		return decCodeVerificateur;
	}
	public void setDecCodeVerificateur(String decCodeVerificateur) {
		this.decCodeVerificateur = decCodeVerificateur;
	}
	public Date getDecDateBae() {
		return decDateBae;
	}
	public void setDecDateBae(Date decDateBae) {
		this.decDateBae = decDateBae;
	}
	public String getDecNomDestinataire() {
		return decNomDestinataire;
	}
	public void setDecNomDestinataire(String decNomDestinataire) {
		this.decNomDestinataire = decNomDestinataire;
	}
	public String getDecCodeSoumFact() {
		return decCodeSoumFact;
	}
	public void setDecCodeSoumFact(String decCodeSoumFact) {
		this.decCodeSoumFact = decCodeSoumFact;
	}
	public String getDecSoumOrigine() {
		return decSoumOrigine;
	}
	public void setDecSoumOrigine(String decSoumOrigine) {
		this.decSoumOrigine = decSoumOrigine;
	}
	
	public SegArtDec getSegArtDec() {
		return segArtDec;
	}
	public void setSegArtDec(SegArtDec segArtDec) {
		this.segArtDec = segArtDec;
	}
}