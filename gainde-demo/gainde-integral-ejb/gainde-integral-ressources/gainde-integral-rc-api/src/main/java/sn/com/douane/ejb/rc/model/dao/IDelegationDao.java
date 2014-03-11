package sn.com.douane.ejb.rc.model.dao;

import java.sql.Date;
import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.keys.DelegationKey;

public interface IDelegationDao extends IGenericDao<Delegation> {

	void insert(Delegation objVo) throws RcEjbException; 
	
	void update(Delegation objVo) throws RcEjbException; 
	
	void ctrlInsertUpdate(Delegation objVo) throws RcEjbException; 
	
	void delete(DelegationKey objKey) throws RcEjbException;  
	
	List<Delegation> findfctdelegueQuery (Date dateDebut, String agentDestinataire) throws RcEjbException;
	
	List<Delegation> finddelegueQuery (Date dateDebut)  throws RcEjbException;
	
	List<Delegation> recherchelisteFonctDelegues(String codeuser) throws RcEjbException;
	
	List<Delegation> rechercheDelegants(Date sysdate) throws RcEjbException;
	
	void deleteProfilGroupe(String agentDest,Integer codeGroupe) throws RcEjbException; 
	public List<String> recherchelisteFonctDeleguants(String codeuser) throws RcEjbException;
	
}
