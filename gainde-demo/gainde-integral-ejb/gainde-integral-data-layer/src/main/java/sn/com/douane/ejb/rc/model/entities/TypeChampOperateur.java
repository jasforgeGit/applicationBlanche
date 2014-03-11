package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.TypeChampOperateurKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(TypeChampOperateurKey.class)
@Table(name="TYPECHAMPOPERATEUR")
public class TypeChampOperateur implements Serializable {

	private static final long serialVersionUID = -7472389621468409112L;
	
	@Id
	@Column(name="RCTYPECHAMP", length=20, nullable=false)
	private String rcTypeChamp;
	
	@Id
	@Column(name="RCCODEOERATEUR", length=20, nullable=false)
	private String rcCodeOperateur;
	  
	@ManyToOne(targetEntity = Operateur.class)
	@JoinColumn(name="RCCODEOERATEUR", insertable=false, updatable=false)
	private Operateur typOpOperat;

	public TypeChampOperateur() {

	}
	
	public TypeChampOperateur(String rcTypeChamp, String rcCodeOperateur) {
		super();
		this.rcTypeChamp = rcTypeChamp;
		this.rcCodeOperateur = rcCodeOperateur;
	}


	/**
	 * @return the rcTypeChamp
	 */
	public String getRcTypeChamp() {
		return rcTypeChamp;
	}

	/**
	 * @param rcTypeChamp the rcTypeChamp to set
	 */
	public void setRcTypeChamp(String rcTypeChamp) {
		this.rcTypeChamp = rcTypeChamp;
	}

	/**
	 * @return the rcCodeOperateur
	 */
	public String getRcCodeOperateur() {
		return rcCodeOperateur;
	}

	/**
	 * @param rcCodeOperateur the rcCodeOperateur to set
	 */
	public void setRcCodeOperateur(String rcCodeOperateur) {
		this.rcCodeOperateur = rcCodeOperateur;
	}

	/**
	 * @return the typOpOperat
	 */
	public Operateur getTypOpOperat() {
		return typOpOperat;
	}

	/**
	 * @param typOpOperat the typOpOperat to set
	 */
	public void setTypOpOperat(Operateur typOpOperat) {
		this.typOpOperat = typOpOperat;
	}

}
