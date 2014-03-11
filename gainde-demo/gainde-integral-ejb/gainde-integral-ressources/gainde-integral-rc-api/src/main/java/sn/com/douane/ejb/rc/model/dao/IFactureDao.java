package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.demat.model.entities.Facture;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;

@Local
public interface IFactureDao extends IGenericDao<Facture> {

	
	
}
