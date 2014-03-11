package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITaxesRegimeDao;
import sn.com.douane.ejb.rc.model.dto.TaxesRegimeDto;
import sn.com.douane.ejb.rc.model.entities.TaxesRegime;

@Stateless(name="ITaxesRegimeDao")
public class TaxesRegimeDaoImpl extends GenericDaoImpl<TaxesRegime> implements ITaxesRegimeDao{

	 public List<TaxesRegimeDto> rechercheByWhereTaxesRegime(String where) throws RcEjbException {
			List<TaxesRegimeDto> result = new ArrayList<TaxesRegimeDto>(); 	
			try {
				List<TaxesRegime> listeTaxesRegime = (List<TaxesRegime>) rechercherByWhere(where);
				for (int i=0; i<listeTaxesRegime.size(); i++) {
					TaxesRegimeDto taxesRegimeDto = getTaxesRegimeDto(listeTaxesRegime.get(i));
					result.add(taxesRegimeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public TaxesRegimeDto getTaxesRegimeDto(TaxesRegime taxesRegime) {
			TaxesRegimeDto taxesRegimeDto = new TaxesRegimeDto();
			if (taxesRegime!=null){
				taxesRegimeDto.setRcTypeRegime(taxesRegime.getRcTypeRegime());
				taxesRegimeDto.setRcCodeRegimeDouanier(taxesRegime.getRcCodeRegimeDouanier());
				taxesRegimeDto.setRcRegimeFiscal(taxesRegime.getRcRegimeFiscal());
				taxesRegimeDto.setRcCodeTaxes(taxesRegime.getRcCodeTaxes());
				taxesRegimeDto.setRcDateValeur(taxesRegime.getRcDateValeur());
				taxesRegimeDto.setRcDateCloture(taxesRegime.getRcDateCloture());
				taxesRegimeDto.setRcCodeTaux(taxesRegime.getRcCodeTaux());

				taxesRegimeDto.setDelCell(taxesRegimeDto.getPk());
				taxesRegimeDto.setEditCell(taxesRegimeDto.getPk()); 
				}
			return taxesRegimeDto;
		}
	
}
