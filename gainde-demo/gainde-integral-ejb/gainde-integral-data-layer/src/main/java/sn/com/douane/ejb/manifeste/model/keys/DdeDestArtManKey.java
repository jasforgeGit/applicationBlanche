/**
 * CGPID
 */
package sn.com.douane.ejb.manifeste.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

/**
 * @author CGPID
 *
 */
public class DdeDestArtManKey implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4068901685138863740L;

	 
    @Column(name="MANIFBURENREGMANIF", length=3, nullable=false)
    private java.lang.String manifBureauEngManif;
    
    @Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEngManif;
    
    @Column(name="MANIFNUMENREGMANIF", nullable=false)
    private java.lang.Integer manifNumEnregManif;
    
    @Column(name="MANIFNUMARTMANIF", nullable=false)
    private java.lang.Integer manifNumArticleManif;
    
    @Column(name="MANIFPRECARTMANIF", nullable=false)
    private java.lang.Integer manifPrecisArtManif;
    
    @Column(name="MANIFPRECARTMANIF2", nullable=false)
    private java.lang.Integer manifPrecisArtManif2;   
	    

	/**
	 * 
	 */
	public DdeDestArtManKey() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	


	/**
	 * @param manifBureauEngManif
	 * @param manifAnneeEngManif
	 * @param manifNumEnregManif
	 * @param manifNumArticleManif
	 * @param manifPrecisArtManif
	 * @param manifPrecisArtManif2
	 */
	public DdeDestArtManKey(String manifBureauEngManif,
			String manifAnneeEngManif, Integer manifNumEnregManif,
			Integer manifNumArticleManif, Integer manifPrecisArtManif,
			Integer manifPrecisArtManif2) {
		super();
		this.manifBureauEngManif = manifBureauEngManif;
		this.manifAnneeEngManif = manifAnneeEngManif;
		this.manifNumEnregManif = manifNumEnregManif;
		this.manifNumArticleManif = manifNumArticleManif;
		this.manifPrecisArtManif = manifPrecisArtManif;
		this.manifPrecisArtManif2 = manifPrecisArtManif2;
	}




	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((manifAnneeEngManif == null) ? 0 : manifAnneeEngManif
						.hashCode());
		result = prime
				* result
				+ ((manifBureauEngManif == null) ? 0 : manifBureauEngManif
						.hashCode());
		result = prime
				* result
				+ ((manifNumArticleManif == null) ? 0 : manifNumArticleManif
						.hashCode());
		result = prime
				* result
				+ ((manifNumEnregManif == null) ? 0 : manifNumEnregManif
						.hashCode());
		result = prime
				* result
				+ ((manifPrecisArtManif == null) ? 0 : manifPrecisArtManif
						.hashCode());
		result = prime
				* result
				+ ((manifPrecisArtManif2 == null) ? 0 : manifPrecisArtManif2
						.hashCode());
		return result;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		DdeDestArtManKey other = (DdeDestArtManKey) obj;
		if (manifAnneeEngManif == null) {
			if (other.manifAnneeEngManif != null){
				return false;
			}
		} else if (!manifAnneeEngManif.equals(other.manifAnneeEngManif)){
			return false;
		}
		if (manifBureauEngManif == null) {
			if (other.manifBureauEngManif != null){
				return false;
			}
		} else if (!manifBureauEngManif.equals(other.manifBureauEngManif)){
			return false;
		}
		if (manifNumArticleManif == null) {
			if (other.manifNumArticleManif != null){
				return false;
			}
		} else if (!manifNumArticleManif.equals(other.manifNumArticleManif)){
			return false;
		}
		if (manifNumEnregManif == null) {
			if (other.manifNumEnregManif != null){
				return false;
			}
		} else if (!manifNumEnregManif.equals(other.manifNumEnregManif)){
			return false;
		}
		if (manifPrecisArtManif == null) {
			if (other.manifPrecisArtManif != null){
				return false;
			}
		} else if (!manifPrecisArtManif.equals(other.manifPrecisArtManif)){
			return false;
		}
		if (manifPrecisArtManif2 == null) {
			if (other.manifPrecisArtManif2 != null){
				return false;
			}
		} else if (!manifPrecisArtManif2.equals(other.manifPrecisArtManif2)){
			return false;
		}
		return true;
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
	
		
}
