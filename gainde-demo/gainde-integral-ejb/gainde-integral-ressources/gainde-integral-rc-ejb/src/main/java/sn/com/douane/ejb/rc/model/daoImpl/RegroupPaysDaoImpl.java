package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegroupPaysDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.RegroupPaysDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.RegroupPays;

@Stateless(name="IRegroupPaysDao")
public class RegroupPaysDaoImpl extends GenericDaoImpl<RegroupPays> implements IRegroupPaysDao {

	 public List<RegroupPaysDto> rechercheByWhereRegroupPays(String where) throws RcEjbException{
			List<RegroupPaysDto> result = new ArrayList<RegroupPaysDto>(); 	
			try {
				List<RegroupPays> listeRegroupPays = (List<RegroupPays>) rechercherByWhere(where);
				for (int i=0; i<listeRegroupPays.size(); i++) {
					RegroupPaysDto regroupPaysDto = getRegroupPaysDto(listeRegroupPays.get(i));
					result.add(regroupPaysDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegroupPaysDto getRegroupPaysDto(RegroupPays regroupPays) {
			RegroupPaysDto regroupPaysDto = new RegroupPaysDto();
			if (regroupPays!=null){
				regroupPaysDto.setRcCodeRegroup(regroupPays.getRcCodeRegroup());
				regroupPaysDto.setRcCodePays(regroupPays.getRcCodePays());
				regroupPaysDto.setDelCell(regroupPaysDto.getPk());
				regroupPaysDto.setEditCell(regroupPaysDto.getPk()); 
				}
			return regroupPaysDto;
		}
	
}
