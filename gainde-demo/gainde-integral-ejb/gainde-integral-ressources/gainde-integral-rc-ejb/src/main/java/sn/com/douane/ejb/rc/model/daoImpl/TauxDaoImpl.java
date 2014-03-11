package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;


import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITauxDao;
import sn.com.douane.ejb.rc.model.dto.TauxDto;
import sn.com.douane.ejb.rc.model.entities.Taux;

@Stateless(name = "ITauxDao")
public class TauxDaoImpl extends GenericDaoImpl<Taux> implements ITauxDao {
	  
	 public String getWherepkDate(String codtaux, String rccodetaxe,
				String conditionDate) {
			return " and rcCodeTaux='"
					+ codtaux
					+ "' and rcCodeTaxe='"
					+ rccodetaxe
					+ "' "
					+ "AND rcDateValeur=(select max(rcDateValeur) from Taux "
					+ "where rcCodeTaxe='" + rccodetaxe + "' and rcCodeTaux='"
					+ codtaux + "')" + conditionDate;
		}
	    
	 
	 
	    public String getConditionDate(){    	
	    	return " and (rcDateValeur<= CURRENT_DATE and (CURRENT_DATE <=rcDateCloture or rcDateCloture is null)) ";
	    }
	
	public double quotite(String codetaux, String codetaxe)	throws RcEjbException {
		
		double quot = 0.0;
	    String where = "select t from Taux t where t.rcCodeTaxe = ?1 and t.rcCodeTaux = ?2 ";
			Query query = entityManager.createQuery(where);
			query.setParameter(1, codetaxe);
			query.setParameter(2, codetaux);			
			@SuppressWarnings("unchecked")
			List<Taux> rs = query.getResultList();				
			quot = rs.get(0).getRcValeurTaux().doubleValue();		
		return quot;
	}
	
	public List<TauxDto> rechercheByWhere(String where) throws RcEjbException{
		List<TauxDto> result = new ArrayList<TauxDto>(); 	
		try {
			List<Taux> listeTaux = (List<Taux>) rechercherByWhere(where);
			for (int i=0; i<listeTaux.size(); i++) {
				TauxDto tauxDto = getTaxeDto(listeTaux.get(i));
				result.add(tauxDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result; 
		
	}	
	public TauxDto getTaxeDto(Taux taux) {
		TauxDto tauxDto = new TauxDto();
		if (taux!=null){
			tauxDto.setLibelleTaux(taux.getLibelleTaux()); 
			tauxDto.setRcCodeTaux(taux.getRcCodeTaux());
			tauxDto.setRcCodeTaxe(taux.getRcCodeTaxe());
			tauxDto.setRcDateCloture(taux.getRcDateCloture());
			tauxDto.setRcDateValeur(taux.getRcDateValeur());
			tauxDto.setRcValeurTaux(taux.getRcValeurTaux());
			tauxDto.setDelCell(tauxDto.getPk());
			tauxDto.setEditCell(tauxDto.getPk()); 
			}
		return tauxDto;
	}
	
	
}
