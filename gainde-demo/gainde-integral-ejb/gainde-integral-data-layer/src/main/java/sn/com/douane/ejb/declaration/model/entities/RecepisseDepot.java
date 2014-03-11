package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.OneToMany;

import sn.com.douane.ejb.declaration.model.keys.RecepisseDepotKey;

/**
 * @author issam
 * Bean implementation class for Enterprise Bean: RecepisseDepot
 */

@Entity
@Table(name = "RECEPISSEDEPOT")
@IdClass(RecepisseDepotKey.class)

public class RecepisseDepot implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8824162258950878828L;
	@Id
	@Column(name = "ANNEERECEPISSE" , columnDefinition="CHAR(4)", nullable = false)
	private String anneeRecepisse;	
	@Id
	@Column(name = "BUREAURECEPISSE" , length = 3 , nullable = false)
	private String bureauRecepisse;	
	@Id
	@Column(name = "NUMRECEPISSE" , nullable = false)
	private Integer numRecepisse;	
	@Column(name = "NOMVOYAGEUR" , length = 50 , nullable = false)
	private String nomVoyageur;
	@Column(name = "PRENOMVOYAGEUR" , length = 50 , nullable = false)
	private String prenomVoyageur;	
	@Column(name = "ADRESSEVOYAGEUR" , length = 100 , nullable = false)
	private String adresseVoyageur;	
	@Column(name = "TYPEPIECEIDENTVOYAGEUR" ,columnDefinition="CHAR(25)" , nullable = false)
	private String typePieceIdentVoyageur;	
	@Column(name = "NUMPIECEVOYAGEUR" , length = 25 , nullable = false)
	private String numPieceVoyageur;	
	@Column(name = "MODETRANSPORT" , length = 2 , nullable = false)
	private String modeTransport;	
	@Column(name = "MOYENTRANSPORT" , columnDefinition="CHAR(25)" , nullable = false)
	private String moyenTransport;
	@Column(name = "PROVENANCE" , length = 3 , nullable = false)
	private String provenance;	
	@Column(name = "NBREARTICLE" , nullable = false)
	private Integer nbreArticle;
	@Column(name = "CODEMAD" , nullable = false)
	private Integer codeMad;
	@Column(name = "MATRICULEAGENT" , length = 7 , nullable = false)
	private String matriculeAgent;
	@Column(name = "DATEDECLARATIONRECEPISSE" , nullable = false)
	private Date dateDeclarationRecepisse;
	@Column(name = "DATEDEPOT" , nullable = false)
	private Date dateDepot;

	@OneToMany(mappedBy = "recepisseDepot" , targetEntity = BulletinEcor.class)	
	private List<BulletinEcor> receBulletinEc = new ArrayList<BulletinEcor>();


	public RecepisseDepot(){

	}
	public RecepisseDepot(String anneeRecepisse , String bureauRecepisse , 	Integer numRecepisse , String nomVoyageur , 
			String prenomVoyageur , String adresseVoyageur , String typePieceIdentVoyageur , String numPieceVoyageur , 	
			String modeTransport , String moyenTransport , String provenance , Integer nbreArticle , Integer codeMad , 
			String matriculeAgent , Date dateDeclarationRecepisse , Date dateDepot) {
		this.anneeRecepisse = anneeRecepisse;	
		this.bureauRecepisse = 	bureauRecepisse;
		this.numRecepisse = numRecepisse;
		this.nomVoyageur = nomVoyageur;
		this.prenomVoyageur = prenomVoyageur;	
		this.adresseVoyageur = 	adresseVoyageur;
		this.typePieceIdentVoyageur = typePieceIdentVoyageur;	
		this.numPieceVoyageur = numPieceVoyageur;
		this.modeTransport = modeTransport;
		this.moyenTransport = moyenTransport;
		this.provenance = provenance;
		this.nbreArticle = nbreArticle;
		this.codeMad = codeMad;
		this.matriculeAgent = matriculeAgent;
		this.dateDeclarationRecepisse = dateDeclarationRecepisse;
		this.dateDepot = dateDepot;

	}
	public String getAnneeRecepisse() {
		return anneeRecepisse;
	}
	public void setAnneeRecepisse(String anneeRecepisse) {
		this.anneeRecepisse = anneeRecepisse;
	}
	public String getBureauRecepisse() {
		return bureauRecepisse;
	}
	public void setBureauRecepisse(String bureauRecepisse) {
		this.bureauRecepisse = bureauRecepisse;
	}
	public Integer getNumRecepisse() {
		return numRecepisse;
	}
	public void setNumRecepisse(Integer numRecepisse) {
		this.numRecepisse = numRecepisse;
	}
	public String getNomVoyageur() {
		return nomVoyageur;
	}
	public void setNomVoyageur(String nomVoyageur) {
		this.nomVoyageur = nomVoyageur;
	}
	public String getPrenomVoyageur() {
		return prenomVoyageur;
	}
	public void setPrenomVoyageur(String prenomVoyageur) {
		this.prenomVoyageur = prenomVoyageur;
	}
	public String getAdresseVoyageur() {
		return adresseVoyageur;
	}
	public void setAdresseVoyageur(String adresseVoyageur) {
		this.adresseVoyageur = adresseVoyageur;
	}
	public String getTypePieceIdentVoyageur() {
		return typePieceIdentVoyageur;
	}
	public void setTypePieceIdentVoyageur(String typePieceIdentVoyageur) {
		this.typePieceIdentVoyageur = typePieceIdentVoyageur;
	}
	public String getNumPieceVoyageur() {
		return numPieceVoyageur;
	}
	public void setNumPieceVoyageur(String numPieceVoyageur) {
		this.numPieceVoyageur = numPieceVoyageur;
	}
	public String getModeTransport() {
		return modeTransport;
	}
	public void setModeTransport(String modeTransport) {
		this.modeTransport = modeTransport;
	}
	public String getMoyenTransport() {
		return moyenTransport;
	}
	public void setMoyenTransport(String moyenTransport) {
		this.moyenTransport = moyenTransport;
	}
	public String getProvenance() {
		return provenance;
	}
	public void setProvenance(String provenance) {
		this.provenance = provenance;
	}
	public Integer getNbreArticle() {
		return nbreArticle;
	}
	public void setNbreArticle(Integer nbreArticle) {
		this.nbreArticle = nbreArticle;
	}
	public Integer getCodeMad() {
		return codeMad;
	}
	public void setCodeMad(Integer codeMad) {
		this.codeMad = codeMad;
	}
	public String getMatriculeAgent() {
		return matriculeAgent;
	}
	public void setMatriculeAgent(String matriculeAgent) {
		this.matriculeAgent = matriculeAgent;
	}
	public Date getDateDeclarationRecepisse() {
		return dateDeclarationRecepisse;
	}
	public void setDateDeclarationRecepisse(Date dateDeclarationRecepisse) {
		this.dateDeclarationRecepisse = dateDeclarationRecepisse;
	}
	public Date getDateDepot() {
		return dateDepot;
	}
	public void setDateDepot(Date dateDepot) {
		this.dateDepot = dateDepot;
	}
	public List<BulletinEcor> getReceBulletinEc() {
		return receBulletinEc;
	}
	public void setReceBulletinEc(List<BulletinEcor> receBulletinEc) {
		this.receBulletinEc = receBulletinEc;
	}
}
