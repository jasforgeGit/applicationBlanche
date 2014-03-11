package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.utils.ConvertUtil;


/**
 * The Class RcProduitsForm.
 * 
 * @author kerfahi ghazi
 */
public class RcProduitsForm implements Serializable {


	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The pk. */
	private String pk;	
	
	/** The etat. */
	private String etat;
	
	/* Attributs  */
	/** The num rc code prod ob. */
	private String numRcCodeProdOB;
	
	/** The num rc prec uemoa ob. */
	private String numRcPrecUemoaOB;
	
	/** The num rc prec senegal ob. */
	private String numRcPrecSenegalOB;
	
	/** The num rc libelle tarif. */
	private String numRcLibelleTarif;
	
	/** The num rc comm prod. */
	private String numRcCommProd;
	
	/** The num rc ind prod petrolier. */
	private String numRcIndProdPetrolier;
	
	/** The num rc code prod cru. */
	private String numRcCodeProdCru;
	
	/** The num rc code prod artisanal. */
	private String numRcCodeProdArtisanal;
	
	/** The num rc unite comp. */
	private String numRcUniteComp;
	
	/** The num rc sect act prod. */
	private String numRcSectActProd;
	
	/** The num rc code transit. */
	private String numRcCodeTransit;
	
	/** The num rc code bien equip. */
	private String numRcCodeBienEquip;
	
	/** The num rc val equip prod. */
	private String numRcValEquipProd;
	
	/** The num rc code entrepot. */
	private String numRcCodeEntrepot;
	
	/** The num rc code prod social. */
	private String numRcCodeProdSocial;
	
	/** The num rc val spec prod. */
	private String numRcValSpecProd;
	
	/** The num list rc val chapitre ob. */
	private String numListRcValChapitreOB;
	
	/** The num list rc code classe ob. */
	private String numListRcCodeClasseOB;
	
	/** The num rc code perissable. */
	private String numRcCodePerissable;

	private String numRcExonorePvi;
	
	//Champs du formualaire de recherche
	/** The num rc code prod rech. */
	private String numRcCodeProdRech;
	
	/** The num rc prec uemoa rech. */
	private String numRcPrecUemoaRech;
	
	/** The num rc prec senegal rech. */
	private String numRcPrecSenegalRech;
	
	/** The num list rc val chapitre rech. */
	private String numListRcValChapitreRech;
	
	/** The num list rc code classe rech. */
	private String numListRcCodeClasseRech;
	
	/** The liste rc produits. */
	List listeRcProduits = new ArrayList();
	
	/** The produit vo. */
	Produit produitVO = new Produit();
	
	/** variables du Grid. */
	private Integer rows ;
	
	/** The page. */
	private Integer page ;
	
	/** The sord. */
	private String  sord;
	
	/** The sidx. */
	private String  sidx;
	
	/** The total. */
	private Integer total;
	
	/** The records. */
	private Integer records;
	
	/** The index. */
	private String index;
	
	
	/* M�thodes getNewXXXXVO() */
	//importexport
	/**
	 * Gets the new rc produit vo.
	 *
	 * @return the new rc produit vo
	 */
	public Produit getNewRcProduitVO() {
		Produit produitVO = new Produit();
		
		if(getNumRcCodeProdOB()!=null&&!getNumRcCodeProdOB().equals("")) {
		produitVO.setRccodeprod(getNumRcCodeProdOB());
		}
		if(getNumRcPrecUemoaOB()!=null&&!getNumRcPrecUemoaOB().equals("")) {
		produitVO.setRcprecuemoa(getNumRcPrecUemoaOB());
		}
		if(getNumRcPrecSenegalOB()!=null&&!getNumRcPrecSenegalOB().equals("")) {
		produitVO.setRcprecsenegal(getNumRcPrecSenegalOB());
		}
		if(getNumRcLibelleTarif()!=null&&!getNumRcLibelleTarif().equals("")) {
		produitVO.setRclibelletarif(getNumRcLibelleTarif());
		}
		if(getNumRcCommProd()!=null&&!getNumRcCommProd().equals("")) {
		produitVO.setRccommprod(getNumRcCommProd());
		}
		if(getNumRcCodePerissable()!=null&&!getNumRcCodePerissable().equals("")) {
		produitVO.setRccodeperissable(getNumRcCodePerissable());
		}
		if(getNumRcIndProdPetrolier()!=null&&!getNumRcIndProdPetrolier().equals("")) {
		produitVO.setRcindprodpetrolier(getNumRcIndProdPetrolier());
		}
		if(getNumRcCodeProdCru()!=null&&!getNumRcCodeProdCru().equals("")) {
		produitVO.setRccodeprodcru(getNumRcCodeProdCru());
		}
		if(getNumRcCodeProdArtisanal()!=null&&!getNumRcCodeProdArtisanal().equals("")) {
		produitVO.setRccodeprodartisanal(getNumRcCodeProdArtisanal());
		}
		if(getNumRcUniteComp()!=null&&!getNumRcUniteComp().equals("")) {
		produitVO.setRcunitecomp(getNumRcUniteComp());
		}
		if(getNumRcSectActProd()!=null&&!getNumRcSectActProd().equals("")) {
		produitVO.setRcsectactprod(getNumRcSectActProd());
		}
		if(getNumRcCodeTransit()!=null&&!getNumRcCodeTransit().equals("")) {
		produitVO.setRccodetransit(getNumRcCodeTransit());
		}
		if(getNumRcCodeBienEquip()!=null&&!getNumRcCodeBienEquip().equals("")) {
		produitVO.setRccodebienequip(getNumRcCodeBienEquip());
		}
		if (getNumRcValEquipProd()!=null && !getNumRcValEquipProd().equals("")) {
			produitVO.setRcvalequipprod(new Integer(getNumRcValEquipProd()));
		}
		if (getNumRcCodeEntrepot()!=null && !getNumRcCodeEntrepot().equals("")) {
		produitVO.setRccodeentrepot(getNumRcCodeEntrepot());
		}
		if (getNumRcCodeProdSocial()!=null && !getNumRcCodeProdSocial().equals("")) {
		produitVO.setRccodeprodsocial(getNumRcCodeProdSocial());
	    }
		if (getNumRcValSpecProd()!=null && !getNumRcValSpecProd().equals("")) {
			produitVO.setRcvalspecprod(new Double(getNumRcValSpecProd()));
		}
		if (getNumListRcValChapitreOB()!=null && !getNumListRcValChapitreOB().equals("")) {
		produitVO.setRcvalchapitre(getNumListRcValChapitreOB());
		}
		if (getNumListRcCodeClasseOB()!=null && !getNumListRcCodeClasseOB().equals("")) {
		produitVO.setRccodeclasse(new Integer(getNumListRcCodeClasseOB()));
		}
		if (getNumRcExonorePvi()!=null && !getNumRcExonorePvi().equals("")) {
		produitVO.setRcexonorepvi(getNumRcExonorePvi());
		}
		return produitVO;

	}
	public void reset() {
		numRcCodeProdOB = "";
		numRcPrecUemoaOB = "";
		numRcPrecSenegalOB = "";
		numRcLibelleTarif = "";
		numRcCommProd = "";
		numRcIndProdPetrolier = "";
		numRcCodeProdCru = "";
		numRcCodeProdArtisanal = "";
		numRcUniteComp = "";
		numRcSectActProd = "";
		numRcCodeTransit = "";
		numRcCodeBienEquip = "";
		numRcValEquipProd = "";
		numRcCodeEntrepot = "";
		numRcCodeProdSocial = "";
		numRcValSpecProd = "";
		numListRcValChapitreOB = "";
		numListRcCodeClasseOB = "";
		numRcCodePerissable = "";
		numRcExonorePvi = "";
	}
	/* M�thode reset */
	/**
	 * Reset.
	 */
	public void resetChampsRecherche() {
		numRcCodeProdRech = "";
		numRcPrecUemoaRech = "";
		numRcPrecSenegalRech = "";
		numListRcValChapitreRech = "";
	    numListRcCodeClasseRech = "";
	}

	/* M�thode setPays */
	/**
	 * Sets the produits.
	 *
	 * @param produitVO the new produits
	 */
	public void setProduits(Produit produitVO){
		
		setNumRcCodeProdOB(produitVO.getRccodeprod());
		setNumRcPrecUemoaOB(produitVO.getRcprecuemoa());
		setNumRcPrecSenegalOB(produitVO.getRcprecsenegal());
		setNumRcLibelleTarif(produitVO.getRclibelletarif());
		setNumRcCommProd(produitVO.getRccommprod());
		setNumRcCodePerissable(produitVO.getRccodeperissable());
		setNumRcIndProdPetrolier(produitVO.getRcindprodpetrolier());
		setNumRcCodeProdCru(produitVO.getRccodeprodcru());
		setNumRcCodeProdArtisanal(produitVO.getRccodeprodartisanal());
		setNumRcUniteComp(produitVO.getRcunitecomp());
		setNumRcSectActProd(produitVO.getRcsectactprod());
		setNumRcCodeTransit(produitVO.getRccodetransit());
		setNumRcCodeBienEquip(produitVO.getRccodebienequip());
		setNumRcValEquipProd(ConvertUtil.converToString(produitVO.getRcvalequipprod()));
		setNumRcCodeEntrepot(produitVO.getRccodeentrepot());
		setNumRcCodeProdSocial(produitVO.getRccodeprodsocial());
		setNumRcValSpecProd(ConvertUtil.converToString(produitVO.getRcvalspecprod()));
		setNumListRcValChapitreOB(produitVO.getRcvalchapitre());
		setNumListRcCodeClasseOB(ConvertUtil.converToString(produitVO.getRccodeclasse()));
		setNumRcExonorePvi(produitVO.getRcexonorepvi());
	}

	
	/**
	 * Gets the pk.
	 *
	 * @return the pk
	 */
	public String getPk() {
		return pk;
	}

	
	/**
	 * Sets the pk.
	 *
	 * @param pk the new pk
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	
	/**
	 * Gets the etat.
	 *
	 * @return the etat
	 */
	public String getEtat() {
		return etat;
	}

	
	/**
	 * Sets the etat.
	 *
	 * @param etat the new etat
	 */
	public void setEtat(String etat) {
		this.etat = etat;
	}

	
	/**
	 * Gets the num rc code prod ob.
	 *
	 * @return the num rc code prod ob
	 */
	public String getNumRcCodeProdOB() {
		return numRcCodeProdOB;
	}

	
	/**
	 * Sets the num rc code prod ob.
	 *
	 * @param numRcCodeProdOB the new num rc code prod ob
	 */
	public void setNumRcCodeProdOB(String numRcCodeProdOB) {
		this.numRcCodeProdOB = numRcCodeProdOB;
	}

	
	/**
	 * Gets the num rc prec uemoa ob.
	 *
	 * @return the num rc prec uemoa ob
	 */
	public String getNumRcPrecUemoaOB() {
		return numRcPrecUemoaOB;
	}

	
	/**
	 * Sets the num rc prec uemoa ob.
	 *
	 * @param numRcPrecUemoaOB the new num rc prec uemoa ob
	 */
	public void setNumRcPrecUemoaOB(String numRcPrecUemoaOB) {
		this.numRcPrecUemoaOB = numRcPrecUemoaOB;
	}

	
	/**
	 * Gets the num rc prec senegal ob.
	 *
	 * @return the num rc prec senegal ob
	 */
	public String getNumRcPrecSenegalOB() {
		return numRcPrecSenegalOB;
	}

	
	/**
	 * Sets the num rc prec senegal ob.
	 *
	 * @param numRcPrecSenegalOB the new num rc prec senegal ob
	 */
	public void setNumRcPrecSenegalOB(String numRcPrecSenegalOB) {
		this.numRcPrecSenegalOB = numRcPrecSenegalOB;
	}

	
	/**
	 * Gets the num rc libelle tarif.
	 *
	 * @return the num rc libelle tarif
	 */
	public String getNumRcLibelleTarif() {
		return numRcLibelleTarif;
	}

	
	/**
	 * Sets the num rc libelle tarif.
	 *
	 * @param numRcLibelleTarif the new num rc libelle tarif
	 */
	public void setNumRcLibelleTarif(String numRcLibelleTarif) {
		this.numRcLibelleTarif = numRcLibelleTarif;
	}

	
	/**
	 * Gets the num rc comm prod.
	 *
	 * @return the num rc comm prod
	 */
	public String getNumRcCommProd() {
		return numRcCommProd;
	}

	
	/**
	 * Sets the num rc comm prod.
	 *
	 * @param numRcCommProd the new num rc comm prod
	 */
	public void setNumRcCommProd(String numRcCommProd) {
		this.numRcCommProd = numRcCommProd;
	}

	
	/**
	 * Gets the num rc ind prod petrolier.
	 *
	 * @return the num rc ind prod petrolier
	 */
	public String getNumRcIndProdPetrolier() {
		return numRcIndProdPetrolier;
	}

	
	/**
	 * Sets the num rc ind prod petrolier.
	 *
	 * @param numRcIndProdPetrolier the new num rc ind prod petrolier
	 */
	public void setNumRcIndProdPetrolier(String numRcIndProdPetrolier) {
		this.numRcIndProdPetrolier = numRcIndProdPetrolier;
	}

	
	/**
	 * Gets the num rc code prod cru.
	 *
	 * @return the num rc code prod cru
	 */
	public String getNumRcCodeProdCru() {
		return numRcCodeProdCru;
	}

	
	/**
	 * Sets the num rc code prod cru.
	 *
	 * @param numRcCodeProdCru the new num rc code prod cru
	 */
	public void setNumRcCodeProdCru(String numRcCodeProdCru) {
		this.numRcCodeProdCru = numRcCodeProdCru;
	}

	
	/**
	 * Gets the num rc code prod artisanal.
	 *
	 * @return the num rc code prod artisanal
	 */
	public String getNumRcCodeProdArtisanal() {
		return numRcCodeProdArtisanal;
	}

	
	/**
	 * Sets the num rc code prod artisanal.
	 *
	 * @param numRcCodeProdArtisanal the new num rc code prod artisanal
	 */
	public void setNumRcCodeProdArtisanal(String numRcCodeProdArtisanal) {
		this.numRcCodeProdArtisanal = numRcCodeProdArtisanal;
	}

	
	/**
	 * Gets the num rc unite comp.
	 *
	 * @return the num rc unite comp
	 */
	public String getNumRcUniteComp() {
		return numRcUniteComp;
	}

	
	/**
	 * Sets the num rc unite comp.
	 *
	 * @param numRcUniteComp the new num rc unite comp
	 */
	public void setNumRcUniteComp(String numRcUniteComp) {
		this.numRcUniteComp = numRcUniteComp;
	}

	
	/**
	 * Gets the num rc sect act prod.
	 *
	 * @return the num rc sect act prod
	 */
	public String getNumRcSectActProd() {
		return numRcSectActProd;
	}

	
	/**
	 * Sets the num rc sect act prod.
	 *
	 * @param numRcSectActProd the new num rc sect act prod
	 */
	public void setNumRcSectActProd(String numRcSectActProd) {
		this.numRcSectActProd = numRcSectActProd;
	}

	
	/**
	 * Gets the num rc code transit.
	 *
	 * @return the num rc code transit
	 */
	public String getNumRcCodeTransit() {
		return numRcCodeTransit;
	}

	
	/**
	 * Sets the num rc code transit.
	 *
	 * @param numRcCodeTransit the new num rc code transit
	 */
	public void setNumRcCodeTransit(String numRcCodeTransit) {
		this.numRcCodeTransit = numRcCodeTransit;
	}

	
	/**
	 * Gets the num rc code bien equip.
	 *
	 * @return the num rc code bien equip
	 */
	public String getNumRcCodeBienEquip() {
		return numRcCodeBienEquip;
	}

	
	/**
	 * Sets the num rc code bien equip.
	 *
	 * @param numRcCodeBienEquip the new num rc code bien equip
	 */
	public void setNumRcCodeBienEquip(String numRcCodeBienEquip) {
		this.numRcCodeBienEquip = numRcCodeBienEquip;
	}

	
	/**
	 * Gets the num rc val equip prod.
	 *
	 * @return the num rc val equip prod
	 */
	public String getNumRcValEquipProd() {
		return numRcValEquipProd;
	}

	
	/**
	 * Sets the num rc val equip prod.
	 *
	 * @param numRcValEquipProd the new num rc val equip prod
	 */
	public void setNumRcValEquipProd(String numRcValEquipProd) {
		this.numRcValEquipProd = numRcValEquipProd;
	}

	
	/**
	 * Gets the num rc code entrepot.
	 *
	 * @return the num rc code entrepot
	 */
	public String getNumRcCodeEntrepot() {
		return numRcCodeEntrepot;
	}

	
	/**
	 * Sets the num rc code entrepot.
	 *
	 * @param numRcCodeEntrepot the new num rc code entrepot
	 */
	public void setNumRcCodeEntrepot(String numRcCodeEntrepot) {
		this.numRcCodeEntrepot = numRcCodeEntrepot;
	}

	
	/**
	 * Gets the num rc code prod social.
	 *
	 * @return the num rc code prod social
	 */
	public String getNumRcCodeProdSocial() {
		return numRcCodeProdSocial;
	}

	
	/**
	 * Sets the num rc code prod social.
	 *
	 * @param numRcCodeProdSocial the new num rc code prod social
	 */
	public void setNumRcCodeProdSocial(String numRcCodeProdSocial) {
		this.numRcCodeProdSocial = numRcCodeProdSocial;
	}

	
	/**
	 * Gets the num rc val spec prod.
	 *
	 * @return the num rc val spec prod
	 */
	public String getNumRcValSpecProd() {
		return numRcValSpecProd;
	}

	
	/**
	 * Sets the num rc val spec prod.
	 *
	 * @param numRcValSpecProd the new num rc val spec prod
	 */
	public void setNumRcValSpecProd(String numRcValSpecProd) {
		this.numRcValSpecProd = numRcValSpecProd;
	}

	
	/**
	 * Gets the num list rc val chapitre ob.
	 *
	 * @return the num list rc val chapitre ob
	 */
	public String getNumListRcValChapitreOB() {
		return numListRcValChapitreOB;
	}

	
	/**
	 * Sets the num list rc val chapitre ob.
	 *
	 * @param numListRcValChapitreOB the new num list rc val chapitre ob
	 */
	public void setNumListRcValChapitreOB(String numListRcValChapitreOB) {
		this.numListRcValChapitreOB = numListRcValChapitreOB;
	}

	
	/**
	 * Gets the num list rc code classe ob.
	 *
	 * @return the num list rc code classe ob
	 */
	public String getNumListRcCodeClasseOB() {
		return numListRcCodeClasseOB;
	}

	
	/**
	 * Sets the num list rc code classe ob.
	 *
	 * @param numListRcCodeClasseOB the new num list rc code classe ob
	 */
	public void setNumListRcCodeClasseOB(String numListRcCodeClasseOB) {
		this.numListRcCodeClasseOB = numListRcCodeClasseOB;
	}

	
	/**
	 * Gets the num rc code perissable.
	 *
	 * @return the num rc code perissable
	 */
	public String getNumRcCodePerissable() {
		return numRcCodePerissable;
	}

	
	/**
	 * Sets the num rc code perissable.
	 *
	 * @param numRcCodePerissable the new num rc code perissable
	 */
	public void setNumRcCodePerissable(String numRcCodePerissable) {
		this.numRcCodePerissable = numRcCodePerissable;
	}

	
	/**
	 * Gets the num rc code prod rech.
	 *
	 * @return the num rc code prod rech
	 */
	public String getNumRcCodeProdRech() {
		return numRcCodeProdRech;
	}

	
	/**
	 * Sets the num rc code prod rech.
	 *
	 * @param numRcCodeProdRech the new num rc code prod rech
	 */
	public void setNumRcCodeProdRech(String numRcCodeProdRech) {
		this.numRcCodeProdRech = numRcCodeProdRech;
	}

	
	/**
	 * Gets the num rc prec uemoa rech.
	 *
	 * @return the num rc prec uemoa rech
	 */
	public String getNumRcPrecUemoaRech() {
		return numRcPrecUemoaRech;
	}

	
	/**
	 * Sets the num rc prec uemoa rech.
	 *
	 * @param numRcPrecUemoaRech the new num rc prec uemoa rech
	 */
	public void setNumRcPrecUemoaRech(String numRcPrecUemoaRech) {
		this.numRcPrecUemoaRech = numRcPrecUemoaRech;
	}

	
	/**
	 * Gets the num rc prec senegal rech.
	 *
	 * @return the num rc prec senegal rech
	 */
	public String getNumRcPrecSenegalRech() {
		return numRcPrecSenegalRech;
	}

	
	/**
	 * Sets the num rc prec senegal rech.
	 *
	 * @param numRcPrecSenegalRech the new num rc prec senegal rech
	 */
	public void setNumRcPrecSenegalRech(String numRcPrecSenegalRech) {
		this.numRcPrecSenegalRech = numRcPrecSenegalRech;
	}

	
	/**
	 * Gets the num list rc val chapitre rech.
	 *
	 * @return the num list rc val chapitre rech
	 */
	public String getNumListRcValChapitreRech() {
		return numListRcValChapitreRech;
	}

	
	/**
	 * Sets the num list rc val chapitre rech.
	 *
	 * @param numListRcValChapitreRech the new num list rc val chapitre rech
	 */
	public void setNumListRcValChapitreRech(String numListRcValChapitreRech) {
		this.numListRcValChapitreRech = numListRcValChapitreRech;
	}

	
	/**
	 * Gets the num list rc code classe rech.
	 *
	 * @return the num list rc code classe rech
	 */
	public String getNumListRcCodeClasseRech() {
		return numListRcCodeClasseRech;
	}

	
	/**
	 * Sets the num list rc code classe rech.
	 *
	 * @param numListRcCodeClasseRech the new num list rc code classe rech
	 */
	public void setNumListRcCodeClasseRech(String numListRcCodeClasseRech) {
		this.numListRcCodeClasseRech = numListRcCodeClasseRech;
	}

	
	/**
	 * Gets the liste rc produits.
	 *
	 * @return the liste rc produits
	 */
	public List getListeRcProduits() {
		return listeRcProduits;
	}

	
	/**
	 * Sets the liste rc produits.
	 *
	 * @param listeRcProduits the new liste rc produits
	 */
	public void setListeRcProduits(List listeRcProduits) {
		this.listeRcProduits = listeRcProduits;
	}

	
	/**
	 * Gets the produit vo.
	 *
	 * @return the produit vo
	 */
	public Produit getProduitVO() {
		return produitVO;
	}

	
	/**
	 * Sets the produit vo.
	 *
	 * @param produitVO the new produit vo
	 */
	public void setProduitVO(Produit produitVO) {
		this.produitVO = produitVO;
	}

	
	/**
	 * Gets the rows.
	 *
	 * @return the rows
	 */
	public Integer getRows() {
		return rows;
	}

	
	/**
	 * Sets the rows.
	 *
	 * @param rows the new rows
	 */
	public void setRows(Integer rows) {
		this.rows = rows;
	}

	
	/**
	 * Gets the page.
	 *
	 * @return the page
	 */
	public Integer getPage() {
		return page;
	}

	
	/**
	 * Sets the page.
	 *
	 * @param page the new page
	 */
	public void setPage(Integer page) {
		this.page = page;
	}

	
	/**
	 * Gets the sord.
	 *
	 * @return the sord
	 */
	public String getSord() {
		return sord;
	}

	
	/**
	 * Sets the sord.
	 *
	 * @param sord the new sord
	 */
	public void setSord(String sord) {
		this.sord = sord;
	}

	
	/**
	 * Gets the sidx.
	 *
	 * @return the sidx
	 */
	public String getSidx() {
		return sidx;
	}

	
	/**
	 * Sets the sidx.
	 *
	 * @param sidx the new sidx
	 */
	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	
	/**
	 * Gets the total.
	 *
	 * @return the total
	 */
	public Integer getTotal() {
		return total;
	}

	
	/**
	 * Sets the total.
	 *
	 * @param total the new total
	 */
	public void setTotal(Integer total) {
		this.total = total;
	}

	
	/**
	 * Gets the records.
	 *
	 * @return the records
	 */
	public Integer getRecords() {
		return records;
	}

	
	/**
	 * Sets the records.
	 *
	 * @param records the new records
	 */
	public void setRecords(Integer records) {
		this.records = records;
		if (this.records > 0 && this.rows > 0) {
			this.total = (int) Math.ceil((double) this.records
					/ (double) this.rows);
		} else {
			this.total = 0;
		}
	}

	
	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public String getIndex() {
		return index;
	}

	
	/**
	 * Sets the index.
	 *
	 * @param index the new index
	 */
	public void setIndex(String index) {
		this.index = index;
	}

	
	public String getNumRcExonorePvi() {
		return numRcExonorePvi;
	}

	
	public void setNumRcExonorePvi(String numRcExonorePvi) {
		this.numRcExonorePvi = numRcExonorePvi;
	}

	
}