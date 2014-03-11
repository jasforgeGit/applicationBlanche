package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IReglementExportDao;
import sn.com.douane.ejb.rc.model.entities.ReglementExport;

@Stateless(name = "IReglementExportDao")
public class ReglementExportDaoImpl extends GenericDaoImpl<ReglementExport> implements IReglementExportDao{

}
