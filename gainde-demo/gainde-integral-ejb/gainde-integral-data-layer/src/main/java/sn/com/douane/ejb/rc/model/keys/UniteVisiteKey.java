package sn.com.douane.ejb.rc.model.keys;




public class UniteVisiteKey implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9129443487345549370L;

	private String rccodecircuit;	
	

	private String rcspecialisation;	
	
	
	public String getRcspecialisation() {
		return rcspecialisation;
	}


	public void setRcspecialisation(String rcspecialisation) {
		this.rcspecialisation = rcspecialisation;
	}

	public String getRccodecircuit() {
		return rccodecircuit;
	}


	public void setRccodecircuit(String rccodecircuit) {
		this.rccodecircuit = rccodecircuit;
	}
	
	
	public UniteVisiteKey() {
	}
	
	
	public UniteVisiteKey(String rccodecircuit2, String rcspecialisation2) {
		
		this.rccodecircuit = rccodecircuit2;
		this.rcspecialisation = rcspecialisation2;
	}


	public boolean equals(Object otherKey) {
		if (otherKey instanceof UniteVisiteKey) {
			UniteVisiteKey o = (UniteVisiteKey) otherKey;
			return ((this.rcspecialisation.equals(o.rcspecialisation)) 
			&& (this.rccodecircuit.equals(o.rccodecircuit)));
		}
		return false;
	}
	
	public int hashCode() {
		return (rcspecialisation.hashCode() + rccodecircuit.hashCode());
	}
	
}