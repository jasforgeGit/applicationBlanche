/**
 * @author Mouhamad KAMARA CFAO TECHNOLOGIES
 * 
 * Classe display pour la consultation du manifeste (Segment g�n�ral, article
 * manifeste, apurement manifeste)
 */
package sn.com.douane.utils;


import java.io.Serializable;
import java.sql.Date;

import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;

public class ConsultationManifesteDisplay implements Serializable {

	private static final long serialVersionUID = -8740205825782174568L;

	/**
	 * Champs display pour le segment g�n�ral manifeste
	 */
	private String sgmanifcodeconsignataire;

	private String sgmanifanneeenregmanif;

	private String sgmanifnumrep;

	private String sgmanifbureauenregmanif;

	private String sgmanifbureauentreemanif;

	private String sgmanifnumenregmanif;

	private String sgmaniftypemanifeste;

	private String sgmanifnbrearticlemanif;

	private String sgmanifmodetransport;

	private String sgmanifmoyentransport;

	private String sgmanifcodepaysprov;

	private String sgmanifcodepaysorigine;

	private String sgmanifsensvoyage;

	private String sgmaniftonnagedebarq;

	private String sgmanifnbreconnais;

	private String sgmanifnaturecargais;

	private String sgmaniftypenavire;

	private String sgmanifdestfiscale;

	private String sgmanifjaugebrute;

	private String sgmanifjaugenette;

	private String sgmanifvaleurapprox;

	private String sgmanifpoidstotalmanif;

	private String sgmanifpavillonnavire;

	private String sgmanifindicateurpartiel;

	private String sgmanifagentecoreur1;

	private String sgmanifagentecoreur2;

	private String sgmanifdatecreation;

	private String sgmanifdatearrivee;

	private String sgmanifdateenregmanif;

	private String sgmanifdateconnaissement;

	private String sgmanifnumvolvoyage;

	private String sgmanifcodecieassistee;

	private String sgmaniftypetraitement;

	private String sgmanifcompassiste;

	/**
	 * Champs display pour l'article manifeste
	 */
	private String artmanifbureauengmanif;

	private String artmanifanneeengmanif;

	private String artmanifnumenregmanif;

	private String artmanifcodeconsign;

	private String artmanifnumrepertoire;

	private String artmanifcodelieuemb;

	private String artmanifnumarticlemanif;

	private String artmanifprecisartmanif;

	private String artmanifprecisartmanif2;

	private String artmanifnbrcolis;

	private String artmanifmodecond;

	private String artmanifcodedest;

	private String artmaniftypevoixdest;

	private String artmanifnomvoiedest;

	private String artmanifnineadest;

	private String artmanifnumvoiedest;

	private String artmanifquartierdest;

	private String artmanifvilledest;

	private String artmanifbpdest;

	private String artmanifvilledestdef;

	private String artmanifnumtitretransp;

	private String artmanifmarquescolis;

	private String artmanifdesignationcom;

	private String artmanifpdsbrutmanif;

	private String artmanifvolume;

	private String artmanifnbrcolisrectif;

	private String artmanifpdsbrutcoquille;

	private String artmanifvolumeecore;

	private String artmanifagentcorrection;

	private String artmanifnbrcolisecores;

	private String artmanifpdsbrutecore;

	private String artmanifnbrcolisdeclare;

	private String artmanifpdsdeclaremanif;

	private String artmanifnbrcolisapures;

	private String artmanifpdsapurphymanif;

	private String artmanifdateemb;

	private String artmanifindpartiel;

	private String artmanifnomdestinataire;

	private String artmanifnomexpediteur;

	private String artmanifjuliandateemb;

	private String artmanifnumrecond;

	private String artmanifnumrecond2;

	private String artmanifetatartmanif;

	private String artmanifetatdmdsurmanif;

	private String artmanifnumdmdsurmanif;

	private String artmanifanneedmd;

	private String artmanifcodedepot;

	private String artmanifcodeordre;

	private String artmanifnomordre;

	private String artmanifadresseordre;

	private String artmanifcodeattache;

	private String artmanifnbrconteneur;

	private String artmanifdestinationdef;

	private String artmanifartindvalid;

	private String artmanifdatevalidart;

	private String artmanifdatecreationart;

	private String artmanifdatemajarticle;

	private String artmanifcodehdarticle;

	private String artmanifidpvecor;

	private String artmanifidlieustockage;

	private String artmanifartppmdest;

	private String artmanifindciblage;

	private String artmaniftypetraitement;

	private String artmanifindprecis;

	private String artmanifindprecis2;

	private String pk;

	private String numeroarticle;

	private String numeromanifeste;

	/**
	 * Champs display pour l'affichage de conteneurs
	 */
	private String contManifbureauengmanif;

	private String contManifanneeengmanif;

	private Integer contManifnumenregmanif;

	private Integer contManifnumarticlemanif;

	private Integer contManifprecisartmanif;

	private String contManifnumconteneurs;

	private Integer contManifprecis2artmanif;

	private Integer contManifnumapurement;

	private String contManifnumplomb;

	private String contManiftypeconteneur;

	private String contManiftailleconteneur;

	private String contManifindconteneur;

	private String contManifchassis;

	/**
	 * Champs display pour l'affichage de message
	 */
	private String nummessage;

	private String codeemetteur;

	private String codedestinataire;

	private String priorite;

	private String codetypemessage;

	private String dateemission;

	private String datereception = sysEnv.dateToStr(new Date(System
			.currentTimeMillis()));

	private String etatemission;

	private String etatreception;

	private String titremessage;

	private String corpsmessage;

	/**
	 * Champs display pour l'affichage des totaux
	 */
	private String totmanifnbrcolis;

	private String totmanifpdsbrutmanif;

	private String totmanifnbrcolisecores;

	private String totmanifpdsbrutecore;

	private String totmanifnbrcolisdeclare;

	private String totmanifpdsdeclaremanif;

	private String totmanifnbrcolisapures;

	private String totmanifpdsapurphymanif;

	/**
	 * Constructeur par d�faut
	 */
	public ConsultationManifesteDisplay() {
		super();
	}

	/**
	 * @return Renvoie artmanifadresseordre.
	 */
	public String getArtmanifadresseordre() {
		return artmanifadresseordre;
	}

	/**
	 * @param artmanifadresseordre
	 *            artmanifadresseordre � d�finir.
	 */
	public void setArtmanifadresseordre(String artmanifadresseordre) {
		this.artmanifadresseordre = artmanifadresseordre;
	}

	/**
	 * @return Renvoie artmanifagentcorrection.
	 */
	public String getArtmanifagentcorrection() {
		return artmanifagentcorrection;
	}

	/**
	 * @param artmanifagentcorrection
	 *            artmanifagentcorrection � d�finir.
	 */
	public void setArtmanifagentcorrection(String artmanifagentcorrection) {
		this.artmanifagentcorrection = artmanifagentcorrection;
	}

	/**
	 * @return Renvoie artmanifanneedmd.
	 */
	public String getArtmanifanneedmd() {
		return artmanifanneedmd;
	}

	/**
	 * @param artmanifanneedmd
	 *            artmanifanneedmd � d�finir.
	 */
	public void setArtmanifanneedmd(String artmanifanneedmd) {
		this.artmanifanneedmd = artmanifanneedmd;
	}

	/**
	 * @return Renvoie artmanifanneeengmanif.
	 */
	public String getArtmanifanneeengmanif() {
		return artmanifanneeengmanif;
	}

	/**
	 * @param artmanifanneeengmanif
	 *            artmanifanneeengmanif � d�finir.
	 */
	public void setArtmanifanneeengmanif(String artmanifanneeengmanif) {
		this.artmanifanneeengmanif = artmanifanneeengmanif;
	}

	/**
	 * @return Renvoie artmanifartindvalid.
	 */
	public String getArtmanifartindvalid() {
		return artmanifartindvalid;
	}

	/**
	 * @param artmanifartindvalid
	 *            artmanifartindvalid � d�finir.
	 */
	public void setArtmanifartindvalid(String artmanifartindvalid) {
		this.artmanifartindvalid = artmanifartindvalid;
	}

	/**
	 * @return Renvoie artmanifartppmdest.
	 */
	public String getArtmanifartppmdest() {
		return artmanifartppmdest;
	}

	/**
	 * @param artmanifartppmdest
	 *            artmanifartppmdest � d�finir.
	 */
	public void setArtmanifartppmdest(String artmanifartppmdest) {
		this.artmanifartppmdest = artmanifartppmdest;
	}

	/**
	 * @return Renvoie artmanifbpdest.
	 */
	public String getArtmanifbpdest() {
		return artmanifbpdest;
	}

	/**
	 * @param artmanifbpdest
	 *            artmanifbpdest � d�finir.
	 */
	public void setArtmanifbpdest(String artmanifbpdest) {
		this.artmanifbpdest = artmanifbpdest;
	}

	/**
	 * @return Renvoie artmanifbureauengmanif.
	 */
	public String getArtmanifbureauengmanif() {
		return artmanifbureauengmanif;
	}

	/**
	 * @param artmanifbureauengmanif
	 *            artmanifbureauengmanif � d�finir.
	 */
	public void setArtmanifbureauengmanif(String artmanifbureauengmanif) {
		this.artmanifbureauengmanif = artmanifbureauengmanif;
	}

	/**
	 * @return Renvoie artmanifcodeattache.
	 */
	public String getArtmanifcodeattache() {
		return artmanifcodeattache;
	}

	/**
	 * @param artmanifcodeattache
	 *            artmanifcodeattache � d�finir.
	 */
	public void setArtmanifcodeattache(String artmanifcodeattache) {
		this.artmanifcodeattache = artmanifcodeattache;
	}

	/**
	 * @return Renvoie artmanifcodeconsign.
	 */
	public String getArtmanifcodeconsign() {
		return artmanifcodeconsign;
	}

	/**
	 * @param artmanifcodeconsign
	 *            artmanifcodeconsign � d�finir.
	 */
	public void setArtmanifcodeconsign(String artmanifcodeconsign) {
		this.artmanifcodeconsign = artmanifcodeconsign;
	}

	/**
	 * @return Renvoie artmanifcodedepot.
	 */
	public String getArtmanifcodedepot() {
		return artmanifcodedepot;
	}

	/**
	 * @param artmanifcodedepot
	 *            artmanifcodedepot � d�finir.
	 */
	public void setArtmanifcodedepot(String artmanifcodedepot) {
		this.artmanifcodedepot = artmanifcodedepot;
	}

	/**
	 * @return Renvoie artmanifcodedest.
	 */
	public String getArtmanifcodedest() {
		return artmanifcodedest;
	}

	/**
	 * @param artmanifcodedest
	 *            artmanifcodedest � d�finir.
	 */
	public void setArtmanifcodedest(String artmanifcodedest) {
		this.artmanifcodedest = artmanifcodedest;
	}

	/**
	 * @return Renvoie artmanifcodehdarticle.
	 */
	public String getArtmanifcodehdarticle() {
		return artmanifcodehdarticle;
	}

	/**
	 * @param artmanifcodehdarticle
	 *            artmanifcodehdarticle � d�finir.
	 */
	public void setArtmanifcodehdarticle(String artmanifcodehdarticle) {
		this.artmanifcodehdarticle = artmanifcodehdarticle;
	}

	/**
	 * @return Renvoie artmanifcodelieuemb.
	 */
	public String getArtmanifcodelieuemb() {
		return artmanifcodelieuemb;
	}

	/**
	 * @param artmanifcodelieuemb
	 *            artmanifcodelieuemb � d�finir.
	 */
	public void setArtmanifcodelieuemb(String artmanifcodelieuemb) {
		this.artmanifcodelieuemb = artmanifcodelieuemb;
	}

	/**
	 * @return Renvoie artmanifcodeordre.
	 */
	public String getArtmanifcodeordre() {
		return artmanifcodeordre;
	}

	/**
	 * @param artmanifcodeordre
	 *            artmanifcodeordre � d�finir.
	 */
	public void setArtmanifcodeordre(String artmanifcodeordre) {
		this.artmanifcodeordre = artmanifcodeordre;
	}

	/**
	 * @return Renvoie artmanifdatecreationart.
	 */
	public String getArtmanifdatecreationart() {
		return artmanifdatecreationart;
	}

	/**
	 * @param artmanifdatecreationart
	 *            artmanifdatecreationart � d�finir.
	 */
	public void setArtmanifdatecreationart(String artmanifdatecreationart) {
		this.artmanifdatecreationart = artmanifdatecreationart;
	}

	/**
	 * @return Renvoie artmanifdateemb.
	 */
	public String getArtmanifdateemb() {
		return artmanifdateemb;
	}

	/**
	 * @param artmanifdateemb
	 *            artmanifdateemb � d�finir.
	 */
	public void setArtmanifdateemb(String artmanifdateemb) {
		this.artmanifdateemb = artmanifdateemb;
	}

	/**
	 * @return Renvoie artmanifdatemajarticle.
	 */
	public String getArtmanifdatemajarticle() {
		return artmanifdatemajarticle;
	}

	/**
	 * @param artmanifdatemajarticle
	 *            artmanifdatemajarticle � d�finir.
	 */
	public void setArtmanifdatemajarticle(String artmanifdatemajarticle) {
		this.artmanifdatemajarticle = artmanifdatemajarticle;
	}

	/**
	 * @return Renvoie artmanifdatevalidart.
	 */
	public String getArtmanifdatevalidart() {
		return artmanifdatevalidart;
	}

	/**
	 * @param artmanifdatevalidart
	 *            artmanifdatevalidart � d�finir.
	 */
	public void setArtmanifdatevalidart(String artmanifdatevalidart) {
		this.artmanifdatevalidart = artmanifdatevalidart;
	}

	/**
	 * @return Renvoie artmanifdesignationcom.
	 */
	public String getArtmanifdesignationcom() {
		return artmanifdesignationcom;
	}

	/**
	 * @param artmanifdesignationcom
	 *            artmanifdesignationcom � d�finir.
	 */
	public void setArtmanifdesignationcom(String artmanifdesignationcom) {
		this.artmanifdesignationcom = artmanifdesignationcom;
	}

	/**
	 * @return Renvoie artmanifdestinationdef.
	 */
	public String getArtmanifdestinationdef() {
		return artmanifdestinationdef;
	}

	/**
	 * @param artmanifdestinationdef
	 *            artmanifdestinationdef � d�finir.
	 */
	public void setArtmanifdestinationdef(String artmanifdestinationdef) {
		this.artmanifdestinationdef = artmanifdestinationdef;
	}

	/**
	 * @return Renvoie artmanifetatartmanif.
	 */
	public String getArtmanifetatartmanif() {
		return artmanifetatartmanif;
	}

	/**
	 * @param artmanifetatartmanif
	 *            artmanifetatartmanif � d�finir.
	 */
	public void setArtmanifetatartmanif(String artmanifetatartmanif) {
		this.artmanifetatartmanif = artmanifetatartmanif;
	}

	/**
	 * @return Renvoie artmanifetatdmdsurmanif.
	 */
	public String getArtmanifetatdmdsurmanif() {
		return artmanifetatdmdsurmanif;
	}

	/**
	 * @param artmanifetatdmdsurmanif
	 *            artmanifetatdmdsurmanif � d�finir.
	 */
	public void setArtmanifetatdmdsurmanif(String artmanifetatdmdsurmanif) {
		this.artmanifetatdmdsurmanif = artmanifetatdmdsurmanif;
	}

	/**
	 * @return Renvoie artmanifidlieustockage.
	 */
	public String getArtmanifidlieustockage() {
		return artmanifidlieustockage;
	}

	/**
	 * @param artmanifidlieustockage
	 *            artmanifidlieustockage � d�finir.
	 */
	public void setArtmanifidlieustockage(String artmanifidlieustockage) {
		this.artmanifidlieustockage = artmanifidlieustockage;
	}

	/**
	 * @return Renvoie artmanifidpvecor.
	 */
	public String getArtmanifidpvecor() {
		return artmanifidpvecor;
	}

	/**
	 * @param artmanifidpvecor
	 *            artmanifidpvecor � d�finir.
	 */
	public void setArtmanifidpvecor(String artmanifidpvecor) {
		this.artmanifidpvecor = artmanifidpvecor;
	}

	/**
	 * @return Renvoie artmanifindciblage.
	 */
	public String getArtmanifindciblage() {
		return artmanifindciblage;
	}

	/**
	 * @param artmanifindciblage
	 *            artmanifindciblage � d�finir.
	 */
	public void setArtmanifindciblage(String artmanifindciblage) {
		this.artmanifindciblage = artmanifindciblage;
	}

	/**
	 * @return Renvoie artmanifindpartiel.
	 */
	public String getArtmanifindpartiel() {
		return artmanifindpartiel;
	}

	/**
	 * @param artmanifindpartiel
	 *            artmanifindpartiel � d�finir.
	 */
	public void setArtmanifindpartiel(String artmanifindpartiel) {
		this.artmanifindpartiel = artmanifindpartiel;
	}

	/**
	 * @return Renvoie artmanifindprecis.
	 */
	public String getArtmanifindprecis() {
		return artmanifindprecis;
	}

	/**
	 * @param artmanifindprecis
	 *            artmanifindprecis � d�finir.
	 */
	public void setArtmanifindprecis(String artmanifindprecis) {
		this.artmanifindprecis = artmanifindprecis;
	}

	/**
	 * @return Renvoie artmanifindprecis2.
	 */
	public String getArtmanifindprecis2() {
		return artmanifindprecis2;
	}

	/**
	 * @param artmanifindprecis2
	 *            artmanifindprecis2 � d�finir.
	 */
	public void setArtmanifindprecis2(String artmanifindprecis2) {
		this.artmanifindprecis2 = artmanifindprecis2;
	}

	/**
	 * @return Renvoie artmanifjuliandateemb.
	 */
	public String getArtmanifjuliandateemb() {
		return artmanifjuliandateemb;
	}

	/**
	 * @param artmanifjuliandateemb
	 *            artmanifjuliandateemb � d�finir.
	 */
	public void setArtmanifjuliandateemb(String artmanifjuliandateemb) {
		this.artmanifjuliandateemb = artmanifjuliandateemb;
	}

	/**
	 * @return Renvoie artmanifmarquescolis.
	 */
	public String getArtmanifmarquescolis() {
		return artmanifmarquescolis;
	}

	/**
	 * @param artmanifmarquescolis
	 *            artmanifmarquescolis � d�finir.
	 */
	public void setArtmanifmarquescolis(String artmanifmarquescolis) {
		this.artmanifmarquescolis = artmanifmarquescolis;
	}

	/**
	 * @return Renvoie artmanifmodecond.
	 */
	public String getArtmanifmodecond() {
		return artmanifmodecond;
	}

	/**
	 * @param artmanifmodecond
	 *            artmanifmodecond � d�finir.
	 */
	public void setArtmanifmodecond(String artmanifmodecond) {
		this.artmanifmodecond = artmanifmodecond;
	}

	/**
	 * @return Renvoie artmanifnbrcolis.
	 */
	public String getArtmanifnbrcolis() {
		return artmanifnbrcolis;
	}

	/**
	 * @param artmanifnbrcolis
	 *            artmanifnbrcolis � d�finir.
	 */
	public void setArtmanifnbrcolis(String artmanifnbrcolis) {
		this.artmanifnbrcolis = artmanifnbrcolis;
	}

	/**
	 * @return Renvoie artmanifnbrcolisapures.
	 */
	public String getArtmanifnbrcolisapures() {
		return artmanifnbrcolisapures;
	}

	/**
	 * @param artmanifnbrcolisapures
	 *            artmanifnbrcolisapures � d�finir.
	 */
	public void setArtmanifnbrcolisapures(String artmanifnbrcolisapures) {
		this.artmanifnbrcolisapures = artmanifnbrcolisapures;
	}

	/**
	 * @return Renvoie artmanifnbrcolisdeclare.
	 */
	public String getArtmanifnbrcolisdeclare() {
		return artmanifnbrcolisdeclare;
	}

	/**
	 * @param artmanifnbrcolisdeclare
	 *            artmanifnbrcolisdeclare � d�finir.
	 */
	public void setArtmanifnbrcolisdeclare(String artmanifnbrcolisdeclare) {
		this.artmanifnbrcolisdeclare = artmanifnbrcolisdeclare;
	}

	/**
	 * @return Renvoie artmanifnbrcolisecores.
	 */
	public String getArtmanifnbrcolisecores() {
		return artmanifnbrcolisecores;
	}

	/**
	 * @param artmanifnbrcolisecores
	 *            artmanifnbrcolisecores � d�finir.
	 */
	public void setArtmanifnbrcolisecores(String artmanifnbrcolisecores) {
		this.artmanifnbrcolisecores = artmanifnbrcolisecores;
	}

	/**
	 * @return Renvoie artmanifnbrcolisrectif.
	 */
	public String getArtmanifnbrcolisrectif() {
		return artmanifnbrcolisrectif;
	}

	/**
	 * @param artmanifnbrcolisrectif
	 *            artmanifnbrcolisrectif � d�finir.
	 */
	public void setArtmanifnbrcolisrectif(String artmanifnbrcolisrectif) {
		this.artmanifnbrcolisrectif = artmanifnbrcolisrectif;
	}

	/**
	 * @return Renvoie artmanifnbrconteneur.
	 */
	public String getArtmanifnbrconteneur() {
		return artmanifnbrconteneur;
	}

	/**
	 * @param artmanifnbrconteneur
	 *            artmanifnbrconteneur � d�finir.
	 */
	public void setArtmanifnbrconteneur(String artmanifnbrconteneur) {
		this.artmanifnbrconteneur = artmanifnbrconteneur;
	}

	/**
	 * @return Renvoie artmanifnineadest.
	 */
	public String getArtmanifnineadest() {
		return artmanifnineadest;
	}

	/**
	 * @param artmanifnineadest
	 *            artmanifnineadest � d�finir.
	 */
	public void setArtmanifnineadest(String artmanifnineadest) {
		this.artmanifnineadest = artmanifnineadest;
	}

	/**
	 * @return Renvoie artmanifnomdestinataire.
	 */
	public String getArtmanifnomdestinataire() {
		return artmanifnomdestinataire;
	}

	/**
	 * @param artmanifnomdestinataire
	 *            artmanifnomdestinataire � d�finir.
	 */
	public void setArtmanifnomdestinataire(String artmanifnomdestinataire) {
		this.artmanifnomdestinataire = artmanifnomdestinataire;
	}

	/**
	 * @return Renvoie artmanifnomexpediteur.
	 */
	public String getArtmanifnomexpediteur() {
		return artmanifnomexpediteur;
	}

	/**
	 * @param artmanifnomexpediteur
	 *            artmanifnomexpediteur � d�finir.
	 */
	public void setArtmanifnomexpediteur(String artmanifnomexpediteur) {
		this.artmanifnomexpediteur = artmanifnomexpediteur;
	}

	/**
	 * @return Renvoie artmanifnomordre.
	 */
	public String getArtmanifnomordre() {
		return artmanifnomordre;
	}

	/**
	 * @param artmanifnomordre
	 *            artmanifnomordre � d�finir.
	 */
	public void setArtmanifnomordre(String artmanifnomordre) {
		this.artmanifnomordre = artmanifnomordre;
	}

	/**
	 * @return Renvoie artmanifnomvoiedest.
	 */
	public String getArtmanifnomvoiedest() {
		return artmanifnomvoiedest;
	}

	/**
	 * @param artmanifnomvoiedest
	 *            artmanifnomvoiedest � d�finir.
	 */
	public void setArtmanifnomvoiedest(String artmanifnomvoiedest) {
		this.artmanifnomvoiedest = artmanifnomvoiedest;
	}

	/**
	 * @return Renvoie artmanifnumarticlemanif.
	 */
	public String getArtmanifnumarticlemanif() {
		return artmanifnumarticlemanif;
	}

	/**
	 * @param artmanifnumarticlemanif
	 *            artmanifnumarticlemanif � d�finir.
	 */
	public void setArtmanifnumarticlemanif(String artmanifnumarticlemanif) {
		this.artmanifnumarticlemanif = artmanifnumarticlemanif;
	}

	/**
	 * @return Renvoie artmanifnumdmdsurmanif.
	 */
	public String getArtmanifnumdmdsurmanif() {
		return artmanifnumdmdsurmanif;
	}

	/**
	 * @param artmanifnumdmdsurmanif
	 *            artmanifnumdmdsurmanif � d�finir.
	 */
	public void setArtmanifnumdmdsurmanif(String artmanifnumdmdsurmanif) {
		this.artmanifnumdmdsurmanif = artmanifnumdmdsurmanif;
	}

	/**
	 * @return Renvoie artmanifnumenregmanif.
	 */
	public String getArtmanifnumenregmanif() {
		return artmanifnumenregmanif;
	}

	/**
	 * @param artmanifnumenregmanif
	 *            artmanifnumenregmanif � d�finir.
	 */
	public void setArtmanifnumenregmanif(String artmanifnumenregmanif) {
		this.artmanifnumenregmanif = artmanifnumenregmanif;
	}

	/**
	 * @return Renvoie artmanifnumrecond.
	 */
	public String getArtmanifnumrecond() {
		return artmanifnumrecond;
	}

	/**
	 * @param artmanifnumrecond
	 *            artmanifnumrecond � d�finir.
	 */
	public void setArtmanifnumrecond(String artmanifnumrecond) {
		this.artmanifnumrecond = artmanifnumrecond;
	}

	/**
	 * @return Renvoie artmanifnumrecond2.
	 */
	public String getArtmanifnumrecond2() {
		return artmanifnumrecond2;
	}

	/**
	 * @param artmanifnumrecond2
	 *            artmanifnumrecond2 � d�finir.
	 */
	public void setArtmanifnumrecond2(String artmanifnumrecond2) {
		this.artmanifnumrecond2 = artmanifnumrecond2;
	}

	/**
	 * @return Renvoie artmanifnumrepertoire.
	 */
	public String getArtmanifnumrepertoire() {
		return artmanifnumrepertoire;
	}

	/**
	 * @param artmanifnumrepertoire
	 *            artmanifnumrepertoire � d�finir.
	 */
	public void setArtmanifnumrepertoire(String artmanifnumrepertoire) {
		this.artmanifnumrepertoire = artmanifnumrepertoire;
	}

	/**
	 * @return Renvoie artmanifnumtitretransp.
	 */
	public String getArtmanifnumtitretransp() {
		return artmanifnumtitretransp;
	}

	/**
	 * @param artmanifnumtitretransp
	 *            artmanifnumtitretransp � d�finir.
	 */
	public void setArtmanifnumtitretransp(String artmanifnumtitretransp) {
		this.artmanifnumtitretransp = artmanifnumtitretransp;
	}

	/**
	 * @return Renvoie artmanifnumvoiedest.
	 */
	public String getArtmanifnumvoiedest() {
		return artmanifnumvoiedest;
	}

	/**
	 * @param artmanifnumvoiedest
	 *            artmanifnumvoiedest � d�finir.
	 */
	public void setArtmanifnumvoiedest(String artmanifnumvoiedest) {
		this.artmanifnumvoiedest = artmanifnumvoiedest;
	}

	/**
	 * @return Renvoie artmanifpdsapurphymanif.
	 */
	public String getArtmanifpdsapurphymanif() {
		return artmanifpdsapurphymanif;
	}

	/**
	 * @param artmanifpdsapurphymanif
	 *            artmanifpdsapurphymanif � d�finir.
	 */
	public void setArtmanifpdsapurphymanif(String artmanifpdsapurphymanif) {
		this.artmanifpdsapurphymanif = artmanifpdsapurphymanif;
	}

	/**
	 * @return Renvoie artmanifpdsbrutcoquille.
	 */
	public String getArtmanifpdsbrutcoquille() {
		return artmanifpdsbrutcoquille;
	}

	/**
	 * @param artmanifpdsbrutcoquille
	 *            artmanifpdsbrutcoquille � d�finir.
	 */
	public void setArtmanifpdsbrutcoquille(String artmanifpdsbrutcoquille) {
		this.artmanifpdsbrutcoquille = artmanifpdsbrutcoquille;
	}

	/**
	 * @return Renvoie artmanifpdsbrutecore.
	 */
	public String getArtmanifpdsbrutecore() {
		return artmanifpdsbrutecore;
	}

	/**
	 * @param artmanifpdsbrutecore
	 *            artmanifpdsbrutecore � d�finir.
	 */
	public void setArtmanifpdsbrutecore(String artmanifpdsbrutecore) {
		this.artmanifpdsbrutecore = artmanifpdsbrutecore;
	}

	/**
	 * @return Renvoie artmanifpdsbrutmanif.
	 */
	public String getArtmanifpdsbrutmanif() {
		return artmanifpdsbrutmanif;
	}

	/**
	 * @param artmanifpdsbrutmanif
	 *            artmanifpdsbrutmanif � d�finir.
	 */
	public void setArtmanifpdsbrutmanif(String artmanifpdsbrutmanif) {
		this.artmanifpdsbrutmanif = artmanifpdsbrutmanif;
	}

	/**
	 * @return Renvoie artmanifpdsdeclaremanif.
	 */
	public String getArtmanifpdsdeclaremanif() {
		return artmanifpdsdeclaremanif;
	}

	/**
	 * @param artmanifpdsdeclaremanif
	 *            artmanifpdsdeclaremanif � d�finir.
	 */
	public void setArtmanifpdsdeclaremanif(String artmanifpdsdeclaremanif) {
		this.artmanifpdsdeclaremanif = artmanifpdsdeclaremanif;
	}

	/**
	 * @return Renvoie artmanifprecisartmanif.
	 */
	public String getArtmanifprecisartmanif() {
		return artmanifprecisartmanif;
	}

	/**
	 * @param artmanifprecisartmanif
	 *            artmanifprecisartmanif � d�finir.
	 */
	public void setArtmanifprecisartmanif(String artmanifprecisartmanif) {
		this.artmanifprecisartmanif = artmanifprecisartmanif;
	}

	/**
	 * @return Renvoie artmanifprecisartmanif2.
	 */
	public String getArtmanifprecisartmanif2() {
		return artmanifprecisartmanif2;
	}

	/**
	 * @param artmanifprecisartmanif2
	 *            artmanifprecisartmanif2 � d�finir.
	 */
	public void setArtmanifprecisartmanif2(String artmanifprecisartmanif2) {
		this.artmanifprecisartmanif2 = artmanifprecisartmanif2;
	}

	/**
	 * @return Renvoie artmanifquartierdest.
	 */
	public String getArtmanifquartierdest() {
		return artmanifquartierdest;
	}

	/**
	 * @param artmanifquartierdest
	 *            artmanifquartierdest � d�finir.
	 */
	public void setArtmanifquartierdest(String artmanifquartierdest) {
		this.artmanifquartierdest = artmanifquartierdest;
	}

	/**
	 * @return Renvoie artmaniftypetraitement.
	 */
	public String getArtmaniftypetraitement() {
		return artmaniftypetraitement;
	}

	/**
	 * @param artmaniftypetraitement
	 *            artmaniftypetraitement � d�finir.
	 */
	public void setArtmaniftypetraitement(String artmaniftypetraitement) {
		this.artmaniftypetraitement = artmaniftypetraitement;
	}

	/**
	 * @return Renvoie artmaniftypevoixdest.
	 */
	public String getArtmaniftypevoixdest() {
		return artmaniftypevoixdest;
	}

	/**
	 * @param artmaniftypevoixdest
	 *            artmaniftypevoixdest � d�finir.
	 */
	public void setArtmaniftypevoixdest(String artmaniftypevoixdest) {
		this.artmaniftypevoixdest = artmaniftypevoixdest;
	}

	/**
	 * @return Renvoie artmanifvilledest.
	 */
	public String getArtmanifvilledest() {
		return artmanifvilledest;
	}

	/**
	 * @param artmanifvilledest
	 *            artmanifvilledest � d�finir.
	 */
	public void setArtmanifvilledest(String artmanifvilledest) {
		this.artmanifvilledest = artmanifvilledest;
	}

	/**
	 * @return Renvoie artmanifvilledestdef.
	 */
	public String getArtmanifvilledestdef() {
		return artmanifvilledestdef;
	}

	/**
	 * @param artmanifvilledestdef
	 *            artmanifvilledestdef � d�finir.
	 */
	public void setArtmanifvilledestdef(String artmanifvilledestdef) {
		this.artmanifvilledestdef = artmanifvilledestdef;
	}

	/**
	 * @return Renvoie artmanifvolume.
	 */
	public String getArtmanifvolume() {
		return artmanifvolume;
	}

	/**
	 * @param artmanifvolume
	 *            artmanifvolume � d�finir.
	 */
	public void setArtmanifvolume(String artmanifvolume) {
		this.artmanifvolume = artmanifvolume;
	}

	/**
	 * @return Renvoie artmanifvolumeecore.
	 */
	public String getArtmanifvolumeecore() {
		return artmanifvolumeecore;
	}

	/**
	 * @param artmanifvolumeecore
	 *            artmanifvolumeecore � d�finir.
	 */
	public void setArtmanifvolumeecore(String artmanifvolumeecore) {
		this.artmanifvolumeecore = artmanifvolumeecore;
	}

	/**
	 * @return Renvoie codedestinataire.
	 */
	public String getCodedestinataire() {
		return codedestinataire;
	}

	/**
	 * @param codedestinataire
	 *            codedestinataire � d�finir.
	 */
	public void setCodedestinataire(String codedestinataire) {
		this.codedestinataire = codedestinataire;
	}

	/**
	 * @return Renvoie codeemetteur.
	 */
	public String getCodeemetteur() {
		return codeemetteur;
	}

	/**
	 * @param codeemetteur
	 *            codeemetteur � d�finir.
	 */
	public void setCodeemetteur(String codeemetteur) {
		this.codeemetteur = codeemetteur;
	}

	/**
	 * @return Renvoie codetypemessage.
	 */
	public String getCodetypemessage() {
		return codetypemessage;
	}

	/**
	 * @param codetypemessage
	 *            codetypemessage � d�finir.
	 */
	public void setCodetypemessage(String codetypemessage) {
		this.codetypemessage = codetypemessage;
	}

	/**
	 * @return Renvoie corpsmessage.
	 */
	public String getCorpsmessage() {
		return corpsmessage;
	}

	/**
	 * @param corpsmessage
	 *            corpsmessage � d�finir.
	 */
	public void setCorpsmessage(String corpsmessage) {
		this.corpsmessage = corpsmessage;
	}

	/**
	 * @return Renvoie dateemission.
	 */
	public String getDateemission() {
		return dateemission;
	}

	/**
	 * @param dateemission
	 *            dateemission � d�finir.
	 */
	public void setDateemission(String dateemission) {
		this.dateemission = dateemission;
	}

	/**
	 * @return Renvoie datereception.
	 */
	public String getDatereception() {
		return datereception;
	}

	/**
	 * @param datereception
	 *            datereception � d�finir.
	 */
	public void setDatereception(String datereception) {
		this.datereception = datereception;
	}

	/**
	 * @return Renvoie etatemission.
	 */
	public String getEtatemission() {
		return etatemission;
	}

	/**
	 * @param etatemission
	 *            etatemission � d�finir.
	 */
	public void setEtatemission(String etatemission) {
		this.etatemission = etatemission;
	}

	/**
	 * @return Renvoie etatreception.
	 */
	public String getEtatreception() {
		return etatreception;
	}

	/**
	 * @param etatreception
	 *            etatreception � d�finir.
	 */
	public void setEtatreception(String etatreception) {
		this.etatreception = etatreception;
	}

	/**
	 * @return Renvoie nummessage.
	 */
	public String getNummessage() {
		return nummessage;
	}

	/**
	 * @param nummessage
	 *            nummessage � d�finir.
	 */
	public void setNummessage(String nummessage) {
		this.nummessage = nummessage;
	}

	/**
	 * @return Renvoie priorite.
	 */
	public String getPriorite() {
		return priorite;
	}

	/**
	 * @param priorite
	 *            priorite � d�finir.
	 */
	public void setPriorite(String priorite) {
		this.priorite = priorite;
	}

	/**
	 * @return Renvoie sgmanifagentecoreur1.
	 */
	public String getSgmanifagentecoreur1() {
		return sgmanifagentecoreur1;
	}

	/**
	 * @param sgmanifagentecoreur1
	 *            sgmanifagentecoreur1 � d�finir.
	 */
	public void setSgmanifagentecoreur1(String sgmanifagentecoreur1) {
		this.sgmanifagentecoreur1 = sgmanifagentecoreur1;
	}

	/**
	 * @return Renvoie sgmanifagentecoreur2.
	 */
	public String getSgmanifagentecoreur2() {
		return sgmanifagentecoreur2;
	}

	/**
	 * @param sgmanifagentecoreur2
	 *            sgmanifagentecoreur2 � d�finir.
	 */
	public void setSgmanifagentecoreur2(String sgmanifagentecoreur2) {
		this.sgmanifagentecoreur2 = sgmanifagentecoreur2;
	}

	/**
	 * @return Renvoie sgmanifanneeenregmanif.
	 */
	public String getSgmanifanneeenregmanif() {
		return sgmanifanneeenregmanif;
	}

	/**
	 * @param sgmanifanneeenregmanif
	 *            sgmanifanneeenregmanif � d�finir.
	 */
	public void setSgmanifanneeenregmanif(String sgmanifanneeenregmanif) {
		this.sgmanifanneeenregmanif = sgmanifanneeenregmanif;
	}

	/**
	 * @return Renvoie sgmanifbureauenregmanif.
	 */
	public String getSgmanifbureauenregmanif() {
		return sgmanifbureauenregmanif;
	}

	/**
	 * @param sgmanifbureauenregmanif
	 *            sgmanifbureauenregmanif � d�finir.
	 */
	public void setSgmanifbureauenregmanif(String sgmanifbureauenregmanif) {
		this.sgmanifbureauenregmanif = sgmanifbureauenregmanif;
	}

	/**
	 * @return Renvoie sgmanifbureauentreemanif.
	 */
	public String getSgmanifbureauentreemanif() {
		return sgmanifbureauentreemanif;
	}

	/**
	 * @param sgmanifbureauentreemanif
	 *            sgmanifbureauentreemanif � d�finir.
	 */
	public void setSgmanifbureauentreemanif(String sgmanifbureauentreemanif) {
		this.sgmanifbureauentreemanif = sgmanifbureauentreemanif;
	}

	/**
	 * @return Renvoie sgmanifcodecieassistee.
	 */
	public String getSgmanifcodecieassistee() {
		return sgmanifcodecieassistee;
	}

	/**
	 * @param sgmanifcodecieassistee
	 *            sgmanifcodecieassistee � d�finir.
	 */
	public void setSgmanifcodecieassistee(String sgmanifcodecieassistee) {
		this.sgmanifcodecieassistee = sgmanifcodecieassistee;
	}

	/**
	 * @return Renvoie sgmanifcodeconsignataire.
	 */
	public String getSgmanifcodeconsignataire() {
		return sgmanifcodeconsignataire;
	}

	/**
	 * @param sgmanifcodeconsignataire
	 *            sgmanifcodeconsignataire � d�finir.
	 */
	public void setSgmanifcodeconsignataire(String sgmanifcodeconsignataire) {
		this.sgmanifcodeconsignataire = sgmanifcodeconsignataire;
	}

	/**
	 * @return Renvoie sgmanifcodepaysorigine.
	 */
	public String getSgmanifcodepaysorigine() {
		return sgmanifcodepaysorigine;
	}

	/**
	 * @param sgmanifcodepaysorigine
	 *            sgmanifcodepaysorigine � d�finir.
	 */
	public void setSgmanifcodepaysorigine(String sgmanifcodepaysorigine) {
		this.sgmanifcodepaysorigine = sgmanifcodepaysorigine;
	}

	/**
	 * @return Renvoie sgmanifcodepaysprov.
	 */
	public String getSgmanifcodepaysprov() {
		return sgmanifcodepaysprov;
	}

	/**
	 * @param sgmanifcodepaysprov
	 *            sgmanifcodepaysprov � d�finir.
	 */
	public void setSgmanifcodepaysprov(String sgmanifcodepaysprov) {
		this.sgmanifcodepaysprov = sgmanifcodepaysprov;
	}

	/**
	 * @return Renvoie sgmanifcompassiste.
	 */
	public String getSgmanifcompassiste() {
		return sgmanifcompassiste;
	}

	/**
	 * @param sgmanifcompassiste
	 *            sgmanifcompassiste � d�finir.
	 */
	public void setSgmanifcompassiste(String sgmanifcompassiste) {
		this.sgmanifcompassiste = sgmanifcompassiste;
	}

	/**
	 * @return Renvoie sgmanifdatearrivee.
	 */
	public String getSgmanifdatearrivee() {
		return sgmanifdatearrivee;
	}

	/**
	 * @param sgmanifdatearrivee
	 *            sgmanifdatearrivee � d�finir.
	 */
	public void setSgmanifdatearrivee(String sgmanifdatearrivee) {
		this.sgmanifdatearrivee = sgmanifdatearrivee;
	}

	/**
	 * @return Renvoie sgmanifdateconnaissement.
	 */
	public String getSgmanifdateconnaissement() {
		return sgmanifdateconnaissement;
	}

	/**
	 * @param sgmanifdateconnaissement
	 *            sgmanifdateconnaissement � d�finir.
	 */
	public void setSgmanifdateconnaissement(String sgmanifdateconnaissement) {
		this.sgmanifdateconnaissement = sgmanifdateconnaissement;
	}

	/**
	 * @return Renvoie sgmanifdatecreation.
	 */
	public String getSgmanifdatecreation() {
		return sgmanifdatecreation;
	}

	/**
	 * @param sgmanifdatecreation
	 *            sgmanifdatecreation � d�finir.
	 */
	public void setSgmanifdatecreation(String sgmanifdatecreation) {
		this.sgmanifdatecreation = sgmanifdatecreation;
	}

	/**
	 * @return Renvoie sgmanifdateenregmanif.
	 */
	public String getSgmanifdateenregmanif() {
		return sgmanifdateenregmanif;
	}

	/**
	 * @param sgmanifdateenregmanif
	 *            sgmanifdateenregmanif � d�finir.
	 */
	public void setSgmanifdateenregmanif(String sgmanifdateenregmanif) {
		this.sgmanifdateenregmanif = sgmanifdateenregmanif;
	}

	/**
	 * @return Renvoie sgmanifdestfiscale.
	 */
	public String getSgmanifdestfiscale() {
		return sgmanifdestfiscale;
	}

	/**
	 * @param sgmanifdestfiscale
	 *            sgmanifdestfiscale � d�finir.
	 */
	public void setSgmanifdestfiscale(String sgmanifdestfiscale) {
		this.sgmanifdestfiscale = sgmanifdestfiscale;
	}

	/**
	 * @return Renvoie sgmanifindicateurpartiel.
	 */
	public String getSgmanifindicateurpartiel() {
		return sgmanifindicateurpartiel;
	}

	/**
	 * @param sgmanifindicateurpartiel
	 *            sgmanifindicateurpartiel � d�finir.
	 */
	public void setSgmanifindicateurpartiel(String sgmanifindicateurpartiel) {
		this.sgmanifindicateurpartiel = sgmanifindicateurpartiel;
	}

	/**
	 * @return Renvoie sgmanifjaugebrute.
	 */
	public String getSgmanifjaugebrute() {
		return sgmanifjaugebrute;
	}

	/**
	 * @param sgmanifjaugebrute
	 *            sgmanifjaugebrute � d�finir.
	 */
	public void setSgmanifjaugebrute(String sgmanifjaugebrute) {
		this.sgmanifjaugebrute = sgmanifjaugebrute;
	}

	/**
	 * @return Renvoie sgmanifjaugenette.
	 */
	public String getSgmanifjaugenette() {
		return sgmanifjaugenette;
	}

	/**
	 * @param sgmanifjaugenette
	 *            sgmanifjaugenette � d�finir.
	 */
	public void setSgmanifjaugenette(String sgmanifjaugenette) {
		this.sgmanifjaugenette = sgmanifjaugenette;
	}

	/**
	 * @return Renvoie sgmanifmodetransport.
	 */
	public String getSgmanifmodetransport() {
		return sgmanifmodetransport;
	}

	/**
	 * @param sgmanifmodetransport
	 *            sgmanifmodetransport � d�finir.
	 */
	public void setSgmanifmodetransport(String sgmanifmodetransport) {
		this.sgmanifmodetransport = sgmanifmodetransport;
	}

	/**
	 * @return Renvoie sgmanifmoyentransport.
	 */
	public String getSgmanifmoyentransport() {
		return sgmanifmoyentransport;
	}

	/**
	 * @param sgmanifmoyentransport
	 *            sgmanifmoyentransport � d�finir.
	 */
	public void setSgmanifmoyentransport(String sgmanifmoyentransport) {
		this.sgmanifmoyentransport = sgmanifmoyentransport;
	}

	/**
	 * @return Renvoie sgmanifnaturecargais.
	 */
	public String getSgmanifnaturecargais() {
		return sgmanifnaturecargais;
	}

	/**
	 * @param sgmanifnaturecargais
	 *            sgmanifnaturecargais � d�finir.
	 */
	public void setSgmanifnaturecargais(String sgmanifnaturecargais) {
		this.sgmanifnaturecargais = sgmanifnaturecargais;
	}

	/**
	 * @return Renvoie sgmanifnbrearticlemanif.
	 */
	public String getSgmanifnbrearticlemanif() {
		return sgmanifnbrearticlemanif;
	}

	/**
	 * @param sgmanifnbrearticlemanif
	 *            sgmanifnbrearticlemanif � d�finir.
	 */
	public void setSgmanifnbrearticlemanif(String sgmanifnbrearticlemanif) {
		this.sgmanifnbrearticlemanif = sgmanifnbrearticlemanif;
	}

	/**
	 * @return Renvoie sgmanifnbreconnais.
	 */
	public String getSgmanifnbreconnais() {
		return sgmanifnbreconnais;
	}

	/**
	 * @param sgmanifnbreconnais
	 *            sgmanifnbreconnais � d�finir.
	 */
	public void setSgmanifnbreconnais(String sgmanifnbreconnais) {
		this.sgmanifnbreconnais = sgmanifnbreconnais;
	}

	/**
	 * @return Renvoie sgmanifnumenregmanif.
	 */
	public String getSgmanifnumenregmanif() {
		return sgmanifnumenregmanif;
	}

	/**
	 * @param sgmanifnumenregmanif
	 *            sgmanifnumenregmanif � d�finir.
	 */
	public void setSgmanifnumenregmanif(String sgmanifnumenregmanif) {
		this.sgmanifnumenregmanif = sgmanifnumenregmanif;
	}

	/**
	 * @return Renvoie sgmanifnumrep.
	 */
	public String getSgmanifnumrep() {
		return sgmanifnumrep;
	}

	/**
	 * @param sgmanifnumrep
	 *            sgmanifnumrep � d�finir.
	 */
	public void setSgmanifnumrep(String sgmanifnumrep) {
		this.sgmanifnumrep = sgmanifnumrep;
	}

	/**
	 * @return Renvoie sgmanifnumvolvoyage.
	 */
	public String getSgmanifnumvolvoyage() {
		return sgmanifnumvolvoyage;
	}

	/**
	 * @param sgmanifnumvolvoyage
	 *            sgmanifnumvolvoyage � d�finir.
	 */
	public void setSgmanifnumvolvoyage(String sgmanifnumvolvoyage) {
		this.sgmanifnumvolvoyage = sgmanifnumvolvoyage;
	}

	/**
	 * @return Renvoie sgmanifpavillonnavire.
	 */
	public String getSgmanifpavillonnavire() {
		return sgmanifpavillonnavire;
	}

	/**
	 * @param sgmanifpavillonnavire
	 *            sgmanifpavillonnavire � d�finir.
	 */
	public void setSgmanifpavillonnavire(String sgmanifpavillonnavire) {
		this.sgmanifpavillonnavire = sgmanifpavillonnavire;
	}

	/**
	 * @return Renvoie sgmanifpoidstotalmanif.
	 */
	public String getSgmanifpoidstotalmanif() {
		return sgmanifpoidstotalmanif;
	}

	/**
	 * @param sgmanifpoidstotalmanif
	 *            sgmanifpoidstotalmanif � d�finir.
	 */
	public void setSgmanifpoidstotalmanif(String sgmanifpoidstotalmanif) {
		this.sgmanifpoidstotalmanif = sgmanifpoidstotalmanif;
	}

	/**
	 * @return Renvoie sgmanifsensvoyage.
	 */
	public String getSgmanifsensvoyage() {
		return sgmanifsensvoyage;
	}

	/**
	 * @param sgmanifsensvoyage
	 *            sgmanifsensvoyage � d�finir.
	 */
	public void setSgmanifsensvoyage(String sgmanifsensvoyage) {
		this.sgmanifsensvoyage = sgmanifsensvoyage;
	}

	/**
	 * @return Renvoie sgmaniftonnagedebarq.
	 */
	public String getSgmaniftonnagedebarq() {
		return sgmaniftonnagedebarq;
	}

	/**
	 * @param sgmaniftonnagedebarq
	 *            sgmaniftonnagedebarq � d�finir.
	 */
	public void setSgmaniftonnagedebarq(String sgmaniftonnagedebarq) {
		this.sgmaniftonnagedebarq = sgmaniftonnagedebarq;
	}

	/**
	 * @return Renvoie sgmaniftypemanifeste.
	 */
	public String getSgmaniftypemanifeste() {
		return sgmaniftypemanifeste;
	}

	/**
	 * @param sgmaniftypemanifeste
	 *            sgmaniftypemanifeste � d�finir.
	 */
	public void setSgmaniftypemanifeste(String sgmaniftypemanifeste) {
		this.sgmaniftypemanifeste = sgmaniftypemanifeste;
	}

	/**
	 * @return Renvoie sgmaniftypenavire.
	 */
	public String getSgmaniftypenavire() {
		return sgmaniftypenavire;
	}

	/**
	 * @param sgmaniftypenavire
	 *            sgmaniftypenavire � d�finir.
	 */
	public void setSgmaniftypenavire(String sgmaniftypenavire) {
		this.sgmaniftypenavire = sgmaniftypenavire;
	}

	/**
	 * @return Renvoie sgmaniftypetraitement.
	 */
	public String getSgmaniftypetraitement() {
		return sgmaniftypetraitement;
	}

	/**
	 * @param sgmaniftypetraitement
	 *            sgmaniftypetraitement � d�finir.
	 */
	public void setSgmaniftypetraitement(String sgmaniftypetraitement) {
		this.sgmaniftypetraitement = sgmaniftypetraitement;
	}

	/**
	 * @return Renvoie sgmanifvaleurapprox.
	 */
	public String getSgmanifvaleurapprox() {
		return sgmanifvaleurapprox;
	}

	/**
	 * @param sgmanifvaleurapprox
	 *            sgmanifvaleurapprox � d�finir.
	 */
	public void setSgmanifvaleurapprox(String sgmanifvaleurapprox) {
		this.sgmanifvaleurapprox = sgmanifvaleurapprox;
	}

	/**
	 * @return Renvoie titremessage.
	 */
	public String getTitremessage() {
		return titremessage;
	}

	/**
	 * @param titremessage
	 *            titremessage � d�finir.
	 */
	public void setTitremessage(String titremessage) {
		this.titremessage = titremessage;
	}

	/**
	 * @return Renvoie totmanifnbrcolis.
	 */
	public String getTotmanifnbrcolis() {
		return totmanifnbrcolis;
	}

	/**
	 * @param totmanifnbrcolis
	 *            totmanifnbrcolis � d�finir.
	 */
	public void setTotmanifnbrcolis(String totmanifnbrcolis) {
		this.totmanifnbrcolis = totmanifnbrcolis;
	}

	/**
	 * @return Renvoie totmanifnbrcolisapures.
	 */
	public String getTotmanifnbrcolisapures() {
		return totmanifnbrcolisapures;
	}

	/**
	 * @param totmanifnbrcolisapures
	 *            totmanifnbrcolisapures � d�finir.
	 */
	public void setTotmanifnbrcolisapures(String totmanifnbrcolisapures) {
		this.totmanifnbrcolisapures = totmanifnbrcolisapures;
	}

	/**
	 * @return Renvoie totmanifnbrcolisdeclare.
	 */
	public String getTotmanifnbrcolisdeclare() {
		return totmanifnbrcolisdeclare;
	}

	/**
	 * @param totmanifnbrcolisdeclare
	 *            totmanifnbrcolisdeclare � d�finir.
	 */
	public void setTotmanifnbrcolisdeclare(String totmanifnbrcolisdeclare) {
		this.totmanifnbrcolisdeclare = totmanifnbrcolisdeclare;
	}

	/**
	 * @return Renvoie totmanifnbrcolisecores.
	 */
	public String getTotmanifnbrcolisecores() {
		return totmanifnbrcolisecores;
	}

	/**
	 * @param totmanifnbrcolisecores
	 *            totmanifnbrcolisecores � d�finir.
	 */
	public void setTotmanifnbrcolisecores(String totmanifnbrcolisecores) {
		this.totmanifnbrcolisecores = totmanifnbrcolisecores;
	}

	/**
	 * @return Renvoie totmanifpdsapurphymanif.
	 */
	public String getTotmanifpdsapurphymanif() {
		return totmanifpdsapurphymanif;
	}

	/**
	 * @param totmanifpdsapurphymanif
	 *            totmanifpdsapurphymanif � d�finir.
	 */
	public void setTotmanifpdsapurphymanif(String totmanifpdsapurphymanif) {
		this.totmanifpdsapurphymanif = totmanifpdsapurphymanif;
	}

	/**
	 * @return Renvoie totmanifpdsbrutecore.
	 */
	public String getTotmanifpdsbrutecore() {
		return totmanifpdsbrutecore;
	}

	/**
	 * @param totmanifpdsbrutecore
	 *            totmanifpdsbrutecore � d�finir.
	 */
	public void setTotmanifpdsbrutecore(String totmanifpdsbrutecore) {
		this.totmanifpdsbrutecore = totmanifpdsbrutecore;
	}

	/**
	 * @return Renvoie totmanifpdsbrutmanif.
	 */
	public String getTotmanifpdsbrutmanif() {
		return totmanifpdsbrutmanif;
	}

	/**
	 * @param totmanifpdsbrutmanif
	 *            totmanifpdsbrutmanif � d�finir.
	 */
	public void setTotmanifpdsbrutmanif(String totmanifpdsbrutmanif) {
		this.totmanifpdsbrutmanif = totmanifpdsbrutmanif;
	}

	/**
	 * @return Renvoie totmanifpdsdeclaremanif.
	 */
	public String getTotmanifpdsdeclaremanif() {
		return totmanifpdsdeclaremanif;
	}

	/**
	 * @param totmanifpdsdeclaremanif
	 *            totmanifpdsdeclaremanif � d�finir.
	 */
	public void setTotmanifpdsdeclaremanif(String totmanifpdsdeclaremanif) {
		this.totmanifpdsdeclaremanif = totmanifpdsdeclaremanif;
	}

	/**
	 * @param articlemanifesteVO
	 */
	public void setArticleManifeste(ArticleManifeste articlemanifesteVO, Integer manifnumrecond, Integer manifnumrecond2) {
		setArtmanifbureauengmanif(articlemanifesteVO.getManifBureauEngManif());
		setArtmanifanneeengmanif(articlemanifesteVO.getManifAnneeEngManif());
		setArtmanifnumenregmanif("" + articlemanifesteVO.getManifNumEnregManif());
		setArtmanifcodeconsign(articlemanifesteVO.getManifCodeConsign());
		setArtmanifnumrepertoire(articlemanifesteVO.getManifNumRepertoire());
		setArtmanifcodelieuemb(articlemanifesteVO.getManifCodeLieuEmb());
		setArtmanifnumarticlemanif("" + articlemanifesteVO.getManifNumArticleManif());
		setArtmanifprecisartmanif("" + articlemanifesteVO.getManifPrecisArtManif());
		setArtmanifprecisartmanif2(""	+ articlemanifesteVO.getManifPrecisArtManif2());
		setArtmanifnbrcolis("" + articlemanifesteVO.getManifNbrColis());
		setArtmanifmodecond(articlemanifesteVO.getManifModeCond());
		setArtmanifcodedest(articlemanifesteVO.getManifCodeDest());
		setArtmaniftypevoixdest(articlemanifesteVO.getManifTypeVoixDest());
		setArtmanifnomvoiedest(articlemanifesteVO.getManifNomVoieDest());
		setArtmanifnineadest(articlemanifesteVO.getManifNineaDest());
		setArtmanifnumvoiedest(articlemanifesteVO.getManifNumVoieDest());
		setArtmanifquartierdest(articlemanifesteVO.getManifQuartierDest());
		setArtmanifvilledest(articlemanifesteVO.getManifVilleDest());
		setArtmanifbpdest(articlemanifesteVO.getManifBpDest());
		setArtmanifvilledestdef(articlemanifesteVO.getManifVilleDestDef());
		setArtmanifnumtitretransp(articlemanifesteVO.getManifNumTitreTransp());
		setArtmanifmarquescolis(articlemanifesteVO.getManifMarquesColis());
		setArtmanifdesignationcom(articlemanifesteVO.getManifDesignationCom());
		setArtmanifpdsbrutmanif("" + articlemanifesteVO.getManifPdsBrutManif());
		
		if (articlemanifesteVO.getManifVolume() != null) {
		    setArtmanifvolume("" + articlemanifesteVO.getManifVolume());
		}else {
		    setArtmanifvolume("");
		}
		setArtmanifnbrcolisrectif(""+ articlemanifesteVO.getManifNbrColisRectif());
		setArtmanifpdsbrutcoquille("" + articlemanifesteVO.getManifPdsBrutCoquille());
		setArtmanifvolumeecore("" + articlemanifesteVO.getManifVolumeEcore());
		setArtmanifagentcorrection(articlemanifesteVO.getManifAgentCorrection());
		setArtmanifnbrcolisecores("" + articlemanifesteVO.getManifNbreContEcore());
		setArtmanifpdsbrutecore("" + articlemanifesteVO.getManifPdsBrutEcore());
		setArtmanifnbrcolisdeclare("" + articlemanifesteVO.getManifNbrColisDeclare());
		setArtmanifpdsdeclaremanif("" + articlemanifesteVO.getManifPdsDeclareManif());
		setArtmanifnbrcolisapures("" + articlemanifesteVO.getManifNbrColisApures());
		setArtmanifpdsapurphymanif("" + articlemanifesteVO.getManifPdsApurPhyManif());
		setArtmanifdateemb(sysEnv.dateToStr(articlemanifesteVO.getManifDateEmb()));
		setArtmanifindpartiel(articlemanifesteVO.getManifIndPartiel());
		setArtmanifnomdestinataire(articlemanifesteVO.getManifNomDestinataire());
		setArtmanifnomexpediteur(articlemanifesteVO.getManifNomExpediteur());
		setArtmanifjuliandateemb(""	+ articlemanifesteVO.getManifJulianDateEmb());
		if (manifnumrecond == null) {
			setArtmanifnumrecond("" + articlemanifesteVO.getManifNumRecond());
		} else {
			setArtmanifnumrecond("" + manifnumrecond);
		}
		if (manifnumrecond2 == null) {
			setArtmanifnumrecond2("" + articlemanifesteVO.getManifNumRecond2());
		} else {
			setArtmanifnumrecond2("" + manifnumrecond2);
		}
		setArtmanifetatartmanif(articlemanifesteVO.getManifEtatArtManif());
		setArtmanifetatdmdsurmanif(articlemanifesteVO.getManifEtatDmdSurManif());
		setArtmanifnumdmdsurmanif("" + articlemanifesteVO.getManifNumDmdSurManif());
		setArtmanifanneedmd(articlemanifesteVO.getManifAnneeDmd());
		setArtmanifcodedepot(articlemanifesteVO.getManifCodeDepot());
		setArtmanifcodeordre(articlemanifesteVO.getManifCodeOrdre());
		setArtmanifnomordre(articlemanifesteVO.getManifNomOrdre());
		setArtmanifadresseordre(articlemanifesteVO.getManifAdresseOrdre());
		setArtmanifcodeattache(articlemanifesteVO.getManifCodeAttache());
		setArtmanifnbrconteneur("" + articlemanifesteVO.getManifNbrConteneur());
		setArtmanifdestinationdef(articlemanifesteVO.getManifDestinationDef());
		setArtmanifartindvalid(articlemanifesteVO.getManifArtIndvalid());
		setArtmanifdatevalidart(sysEnv.dateToStr(articlemanifesteVO.getManifDateValidArt()));
		setArtmanifdatecreationart(sysEnv.dateToStr(articlemanifesteVO.getManifDateCreationArt()));
		setArtmanifdatemajarticle(sysEnv.dateToStr(articlemanifesteVO.getManifDateMajArticle()));
		setArtmanifcodehdarticle(articlemanifesteVO.getManifCodeHdArticle());
		setArtmanifidpvecor("" + articlemanifesteVO.getManifIdPvEcor());
		setArtmanifidlieustockage(articlemanifesteVO.getManifIdLieuStockage());
		setArtmanifartppmdest(articlemanifesteVO.getManifArtPpmDest());
		setArtmanifindciblage(articlemanifesteVO.getManifIndCiblage());
		setArtmaniftypetraitement(articlemanifesteVO.getManifTypeTraitement());
		setArtmanifindprecis(articlemanifesteVO.getManifIndPrecis());
		setArtmanifindprecis2(articlemanifesteVO.getManifIndPrecis2());
	}

	/**
	 * 
	 * @param segmentgenmanifesteVO
	 */
//	public void setSegmentgenManifeste(SegmentGenManifeste segmentgenmanifesteVO) {
//		setSgmanifcodeconsignataire(segmentgenmanifesteVO
//				.getManifcodeconsignataire());
//		setSgmanifagentecoreur1(segmentgenmanifesteVO.getManifagentecoreur1());
//		setSgmanifagentecoreur2(segmentgenmanifesteVO.getManifagentecoreur2());
//		setSgmanifanneeenregmanif(segmentgenmanifesteVO
//				.getManifanneeenregmanif());
//		setSgmanifbureauenregmanif(segmentgenmanifesteVO
//				.getManifbureauenregmanif());
//		setSgmanifbureauentreemanif(segmentgenmanifesteVO
//				.getManifbureauentreemanif());
//		setSgmanifcodecieassistee(segmentgenmanifesteVO
//				.getManifcodecieassistee());
//		setSgmanifcodepaysorigine(segmentgenmanifesteVO
//				.getManifcodepaysorigine());
//		setSgmanifcodepaysprov(segmentgenmanifesteVO.getManifcodepaysprov());
//		setSgmanifcompassiste("" + segmentgenmanifesteVO.getManifcompassiste());
//		setSgmanifdatearrivee(DateUtil
//				.convertDateToString(segmentgenmanifesteVO
//						.getManifdatearrivee()));
//		setSgmanifdateconnaissement(DateUtil
//				.convertDateToString(segmentgenmanifesteVO
//						.getManifdateconnaissement()));
//		setSgmanifdatecreation(DateUtil
//				.convertDateToString(segmentgenmanifesteVO
//						.getManifdatecreation()));
//		setSgmanifdateenregmanif(DateUtil
//				.convertDateToString(segmentgenmanifesteVO
//						.getManifdateenregmanif()));
//		setSgmanifdestfiscale("" + segmentgenmanifesteVO.getManifdestfiscale());
//		setSgmanifindicateurpartiel(segmentgenmanifesteVO
//				.getManifindicateurpartiel());
//		setSgmanifjaugebrute("" + segmentgenmanifesteVO.getManifjaugebrute());
//		setSgmanifjaugenette("" + segmentgenmanifesteVO.getManifjaugenette());
//		setSgmanifmodetransport(segmentgenmanifesteVO.getManifmodetransport());
//		setSgmanifmoyentransport(segmentgenmanifesteVO.getManifmoyentransport());
//		setSgmanifnaturecargais(""
//				+ segmentgenmanifesteVO.getManifnaturecargais());
//		setSgmanifnbrearticlemanif(""
//				+ segmentgenmanifesteVO.getManifnbrearticlemanif());
//		setSgmanifnbreconnais("" + segmentgenmanifesteVO.getManifnbreconnais());
//		setSgmanifnumenregmanif(""
//				+ segmentgenmanifesteVO.getManifnumenregmanif());
//		setSgmanifnumrep(segmentgenmanifesteVO.getManifnumrep());
//		setSgmanifnumvolvoyage(segmentgenmanifesteVO.getManifnumvolvoyage());
//		setSgmanifpavillonnavire(segmentgenmanifesteVO.getManifpavillonnavire());
//		setSgmanifpoidstotalmanif(""
//				+ segmentgenmanifesteVO.getManifpoidstotalmanif());
//		setSgmanifsensvoyage("" + segmentgenmanifesteVO.getManifsensvoyage());
//		setSgmaniftonnagedebarq(""
//				+ segmentgenmanifesteVO.getManiftonnagedebarq());
//		setSgmaniftypemanifeste(""
//				+ segmentgenmanifesteVO.getManiftypemanifeste());
//		setSgmaniftypenavire("" + segmentgenmanifesteVO.getManiftypenavire());
//		setSgmaniftypetraitement(segmentgenmanifesteVO.getManiftypetraitement());
//		setSgmanifvaleurapprox(""
//				+ segmentgenmanifesteVO.getManifvaleurapprox());
//	}

	/**
	 * 
	 * @param conteneurarticleVO
	 */
//	public void setConteneurarticle(ConteneurArticle conteneurarticleVO) {
//		setContManifbureauengmanif(conteneurarticleVO.getManifbureauengmanif());
//		setContManifanneeengmanif(conteneurarticleVO.getManifanneeengmanif());
//		setContManifnumenregmanif(conteneurarticleVO.getManifnumenregmanif());
//		setContManifnumarticlemanif(conteneurarticleVO
//				.getManifnumarticlemanif());
//		setContManifprecisartmanif(conteneurarticleVO.getManifprecisartmanif());
//		setContManifnumconteneurs(conteneurarticleVO.getManifnumconteneurs());
//		setContManifprecis2artmanif(conteneurarticleVO
//				.getManifprecis2artmanif());
//		setContManifnumapurement(conteneurarticleVO.getManifnumapurement());
//		setContManifnumplomb(conteneurarticleVO.getManifnumplomb());
//		setContManiftypeconteneur(conteneurarticleVO.getManiftypeconteneur());
//		setContManiftailleconteneur(conteneurarticleVO
//				.getManiftailleconteneur());
//		setContManifindconteneur(conteneurarticleVO.getManifindconteneur());
//		setContManifchassis(conteneurarticleVO.getManifchassis());
//	}

	/**
	 * @return Renvoie pk.
	 */
	public String getPk() {
		if ((artmanifanneeengmanif != null) && (artmanifbureauengmanif != null)
				&& (artmanifnumenregmanif != null)
				&& (artmanifnumarticlemanif != null)
				&& (artmanifprecisartmanif != null)
				&& (artmanifprecisartmanif2 != null)) {
			this.pk = artmanifanneeengmanif + ConstManif.TIELD
					+ artmanifbureauengmanif + ConstManif.TIELD
					+ artmanifnumenregmanif + ConstManif.TIELD
					+ artmanifnumarticlemanif + ConstManif.TIELD
					+ artmanifprecisartmanif + ConstManif.TIELD
					+ artmanifprecisartmanif2;
		} else if ((sgmanifcodeconsignataire != null)
				&& (sgmanifanneeenregmanif != null) && (sgmanifnumrep != null)) {
			this.pk = sgmanifcodeconsignataire + ConstManif.TIELD
					+ sgmanifanneeenregmanif + ConstManif.TIELD + sgmanifnumrep;
		} else {
			this.pk = contManifbureauengmanif + ConstManif.TIELD
					+ contManifanneeengmanif + ConstManif.TIELD
					+ contManifnumenregmanif + ConstManif.TIELD
					+ contManifnumarticlemanif + ConstManif.TIELD
					+ contManifprecisartmanif + ConstManif.TIELD
					+ contManifprecis2artmanif + ConstManif.TIELD
					+ contManifnumconteneurs;
		}
		return pk;
	}

	/**
	 * @param pk
	 *            pk � d�finir.
	 */
	public void setPk(String pk) {
		this.pk = pk;
	}

	/**
	 * @return Renvoie numeroarticle.
	 */
	public String getNumeroarticle() {
		return artmanifnumarticlemanif + ConstManif.SLASH
				+ artmanifprecisartmanif + ConstManif.SLASH
				+ artmanifprecisartmanif2;
	}

	/**
	 * @param numeroarticle
	 *            numeroarticle � d�finir.
	 */
	public void setNumeroarticle(String numeroarticle) {
		this.numeroarticle = numeroarticle;
	}

	/**
	 * @return Renvoie numeromanifeste.
	 */
	public String getNumeromanifeste() {
		if (artmanifanneeengmanif != null && artmanifbureauengmanif != null
				&& artmanifnumenregmanif != null) {
			return artmanifanneeengmanif + ConstManif.SLASH
					+ artmanifbureauengmanif + ConstManif.SLASH
					+ artmanifnumenregmanif;
		} else {
			return sgmanifanneeenregmanif + ConstManif.SLASH
					+ sgmanifbureauenregmanif + ConstManif.SLASH
					+ sgmanifnumenregmanif;
		}
	}

	/**
	 * @param numeromanifeste
	 *            numeromanifeste � d�finir.
	 */
	public void setNumeromanifeste(String numeromanifeste) {
		this.numeromanifeste = numeromanifeste;
	}

	/**
	 * @return Renvoie contManifanneeengmanif.
	 */
	public String getContManifanneeengmanif() {
		return contManifanneeengmanif;
	}

	/**
	 * @param contManifanneeengmanif
	 *            contManifanneeengmanif � d�finir.
	 */
	public void setContManifanneeengmanif(String contManifanneeengmanif) {
		this.contManifanneeengmanif = contManifanneeengmanif;
	}

	/**
	 * @return Renvoie contManifbureauengmanif.
	 */
	public String getContManifbureauengmanif() {
		return contManifbureauengmanif;
	}

	/**
	 * @param contManifbureauengmanif
	 *            contManifbureauengmanif � d�finir.
	 */
	public void setContManifbureauengmanif(String contManifbureauengmanif) {
		this.contManifbureauengmanif = contManifbureauengmanif;
	}

	/**
	 * @return Renvoie contManifchassis.
	 */
	public String getContManifchassis() {
		return contManifchassis;
	}

	/**
	 * @param contManifchassis
	 *            contManifchassis � d�finir.
	 */
	public void setContManifchassis(String contManifchassis) {
		this.contManifchassis = contManifchassis;
	}

	/**
	 * @return Renvoie contManifindconteneur.
	 */
	public String getContManifindconteneur() {
		return contManifindconteneur;
	}

	/**
	 * @param contManifindconteneur
	 *            contManifindconteneur � d�finir.
	 */
	public void setContManifindconteneur(String contManifindconteneur) {
		this.contManifindconteneur = contManifindconteneur;
	}

	/**
	 * @return Renvoie contManifnumapurement.
	 */
	public Integer getContManifnumapurement() {
		return contManifnumapurement;
	}

	/**
	 * @param contManifnumapurement
	 *            contManifnumapurement � d�finir.
	 */
	public void setContManifnumapurement(Integer contManifnumapurement) {
		this.contManifnumapurement = contManifnumapurement;
	}

	/**
	 * @return Renvoie contManifnumarticlemanif.
	 */
	public Integer getContManifnumarticlemanif() {
		return contManifnumarticlemanif;
	}

	/**
	 * @param contManifnumarticlemanif
	 *            contManifnumarticlemanif � d�finir.
	 */
	public void setContManifnumarticlemanif(Integer contManifnumarticlemanif) {
		this.contManifnumarticlemanif = contManifnumarticlemanif;
	}

	/**
	 * @return Renvoie contManifnumconteneurs.
	 */
	public String getContManifnumconteneurs() {
		return contManifnumconteneurs;
	}

	/**
	 * @param contManifnumconteneurs
	 *            contManifnumconteneurs � d�finir.
	 */
	public void setContManifnumconteneurs(String contManifnumconteneurs) {
		this.contManifnumconteneurs = contManifnumconteneurs;
	}

	/**
	 * @return Renvoie contManifnumenregmanif.
	 */
	public Integer getContManifnumenregmanif() {
		return contManifnumenregmanif;
	}

	/**
	 * @param contManifnumenregmanif
	 *            contManifnumenregmanif � d�finir.
	 */
	public void setContManifnumenregmanif(Integer contManifnumenregmanif) {
		this.contManifnumenregmanif = contManifnumenregmanif;
	}

	/**
	 * @return Renvoie contManifnumplomb.
	 */
	public String getContManifnumplomb() {
		return contManifnumplomb;
	}

	/**
	 * @param contManifnumplomb
	 *            contManifnumplomb � d�finir.
	 */
	public void setContManifnumplomb(String contManifnumplomb) {
		this.contManifnumplomb = contManifnumplomb;
	}

	/**
	 * @return Renvoie contManifprecis2artmanif.
	 */
	public Integer getContManifprecis2artmanif() {
		return contManifprecis2artmanif;
	}

	/**
	 * @param contManifprecis2artmanif
	 *            contManifprecis2artmanif � d�finir.
	 */
	public void setContManifprecis2artmanif(Integer contManifprecis2artmanif) {
		this.contManifprecis2artmanif = contManifprecis2artmanif;
	}

	/**
	 * @return Renvoie contManifprecisartmanif.
	 */
	public Integer getContManifprecisartmanif() {
		return contManifprecisartmanif;
	}

	/**
	 * @param contManifprecisartmanif
	 *            contManifprecisartmanif � d�finir.
	 */
	public void setContManifprecisartmanif(Integer contManifprecisartmanif) {
		this.contManifprecisartmanif = contManifprecisartmanif;
	}

	/**
	 * @return Renvoie contManiftailleconteneur.
	 */
	public String getContManiftailleconteneur() {
		return contManiftailleconteneur;
	}

	/**
	 * @param contManiftailleconteneur
	 *            contManiftailleconteneur � d�finir.
	 */
	public void setContManiftailleconteneur(String contManiftailleconteneur) {
		this.contManiftailleconteneur = contManiftailleconteneur;
	}

	/**
	 * @return Renvoie contManiftypeconteneur.
	 */
	public String getContManiftypeconteneur() {
		return contManiftypeconteneur;
	}

	/**
	 * @param contManiftypeconteneur
	 *            contManiftypeconteneur � d�finir.
	 */
	public void setContManiftypeconteneur(String contManiftypeconteneur) {
		this.contManiftypeconteneur = contManiftypeconteneur;
	}
}