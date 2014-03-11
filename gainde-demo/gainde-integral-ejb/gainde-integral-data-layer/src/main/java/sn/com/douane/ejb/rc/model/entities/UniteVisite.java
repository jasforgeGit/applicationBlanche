package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.UniteVisiteKey;


@Entity
@Table(name = "UNITEVISITE")
@IdClass(UniteVisiteKey.class)
public class UniteVisite implements Serializable {
	
	private static final long serialVersionUID = 5418977243317382949L;
	
	@Id
	@Column(name = "RCCODECIRCUIT",length = 1,nullable = false)
	private String  rccodecircuit;
	@Id
	@Column(name ="RCSPECIALISATION",length = 1,nullable = false)
	private String rcspecialisation;
    
    @Column(name = "RCNBREUNITEVISITE",nullable = false)
    private Integer rcnbreunitevisite;
    
    @ManyToOne
	@JoinColumn(name="RCCODECIRCUIT",insertable=false, updatable=false)
	private CircuitVisite circuitVisite;
    
   
	public CircuitVisite getCircuitvisite() {
		return circuitVisite;
	}

	public void setCircuitvisite(CircuitVisite circuitVisite) {
		this.circuitVisite = circuitVisite;
	}

	public UniteVisite(){
		
	}
	
	public String getRccodecircuit() {
		return rccodecircuit;
	}

	public void setRccodecircuit(String rccodecircuit) {
		this.rccodecircuit = rccodecircuit;
	}

	public String getRcspecialisation() {
		return rcspecialisation;
	}

	public void setRcspecialisation(String rcspecialisation) {
		this.rcspecialisation = rcspecialisation;
	}

    public Integer getRcnbreunitevisite() {
        return rcnbreunitevisite;
    }

  
	public void setRcnbreunitevisite(Integer rcnbreunitevisite) {
        this.rcnbreunitevisite = rcnbreunitevisite;
    }
       
}
