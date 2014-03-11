package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="NBRECONNAISSEMENT")
public class NbreConnaissement implements Serializable {

	private static final long serialVersionUID = -5061280505323026016L;

	@Id
	@Column(name="RCCODENBRECONN", nullable=false)
	private Integer rcCodeNbreConn;
	
	@Column(name="RCINDDEBUTNBRECONN", nullable=false)
    private Integer rcIndDebutNbreConn;
	
	@Column(name="RCINDFINTNBRECONN", nullable=false)
    private Integer rcIndFintNbreConn;
	
	@Column(name="RCDDEBUTNBRECONN", nullable=false)
    private Date rcdDebutNbreConn;
    
	@Column(name="RCDFINNBRECONN")
	private Date rcdFinNbreConn;
    
	@Column(name="RCSCORENBRECONN", nullable=false)
	private Integer rcScoreNbreConn;

	public NbreConnaissement() {

	}

	public NbreConnaissement(Integer rcCodeNbreConn,
			Integer rcIndDebutNbreConn, Integer rcIndFintNbreConn,
			Date rcdDebutNbreConn, Integer rcScoreNbreConn) {
		super();
		this.rcCodeNbreConn = rcCodeNbreConn;
		this.rcIndDebutNbreConn = rcIndDebutNbreConn;
		this.rcIndFintNbreConn = rcIndFintNbreConn;
		this.rcdDebutNbreConn = rcdDebutNbreConn;
		this.rcScoreNbreConn = rcScoreNbreConn;
	}

	public Integer getRcCodeNbreConn() {
		return rcCodeNbreConn;
	}

	public void setRcCodeNbreConn(Integer rcCodeNbreConn) {
		this.rcCodeNbreConn = rcCodeNbreConn;
	}

	public Integer getRcIndDebutNbreConn() {
		return rcIndDebutNbreConn;
	}

	public void setRcIndDebutNbreConn(Integer rcIndDebutNbreConn) {
		this.rcIndDebutNbreConn = rcIndDebutNbreConn;
	}

	public Integer getRcIndFintNbreConn() {
		return rcIndFintNbreConn;
	}

	public void setRcIndFintNbreConn(Integer rcIndFintNbreConn) {
		this.rcIndFintNbreConn = rcIndFintNbreConn;
	}

	public Date getRcdDebutNbreConn() {
		return rcdDebutNbreConn;
	}

	public void setRcdDebutNbreConn(Date rcdDebutNbreConn) {
		this.rcdDebutNbreConn = rcdDebutNbreConn;
	}

	public Date getRcdFinNbreConn() {
		return rcdFinNbreConn;
	}

	public void setRcdFinNbreConn(Date rcdFinNbreConn) {
		this.rcdFinNbreConn = rcdFinNbreConn;
	}

	public Integer getRcScoreNbreConn() {
		return rcScoreNbreConn;
	}

	public void setRcScoreNbreConn(Integer rcScoreNbreConn) {
		this.rcScoreNbreConn = rcScoreNbreConn;
	}
	
	
}
