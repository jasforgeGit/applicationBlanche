package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.RegimeDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Regime;
import sn.com.douane.ejb.rc.model.keys.RegimeKey;

@Stateless(name="IRegimeDao")
public class RegimeDaoImpl extends GenericDaoImpl<Regime> implements IRegimeDao {

	private transient final Log log = LogFactory.getLog(getClass());	
	
	/**
	 * cette methode permet de rechercher le circuit de visite
	 * d'un regime à partir de cle primaire	 
	 */
	public String findCvByRegime(String typeRegime,String codeRegimeDouanier,String codeRegimeFiscal){
		
		String circuitVisite = null;		
		
		try {
			Regime regime = findByPrimaryKey(new RegimeKey(typeRegime,codeRegimeDouanier,codeRegimeFiscal));
			if(regime == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}else {
				circuitVisite = regime.getRcCircuitVisite();
			}
		} catch (FinderException e) {
			log.error("pas de regime trouver avec les paramétres suivants : typeRegime = "+typeRegime+" ,codeRegimeDouanier = "+codeRegimeDouanier+"," +
					"codeRegimeFiscal = "+codeRegimeFiscal);
		}			
		
		return circuitVisite;	
	}
	
	 public List<RegimeDto> rechercheByWhereRegime(String where) throws RcEjbException{
			List<RegimeDto> result = new ArrayList<RegimeDto>(); 	
			try {
				List<Regime> listeRegime = (List<Regime>) rechercherByWhere(where);
				for (int i=0; i<listeRegime.size(); i++) {
					RegimeDto regimeDto = getRegimeDto(listeRegime.get(i));
					result.add(regimeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegimeDto getRegimeDto(Regime regime) {
			RegimeDto regimeDto = new RegimeDto();
			if (regime!=null){
				regimeDto.setRcTypeRegime(regime.getRcTypeRegime());
				regimeDto.setRcCodeRegimeDouanier(regime.getRcCodeRegimeDouanier());
				regimeDto.setRcCodeRegimeFiscal(regime.getRcCodeRegimeFiscal());
				regimeDto.setRcLibelleRegime(regime.getRcLibelleRegime());
				regimeDto.setRcRegimeTaxable(regime.getRcRegimeTaxable());
				regimeDto.setRcIndicMutat(regime.getRcIndicMutat());
				regimeDto.setRcCircuitVisite(regime.getRcCircuitVisite());
				regimeDto.setRcDureeEntrepot(regime.getRcDureeEntrepot());
				regimeDto.setRcIndicateurExo(regime.getRcIndicateurExo());
				regimeDto.setRcIndicateurSusp(regime.getRcIndicateurSusp());
				regimeDto.setDelCell(regimeDto.getPk());
				regimeDto.setEditCell(regimeDto.getPk()); 
				}
			return regimeDto;
		}
}
