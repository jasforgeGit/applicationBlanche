package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IUniteFacturationDao;
import sn.com.douane.ejb.rc.model.entities.UniteFacturation;

@Stateless(name="IUniteFacturationDao")
public class UniteFacturationDaoImpl extends GenericDaoImpl<UniteFacturation> implements IUniteFacturationDao{

}
