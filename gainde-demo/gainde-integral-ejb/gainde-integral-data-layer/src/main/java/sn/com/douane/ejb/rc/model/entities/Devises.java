package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;
import sn.com.douane.ejb.declaration.model.entities.HSegArtDec;
import sn.com.douane.ejb.declaration.model.entities.SegArtDec;

@Entity
@Table(name = "DEVISES")
public class Devises implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 9190842137422977142L;

	@Id
	@Column(name = "RCCODEDEVISE", length = 3, nullable = false)
	private java.lang.String rccodedevise;

	@Column(name = "RCDATEDEVISE", nullable = false)
	private java.sql.Date rcdatedevise;

	@Column(name = "RCLIBELLEDEVISE", length = 100, nullable = false)
	private java.lang.String rclibelledevise;

	@Column(name = "RCQTEDEVISE", columnDefinition = "DECIMAL(9 , 0)", nullable = false)
	private java.math.BigDecimal rcqtedevise;

	@Column(name = "RCQTECFA", columnDefinition = "DECIMAL(9 , 0)", nullable = false)
	private java.math.BigDecimal rcqtecfa;

	@Column(name = "RCCOEFFICIENT", nullable = false)
	private java.lang.Integer rccoefficient;

	@Column(name = "RCUSERMODIF", length = 8, nullable = false)
	private java.lang.String rcusermodif;

	@Column(name = "RCPRECISIONDEV", nullable = false)
	private java.lang.Integer rcprecisiondev;

	@OneToMany(mappedBy = "devises", targetEntity = Pays.class)
	private List<Pays> pays = new ArrayList<Pays>();

	@OneToMany(mappedBy = "devisesAssur", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonDeviseAssur;

	@OneToMany(mappedBy = "devisesAutreeLem", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonDeviseAutre;

	@OneToMany(mappedBy = "devisesFret", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonDeviseFret;

	@OneToMany(mappedBy = "devisesFob", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonDeviseFob;
	
	@OneToMany(mappedBy = "devisesAssur", targetEntity = SegArtDec.class)
	private List<SegArtDec> listSegArtDec;
	
	@OneToMany(mappedBy = "devise", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtDec;
	

	public Devises() {
	}

	public Devises(String rccodedevise) {
		setRccodedevise(rccodedevise);
		return;
	}

	public Devises(String rccodedevise, Date rcdatedevise,
			String rclibelledevise, BigDecimal rcqtedevise,
			BigDecimal rcqtecfa, Integer rccoefficient, String rcusermodif,
			Integer rcprecisiondev) {
		super();
		this.rccodedevise = rccodedevise;
		this.rcdatedevise = rcdatedevise;
		this.rclibelledevise = rclibelledevise;
		this.rcqtedevise = rcqtedevise;
		this.rcqtecfa = rcqtecfa;
		this.rccoefficient = rccoefficient;
		this.rcusermodif = rcusermodif;
		this.rcprecisiondev = rcprecisiondev;

	}

	public String getRccodedevise() {
		return rccodedevise;
	}

	public void setRccodedevise(String rccodedevise) {
		this.rccodedevise = rccodedevise;
	}

	public Date getRcdatedevise() {
		return rcdatedevise;
	}

	public void setRcdatedevise(Date rcdatedevise) {
		this.rcdatedevise = rcdatedevise;
	}

	public String getRclibelledevise() {
		return rclibelledevise;
	}

	public void setRclibelledevise(String rclibelledevise) {
		this.rclibelledevise = rclibelledevise;
	}

	public BigDecimal getRcqtedevise() {
		return rcqtedevise;
	}

	public void setRcqtedevise(BigDecimal rcqtedevise) {
		this.rcqtedevise = rcqtedevise;
	}

	public BigDecimal getRcqtecfa() {
		return rcqtecfa;
	}

	public void setRcqtecfa(BigDecimal rcqtecfa) {
		this.rcqtecfa = rcqtecfa;
	}

	public Integer getRccoefficient() {
		return rccoefficient;
	}

	public void setRccoefficient(Integer rccoefficient) {
		this.rccoefficient = rccoefficient;
	}

	public String getRcusermodif() {
		return rcusermodif;
	}

	public void setRcusermodif(String rcusermodif) {
		this.rcusermodif = rcusermodif;
	}

	public Integer getRcprecisiondev() {
		return rcprecisiondev;
	}

	public void setRcprecisiondev(Integer rcprecisiondev) {
		this.rcprecisiondev = rcprecisiondev;
	}

	public List<Pays> getPays() {
		return pays;
	}

	public void setPays(List<Pays> pays) {
		this.pays = pays;
	}

	public List<BrouillonArtDec> getListBrouillonDeviseAssur() {
		return listBrouillonDeviseAssur;
	}

	public void setListBrouillonDeviseAssur(
			List<BrouillonArtDec> listBrouillonDeviseAssur) {
		this.listBrouillonDeviseAssur = listBrouillonDeviseAssur;
	}

	public List<BrouillonArtDec> getListBrouillonDeviseAutre() {
		return listBrouillonDeviseAutre;
	}

	public void setListBrouillonDeviseAutre(
			List<BrouillonArtDec> listBrouillonDeviseAutre) {
		this.listBrouillonDeviseAutre = listBrouillonDeviseAutre;
	}

	public List<BrouillonArtDec> getListBrouillonDeviseFret() {
		return listBrouillonDeviseFret;
	}

	public void setListBrouillonDeviseFret(
			List<BrouillonArtDec> listBrouillonDeviseFret) {
		this.listBrouillonDeviseFret = listBrouillonDeviseFret;
	}

	public List<BrouillonArtDec> getListBrouillonDeviseFob() {
		return listBrouillonDeviseFob;
	}

	public void setListBrouillonDeviseFob(
			List<BrouillonArtDec> listBrouillonDeviseFob) {
		this.listBrouillonDeviseFob = listBrouillonDeviseFob;
	}

	public List<SegArtDec> getListSegArtDec() {
		return listSegArtDec;
	}

	public void setListSegArtDec(List<SegArtDec> listSegArtDec) {
		this.listSegArtDec = listSegArtDec;
	}

	public List<HSegArtDec> getListHSegArtDec() {
		return listHSegArtDec;
	}

	public void setListHSegArtDec(List<HSegArtDec> listHSegArtDec) {
		this.listHSegArtDec = listHSegArtDec;
	}

}