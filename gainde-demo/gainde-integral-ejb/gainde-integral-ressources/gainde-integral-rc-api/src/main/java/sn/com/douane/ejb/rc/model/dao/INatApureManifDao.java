package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.NatApureManif;
import sn.com.douane.utils.LabelValue;

public interface INatApureManifDao extends IGenericDao<NatApureManif>{

	List<LabelValue> getListNatApureManif() throws RcEjbException; 
}
