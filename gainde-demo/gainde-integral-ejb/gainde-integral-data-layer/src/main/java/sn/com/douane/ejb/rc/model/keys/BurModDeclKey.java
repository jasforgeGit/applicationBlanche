package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class BurModDeclKey implements Serializable{

	private static final long serialVersionUID = -2886889970769775858L;

	@Column(name="RCCODEBURDECL", length=3, nullable=false)
	private String rcCodeBurDecl;
		
	@Column(name="RCMODEDECL", length=4, nullable=false)
    private String rcModeDecl;
	
	public BurModDeclKey(){
		
	}

	public BurModDeclKey(String rcCodeBurDecl, String rcModeDecl) {
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
	
}
