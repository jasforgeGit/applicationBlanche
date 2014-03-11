package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.FinderException;
import javax.ejb.Stateless;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITypeRegimeDouaneDao;
import sn.com.douane.ejb.rc.model.dto.TypeRegimeDouaneDto;
import sn.com.douane.ejb.rc.model.entities.TypeRegimeDouane;

@Stateless(name="ITypeRegimeDouaneDao")
public class TypeRegimeDouaneDaoImpl extends GenericDaoImpl<TypeRegimeDouane> implements ITypeRegimeDouaneDao{
	
	private transient final Log log = LogFactory.getLog(getClass());

    public String getImpExpRegime(String rctyperegime) throws FinderException {
        String impExp = "";
        try {
            TypeRegimeDouane typeregimedouaneVO = null;
            typeregimedouaneVO = (TypeRegimeDouane) findByPrimaryKey(rctyperegime);
            impExp = typeregimedouaneVO.getRcImportExport();
        } catch (FinderException e) {
            log.error("getImpExpRegime ERROR = " + e.getMessage());
            throw new FinderException(e.getMessage());
        }
        return impExp;
    }
    
    public List<TypeRegimeDouaneDto> rechercheByWhereTypeRegimeDouane(String where) throws RcEjbException{
		List<TypeRegimeDouaneDto> result = new ArrayList<TypeRegimeDouaneDto>(); 	
		try {
			List<TypeRegimeDouane> listeTypeRegimeDouane = (List<TypeRegimeDouane>) rechercherByWhere(where);
			for (int i=0; i<listeTypeRegimeDouane.size(); i++) {
				TypeRegimeDouaneDto typeRegimeDouaneDto = getTypeRegimeDouaneDto(listeTypeRegimeDouane.get(i));
				result.add(typeRegimeDouaneDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public TypeRegimeDouaneDto getTypeRegimeDouaneDto(TypeRegimeDouane typeRegimeDouane) {
		TypeRegimeDouaneDto typeRegimeDouaneDto = new TypeRegimeDouaneDto();
		if (typeRegimeDouane!=null){
			typeRegimeDouaneDto.setRcTypeRegime(typeRegimeDouane.getRcTypeRegime());
			typeRegimeDouaneDto.setRcLibelleRegime(typeRegimeDouane.getRcLibelleRegime());
			typeRegimeDouaneDto.setRcImportExport(typeRegimeDouane.getRcImportExport());
			typeRegimeDouaneDto.setDelCell(typeRegimeDouaneDto.getPk());
			typeRegimeDouaneDto.setEditCell(typeRegimeDouaneDto.getPk()); 
			}
		return typeRegimeDouaneDto;
	}
    
   
    
}
