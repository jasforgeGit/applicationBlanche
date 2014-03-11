package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.JournalCredit;

@Entity
@Table(name = "TYPEIMPUTCREDIT")
public class TypeImputCredit implements Serializable{

	private static final long serialVersionUID = 7609337621395721206L;

	@Id
	@Column(name = "RCCODETYPEIMPUTATION", length = 1, nullable = false)
	private String rcCodeTypeImputation;

	@Column(name = "RCLIBELLEIMPUTATION", length = 100, nullable = false)
	private String rcLibelleImputation;

	@OneToMany(mappedBy = "typeImputCredit", targetEntity = JournalCredit.class)
	private List<JournalCredit> journalCredit;

	public TypeImputCredit() {

	}

	public TypeImputCredit(String rcCodeTypeImputation,
			String rcLibelleImputation) {
		super();
		this.rcCodeTypeImputation = rcCodeTypeImputation;
		this.rcLibelleImputation = rcLibelleImputation;
	}

	/**
	 * @return the rcCodeTypeImputation
	 */
	public String getRcCodeTypeImputation() {
		return rcCodeTypeImputation;
	}

	/**
	 * @param rcCodeTypeImputation
	 *            the rcCodeTypeImputation to set
	 */
	public void setRcCodeTypeImputation(String rcCodeTypeImputation) {
		this.rcCodeTypeImputation = rcCodeTypeImputation;
	}

	/**
	 * @return the rcLibelleImputation
	 */
	public String getRcLibelleImputation() {
		return rcLibelleImputation;
	}

	/**
	 * @param rcLibelleImputation
	 *            the rcLibelleImputation to set
	 */
	public void setRcLibelleImputation(String rcLibelleImputation) {
		this.rcLibelleImputation = rcLibelleImputation;
	}

	public List<JournalCredit> getJournalCredit() {
		return journalCredit;
	}

	public void setJournalCredit(List<JournalCredit> journalCredit) {
		this.journalCredit = journalCredit;
	}

}
