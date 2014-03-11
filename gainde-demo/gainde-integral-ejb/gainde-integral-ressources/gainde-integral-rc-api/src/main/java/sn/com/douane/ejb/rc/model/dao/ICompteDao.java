package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.demat.model.entities.Compte;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;


@Local
public interface ICompteDao extends IGenericDao<Compte> {

}
