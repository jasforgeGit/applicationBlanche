package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.HistoProduitKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(HistoProduitKey.class)
@Table(name="HISTOPRODUITS")
public class HistoProduit implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="RCDATEMAJ", nullable=false)
	private Timestamp rcDateMaj;
	
	@Id
	@Column(name="RCCODEPROD", length=6, nullable=false)
	private String rcCodeProd; 
	
	@Id
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
	private String rcPrecUemoa;
	 
	@Id
	@Column(name="RCPRECSENEGAL", length=2, nullable=false)
	private String rcPrecSenegal;
	 
	@Id
	@Column(name="RCCODEUSERMAJ", length=8, nullable=false)
	private String rcCodeUserMaj;
	
	@Id
	@Column(name="RCTERMINALMAJ", length=70, nullable=false)
	private String rcTerminalMaj;	 
	 
	@Column(name="RCLIBELLETARIF", length=255)
	private String rcLibelleTarif;
	 
	@Column(name="RCCOMMPROD", length=255)
	private String rcCommProd;
	 
	@Column(name="RCINDPRODPETROLIER", length=1)
	private String rcIndProdPetrolier;
	 
	@Column(name="RCCODEPRODCRU", length=1)
	private String rcCodeProdCru;
	 
	@Column(name="RCCODEPRODARTISANAL", length=1)
	private String rcCodeProdArtisanal;
	 
	@Column(name="RCUNITECOMP", length=2)
	private String rcUniteComp;
	 
	@Column(name="RCSECTACTPROD", length=2)
	private String rcSectActProd;
	 
	@Column(name="RCCODETRANSIT", length=1)
	private String rcCodeTransit;
	 
	@Column(name="RCCODEBIENEQUIP", length=1)
	private String rcCodeBienEquip;
	 
	@Column(name="RCVALEQUIPPROD")
	private Integer rcValEquipProd;
	 
	@Column(name="RCCODEENTREPOT", length=1)
	private String rcCodeEntrepot;
	 
	@Column(name="RCCODEPRODSOCIAL", length=1)
	private String rcCodeProdSocial;
	 
	@Column(name="RCVALSPECPROD")
	private Double rcValSpecProd;
	 
	@Column(name="RCVALCHAPITRE", length=2)
	private String rcValChapitre;
	 
	@Column(name="RCCODECLASSE")
	private Integer rcCodeClass; 
	
	@Column(name="RCCODEPERISSABLE", length=1)
	private String rcCodePerissable;
	 
	@Column(name="RCCODEPOSITION", length=4)
	private String rcCodePosition;
	
	@ManyToOne(targetEntity = Classe.class)
	@JoinColumn(name="RCCODECLASSE", insertable=false, updatable=false)
	private Classe hclassProduit;
	 
	@ManyToOne(targetEntity = PositionProduit.class)
	@JoinColumn(name="RCCODEPOSITION", insertable=false, updatable=false)
	private PositionProduit posPhProduit;

	public HistoProduit() {
		
	}

	public HistoProduit(Timestamp rcDateMaj, String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeUserMaj, String rcTerminalMaj) {
		super();
		this.rcDateMaj = rcDateMaj;
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeUserMaj = rcCodeUserMaj;
		this.rcTerminalMaj = rcTerminalMaj;
	}

	public Timestamp getRcDateMaj() {
		return rcDateMaj;
	}

	public void setRcDateMaj(Timestamp rcDateMaj) {
		this.rcDateMaj = rcDateMaj;
	}

	public String getRcPrecUemoa() {
		return rcPrecUemoa;
	}

	public void setRcPrecUemoa(String rcPrecUemoa) {
		this.rcPrecUemoa = rcPrecUemoa;
	}

	public String getRcPrecSenegal() {
		return rcPrecSenegal;
	}

	public void setRcPrecSenegal(String rcPrecSenegal) {
		this.rcPrecSenegal = rcPrecSenegal;
	}

	public String getRcCodeUserMaj() {
		return rcCodeUserMaj;
	}

	public void setRcCodeUserMaj(String rcCodeUserMaj) {
		this.rcCodeUserMaj = rcCodeUserMaj;
	}

	public String getRcTerminalMaj() {
		return rcTerminalMaj;
	}

	public void setRcTerminalMaj(String rcTerminalMaj) {
		this.rcTerminalMaj = rcTerminalMaj;
	}

	public String getRcLibelleTarif() {
		return rcLibelleTarif;
	}

	public void setRcLibelleTarif(String rcLibelleTarif) {
		this.rcLibelleTarif = rcLibelleTarif;
	}

	public String getRcCommProd() {
		return rcCommProd;
	}

	public void setRcCommProd(String rcCommProd) {
		this.rcCommProd = rcCommProd;
	}

	public String getRcIndProdPetrolier() {
		return rcIndProdPetrolier;
	}

	public void setRcIndProdPetrolier(String rcIndProdPetrolier) {
		this.rcIndProdPetrolier = rcIndProdPetrolier;
	}

	public String getRcCodeProdCru() {
		return rcCodeProdCru;
	}

	public void setRcCodeProdCru(String rcCodeProdCru) {
		this.rcCodeProdCru = rcCodeProdCru;
	}

	public String getRcCodeProdArtisanal() {
		return rcCodeProdArtisanal;
	}

	public void setRcCodeProdArtisanal(String rcCodeProdArtisanal) {
		this.rcCodeProdArtisanal = rcCodeProdArtisanal;
	}

	public String getRcUniteComp() {
		return rcUniteComp;
	}

	public void setRcUniteComp(String rcUniteComp) {
		this.rcUniteComp = rcUniteComp;
	}

	public String getRcSectActProd() {
		return rcSectActProd;
	}

	public void setRcSectActProd(String rcSectActProd) {
		this.rcSectActProd = rcSectActProd;
	}

	public String getRcCodeTransit() {
		return rcCodeTransit;
	}

	public void setRcCodeTransit(String rcCodeTransit) {
		this.rcCodeTransit = rcCodeTransit;
	}

	public String getRcCodeBienEquip() {
		return rcCodeBienEquip;
	}

	public void setRcCodeBienEquip(String rcCodeBienEquip) {
		this.rcCodeBienEquip = rcCodeBienEquip;
	}

	public Integer getRcValEquipProd() {
		return rcValEquipProd;
	}

	public void setRcValEquipProd(Integer rcValEquipProd) {
		this.rcValEquipProd = rcValEquipProd;
	}

	public String getRcCodeEntrepot() {
		return rcCodeEntrepot;
	}

	public void setRcCodeEntrepot(String rcCodeEntrepot) {
		this.rcCodeEntrepot = rcCodeEntrepot;
	}

	public String getRcCodeProdSocial() {
		return rcCodeProdSocial;
	}

	public void setRcCodeProdSocial(String rcCodeProdSocial) {
		this.rcCodeProdSocial = rcCodeProdSocial;
	}

	public Double getRcValSpecProd() {
		return rcValSpecProd;
	}

	public void setRcValSpecProd(Double rcValSpecProd) {
		this.rcValSpecProd = rcValSpecProd;
	}

	public String getRcValChapitre() {
		return rcValChapitre;
	}

	public void setRcValChapitre(String rcValChapitre) {
		this.rcValChapitre = rcValChapitre;
	}

	public Integer getRcCodeClass() {
		return rcCodeClass;
	}

	public void setRcCodeClass(Integer rcCodeClass) {
		this.rcCodeClass = rcCodeClass;
	}

	public String getRcCodePerissable() {
		return rcCodePerissable;
	}

	public void setRcCodePerissable(String rcCodePerissable) {
		this.rcCodePerissable = rcCodePerissable;
	}

	public String getRcCodePosition() {
		return rcCodePosition;
	}

	public void setRcCodePosition(String rcCodePosition) {
		this.rcCodePosition = rcCodePosition;
	}

	public Classe getHclassProduit() {
		return hclassProduit;
	}

	public void setHclassProduit(Classe hclassProduit) {
		this.hclassProduit = hclassProduit;
	}

	public PositionProduit getPosPhProduit() {
		return posPhProduit;
	}

	public void setPosPhProduit(PositionProduit posPhProduit) {
		this.posPhProduit = posPhProduit;
	}

	/**
	 * @return the rcCodeProd
	 */
	public String getRcCodeProd() {
		return rcCodeProd;
	}

	/**
	 * @param rcCodeProd the rcCodeProd to set
	 */
	public void setRcCodeProd(String rcCodeProd) {
		this.rcCodeProd = rcCodeProd;
	}
	
	
	


}
