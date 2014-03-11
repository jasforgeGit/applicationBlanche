package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.Langue;

@Local
public interface ILangueDao extends IGenericDao<Langue> {
	
	public List rechercherByWhereLangue(String condition) throws RcEjbException;
}
