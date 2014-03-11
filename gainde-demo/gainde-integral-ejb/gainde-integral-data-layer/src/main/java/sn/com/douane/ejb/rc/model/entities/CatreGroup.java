package sn.com.douane.ejb.rc.model.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


/**
 * BureauProduit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@Table(name = "CATREGROUP")
public class CatreGroup implements Serializable {
	
  	private static final long serialVersionUID = -4865988011376917503L;
  	
  	@Id
  	@Column(name = "RCCODECATREGROUP", length = 3, nullable = false)
	private String rcCodeCatreGroup;	
  	
  	@Column(name = "RCLIBCATREGROUP", length = 100, nullable = false)
    private String rcLibCatreGroup;    
  	
  	@OneToMany(mappedBy = "catreGroup")
    private List<CatreGroupPieceJointe> catreGroupPj = new ArrayList<CatreGroupPieceJointe>();
  	
  	/**
	 * Enable JPA optimstic lock.
	 */
//	@SuppressWarnings("unused")
//	@Version
//	@Column(nullable = false)
//	private int version;

  	/**
  	 * 0-args Constructor.
  	 */
    public CatreGroup() {
		super();		
	}
    
    /**
     * 1-arg Constructor.
     * 
     * @param rccodecatregroup
     */
    public CatreGroup(String rccodecatregroup) {
		super();
		this.rcCodeCatreGroup = rccodecatregroup;
	}    

	public String getRcCodeCatreGroup() {
		return rcCodeCatreGroup;
	}

	public void setRcCodeCatreGroup(String rcCodeCatreGroup) {
		this.rcCodeCatreGroup = rcCodeCatreGroup;
	}

	public String getRcLibCatreGroup() {
		return rcLibCatreGroup;
	}

	public void setRcLibCatreGroup(String rcLibCatreGroup) {
		this.rcLibCatreGroup = rcLibCatreGroup;
	}

	public List<CatreGroupPieceJointe> getCatreGroupPj() {
		return catreGroupPj;
	}

	public void setCatreGroupPj(List<CatreGroupPieceJointe> catreGroupPj) {
		this.catreGroupPj = catreGroupPj;
	}

}
