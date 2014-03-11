package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.keys.BurModDeclKey;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@IdClass(BurModDeclKey.class)
@Table(name="BURMODDECL")
public class BurModDecl implements Serializable{

	private static final long serialVersionUID = -7562637416515522259L;

	@Id
	@Column(name="RCCODEBURDECL", length=3, nullable=false)
	private String rcCodeBurDecl;
	
	@Id
	@Column(name="RCMODEDECL", length=4, nullable=false)
    private String rcModeDecl;
	
	@ManyToOne(targetEntity= BureauDouane.class)
	@JoinColumn(name="rcCodeBurDecl", insertable=false, updatable=false)
	private BureauDouane burDouane; 
	
	@ManyToOne(targetEntity= ModeDeclaration.class)
	@JoinColumn(name="rcModeDecl", insertable=false, updatable=false)
	private ModeDeclaration modeDecl ; 
	
	public BurModDecl(){
		
	}

	public BurModDecl(String rcCodeBurDecl, String rcModeDecl) {
		super();
		this.rcCodeBurDecl = rcCodeBurDecl;
		this.rcModeDecl = rcModeDecl;
	}

	public String getRcCodeBurDecl() {
		return rcCodeBurDecl;
	}

	public void setRcCodeBurDecl(String rcCodeBurDecl) {
		this.rcCodeBurDecl = rcCodeBurDecl;
	}

	public String getRcModeDecl() {
		return rcModeDecl;
	}

	public void setRcModeDecl(String rcModeDecl) {
		this.rcModeDecl = rcModeDecl;
	}

	public BureauDouane getBurDouane() {
		return burDouane;
	}

	public void setBurDouane(BureauDouane burDouane) {
		this.burDouane = burDouane;
	}

	public ModeDeclaration getModeDecl() {
		return modeDecl;
	}

	public void setModeDecl(ModeDeclaration modeDecl) {
		this.modeDecl = modeDecl;
	}
	
	
}
