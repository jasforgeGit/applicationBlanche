package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IDispensePieceJointeDao;
import sn.com.douane.ejb.rc.model.dto.DispensePieceJointeDto;
import sn.com.douane.ejb.rc.model.entities.DispensePieceJointe;

@Stateless(name = "IDispensePieceJointeDao")
public class DispensePieceJointeDaoImpl extends GenericDaoImpl<DispensePieceJointe> implements IDispensePieceJointeDao {
	
	
	 public List<DispensePieceJointeDto> rechercheByWhereDispensePieceJointe(String where) throws RcEjbException{
			List<DispensePieceJointeDto> result = new ArrayList<DispensePieceJointeDto>(); 	
			try {
				List<DispensePieceJointe> listeDispensePieceJointe = (List<DispensePieceJointe>) rechercherByWhere(where);
				for (int i=0; i<listeDispensePieceJointe.size(); i++) {
					DispensePieceJointeDto dispensePieceJointeDto = getDispensePieceJointeDto(listeDispensePieceJointe.get(i));
					result.add(dispensePieceJointeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public DispensePieceJointeDto getDispensePieceJointeDto(DispensePieceJointe dispensePieceJointe) {
			DispensePieceJointeDto dispensePieceJointeDto = new DispensePieceJointeDto();
			if (dispensePieceJointe!=null){
				dispensePieceJointeDto.setRccodedispense(dispensePieceJointe.getRccodedispense());
				dispensePieceJointeDto.setRccodepiecejointe(dispensePieceJointe.getRccodepiecejointe());
				dispensePieceJointeDto.setDelCell(dispensePieceJointeDto.getPk());
				dispensePieceJointeDto.setEditCell(dispensePieceJointeDto.getPk()); 
				}
			return dispensePieceJointeDto;
		}

}
