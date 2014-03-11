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
 * GenreBureau EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "GENREBUREAU")
public class GenreBureau implements Serializable {
	
	private static final long serialVersionUID = 4914656502583956438L;
	
	@Id	
	@Column(name = "RCGENREBUREAU", length = 10, nullable=false)
	private String rcgenrebureau ;
	
	@Column(name = "RCDESGENREBUREAU", length=100, nullable=false)
    private String rcdesgenrebureau;	
	
	@OneToMany(mappedBy = "genreBureau")
    private List<BureauDouane> bureauxDouane = new ArrayList<BureauDouane>();
	
	
    /**
     * 0-args constructor.
     */
    public GenreBureau() { }

	/**
	 * 1-arg Constructor.
	 */
	public GenreBureau (String rcgenrebureau) {
		super();
		this.rcgenrebureau=rcgenrebureau;
	}

    public GenreBureau(String rcgenrebureau, String rcdesgenrebureau) {
		super();
		this.rcgenrebureau = rcgenrebureau;
		this.rcdesgenrebureau = rcdesgenrebureau;
	}

	/**
	 * Get accessor for persistent attribute: rcgenrebureau
	 */	
    public String getRcgenrebureau() {
        return rcgenrebureau;
    }

    /**
	 * Set accessor for persistent attribute: rcgenrebureau
	 */
	public void setRcgenrebureau(String rcgenrebureau) {
        this.rcgenrebureau = rcgenrebureau;
    }

    /**
	 * Get accessor for persistent attribute: rcdesgenrebureau
	 */	
    public String getRcdesgenrebureau() {
        return rcdesgenrebureau;
    }

    /**
	 * Set accessor for persistent attribute: rcdesgenrebureau
	 */
	public void setRcdesgenrebureau(String rcdesgenrebureau) {
        this.rcdesgenrebureau = rcdesgenrebureau;
    }

	public void setBureauxDouane(List<BureauDouane> bureauxDouane) {
		this.bureauxDouane = bureauxDouane;
	}
	
	public List<BureauDouane> getBureauxDouane() {
		return bureauxDouane;
	}

	
}
