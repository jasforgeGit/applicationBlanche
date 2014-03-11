package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.manifeste.model.entities.BrouillonConteneurArt;
import sn.com.douane.ejb.manifeste.model.entities.ConteneurArticle;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="TYPECONTENEUR")
public class TypeConteneur implements Serializable {

	private static final long serialVersionUID = -5753996170323958446L;

	@Id
	@Column(name="RCCODETYPECONT", length=4, nullable=false)
	private String rcCodeTypeCont;
	 
	@Column(name="RCLIBELLETYPECONT", length=100, nullable=false) 
	private String rcLibelleTypeCont;
	
	@OneToMany(mappedBy = "typeContenur",targetEntity = BrouillonConteneurArt.class)
	private List<BrouillonConteneurArt> listBrouilloncontenur;
	
	
	@OneToMany(mappedBy = "typeConteneur",targetEntity = ConteneurArticle.class)
	private List<ConteneurArticle> listConteneurArticle;
	
	
	public TypeConteneur() {

	}

	public TypeConteneur(String rcCodeTypeCont, String rcLibelleTypeCont) {
		super();
		this.rcCodeTypeCont = rcCodeTypeCont;
		this.rcLibelleTypeCont = rcLibelleTypeCont;
	}

	public String getRcCodeTypeCont() {
		return rcCodeTypeCont;
	}

	public void setRcCodeTypeCont(String rcCodeTypeCont) {
		this.rcCodeTypeCont = rcCodeTypeCont;
	}

	public String getRcLibelleTypeCont() {
		return rcLibelleTypeCont;
	}

	public void setRcLibelleTypeCont(String rcLibelleTypeCont) {
		this.rcLibelleTypeCont = rcLibelleTypeCont;
	}

	public List<BrouillonConteneurArt> getListBrouilloncontenur() {
		return listBrouilloncontenur;
	}

	public void setListBrouilloncontenur(List<BrouillonConteneurArt> listBrouilloncontenur) {
		this.listBrouilloncontenur = listBrouilloncontenur;
	}

	public List<ConteneurArticle> getListConteneurArticle() {
		return listConteneurArticle;
	}

	public void setListConteneurArticle(List<ConteneurArticle> listConteneurArticle) {
		this.listConteneurArticle = listConteneurArticle;
	}
	
	 
}
