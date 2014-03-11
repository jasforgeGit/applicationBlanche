package sn.com.douane.ejb.rc.model.entities;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.EncoursDeclaration;



@Entity
@Table(name = "CIRCUITVISITE")
public class CircuitVisite implements Serializable{
	
	private static final long serialVersionUID = 8693616291007736186L;
	
	@Id
	@Column(name = "RCCODECIRCUIT",length = 1,nullable = false)	
	private String rccodecircuit;
	
	@Column(name = "RCDESCIRCUITVISITE",length = 50,nullable = false)
    private String rcdescircuitvisite;
	
	@Column(name = "RCCOULEUR",length = 20)
    private String rccouleur;
	
	@Column(name = "RCPRIORITE")
    private Integer rcpriorite;
	   	
	@OneToMany(mappedBy = "circuitVisite", targetEntity = HreglementImport.class)
    private List<HreglementImport> hreglementImport = new ArrayList<HreglementImport>();	
   
	@OneToMany(mappedBy = "circuitVisite", targetEntity = Pays.class)
	private List<Pays> pays = new ArrayList<Pays>();	

	@OneToMany(mappedBy = "circuitVisite", targetEntity = UniteVisite.class)
	private List<UniteVisite> uniteVisite = new ArrayList<UniteVisite>();	
	
	@OneToMany(mappedBy = "circuitVisite", targetEntity = CritereLogique.class)
	private List<CritereLogique> criteresLogiques = new ArrayList<CritereLogique>(); 	

	@OneToMany(mappedBy = "circuitVisite", targetEntity = EncoursDeclaration.class)
	private List<EncoursDeclaration> listEncoursDeclaration = new ArrayList<EncoursDeclaration>();
	
  	public CircuitVisite() {
    }
    
	public CircuitVisite(String rccodecircuit) {
		super();
		this.rccodecircuit=rccodecircuit;
	}
   
	public CircuitVisite(String rccodecircuit, String rcdescircuitvisite) {
		super();
		this.rccodecircuit=rccodecircuit;
		this.rcdescircuitvisite=rcdescircuitvisite;
	}
  
    public String getRccodecircuit() {
        return rccodecircuit;
    }

   
	public void setRccodecircuit(String rccodecircuit) {
        this.rccodecircuit = rccodecircuit;
    }
	
    public String getRcdescircuitvisite() {
        return rcdescircuitvisite;
    }
  
	public void setRcdescircuitvisite(String rcdescircuitvisite) {
        this.rcdescircuitvisite = rcdescircuitvisite;
    }


    public String getRccouleur() {
        return rccouleur;
    }

  
	public void setRccouleur(java.lang.String rccouleur) {
        this.rccouleur = rccouleur;
    }

  
    public java.lang.Integer getRcpriorite() {
        return rcpriorite;
    }

  
	public void setRcpriorite(java.lang.Integer rcpriorite) {
        this.rcpriorite = rcpriorite;
    }	
   

	public List<Pays> getPays() {
		return pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	public List<UniteVisite> getUniteVisite() {
		return uniteVisite;
	}

	public void setUniteVisite(List<UniteVisite> uniteVisite) {
		this.uniteVisite = uniteVisite;
	}
	
	public List<CritereLogique> getCriteresLogiques() {
		return criteresLogiques;
	}

	public void setCriteresLogiques(List<CritereLogique> criteresLogiques) {
		this.criteresLogiques = criteresLogiques;
	}

	public List<HreglementImport> getHreglementImport() {
		return hreglementImport;
	}

	public void setHreglementImport(List<HreglementImport> hreglementImport) {
		this.hreglementImport = hreglementImport;
	}
	
	//XXXX HS XXXXXX 
		@Override
		public String toString() {
			return  rccodecircuit+","+rcdescircuitvisite;
		}

		public List<EncoursDeclaration> getListEncoursDeclaration() {
			return listEncoursDeclaration;
		}

		public void setListEncoursDeclaration(List<EncoursDeclaration> listEncoursDeclaration) {
			this.listEncoursDeclaration = listEncoursDeclaration;
		}
	
   
}

