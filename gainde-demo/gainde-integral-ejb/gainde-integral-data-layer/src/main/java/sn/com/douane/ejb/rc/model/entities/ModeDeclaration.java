package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonSegGenDec;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "MODEDECLARATION")
public class ModeDeclaration implements Serializable {

	private static final long serialVersionUID = 8768474738968812161L;

	@Id
	@Column(name = "RCCODEMODEDEC", length = 4, nullable = false)
	private String rcCodeModeDec;

	@Column(name = "RCLIBELLEMODEDEC", length = 100)
	private String rcLibelleModeDec;

	@Column(name = "RCINDICATEURVALEUR", columnDefinition = "CHAR(1)", nullable = false)
	private String rcIndicateurValeur;

	@OneToMany(mappedBy = "modeDeclRegDecl", targetEntity = RegDouModeDecl.class, fetch = FetchType.LAZY)
	private List<RegDouModeDecl> regdouModeDecls;

	@OneToMany(mappedBy = "modeDeclValeur", targetEntity = ModeDeclValeur.class, fetch = FetchType.LAZY)
	private List<ModeDeclValeur> modeDeclValeurs;

	@OneToMany(mappedBy = "modeDecl", targetEntity = BurModDecl.class, fetch = FetchType.LAZY)
	private List<BurModDecl> burModeDecls = new ArrayList<BurModDecl>();
	
	@OneToMany(mappedBy = "modeDeclaration", targetEntity = BrouillonSegGenDec.class, fetch = FetchType.LAZY)
	private List<BrouillonSegGenDec> listBrouillonSegGenDec;
		

	/**
	 * 
	 */
	public ModeDeclaration() {
	}

	/**
	 * 
	 * @param rcCodeModeDec
	 * @param rcLibelleModeDec
	 */
	public ModeDeclaration(String rcCodeModeDec, String rcLibelleModeDec) {
		super();
		this.rcCodeModeDec = rcCodeModeDec;
		this.rcLibelleModeDec = rcLibelleModeDec;
	}

	public ModeDeclaration(String rcCodeModeDec, String rcLibelleModeDec,
			String rcIndicateurValeur) {
		super();
		this.rcCodeModeDec = rcCodeModeDec;
		this.rcLibelleModeDec = rcLibelleModeDec;
		this.rcIndicateurValeur = rcIndicateurValeur;
	}

	/**
	 * 
	 * @return
	 */
	public String getRcCodeModeDec() {
		return rcCodeModeDec;
	}

	/**
	 * 
	 * @param rcCodeModeDec
	 */
	public void setRcCodeModeDec(String rcCodeModeDec) {
		this.rcCodeModeDec = rcCodeModeDec;
	}

	/**
	 * 
	 * @return
	 */
	public String getRcLibelleModeDec() {
		return rcLibelleModeDec;
	}

	/**
	 * 
	 * @param rcLibelleModeDec
	 */
	public void setRcLibelleModeDec(String rcLibelleModeDec) {
		this.rcLibelleModeDec = rcLibelleModeDec;
	}

	/**
	 * 
	 * @return
	 */
	public String getRcIndicateurValeur() {
		return rcIndicateurValeur;
	}

	/**
	 * 
	 * @param rcIndicateurValeur
	 */
	public void setRcIndicateurValeur(String rcIndicateurValeur) {
		this.rcIndicateurValeur = rcIndicateurValeur;
	}

	/**
	 * 
	 * @return
	 */
	public List<ModeDeclValeur> getModeDeclValeurs() {
		return modeDeclValeurs;
	}

	/**
	 * 
	 * @param modeDeclValeur
	 */
	public void setModeDeclValeurs(List<ModeDeclValeur> modeDeclValeurs) {
		this.modeDeclValeurs = modeDeclValeurs;
	}

	public List<RegDouModeDecl> getRegdouModeDecls() {
		return regdouModeDecls;
	}

	public void setRegdouModeDecls(List<RegDouModeDecl> regdouModeDecls) {
		this.regdouModeDecls = regdouModeDecls;
	}

	public List<BurModDecl> getBurModeDecls() {
		return burModeDecls;
	}

	public void setBurModeDecls(List<BurModDecl> burModeDecls) {
		this.burModeDecls = burModeDecls;
	}

	public List<BrouillonSegGenDec> getListBrouillonSegGenDec() {
		return listBrouillonSegGenDec;
	}

	public void setListBrouillonSegGenDec(List<BrouillonSegGenDec> listBrouillonSegGenDec) {
		this.listBrouillonSegGenDec = listBrouillonSegGenDec;
	}	

}
