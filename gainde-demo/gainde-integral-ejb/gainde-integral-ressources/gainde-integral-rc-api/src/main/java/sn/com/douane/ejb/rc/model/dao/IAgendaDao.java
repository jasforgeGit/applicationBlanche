package sn.com.douane.ejb.rc.model.dao;

import javax.ejb.Local;

import sn.com.douane.ejb.demat.model.entities.Agenda;
import sn.com.douane.ejb.rc.model.dao.IGenericDao;

@Local
public interface IAgendaDao extends IGenericDao<Agenda> {

}
