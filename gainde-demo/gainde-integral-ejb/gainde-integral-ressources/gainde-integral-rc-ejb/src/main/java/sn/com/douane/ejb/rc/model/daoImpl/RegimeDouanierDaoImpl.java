package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeDouanierDao;
import sn.com.douane.ejb.rc.model.dto.RegimeDouanierDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDouanier;


@Stateless(name="IRegimeDouanierDao")
public class RegimeDouanierDaoImpl extends GenericDaoImpl<RegimeDouanier> implements IRegimeDouanierDao{
	
	public List<RegimeDouanier> controleRegimeDouanier(String rcTypeRegime, String rcCodeRegimeDouanier){
		return (List<RegimeDouanier>) rechercherByWhere("FROM RegimeDouanier WHERE 1 = 1 AND rcTypeRegime = '"+rcTypeRegime+"' AND rcCodeRegimeDouanier = '"+rcCodeRegimeDouanier+"'");
		
	}

	 public List<RegimeDouanierDto> rechercheByWhereRegimeDouanier(String where) throws RcEjbException{
			List<RegimeDouanierDto> result = new ArrayList<RegimeDouanierDto>(); 	
			try {
				List<RegimeDouanier> listeRegimeDouanier = (List<RegimeDouanier>) rechercherByWhere(where);
				for (int i=0; i<listeRegimeDouanier.size(); i++) {
					RegimeDouanierDto regimeDouanierDto = getRegimeDouanierDto(listeRegimeDouanier.get(i));
					result.add(regimeDouanierDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeDouanierDto getRegimeDouanierDto(RegimeDouanier regimeDouanier) {
			RegimeDouanierDto regimeDouanierDto = new RegimeDouanierDto();
			if (regimeDouanier!=null){
				regimeDouanierDto.setRcTypeRegime(regimeDouanier.getRcTypeRegime());
				regimeDouanierDto.setRcCodeRegimeDouanier(regimeDouanier.getRcCodeRegimeDouanier());
				regimeDouanierDto.setRcLibelleRegimeDouanier(regimeDouanier.getRcLibelleRegimeDouanier());
				regimeDouanierDto.setDelCell(regimeDouanierDto.getPk());
				regimeDouanierDto.setEditCell(regimeDouanierDto.getPk()); 
				}
			return regimeDouanierDto;
		}
	
}
