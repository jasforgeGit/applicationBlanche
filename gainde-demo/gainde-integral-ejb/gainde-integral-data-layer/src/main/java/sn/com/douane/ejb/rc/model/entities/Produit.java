package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import sn.com.douane.ejb.declaration.model.entities.BrouillonArtDec;
import sn.com.douane.ejb.declaration.model.entities.CritereLocalBae;
import sn.com.douane.ejb.declaration.model.entities.ExclusionProduit;
import sn.com.douane.ejb.declaration.model.entities.HSegArtDec;
import sn.com.douane.ejb.declaration.model.entities.SegArtDec;
import sn.com.douane.ejb.declaration.model.entities.Sommiers;
import sn.com.douane.ejb.declaration.model.entities.SpecVerifProd;
import sn.com.douane.ejb.rc.model.keys.ProduitKey;

/**
 * Produit EJB3 Entity Bean.
 * 
 * @author Wadii
 */
@Entity
@IdClass(ProduitKey.class)
@Table(name = "PRODUITS")
public class Produit implements Serializable {

	private static final long serialVersionUID = 1955744046790140560L;

	@Id
	@Column(name = "RCCODEPROD", length = 6, nullable = false)
	private String rccodeprod;

	@Id
	@Column(name = "RCPRECUEMOA", length = 2, nullable = false)
	private String rcprecuemoa;

	@Id
	@Column(name = "RCPRECSENEGAL", length = 2, nullable = false)
	private String rcprecsenegal;

	@Column(name = "RCLIBELLETARIF")
	private String rclibelletarif;

	@Column(name = "RCCODEPOSITION", length = 4)
	private String rccodeposition;

	@Column(name = "RCCOMMPROD")
	private String rccommprod;

	@Column(name = "RCINDPRODPETROLIER", length = 1)
	private String rcindprodpetrolier;

	@Column(name = "RCCODEPRODCRU", length = 1)
	private String rccodeprodcru;

	@Column(name = "RCCODEPRODARTISANAL", length = 1)
	private String rccodeprodartisanal;

	@Column(name = "RCUNITECOMP", length = 2)
	private String rcunitecomp;

	@Column(name = "RCSECTACTPROD", length = 2)
	private String rcsectactprod;

	@Column(name = "RCCODETRANSIT", length = 1)
	private String rccodetransit;

	@Column(name = "RCCODEBIENEQUIP", length = 1)
	private String rccodebienequip;

	@Column(name = "RCVALEQUIPPROD")
	private Integer rcvalequipprod;

	@Column(name = "RCCODEENTREPOT", length = 1)
	private String rccodeentrepot;

	@Column(name = "RCCODEPRODSOCIAL", length = 1)
	private String rccodeprodsocial;

	@Column(name = "RCVALSPECPROD")
	private Double rcvalspecprod;

	@Column(name = "RCVALCHAPITRE", length = 2)
	private String rcvalchapitre;

	@Column(name = "RCCODECLASSE")
	private Integer rccodeclasse;

	@Column(name = "RCCODEPERISSABLE", length = 1)
	private String rccodeperissable;

	@Column(name = "RCCODESECTION", length = 2)
	private String rccodesection;

	@Column(name = "RCACTIF", length = 1)
	private String rcactif;

	@Column(name = "RCEXONOREPVI", length = 1, nullable = false)
	private String rcexonorepvi;
	
	@ManyToOne(targetEntity = Classe.class)
	@JoinColumn(name = "RCCODECLASSE", insertable = false, updatable = false)
	private Classe classe;
	
	@ManyToOne(targetEntity = ChapitreSection.class)
	@JoinColumn(name = "RCVALCHAPITRE", insertable = false, updatable = false)
	private ChapitreSection chapitreSection;

	@OneToMany(mappedBy = "prodRegProd", targetEntity = RegimeProduit.class)
	private List<RegimeProduit> regimeproduits = new ArrayList<RegimeProduit>();

	@OneToMany(mappedBy = "prodIndProd", targetEntity = SoumissionProduit.class)
	private List<SoumissionProduit> soumissionProduits;

	@OneToMany(mappedBy = "produit", targetEntity = Tarif.class)
	private List<Tarif> tarifs = new ArrayList<Tarif>();

	@OneToMany(mappedBy = "baremeprod", targetEntity = Bareme.class)
	private List<Bareme> baremes = new ArrayList<Bareme>();

	@OneToMany(mappedBy = "pdrecopfbur", targetEntity = RegeCoprodFiniBur.class)
	private List<RegeCoprodFiniBur> regecoprodfiniburx = new ArrayList<RegeCoprodFiniBur>();

	@OneToMany(mappedBy = "produit", targetEntity = BrouillonArtDec.class)
	private List<BrouillonArtDec> listBrouillonArtDec;

	@OneToMany(mappedBy = "produit", targetEntity = SegArtDec.class)
	private List<SegArtDec> listSegArtDec;

	@OneToMany(mappedBy = "produit", targetEntity = SpecVerifProd.class)
	private List<SpecVerifProd> listSpecVerifProd;

	@OneToMany(mappedBy = "produit", targetEntity = Sommiers.class)
	private List<Sommiers> listSommiers;
	
	@OneToMany(mappedBy = "produit", targetEntity = HSegArtDec.class)
	private List<HSegArtDec> listHSegArtDec;
	
	@OneToMany(mappedBy = "produit",targetEntity = CritereLocalBae.class)
	private List<CritereLocalBae> listCritereLocalBae;
	
	@OneToMany(mappedBy = "produit",targetEntity = ExclusionProduit.class)
	private List<ExclusionProduit> listExclusionProduit;
	
	/**
	 * 3-args default constructor.
	 * 
	 * @param rccodeprod
	 * @param rcprecuemoa
	 * @param rcprecsenegal
	 */
	public Produit(String rccodeprod, String rcprecuemoa, String rcprecsenegal) {
		super();
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
	}

	/**
	 * 4-args default constructor.
	 * 
	 * @param rccodeprod
	 * @param rcprecuemoa
	 * @param rcprecsenegal
	 */
	public Produit(String rccodeprod, String rcprecuemoa, String rcprecsenegal,
			String rcexonorepvi) {
		super();
		this.rccodeprod = rccodeprod;
		this.rcprecuemoa = rcprecuemoa;
		this.rcprecsenegal = rcprecsenegal;
		this.rcexonorepvi = rcexonorepvi;
	}

	/**
	 * 0-args constructor.
	 */
	public Produit() {
		super();
	}

	/**
	 * Get accessor for persistent attribute: rccodeprod
	 */
	public String getRccodeprod() {
		return rccodeprod;
	}

	/**
	 * Set accessor for persistent attribute: rccodeprod
	 */
	public void setRccodeprod(String rccodeprod) {
		this.rccodeprod = rccodeprod;
	}

	/**
	 * Get accessor for persistent attribute: rcprecuemoa
	 */
	public String getRcprecuemoa() {
		return rcprecuemoa;
	}

	/**
	 * Set accessor for persistent attribute: rcprecuemoa
	 */
	public void setRcprecuemoa(String rcprecuemoa) {
		this.rcprecuemoa = rcprecuemoa;
	}

	/**
	 * Get accessor for persistent attribute: rcprecsenegal
	 */
	public String getRcprecsenegal() {
		return rcprecsenegal;
	}

	/**
	 * Set accessor for persistent attribute: rcprecsenegal
	 */
	public void setRcprecsenegal(String rcprecsenegal) {
		this.rcprecsenegal = rcprecsenegal;
	}

	/**
	 * Get accessor for persistent attribute: rclibelletarif
	 */
	public String getRclibelletarif() {
		return rclibelletarif;
	}

	/**
	 * Set accessor for persistent attribute: rclibelletarif
	 */
	public void setRclibelletarif(String rclibelletarif) {
		this.rclibelletarif = rclibelletarif;
	}

	/**
	 * Get accessor for persistent attribute: rccommprod
	 */
	public String getRccommprod() {
		return rccommprod;
	}

	/**
	 * Set accessor for persistent attribute: rccommprod
	 */
	public void setRccommprod(String rccommprod) {
		this.rccommprod = rccommprod;
	}

	/**
	 * Get accessor for persistent attribute: rcindprodpetrolier
	 */
	public String getRcindprodpetrolier() {
		return rcindprodpetrolier;
	}

	/**
	 * Set accessor for persistent attribute: rcindprodpetrolier
	 */
	public void setRcindprodpetrolier(String rcindprodpetrolier) {
		this.rcindprodpetrolier = rcindprodpetrolier;
	}

	/**
	 * Get accessor for persistent attribute: rccodeprodcru
	 */
	public String getRccodeprodcru() {
		return rccodeprodcru;
	}

	/**
	 * Set accessor for persistent attribute: rccodeprodcru
	 */
	public void setRccodeprodcru(String rccodeprodcru) {
		this.rccodeprodcru = rccodeprodcru;
	}

	/**
	 * Get accessor for persistent attribute: rccodeprodartisanal
	 */
	public String getRccodeprodartisanal() {
		return rccodeprodartisanal;
	}

	/**
	 * Set accessor for persistent attribute: rccodeprodartisanal
	 */
	public void setRccodeprodartisanal(String rccodeprodartisanal) {
		this.rccodeprodartisanal = rccodeprodartisanal;
	}

	/**
	 * Get accessor for persistent attribute: rcunitecomp
	 */
	public String getRcunitecomp() {
		return rcunitecomp;
	}

	/**
	 * Set accessor for persistent attribute: rcunitecomp
	 */
	public void setRcunitecomp(String rcunitecomp) {
		this.rcunitecomp = rcunitecomp;
	}

	/**
	 * Get accessor for persistent attribute: rcsectactprod
	 */
	public String getRcsectactprod() {
		return rcsectactprod;
	}

	/**
	 * Set accessor for persistent attribute: rcsectactprod
	 */
	public void setRcsectactprod(String rcsectactprod) {
		this.rcsectactprod = rcsectactprod;
	}

	/**
	 * Get accessor for persistent attribute: rccodetransit
	 */
	public String getRccodetransit() {
		return rccodetransit;
	}

	/**
	 * Set accessor for persistent attribute: rccodetransit
	 */
	public void setRccodetransit(String rccodetransit) {
		this.rccodetransit = rccodetransit;
	}

	/**
	 * Get accessor for persistent attribute: rccodebienequip
	 */
	public String getRccodebienequip() {
		return rccodebienequip;
	}

	/**
	 * Set accessor for persistent attribute: rccodebienequip
	 */
	public void setRccodebienequip(String rccodebienequip) {
		this.rccodebienequip = rccodebienequip;
	}

	/**
	 * Get accessor for persistent attribute: rcvalequipprod
	 */
	public Integer getRcvalequipprod() {
		return rcvalequipprod;
	}

	/**
	 * Set accessor for persistent attribute: rcvalequipprod
	 */
	public void setRcvalequipprod(Integer rcvalequipprod) {
		this.rcvalequipprod = rcvalequipprod;
	}

	/**
	 * Get accessor for persistent attribute: rccodeentrepot
	 */
	public String getRccodeentrepot() {
		return rccodeentrepot;
	}

	/**
	 * Set accessor for persistent attribute: rccodeentrepot
	 */
	public void setRccodeentrepot(String rccodeentrepot) {
		this.rccodeentrepot = rccodeentrepot;
	}

	/**
	 * Get accessor for persistent attribute: rccodeprodsocial
	 */
	public String getRccodeprodsocial() {
		return rccodeprodsocial;
	}

	/**
	 * Set accessor for persistent attribute: rccodeprodsocial
	 */
	public void setRccodeprodsocial(String rccodeprodsocial) {
		this.rccodeprodsocial = rccodeprodsocial;
	}

	/**
	 * Get accessor for persistent attribute: rcvalspecprod
	 */
	public Double getRcvalspecprod() {
		return rcvalspecprod;
	}

	/**
	 * Set accessor for persistent attribute: rcvalspecprod
	 */
	public void setRcvalspecprod(Double rcvalspecprod) {
		this.rcvalspecprod = rcvalspecprod;
	}

	/**
	 * Get accessor for persistent attribute: rcvalchapitre
	 */
	public String getRcvalchapitre() {
		return rcvalchapitre;
	}

	/**
	 * Set accessor for persistent attribute: rcvalchapitre
	 */
	public void setRcvalchapitre(String rcvalchapitre) {
		this.rcvalchapitre = rcvalchapitre;
	}

	/**
	 * Get accessor for persistent attribute: rccodeperissable
	 */
	public String getRccodeperissable() {
		return rccodeperissable;
	}

	/**
	 * Set accessor for persistent attribute: rccodeperissable
	 */
	public void setRccodeperissable(String rccodeperissable) {
		this.rccodeperissable = rccodeperissable;
	}

	/**
	 * Get accessor for persistent attribute: rcactif
	 */
	public String getRcactif() {
		return rcactif;
	}

	/**
	 * Set accessor for persistent attribute: rcactif
	 */
	public void setRcactif(String rcactif) {
		this.rcactif = rcactif;
	}

	/**
	 * Get accessor for persistent attribute: rcexonorepvi
	 */
	public String getRcexonorepvi() {
		return rcexonorepvi;
	}

	/**
	 * Set accessor for persistent attribute: rcexonorepvi
	 */
	public void setRcexonorepvi(String rcexonorepvi) {
		this.rcexonorepvi = rcexonorepvi;
	}

	/**
	 * Get accessor for persistent attribute: rccodeclasse
	 */
	public Integer getRccodeclasse() {
		return rccodeclasse;
	}

	/**
	 * Set accessor for persistent attribute: rccodeclasse
	 */
	public void setRccodeclasse(Integer rccodeclasse) {
		this.rccodeclasse = rccodeclasse;
	}

	public Classe getClasse() {
		return classe;
	}

	public void setClasse(Classe classe) {
		this.classe = classe;
	}

	public String getRccodeposition() {
		return rccodeposition;
	}

	public void setRccodeposition(String rccodeposition) {
		this.rccodeposition = rccodeposition;
	}

	public String getRccodesection() {
		return rccodesection;
	}

	public void setRccodesection(String rccodesection) {
		this.rccodesection = rccodesection;
	}

	public List<RegimeProduit> getRegimeproduits() {
		return regimeproduits;
	}

	public void setRegimeproduits(List<RegimeProduit> regimeproduits) {
		this.regimeproduits = regimeproduits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((classe == null) ? 0 : classe.hashCode());
		result = prime * result + ((rcactif == null) ? 0 : rcactif.hashCode());
		result = prime * result
				+ ((rccodebienequip == null) ? 0 : rccodebienequip.hashCode());
		result = prime * result
				+ ((rccodeclasse == null) ? 0 : rccodeclasse.hashCode());
		result = prime * result
				+ ((rccodeentrepot == null) ? 0 : rccodeentrepot.hashCode());
		result = prime
				* result
				+ ((rccodeperissable == null) ? 0 : rccodeperissable.hashCode());
		result = prime * result
				+ ((rccodeposition == null) ? 0 : rccodeposition.hashCode());
		result = prime * result
				+ ((rccodeprod == null) ? 0 : rccodeprod.hashCode());
		result = prime
				* result
				+ ((rccodeprodartisanal == null) ? 0 : rccodeprodartisanal
						.hashCode());
		result = prime * result
				+ ((rccodeprodcru == null) ? 0 : rccodeprodcru.hashCode());
		result = prime
				* result
				+ ((rccodeprodsocial == null) ? 0 : rccodeprodsocial.hashCode());
		result = prime * result
				+ ((rccodesection == null) ? 0 : rccodesection.hashCode());
		result = prime * result
				+ ((rccodetransit == null) ? 0 : rccodetransit.hashCode());
		result = prime * result
				+ ((rccommprod == null) ? 0 : rccommprod.hashCode());
		result = prime * result
				+ ((rcexonorepvi == null) ? 0 : rcexonorepvi.hashCode());
		result = prime
				* result
				+ ((rcindprodpetrolier == null) ? 0 : rcindprodpetrolier
						.hashCode());
		result = prime * result
				+ ((rclibelletarif == null) ? 0 : rclibelletarif.hashCode());
		result = prime * result
				+ ((rcprecsenegal == null) ? 0 : rcprecsenegal.hashCode());
		result = prime * result
				+ ((rcprecuemoa == null) ? 0 : rcprecuemoa.hashCode());
		result = prime * result
				+ ((rcsectactprod == null) ? 0 : rcsectactprod.hashCode());
		result = prime * result
				+ ((rcunitecomp == null) ? 0 : rcunitecomp.hashCode());
		result = prime * result
				+ ((rcvalchapitre == null) ? 0 : rcvalchapitre.hashCode());
		result = prime * result
				+ ((rcvalequipprod == null) ? 0 : rcvalequipprod.hashCode());
		result = prime * result
				+ ((rcvalspecprod == null) ? 0 : rcvalspecprod.hashCode());
		result = prime * result
				+ ((regimeproduits == null) ? 0 : regimeproduits.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Produit other = (Produit) obj;
		if (classe == null) {
			if (other.classe != null) {
				return false;
			}
		} else if (!classe.equals(other.classe)) {
			return false;
		}
		if (rcactif == null) {
			if (other.rcactif != null) {
				return false;
			}
		} else if (!rcactif.equals(other.rcactif)) {
			return false;
		}
		if (rccodebienequip == null) {
			if (other.rccodebienequip != null) {
				return false;
			}
		} else if (!rccodebienequip.equals(other.rccodebienequip)) {
			return false;
		}
		if (rccodeclasse == null) {
			if (other.rccodeclasse != null) {
				return false;
			}
		} else if (!rccodeclasse.equals(other.rccodeclasse)) {
			return false;
		}
		if (rccodeentrepot == null) {
			if (other.rccodeentrepot != null) {
				return false;
			}
		} else if (!rccodeentrepot.equals(other.rccodeentrepot)) {
			return false;
		}
		if (rccodeperissable == null) {
			if (other.rccodeperissable != null) {
				return false;
			}
		} else if (!rccodeperissable.equals(other.rccodeperissable)) {
			return false;
		}
		if (rccodeposition == null) {
			if (other.rccodeposition != null) {
				return false;
			}
		} else if (!rccodeposition.equals(other.rccodeposition)) {
			return false;
		}
		if (rccodeprod == null) {
			if (other.rccodeprod != null) {
				return false;
			}
		} else if (!rccodeprod.equals(other.rccodeprod)) {
			return false;
		}
		if (rccodeprodartisanal == null) {
			if (other.rccodeprodartisanal != null) {
				return false;
			}
		} else if (!rccodeprodartisanal.equals(other.rccodeprodartisanal)) {
			return false;
		}
		if (rccodeprodcru == null) {
			if (other.rccodeprodcru != null) {
				return false;
			}
		} else if (!rccodeprodcru.equals(other.rccodeprodcru)) {
			return false;
		}
		if (rccodeprodsocial == null) {
			if (other.rccodeprodsocial != null) {
				return false;
			}
		} else if (!rccodeprodsocial.equals(other.rccodeprodsocial)) {
			return false;
		}
		if (rccodesection == null) {
			if (other.rccodesection != null) {
				return false;
			}
		} else if (!rccodesection.equals(other.rccodesection)) {
			return false;
		}
		if (rccodetransit == null) {
			if (other.rccodetransit != null) {
				return false;
			}
		} else if (!rccodetransit.equals(other.rccodetransit)) {
			return false;
		}
		if (rccommprod == null) {
			if (other.rccommprod != null) {
				return false;
			}
		} else if (!rccommprod.equals(other.rccommprod)) {
			return false;
		}
		if (rcexonorepvi == null) {
			if (other.rcexonorepvi != null) {
				return false;
			}
		} else if (!rcexonorepvi.equals(other.rcexonorepvi)) {
			return false;
		}
		if (rcindprodpetrolier == null) {
			if (other.rcindprodpetrolier != null) {
				return false;
			}
		} else if (!rcindprodpetrolier.equals(other.rcindprodpetrolier)) {
			return false;
		}
		if (rclibelletarif == null) {
			if (other.rclibelletarif != null) {
				return false;
			}
		} else if (!rclibelletarif.equals(other.rclibelletarif)) {
			return false;
		}
		if (rcprecsenegal == null) {
			if (other.rcprecsenegal != null) {
				return false;
			}
		} else if (!rcprecsenegal.equals(other.rcprecsenegal)) {
			return false;
		}
		if (rcprecuemoa == null) {
			if (other.rcprecuemoa != null) {
				return false;
			}
		} else if (!rcprecuemoa.equals(other.rcprecuemoa)) {
			return false;
		}
		if (rcsectactprod == null) {
			if (other.rcsectactprod != null) {
				return false;
			}
		} else if (!rcsectactprod.equals(other.rcsectactprod)){
			return false;
		}
		if (rcunitecomp == null) {
			if (other.rcunitecomp != null){
				return false;
			}
		} else if (!rcunitecomp.equals(other.rcunitecomp)){
			return false;
		}
		if (rcvalchapitre == null) {
			if (other.rcvalchapitre != null){
				return false;
			}
		} else if (!rcvalchapitre.equals(other.rcvalchapitre)){
			return false;
		}
		if (rcvalequipprod == null) {
			if (other.rcvalequipprod != null) {
				return false;
			}
		} else if (!rcvalequipprod.equals(other.rcvalequipprod)) {
			return false;
		}
		if (rcvalspecprod == null) {
			if (other.rcvalspecprod != null) {
				return false;
			}
		} else if (!rcvalspecprod.equals(other.rcvalspecprod)) {
			return false;
		}
		if (regimeproduits == null) {
			if (other.regimeproduits != null) {
				return false;
			}
		} else if (!regimeproduits.equals(other.regimeproduits)) {
			return false;
		}
		return true;
	}

	public List<SoumissionProduit> getSoumissionProduits() {
		return soumissionProduits;
	}

	public void setSoumissionProduits(List<SoumissionProduit> soumissionProduits) {
		this.soumissionProduits = soumissionProduits;
	}

	public List<Tarif> getTarifs() {
		return tarifs;
	}

	public void setTarifs(List<Tarif> tarifs) {
		this.tarifs = tarifs;
	}

	public List<Bareme> getBaremes() {
		return baremes;
	}

	public void setBaremes(List<Bareme> baremes) {
		this.baremes = baremes;
	}

	public List<RegeCoprodFiniBur> getRegecoprodfiniburx() {
		return regecoprodfiniburx;
	}

	public void setRegecoprodfiniburx(List<RegeCoprodFiniBur> regecoprodfiniburx) {
		this.regecoprodfiniburx = regecoprodfiniburx;
	}

	public List<BrouillonArtDec> getListBrouillonArtDec() {
		return listBrouillonArtDec;
	}

	public void setListBrouillonArtDec(List<BrouillonArtDec> listBrouillonArtDec) {
		this.listBrouillonArtDec = listBrouillonArtDec;
	}

	public List<SegArtDec> getListSegArtDec() {
		return listSegArtDec;
	}

	public void setListSegArtDec(List<SegArtDec> listSegArtDec) {
		this.listSegArtDec = listSegArtDec;
	}

	public List<SpecVerifProd> getListSpecVerifProd() {
		return listSpecVerifProd;
	}

	public void setListSpecVerifProd(List<SpecVerifProd> listSpecVerifProd) {
		this.listSpecVerifProd = listSpecVerifProd;
	}

	public List<Sommiers> getListSommiers() {
		return listSommiers;
	}

	public void setListSommiers(List<Sommiers> listSommiers) {
		this.listSommiers = listSommiers;
	}

	public List<HSegArtDec> getListHSegArtDec() {
		return listHSegArtDec;
	}

	public void setListHSegArtDec(List<HSegArtDec> listHSegArtDec) {
		this.listHSegArtDec = listHSegArtDec;
	}

	public List<CritereLocalBae> getListCritereLocalBae() {
		return listCritereLocalBae;
	}

	public void setListCritereLocalBae(List<CritereLocalBae> listCritereLocalBae) {
		this.listCritereLocalBae = listCritereLocalBae;
	}

	public List<ExclusionProduit> getListExclusionProduit() {
		return listExclusionProduit;
	}

	public void setListExclusionProduit(List<ExclusionProduit> listExclusionProduit) {
		this.listExclusionProduit = listExclusionProduit;
	}

	public ChapitreSection getChapitreSection() {
		return chapitreSection;
	}

	public void setChapitreSection(ChapitreSection chapitreSection) {
		this.chapitreSection = chapitreSection;
	}

}
