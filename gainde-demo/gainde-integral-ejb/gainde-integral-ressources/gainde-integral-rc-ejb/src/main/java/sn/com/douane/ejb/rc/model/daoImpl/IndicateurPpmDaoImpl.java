package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IIndicateurPpmDao;
import sn.com.douane.ejb.rc.model.entities.IndicateurPpm;

@Stateless(name="IIndicateurPpmDao")
public class IndicateurPpmDaoImpl extends GenericDaoImpl<IndicateurPpm> implements IIndicateurPpmDao {

}
