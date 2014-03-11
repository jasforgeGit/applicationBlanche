/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.manifeste.model.keys.DdeDestArtManKey;



/**
 * @author CGPID
 *
 */

@Entity
@IdClass(DdeDestArtManKey.class)
@Table(name="DDEDESTARTMAN")
public class DdeDestArtMan implements Serializable{
	
	   /**
	 * 
	 */
	private static final long serialVersionUID = 5338472388036656582L;

	@Column(name="MANIFAGENTDESTRUC", length=4)
	    private java.lang.String manifAgentDestruc;
	    
	   @Column(name="MANIFANNEEDDEDEST", length=4)
	    private java.lang.String manifAnneeDdeDest;
	    
	   @Column(name="MANIFANNEEDEPOT", length=4)
	    private java.lang.String manifAnneeDepot;
	    
	   @Column(name="MANIFCODEABONEMETMSG", length=8)
	    private java.lang.String manifCodeAbonEmetMsg;
	    
	   @Column(name="MANIFCODECONSIGN", length=3)
	    private java.lang.String manifCodeConsign;
	    
	   @Column(name="MANIFLIEUEMB", length=5)
	    private java.lang.String manifLieuEmb;
	    
	   @Column(name="MANIFNBRECOLISDETRUI")
	    private java.lang.Integer manifNbreColisDetrui;
	    
	   @Column(name="MANIFNBREDESTRUC")
	    private java.lang.Integer manifNbreDestruc;
	    
	   @Column(name="MANIFNUMDDEDEST", columnDefinition="DECIMAL(18 , 0)")
	    private java.math.BigDecimal manifNumDdeDest;
	    
	   @Column(name="MANIFNUMDESTDEF", columnDefinition="DECIMAL(18 , 0)")
	    private java.math.BigDecimal manifNumDestDef;
	    
	   @Column(name="MANIFNUMDESTDEF2", columnDefinition="DECIMAL(18 , 0)")
	    private java.math.BigDecimal manifNumDestDef2;
	    
	    @Column(name="MANIFNUMMSG")
	    private java.lang.Integer manifNumMsg;
	    
	    @Column(name="MANIFNUMTITRETRANS", length=12)
	    private java.lang.String manifNumTitreTrans;
	    
	    @Column(name="MANIFPOIDSDETRUIT", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPoidsDetruit;
	    
	    @Column(name="MANIFTYPEDEST", length=5)
	    private java.lang.String manifTypeDest;
	    
	    @Column(name="MANIFUSERVALDEST", length=15)
	    private java.lang.String manifUserValDest;
	    
	    @Id
	    @Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
	    private java.lang.String manifBureauEngManif;
	    
	    @Id
	    @Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
	    private java.lang.String manifAnneeEngManif;
	    
	    @Id
	    @Column(name="MANIFNUMENREGMANIF", nullable=false)
	    private java.lang.Integer manifNumEnregManif;
	    
	    @Id
	    @Column(name="MANIFNUMARTMANIF", nullable=false)
	    private java.lang.Integer manifNumArticleManif;
	    
	    @Id
	    @Column(name="MANIFPRECARTMANIF", nullable=false)
	    private java.lang.Integer manifPrecisArtManif;
	    
	    @Id
	    @Column(name="MANIFPRECARTMANIF2", nullable=false)
	    private java.lang.Integer manifPrecisArtManif2;   
	    
	    @ManyToOne(targetEntity = ArticleManifeste.class)
	    @JoinColumns( {
	    	@JoinColumn(name="MANIFBURENREGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
	  	  @JoinColumn(name="MANIFANNEEENREGMANIF", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMARTMANIF", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECARTMANIF", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECARTMANIF2", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
	  	  })
		private ArticleManifeste articleManifeste;
	    
	    
	    @Transient
	    private String apurementComptable; 
	    /**
		 * 
		 */
		public DdeDestArtMan() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param manifAgentDestruc
		 * @param manifAnneeDdeDest
		 * @param manifAnneeDepot
		 * @param manifCodeAbonEmetMsg
		 * @param manifCodeConsign
		 * @param manifLieuEmb
		 * @param manifNbreColisDetrui
		 * @param manifNbreDestruc
		 * @param manifNumDdeDest
		 * @param manifNumDestDef
		 * @param manifNumDestDef2
		 * @param manifNumMsg
		 * @param manifNumTitreTrans
		 * @param manifPoidsDetruit
		 * @param manifTypeDest
		 * @param manifUserValDest
		 * @param manifBureauEngManif
		 * @param manifAnneeEngManif
		 * @param manifNumEnregManif
		 * @param manifNumArticleManif
		 * @param manifPrecisArtManif
		 * @param manifPrecisArtManif2
		 */
		public DdeDestArtMan(String manifAgentDestruc,
				String manifAnneeDdeDest, String manifAnneeDepot,
				String manifCodeAbonEmetMsg, String manifCodeConsign,
				String manifLieuEmb, Integer manifNbreColisDetrui,
				Integer manifNbreDestruc, BigDecimal manifNumDdeDest,
				BigDecimal manifNumDestDef, BigDecimal manifNumDestDef2,
				Integer manifNumMsg, String manifNumTitreTrans,
				BigDecimal manifPoidsDetruit, String manifTypeDest,
				String manifUserValDest, String manifBureauEngManif,
				String manifAnneeEngManif, Integer manifNumEnregManif,
				Integer manifNumArticleManif, Integer manifPrecisArtManif,
				Integer manifPrecisArtManif2) {
			super();
			this.manifAgentDestruc = manifAgentDestruc;
			this.manifAnneeDdeDest = manifAnneeDdeDest;
			this.manifAnneeDepot = manifAnneeDepot;
			this.manifCodeAbonEmetMsg = manifCodeAbonEmetMsg;
			this.manifCodeConsign = manifCodeConsign;
			this.manifLieuEmb = manifLieuEmb;
			this.manifNbreColisDetrui = manifNbreColisDetrui;
			this.manifNbreDestruc = manifNbreDestruc;
			this.manifNumDdeDest = manifNumDdeDest;
			this.manifNumDestDef = manifNumDestDef;
			this.manifNumDestDef2 = manifNumDestDef2;
			this.manifNumMsg = manifNumMsg;
			this.manifNumTitreTrans = manifNumTitreTrans;
			this.manifPoidsDetruit = manifPoidsDetruit;
			this.manifTypeDest = manifTypeDest;
			this.manifUserValDest = manifUserValDest;
			this.manifBureauEngManif = manifBureauEngManif;
			this.manifAnneeEngManif = manifAnneeEngManif;
			this.manifNumEnregManif = manifNumEnregManif;
			this.manifNumArticleManif = manifNumArticleManif;
			this.manifPrecisArtManif = manifPrecisArtManif;
			this.manifPrecisArtManif2 = manifPrecisArtManif2;
		}

		/**
		 * @return the manifAgentDestruc
		 */
		public java.lang.String getManifAgentDestruc() {
			return manifAgentDestruc;
		}

		/**
		 * @param manifAgentDestruc the manifAgentDestruc to set
		 */
		public void setManifAgentDestruc(java.lang.String manifAgentDestruc) {
			this.manifAgentDestruc = manifAgentDestruc;
		}

		/**
		 * @return the manifAnneeDdeDest
		 */
		public java.lang.String getManifAnneeDdeDest() {
			return manifAnneeDdeDest;
		}

		/**
		 * @param manifAnneeDdeDest the manifAnneeDdeDest to set
		 */
		public void setManifAnneeDdeDest(java.lang.String manifAnneeDdeDest) {
			this.manifAnneeDdeDest = manifAnneeDdeDest;
		}

		/**
		 * @return the manifAnneeDepot
		 */
		public java.lang.String getManifAnneeDepot() {
			return manifAnneeDepot;
		}

		/**
		 * @param manifAnneeDepot the manifAnneeDepot to set
		 */
		public void setManifAnneeDepot(java.lang.String manifAnneeDepot) {
			this.manifAnneeDepot = manifAnneeDepot;
		}

		/**
		 * @return the manifCodeAbonEmetMsg
		 */
		public java.lang.String getManifCodeAbonEmetMsg() {
			return manifCodeAbonEmetMsg;
		}

		/**
		 * @param manifCodeAbonEmetMsg the manifCodeAbonEmetMsg to set
		 */
		public void setManifCodeAbonEmetMsg(java.lang.String manifCodeAbonEmetMsg) {
			this.manifCodeAbonEmetMsg = manifCodeAbonEmetMsg;
		}

		/**
		 * @return the manifCodeConsign
		 */
		public java.lang.String getManifCodeConsign() {
			return manifCodeConsign;
		}

		/**
		 * @param manifCodeConsign the manifCodeConsign to set
		 */
		public void setManifCodeConsign(java.lang.String manifCodeConsign) {
			this.manifCodeConsign = manifCodeConsign;
		}

		/**
		 * @return the manifLieuEmb
		 */
		public java.lang.String getManifLieuEmb() {
			return manifLieuEmb;
		}

		/**
		 * @param manifLieuEmb the manifLieuEmb to set
		 */
		public void setManifLieuEmb(java.lang.String manifLieuEmb) {
			this.manifLieuEmb = manifLieuEmb;
		}

		/**
		 * @return the manifNbreColisDetrui
		 */
		public java.lang.Integer getManifNbreColisDetrui() {
			return manifNbreColisDetrui;
		}

		/**
		 * @param manifNbreColisDetrui the manifNbreColisDetrui to set
		 */
		public void setManifNbreColisDetrui(java.lang.Integer manifNbreColisDetrui) {
			this.manifNbreColisDetrui = manifNbreColisDetrui;
		}

		/**
		 * @return the manifNbreDestruc
		 */
		public java.lang.Integer getManifNbreDestruc() {
			return manifNbreDestruc;
		}

		/**
		 * @param manifNbreDestruc the manifNbreDestruc to set
		 */
		public void setManifNbreDestruc(java.lang.Integer manifNbreDestruc) {
			this.manifNbreDestruc = manifNbreDestruc;
		}

		/**
		 * @return the manifNumDdeDest
		 */
		public java.math.BigDecimal getManifNumDdeDest() {
			return manifNumDdeDest;
		}

		/**
		 * @param manifNumDdeDest the manifNumDdeDest to set
		 */
		public void setManifNumDdeDest(java.math.BigDecimal manifNumDdeDest) {
			this.manifNumDdeDest = manifNumDdeDest;
		}

		/**
		 * @return the manifNumDestDef
		 */
		public java.math.BigDecimal getManifNumDestDef() {
			return manifNumDestDef;
		}

		/**
		 * @param manifNumDestDef the manifNumDestDef to set
		 */
		public void setManifNumDestDef(java.math.BigDecimal manifNumDestDef) {
			this.manifNumDestDef = manifNumDestDef;
		}

		/**
		 * @return the manifNumDestDef2
		 */
		public java.math.BigDecimal getManifNumDestDef2() {
			return manifNumDestDef2;
		}

		/**
		 * @param manifNumDestDef2 the manifNumDestDef2 to set
		 */
		public void setManifNumDestDef2(java.math.BigDecimal manifNumDestDef2) {
			this.manifNumDestDef2 = manifNumDestDef2;
		}

		/**
		 * @return the manifNumMsg
		 */
		public java.lang.Integer getManifNumMsg() {
			return manifNumMsg;
		}

		/**
		 * @param manifNumMsg the manifNumMsg to set
		 */
		public void setManifNumMsg(java.lang.Integer manifNumMsg) {
			this.manifNumMsg = manifNumMsg;
		}

		/**
		 * @return the manifNumTitreTrans
		 */
		public java.lang.String getManifNumTitreTrans() {
			return manifNumTitreTrans;
		}

		/**
		 * @param manifNumTitreTrans the manifNumTitreTrans to set
		 */
		public void setManifNumTitreTrans(java.lang.String manifNumTitreTrans) {
			this.manifNumTitreTrans = manifNumTitreTrans;
		}

		/**
		 * @return the manifPoidsDetruit
		 */
		public java.math.BigDecimal getManifPoidsDetruit() {
			return manifPoidsDetruit;
		}

		/**
		 * @param manifPoidsDetruit the manifPoidsDetruit to set
		 */
		public void setManifPoidsDetruit(java.math.BigDecimal manifPoidsDetruit) {
			this.manifPoidsDetruit = manifPoidsDetruit;
		}

		/**
		 * @return the manifTypeDest
		 */
		public java.lang.String getManifTypeDest() {
			return manifTypeDest;
		}

		/**
		 * @param manifTypeDest the manifTypeDest to set
		 */
		public void setManifTypeDest(java.lang.String manifTypeDest) {
			this.manifTypeDest = manifTypeDest;
		}

		/**
		 * @return the manifUserValDest
		 */
		public java.lang.String getManifUserValDest() {
			return manifUserValDest;
		}

		/**
		 * @param manifUserValDest the manifUserValDest to set
		 */
		public void setManifUserValDest(java.lang.String manifUserValDest) {
			this.manifUserValDest = manifUserValDest;
		}

		/**
		 * @return the manifBureauEngManif
		 */
		public java.lang.String getManifBureauEngManif() {
			return manifBureauEngManif;
		}

		/**
		 * @param manifBureauEngManif the manifBureauEngManif to set
		 */
		public void setManifBureauEngManif(java.lang.String manifBureauEngManif) {
			this.manifBureauEngManif = manifBureauEngManif;
		}

		/**
		 * @return the manifAnneeEngManif
		 */
		public java.lang.String getManifAnneeEngManif() {
			return manifAnneeEngManif;
		}

		/**
		 * @param manifAnneeEngManif the manifAnneeEngManif to set
		 */
		public void setManifAnneeEngManif(java.lang.String manifAnneeEngManif) {
			this.manifAnneeEngManif = manifAnneeEngManif;
		}

		/**
		 * @return the manifNumEnregManif
		 */
		public java.lang.Integer getManifNumEnregManif() {
			return manifNumEnregManif;
		}

		/**
		 * @param manifNumEnregManif the manifNumEnregManif to set
		 */
		public void setManifNumEnregManif(java.lang.Integer manifNumEnregManif) {
			this.manifNumEnregManif = manifNumEnregManif;
		}

		/**
		 * @return the manifNumArticleManif
		 */
		public java.lang.Integer getManifNumArticleManif() {
			return manifNumArticleManif;
		}

		/**
		 * @param manifNumArticleManif the manifNumArticleManif to set
		 */
		public void setManifNumArticleManif(java.lang.Integer manifNumArticleManif) {
			this.manifNumArticleManif = manifNumArticleManif;
		}

		/**
		 * @return the manifPrecisArtManif
		 */
		public java.lang.Integer getManifPrecisArtManif() {
			return manifPrecisArtManif;
		}

		/**
		 * @param manifPrecisArtManif the manifPrecisArtManif to set
		 */
		public void setManifPrecisArtManif(java.lang.Integer manifPrecisArtManif) {
			this.manifPrecisArtManif = manifPrecisArtManif;
		}

		/**
		 * @return the manifPrecisArtManif2
		 */
		public java.lang.Integer getManifPrecisArtManif2() {
			return manifPrecisArtManif2;
		}

		/**
		 * @param manifPrecisArtManif2 the manifPrecisArtManif2 to set
		 */
		public void setManifPrecisArtManif2(java.lang.Integer manifPrecisArtManif2) {
			this.manifPrecisArtManif2 = manifPrecisArtManif2;
		}

		/**
		 * @return the articleManifeste
		 */
		public ArticleManifeste getArticleManifeste() {
			return articleManifeste;
		}

		/**
		 * @param articleManifeste the articleManifeste to set
		 */
		public void setArticleManifeste(ArticleManifeste articleManifeste) {
			this.articleManifeste = articleManifeste;
		}

		public String getApurementComptable() {
			return apurementComptable;
		}

		public void setApurementComptable(String apurementComptable) {
			this.apurementComptable = apurementComptable;
		}

        


}
