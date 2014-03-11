package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IDevisesDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.DevisesDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Devises;

@Stateless(name="IDevisesDao")
public class DevisesDaoImpl extends GenericDaoImpl<Devises> implements IDevisesDao {

	 public List<DevisesDto> rechercheByWhereDevises(String where) throws RcEjbException{
			List<DevisesDto> result = new ArrayList<DevisesDto>(); 	
			try {
				List<Devises> listeDevises = (List<Devises>) rechercherByWhere(where);
				for (int i=0; i<listeDevises.size(); i++) {
					DevisesDto devisesDto = getDevisesDto(listeDevises.get(i));
					result.add(devisesDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public DevisesDto getDevisesDto(Devises devises) {
			DevisesDto devisesDto = new DevisesDto();
			if (devises!=null){
				devisesDto.setRccodedevise(devises.getRccodedevise());
				devisesDto.setRcdatedevise(devises.getRcdatedevise());
				devisesDto.setRclibelledevise(devises.getRclibelledevise());
				devisesDto.setRcqtedevise(devises.getRcqtedevise());
				devisesDto.setRcqtecfa(devises.getRcqtecfa());
				devisesDto.setRccoefficient(devises.getRccoefficient());
				devisesDto.setRcusermodif(devises.getRcusermodif());
				devisesDto.setRcprecisiondev(devises.getRcprecisiondev());
				devisesDto.setDelCell(devisesDto.getPk());
				devisesDto.setEditCell(devisesDto.getPk()); 
				}
			return devisesDto;
		}
}
