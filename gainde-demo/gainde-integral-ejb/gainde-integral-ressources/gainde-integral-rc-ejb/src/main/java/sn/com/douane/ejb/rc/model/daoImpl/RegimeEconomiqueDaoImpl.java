package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeEconomiqueDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.RegimeEconomiqueDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.RegimeEconomique;

@Stateless(name = "IRegimeEconomiqueDao")
public class RegimeEconomiqueDaoImpl  extends GenericDaoImpl<RegimeEconomique> implements IRegimeEconomiqueDao {


	@SuppressWarnings("unchecked")
	@Override
	public List<RegimeEconomique> findByAnneeNumero(String numeroReg, String anneeReg) {
		Query qry = entityManager.createNamedQuery("findByAnneeNumero");
		qry.setParameter(1, anneeReg);
		qry.setParameter(2, numeroReg);
		return (List<RegimeEconomique>) qry.getResultList();
	}

	 public List<RegimeEconomiqueDto> rechercheByWhereRegimeEconomique(String where) throws RcEjbException{
			List<RegimeEconomiqueDto> result = new ArrayList<RegimeEconomiqueDto>(); 	
			try {
				List<RegimeEconomique> listeRegimeEconomique = (List<RegimeEconomique>) rechercherByWhere(where);
				for (int i=0; i<listeRegimeEconomique.size(); i++) {
					RegimeEconomiqueDto regimeEconomiqueDto = getRegimeEconomiqueDto(listeRegimeEconomique.get(i));
					result.add(regimeEconomiqueDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeEconomiqueDto getRegimeEconomiqueDto(RegimeEconomique regimeEconomique) {
			RegimeEconomiqueDto regimeEconomiqueDto = new RegimeEconomiqueDto();
			if (regimeEconomique!=null){
				regimeEconomiqueDto.setRcanneeregeco(regimeEconomique.getRcanneeregeco());
				regimeEconomiqueDto.setRcnumregeco(regimeEconomique.getRcnumregeco());
				regimeEconomiqueDto.setRccodenatregeco(regimeEconomique.getRccodenatregeco());
				regimeEconomiqueDto.setRcdatedecisionregeco(regimeEconomique.getRcdatedecisionregeco());
				regimeEconomiqueDto.setRcrefjuridiqueregeco(regimeEconomique.getRcrefjuridiqueregeco());
				regimeEconomiqueDto.setRcnbreprororegeco(regimeEconomique.getRcnbreprororegeco());
				regimeEconomiqueDto.setRcdatevaliditeregeco(regimeEconomique.getRcdatevaliditeregeco());
				regimeEconomiqueDto.setRcdateprororegeco(regimeEconomique.getRcdateprororegeco());
				regimeEconomiqueDto.setRcdureeregeco(regimeEconomique.getRcdureeregeco());
				regimeEconomiqueDto.setRcdureeprororegeco(regimeEconomique.getRcdureeprororegeco());
				regimeEconomiqueDto.setRcppmbeneficiaire(regimeEconomique.getRcppmbeneficiaire());
				regimeEconomiqueDto.setRcmoderegeco(regimeEconomique.getRcmoderegeco());
				regimeEconomiqueDto.setRcdatesuspensionregeco(regimeEconomique.getRcdatesuspensionregeco());
				regimeEconomiqueDto.setRcetatregeco(regimeEconomique.getRcetatregeco());
				regimeEconomiqueDto.setDelCell(regimeEconomiqueDto.getPk());
				regimeEconomiqueDto.setEditCell(regimeEconomiqueDto.getPk()); 
				}
			return regimeEconomiqueDto;
		}
	
}
