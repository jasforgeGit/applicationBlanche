package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeFiscalDao;
import sn.com.douane.ejb.rc.model.dto.RegimeFiscalDto;
import sn.com.douane.ejb.rc.model.entities.RegimeFiscal;

@Stateless(name="IRegimeFiscalDao")
public class RegimeFiscalDaoImpl extends GenericDaoImpl<RegimeFiscal> implements IRegimeFiscalDao {

	 public List<RegimeFiscalDto> rechercheByWhereRegimeFiscal(String where) throws RcEjbException{
			List<RegimeFiscalDto> result = new ArrayList<RegimeFiscalDto>(); 	
			try {
				List<RegimeFiscal> listeRegimeFiscal = (List<RegimeFiscal>) rechercherByWhere(where);
				for (int i=0; i<listeRegimeFiscal.size(); i++) {
					RegimeFiscalDto regimeFiscalDto = getRegimeFiscalDto(listeRegimeFiscal.get(i));
					result.add(regimeFiscalDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeFiscalDto getRegimeFiscalDto(RegimeFiscal regimeFiscal) {
			RegimeFiscalDto regimeFiscalDto = new RegimeFiscalDto();
			if (regimeFiscal!=null){
				regimeFiscalDto.setRcCodeRegimeFiscal(regimeFiscal.getRcCodeRegimeFiscal());
				regimeFiscalDto.setRcLibelleRegimeFiscal(regimeFiscal.getRcLibelleRegimeFiscal());
				regimeFiscalDto.setIndRegExo(regimeFiscal.getIndRegExo());
				regimeFiscalDto.setRcIndSuspension(regimeFiscal.getRcIndSuspension());
				regimeFiscalDto.setDelCell(regimeFiscalDto.getPk());
				regimeFiscalDto.setEditCell(regimeFiscalDto.getPk()); 
				}
			return regimeFiscalDto;
		}
	
}
