package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.ClasseDto;
import sn.com.douane.ejb.rc.model.entities.Classe;

public interface IClasseDao extends IGenericDao<Classe> {

	 public List<ClasseDto> rechercheByWhereClasse(String where) throws RcEjbException;
	
}
