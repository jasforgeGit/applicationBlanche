package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IEtatModeReglementDao;
import sn.com.douane.ejb.rc.model.entities.EtatModeReglement;

@Stateless(name="IEtatModeReglementDao")
public class EtatModeReglementDaoImpl extends GenericDaoImpl<EtatModeReglement> implements IEtatModeReglementDao{

}
