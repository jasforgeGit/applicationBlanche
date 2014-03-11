package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.TypeIndicateur;
import sn.com.douane.utils.LabelValue;

public interface ITypeIndicateurDao extends IGenericDao<TypeIndicateur> {

	public List<LabelValue> getListTypeIndicateur() throws RcEjbException;
	
}
