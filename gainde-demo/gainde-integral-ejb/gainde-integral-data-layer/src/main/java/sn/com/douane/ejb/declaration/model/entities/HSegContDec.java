package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.HSegContDecKey;

/**
 * @author thouraya
 * Bean implementation class for Enterprise Bean: Hsegcontdec
 */

@Entity()
@IdClass(HSegContDecKey.class)
@Table(name = "HSEGCONTDEC")

public class HSegContDec implements Serializable{

	private static final long serialVersionUID = -6946619198772144548L;

	@Id @Column(name = "DECDATEARCHIVE" , nullable = false)
	private Timestamp decDateArchive;

	@Id @Column(name = "DECANNEEENREGDEC" , length = 4 , nullable = false)
	private String decAnneeEnregDec;

	@Id @Column(name = "DECBURENREGDEC" , length = 3 , nullable = false)
	private String decBurEnregDec;

	@Id @Column(name = "DECNUMDECLARATION" , nullable = false)
	private Integer decNumDeclaration;

	@Id @Column(name = "DECNUMARTDEC" , nullable = false)
	private Integer decNumArtDec;

	@Id @Column(name = "DECNUMARTCONTENEUR" , nullable = false)
	private Integer decNumArtConteneur;

	@Column(name = "DECNUMCONTENEUR" , length = 11)
	private String decNumConteneur;

	@Column(name = "DECTYPECONTENEUR" , length = 4)
	private String decTypeConteneur;

	@Column(name = "DECTAILLECONTENEUR" , length = 8)
	private String decTailleConteneur;

	@Column(name = "DECNUMEROPLOMB" , length = 8)
	private String decNumeroPlomb;

	@Column(name = "DECNUMCHASSIS" , length = 17)
	private String decNumChassis;

	@ManyToOne(targetEntity = HSegArtDec.class)
	@JoinColumns({
			@JoinColumn(name = "DECDATEARCHIVE", referencedColumnName = "DECDATEARCHIVE", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECANNEEENREGDEC", referencedColumnName = "DECANNEEENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECBURENREGDEC", referencedColumnName = "DECBURENREGDEC", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMDECLARATION", referencedColumnName = "DECNUMDECLARATION", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "DECNUMARTDEC", referencedColumnName = "DECNUMARTDEC", insertable = false, updatable = false, nullable = false)})
	private HSegArtDec hSegArtDec;


	public HSegContDec(Timestamp decDateArchive , String decAnneeEnregDec , String decBurEnregDec , Integer decNumDeclaration , Integer decNumArtDec , Integer decNumArtConteneur){
		this.decDateArchive = decDateArchive;
		this.decAnneeEnregDec = decAnneeEnregDec;
		this.decBurEnregDec = decBurEnregDec;
		this.decNumDeclaration = decNumDeclaration;
		this.decNumArtDec = decNumArtDec;
		this.decNumArtConteneur = decNumArtConteneur;
	}


	public HSegContDec() {
	}


	public Timestamp getDecDateArchive() {
		return decDateArchive;
	}


	public void setDecDateArchive(Timestamp decDateArchive) {
		this.decDateArchive = decDateArchive;
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


	public Integer getDecNumArtDec() {
		return decNumArtDec;
	}


	public void setDecNumArtDec(Integer decNumArtDec) {
		this.decNumArtDec = decNumArtDec;
	}


	public Integer getDecNumArtConteneur() {
		return decNumArtConteneur;
	}


	public void setDecNumArtConteneur(Integer decNumArtConteneur) {
		this.decNumArtConteneur = decNumArtConteneur;
	}


	public String getDecNumConteneur() {
		return decNumConteneur;
	}


	public void setDecNumConteneur(String decNumConteneur) {
		this.decNumConteneur = decNumConteneur;
	}


	public String getDecTypeConteneur() {
		return decTypeConteneur;
	}


	public void setDecTypeConteneur(String decTypeConteneur) {
		this.decTypeConteneur = decTypeConteneur;
	}


	public String getDecTailleConteneur() {
		return decTailleConteneur;
	}


	public void setDecTailleConteneur(String decTailleConteneur) {
		this.decTailleConteneur = decTailleConteneur;
	}


	public String getDecNumeroPlomb() {
		return decNumeroPlomb;
	}


	public void setDecNumeroPlomb(String decNumeroPlomb) {
		this.decNumeroPlomb = decNumeroPlomb;
	}


	public String getDecNumChassis() {
		return decNumChassis;
	}


	public void setDecNumChassis(String decNumChassis) {
		this.decNumChassis = decNumChassis;
	}


	public HSegArtDec gethSegArtDec() {
		return hSegArtDec;
	}


	public void sethSegArtDec(HSegArtDec hSegArtDec) {
		this.hSegArtDec = hSegArtDec;
	}


}