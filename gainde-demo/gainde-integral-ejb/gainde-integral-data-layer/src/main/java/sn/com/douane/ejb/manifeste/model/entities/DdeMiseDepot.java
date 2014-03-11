/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.DdeMiseDepotKey;



/**
 * @author CGPID
 *
 */

@Entity
@IdClass(DdeMiseDepotKey.class)
@NamedQueries({
@NamedQuery(name = "findDemandeMiseDepotOfArticleManifeste", 
			query = "select object(o) from DdeMiseDepot o where o.manifBurEnregManif = ?1 " +
					"and o.manifAnneeEnreg = ?2 and o.manifNumEnregManif = ?3 and o.manifNumArtManif = ?4 " +
					"and o.manifPrecArtMan = ?5 and o.manifPrecArtMan2 = ?6")
})
@Table(name="DDEMISEDEPOT")				
public class DdeMiseDepot implements Serializable{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6566040191797627601L;

		@Id
	    @Column(name="MANIFANNEEDDEDEPOT", length=4, nullable=false)
	    private java.lang.String manifAnneeDdeDepot;
	 
	    @Id
	    @Column(name="MANIFBURDDEDEPOT", length=3, nullable=false)
	    private java.lang.String manifBurDdeDepot;
	    
	    @Id
	    @Column(name="MANIFNUMDDEDEPOT", nullable=false)
	    private java.lang.Integer manifNumDdeDepot;
	   
	    @Column(name="MANIFCODECONSIG", length=3)
	    private java.lang.String manifCodeConsig;
	    
	    @Column(name="MANIFANNEEENREG",length = 4)
	    private java.lang.String manifAnneeEnreg;
	    
	    @Column(name="MANIFBURENREGMANIF",length = 3)
	    private java.lang.String manifBurEnregManif;
	    
	    @Column(name="MANIFNUMENREGMANIF")
	    private java.lang.Integer manifNumEnregManif;
	    
	    @Column(name="MANIFNUMARTMAN")
	    private java.lang.Integer manifNumArtManif;
	    
	    @Column(name="MANIFPRECARTMAN")
	    private java.lang.Integer manifPrecArtMan;
	    
	    @Column(name="MANIFPRECARTMAN2")
	    private java.lang.Integer manifPrecArtMan2;
	    
	    @Column(name="MANIFBPDEST", length=50)
	    private java.lang.String manifBpDest;
	    
	    @Column(name="MANIFMARQCOLIS")
	    private java.lang.String manifMarqColis;
	    
	    @Column(name="MANIFDESIGCOMM")
	    private java.lang.String manifDesigComm;
	    
	    @Column(name="MANIFDATEMISEDEPOT")
	    private java.sql.Date manifDateMiseDepot;
	    
	    @Column(name="MANIFCODERAISONSTK", length=1)
	    private java.lang.String manifCodeRaisonStk;
	    
	    @Column(name="MANIFCODELIEUSTK", length=3)
	    private java.lang.String manifCodeLieuStk;
	    
	    @Column(name="MANIFMODECOND", length=4)
	    private java.lang.String manifModeCond;
	    
	    @Column(name="MANIFNUMVOIEDEST", length=5)
	    private java.lang.String manifnumvoiedest;
	    
	    @Column(name="MANIFCODEDEST", length=5)
	    private java.lang.String manifCodeDest;
	    
	    @Column(name="MANIFTYPEVOIEDEST", length=60)
	    private java.lang.String manifTypeVoieDest;
	    
	    @Column(name="MANIFNBRECOLISDECL")
	    private java.lang.Integer manifNbreColisDecl;
	    
	    @Column(name="MANIFVILLEDEST", length=50)
	    private java.lang.String manifVilleDest;
	    
	    @Column(name="MANIFNOMDEST")
	    private java.lang.String manifNomDest;
	    
	    @Column(name="MANIFNOMVOIEDEST", length=60)
	    private java.lang.String manifNomVoieDest;
	    
	    @Column(name="MANIFQTIERDEST", length=50)
	    private java.lang.String manifQtierDest;
	    
	    @Column(name="MANIFPDBRUTAPUREMENT", columnDefinition="DECIMAL(9 , 0)")
	    private java.math.BigDecimal manifPdBrutApurement;
	    
	    @Column(name="MANIFTITRETRANS", length=12)
	    private java.lang.String manifTitreTrans;
	    
	    @Column(name="MANIFANNEEDECL", length=4)
	    private java.lang.String manifAnneeDecl;
	    
	    @Column(name="MANIFBURDECL", length=3)
	    private java.lang.String manifBurDecl;
	    
	    @Column(name="MANIFNUMDECL")
	    private java.lang.Integer manifNumDecl;
	    
	    @Column(name="MANIFNUMMESSAGE")
	    private java.lang.Integer manifNumMessage;
	    
	    @ManyToOne(targetEntity = ArticleManifeste.class)
	    @JoinColumns( {
	    	@JoinColumn(name="MANIFBURENREGMANIF", referencedColumnName="MANIFBUREAUENGMANIF", insertable=false, updatable=false), 
	  	  @JoinColumn(name="MANIFANNEEENREG", referencedColumnName="MANIFANNEEENGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFNUMARTMAN", referencedColumnName="MANIFNUMARTICLEMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECARTMAN", referencedColumnName="MANIFPRECISARTMANIF", insertable=false, updatable=false),
	  	  @JoinColumn(name="MANIFPRECARTMAN2", referencedColumnName="MANIFPRECISARTMANIF2", insertable=false, updatable=false)
	  	  	})	    
	    private ArticleManifeste articleManifeste;
	    
	  
		/**
		 * 
		 */
		public DdeMiseDepot() {
			super();			
		}

		/**
		 * @return the manifAnneeDdeDepot
		 */
		public java.lang.String getManifAnneeDdeDepot() {
			return manifAnneeDdeDepot;
		}

		/**
		 * @param manifAnneeDdeDepot the manifAnneeDdeDepot to set
		 */
		public void setManifAnneeDdeDepot(java.lang.String manifAnneeDdeDepot) {
			this.manifAnneeDdeDepot = manifAnneeDdeDepot;
		}

		/**
		 * @return the manifBurDdeDepot
		 */
		public java.lang.String getManifBurDdeDepot() {
			return manifBurDdeDepot;
		}

		/**
		 * @param manifBurDdeDepot the manifBurDdeDepot to set
		 */
		public void setManifBurDdeDepot(java.lang.String manifBurDdeDepot) {
			this.manifBurDdeDepot = manifBurDdeDepot;
		}

		/**
		 * @return the manifNumDdeDepot
		 */
		public java.lang.Integer getManifNumDdeDepot() {
			return manifNumDdeDepot;
		}

		/**
		 * @param manifNumDdeDepot the manifNumDdeDepot to set
		 */
		public void setManifNumDdeDepot(java.lang.Integer manifNumDdeDepot) {
			this.manifNumDdeDepot = manifNumDdeDepot;
		}

		/**
		 * @return the manifCodeConsig
		 */
		public java.lang.String getManifCodeConsig() {
			return manifCodeConsig;
		}

		/**
		 * @param manifCodeConsig the manifCodeConsig to set
		 */
		public void setManifCodeConsig(java.lang.String manifCodeConsig) {
			this.manifCodeConsig = manifCodeConsig;
		}

		/**
		 * @return the manifAnneeEnreg
		 */
		public java.lang.String getManifAnneeEnreg() {
			return manifAnneeEnreg;
		}

		/**
		 * @param manifAnneeEnreg the manifAnneeEnreg to set
		 */
		public void setManifAnneeEnreg(java.lang.String manifAnneeEnreg) {
			this.manifAnneeEnreg = manifAnneeEnreg;
		}

		/**
		 * @return the manifBurEnregManif
		 */
		public java.lang.String getManifBurEnregManif() {
			return manifBurEnregManif;
		}

		/**
		 * @param manifBurEnregManif the manifBurEnregManif to set
		 */
		public void setManifBurEnregManif(java.lang.String manifBurEnregManif) {
			this.manifBurEnregManif = manifBurEnregManif;
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
		 * @return the manifNumArtManif
		 */
		public java.lang.Integer getManifNumArtManif() {
			return manifNumArtManif;
		}

		/**
		 * @param manifNumArtManif the manifNumArtManif to set
		 */
		public void setManifNumArtManif(java.lang.Integer manifNumArtManif) {
			this.manifNumArtManif = manifNumArtManif;
		}

		/**
		 * @return the manifPrecArtMan
		 */
		public java.lang.Integer getManifPrecArtMan() {
			return manifPrecArtMan;
		}

		/**
		 * @param manifPrecArtMan the manifPrecArtMan to set
		 */
		public void setManifPrecArtMan(java.lang.Integer manifPrecArtMan) {
			this.manifPrecArtMan = manifPrecArtMan;
		}

		/**
		 * @return the manifPrecArtMan2
		 */
		public java.lang.Integer getManifPrecArtMan2() {
			return manifPrecArtMan2;
		}

		/**
		 * @param manifPrecArtMan2 the manifPrecArtMan2 to set
		 */
		public void setManifPrecArtMan2(java.lang.Integer manifPrecArtMan2) {
			this.manifPrecArtMan2 = manifPrecArtMan2;
		}

		/**
		 * @return the manifBpDest
		 */
		public java.lang.String getManifBpDest() {
			return manifBpDest;
		}

		/**
		 * @param manifBpDest the manifBpDest to set
		 */
		public void setManifBpDest(java.lang.String manifBpDest) {
			this.manifBpDest = manifBpDest;
		}

		/**
		 * @return the manifMarqColis
		 */
		public java.lang.String getManifMarqColis() {
			return manifMarqColis;
		}

		/**
		 * @param manifMarqColis the manifMarqColis to set
		 */
		public void setManifMarqColis(java.lang.String manifMarqColis) {
			this.manifMarqColis = manifMarqColis;
		}

		/**
		 * @return the manifDesigComm
		 */
		public java.lang.String getManifDesigComm() {
			return manifDesigComm;
		}

		/**
		 * @param manifDesigComm the manifDesigComm to set
		 */
		public void setManifDesigComm(java.lang.String manifDesigComm) {
			this.manifDesigComm = manifDesigComm;
		}

		/**
		 * @return the manifDateMiseDepot
		 */
		public java.sql.Date getManifDateMiseDepot() {
			return manifDateMiseDepot;
		}

		/**
		 * @param manifDateMiseDepot the manifDateMiseDepot to set
		 */
		public void setManifDateMiseDepot(java.sql.Date manifDateMiseDepot) {
			this.manifDateMiseDepot = manifDateMiseDepot;
		}

		/**
		 * @return the manifCodeRaisonStk
		 */
		public java.lang.String getManifCodeRaisonStk() {
			return manifCodeRaisonStk;
		}

		/**
		 * @param manifCodeRaisonStk the manifCodeRaisonStk to set
		 */
		public void setManifCodeRaisonStk(java.lang.String manifCodeRaisonStk) {
			this.manifCodeRaisonStk = manifCodeRaisonStk;
		}

		/**
		 * @return the manifCodeLieuStk
		 */
		public java.lang.String getManifCodeLieuStk() {
			return manifCodeLieuStk;
		}

		/**
		 * @param manifCodeLieuStk the manifCodeLieuStk to set
		 */
		public void setManifCodeLieuStk(java.lang.String manifCodeLieuStk) {
			this.manifCodeLieuStk = manifCodeLieuStk;
		}

		/**
		 * @return the manifModeCond
		 */
		public java.lang.String getManifModeCond() {
			return manifModeCond;
		}

		/**
		 * @param manifModeCond the manifModeCond to set
		 */
		public void setManifModeCond(java.lang.String manifModeCond) {
			this.manifModeCond = manifModeCond;
		}

		/**
		 * @return the manifnumvoiedest
		 */
		public java.lang.String getManifnumvoiedest() {
			return manifnumvoiedest;
		}

		/**
		 * @param manifnumvoiedest the manifnumvoiedest to set
		 */
		public void setManifnumvoiedest(java.lang.String manifnumvoiedest) {
			this.manifnumvoiedest = manifnumvoiedest;
		}

		/**
		 * @return the manifCodeDest
		 */
		public java.lang.String getManifCodeDest() {
			return manifCodeDest;
		}

		/**
		 * @param manifCodeDest the manifCodeDest to set
		 */
		public void setManifCodeDest(java.lang.String manifCodeDest) {
			this.manifCodeDest = manifCodeDest;
		}

		/**
		 * @return the manifTypeVoieDest
		 */
		public java.lang.String getManifTypeVoieDest() {
			return manifTypeVoieDest;
		}

		/**
		 * @param manifTypeVoieDest the manifTypeVoieDest to set
		 */
		public void setManifTypeVoieDest(java.lang.String manifTypeVoieDest) {
			this.manifTypeVoieDest = manifTypeVoieDest;
		}

		/**
		 * @return the manifNbreColisDecl
		 */
		public java.lang.Integer getManifNbreColisDecl() {
			return manifNbreColisDecl;
		}

		/**
		 * @param manifNbreColisDecl the manifNbreColisDecl to set
		 */
		public void setManifNbreColisDecl(java.lang.Integer manifNbreColisDecl) {
			this.manifNbreColisDecl = manifNbreColisDecl;
		}

		/**
		 * @return the manifVilleDest
		 */
		public java.lang.String getManifVilleDest() {
			return manifVilleDest;
		}

		/**
		 * @param manifVilleDest the manifVilleDest to set
		 */
		public void setManifVilleDest(java.lang.String manifVilleDest) {
			this.manifVilleDest = manifVilleDest;
		}

		/**
		 * @return the manifNomDest
		 */
		public java.lang.String getManifNomDest() {
			return manifNomDest;
		}

		/**
		 * @param manifNomDest the manifNomDest to set
		 */
		public void setManifNomDest(java.lang.String manifNomDest) {
			this.manifNomDest = manifNomDest;
		}

		/**
		 * @return the manifNomVoieDest
		 */
		public java.lang.String getManifNomVoieDest() {
			return manifNomVoieDest;
		}

		/**
		 * @param manifNomVoieDest the manifNomVoieDest to set
		 */
		public void setManifNomVoieDest(java.lang.String manifNomVoieDest) {
			this.manifNomVoieDest = manifNomVoieDest;
		}

		/**
		 * @return the manifQtierDest
		 */
		public java.lang.String getManifQtierDest() {
			return manifQtierDest;
		}

		/**
		 * @param manifQtierDest the manifQtierDest to set
		 */
		public void setManifQtierDest(java.lang.String manifQtierDest) {
			this.manifQtierDest = manifQtierDest;
		}

		/**
		 * @return the manifPdBrutApurement
		 */
		public java.math.BigDecimal getManifPdBrutApurement() {
			return manifPdBrutApurement;
		}

		/**
		 * @param manifPdBrutApurement the manifPdBrutApurement to set
		 */
		public void setManifPdBrutApurement(java.math.BigDecimal manifPdBrutApurement) {
			this.manifPdBrutApurement = manifPdBrutApurement;
		}

		/**
		 * @return the manifTitreTrans
		 */
		public java.lang.String getManifTitreTrans() {
			return manifTitreTrans;
		}

		/**
		 * @param manifTitreTrans the manifTitreTrans to set
		 */
		public void setManifTitreTrans(java.lang.String manifTitreTrans) {
			this.manifTitreTrans = manifTitreTrans;
		}

		/**
		 * @return the manifAnneeDecl
		 */
		public java.lang.String getManifAnneeDecl() {
			return manifAnneeDecl;
		}

		/**
		 * @param manifAnneeDecl the manifAnneeDecl to set
		 */
		public void setManifAnneeDecl(java.lang.String manifAnneeDecl) {
			this.manifAnneeDecl = manifAnneeDecl;
		}

		/**
		 * @return the manifBurDecl
		 */
		public java.lang.String getManifBurDecl() {
			return manifBurDecl;
		}

		/**
		 * @param manifBurDecl the manifBurDecl to set
		 */
		public void setManifBurDecl(java.lang.String manifBurDecl) {
			this.manifBurDecl = manifBurDecl;
		}

		/**
		 * @return the manifNumDecl
		 */
		public java.lang.Integer getManifNumDecl() {
			return manifNumDecl;
		}

		/**
		 * @param manifNumDecl the manifNumDecl to set
		 */
		public void setManifNumDecl(java.lang.Integer manifNumDecl) {
			this.manifNumDecl = manifNumDecl;
		}

		/**
		 * @return the manifNumMessage
		 */
		public java.lang.Integer getManifNumMessage() {
			return manifNumMessage;
		}

		/**
		 * @param manifNumMessage the manifNumMessage to set
		 */
		public void setManifNumMessage(java.lang.Integer manifNumMessage) {
			this.manifNumMessage = manifNumMessage;
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
	
	    
	

}
