package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="OPERATEUR")
public class Operateur implements Serializable{

	private static final long serialVersionUID = 4930635797543774025L;
	
	@Id
	@Column(name="RCCODEOPERATEUR", length=20, nullable=false)
	private String rcCodeOperateur;
	
	@Column(name="RCSYMBOLEOPERATEUR", length=5, nullable=false)
	private String rcSymboleOperateur;
	
	@Column(name="RCLIBELLEOPERATEUR", length=100, nullable=false)
	private String rcLibelleOperateur;
	
	@OneToMany(mappedBy = "typOpOperat", targetEntity = TypeChampOperateur.class)
	private List<TypeChampOperateur> typeChampOperateurs = new ArrayList<TypeChampOperateur>();

	public Operateur() {

	}

	public Operateur(String rcCodeOperateur, String rcSymboleOperateur,
			String rcLibelleOperateur) {
		super();
		this.rcCodeOperateur = rcCodeOperateur;
		this.rcSymboleOperateur = rcSymboleOperateur;
		this.rcLibelleOperateur = rcLibelleOperateur;
	}

	public String getRcCodeOperateur() {
		return rcCodeOperateur;
	}

	public void setRcCodeOperateur(String rcCodeOperateur) {
		this.rcCodeOperateur = rcCodeOperateur;
	}

	public String getRcSymboleOperateur() {
		return rcSymboleOperateur;
	}

	public void setRcSymboleOperateur(String rcSymboleOperateur) {
		this.rcSymboleOperateur = rcSymboleOperateur;
	}

	public String getRcLibelleOperateur() {
		return rcLibelleOperateur;
	}

	public void setRcLibelleOperateur(String rcLibelleOperateur) {
		this.rcLibelleOperateur = rcLibelleOperateur;
	}

	public List<TypeChampOperateur> getTypeChampOperateurs() {
		return typeChampOperateurs;
	}

	public void setTypeChampOperateurs(List<TypeChampOperateur> typeChampOperateurs) {
		this.typeChampOperateurs = typeChampOperateurs;
	}
	
	

}
