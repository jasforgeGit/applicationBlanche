package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegenMan;
import sn.com.douane.ejb.manifeste.model.entities.SegmentGenManifeste;

/**
 * TypeManifeste EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "TypeManifeste")
public class TypeManifeste implements Serializable {
	
	private static final long serialVersionUID = 2722402275616536168L;
	
	@Id
	@Column(name = "RCCODETYPEMANIF", nullable = false)
	private Integer rccodetypemanif;
	
	@Column(name = "RCLIBELLETYPEMANIF", length = 100, nullable = false)
    private String rclibelletypemanif;
    
	@OneToMany(mappedBy = "typeManifeste",targetEntity=BureauDouaneTypeManifeste.class)	
    private List<BureauDouaneTypeManifeste> typeManifestes = new ArrayList<BureauDouaneTypeManifeste>();	
	
	@OneToMany(mappedBy = "typeManifeste",targetEntity=BrouillonSegenMan.class)
	private List<BrouillonSegenMan> listeBrouillonSegenman ;
	
	@OneToMany(mappedBy = "typeManifeste",targetEntity=SegmentGenManifeste.class)
	private List<SegmentGenManifeste> listeSegmentGenMan ;
	
    public TypeManifeste() {
		super();
	} 
    
    /**
     * 1-args constructor.
     * 
     * @param rccodetypemanif
     */
    public TypeManifeste(Integer rccodetypemanif) {
		super();
		this.rccodetypemanif = rccodetypemanif;
	}

	/**
     * 2-args constructor.
     * 
     * @param rccodetypemanif
     * @param rclibelletypemanif
     */
	public TypeManifeste(Integer rccodetypemanif, String rclibelletypemanif) {
		super();
		this.rccodetypemanif = rccodetypemanif;
		this.rclibelletypemanif = rclibelletypemanif;
	}

	/**
	 * Get accessor for persistent attribute: rccodetypemanif
	 */
    public Integer getRccodetypemanif() {
        return rccodetypemanif;
    }

    /**
	 * Set accessor for persistent attribute: rccodetypemanif
	 */
	public void setRccodetypemanif(Integer rccodetypemanif) {
        this.rccodetypemanif = rccodetypemanif;
    }

    /**
	 * Get accessor for persistent attribute: rclibelletypemanif
	 */	
    public String getRclibelletypemanif() {
        return rclibelletypemanif;
    }

    /**
	 * Set accessor for persistent attribute: rclibelletypemanif
	 */
	public void setRclibelletypemanif(String rclibelletypemanif) {
        this.rclibelletypemanif = rclibelletypemanif;
    }

	/**
	 * @return the typeManifestes
	 */
	public List<BureauDouaneTypeManifeste> getTypeManifestes() {
		return typeManifestes;
	}

	/**
	 * @param typeManifestes the typeManifestes to set
	 */
	public void setTypeManifestes(List<BureauDouaneTypeManifeste> typeManifestes) {
		this.typeManifestes = typeManifestes;
	}

	public List<BrouillonSegenMan> getListeBrouillonSegenman() {
		return listeBrouillonSegenman;
	}

	public void setListeBrouillonSegenman(List<BrouillonSegenMan> listeBrouillonSegenman) {
		this.listeBrouillonSegenman = listeBrouillonSegenman;
	}

	public List<SegmentGenManifeste> getListeSegmentGenMan() {
		return listeSegmentGenMan;
	}

	public void setListeSegmentGenMan(List<SegmentGenManifeste> listeSegmentGenMan) {
		this.listeSegmentGenMan = listeSegmentGenMan;
	}

//	public Set<BureauDouaneTypeManifeste> getTypesManifeste() {
//		return typesManifeste;
//	}
//
//	public void setTypesManifeste(Set<BureauDouaneTypeManifeste> typesManifeste) {
//		this.typesManifeste = typesManifeste;
//	}
	
}
