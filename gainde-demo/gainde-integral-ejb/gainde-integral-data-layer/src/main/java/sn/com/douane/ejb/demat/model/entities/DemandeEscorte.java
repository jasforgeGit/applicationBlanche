package sn.com.douane.ejb.demat.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.SegGenDec;

@Entity
@Table(name="DEMANDEESCORTE")
public class DemandeEscorte implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8614830053576278764L;

	@Id	
	@Column(name = "IDDEMESCORTE", nullable = false)
	private long idDemEscorte;

	@Column(name = "VERSION", nullable = false)
	private Integer version;

	@Column(name = "NUMERO", length = 35)
	private String numero;

	@Column(name = "DATE")
	private Timestamp date;

	@Column(name = "ETAT")
	private Integer etat;

	@Column(name = "IDFICHIERATTACHE")
	private Long idFichierAttache;
	
	@OneToMany(mappedBy = "demandeEscorte", targetEntity = SegGenDec.class)
	private List<SegGenDec> listSegGenDec;
	
	
	public DemandeEscorte() {
		
	}
	
	public DemandeEscorte(long idDemEscorte, Integer version) {
		super();
		this.idDemEscorte = idDemEscorte;
		this.version = version;
	}

	public long getIdDemEscorte() {
		return idDemEscorte;
	}

	public void setIdDemEscorte(long idDemEscorte) {
		this.idDemEscorte = idDemEscorte;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Timestamp getDate() {
		return date;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public Integer getEtat() {
		return etat;
	}

	public void setEtat(Integer etat) {
		this.etat = etat;
	}

	public Long getIdFichierAttache() {
		return idFichierAttache;
	}

	public void setIdFichierAttache(Long idFichierAttache) {
		this.idFichierAttache = idFichierAttache;
	}	

	public List<SegGenDec> getListSegGenDec() {
		return listSegGenDec;
	}

	public void setListSegGenDec(List<SegGenDec> listSegGenDec) {
		this.listSegGenDec = listSegGenDec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((etat == null) ? 0 : etat.hashCode());
		result = prime * result + (int) (idDemEscorte ^ (idDemEscorte >>> 32));
		result = prime
				* result
				+ ((idFichierAttache == null) ? 0 : idFichierAttache.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
		return result;
	}

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
		DemandeEscorte other = (DemandeEscorte) obj;
		if (date == null) {
			if (other.date != null){
				return false;
			}
		} else if (!date.equals(other.date)){
			return false;
		}
		if (etat == null) {
			if (other.etat != null){
				return false;
			}
		} else if (!etat.equals(other.etat)){
			return false;
		}
		if (idDemEscorte != other.idDemEscorte){
			return false;
		}
		if (idFichierAttache == null) {
			if (other.idFichierAttache != null){
				return false;
			}
		} else if (idFichierAttache.longValue() != other.idFichierAttache.longValue()){
			return false;
		}
		if (numero == null) {
			if (other.numero != null){
				return false;
			}
		} else if (numero.compareTo(other.numero) != 0){
			return false;
		}
		if (version == null) {
			if (other.version != null){
				return false;
			}
		} else if (version.intValue() != other.version.intValue()){
			return false;
		}
		return true;
	}	
	
	
	
	
	
	

}
