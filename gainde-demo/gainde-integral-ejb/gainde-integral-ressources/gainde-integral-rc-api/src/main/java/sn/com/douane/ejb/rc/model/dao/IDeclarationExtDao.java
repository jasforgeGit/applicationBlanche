package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.demat.model.entities.DeclarationExt;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;

@Local
public interface IDeclarationExtDao extends IGenericDao<DeclarationExt> {

}
