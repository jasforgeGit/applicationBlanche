package sn.com.douane.ejb.rc.model.daoImpl;


import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IMessagesErreurDao;
import sn.com.douane.ejb.rc.model.entities.MessagesErreur;

@Stateless(name="IMessagesErreurDao")
public class MessagesErreurDaoImpl extends GenericDaoImpl<MessagesErreur> implements IMessagesErreurDao {

	
}
