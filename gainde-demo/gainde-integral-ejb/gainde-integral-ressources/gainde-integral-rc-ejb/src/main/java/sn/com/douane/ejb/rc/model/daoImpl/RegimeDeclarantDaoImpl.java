package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeDeclarantDao;
import sn.com.douane.ejb.rc.model.dto.RegimeDeclarantDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDeclarant;

@Stateless(name="IRegimeDeclarantDao")
public class RegimeDeclarantDaoImpl extends GenericDaoImpl<RegimeDeclarant> implements IRegimeDeclarantDao{

	@Override
	public List<RegimeDeclarant> getRegimeDeclarantByCodePpm(String codePpm) {
		Query query = createQuery("from RegimeDeclarant where rcCodePpm= ?1"); 
		query.setParameter(1, codePpm); 
		return query.getResultList();
	}

	  public List<RegimeDeclarantDto> rechercheByWhereRegimeDeclarant(String where) throws RcEjbException{
			List<RegimeDeclarantDto> result = new ArrayList<RegimeDeclarantDto>(); 	
			try {
				List<RegimeDeclarant> listeRegimeDeclarant = (List<RegimeDeclarant>) rechercherByWhere(where);
				for (int i=0; i<listeRegimeDeclarant.size(); i++) {
					RegimeDeclarantDto regimeDeclarantDto = getRegimeDeclarantDto(listeRegimeDeclarant.get(i));
					result.add(regimeDeclarantDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeDeclarantDto getRegimeDeclarantDto(RegimeDeclarant regimeDeclarant) {
			RegimeDeclarantDto regimeDeclarantDto = new RegimeDeclarantDto();
			if (regimeDeclarant!=null){
				regimeDeclarantDto.setRcTypeRegime(regimeDeclarant.getRcTypeRegime());
				regimeDeclarantDto.setRcRegimeDouanier(regimeDeclarant.getRcRegimeDouanier());
				regimeDeclarantDto.setRcRegimeFiscal(regimeDeclarant.getRcRegimeFiscal());
				regimeDeclarantDto.setRcCodePpm(regimeDeclarant.getRcCodePpm());
				regimeDeclarantDto.setDelCell(regimeDeclarantDto.getPk());
				regimeDeclarantDto.setEditCell(regimeDeclarantDto.getPk()); 
				}
			return regimeDeclarantDto;
		}
	
}
