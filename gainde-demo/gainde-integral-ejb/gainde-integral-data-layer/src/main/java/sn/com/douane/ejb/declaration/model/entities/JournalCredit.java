package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import sn.com.douane.ejb.declaration.model.keys.JournalCreditKey;
import sn.com.douane.ejb.rc.model.entities.TypeImputCredit;

/**
 * Bean implementation class for Enterprise Bean: Journalcredit
 */

@Entity()
@IdClass(JournalCreditKey.class)
@Table(name = "JOURNALCREDIT")
public class JournalCredit implements Serializable{

	private static final long serialVersionUID = -9019191229362409354L;

	@Id @Column(name = "DECCODECREDITAIRE", length = 3, nullable = false)
	private String decCodeCreditaire;

	@Id @Column(name = "DECDATEIMPUTATION", nullable = false)
	private Timestamp decDateImputation;

	@Column(name = "DECMONTANTIMPUTATION", columnDefinition="DECIMAL(11 , 0)", nullable = false)
	private BigDecimal decMontantImputation;

	@Column(name = "DECANNEEENREGDEC", length = 4, nullable = false)
	private String decAnneeEnregDec;

	@Column(name = "DECBURENREGDEC", length = 3, nullable = false)
	private String decBurEnregDec;

	@Column(name = "DECNUMDECLARATION", nullable = false)
	private Integer decNumDeclaration;

	@Column(name = "DECTYPEIMPUTATION", length = 1, nullable = false)
	private String decTypeImputation;

	@Column(name = "DECDOSSIERDEFREGLEMT", length = 30)
	private String decDossierDefReglemt;

	@Column(name = "DECUSERMVTCREDIT", columnDefinition="CHAR(8)", nullable = false)
	private String decUserMvtCredit;

	@Column(name = "DECTYPETRAITEMENT", length = 1)
	private String decTypeTraitement;
	
	@ManyToOne(targetEntity = TypeImputCredit.class)
	@JoinColumn(name = "DECTYPEIMPUTATION", insertable = false, updatable = false,nullable = false)
	private TypeImputCredit typeImputCredit;
	
	@Transient
	private String libTypeImputation;

	public JournalCredit(String decCodeCreditaire, Timestamp decDateImputation, BigDecimal decMontantImputation, String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration,String decTypeImputation, String decUserMvtCredit) {
		this.decCodeCreditaire = decCodeCreditaire;
		this.decDateImputation = decDateImputation;
		this.decMontantImputation = decMontantImputation;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decTypeImputation = decTypeImputation;
		this.decUserMvtCredit = decUserMvtCredit;
	}

	public JournalCredit() {
	}

	public String getDecCodeCreditaire() {
		return decCodeCreditaire;
	}

	public void setDecCodeCreditaire(String decCodeCreditaire) {
		this.decCodeCreditaire = decCodeCreditaire;
	}

	public Timestamp getDecDateImputation() {
		return decDateImputation;
	}

	public void setDecDateImputation(Timestamp decDateImputation) {
		this.decDateImputation = decDateImputation;
	}

	public BigDecimal getDecMontantImputation() {
		return decMontantImputation;
	}

	public void setDecMontantImputation(BigDecimal decMontantImputation) {
		this.decMontantImputation = decMontantImputation;
	}

	public String getDecAnneeEnregDec() {
		return decAnneeEnregDec;
	}

	public void setDecAnneeEnregDec(String decAnneeEnregDec) {
		this.decAnneeEnregDec = decAnneeEnregDec;
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

	public String getDecTypeImputation() {
		return decTypeImputation;
	}

	public void setDecTypeImputation(String decTypeImputation) {
		this.decTypeImputation = decTypeImputation;
	}

	public String getDecDossierDefReglemt() {
		return decDossierDefReglemt;
	}

	public void setDecDossierDefReglemt(String decDossierDefReglemt) {
		this.decDossierDefReglemt = decDossierDefReglemt;
	}

	public String getDecUserMvtCredit() {
		return decUserMvtCredit;
	}

	public void setDecUserMvtCredit(String decUserMvtCredit) {
		this.decUserMvtCredit = decUserMvtCredit;
	}

	public String getDecTypeTraitement() {
		return decTypeTraitement;
	}

	public void setDecTypeTraitement(String decTypeTraitement) {
		this.decTypeTraitement = decTypeTraitement;
	}

	public TypeImputCredit getTypeImputCredit() {
		return typeImputCredit;
	}

	public void setTypeImputCredit(TypeImputCredit typeImputCredit) {
		this.typeImputCredit = typeImputCredit;
	}

	public String getLibTypeImputation() {
		return libTypeImputation;
	}

	public void setLibTypeImputation(String libTypeImputation) {
		this.libTypeImputation = libTypeImputation;
	}
	
	
}