package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITaxesTransportDao;
import sn.com.douane.ejb.rc.model.entities.TaxesTransport;


@Stateless(name = "ITaxesTransportDao")
public class TaxesTransportDaoImpl extends GenericDaoImpl<TaxesTransport> implements ITaxesTransportDao {

	

}
