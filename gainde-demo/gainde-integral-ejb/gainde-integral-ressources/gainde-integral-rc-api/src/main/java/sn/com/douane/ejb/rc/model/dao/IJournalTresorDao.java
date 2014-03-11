package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.JournalTresor;
import sn.com.douane.utils.LabelValue;

public interface IJournalTresorDao extends IGenericDao<JournalTresor> {

	public List<LabelValue> getListeJournaltresor() throws RcEjbException;

}
