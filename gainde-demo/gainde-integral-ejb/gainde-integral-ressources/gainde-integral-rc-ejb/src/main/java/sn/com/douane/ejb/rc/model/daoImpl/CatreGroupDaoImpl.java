package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICatreGroupDao;
import sn.com.douane.ejb.rc.model.dto.CatreGroupDto;
import sn.com.douane.ejb.rc.model.entities.CatreGroup;

@Stateless(name = "ICatreGroupDao")
public class CatreGroupDaoImpl extends GenericDaoImpl<CatreGroup> implements ICatreGroupDao {
	
	 public List<CatreGroupDto> rechercheByWhereCatreGroup(String where) throws RcEjbException {
			List<CatreGroupDto> result = new ArrayList<CatreGroupDto>(); 	
			try {
				List<CatreGroup> listeCatreGroup = (List<CatreGroup>) rechercherByWhere(where);
				for (int i=0; i<listeCatreGroup.size(); i++) {
					CatreGroupDto catreGroupDto = getCatreGroupDto(listeCatreGroup.get(i));
					result.add(catreGroupDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public CatreGroupDto getCatreGroupDto(CatreGroup catreGroup) {
			CatreGroupDto catreGroupDto = new CatreGroupDto();
			if (catreGroup!=null){
				catreGroupDto.setRcCodeCatreGroup(catreGroup.getRcCodeCatreGroup());
				catreGroupDto.setRcLibCatreGroup(catreGroup.getRcLibCatreGroup());
				catreGroupDto.setDelCell(catreGroupDto.getPk());
				catreGroupDto.setEditCell(catreGroupDto.getPk()); 
				}
			return catreGroupDto;
		}

}
