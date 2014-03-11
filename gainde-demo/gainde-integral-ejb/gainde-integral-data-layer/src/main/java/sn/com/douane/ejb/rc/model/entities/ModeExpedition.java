package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="MODEEXPEDITION")
public class ModeExpedition implements Serializable{

	private static final long serialVersionUID = -8946863460667400003L;

	@Id
	@Column(name="RCMODEEXPEDITION", length=5, nullable=false)
	private String rcModeExpedition;
    
	@Column(name="RCLIBELLEEXPEDITION", length=250, nullable=false)
	private String rcLibelleExpedition;
	
	
	@OneToMany(mappedBy = "modeExpedition", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonArtDec;
	

	
	public ModeExpedition() {
	
	}

	public ModeExpedition(String rcModeExpedition, String rcLibelleExpedition) {
		super();
		this.rcModeExpedition = rcModeExpedition;
		this.rcLibelleExpedition = rcLibelleExpedition;
	}

	public String getRcModeExpedition() {
		return rcModeExpedition;
	}

	public void setRcModeExpedition(String rcModeExpedition) {
		this.rcModeExpedition = rcModeExpedition;
	}

	public String getRcLibelleExpedition() {
		return rcLibelleExpedition;
	}

	public void setRcLibelleExpedition(String rcLibelleExpedition) {
		this.rcLibelleExpedition = rcLibelleExpedition;
	}

	public List<BrouillonArtDec> getListBrouillonArtDec() {
		return listBrouillonArtDec;
	}

	public void setListBrouillonArtDec(List<BrouillonArtDec> listBrouillonArtDec) {
		this.listBrouillonArtDec = listBrouillonArtDec;
	}
	
	
}
