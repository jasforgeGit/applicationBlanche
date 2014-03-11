package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Consignataire;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;

public interface ICreditaireDao extends IGenericDao<Creditaire> {
	
	void insert(Creditaire objVo) throws RcEjbException; 
	
	void update(Creditaire objVo) throws RcEjbException; 
	
	void ctrlInsertUpdate (Creditaire objVo) throws RcEjbException; 
	
	void delete(String key) throws RcEjbException; 
	
	List<SoumissionCreditaire> rechercherDetailCreditairesSoumissioncreditaire(String key) throws RcEjbException; 
	
	String getWherePkCreditaire(String codecreditaire); 
	
	String getWherePpmCreditaire(String rccodeppm);
	
	public int consVerifierExistanceCreditaire (Consignataire objvo);
	
	public int agreeVerifierExistanceCreditaire (Agree objvo);
	
	public List<CreditaireDto> rechercheByWhereCreditaire(String where) throws RcEjbException;
	
	List<Creditaire> getCreditairesByCodePpm(String codePPM); 
}
