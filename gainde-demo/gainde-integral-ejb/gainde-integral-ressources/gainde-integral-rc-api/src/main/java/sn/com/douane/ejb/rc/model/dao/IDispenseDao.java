package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.DispenseDto;
import sn.com.douane.ejb.rc.model.entities.Dispense;

public interface IDispenseDao extends IGenericDao<Dispense>{

	public List<Dispense> getListDispense() throws FinderException;
	
	
	public List<Dispense> rechercherDispenseByTaxeArticle(String codedispense, String codetaxe)
			throws RcEjbException;
	
	public List<DispenseDto> rechercheByWhereDispense(String where) throws RcEjbException;
}
