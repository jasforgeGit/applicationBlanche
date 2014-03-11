package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IAgreeDao;
import sn.com.douane.ejb.rc.model.dao.IRegimeProduitDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.dto.RegimeProduitDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.RegimeProduit;

@Stateless(name="IRegimeProduitDao")
public class RegimeProduitDaoImpl extends GenericDaoImpl<RegimeProduit> implements IRegimeProduitDao{
	
    public List<RegimeProduitDto> rechercheByWhereRegimeProduit(String where) throws RcEjbException{
		List<RegimeProduitDto> result = new ArrayList<RegimeProduitDto>(); 	
		try {
			List<RegimeProduit> listeRegimeProduit = (List<RegimeProduit>) rechercherByWhere(where);
			for (int i=0; i<listeRegimeProduit.size(); i++) {
				RegimeProduitDto regimeProduitDto = getRegimeProduitDto(listeRegimeProduit.get(i));
				result.add(regimeProduitDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public RegimeProduitDto getRegimeProduitDto(RegimeProduit regimeProduit) {
		RegimeProduitDto regimeProduitDto = new RegimeProduitDto();
		if (regimeProduit!=null){
			regimeProduitDto.setRcTypeRegime(regimeProduit.getRcTypeRegime());
			regimeProduitDto.setRcCodeRegimeDouanier(regimeProduit.getRcCodeRegimeDouanier());
			regimeProduitDto.setRcCodeRegimeFiscal(regimeProduit.getRcCodeRegimeFiscal());
			regimeProduitDto.setRcCodeProd(regimeProduit.getRcCodeProd());
			regimeProduitDto.setRcPrecuemoa(regimeProduit.getRcPrecuemoa());
			regimeProduitDto.setRcPrecSenegal(regimeProduit.getRcPrecSenegal());
			regimeProduitDto.setDelCell(regimeProduitDto.getPk());
			regimeProduitDto.setEditCell(regimeProduitDto.getPk()); 
			}
		return regimeProduitDto;
	}
}
