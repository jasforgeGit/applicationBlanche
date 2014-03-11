package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.INbreConnaissementDao;
import sn.com.douane.ejb.rc.model.entities.NbreConnaissement;

@Stateless(name="INbreConnaissementDao")
public class NbreConnaissementDaoImpl extends GenericDaoImpl<NbreConnaissement> implements INbreConnaissementDao{

}
