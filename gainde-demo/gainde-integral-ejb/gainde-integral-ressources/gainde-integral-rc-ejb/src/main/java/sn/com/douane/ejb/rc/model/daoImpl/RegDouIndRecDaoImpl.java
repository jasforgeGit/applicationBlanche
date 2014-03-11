package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IRegDouIndRecDao;
import sn.com.douane.ejb.rc.model.entities.RegDouIndRec;

@Stateless(name="IRegDouIndRecDao")
public class RegDouIndRecDaoImpl extends GenericDaoImpl<RegDouIndRec> implements IRegDouIndRecDao { 

}
