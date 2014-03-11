package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegroupementDto;
import sn.com.douane.ejb.rc.model.entities.Regroupement;

@Local
public interface IRegroupementDao extends IGenericDao<Regroupement>{

	 public List<RegroupementDto> rechercheByWhereRegroupement(String where) throws RcEjbException;
}
