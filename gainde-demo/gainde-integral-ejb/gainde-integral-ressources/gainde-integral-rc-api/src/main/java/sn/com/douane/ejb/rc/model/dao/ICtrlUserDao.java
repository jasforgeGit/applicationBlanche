package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.model.entities.CtrlUser;



@Local
public interface ICtrlUserDao extends IGenericDao<CtrlUser>{

	
	public void deleteAllUser();
	
	
}
