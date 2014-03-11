package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.NamedQueries; 
import javax.persistence.NamedQuery;
import javax.persistence.Column;

import sn.com.douane.ejb.rc.model.keys.RegdouModeDeclKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(RegdouModeDeclKey.class)
@Table(name="REGDOUMODEDECL")
@NamedQueries(@NamedQuery(
		name = "findDeclarationByRegimedouanier", 
		query = "select object(o) from RegDouModeDecl o " +
				"where o.rcTypeRegime = ?1 " +
				"and o.rcCodeRegimeDouanier = ?2"))
public class RegDouModeDecl implements Serializable{

	private static final long serialVersionUID = -2246136352917957565L;
	
	@Id
	@Column(name="RCTYPEREGIME", length=1, nullable=false)
	private String rcTypeRegime;

	@Id
	@Column(name="RCCODEREGIMEDOUANIER", length=1, nullable=false)
	private String rcCodeRegimeDouanier; 
	
	@Id
	@Column(name="RCCODEMODEDECLARATION", length=4, nullable=false)
	private String rcCodeModeDeclaration;
	 
	@ManyToOne(targetEntity = ModeDeclaration.class)
	@JoinColumn(name="rcCodeModeDeclaration", updatable=false, insertable=false, nullable= false)
	private ModeDeclaration modeDeclRegDecl;
	  
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({
    	@JoinColumn(name="RCTYPEREGIME", referencedColumnName="RCTYPEREGIME", updatable=false, insertable=false, nullable= false),
    	@JoinColumn(name="RCCODEREGIMEDOUANIER", referencedColumnName="RCCODEREGIMEDOUANIER", updatable=false, insertable=false, nullable= false)})
	private RegimeDouanier regDouModDecl;

	/**
	 * 0-args constructor
	 */
	public RegDouModeDecl() {
		
	}

	/**
	 * 3-args constructor
	 * @param rcTypeRegime
	 * @param rcCodeRegimeDouanier
	 * @param rcCodeModeDec
	 */
	public RegDouModeDecl(String rcTypeRegime, String rcCodeRegimeDouanier,
			String rcCodeModeDeclaration) {
		super();
		this.rcTypeRegime = rcTypeRegime;
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
		this.rcCodeModeDeclaration = rcCodeModeDeclaration;
	}


	public String getRcTypeRegime() {
		return rcTypeRegime;
	}


	public void setRcTypeRegime(String rcTypeRegime) {
		this.rcTypeRegime = rcTypeRegime;
	}


	public ModeDeclaration getModeDeclRegDecl() {
		return modeDeclRegDecl;
	}


	public void setModeDeclRegDecl(ModeDeclaration modeDeclRegDecl) {
		this.modeDeclRegDecl = modeDeclRegDecl;
	}


	public RegimeDouanier getRegDouModDecl() {
		return regDouModDecl;
	}


	public void setRegDouModDecl(RegimeDouanier regDouModDecl) {
		this.regDouModDecl = regDouModDecl;
	}


	public String getRcCodeRegimeDouanier() {
		return rcCodeRegimeDouanier;
	}


	public void setRcCodeRegimeDouanier(String rcCodeRegimeDouanier) {
		this.rcCodeRegimeDouanier = rcCodeRegimeDouanier;
	}


	public String getRcCodeModeDeclaration() {
		return rcCodeModeDeclaration;
	}


	public void setRcCodeModeDeclaration(String rcCodeModeDeclaration) {
		this.rcCodeModeDeclaration = rcCodeModeDeclaration;
	}
	

}
