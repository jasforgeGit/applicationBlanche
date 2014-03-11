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
@Table(name = "NATUREFISCALITE")
public class NatureFiscalite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1582725107054302820L;


	@Id
	@Column(name = "RCCODEFISCALITE",length = 1,nullable = false)
    private java.lang.String rccodefiscalite;
	
	@Column(name = "RCDESFISCALITE",length = 100,nullable = false)
    private java.lang.String rcdesfiscalite;
    
	@OneToMany(mappedBy = "natureFiscalite", targetEntity = Pays.class)
    private List<Pays> pays = new ArrayList<Pays>();

    public NatureFiscalite() {
    	
	    }
    
	public NatureFiscalite(
            String rccodefiscalite) {
		super();
		this.rccodefiscalite=rccodefiscalite;
	}
		
	public NatureFiscalite(String rccodefiscalite,String rcdesfiscalite) {
		super();
		this.rccodefiscalite=rccodefiscalite;
		this.rcdesfiscalite=rcdesfiscalite;
	}

  
    public java.lang.String getRccodefiscalite() {
        return rccodefiscalite;
    }

	public void setRccodefiscalite(java.lang.String rccodefiscalite) {
        this.rccodefiscalite = rccodefiscalite;
    }

   
    public java.lang.String getRcdesfiscalite() {
        return rcdesfiscalite;
    }

   
	public void setRcdesfiscalite(java.lang.String rcdesfiscalite) {
        this.rcdesfiscalite = rcdesfiscalite;
    }

  
	
    public List<Pays> getPays() {
        return pays;
    }

    
	public void setPays(List<Pays> pays) {
        this.pays = pays;
    }



   
}
