package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.SoumissionCreditaireDto;
import sn.com.douane.ejb.rc.model.entities.SoumissionCreditaire;
import sn.com.douane.ejb.rc.model.keys.SoumissionCreditaireKey;

public interface ISoumissionCreditaireDao extends IGenericDao<SoumissionCreditaire>{
	
	void insert (SoumissionCreditaire vo) throws RcEjbException; 
	
	void update(SoumissionCreditaire vo) throws RcEjbException; 
	
	void ctrlInsertUpdate(SoumissionCreditaire vo) throws RcEjbException; 
	
	void delete(SoumissionCreditaireKey soumCredKey) throws RcEjbException; 
	
	List<SoumissionCreditaire> getWhereSoumissionConsignation(String rccodecreditaire, String soumissionconsignation);
	
	List<SoumissionCreditaire> rechercherByCodereditaire(String codcredit) throws RcEjbException; 
	
	String getWhereCodcredit(String codecreditaire); 
	
	List<SoumissionCreditaire> findByCodecreditaire(String codCredit) throws RcEjbException; 
	
	 public List<SoumissionCreditaireDto> rechercheByWhereSoumissionCreditaire(String where) throws RcEjbException;
}
