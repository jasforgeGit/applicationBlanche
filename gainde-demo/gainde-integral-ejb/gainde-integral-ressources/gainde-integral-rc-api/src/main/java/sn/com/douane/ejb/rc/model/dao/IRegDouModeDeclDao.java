package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegDouModeDeclDto;
import sn.com.douane.ejb.rc.model.entities.RegDouModeDecl;

public interface IRegDouModeDeclDao extends IGenericDao<RegDouModeDecl> {

	public List<RegDouModeDecl> findDeclarationByRegimedouanierQuery(String typereg,
			String codereg) throws RcEjbException;
	
	public List<RegDouModeDeclDto> rechercheByWhereRegDouModeDecl(String where) throws RcEjbException;
}
