package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IModeExpeditionDao;
import sn.com.douane.ejb.rc.model.entities.ModeExpedition;

@Stateless(name="IModeExpeditionDao")
public class ModeExpeditionDaoImpl extends GenericDaoImpl<ModeExpedition> implements IModeExpeditionDao {

}
