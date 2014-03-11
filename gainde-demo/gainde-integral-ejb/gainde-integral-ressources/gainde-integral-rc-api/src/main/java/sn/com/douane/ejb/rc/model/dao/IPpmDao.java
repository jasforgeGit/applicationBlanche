package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.ImportExport;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;

@Local
public interface IPpmDao extends IGenericDao<Ppm> {
	
	 void insert (Ppm objVo) throws RcEjbException; 
	
	 void ctrlInsertUpdate (Ppm objVo) throws RcEjbException; 
	
	 void update (Ppm objVo) throws RcEjbException; 
	
	 void delete (String key) throws RcEjbException; 
	
	 List<Agree> rechercherDetailPpmAgree(String ppmkey) throws RcEjbException; 
	
	 List<RegimeDeclarant> rechercherDetailPpmRegimedeclarant(String ppmkey) throws RcEjbException; 
	
	 List<RegimeDestinataire> rechercherDetailPpmRegimedestinataire(String ppmkey) throws RcEjbException; 
	
	 String getAdresse(String key) throws RcEjbException; 
		
	 public String findCvByPpm(String codePpm);
	 
	  void checkExistance(String key) throws TwreException;

	String getPkPpm(String rcCodePpm);
	  
	public int consVerifierExistencePpm (Consignataire objvo);
	
	public int consVerifierExistenceNinea (Consignataire objvo); 
	
	public int verifierExistenceNinea(Creditaire objvo);
	
	public int verifierExistanceCreditaire (Creditaire objvo);
	
	public int agreeVerifierExistenceNinea (Agree objvo);
	
	public int agreeVerifierExistencePpm (Agree objvo);
	
	public int ambVerifierExistencePpm (AmbassadeOrganisme objvo);
	
	public int ambVerifierExistenceNinea (AmbassadeOrganisme objvo);
	
	public int impVerifierExistencePpm (ImportExport objvo);
	
	public int impVerifierExistenceNinea (ImportExport objvo);
	
	public Ppm exist(String key) throws TwreException;
	
	public String rechercheNomPPm(String codeppm) throws TwreException;
}
