package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.SegArtDec;
import sn.com.douane.ejb.manifeste.model.entities.ArticleManifeste;
import sn.com.douane.ejb.manifeste.model.entities.BrouillonSegArt;

@Entity
@Table(name = "MODECONDITIONNEMENT")
public class ModeConditionnement implements Serializable {

	private static final long serialVersionUID = 3347890043839629819L;

	@Id
	@Column(name = "RCCODEMODECOND", length = 4, nullable = false)
	private String rcCodeModeCond;

	@Column(name = "RCLIBELLEMODECOND", length = 40, nullable = false)
	private String rcLibelleModeCond;

	@OneToMany(mappedBy = "modeConditionnement", targetEntity = BrouillonSegArt.class)
	private List<BrouillonSegArt> listBrouillonSegart;

	@OneToMany(mappedBy = "modeCondionnement", targetEntity = SegArtDec.class)
	private List<SegArtDec> listSegArtDec;
	
	@OneToMany(mappedBy = "modeConditionnement", targetEntity = ArticleManifeste.class)
	private List<ArticleManifeste> listArticleManifeste;
	
	

	public ModeConditionnement() {

	}

	public ModeConditionnement(String rcCodeModeCond, String rcLibelleModeCond) {
		super();
		this.rcCodeModeCond = rcCodeModeCond;
		this.rcLibelleModeCond = rcLibelleModeCond;
	}

	public String getRcCodeModeCond() {
		return rcCodeModeCond;
	}

	public void setRcCodeModeCond(String rcCodeModeCond) {
		this.rcCodeModeCond = rcCodeModeCond;
	}

	public String getRcLibelleModeCond() {
		return rcLibelleModeCond;
	}

	public void setRcLibelleModeCond(String rcLibelleModeCond) {
		this.rcLibelleModeCond = rcLibelleModeCond;
	}

	public List<BrouillonSegArt> getListBrouillonSegart() {
		return listBrouillonSegart;
	}

	public void setListBrouillonSegart(List<BrouillonSegArt> listBrouillonSegart) {
		this.listBrouillonSegart = listBrouillonSegart;
	}

	public List<SegArtDec> getListSegArtDec() {
		return listSegArtDec;
	}

	public void setListSegArtDec(List<SegArtDec> listSegArtDec) {
		this.listSegArtDec = listSegArtDec;
	}

	public List<ArticleManifeste> getListArticleManifeste() {
		return listArticleManifeste;
	}

	public void setListArticleManifeste(List<ArticleManifeste> listArticleManifeste) {
		this.listArticleManifeste = listArticleManifeste;
	}
	
	

}
