package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPELIQUIDATIONSUPP")
public class TypeLiquidationSupp implements Serializable{

	private static final long serialVersionUID = -8102926140824337386L;

	@Id
	@Column(name="RCCODETYPELIQSUPP", length=1, nullable=false)
	private String rcCodeTypeLiqSupp;
	
	@Column(name="RCLIBELLELIQSUPP", length=100, nullable=false)
    private String rcLibelleLiqSupp;
	
	public TypeLiquidationSupp() {

	}

	public TypeLiquidationSupp(String rcCodeTypeLiqSupp, String rcLibelleLiqSupp) {
		super();
		this.rcCodeTypeLiqSupp = rcCodeTypeLiqSupp;
		this.rcLibelleLiqSupp = rcLibelleLiqSupp;
	}

	/**
	 * @return the rcCodeTypeLiqSupp
	 */
	public String getRcCodeTypeLiqSupp() {
		return rcCodeTypeLiqSupp;
	}

	/**
	 * @param rcCodeTypeLiqSupp the rcCodeTypeLiqSupp to set
	 */
	public void setRcCodeTypeLiqSupp(String rcCodeTypeLiqSupp) {
		this.rcCodeTypeLiqSupp = rcCodeTypeLiqSupp;
	}

	/**
	 * @return the rcLibelleLiqSupp
	 */
	public String getRcLibelleLiqSupp() {
		return rcLibelleLiqSupp;
	}

	/**
	 * @param rcLibelleLiqSupp the rcLibelleLiqSupp to set
	 */
	public void setRcLibelleLiqSupp(String rcLibelleLiqSupp) {
		this.rcLibelleLiqSupp = rcLibelleLiqSupp;
	}
}
