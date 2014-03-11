package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PPMETRANGER")
public class PpmEtranger implements Serializable {
   

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "RCCODEPPMETRANGER",length = 11,nullable = false)
	private String rccodeppmetranger;
	
	@Column(name = "RCTITREPPMETRANGER",length = 3)
    private String rctitreppmetranger;
	
	@Column(name = "RCPRENOMPPMETRAN",length = 100)
    private String rcprenomppmetran;
    
	@Column(name = "RCNOMPPMETRANGER",length = 100)
	private String rcnomppmetranger;
	
	@Column(name = "RCTYPEVOIEPPMETRANGER",length = 10)
    private String rctypevoieppmetranger;
	
	@Column(name = "RCNOMVOIEPPMETRANGER",length = 50)
    private String rcnomvoieppmetranger;
	
	@Column(name = "RCNUMVPPMETRANGER",length = 5)
    private String rcnumvppmetranger;
    
	@Column(name = "RCQUARTIERPPM",length = 50)
	private String rcquartierppm;
    
	@Column(name = "RCVILLEPPMETRANGER",length = 50)
	private String rcvilleppmetranger;
    
	@Column(name = "RCBOITEPOSTALEPPM",length = 50)
	private String rcboitepostaleppm;
	
	@Column(name = "RCCODEPAYSETRANGER",length = 3,nullable = false)
	private String rccodepaysetranger;	   
	
	@ManyToOne(targetEntity = Pays.class)
    @JoinColumn(name="RCCODEPAYSETRANGER",insertable=false, updatable=false)
	private Pays pays;  
	

	public PpmEtranger() {
	 
	 }
	 
	public PpmEtranger(String rccodeppmetranger) {
		
	super();
	this.rccodeppmetranger =rccodeppmetranger;
	}  

	
    public String getRccodeppmetranger() {
        return rccodeppmetranger;
    }

  
	public void setRccodeppmetranger(
			String rccodeppmetranger) {
        this.rccodeppmetranger = rccodeppmetranger;
    }

  
    public String getRctitreppmetranger() {
        return rctitreppmetranger;
    }

  
	public void setRctitreppmetranger(
			String rctitreppmetranger) {
        this.rctitreppmetranger = rctitreppmetranger;
    }

 
    public String getRcprenomppmetran() {
        return rcprenomppmetran;
    }


	public void setRcprenomppmetran(
			String rcprenomppmetran) {
        this.rcprenomppmetran = rcprenomppmetran;
    }

  
    public String getRcnomppmetranger() {
        return rcnomppmetranger;
    }

 
	public void setRcnomppmetranger(
			String rcnomppmetranger) {
        this.rcnomppmetranger = rcnomppmetranger;
    }

  
    public String getRctypevoieppmetranger() {
        return rctypevoieppmetranger;
    }

 
	public void setRctypevoieppmetranger(
			String rctypevoieppmetranger) {
        this.rctypevoieppmetranger = rctypevoieppmetranger;
    }


    public String getRcnomvoieppmetranger() {
        return rcnomvoieppmetranger;
    }

 
	public void setRcnomvoieppmetranger(
			String rcnomvoieppmetranger) {
        this.rcnomvoieppmetranger = rcnomvoieppmetranger;
    }

 
    public String getRcnumvppmetranger() {
        return rcnumvppmetranger;
    }


	public void setRcnumvppmetranger(
			String rcnumvppmetranger) {
        this.rcnumvppmetranger = rcnumvppmetranger;
    }

    
    public String getRcquartierppm() {
        return rcquartierppm;
    }

   
	public void setRcquartierppm(String rcquartierppm) {
        this.rcquartierppm = rcquartierppm;
    }

   
    public String getRcvilleppmetranger() {
        return rcvilleppmetranger;
    }

   
	public void setRcvilleppmetranger(
			String rcvilleppmetranger) {
        this.rcvilleppmetranger = rcvilleppmetranger;
    }

   
    public String getRcboitepostaleppm() {
        return rcboitepostaleppm;
    }

 
	public void setRcboitepostaleppm(
			String rcboitepostaleppm) {
        this.rcboitepostaleppm = rcboitepostaleppm;
    }

   
	public String getRccodepaysetranger() {
		return rccodepaysetranger;
	}

	public void setRccodepaysetranger(String rccodepaysetranger) {
		this.rccodepaysetranger = rccodepaysetranger;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}
	
	
}
