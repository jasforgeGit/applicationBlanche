package sn.com.douane.ejb.rc.model.dto;

import java.io.Serializable;

import sn.com.douane.ejb.rc.model.entities.Chaine;
import sn.com.douane.ejb.rc.model.entities.Critere;
import sn.com.douane.utils.sysEnv;

public class DetailChaineDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private java.lang.Integer rccodedetailchaine;

	private java.lang.Integer rccodechaine;

	private java.lang.String rccodecritere;

	private java.lang.String rccodeoperateur;

	private java.lang.String rcvaleur;

	private Chaine chaineLocal ;

	private Critere critereLocal ;

	/**
	 *  
	*/
	public DetailChaineDto() {
	    super();
	}
	 /**
	  * @return Renvoie pk.
	*/
	 public String getPk() {
	   return sysEnv.IntegerToStr(rccodedetailchaine);
	 }
	/**
	 * @param pk pk à définir.
	 */
	public void setPk(String pk) {
	}

	public java.lang.Integer getRccodedetailchaine(){
	return rccodedetailchaine;
	}

	public void setRccodedetailchaine(java.lang.Integer rccodedetailchaine){
	  this.rccodedetailchaine=rccodedetailchaine;
	}

	public java.lang.Integer getRccodechaine(){
	return rccodechaine;
	}

	public void setRccodechaine(java.lang.Integer rccodechaine){
	  this.rccodechaine=rccodechaine;
	}

	public java.lang.String getRccodecritere(){
	return rccodecritere;
	}

	public void setRccodecritere(java.lang.String rccodecritere){
	  this.rccodecritere=rccodecritere;
	}

	public java.lang.String getRccodeoperateur(){
	return rccodeoperateur;
	}

	public void setRccodeoperateur(java.lang.String rccodeoperateur){
	  this.rccodeoperateur=rccodeoperateur;
	}

	public java.lang.String getRcvaleur(){
	return rcvaleur;
	}

	public void setRcvaleur(java.lang.String rcvaleur){
	  this.rcvaleur=rcvaleur;
	}

	public Chaine getChaineLocal() {
		return chaineLocal ;
	}

	public void setChaineLocal(Chaine local) {
	 this.chaineLocal = local;
	 }

	public Critere getCritereLocal() {
		return critereLocal ;
	}

	public void setCritereLocal(Critere local) {
	 this.critereLocal = local;
	 }
}
