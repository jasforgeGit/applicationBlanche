package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.FonctionnaliteDto;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.Numerotation;
import sn.com.douane.utils.ListeFonc;


public interface IFonctionnalitesDao extends IGenericDao<Fonctionnalite> {	

	 void insert(Fonctionnalite objVo) throws RcEjbException;
	
	 void update(Fonctionnalite objVo) throws RcEjbException; 
	
	 void ctrlInsertUpdate(Fonctionnalite objVo) throws RcEjbException; 
	
	 void delete(String key) throws RcEjbException;
	
	 List<Fonctionnalite> rechercherByWhereGroupeFonction(String where) throws RcEjbException; 
	
	 List<Numerotation> rechercherDetailFonctionnalitesNumerotation(String key) throws RcEjbException; 
		
	 String getFonctionnaliteString() throws RcEjbException; 
	 
	 public List<FonctionnaliteDto> rechercheByWhereFonctionnalite(String where) throws RcEjbException;
	 
	 public ListeFonc getListeFonctionnalites(String codegroupe) throws Exception;
	 
	 public FonctionnaliteDto getFonctionnaliteDto(Fonctionnalite fonctionnalite);

}
