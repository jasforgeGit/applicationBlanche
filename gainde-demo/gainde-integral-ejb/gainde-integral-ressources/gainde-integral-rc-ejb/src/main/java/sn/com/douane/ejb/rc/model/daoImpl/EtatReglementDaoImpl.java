package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IEtatReglementDao;
import sn.com.douane.ejb.rc.model.entities.EtatReglement;

@Stateless(name="IEtatReglementDao")
public class EtatReglementDaoImpl extends GenericDaoImpl<EtatReglement> implements IEtatReglementDao{

}
