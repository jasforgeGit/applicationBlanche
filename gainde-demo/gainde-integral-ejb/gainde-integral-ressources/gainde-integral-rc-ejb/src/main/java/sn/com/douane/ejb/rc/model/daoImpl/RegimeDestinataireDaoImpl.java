package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeDestinataireDao;
import sn.com.douane.ejb.rc.model.dto.RegimeDestinataireDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;

@Stateless(name="IRegimeDestinataireDao")
public class RegimeDestinataireDaoImpl extends GenericDaoImpl<RegimeDestinataire> implements IRegimeDestinataireDao {

	  public List<RegimeDestinataireDto> rechercheByWhereRegimeDestinataire(String where) throws RcEjbException {
			List<RegimeDestinataireDto> result = new ArrayList<RegimeDestinataireDto>(); 	
			try {
				List<RegimeDestinataire> listeRegimeDestinataire = (List<RegimeDestinataire>) rechercherByWhere(where);
				for (int i=0; i<listeRegimeDestinataire.size(); i++) {
					RegimeDestinataireDto regimeDestinataireDto = getRegimeDestinataireDto(listeRegimeDestinataire.get(i));
					result.add(regimeDestinataireDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeDestinataireDto getRegimeDestinataireDto(RegimeDestinataire regimeDestinataire) {
			RegimeDestinataireDto regimeDestinataireDto = new RegimeDestinataireDto();
			if (regimeDestinataire!=null){
				regimeDestinataireDto.setRcTypeRegime(regimeDestinataire.getRcTypeRegime());
				regimeDestinataireDto.setRcCodeRegimeDouanier(regimeDestinataire.getRcCodeRegimeDouanier());
				regimeDestinataireDto.setRcCodeRegimeFiscal(regimeDestinataire.getRcCodeRegimeFiscal());
				regimeDestinataireDto.setRcCodePpm(regimeDestinataire.getRcCodePpm());
				regimeDestinataireDto.setDelCell(regimeDestinataireDto.getPk());
				regimeDestinataireDto.setEditCell(regimeDestinataireDto.getPk()); 
				}
			return regimeDestinataireDto;
		}
	
}
