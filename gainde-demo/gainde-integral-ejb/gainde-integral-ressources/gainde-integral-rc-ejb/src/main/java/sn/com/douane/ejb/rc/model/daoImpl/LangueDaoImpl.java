package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ILangueDao;
import sn.com.douane.ejb.rc.model.dto.LangueDto;
import sn.com.douane.ejb.rc.model.entities.Langue;

@Stateless(name="ILangueDao")
public class LangueDaoImpl extends GenericDaoImpl<Langue> implements ILangueDao {

	public List rechercherByWhereLangue(String condition) throws RcEjbException {
		List<LangueDto> result = new ArrayList<LangueDto>(); 	
		try {
			List<Langue> listeLangue = (List<Langue>) rechercherByWhere(condition);
			for (int i=0; i<listeLangue.size(); i++) {
				LangueDto langueDto = getLangueDto(listeLangue.get(i));
				result.add(langueDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
	}

	private LangueDto getLangueDto(Langue langue) {
		LangueDto langueDto=new LangueDto();
		if(langue!=null){
			langueDto.setRccodelangue(langue.getRccodelangue());
			langueDto.setLibellelangue(langue.getLibellelangue());
		
			langueDto.setDelCell(langueDto.getPk());
			langueDto.setEditCell(langueDto.getPk()); 
		}
		return langueDto;
	}
	

}
