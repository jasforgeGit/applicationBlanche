package sn.com.douane.ejb.rc.model.daoImpl;


import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IGenreBureauDao;
import sn.com.douane.ejb.rc.model.dto.GenreBureauDto;
import sn.com.douane.ejb.rc.model.entities.GenreBureau;


@Stateless(name="IGenreBureauDao")
public class GenreBureauDaoImpl  extends GenericDaoImpl<GenreBureau> implements IGenreBureauDao {

	/**
	 * {@inheritDoc}
	 */
	public List<GenreBureau> getListGenreBureau() throws FinderException {
		return findAll();
	}
	public List rechercherByWhereGenreBureau(String condition) throws RcEjbException{
		
	List<GenreBureauDto> result = new ArrayList<GenreBureauDto>(); 	
	try {
		List<GenreBureau> listeGenreBureaus = (List<GenreBureau>) rechercherByWhere(condition);
		for (int i=0; i<listeGenreBureaus.size(); i++) {
			GenreBureauDto genreBureauDto = getGenreBureauDto(listeGenreBureaus.get(i));
			result.add(genreBureauDto); 
		}	
	}catch(Exception e) {
		throw new RcEjbException(ConstErrCod.rowNotFound); 
	}
	return result;
	}

	private GenreBureauDto getGenreBureauDto(GenreBureau genreBureau) {
		GenreBureauDto genreBureauDto=new GenreBureauDto();
		if(genreBureau!=null){
			genreBureauDto.setRcdesgenrebureau(genreBureau.getRcdesgenrebureau());
			genreBureauDto.setRcgenrebureau(genreBureau.getRcgenrebureau());
		
			genreBureauDto.setDelCell(genreBureauDto.getPk());
			genreBureauDto.setEditCell(genreBureauDto.getPk()); 
		}
		return genreBureauDto;
	}
}
