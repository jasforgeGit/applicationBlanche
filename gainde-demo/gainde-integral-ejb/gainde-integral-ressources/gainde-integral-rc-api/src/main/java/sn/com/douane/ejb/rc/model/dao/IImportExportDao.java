package sn.com.douane.ejb.rc.model.dao;

import java.util.List;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.ImportExportDto;
import sn.com.douane.ejb.rc.model.entities.ImportExport;

public interface IImportExportDao extends IGenericDao<ImportExport>{
	public List<ImportExportDto> rechercheByWhereImportExport(String where) throws RcEjbException;

}
