package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.DdeModifSegartDec;
import sn.com.douane.ejb.demat.model.entities.DeclarationExt;

/**
 * 
 * @author nesrine
 * 
 */
@Entity
@Table(name = "MAD")
public class Mad implements Serializable {

	private static final long serialVersionUID = 386322172985547874L;

	@Id
	@Column(name = "CODEMAD", length = 10, nullable = false)
	private String codeMad;

	@Column(name = "CODETYPEMAD", length = 1, nullable = false)
	private String codeTypeMad;

	@Column(name = "INDLOTISSEMENT", length = 1, nullable = false)
	private String indLotissement;

	@Column(name = "CODEPPMMAD", length = 5, nullable = false)
	private String rcCodePpm;

	@Column(name = "AGREEMENTMAD", length = 5, nullable = false)
	private String agreementMad;

	@Column(name = "DESIGNATIONMAD", length = 100, nullable = false)
	private String designationMad;

	@Column(name = "EMPLACEMENTMAD", length = 100)
	private String emplacementMad;

	@Column(name = "DATEAGREEMENTMAD")
	private Date dateAgreementMad;	

	@Column(name = "RCCODEBURDOUANE",columnDefinition="CHAR(3)",nullable = false)
	private String rcCodeBurdouane;
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "RCCODEBURDOUANE", insertable = false, updatable = false)
	private BureauDouane bureauDouane;

	@ManyToOne(targetEntity = Ppm.class)
	@JoinColumn(name = "CODEPPMMAD", insertable = false, updatable = false)
	private Ppm ppmMad;

	@ManyToOne(targetEntity = TypeMad.class)
	@JoinColumn(name = "CODETYPEMAD", insertable = false, updatable = false)
	private TypeMad typeMad;

	@OneToMany(mappedBy = "mad", targetEntity = DdeModifSegartDec.class)
	private List<DdeModifSegartDec> listDdeModifSegArt;
	
	@OneToMany(mappedBy = "codeMadProvenance", targetEntity = DeclarationExt.class)
	private List<DeclarationExt> listProvenanceDeclExt;
	
	@OneToMany(mappedBy = "codeMadDestination", targetEntity = DeclarationExt.class)
	private List<DeclarationExt> listDestinationDeclExt;
	

	public Mad() {

	}

	public Mad(String codeMad, String codeTypeMad, String indLotissement,
			String rcCodePpm, String agreementMad, String designationMad) {
		super();
		this.codeMad = codeMad;
		this.codeTypeMad = codeTypeMad;
		this.indLotissement = indLotissement;
		this.rcCodePpm = rcCodePpm;
		this.agreementMad = agreementMad;
		this.designationMad = designationMad;
	}

	public String getCodeMad() {
		return codeMad;
	}

	public void setCodeMad(String codeMad) {
		this.codeMad = codeMad;
	}

	public String getDesignationMad() {
		return designationMad;
	}

	public void setDesignationMad(String designationMad) {
		this.designationMad = designationMad;
	}

	public String getEmplacementMad() {
		return emplacementMad;
	}

	public void setEmplacementMad(String emplacementMad) {
		this.emplacementMad = emplacementMad;
	}

	public String getIndLotissement() {
		return indLotissement;
	}

	public void setIndLotissement(String indLotissement) {
		this.indLotissement = indLotissement;
	}

	public String getAgreementMad() {
		return agreementMad;
	}

	public void setAgreementMad(String agreementMad) {
		this.agreementMad = agreementMad;
	}

	public Date getDateAgreementMad() {
		return dateAgreementMad;
	}

	public void setDateAgreementMad(Date dateAgreementMad) {
		this.dateAgreementMad = dateAgreementMad;
	}

	public Ppm getPpmMad() {
		return ppmMad;
	}

	public void setPpmMad(Ppm ppmMad) {
		this.ppmMad = ppmMad;
	}

	public TypeMad getTypeMad() {
		return typeMad;
	}

	public void setTypeMad(TypeMad typeMad) {
		this.typeMad = typeMad;
	}

	public String getCodeTypeMad() {
		return codeTypeMad;
	}

	public void setCodeTypeMad(String codeTypeMad) {
		this.codeTypeMad = codeTypeMad;
	}

	public String getRcCodePpm() {
		return rcCodePpm;
	}

	public void setRcCodePpm(String rcCodePpm) {
		this.rcCodePpm = rcCodePpm;
	}

	public List<DdeModifSegartDec> getListDdeModifSegArt() {
		return listDdeModifSegArt;
	}

	public void setListDdeModifSegArt(List<DdeModifSegartDec> listDdeModifSegArt) {
		this.listDdeModifSegArt = listDdeModifSegArt;
	}

	public List<DeclarationExt> getListProvenanceDeclExt() {
		return listProvenanceDeclExt;
	}

	public void setListProvenanceDeclExt(List<DeclarationExt> listProvenanceDeclExt) {
		this.listProvenanceDeclExt = listProvenanceDeclExt;
	}

	public List<DeclarationExt> getListDestinationDeclExt() {
		return listDestinationDeclExt;
	}

	public void setListDestinationDeclExt(
			List<DeclarationExt> listDestinationDeclExt) {
		this.listDestinationDeclExt = listDestinationDeclExt;
	}

	public String getRcCodeBurdouane() {
		return rcCodeBurdouane;
	}

	public void setRcCodeBurdouane(String rcCodeBurdouane) {
		this.rcCodeBurdouane = rcCodeBurdouane;
	}

	public BureauDouane getBureauDouane() {
		return bureauDouane;
	}

	public void setBureauDouane(BureauDouane bureauDouane) {
		this.bureauDouane = bureauDouane;
	}	
	

}
