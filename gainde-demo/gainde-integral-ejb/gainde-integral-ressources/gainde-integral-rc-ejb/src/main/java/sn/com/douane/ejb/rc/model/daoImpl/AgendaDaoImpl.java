package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.demat.model.entities.Agenda;
import sn.com.douane.ejb.rc.model.dao.IAgendaDao;
import sn.com.douane.ejb.rc.model.daoImpl.GenericDaoImpl;


@Stateless(name = "IAgendaDao")
public class AgendaDaoImpl extends GenericDaoImpl<Agenda> implements IAgendaDao{

}
