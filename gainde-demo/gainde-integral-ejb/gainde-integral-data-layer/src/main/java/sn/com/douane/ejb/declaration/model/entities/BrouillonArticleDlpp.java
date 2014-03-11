package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import sn.com.douane.ejb.declaration.model.keys.BrouillonArticleDlppKey;

@Entity
@Table(name = "BROUILLONARTICLEDLPP")
@IdClass(BrouillonArticleDlppKey.class)
@NamedQueries({
	@NamedQuery(name = "findAllArticleDlpp", 
			query = "select object(o) from BrouillonArticleDlpp o where o.dlppAnneeDlpp = ?1 and  o.dlppCodePpmDeclarant = ?2 " +
					"and  o.dlppNumRepertoire = ?3")
})
public class BrouillonArticleDlpp implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 313393978682491571L;


		@Id 
		@Column(name = "DLPPANNEEDLPP" , length = 4, nullable = false)
		private String dlppAnneeDlpp;

		@Id
		@Column(name = "DLPPCODEPPMDECLARANT" , length = 5, nullable = false)
		 private String dlppCodePpmDeclarant;

		@Id
		@Column(name = "DLPPNUMREPERTOIRE" ,length = 6, nullable = false)
		private String dlppNumRepertoire;
		
		@Id
		@Column(name = "DLPPNUMARTICLE" , nullable = false)
		private java.lang.Integer dlppNumArticle;

		@Column(name = "DLPPREGFISCAL" ,  length = 2)
		private String dlppRegFiscal;

		@Column(name = "DLPPNUMARTMANIF")
		private Integer dlppNumArtManif;

		@Column(name = "DLPPPRECARTMANIF")
		private Integer dlppPrecArtManif;

		@Column(name = "DLPPPRECARTMANIF2")
		private Integer dlppPrecArtManif2;

		@Column(name = "DLPPCODEPROD" , length = 6)
		private String dlppCodeProd;

		@Column(name = "DLPPPRECUEMOA" , length = 2)
		 private String dlppPrecUemoa;

		@Column(name = "DLPPPRECSENEGAL" , length = 2)
		private String dlppPrecSenegal;

		@Column(name = "DLPPPDBRUT" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppPdBrut;

		@Column(name = "DLPPPDNET" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppPdNet;

		@Column(name = "DLPPQTECOMPL", columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppQteCompl;

		@Column(name = "DLPPUNITECOMPL" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppUniteCompl;

		@Column(name = "DLPPPAYSORIG" , length = 3)
		private String dlppPaysOrig;

		@Column(name = "DLPPVALDOUA" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppValDoua;

		@Column(name = "DLPPTICKETCPTEUR" , length = 10)
		 private String dlppTicketCpteur;

		@Column(name = "DLPPTPSAMBIANT" , length = 3)
		private java.lang.String dlppTpsAmbiant;

		@Column(name = "DLPPVOLAMBIANT" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppVolAmbiant;;

		@Column(name = "DLPPVOLA15" , columnDefinition = "DECIMAL(11,0)")
		 private BigDecimal dlppVolA15;

		@Column(name = "DLPPMASSVOL15" , columnDefinition = "DECIMAL(11,0)")
		private BigDecimal dlppMassVol15;

		@Column(name = "DLPPCODEDEPOT" , length = 10)
		private String dlppCodeDepot;

		@Column(name = "DLLPPDATELIVRAISON")
		 private Date dllppDateLivraison;

		@Column(name = "DLPPDELAILIVRAISON")
		private Integer dlppDelaiLivraison;

		@Column(name = "DLLPPCODEBAC" , length = 10)
		private String dllppCodeBac;
		
		@ManyToOne(targetEntity = BrouillonSegGenDlpp.class)
		@JoinColumns(value = {
			@JoinColumn(name="DLPPANNEEDLPP", referencedColumnName ="DLPPANNEEDLPP" , insertable = false, updatable = false),
			@JoinColumn(name="DLPPCODEPPMDECLARANT", referencedColumnName ="DLPPCODEPPMDECLARANT" , insertable = false, updatable = false),
			@JoinColumn(name="DLPPNUMREPERTOIRE", referencedColumnName ="DLPPNUMREPERTOIRE" , insertable = false, updatable = false)
			
		})
		private BrouillonSegGenDlpp brouillonSegGenDlpp;
		
		@OneToMany(mappedBy = "brouillonArticleDlpp" , targetEntity = BrouillonBacArtDlpp.class)
		private List<BrouillonBacArtDlpp> listeBrouillonBacArtDlpp;
		/**
		 * 
		 */
		public BrouillonArticleDlpp() {
			super();
			// TODO Auto-generated constructor stub
		}
		/**
		 * @param dlppAnneeDlpp
		 * @param dlppCodePpmDeclarant
		 * @param dlppNumRepertoire
		 * @param dlppNumArticle
		 */
		public BrouillonArticleDlpp(String dlppAnneeDlpp,
				String dlppCodePpmDeclarant, String dlppNumRepertoire,
				Integer dlppNumArticle) {
			super();
			this.dlppAnneeDlpp = dlppAnneeDlpp;
			this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
			this.dlppNumRepertoire = dlppNumRepertoire;
			this.dlppNumArticle = dlppNumArticle;
		}
		/**
		 * @return the dlppAnneeDlpp
		 */
		public String getDlppAnneeDlpp() {
			return dlppAnneeDlpp;
		}
		/**
		 * @param dlppAnneeDlpp the dlppAnneeDlpp to set
		 */
		public void setDlppAnneeDlpp(String dlppAnneeDlpp) {
			this.dlppAnneeDlpp = dlppAnneeDlpp;
		}
		/**
		 * @return the dlppCodePpmDeclarant
		 */
		public String getDlppCodePpmDeclarant() {
			return dlppCodePpmDeclarant;
		}
		/**
		 * @param dlppCodePpmDeclarant the dlppCodePpmDeclarant to set
		 */
		public void setDlppCodePpmDeclarant(String dlppCodePpmDeclarant) {
			this.dlppCodePpmDeclarant = dlppCodePpmDeclarant;
		}
		/**
		 * @return the dlppNumRepertoire
		 */
		public String getDlppNumRepertoire() {
			return dlppNumRepertoire;
		}
		/**
		 * @param dlppNumRepertoire the dlppNumRepertoire to set
		 */
		public void setDlppNumRepertoire(String dlppNumRepertoire) {
			this.dlppNumRepertoire = dlppNumRepertoire;
		}
		/**
		 * @return the dlppNumArticle
		 */
		public java.lang.Integer getDlppNumArticle() {
			return dlppNumArticle;
		}
		/**
		 * @param dlppNumArticle the dlppNumArticle to set
		 */
		public void setDlppNumArticle(java.lang.Integer dlppNumArticle) {
			this.dlppNumArticle = dlppNumArticle;
		}
		/**
		 * @return the dlppRegFiscal
		 */
		public String getDlppRegFiscal() {
			return dlppRegFiscal;
		}
		/**
		 * @param dlppRegFiscal the dlppRegFiscal to set
		 */
		public void setDlppRegFiscal(String dlppRegFiscal) {
			this.dlppRegFiscal = dlppRegFiscal;
		}
		/**
		 * @return the dlppNumArtManif
		 */
		public Integer getDlppNumArtManif() {
			return dlppNumArtManif;
		}
		/**
		 * @param dlppNumArtManif the dlppNumArtManif to set
		 */
		public void setDlppNumArtManif(Integer dlppNumArtManif) {
			this.dlppNumArtManif = dlppNumArtManif;
		}
		/**
		 * @return the dlppPrecArtManif
		 */
		public Integer getDlppPrecArtManif() {
			return dlppPrecArtManif;
		}
		/**
		 * @param dlppPrecArtManif the dlppPrecArtManif to set
		 */
		public void setDlppPrecArtManif(Integer dlppPrecArtManif) {
			this.dlppPrecArtManif = dlppPrecArtManif;
		}
		/**
		 * @return the dlppPrecArtManif2
		 */
		public Integer getDlppPrecArtManif2() {
			return dlppPrecArtManif2;
		}
		/**
		 * @param dlppPrecArtManif2 the dlppPrecArtManif2 to set
		 */
		public void setDlppPrecArtManif2(Integer dlppPrecArtManif2) {
			this.dlppPrecArtManif2 = dlppPrecArtManif2;
		}
		/**
		 * @return the dlppCodeProd
		 */
		public String getDlppCodeProd() {
			return dlppCodeProd;
		}
		/**
		 * @param dlppCodeProd the dlppCodeProd to set
		 */
		public void setDlppCodeProd(String dlppCodeProd) {
			this.dlppCodeProd = dlppCodeProd;
		}
		/**
		 * @return the dlppPrecUemoa
		 */
		public String getDlppPrecUemoa() {
			return dlppPrecUemoa;
		}
		/**
		 * @param dlppPrecUemoa the dlppPrecUemoa to set
		 */
		public void setDlppPrecUemoa(String dlppPrecUemoa) {
			this.dlppPrecUemoa = dlppPrecUemoa;
		}
		/**
		 * @return the dlppPrecSenegal
		 */
		public String getDlppPrecSenegal() {
			return dlppPrecSenegal;
		}
		/**
		 * @param dlppPrecSenegal the dlppPrecSenegal to set
		 */
		public void setDlppPrecSenegal(String dlppPrecSenegal) {
			this.dlppPrecSenegal = dlppPrecSenegal;
		}
		/**
		 * @return the dlppPdBrut
		 */
		public BigDecimal getDlppPdBrut() {
			return dlppPdBrut;
		}
		/**
		 * @param dlppPdBrut the dlppPdBrut to set
		 */
		public void setDlppPdBrut(BigDecimal dlppPdBrut) {
			this.dlppPdBrut = dlppPdBrut;
		}
		/**
		 * @return the dlppPdNet
		 */
		public BigDecimal getDlppPdNet() {
			return dlppPdNet;
		}
		/**
		 * @param dlppPdNet the dlppPdNet to set
		 */
		public void setDlppPdNet(BigDecimal dlppPdNet) {
			this.dlppPdNet = dlppPdNet;
		}
		/**
		 * @return the dlppQteCompl
		 */
		public BigDecimal getDlppQteCompl() {
			return dlppQteCompl;
		}
		/**
		 * @param dlppQteCompl the dlppQteCompl to set
		 */
		public void setDlppQteCompl(BigDecimal dlppQteCompl) {
			this.dlppQteCompl = dlppQteCompl;
		}
		/**
		 * @return the dlppUniteCompl
		 */
		public BigDecimal getDlppUniteCompl() {
			return dlppUniteCompl;
		}
		/**
		 * @param dlppUniteCompl the dlppUniteCompl to set
		 */
		public void setDlppUniteCompl(BigDecimal dlppUniteCompl) {
			this.dlppUniteCompl = dlppUniteCompl;
		}
		/**
		 * @return the dlppPaysOrig
		 */
		public String getDlppPaysOrig() {
			return dlppPaysOrig;
		}
		/**
		 * @param dlppPaysOrig the dlppPaysOrig to set
		 */
		public void setDlppPaysOrig(String dlppPaysOrig) {
			this.dlppPaysOrig = dlppPaysOrig;
		}
		/**
		 * @return the dlppValDoua
		 */
		public BigDecimal getDlppValDoua() {
			return dlppValDoua;
		}
		/**
		 * @param dlppValDoua the dlppValDoua to set
		 */
		public void setDlppValDoua(BigDecimal dlppValDoua) {
			this.dlppValDoua = dlppValDoua;
		}
		/**
		 * @return the dlppTicketCpteur
		 */
		public String getDlppTicketCpteur() {
			return dlppTicketCpteur;
		}
		/**
		 * @param dlppTicketCpteur the dlppTicketCpteur to set
		 */
		public void setDlppTicketCpteur(String dlppTicketCpteur) {
			this.dlppTicketCpteur = dlppTicketCpteur;
		}
		/**
		 * @return the dlppTpsAmbiant
		 */
		public java.lang.String getDlppTpsAmbiant() {
			return dlppTpsAmbiant;
		}
		/**
		 * @param dlppTpsAmbiant the dlppTpsAmbiant to set
		 */
		public void setDlppTpsAmbiant(java.lang.String dlppTpsAmbiant) {
			this.dlppTpsAmbiant = dlppTpsAmbiant;
		}
		/**
		 * @return the dlppVolAmbiant
		 */
		public BigDecimal getDlppVolAmbiant() {
			return dlppVolAmbiant;
		}
		/**
		 * @param dlppVolAmbiant the dlppVolAmbiant to set
		 */
		public void setDlppVolAmbiant(BigDecimal dlppVolAmbiant) {
			this.dlppVolAmbiant = dlppVolAmbiant;
		}
		/**
		 * @return the dlppVolA15
		 */
		public BigDecimal getDlppVolA15() {
			return dlppVolA15;
		}
		/**
		 * @param dlppVolA15 the dlppVolA15 to set
		 */
		public void setDlppVolA15(BigDecimal dlppVolA15) {
			this.dlppVolA15 = dlppVolA15;
		}
		/**
		 * @return the dlppMassVol15
		 */
		public BigDecimal getDlppMassVol15() {
			return dlppMassVol15;
		}
		/**
		 * @param dlppMassVol15 the dlppMassVol15 to set
		 */
		public void setDlppMassVol15(BigDecimal dlppMassVol15) {
			this.dlppMassVol15 = dlppMassVol15;
		}
		/**
		 * @return the dlppCodeDepot
		 */
		public String getDlppCodeDepot() {
			return dlppCodeDepot;
		}
		/**
		 * @param dlppCodeDepot the dlppCodeDepot to set
		 */
		public void setDlppCodeDepot(String dlppCodeDepot) {
			this.dlppCodeDepot = dlppCodeDepot;
		}
		/**
		 * @return the dllppDateLivraison
		 */
		public Date getDllppDateLivraison() {
			return dllppDateLivraison;
		}
		/**
		 * @param dllppDateLivraison the dllppDateLivraison to set
		 */
		public void setDllppDateLivraison(Date dllppDateLivraison) {
			this.dllppDateLivraison = dllppDateLivraison;
		}
		/**
		 * @return the dlppDelaiLivraison
		 */
		public Integer getDlppDelaiLivraison() {
			return dlppDelaiLivraison;
		}
		/**
		 * @param dlppDelaiLivraison the dlppDelaiLivraison to set
		 */
		public void setDlppDelaiLivraison(Integer dlppDelaiLivraison) {
			this.dlppDelaiLivraison = dlppDelaiLivraison;
		}
		/**
		 * @return the dllppCodeBac
		 */
		public String getDllppCodeBac() {
			return dllppCodeBac;
		}
		/**
		 * @param dllppCodeBac the dllppCodeBac to set
		 */
		public void setDllppCodeBac(String dllppCodeBac) {
			this.dllppCodeBac = dllppCodeBac;
		}
		/**
		 * @return the brouillonSegGenDlpp
		 */
		public BrouillonSegGenDlpp getBrouillonSegGenDlpp() {
			return brouillonSegGenDlpp;
		}
		/**
		 * @param brouillonSegGenDlpp the brouillonSegGenDlpp to set
		 */
		public void setBrouillonSegGenDlpp(BrouillonSegGenDlpp brouillonSegGenDlpp) {
			this.brouillonSegGenDlpp = brouillonSegGenDlpp;
		}
		/**
		 * @return the listeBrouillonBacArtDlpp
		 */
		public List<BrouillonBacArtDlpp> getListeBrouillonBacArtDlpp() {
			return listeBrouillonBacArtDlpp;
		}
		/**
		 * @param listeBrouillonBacArtDlpp the listeBrouillonBacArtDlpp to set
		 */
		public void setListeBrouillonBacArtDlpp(
				List<BrouillonBacArtDlpp> listeBrouillonBacArtDlpp) {
			this.listeBrouillonBacArtDlpp = listeBrouillonBacArtDlpp;
		}

	
}