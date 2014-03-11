package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "LANGUE")
public class Langue implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5895481716599140139L;

	@Id
	@Column(name = "RCCODELANGUE",length = 3,nullable = false)
    private String rccodelangue;
	
	@Column(name = "LIBELLELANGUE",length = 50,nullable = false)
    private String libellelangue;
    
	@OneToMany(mappedBy = "langue", targetEntity = Pays.class)
    private List<Pays> pays = new ArrayList<Pays>();

	public Langue(){
		
	}
	
	public Langue(String rccodelangue) {
				super();
				this.rccodelangue=rccodelangue;
	}

   
	public Langue(String rccodelangue, String libellelangue) {
		super();
		this.rccodelangue=rccodelangue;
		this.libellelangue=libellelangue;
	}

   
    public String getRccodelangue() {
        return rccodelangue;
    }

	public void setRccodelangue(String rccodelangue) {
        this.rccodelangue = rccodelangue;
    }

  
    public java.lang.String getLibellelangue() {
        return libellelangue;
    }

    
	public void setLibellelangue(java.lang.String libellelangue) {
        this.libellelangue = libellelangue;
    }
  
	
    public List<Pays> getPays() {
        return pays;
    }

    
	public void setPays(List<Pays> pays) {
        this.pays = pays;
    }

   
}
