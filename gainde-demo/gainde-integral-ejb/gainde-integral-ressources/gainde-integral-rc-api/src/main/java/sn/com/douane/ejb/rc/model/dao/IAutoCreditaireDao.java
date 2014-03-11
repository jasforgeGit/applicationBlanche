package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.ejb.rc.model.entities.AutoCreditaire;

@Local
public interface IAutoCreditaireDao extends IGenericDao<AutoCreditaire>{

	 public List<AutoCreditaire> getWhereAutorisation(String ppmdestinataire, String ppmdeclarant);

	List<AutoCreditaire> getVectAutorisation(String condition) throws RcEjbException;

	public String getWherePpmAutorisant(String rcCodePpm);

	void insert(AutoCreditaire vo) throws RcEjbException;

	List<AutoCreditaire> findbyPpmautorisantQuery(String ppmAutorisant) throws RcEjbException;

	List<AutoCreditaire> rechercherByPpmautorisant(String ppmautorisant) throws RcEjbException;
	
	
}
