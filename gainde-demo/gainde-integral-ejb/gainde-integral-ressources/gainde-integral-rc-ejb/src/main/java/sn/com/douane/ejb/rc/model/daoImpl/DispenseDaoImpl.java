package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.persistence.Query;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IDispenseDao;
import sn.com.douane.ejb.rc.model.dto.DispenseDto;
import sn.com.douane.ejb.rc.model.entities.Dispense;

@Stateless(name = "IDispenseDao")
public class DispenseDaoImpl extends GenericDaoImpl<Dispense> implements IDispenseDao{

	@Override
	public List<Dispense> getListDispense() throws FinderException {
		List<Dispense> listDispense = new ArrayList<Dispense>();		
		listDispense.addAll(findAll());
		return listDispense;
	}
	
	public List<Dispense> findByDispCodetaxeQuery(String rccodedispense, String rccodetaxe)
			throws RcEjbException {

		Query query1 = entityManager
				.createNamedQuery("Dispense.findByDispCodetaxe");
		query1.setParameter(1, rccodedispense);
		query1.setParameter(2, rccodetaxe);		
		return (List<Dispense>) query1.getResultList();
	}
	
	
	
	
	public List<Dispense> rechercherDispenseByTaxeArticle(String codedispense, String codetaxe)
			throws RcEjbException {		
		
		try {
			List<Dispense> collection = findByDispCodetaxeQuery(codedispense, codetaxe);
			
			if(collection == null){
				return new ArrayList<Dispense>();
			}
			return collection;
		} catch (RcEjbException e) {
			throw new RcEjbException(e);
		}
	}
	
    public List<DispenseDto> rechercheByWhereDispense(String where) throws RcEjbException {
		List<DispenseDto> result = new ArrayList<DispenseDto>(); 	
		try {
			List<Dispense> listeDispense = (List<Dispense>) rechercherByWhere(where);
			for (int i=0; i<listeDispense.size(); i++) {
				DispenseDto dispenseDto = getDispenseDto(listeDispense.get(i));
				result.add(dispenseDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public DispenseDto getDispenseDto(Dispense dispense) {
		DispenseDto dispenseDto = new DispenseDto();
		if (dispense!=null){
			dispenseDto.setRccodedispense(dispense.getRccodedispense());
			dispenseDto.setRcCodeTaxe(dispense.getRcCodeTaxe());
			dispenseDto.setRcdesdispense(dispense.getRcdesdispense());
			dispenseDto.setDelCell(dispenseDto.getPk());
			dispenseDto.setEditCell(dispenseDto.getPk()); 
			}
		return dispenseDto;
	}
}
