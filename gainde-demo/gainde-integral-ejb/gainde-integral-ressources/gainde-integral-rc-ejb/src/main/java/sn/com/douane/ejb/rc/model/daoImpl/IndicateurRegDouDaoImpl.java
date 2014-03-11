package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IIndicateurRegDouDao;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegdouDto;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegdou;

@Stateless(name="IIndicateurRegDouDao")
public class IndicateurRegDouDaoImpl extends GenericDaoImpl<IndicateurRegdou> implements IIndicateurRegDouDao {

	  public List<IndicateurRegdouDto> rechercheByWhereIndicateurRegdou(String where) throws RcEjbException{
			List<IndicateurRegdouDto> result = new ArrayList<IndicateurRegdouDto>(); 	
			try {
				List<IndicateurRegdou> listeIndicateurRegdou = (List<IndicateurRegdou>) rechercherByWhere(where);
				for (int i=0; i<listeIndicateurRegdou.size(); i++) {
					IndicateurRegdouDto indicateurRegdouDto = getIndicateurRegdouDto(listeIndicateurRegdou.get(i));
					result.add(indicateurRegdouDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public IndicateurRegdouDto getIndicateurRegdouDto(IndicateurRegdou indicateurRegdou) {
			IndicateurRegdouDto indicateurRegdouDto = new IndicateurRegdouDto();
			if (indicateurRegdou!=null){
				indicateurRegdouDto.setRcTypeRegime(indicateurRegdou.getRcTypeRegime());
				indicateurRegdouDto.setRcCodeRegimeDouanier(indicateurRegdou.getRcCodeRegimeDouanier());
				indicateurRegdouDto.setRcCodeIndicateur(indicateurRegdou.getRcCodeIndicateur());
				indicateurRegdouDto.setRcDateValidite(indicateurRegdou.getRcDateValidite());
				indicateurRegdouDto.setRcDateCloture(indicateurRegdou.getRcDateCloture());
				indicateurRegdouDto.setDelCell(indicateurRegdouDto.getPk());
				indicateurRegdouDto.setEditCell(indicateurRegdouDto.getPk()); 
				}
			return indicateurRegdouDto;
		}
	
}
