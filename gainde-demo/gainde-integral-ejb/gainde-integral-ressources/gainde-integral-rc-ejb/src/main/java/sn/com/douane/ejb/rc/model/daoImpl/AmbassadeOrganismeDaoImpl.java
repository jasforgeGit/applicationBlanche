package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAmbassadeOrganismeDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.AmbassadeOrganismeDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;


@Stateless(name="IAmbassadeOrganismeDao")
public class AmbassadeOrganismeDaoImpl extends GenericDaoImpl<AmbassadeOrganisme> implements IAmbassadeOrganismeDao{

	/**
	 * cette methode permet de tester si le
	 * code ppm est celle d'une ambassade
	 * @throws SQLException 
	 */
	public boolean isAmbassadeByPpm(String deccodedestinataire) {		
	  
	    boolean foundAmbassade = false;
	    Query query = createQuery("from AmbassadeOrganisme where rcCodePpm = ?1 "); 
	    query.setParameter(1, deccodedestinataire); 
	    
	    List<AmbassadeOrganisme> listAmbassade = query.getResultList();
		
		if(listAmbassade != null && !listAmbassade.isEmpty()){
			foundAmbassade = true;
		}			
		
		return foundAmbassade;
	}
	
	  public List<AmbassadeOrganismeDto> rechercheByWhereAmbassadeOrganisme(String where) throws RcEjbException{
			List<AmbassadeOrganismeDto> result = new ArrayList<AmbassadeOrganismeDto>(); 	
			try {
				List<AmbassadeOrganisme> listeAmbassadeOrganisme = (List<AmbassadeOrganisme>) rechercherByWhere(where);
				for (int i=0; i<listeAmbassadeOrganisme.size(); i++) {
					AmbassadeOrganismeDto ambassadeOrganismeDto = getAmbassadeOrganismeDto(listeAmbassadeOrganisme.get(i));
					result.add(ambassadeOrganismeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public AmbassadeOrganismeDto getAmbassadeOrganismeDto(AmbassadeOrganisme ambassadeOrganisme) {
			AmbassadeOrganismeDto ambassadeOrganismeDto = new AmbassadeOrganismeDto();
			if (ambassadeOrganisme!=null){
				ambassadeOrganismeDto.setRcCodePpm(ambassadeOrganisme.getRcCodePpm());
				ambassadeOrganismeDto.setRcCodeSuspension(ambassadeOrganisme.getRcCodeSuspension());
				ambassadeOrganismeDto.setRcNatRegimePref(ambassadeOrganisme.getRcNatRegimePref());
				ambassadeOrganismeDto.setRcNumRegimePref(ambassadeOrganisme.getRcNumRegimePref());
				ambassadeOrganismeDto.setRcNumRetrait(ambassadeOrganisme.getRcNumRetrait());
				ambassadeOrganismeDto.setRsNumSuspension(ambassadeOrganisme.getRsNumSuspension());
				ambassadeOrganismeDto.setRcDateRegimePref(ambassadeOrganisme.getRcDateRegimePref());
				ambassadeOrganismeDto.setRcDateRetrait(ambassadeOrganisme.getRcDateRetrait());
				ambassadeOrganismeDto.setRcDateSuspension(ambassadeOrganisme.getRcDateSuspension());
				ambassadeOrganismeDto.setDelCell(ambassadeOrganismeDto.getPk());
				ambassadeOrganismeDto.setEditCell(ambassadeOrganismeDto.getPk()); 
				}
			return ambassadeOrganismeDto;
		}	
}
