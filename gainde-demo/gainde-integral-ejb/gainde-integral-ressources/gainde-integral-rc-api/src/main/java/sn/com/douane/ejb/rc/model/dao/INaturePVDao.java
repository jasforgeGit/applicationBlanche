package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.NaturePV;
import sn.com.douane.utils.LabelValue;

public interface INaturePVDao extends IGenericDao<NaturePV>{

	List<LabelValue> getListNaturePv() throws RcEjbException; 
}
