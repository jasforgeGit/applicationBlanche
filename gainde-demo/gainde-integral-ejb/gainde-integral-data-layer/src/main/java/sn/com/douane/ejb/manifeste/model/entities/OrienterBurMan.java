/**
 * moussakare
 */
package sn.com.douane.ejb.manifeste.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.keys.OrienterBurManKey;



/**
 * @author moussakare
 *
 */

@Entity
@IdClass(OrienterBurManKey.class)
@Table(name="ORIENTERBURMAN")
	
public class OrienterBurMan implements Serializable {
	private static final long serialVersionUID = 1495385755871331583L;
	
	@Id
	@Column(name="CODEBUR", length=3, nullable=false)
	private java.lang.String codeBur;
	
	@Id
	@Column(name="MANIFCODECONSIGNATAIRE", length=3, nullable=false)
    private java.lang.String manifCodeConsignataire;
	
	@Id
	@Column(name="MANIFANNEEENREGMANIF", length=4, nullable=false)
    private java.lang.String manifAnneeEnregManif;
	
	@Id
	@Column(name="MANIFNUMREP", length=6, nullable=false)
    private java.lang.String manifNumRep;
	
//	@OneToMany(mappedBy = "orienterBurMan", targetEntity = SegmentGenManifeste.class)
//	private List<SegmentGenManifeste> segmentGenManifestes = new ArrayList<SegmentGenManifeste>();

	/**
	 * 
	 */
	public OrienterBurMan() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param codeBur
	 * @param manifCodeConsignataire
	 * @param manifAnneeEnregManif
	 * @param manifNumRep
	 * @param segmentGenManifestes
	 */
	public OrienterBurMan(String codeBur, String manifCodeConsignataire,String manifAnneeEnregManif, String manifNumRep) {
		super();
		this.codeBur = codeBur;
		this.manifCodeConsignataire = manifCodeConsignataire;
		this.manifAnneeEnregManif = manifAnneeEnregManif;
		this.manifNumRep = manifNumRep;		
	}

	/**
	 * @return the codeBur
	 */
	public java.lang.String getCodeBur() {
		return codeBur;
	}

	/**
	 * @param codeBur the codeBur to set
	 */
	public void setCodeBur(java.lang.String codeBur) {
		this.codeBur = codeBur;
	}

	/**
	 * @return the manifCodeConsignataire
	 */
	public java.lang.String getManifCodeConsignataire() {
		return manifCodeConsignataire;
	}

	/**
	 * @param manifCodeConsignataire the manifCodeConsignataire to set
	 */
	public void setManifCodeConsignataire(java.lang.String manifCodeConsignataire) {
		this.manifCodeConsignataire = manifCodeConsignataire;
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
	 * @return the manifNumRep
	 */
	public java.lang.String getManifNumRep() {
		return manifNumRep;
	}

	/**
	 * @param manifNumRep the manifNumRep to set
	 */
	public void setManifNumRep(java.lang.String manifNumRep) {
		this.manifNumRep = manifNumRep;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeBur == null) ? 0 : codeBur.hashCode());
		result = prime
				* result
				+ ((manifAnneeEnregManif == null) ? 0 : manifAnneeEnregManif
						.hashCode());
		result = prime
				* result
				+ ((manifCodeConsignataire == null) ? 0
						: manifCodeConsignataire.hashCode());
		result = prime * result
				+ ((manifNumRep == null) ? 0 : manifNumRep.hashCode());
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
		OrienterBurMan other = (OrienterBurMan) obj;
		if (codeBur == null) {
			if (other.codeBur != null){
				return false;
			}
		} else if (!codeBur.equals(other.codeBur)){
			return false;
		}
		if (manifAnneeEnregManif == null) {
			if (other.manifAnneeEnregManif != null){
				return false;
			}
		} else if (!manifAnneeEnregManif.equals(other.manifAnneeEnregManif)){
			return false;
		}
		if (manifCodeConsignataire == null) {
			if (other.manifCodeConsignataire != null){
				return false;
			}
		} else if (!manifCodeConsignataire.equals(other.manifCodeConsignataire)){
			return false;
		}
		if (manifNumRep == null) {
			if (other.manifNumRep != null){
				return false;
			}
		} else if (!manifNumRep.equals(other.manifNumRep)){
			return false;
		}
		return true;
	}
		
}
