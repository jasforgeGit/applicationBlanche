package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.BureauDouaneTypeManifesteDto;
import sn.com.douane.ejb.rc.model.entities.BureauDouaneTypeManifeste;

@Local
public interface IBureauDouaneTypeManDao extends IGenericDao<BureauDouaneTypeManifeste>{

	 String getBurDouaneTypeManString() throws FinderException ; 
	 
	 public List<BureauDouaneTypeManifesteDto> rechercheByWhereBureauDouaneTypeManifeste(String where) throws RcEjbException;
}
