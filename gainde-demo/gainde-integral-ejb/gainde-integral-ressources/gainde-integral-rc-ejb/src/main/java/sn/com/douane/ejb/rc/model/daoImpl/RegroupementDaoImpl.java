package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegroupementDao;
import sn.com.douane.ejb.rc.model.dto.RegroupementDto;
import sn.com.douane.ejb.rc.model.entities.Regroupement;

@Stateless(name="IRegroupementDao")
public class RegroupementDaoImpl extends GenericDaoImpl<Regroupement> implements IRegroupementDao{

	 public List<RegroupementDto> rechercheByWhereRegroupement(String where) throws RcEjbException{
			List<RegroupementDto> result = new ArrayList<RegroupementDto>(); 	
			try {
				List<Regroupement> listeRegroupement = (List<Regroupement>) rechercherByWhere(where);
				for (int i=0; i<listeRegroupement.size(); i++) {
					RegroupementDto regroupementDto = getRegroupementDto(listeRegroupement.get(i));
					result.add(regroupementDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegroupementDto getRegroupementDto(Regroupement regroupement) {
			RegroupementDto regroupementDto = new RegroupementDto();
			if (regroupement!=null){
				regroupementDto.setRcCodeRegroup(regroupement.getRcCodeRegroup());
				regroupementDto.setRcLibelleRegroup(regroupement.getRcLibelleRegroup());
				regroupementDto.setDelCell(regroupementDto.getPk());
				regroupementDto.setEditCell(regroupementDto.getPk()); 
				}
			return regroupementDto;
		}
	
}
