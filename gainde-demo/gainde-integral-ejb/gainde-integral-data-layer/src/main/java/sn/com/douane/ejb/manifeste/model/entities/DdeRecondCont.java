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

import sn.com.douane.ejb.manifeste.model.keys.DdeRecondArtManKey;
import sn.com.douane.ejb.manifeste.model.keys.DdeRecondContKey;

/**
 * @author CGPID
 *
 */
@Entity
@IdClass(DdeRecondContKey.class)
@NamedQueries({
		@NamedQuery(name = "findContRecond", 
		query = "select object(o) from DdeRecondCont o where  " +
				" o.manifAnneeEnregManif = ?1 and  o.manifBurEnregManif = ?2 and  " +
				" o.manifNumEnregManif = ?3 and o.manifNumArtManif = ?4 and  " +
				"o.manifPrecArtManif = ?5 and  o.manifPrecArtManif2 = ?6")
})
		
@Table(name="DDERECONDCONT")
public class DdeRecondCont implements Serializable {
	
	private static final long serialVersionUID = -3508985692116718434L;

	@Id
	@Column(name="MANIFNUMCONT", length=11, nullable=false)
	private java.lang.String manifNumCont;
	
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnregManif;
    
	@Id
	@Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
    private java.lang.String manifBurEnregManif;
    
	@Id
	@Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
	@Id
	@Column(name="MANIFNUMARTMANIF", nullable=false)
    private java.lang.Integer manifNumArtManif;
    
	@Id
	@Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecArtManif;
    
	@Id
	@Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecArtManif2;
    
	@Id
	@Column(name="MANIFNUMRECOND", nullable=false)
    private java.lang.Integer manifNumRecond;
    
	@Id
	@Column(name="MANIFNUMRECOND2", nullable=false)
    private java.lang.Integer manifNumRecond2;
	
	@Column(name="MANIFDATERECOND")
    private java.sql.Date manifDateRecond;
    
	@Column(name="MANIFINDCONT2", length=15)
    private java.lang.String manifIndCont2;
    
	@Column(name="MANIFINDCONT", length=15)
    private java.lang.String manifIndCont;
    
	@Column(name="MANIFNUMAPU")
    private java.lang.Integer manifNumApu;
    
	@Column(name="MANIFNUMCHASSIS", length=17)
    private java.lang.String manifNumChassis;
    
	@Column(name="MANIFNUMPLOMB", length=8)
    private java.lang.String manifNumPlomb;
    
	@Column(name="MANIFTAILLECONT", length=8)
    private java.lang.String manifTailleCont;
    
	@Column(name="MANIFTYPECONT", length=8)
    private java.lang.String manifTypeCont;
       
    @ManyToOne(targetEntity = DdeRecondArtMan.class)
    @JoinColumns( value = {
	  @JoinColumn(name="MANIFANNEEENREGMANIF", referencedColumnName="MANIFANNEEENREGMANIF", insertable=false, updatable=false), 
	  @JoinColumn(name="MANIFBURENREGMANIF", referencedColumnName="MANIFBURENREGMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMENREGMANIF", referencedColumnName="MANIFNUMENREGMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMARTMANIF", referencedColumnName="MANIFNUMARTMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFPRECARTMANIF", referencedColumnName="MANIFPRECARTMANIF", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFPRECARTMANIF2", referencedColumnName="MANIFPRECARTMANIF2", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMRECOND", referencedColumnName="MANIFNUMRECOND", insertable=false, updatable=false),
	  @JoinColumn(name="MANIFNUMRECOND2", referencedColumnName="MANIFNUMRECOND2", insertable=false, updatable=false)
	  })
	  
    private DdeRecondArtMan ddeRecondArtMan;


	/**
	 * 
	 */
	public DdeRecondCont() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	/**
	 * @return the manifNumCont
	 */
	public java.lang.String getManifNumCont() {
		return manifNumCont;
	}


	/**
	 * @param manifNumCont the manifNumCont to set
	 */
	public void setManifNumCont(java.lang.String manifNumCont) {
		this.manifNumCont = manifNumCont;
	}


	/**
	 * @return the manifDateRecond
	 */
	public java.sql.Date getManifDateRecond() {
		return manifDateRecond;
	}


	/**
	 * @param manifDateRecond the manifDateRecond to set
	 */
	public void setManifDateRecond(java.sql.Date manifDateRecond) {
		this.manifDateRecond = manifDateRecond;
	}


	/**
	 * @return the manifIndCont2
	 */
	public java.lang.String getManifIndCont2() {
		return manifIndCont2;
	}


	/**
	 * @param manifIndCont2 the manifIndCont2 to set
	 */
	public void setManifIndCont2(java.lang.String manifIndCont2) {
		this.manifIndCont2 = manifIndCont2;
	}


	/**
	 * @return the manifIndCont
	 */
	public java.lang.String getManifIndCont() {
		return manifIndCont;
	}


	/**
	 * @param manifIndCont the manifIndCont to set
	 */
	public void setManifIndCont(java.lang.String manifIndCont) {
		this.manifIndCont = manifIndCont;
	}


	/**
	 * @return the manifNumApu
	 */
	public java.lang.Integer getManifNumApu() {
		return manifNumApu;
	}


	/**
	 * @param manifNumApu the manifNumApu to set
	 */
	public void setManifNumApu(java.lang.Integer manifNumApu) {
		this.manifNumApu = manifNumApu;
	}


	/**
	 * @return the manifNumChassis
	 */
	public java.lang.String getManifNumChassis() {
		return manifNumChassis;
	}


	/**
	 * @param manifNumChassis the manifNumChassis to set
	 */
	public void setManifNumChassis(java.lang.String manifNumChassis) {
		this.manifNumChassis = manifNumChassis;
	}


	/**
	 * @return the manifNumPlomb
	 */
	public java.lang.String getManifNumPlomb() {
		return manifNumPlomb;
	}


	/**
	 * @param manifNumPlomb the manifNumPlomb to set
	 */
	public void setManifNumPlomb(java.lang.String manifNumPlomb) {
		this.manifNumPlomb = manifNumPlomb;
	}


	/**
	 * @return the manifTailleCont
	 */
	public java.lang.String getManifTailleCont() {
		return manifTailleCont;
	}


	/**
	 * @param manifTailleCont the manifTailleCont to set
	 */
	public void setManifTailleCont(java.lang.String manifTailleCont) {
		this.manifTailleCont = manifTailleCont;
	}


	/**
	 * @return the manifTypeCont
	 */
	public java.lang.String getManifTypeCont() {
		return manifTypeCont;
	}


	/**
	 * @param manifTypeCont the manifTypeCont to set
	 */
	public void setManifTypeCont(java.lang.String manifTypeCont) {
		this.manifTypeCont = manifTypeCont;
	}


	/**
	 * @return the manifAnneeEnregManif
	 */
	public java.lang.String getManifAnneeEnregManif() {
		return manifAnneeEnregManif;
	}


	/**
	 * @param manifAnneeEnregManif the manifAnneeEnregManif to set
	 */
	public void setManifAnneeEnregManif(java.lang.String manifAnneeEnregManif) {
		this.manifAnneeEnregManif = manifAnneeEnregManif;
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
	 * @return the manifPrecArtManif
	 */
	public java.lang.Integer getManifPrecArtManif() {
		return manifPrecArtManif;
	}


	/**
	 * @param manifPrecArtManif the manifPrecArtManif to set
	 */
	public void setManifPrecArtManif(java.lang.Integer manifPrecArtManif) {
		this.manifPrecArtManif = manifPrecArtManif;
	}


	/**
	 * @return the manifPrecArtManif2
	 */
	public java.lang.Integer getManifPrecArtManif2() {
		return manifPrecArtManif2;
	}


	/**
	 * @param manifPrecArtManif2 the manifPrecArtManif2 to set
	 */
	public void setManifPrecArtManif2(java.lang.Integer manifPrecArtManif2) {
		this.manifPrecArtManif2 = manifPrecArtManif2;
	}


	/**
	 * @return the manifNumRecond
	 */
	public java.lang.Integer getManifNumRecond() {
		return manifNumRecond;
	}


	/**
	 * @param manifNumRecond the manifNumRecond to set
	 */
	public void setManifNumRecond(java.lang.Integer manifNumRecond) {
		this.manifNumRecond = manifNumRecond;
	}


	/**
	 * @return the manifNumRecond2
	 */
	public java.lang.Integer getManifNumRecond2() {
		return manifNumRecond2;
	}


	/**
	 * @param manifNumRecond2 the manifNumRecond2 to set
	 */
	public void setManifNumRecond2(java.lang.Integer manifNumRecond2) {
		this.manifNumRecond2 = manifNumRecond2;
	}


	/**
	 * @return the ddeRecondArtMan
	 */
	public DdeRecondArtMan getDdeRecondArtMan() {
		return ddeRecondArtMan;
	}


	/**
	 * @param ddeRecondArtMan the ddeRecondArtMan to set
	 */
	public void setDdeRecondArtMan(DdeRecondArtMan ddeRecondArtMan) {
		this.ddeRecondArtMan = ddeRecondArtMan;
	}




	public void removeDdeRecondContForDdeReconArtMan(DdeRecondArtManKey key, DdeRecondArtMan dderecondartmanVO) {
		// TODO Auto-generated method stub
		
	}
    
    

}
