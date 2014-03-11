package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IClasseDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.ClasseDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Classe;

@Stateless(name = "IClasseDao")
public class ClasseDaoImpl extends GenericDaoImpl<Classe> implements IClasseDao{

	 public List<ClasseDto> rechercheByWhereClasse(String where) throws RcEjbException {
			List<ClasseDto> result = new ArrayList<ClasseDto>(); 	
			try {
				List<Classe> listeClasse = (List<Classe>) rechercherByWhere(where);
				for (int i=0; i<listeClasse.size(); i++) {
					ClasseDto classeDto = getClasseDto(listeClasse.get(i));
					result.add(classeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public ClasseDto getClasseDto(Classe classe) {
			ClasseDto classeDto = new ClasseDto();
			if (classe!=null){
				classeDto.setRccodeclasse(classe.getRccodeclasse());
				classeDto.setRclibelleclasse(classe.getRclibelleclasse());
				classeDto.setDelCell(classeDto.getPk());
				classeDto.setEditCell(classeDto.getPk()); 
				}
			return classeDto;
		}
	
}
