package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.DevisesDto;
import sn.com.douane.ejb.rc.model.entities.Devises;

@Local
public interface IDevisesDao extends IGenericDao<Devises> {
	
	 public List<DevisesDto> rechercheByWhereDevises(String where) throws RcEjbException;

}
