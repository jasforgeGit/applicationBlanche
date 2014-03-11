package sn.com.douane.ejb.rc.model.dao;

import java.sql.Date;
import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.ModeReglement;
import sn.com.douane.utils.LabelValue;

public interface IModeReglementDao extends IGenericDao<ModeReglement> {

	public List<LabelValue> getListeModereglementWithLibelle() throws RcEjbException;

	public List<ModeReglement> rechercherByJournalTresor(String codejrnal);

}
