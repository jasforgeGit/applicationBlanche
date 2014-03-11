package sn.com.douane.ejb.rc.model.daoImpl;



import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IConsignataireDao;
import sn.com.douane.ejb.rc.model.dto.ConsignataireDto;
import sn.com.douane.ejb.rc.model.entities.Consignataire;



@Stateless(name="IConsignataireDao")
public class ConsignataireDaoImpl extends GenericDaoImpl<Consignataire> implements IConsignataireDao{
	
	public List<Consignataire> getConsignataireByCodePpm (String codePppm){
		Query query = createQuery("from Consignataire where rcCodePpm= ?1"); 
		query.setParameter(1, codePppm); 
		return query.getResultList();	
	}
	
	public List<ConsignataireDto> rechercheByWhereConsignataire(String where) throws RcEjbException{
		List<ConsignataireDto> result = new ArrayList<ConsignataireDto>(); 	
		try {
			List<Consignataire> listeConsignataire = (List<Consignataire>) rechercherByWhere(where);
			for (int i=0; i<listeConsignataire.size(); i++) {
				ConsignataireDto consignataireDto = getConsignataireDto(listeConsignataire.get(i));
				result.add(consignataireDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result; 
		
	}	
	public ConsignataireDto getConsignataireDto(Consignataire consignataire) {
		ConsignataireDto consignataireDto = new ConsignataireDto();
		if (consignataire!=null){
			consignataireDto.setRcCodeConsignataire(consignataire.getRcCodeConsignataire()); 
			consignataireDto.setRcCodePartiel(consignataire.getRcCodePartiel());
			consignataireDto.setRcCodePpm(consignataire.getRcCodePpm());
			consignataireDto.setRcDateCreationConsig(consignataire.getRcDateCreationConsig());
			consignataireDto.setRcDateDecision(consignataire.getRcDateDecision());
			consignataireDto.setRcDatePartiel(consignataire.getRcDatePartiel());
			consignataireDto.setRcDateSuspension(consignataire.getRcDateSuspension());
			consignataireDto.setRcIndSuspensCredit(consignataire.getRcIndSuspensCredit());
			consignataireDto.setRcNumDecision(consignataire.getRcNumDecision());
			consignataireDto.setRcNumRetraitCarteie(consignataire.getRcNumRetraitCarteie());
			consignataireDto.setRcNumSuspension(consignataire.getRcNumSuspension());
			consignataireDto.setRcRetraitCredit(consignataire.getRcRetraitCredit());
			consignataireDto.setDelCell(consignataireDto.getPk());
			consignataireDto.setEditCell(consignataireDto.getPk()); 
			}
		return consignataireDto;
	}	
	
}
