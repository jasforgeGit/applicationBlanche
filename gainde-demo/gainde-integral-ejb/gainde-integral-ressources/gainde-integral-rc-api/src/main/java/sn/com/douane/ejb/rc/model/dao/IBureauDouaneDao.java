package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.BureauDouane;


@Local
public interface IBureauDouaneDao extends IGenericDao<BureauDouane> {        

	String getBureauDouaneString() throws RcEjbException ; 
	public List<BureauDouane> getListBureauDouane() throws FinderException;
	
}
