package sn.com.douane.ejb.declaration.model.entities;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.keys.CritereLocalBaeKey;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;
import sn.com.douane.ejb.rc.model.entities.Produit;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;

@Entity
@IdClass(CritereLocalBaeKey.class)
@Table(name = "CRITERELOCALBAE")
public class CritereLocalBae implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1629749578305969204L;

	@Id
	@Column(name = "CODEBUREAU", length = 3, nullable = false)
	private String codeBureau;

	@Id
	@Column(name = "CODEPPM", length = 5, nullable = false)
	private String codePpm;

	@Id
	@Column(name = "TYPEREGIME", length = 1, nullable = false)
	private String typeRegime = null;

	@Id
	@Column(name = "REGIMEDOUANIER", length = 1, nullable = false)
	private String codeRegimeDouanier = null;

	@Id
	@Column(name = "REGIMEFISCAL", length = 2, nullable = false)
	private String regimeFiscal = null;

	@Id
	@Column(name = "CODEPRODUIT", length = 6, nullable = false)
	private String codeProduit = null;

	@Id
	@Column(name = "PRECISIONUEMOA", length = 2, nullable = false)
	private String precisionMoa = null;

	@Id
	@Column(name = "PRECISIONSEN", length = 2, nullable = false)
	private String precisionSen = null;

	@Column(name = "VALDOUANE", columnDefinition = "DECIMAL(11,0)", nullable = false)
	private BigDecimal valDouane = null;
	
	
	@ManyToOne(targetEntity = BureauDouane.class)
	@JoinColumn(name = "CODEBUREAU",referencedColumnName="RCCODEBURDOUANE",insertable = false, updatable = false, nullable = false)
	private BureauDouane bureauDaouane;
	
	
	@ManyToOne(targetEntity = Produit.class)
	@JoinColumns({
			@JoinColumn(name = "CODEPRODUIT", referencedColumnName = "RCCODEPROD", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "PRECISIONUEMOA", referencedColumnName = "RCPRECUEMOA", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "PRECISIONSEN", referencedColumnName = "RCPRECSENEGAL", insertable = false, updatable = false, nullable = false) })
	private Produit produit;
	
	
	@ManyToOne(targetEntity = RegimeDouanier.class)
	@JoinColumns({			
			@JoinColumn(name = "TYPEREGIME", referencedColumnName = "RCTYPEREGIME", insertable = false, updatable = false, nullable = false),
			@JoinColumn(name = "REGIMEDOUANIER", referencedColumnName = "RCCODEREGIMEDOUANIER", insertable = false, updatable = false, nullable = false) })
	private RegimeDouanier regimeDouanier;
	
	

	public CritereLocalBae(String codeBureau, String codePpm,
			String typeRegime, String codeRegimeDouanier, String regimefiscal,
			String codeProduit, String precisionMoa, String precisionSen,
			BigDecimal valdouane) {
		super();
		this.codeBureau = codeBureau;
		this.codePpm = codePpm;
		this.typeRegime = typeRegime;
		this.codeRegimeDouanier = codeRegimeDouanier;
		this.setRegimeFiscal(regimefiscal);
		this.codeProduit = codeProduit;
		this.precisionMoa = precisionMoa;
		this.precisionSen = precisionSen;
		this.setValDouane(valdouane);
	}

	public CritereLocalBae() {
		super();
	}	
	

	public String getCodeBureau() {
		return codeBureau;
	}

	public void setCodeBureau(String codeBureau) {
		this.codeBureau = codeBureau;
	}

	public String getCodePpm() {
		return codePpm;
	}

	public void setCodePpm(String codePpm) {
		this.codePpm = codePpm;
	}

	public String getTypeRegime() {
		return typeRegime;
	}

	public void setTypeRegime(String typeRegime) {
		this.typeRegime = typeRegime;
	}

	public String getCodeRegimeDouanier() {
		return codeRegimeDouanier;
	}

	public void setCodeRegimeDouanier(String codeRegimeDouanier) {
		this.codeRegimeDouanier = codeRegimeDouanier;
	}

	public String getCodeProduit() {
		return codeProduit;
	}

	public void setCodeProduit(String codeProduit) {
		this.codeProduit = codeProduit;
	}

	public String getPrecisionMoa() {
		return precisionMoa;
	}

	public void setPrecisionMoa(String precisionMoa) {
		this.precisionMoa = precisionMoa;
	}

	public String getPrecisionSen() {
		return precisionSen;
	}

	public void setPrecisionSen(String precisionSen) {
		this.precisionSen = precisionSen;
	}

	
	public RegimeDouanier getRegimeDouanier() {
		return regimeDouanier;
	}

	public void setRegimeDouanier(RegimeDouanier regimeDouanier) {
		this.regimeDouanier = regimeDouanier;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public BureauDouane getBureauDaouane() {
		return bureauDaouane;
	}

	public void setBureauDaouane(BureauDouane bureauDaouane) {
		this.bureauDaouane = bureauDaouane;
	}

	public BigDecimal getValDouane() {
		return valDouane;
	}

	public void setValDouane(BigDecimal valDouane) {
		this.valDouane = valDouane;
	}

	public String getRegimeFiscal() {
		return regimeFiscal;
	}

	public void setRegimeFiscal(String regimeFiscal) {
		this.regimeFiscal = regimeFiscal;
	}
	
	
	

}
