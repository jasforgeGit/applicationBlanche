/**
 * 
 */
package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumns;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.SegArtDecTransbKey;

/**
 * @author moussakare
 *
 */
@Entity
@IdClass(SegArtDecTransbKey.class)
@Table(name = "SEGARTDECTRANSB")
public class SegArtDecTransb implements Serializable {

		/**
		 * 
		 */
		private static final long serialVersionUID = 6796747890163398352L;
		
		@Id 
		@Column(name = "DECANNEEENREG",length  = 4, nullable = false)
		private String decAnneeDec;
		
		@Id 
		@Column(name = "DECBURENREGTRANS",length  = 3, nullable = false)
		private String decBurEnregTrans;
		
		@Id 
		@Column(name = "DECNUMENREGTRANS", nullable = false)
		private Integer decNumDecTrans;
		
		@Id 
		@Column(name = "DECNUMARTTRANS", nullable = false)
		private Integer decNumArtTrans;
		
		@Column(name = "DECANNEEENREGMANIF",length  = 4)
		private String decAnneeEnregManif;
		
		@Column(name = "DECBURENREGMANIF", length  = 3)
		private String decBurEnregManif;
		
	    @Column(name = "DECNUMENREGMANIF")
		private Integer decNumEnregManif;
	    
	    @Column(name = "DECNUMARTMANIF")
		private Integer decNumArtManif;
		
	    @Column(name = "DECPRECARTMANIF")
		private Integer decPrecArtManif;
	    
	    @Column(name = "DECPREC2ARTMANIF")
		private Integer decPrec2ArtManif;
	    
	    @Column(name = "DECNBRECOLISTRANS", columnDefinition = "DECIMAL(6,0)")
	    private java.math.BigDecimal decNbreColisTrans;
	    
	    @Column(name = "DECPOIDSTRANS", columnDefinition = "DECIMAL(9,0)")
	    private java.math.BigDecimal decPoidsTrans;
	    
	    @Column(name = "DECDESTDEFINITIVE", length  = 20)
		private String decDestDefinitive;
	    
	    @Column(name = "DECNOMDESTINATAIRE", length  = 255)
		private String decNomDestinataire;
	    
	    @Column(name = "DECTYPEVOIXDEST", length  = 5)
		private String decTypeVoixDest;
	    
	    @Column(name = "DECNOMVOIEDEST", length  = 25)
		private String decNomVoieDest;
	    
	    @Column(name = "DECNUMVOIEDEST", length  = 5)
		private String decNumVoieDest;
	    
	    @Column(name = "DECQUARTIERDEST", length  = 50)
		private String decQuartierDest;
	    
	    @Column(name = "DECVILLEDEST", length  = 50)
		private String decVilleDest;
	    
	    @Column(name = "DECBPDEST", length  = 5)
		private String decBpDest;
	    
	    @Column(name = "DECMODECOND", length  = 4)
		private String decModeCond;
	    
	    @Column(name = "DECNBRECOLISENLEVES", columnDefinition = "DECIMAL(6,0)")
		private java.math.BigDecimal decNbreColisEnleves;
	    
	    @Column(name = "DECPOIDSBRUTENLEVE", columnDefinition = "DECIMAL(9,0)")
		private java.math.BigDecimal decPoidsBrutEnleve;
	    
	    @Column(name = "DECCODEDESTDEF", length  = 3)
		private String decCodeDestDef;
	    
	    @Column(name = "DECVALDOUANE", columnDefinition = "DECIMAL(11,0)")
		private java.math.BigDecimal decValDouane;
	    
	    @ManyToOne(targetEntity = SegGenDecTrans.class)
		@JoinColumns( value = {
			@JoinColumn(name="DECANNEEENREG", referencedColumnName="DECANNEEDEC", insertable=false, updatable=false), 
			@JoinColumn(name="DECBURENREGTRANS", referencedColumnName="DECBURENREGTRANS", insertable=false, updatable=false),
			@JoinColumn(name="DECNUMENREGTRANS", referencedColumnName="DECNUMDECTRANS", insertable=false, updatable=false)
			})  
		private SegGenDecTrans segGenDectrans;
	    

		public SegArtDecTransb() {
			super();
		}

		public SegArtDecTransb(String decAnneeDec, String decBurEnregTrans,
				Integer decNumDecTrans, Integer decNumArtTrans,
				String decAnneeEnregManif, String decBurEnregManif,
				Integer decNumEnregManif, Integer decNumArtManif,
				Integer decPrecArtManif, Integer decPrec2ArtManif,
				BigDecimal decNbreColisTrans, BigDecimal decPoidsTrans,
				String decDestDefinitive, String decNomDestinataire,
				String decTypeVoixDest, String decNomVoieDest,
				String decNumVoieDest, String decQuartierDest, String decVilleDest,
				String decBpDest, String decModeCond,
				BigDecimal decNbreColisEnleves, BigDecimal decPoidsBrutEnleve,
				String decCodeDestDef, BigDecimal decValDouane) {
			super();
			this.decAnneeDec = decAnneeDec;
			this.decBurEnregTrans = decBurEnregTrans;
			this.decNumDecTrans = decNumDecTrans;
			this.decNumArtTrans = decNumArtTrans;
			this.decAnneeEnregManif = decAnneeEnregManif;
			this.decBurEnregManif = decBurEnregManif;
			this.decNumEnregManif = decNumEnregManif;
			this.decNumArtManif = decNumArtManif;
			this.decPrecArtManif = decPrecArtManif;
			this.decPrec2ArtManif = decPrec2ArtManif;
			this.decNbreColisTrans = decNbreColisTrans;
			this.decPoidsTrans = decPoidsTrans;
			this.decDestDefinitive = decDestDefinitive;
			this.decNomDestinataire = decNomDestinataire;
			this.decTypeVoixDest = decTypeVoixDest;
			this.decNomVoieDest = decNomVoieDest;
			this.decNumVoieDest = decNumVoieDest;
			this.decQuartierDest = decQuartierDest;
			this.decVilleDest = decVilleDest;
			this.decBpDest = decBpDest;
			this.decModeCond = decModeCond;
			this.decNbreColisEnleves = decNbreColisEnleves;
			this.decPoidsBrutEnleve = decPoidsBrutEnleve;
			this.decCodeDestDef = decCodeDestDef;
			this.decValDouane = decValDouane;
		}

		public String getDecAnneeDec() {
			return decAnneeDec;
		}

		public void setDecAnneeDec(String decAnneeDec) {
			this.decAnneeDec = decAnneeDec;
		}

		public String getDecBurEnregTrans() {
			return decBurEnregTrans;
		}

		public void setDecBurEnregTrans(String decBurEnregTrans) {
			this.decBurEnregTrans = decBurEnregTrans;
		}

		public Integer getDecNumDecTrans() {
			return decNumDecTrans;
		}

		public void setDecNumDecTrans(Integer decNumDecTrans) {
			this.decNumDecTrans = decNumDecTrans;
		}

		public Integer getDecNumArtTrans() {
			return decNumArtTrans;
		}

		public void setDecNumArtTrans(Integer decNumArtTrans) {
			this.decNumArtTrans = decNumArtTrans;
		}

		public String getDecAnneeEnregManif() {
			return decAnneeEnregManif;
		}

		public void setDecAnneeEnregManif(String decAnneeEnregManif) {
			this.decAnneeEnregManif = decAnneeEnregManif;
		}

		public String getDecBurEnregManif() {
			return decBurEnregManif;
		}

		public void setDecBurEnregManif(String decBurEnregManif) {
			this.decBurEnregManif = decBurEnregManif;
		}

		public Integer getDecNumEnregManif() {
			return decNumEnregManif;
		}

		public void setDecNumEnregManif(Integer decNumEnregManif) {
			this.decNumEnregManif = decNumEnregManif;
		}

		public Integer getDecNumArtManif() {
			return decNumArtManif;
		}

		public void setDecNumArtManif(Integer decNumArtManif) {
			this.decNumArtManif = decNumArtManif;
		}

		public Integer getDecPrecArtManif() {
			return decPrecArtManif;
		}

		public void setDecPrecArtManif(Integer decPrecArtManif) {
			this.decPrecArtManif = decPrecArtManif;
		}

		public Integer getDecPrec2ArtManif() {
			return decPrec2ArtManif;
		}

		public void setDecPrec2ArtManif(Integer decPrec2ArtManif) {
			this.decPrec2ArtManif = decPrec2ArtManif;
		}

		public java.math.BigDecimal getDecNbreColisTrans() {
			return decNbreColisTrans;
		}

		public void setDecNbreColisTrans(java.math.BigDecimal decNbreColisTrans) {
			this.decNbreColisTrans = decNbreColisTrans;
		}

		public java.math.BigDecimal getDecPoidsTrans() {
			return decPoidsTrans;
		}

		public void setDecPoidsTrans(java.math.BigDecimal decPoidsTrans) {
			this.decPoidsTrans = decPoidsTrans;
		}

		public String getDecDestDefinitive() {
			return decDestDefinitive;
		}

		public void setDecDestDefinitive(String decDestDefinitive) {
			this.decDestDefinitive = decDestDefinitive;
		}

		public String getDecNomDestinataire() {
			return decNomDestinataire;
		}

		public void setDecNomDestinataire(String decNomDestinataire) {
			this.decNomDestinataire = decNomDestinataire;
		}

		public String getDecTypeVoixDest() {
			return decTypeVoixDest;
		}

		public void setDecTypeVoixDest(String decTypeVoixDest) {
			this.decTypeVoixDest = decTypeVoixDest;
		}

		public String getDecNomVoieDest() {
			return decNomVoieDest;
		}

		public void setDecNomVoieDest(String decNomVoieDest) {
			this.decNomVoieDest = decNomVoieDest;
		}

		public String getDecNumVoieDest() {
			return decNumVoieDest;
		}

		public void setDecNumVoieDest(String decNumVoieDest) {
			this.decNumVoieDest = decNumVoieDest;
		}

		public String getDecQuartierDest() {
			return decQuartierDest;
		}

		public void setDecQuartierDest(String decQuartierDest) {
			this.decQuartierDest = decQuartierDest;
		}

		public String getDecVilleDest() {
			return decVilleDest;
		}

		public void setDecVilleDest(String decVilleDest) {
			this.decVilleDest = decVilleDest;
		}

		public String getDecBpDest() {
			return decBpDest;
		}

		public void setDecBpDest(String decBpDest) {
			this.decBpDest = decBpDest;
		}

		public String getDecModeCond() {
			return decModeCond;
		}

		public void setDecModeCond(String decModeCond) {
			this.decModeCond = decModeCond;
		}

		public java.math.BigDecimal getDecNbreColisEnleves() {
			return decNbreColisEnleves;
		}

		public void setDecNbreColisEnleves(java.math.BigDecimal decNbreColisEnleves) {
			this.decNbreColisEnleves = decNbreColisEnleves;
		}

		public java.math.BigDecimal getDecPoidsBrutEnleve() {
			return decPoidsBrutEnleve;
		}

		public void setDecPoidsBrutEnleve(java.math.BigDecimal decPoidsBrutEnleve) {
			this.decPoidsBrutEnleve = decPoidsBrutEnleve;
		}

		public String getDecCodeDestDef() {
			return decCodeDestDef;
		}

		public void setDecCodeDestDef(String decCodeDestDef) {
			this.decCodeDestDef = decCodeDestDef;
		}

		public java.math.BigDecimal getDecValDouane() {
			return decValDouane;
		}

		public void setDecValDouane(java.math.BigDecimal decValDouane) {
			this.decValDouane = decValDouane;
		}

		public SegGenDecTrans getSegGenDectrans() {
			return segGenDectrans;
		}

		public void setSegGenDectrans(SegGenDecTrans segGenDectrans) {
			this.segGenDectrans = segGenDectrans;
		}
}
