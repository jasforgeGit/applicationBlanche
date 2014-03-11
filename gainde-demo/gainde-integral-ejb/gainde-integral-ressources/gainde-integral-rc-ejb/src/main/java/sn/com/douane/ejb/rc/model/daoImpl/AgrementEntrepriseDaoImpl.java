package sn.com.douane.ejb.rc.model.daoImpl;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAgrementEntrepriseDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.AgrementEntrepriseDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.AgrementEntreprise;
import sn.com.douane.ejb.rc.model.keys.AgrementEntrepriseKey;

@Stateless(name="IAgrementEntrepriseDao")
public class AgrementEntrepriseDaoImpl extends GenericDaoImpl<AgrementEntreprise> implements IAgrementEntrepriseDao{
  
	public boolean createAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws RcEjbException{
		boolean result=false;
		try {
          create(agrementEntreprise);
          result = true;
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.INSERTEXP); 
		}
		return result;
	}
	
	public boolean updateAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws RcEjbException{
		boolean result=false;
		try {
          merge(agrementEntreprise);
          result = true;
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.erreurUpdate); 
		}
		return result;
	}
	
	public boolean removeAgrementEntreprise(String rcagrent,String rcrgrpays,String rccodpays) throws RcEjbException{
		boolean result=false;
		try {
          remove(new AgrementEntrepriseKey(rcagrent,rcrgrpays,rccodpays));
          result = true;
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.removeExp); 
		}
		return result;
	}
	
	public List<AgrementEntrepriseDto> rechercherByWhereAgrementEntreprise(String where) throws RcEjbException{
			List<AgrementEntrepriseDto> result = new ArrayList<AgrementEntrepriseDto>(); 	
			try {
				List<AgrementEntreprise> listeAgrementEntreprise = (List<AgrementEntreprise>) rechercherByWhere(where);
				for (int i=0; i<listeAgrementEntreprise.size(); i++) {
					AgrementEntrepriseDto agrementEntrepriseDto = getAgrementEntrepriseDto(listeAgrementEntreprise.get(i));
					result.add(agrementEntrepriseDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
	
	public AgrementEntrepriseDto getAgrementEntrepriseDto(AgrementEntreprise agrementEntreprise) {
			AgrementEntrepriseDto agrementEntrepriseDto = new AgrementEntrepriseDto();
			if (agrementEntreprise!=null){
				agrementEntrepriseDto.setRcAdresseEnt(agrementEntreprise.getRcAdresseEnt());
				agrementEntrepriseDto.setRcAgrent(agrementEntreprise.getRcAgrent());
				agrementEntrepriseDto.setRcCodPays(agrementEntreprise.getRcCodPays());
				agrementEntrepriseDto.setRcDatCloture(agrementEntreprise.getRcDatCloture());
				agrementEntrepriseDto.setRcDateAgrement(agrementEntreprise.getRcDateAgrement());
				agrementEntrepriseDto.setRcRgrPays(agrementEntreprise.getRcRgrPays());
				agrementEntrepriseDto.setRcrSocialeCent(agrementEntreprise.getRcrSocialeCent());
				agrementEntrepriseDto.setRcTitreEnt(agrementEntreprise.getRcTitreEnt());
				agrementEntrepriseDto.setDelCell(agrementEntrepriseDto.getPk());
				agrementEntrepriseDto.setEditCell(agrementEntrepriseDto.getPk()); 
				}
			return agrementEntrepriseDto;
	}	
		
	public AgrementEntreprise rechercheByCodeAgrePays (String codePays, String codeAgree){
		AgrementEntreprise agreEntre = null;
		Query query = createQuery("from AgrementEntreprise where rcAgrent = ?1  and rcCodPays = ?2 "); 
		query.setParameter(1, codeAgree); 
		query.setParameter(2, codePays);		
		List<AgrementEntreprise> list = query.getResultList();  
		if(list!=null && !list.isEmpty()){
			agreEntre = list.get(0); 
		}
		return agreEntre;
	}
}
