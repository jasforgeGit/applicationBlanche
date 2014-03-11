package sn.com.douane.ejb.demat.model.entities;



import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.rc.model.entities.BureauDouane;


@Entity
@Table(name = "AGENDA")
public class Agenda implements Serializable  {	
	
	private static final long serialVersionUID = -8991261413808677953L;
	

	@Id
	@Column(name = "IDAGENDA",nullable=false)
	private Long idAgenda;
	
	@Column(name = "VERSION", nullable=false)
	private Integer version;
	
	
	@Column(name = "LIBELLEAGENDA", length = 100)
	private String libelleAgenda;	
	
	
	@OneToMany(mappedBy = "agendas")
	private List<BureauDouane> listBureauDouane = new ArrayList<BureauDouane>();

	
	public String getLibelleAgenda() {
		return libelleAgenda;
	}
	
	public void setLibelleAgenda(String libelleAgenda) {
		this.libelleAgenda = libelleAgenda;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public Long getIdAgenda() {
		return idAgenda;
	}

	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;
	}

	public List<BureauDouane> getListBureauDouane() {
		return listBureauDouane;
	}

	public void setListBureauDouane(List<BureauDouane> listBureauDouane) {
		this.listBureauDouane = listBureauDouane;
	}		

	
}
