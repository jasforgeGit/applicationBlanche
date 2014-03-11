package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IImportExportDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.ImportExportDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.ImportExport;

@Stateless(name="IImportExportDao")
public class ImportExportDaoImpl extends GenericDaoImpl<ImportExport> implements IImportExportDao{
	
	 public List<ImportExportDto> rechercheByWhereImportExport(String where) throws RcEjbException{
			List<ImportExportDto> result = new ArrayList<ImportExportDto>(); 	
			try {
				List<ImportExport> listeImportExport = (List<ImportExport>) rechercherByWhere(where);
				for (int i=0; i<listeImportExport.size(); i++) {
					ImportExportDto importExportDto = getImportExportDto(listeImportExport.get(i));
					result.add(importExportDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public ImportExportDto getImportExportDto(ImportExport importExport) {
			ImportExportDto importExportDto = new ImportExportDto();
			if (importExport!=null){
				importExportDto.setRcCodePpm(importExport.getRcCodePpm());
				importExportDto.setRcNineaImpExp(importExport.getRcNineaImpExp());
				importExportDto.setRcDateCarte(importExport.getRcDateCarte());
				importExportDto.setRcDateRetraitCredit(importExport.getRcDateRetraitCredit());
				importExportDto.setRcDateSuspension(importExport.getRcDateSuspension());
				importExportDto.setRcNumCarteImpExp(importExport.getRcNumCarteImpExp());
				importExportDto.setRcNumDecision(importExport.getRcNumDecision());
				importExportDto.setRcNumImportExport(importExport.getRcNumImportExport());
				importExportDto.setRcNumSuspension(importExport.getRcNumSuspension());
				importExportDto.setDelCell(importExportDto.getPk());
				importExportDto.setEditCell(importExportDto.getPk()); 
				}
			return importExportDto;
		}

}
