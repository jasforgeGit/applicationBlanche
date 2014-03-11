package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery; 
import javax.persistence.Table;

import sn.com.douane.ejb.demat.model.entities.UniteDeVisitePhysique;
/**
 * 
 * @author nesrine
 *
 */
@Entity
@Table(name="AGENTDOUANE")
@NamedQueries({
	@NamedQuery(name = "findAgentByCodeprofilBurAct", 
		query = "select object(o) from AgentDouane o " +
				"where  o.rcCodeProfil = ?1 and o.rcCodeBurAct = ?2"), 
	@NamedQuery(name = "findVerifBurAff", 
		query = "select object(o) from AgentDouane o " +
				"where  o.rcCodeBurAff = ?1 and o.rcCodeProfil = ?2 and o.rcCodeAgent = ?3"), 
	@NamedQuery(name = "findVerifBurActivite",
		query = "select object(o) from AgentDouane o " +
				"where  o.rcCodeBurAct = ?1 and o.rcCodeProfil = ?2 and o.rcCodeAgent = ?3")})
public class AgentDouane implements Serializable{

	private static final long serialVersionUID = 2091356732488636848L;

	@Id
	@Column(name="RCCODEAGENT", length=5, nullable=false)
	private String rcCodeAgent;
    
	@Column(name="RCCODEBURAFF", length=3, nullable=false)
	private String rcCodeBurAff;
	
	@Column(name="RCCODEPROFIL", length=10, nullable=false)
	private String rcCodeProfil;
	
	@Column(name="RCINDAUT", length=1, nullable=false)
    private String rcIndAut;
	
	@Column(name="RCCODEUSER", length=7, nullable=false)
	private String rcCodeUser;
	
	@Column(name="RCCODESECTION", length=3)
    private String rcCodeSection;
   
	@Column(name="RCCODEBURACT", length=3)
    private String rcCodeBurAct;
	
	@Column(name="RCREFAUT", length=15)
    private String rcRefAut;
	
	@Column(name="RCDATEAUT")
    private Date rcDateAut;
	
	@Column(name="RCNOMAGENT", length=50)
    private String rcNomAgent;
	
	@Column(name="RCPRENOMAGENT", length=50)
    private String rcPrenomAgent;
    
	@Column(name="RCCODEMAD", length=10)
    private String rcCodeMad;
	
	@Column(name="RCUSERMAJ", length=7)
	private String rcUserMaj; 
	
	@Column(name="DATEMAJ")
	private Date dateMaj; 
	
	@Column(name="IDUVP")
	private Long idUvp;
	
	@Column(name="IDXUVP")
	private Integer idXuvp;	

	@ManyToOne(targetEntity=UniteDeVisitePhysique.class,fetch = FetchType.LAZY)
	@JoinColumn(name="IDUVP", insertable=false, updatable=false)
	private UniteDeVisitePhysique uniteVisitePhysique;
   
	@ManyToOne(targetEntity=BureauDouane.class,fetch = FetchType.LAZY)
	@JoinColumn(name="rcCodeBurAff", insertable=false, updatable=false)
	private BureauDouane burDouaneAff; 
    
	@ManyToOne(targetEntity=BureauDouane.class,fetch = FetchType.LAZY)
	@JoinColumn(name="rcCodeBurAct", insertable=false, updatable=false)
	private BureauDouane burDouaneAct;
	
	@ManyToOne(targetEntity= Mad.class,fetch = FetchType.LAZY)
	@JoinColumn(name="rcCodeMad", insertable=false, updatable=false)
	private Mad mad; 
	
	public AgentDouane() {
		
	}
	
	public AgentDouane(String rcCodeAgent, String rcCodeBurAff,
			String rcCodeProfil, String rcIndAut, String rcCodeUser) {
		super();
		this.rcCodeAgent = rcCodeAgent;
		this.rcCodeBurAff = rcCodeBurAff;
		this.rcCodeProfil = rcCodeProfil;
		this.rcIndAut = rcIndAut;
		this.rcCodeUser = rcCodeUser; 
	}
    
	public String getRcCodeAgent() {
		return rcCodeAgent;
	}
	public void setRcCodeAgent(String rcCodeAgent) {
		this.rcCodeAgent = rcCodeAgent;
	}
	public String getRcCodeBurAff() {
		return rcCodeBurAff;
	}
	public void setRcCodeBurAff(String rcCodeBurAff) {
		this.rcCodeBurAff = rcCodeBurAff;
	}
	public String getRcCodeSection() {
		return rcCodeSection;
	}
	public void setRcCodeSection(String rcCodeSection) {
		this.rcCodeSection = rcCodeSection;
	}
	public String getRcCodeProfil() {
		return rcCodeProfil;
	}
	public void setRcCodeProfil(String rcCodeProfil) {
		this.rcCodeProfil = rcCodeProfil;
	}
	public String getRcCodeBurAct() {
		return rcCodeBurAct;
	}
	public void setRcCodeBurAct(String rcCodeBurAct) {
		this.rcCodeBurAct = rcCodeBurAct;
	}
	public String getRcRefAut() {
		return rcRefAut;
	}
	public void setRcRefAut(String rcRefAut) {
		this.rcRefAut = rcRefAut;
	}
	public Date getRcDateAut() {
		return rcDateAut;
	}
	public void setRcDateAut(Date rcDateAut) {
		this.rcDateAut = rcDateAut;
	}
	public String getRcNomAgent() {
		return rcNomAgent;
	}
	public void setRcNomAgent(String rcNomAgent) {
		this.rcNomAgent = rcNomAgent;
	}
	public String getRcPrenomAgent() {
		return rcPrenomAgent;
	}
	public void setRcPrenomAgent(String rcPrenomAgent) {
		this.rcPrenomAgent = rcPrenomAgent;
	}
	public String getRcIndAut() {
		return rcIndAut;
	}
	public void setRcIndAut(String rcIndAut) {
		this.rcIndAut = rcIndAut;
	}
	public String getRcCodeMad() {
		return rcCodeMad;
	}
	public void setRcCodeMad(String rcCodeMad) {
		this.rcCodeMad = rcCodeMad;
	}
	public String getRcCodeUser() {
		return rcCodeUser;
	}
	public void setRcCodeUser(String rcCodeUser) {
		this.rcCodeUser = rcCodeUser;
	}

	public BureauDouane getBurDouaneAff() {
		return burDouaneAff;
	}

	public void setBurDouaneAff(BureauDouane burDouaneAff) {
		this.burDouaneAff = burDouaneAff;
	}

	public BureauDouane getBurDouaneAct() {
		return burDouaneAct;
	}

	public void setBurDouaneAct(BureauDouane burDouaneAct) {
		this.burDouaneAct = burDouaneAct;
	}

	public Mad getMad() {
		return mad;
	}

	public void setMad(Mad mad) {
		this.mad = mad;
	}

	public Date getDateMaj() {
		return dateMaj;
	}

	public void setDateMaj(Date dateMaj) {
		this.dateMaj = dateMaj;
	}

	public String getRcUserMaj() {
		return rcUserMaj;
	}

	public void setRcUserMaj(String rcUserMaj) {
		this.rcUserMaj = rcUserMaj;
	}
	
	public Long getIdUvp() {
		return idUvp;
	}

	public void setIdUvp(Long idUvp) {
		this.idUvp = idUvp;
	}

	public Integer getIdXuvp() {
		return idXuvp;
	}

	public void setIdXuvp(Integer idXuvp) {
		this.idXuvp = idXuvp;
	}

	public UniteDeVisitePhysique getUniteVisitePhysique() {
		return uniteVisitePhysique;
	}

	public void setUniteVisitePhysique(UniteDeVisitePhysique uniteVisitePhysique) {
		this.uniteVisitePhysique = uniteVisitePhysique;
	}
	
}
