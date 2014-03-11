package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IIndicateurRegimeDao;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegimeDto;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegime;

@Stateless(name="IIndicateurRegimeDao")
public class IndicateurRegimeDaoImpl extends GenericDaoImpl<IndicateurRegime> implements IIndicateurRegimeDao{

	@Override
	public String whereRegimeOuvraison() {		
		return " from IndicateurRegime where rcCodeRegimeFiscal=?1 and rcCodeRegimeDouanier=?2" + 
				 " and rcCodeIndicateur=?3 OR rcCodeIndicateur=?4  and rcTypeRegime=?5" ;
	}
	
	public String getWhereClauseByRegime( ){
				
		String where = " from IndicateurRegime where rcTypeRegime=?1 "
			+ " and rcCodeRegimeDouanier=?2  and rcCodeRegimeFiscal=?3 "
			+ " and rcCodeIndicateur=?4  and  rcDateValidite <= ?5 "
			+ " and ((?5 <=rcDateCloture ) or (rcDateCloture IS NULL))";
		
		return where;
	}


	public List<IndicateurRegime> whereRegime(String rccoderegimedouanier, String rctyperegime,
			String indicateur) {
		Query query = createQuery("from IndicateurRegime where rcCodeRegimeDouanier = ?1 " +
				"and rcCodeIndicateur = ?2 and rcTypeRegime = ?3"); 
		query.setParameter(1, rccoderegimedouanier); 
		query.setParameter(2, indicateur); 
		query.setParameter(3, rctyperegime); 		
		return query.getResultList();
	}
	
	@Override
	public String whereRegimeOuvraison(String rccoderegimefiscal,
			String rccoderegimedouanier, String rctyperegime, String rcCodeIndicateur) {
		
		return " from IndicateurRegime where rcCodeRegimeFiscal='" + rccoderegimefiscal
				+ "' and rcCodeRegimeDouanier='" + rccoderegimedouanier
				+ "' and rcCodeIndicateur='" + rcCodeIndicateur
				+ "' and rcTypeRegime='" + rctyperegime + "'";
	}

	 public List<IndicateurRegimeDto> rechercheByWhereIndicateurRegime(String where) throws RcEjbException{
			List<IndicateurRegimeDto> result = new ArrayList<IndicateurRegimeDto>(); 	
			try {
				List<IndicateurRegime> listeIndicateurRegime = (List<IndicateurRegime>) rechercherByWhere(where);
				for (int i=0; i<listeIndicateurRegime.size(); i++) {
					IndicateurRegimeDto indicateurRegimeDto = getIndicateurRegimeDto(listeIndicateurRegime.get(i));
					result.add(indicateurRegimeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public IndicateurRegimeDto getIndicateurRegimeDto(IndicateurRegime indicateurRegime) {
			IndicateurRegimeDto indicateurRegimeDto = new IndicateurRegimeDto();
			if (indicateurRegime!=null){
				indicateurRegimeDto.setRcTypeRegime(indicateurRegime.getRcTypeRegime());
				indicateurRegimeDto.setRcCodeRegimeDouanier(indicateurRegime.getRcCodeRegimeDouanier());
				indicateurRegimeDto.setRcCodeRegimeFiscal(indicateurRegime.getRcCodeRegimeFiscal());
				indicateurRegimeDto.setRcCodeIndicateur(indicateurRegime.getRcCodeIndicateur());
				indicateurRegimeDto.setRcDateValidite(indicateurRegime.getRcDateValidite());
				indicateurRegimeDto.setRcDateCloture(indicateurRegime.getRcDateCloture());
				indicateurRegimeDto.setDelCell(indicateurRegimeDto.getPk());
				indicateurRegimeDto.setEditCell(indicateurRegimeDto.getPk()); 
				}
			return indicateurRegimeDto;
		}
	
}
