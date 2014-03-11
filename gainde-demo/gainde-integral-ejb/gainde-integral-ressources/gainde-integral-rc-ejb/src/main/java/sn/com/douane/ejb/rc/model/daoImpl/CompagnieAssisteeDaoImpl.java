package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICompagnieAssisteeDao;
import sn.com.douane.ejb.rc.model.dto.CompagnieassisteeDto;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;
import sn.com.douane.ejb.rc.model.entities.Creditaire;

@Stateless(name="ICompagnieAssisteeDao")
public class CompagnieAssisteeDaoImpl extends GenericDaoImpl<CompagnieAssistee> implements ICompagnieAssisteeDao{

	public List<CompagnieAssistee> getListCompagnieassistee() throws FinderException {
		
		List<CompagnieAssistee> listCompagnieAssistee = new ArrayList<CompagnieAssistee>();
		listCompagnieAssistee.add(new CompagnieAssistee(null, ""));
		listCompagnieAssistee.addAll(1, findAll());		
		return listCompagnieAssistee;
	}
	public List<CompagnieassisteeDto> rechercheByWhereCompagnieAssistee(String where) throws RcEjbException{
		List<CompagnieassisteeDto> result = new ArrayList<CompagnieassisteeDto>(); 	
		try {
			List<CompagnieAssistee> listeCompagnieAssistee = (List<CompagnieAssistee>) rechercherByWhere(where);
			for (int i=0; i<listeCompagnieAssistee.size(); i++) {
				CompagnieassisteeDto compagnieassisteeDto = getCompagnieAssisteeDto(listeCompagnieAssistee.get(i));
				result.add(compagnieassisteeDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public CompagnieassisteeDto getCompagnieAssisteeDto(CompagnieAssistee compagnieassistee) {
		CompagnieassisteeDto compagnieassisteeDto = new CompagnieassisteeDto();
		if (compagnieassistee!=null){
			compagnieassisteeDto.setCodeCieAssistee(compagnieassistee.getCodeCieAssistee());
			compagnieassisteeDto.setNomCieAssistee(compagnieassistee.getNomCieAssistee());
			compagnieassisteeDto.setDelCell(compagnieassisteeDto.getPk());
			compagnieassisteeDto.setEditCell(compagnieassisteeDto.getPk()); 
			}
		return compagnieassisteeDto;
	}
}
