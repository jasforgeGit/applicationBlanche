package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IHReglementExportDao;
import sn.com.douane.ejb.rc.model.entities.HReglementExport;

@Stateless(name="IHReglementExportDao")
public class HReglementExportDaoImpl extends GenericDaoImpl<HReglementExport> implements IHReglementExportDao{

}
