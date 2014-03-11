package sn.com.douane.ejb.rc.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "RCSITE")
public class Rcsite implements Serializable{
	
	
	private static final long serialVersionUID = -4224618871094654620L;
	
		
	@Id
	@Column(name = "RCCODEPAYS",length = 3,nullable = false)
	private String rccodepays;
	
	@Column(name = "TYPECREDITADMINISTRATIF",length = 1)
	private String typecreditadministratif;
	
	@Column(name = "VALIMPOREXPORT",length = 1)
    private String valimporexport = "0";
	
	@Column(name = "TYPEMERC",length = 1,nullable = false)
    private String typemerc;
    
	@Column(name = "VAL1UNITELIQUIDATION",length = 1)
	private String val1uniteliquidation;
    
	@Column(name = "VAL2UNITELIQUIDATION",length = 1)
	private String val2uniteliquidation;
	
	@Column(name = "CODTVA",length = 10)
    private String codtva;
	
	@Column(name = "CODDROITFISCAL",length = 2)
    private String coddroitfiscal;
	
	@Column(name = "CODDROITDOUANE",length = 2)
    private String coddroitdouane;	
    
	@Column(name = "CODETYPEDECISIONRETRAIT",length = 1)
	private String codetypedecisionretrait;
    
	@Column(name = "CODETYPEDECISIONSUSPENSION",length = 1)
	private String codetypedecisionsuspension;
	
	@Column(name = "CODETYPEDECILEVEESUSP",length = 10)
    private String codetypedecileveesusp;
	
	@Column(name = "CODETYPEDECIRENOUVEL",length = 1)
    private String codetypedecirenouvel;
	
	@Column(name = "CODECREDITSUSPENDU",length = 1)
    private String codecreditsuspendu;
	
	@Column(name = "CODECREDITNONSUSPENDU",length = 1,nullable = false)
    private String codecreditnonsuspendu;	
	
	@Column(name = "RCTYPEDECAUTORISATION",length = 10)
    private String rctypedecautorisation;
	
	@Column(name = "MONTANTMINCREDIT")
	private double montantmincredit;
	
	@Column(name = "CODETYPEDECISIONEXTENSION",length = 1)
	private String codetypedecisionextension;
	
	@Column(name = "NBREARTMAXDECLARATION")
	private Integer nbreartmaxdeclaration; 
	
    @ManyToOne(targetEntity = Pays.class)
    @JoinColumn(name="RCCODEPAYS",insertable=false, updatable=false)
    private Pays pays;

   
    public Rcsite() {
    
    }
    
	public Rcsite(String rccodepays){			
			super();
			this.rccodepays=rccodepays;
	}

  
	public Rcsite(String rccodepays,String typemerc, String codecreditnonsuspendu) {
		super();
		this.rccodepays=rccodepays;
        this.typemerc=typemerc;
        this.codecreditnonsuspendu=codecreditnonsuspendu;
	}

   
	public Rcsite(Pays pays,String typemerc, String codecreditnonsuspendu) {
		super();
		this.pays=pays;
        this.typemerc=typemerc;
        this.codecreditnonsuspendu=codecreditnonsuspendu;
	}

	
	public String getRccodepays() {
			return rccodepays;
	}

	public void setRccodepays(String rccodepays) {
			this.rccodepays = rccodepays;
	}
		
    public String getTypecreditadministratif() {
        return typecreditadministratif;
    }

   
	public void setTypecreditadministratif(
			String typecreditadministratif) {
        this.typecreditadministratif = typecreditadministratif;
    }

   
    public String getValimporexport() {
        return valimporexport;
    }

  
	public void setValimporexport(String valimporexport) {
        this.valimporexport = valimporexport;
    }

   
    public String getTypemerc() {
        return typemerc;
    }

  
	public void setTypemerc(String typemerc) {
        this.typemerc = typemerc;
    }

   
    public String getVal1uniteliquidation() {
        return val1uniteliquidation;
    }

  
	public void setVal1uniteliquidation(
			String val1uniteliquidation) {
        this.val1uniteliquidation = val1uniteliquidation;
    }

    
    public String getVal2uniteliquidation() {
        return val2uniteliquidation;
    }

   
	public void setVal2uniteliquidation(
			String val2uniteliquidation) {
        this.val2uniteliquidation = val2uniteliquidation;
    }

   
    public String getCoddroitfiscal() {
        return coddroitfiscal;
    }

  
	public void setCoddroitfiscal(String coddroitfiscal) {
        this.coddroitfiscal = coddroitfiscal;
    }

   
    public String getCoddroitdouane() {
        return coddroitdouane;
    }

  
	public void setCoddroitdouane(String coddroitdouane) {
        this.coddroitdouane = coddroitdouane;
    }

   
    public String getCodtva() {
        return codtva;
    }

    
	public void setCodtva(String codtva) {
        this.codtva = codtva;
    }

   
    public String getCodetypedecisionretrait() {
        return codetypedecisionretrait;
    }

  
	public void setCodetypedecisionretrait(
			String codetypedecisionretrait) {
        this.codetypedecisionretrait = codetypedecisionretrait;
    }

  
    public String getCodetypedecisionsuspension() {
        return codetypedecisionsuspension;
    }

   
	public void setCodetypedecisionsuspension(
			String codetypedecisionsuspension) {
        this.codetypedecisionsuspension = codetypedecisionsuspension;
    }

  
    public String getCodetypedecileveesusp() {
        return codetypedecileveesusp;
    }

  
	public void setCodetypedecileveesusp(
			String codetypedecileveesusp) {
        this.codetypedecileveesusp = codetypedecileveesusp;
    }

   
    public String getCodetypedecirenouvel() {
        return codetypedecirenouvel;
    }

   
	public void setCodetypedecirenouvel(
			String codetypedecirenouvel) {
        this.codetypedecirenouvel = codetypedecirenouvel;
    }

  
    public String getCodecreditsuspendu() {
        return codecreditsuspendu;
    }

    
	public void setCodecreditsuspendu(
			String codecreditsuspendu) {
        this.codecreditsuspendu = codecreditsuspendu;
    }

   
    public String getCodecreditnonsuspendu() {
        return codecreditnonsuspendu;
    }

   
	public void setCodecreditnonsuspendu(
			String codecreditnonsuspendu) {
        this.codecreditnonsuspendu = codecreditnonsuspendu;
    }

	public String getRctypedecautorisation() {
		return rctypedecautorisation;
	}

	public void setRctypedecautorisation(String rctypedecautorisation) {
		this.rctypedecautorisation = rctypedecautorisation;
	}

	public double getMontantmincredit() {
		return montantmincredit;
	}

	public void setMontantmincredit(double montantmincredit) {
		this.montantmincredit = montantmincredit;
	}

	public String getCodetypedecisionextension() {
		return codetypedecisionextension;
	}

	public void setCodetypedecisionextension(String codetypedecisionextension) {
		this.codetypedecisionextension = codetypedecisionextension;
	}

	public Integer getNbreartmaxdeclaration() {
		return nbreartmaxdeclaration;
	}

	public void setNbreartmaxdeclaration(Integer nbreartmaxdeclaration) {
		this.nbreartmaxdeclaration = nbreartmaxdeclaration;
	}

	public Pays getPays() {
		return pays;
	}

	public void setPays(Pays pays) {
		this.pays = pays;
	}

   
	
      
}
