package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;

import javax.persistence.Column;

public class ScoreConsignataireKey implements Serializable {

	private static final long serialVersionUID = -627894831540171242L;

	@Column(name = "RCCODECONSIGNATAIRE", length = 3, nullable = false)
	private String rcCodeConsignataire;

	@Column(name = "RCCODEBUREAU", columnDefinition = "CHAR(3)", nullable = false)
	private String rcCodeBureau;

	public ScoreConsignataireKey() {

	}

	public String getRcCodeConsignataire() {
		return rcCodeConsignataire;
	}

	public void setRcCodeConsignataire(String rcCodeConsignataire) {
		this.rcCodeConsignataire = rcCodeConsignataire;
	}

	public String getRcCodeBureau() {
		return rcCodeBureau;
	}

	public void setRcCodeBureau(String rcCodeBureau) {
		this.rcCodeBureau = rcCodeBureau;
	}

	public ScoreConsignataireKey(String rcCodeConsignataire, String rcCodeBureau) {
		super();
		this.rcCodeConsignataire = rcCodeConsignataire;
		this.rcCodeBureau = rcCodeBureau;
	}

	
	public int hashCode() {
		return (rcCodeBureau.hashCode() + rcCodeConsignataire.hashCode());
	}

	
	public boolean equals(Object otherKey) {		
		if (otherKey instanceof ScoreConsignataireKey) {
			ScoreConsignataireKey o = (ScoreConsignataireKey) otherKey;
			return ((this.rcCodeBureau.equals(o.rcCodeBureau)) && (this.rcCodeConsignataire
					.equals(o.rcCodeConsignataire)));
		}
		return false; 
	}

	
}
