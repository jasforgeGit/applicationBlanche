package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.DdeModifSegartDec;
import sn.com.douane.ejb.declaration.model.entities.SegArtDec;

@Entity
@Table(name = "BUREAUFRANCHISE")
public class BureauFranchise implements Serializable {

	/**
		 * 
		 */
	private static final long serialVersionUID = -7079574833022341370L;

	@Id
	@Column(name = "RCCODEBURFRANCHISE", length = 3, nullable = false)
	private String rcCodeBurFranchise;

	@Column(name = "RCLIBBURFRANCHISE", length = 100, nullable = false)
	private String rcLibBurFranchise;

	@OneToMany(mappedBy = "bureauFranchise", targetEntity = TitreExoneration.class)
	private List<TitreExoneration> titreExoneration = new ArrayList<TitreExoneration>();

	@OneToMany(mappedBy = "bureauFranchise", targetEntity = DdeModifSegartDec.class)
	private List<DdeModifSegartDec> listDdeModifSegArt;

	@OneToMany(mappedBy = "bureauFranchise", targetEntity = SegArtDec.class)
	private List<SegArtDec> listSegArtDec;

	public BureauFranchise() {

	}

	public BureauFranchise(String rccodeburfranchise) {
		this.rcCodeBurFranchise = rccodeburfranchise;
	}

	public BureauFranchise(String rccodeburfranchise, String rclibburfranchise) {
		this.rcCodeBurFranchise = rccodeburfranchise;
		this.rcLibBurFranchise = rclibburfranchise;
	}

	public String getRcCodeBurFranchise() {
		return rcCodeBurFranchise;
	}

	public void setRcCodeBurFranchise(String rcCodeBurFranchise) {
		this.rcCodeBurFranchise = rcCodeBurFranchise;
	}

	public String getRcLibBurFranchise() {
		return rcLibBurFranchise;
	}

	public void setRcLibBurFranchise(String rcLibBurFranchise) {
		this.rcLibBurFranchise = rcLibBurFranchise;
	}

	public List<TitreExoneration> getTitreExoneration() {
		return titreExoneration;
	}

	public void setTitreExoneration(List<TitreExoneration> titreExoneration) {
		this.titreExoneration = titreExoneration;
	}

	public List<DdeModifSegartDec> getListDdeModifSegArt() {
		return listDdeModifSegArt;
	}

	public void setListDdeModifSegArt(List<DdeModifSegartDec> listDdeModifSegArt) {
		this.listDdeModifSegArt = listDdeModifSegArt;
	}

	public List<SegArtDec> getListSegArtDec() {
		return listSegArtDec;
	}

	public void setListSegArtDec(List<SegArtDec> listSegArtDec) {
		this.listSegArtDec = listSegArtDec;
	}

}
