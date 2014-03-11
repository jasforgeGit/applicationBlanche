package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegdouDto;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegdou;

public interface IIndicateurRegDouDao extends IGenericDao<IndicateurRegdou> {

	 public List<IndicateurRegdouDto> rechercheByWhereIndicateurRegdou(String where) throws RcEjbException;
	
}
