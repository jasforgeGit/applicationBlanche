package sn.com.douane.ejb.rc.model.keys;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;

public class HReglementExportKey implements Serializable{

	private static final long serialVersionUID = 8169186534791803033L;

	@Column(name="RCCODEPROD" , length=6, nullable=false)
	private String rcCodeProd;
	
	@Column(name="RCPRECUEMOA", length=2, nullable=false)
    private String rcPrecUemoa; 
    
    @Column(name="RCPRECSENEGAL", length=2, nullable=false)
    private String rcPrecSenegal; 
    
    @Column(name="RCCODEEXP", length=1, nullable=false)
    private String rcCodeExp;
    
    @Column(name="RCCODEUSERMAJ", length=8, nullable=false)
    private String rcCodeUserMaj;
    
    @Column(name="RCTERMINALMAJ", length=70, nullable=false)
    private String rcTerminalMaj;
    
    @Column(name="RCDATEMAJ", nullable=false)
    private Date rcDateMaj; 
    
    public HReglementExportKey()  {
    	
    }

	public HReglementExportKey(String rcCodeProd, String rcPrecUemoa,
			String rcPrecSenegal, String rcCodeExp, String rcCodeUserMaj,
			String rcTerminalMaj, Date rcDateMaj) {
		super();
		this.rcCodeProd = rcCodeProd;
		this.rcPrecUemoa = rcPrecUemoa;
		this.rcPrecSenegal = rcPrecSenegal;
		this.rcCodeExp = rcCodeExp;
		this.rcCodeUserMaj = rcCodeUserMaj;
		this.rcTerminalMaj = rcTerminalMaj;
		this.rcDateMaj = rcDateMaj;
	}
    
	/**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof HReglementExportKey) {
			HReglementExportKey o = (HReglementExportKey) otherKey;
			return ((this.rcCodeProd.equals(o.rcCodeProd))
					&& (this.rcPrecUemoa.equals(o.rcPrecUemoa))
					&& (this.rcPrecSenegal.equals(o.rcPrecSenegal))
					&& (this.rcCodeExp.equals(o.rcCodeExp))
					&& (this.rcCodeUserMaj.equals(o.rcCodeUserMaj))
					&& (this.rcTerminalMaj.equals(o.rcTerminalMaj)) 
					&& (this.rcDateMaj.equals(o.rcDateMaj)));
		}
		return false;
	}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rcCodeProd.hashCode() + rcPrecUemoa.hashCode()
				+ rcPrecSenegal.hashCode() + rcCodeExp.hashCode()
				+ rcCodeUserMaj.hashCode() + rcTerminalMaj.hashCode() 
				+ rcDateMaj.hashCode());
	}
}
