package  sn.com.douane.ejb.declaration.model.keys;


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * Key class for Entity Bean: SegContDecKey
 */
public class SegContDecKey implements Serializable {
    
	private static final long serialVersionUID = 518081036665415824L;

	@Id @Column(name="DECANNEEENREGDEC",length=4, nullable=false)
	private String decAnneeEnregDec;
	
	@Id @Column(name="DECNUMARTCONTENEUR",nullable=false)
    private Integer decNumArtConteneur;
    
    @Id @Column(name="DECBURENREGDEC",length=3, nullable=false)
    private String decBurEnregDec;
    
    @Id @Column(name="DECNUMDECLARATION",nullable=false)
    private Integer decNumDeclaration;
    
    @Id @Column(name="DECNUMARTDEC",nullable=false)
    private Integer decNumArtDec;
    
    public SegContDecKey() {
    }

    public SegContDecKey(String decAnneeEnregDec, Integer decNumArtConteneur, String decBurEnregDec, Integer decNumDeclaration, Integer decNumArtDec) {
    	this.decAnneeEnregDec = decAnneeEnregDec;
    	this.decNumArtConteneur = decNumArtConteneur;
    	this.decBurEnregDec = decBurEnregDec;
    	this.decNumDeclaration = decNumDeclaration;
    	this.decNumArtDec = decNumArtDec;
    }

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
	}

	public Integer getDecNumArtConteneur() {
		return decNumArtConteneur;
	}

	public void setDecNumArtConteneur(Integer decNumArtConteneur) {
		this.decNumArtConteneur = decNumArtConteneur;
	}

	public String getDecBurEnregDec() {
		return decBurEnregDec;
	}

	public void setDecBurEnregDec(String decBurEnregDec) {
		this.decBurEnregDec = decBurEnregDec;
	}

	public Integer getDecNumDeclaration() {
		return decNumDeclaration;
	}

	public void setDecNumDeclaration(Integer decNumDeclaration) {
		this.decNumDeclaration = decNumDeclaration;
	}

	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}

	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((decAnneeEnregDec == null) ? 0 : decAnneeEnregDec.hashCode());
		result = prime * result
				+ ((decBurEnregDec == null) ? 0 : decBurEnregDec.hashCode());
		result = prime
				* result
				+ ((decNumArtConteneur == null) ? 0 : decNumArtConteneur
						.hashCode());
		result = prime * result
				+ ((decNumArtDec == null) ? 0 : decNumArtDec.hashCode());
		result = prime
				* result
				+ ((decNumDeclaration == null) ? 0 : decNumDeclaration
						.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof SegContDecKey) {
			SegContDecKey o = (SegContDecKey) obj;
			return ((this.decNumArtDec.equals(o.decNumArtDec))
				&& (this.decAnneeEnregDec.equals(o.decAnneeEnregDec))
				&& (this.decBurEnregDec.equals(o.decBurEnregDec)) 
				&& (this.decNumArtConteneur.equals(o.decNumArtConteneur)) 
				&& (this.decNumDeclaration.equals(o.decNumDeclaration)));
		}
		return false;
	}
    
    
    
}