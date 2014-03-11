package sn.com.douane.ejb.rc.model.keys;

/**
 * Key class for Entity Bean: Produitspjt
 */
public class ProduitPieceJointeKey implements java.io.Serializable {	

    private static final long serialVersionUID = 3206093459760846163L;

	/**
	 * Implementation field for persistent attribute: rccodeproduit
	 */
    private String rccodeproduit;

	/**
	 * Implementation field for persistent attribute: rcprecuemoaprod
	 */
    private String rcprecuemoaprod;

	/**
	 * Implementation field for persistent attribute: rcprecsenprod
	 */
    private String rcprecsenprod;

	/**
	 * Implementation field for persistent attribute:
	 * ce_pjprodpj_rccodepiecejointe
	 */
    private String rccodepiecejointe;
	
    public String getRccodeproduit() {
        return rccodeproduit;
    }

    public void setRccodeproduit(String rccodeproduit) {
        this.rccodeproduit = rccodeproduit;
    }

    public String getRcprecuemoaprod() {
        return rcprecuemoaprod;
    }

    public void setRcprecuemoaprod(java.lang.String rcprecuemoaprod) {
        this.rcprecuemoaprod = rcprecuemoaprod;
    }

    public String getRcprecsenprod() {
        return rcprecsenprod;
    }

    public void setRcprecsenprod(java.lang.String rcprecsenprod) {
        this.rcprecsenprod = rcprecsenprod;
    }

   /**
	 * Returns true if both keys are equal.
	 */
	public boolean equals(java.lang.Object otherKey) {
		if (otherKey instanceof ProduitPieceJointeKey) {
			ProduitPieceJointeKey o = (ProduitPieceJointeKey) otherKey;
			return ((this.rccodeproduit.equals(o.rccodeproduit))
					&& (this.rcprecuemoaprod.equals(o.rcprecuemoaprod))
					&& (this.rcprecsenprod.equals(o.rcprecsenprod)) && (this.rccodepiecejointe
					.equals(o.rccodepiecejointe)));
		}
		return false;
	}

	public String getRccodepiecejointe() {
	return rccodepiecejointe;
}

public void setRccodepiecejointe(String rccodepiecejointe) {
	this.rccodepiecejointe = rccodepiecejointe;
}

	/**
	 * Returns the hash code for the key.
	 */
	public int hashCode() {
		return (rccodeproduit.hashCode() + rcprecuemoaprod.hashCode()
				+ rcprecsenprod.hashCode() + rccodepiecejointe.hashCode());
	}


}