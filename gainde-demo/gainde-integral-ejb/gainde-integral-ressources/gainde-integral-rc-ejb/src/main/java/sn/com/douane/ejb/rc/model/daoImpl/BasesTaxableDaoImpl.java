package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IBasesTaxableDao;
import sn.com.douane.ejb.rc.model.dto.BasesTaxableDto;
import sn.com.douane.ejb.rc.model.entities.BasesTaxable;


/**
 * The Class BasesTaxableDaoImpl.
 */
@Stateless(name="IBasesTaxableDao")
public class BasesTaxableDaoImpl extends GenericDaoImpl<BasesTaxable> implements IBasesTaxableDao {

	 /* (non-Javadoc)
 	 * @see sn.com.douane.ejb.rc.model.dao.IBasesTaxableDao#rechercheByWhereBasesTaxable(java.lang.String)
 	 */
 	public List<BasesTaxableDto> rechercheByWhereBasesTaxable(String where) throws RcEjbException {
			List<BasesTaxableDto> result = new ArrayList<BasesTaxableDto>(); 	
			try {
				List<BasesTaxable> listeBasesTaxable = (List<BasesTaxable>) rechercherByWhere(where);
				for (int i = 0; i < listeBasesTaxable.size(); i++) {
					BasesTaxableDto basesTaxableDto = getBasesTaxableDto(listeBasesTaxable.get(i));
					result.add(basesTaxableDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		
		/**
		 * Gets the bases taxable dto.
		 *
		 * @param basesTaxable the bases taxable
		 * @return the bases taxable dto
		 */
		public BasesTaxableDto getBasesTaxableDto(BasesTaxable basesTaxable) {
			BasesTaxableDto basesTaxableDto = new BasesTaxableDto();
			if (basesTaxable != null){
				basesTaxableDto.setRcCodeTaxe(basesTaxable.getRcCodeTaxe());
				basesTaxableDto.setRcCodeTaxeBase(basesTaxable.getRcCodeTaxeBase());
				basesTaxableDto.setRcOrdreCalcul(basesTaxable.getRcOrdreCalcul());
				basesTaxableDto.setDelCell(basesTaxableDto.getPk());
				basesTaxableDto.setEditCell(basesTaxableDto.getPk()); 
				}
			return basesTaxableDto;
		}

}
