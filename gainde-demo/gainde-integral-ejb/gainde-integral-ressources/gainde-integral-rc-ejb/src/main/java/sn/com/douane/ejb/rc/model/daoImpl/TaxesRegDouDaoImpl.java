package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITaxesRegDouDao;
import sn.com.douane.ejb.rc.model.dto.TaxesRegDouDto;
import sn.com.douane.ejb.rc.model.entities.TaxesRegDou;

@Stateless(name="ITaxesRegDouDao")
public class TaxesRegDouDaoImpl extends GenericDaoImpl<TaxesRegDou> implements ITaxesRegDouDao{

	 public List<TaxesRegDouDto> rechercheByWhereTaxesRegDou(String where) throws RcEjbException{
			List<TaxesRegDouDto> result = new ArrayList<TaxesRegDouDto>(); 	
			try {
				List<TaxesRegDou> listeTaxesRegDou = (List<TaxesRegDou>) rechercherByWhere(where);
				for (int i=0; i<listeTaxesRegDou.size(); i++) {
					TaxesRegDouDto taxesRegDouDto = getTaxesRegDouDto(listeTaxesRegDou.get(i));
					result.add(taxesRegDouDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public TaxesRegDouDto getTaxesRegDouDto(TaxesRegDou taxesRegDou) {
			TaxesRegDouDto taxesRegDouDto = new TaxesRegDouDto();
			if (taxesRegDou!=null){
				taxesRegDouDto.setRcCodeTaxe(taxesRegDou.getRcCodeTaxe());
				taxesRegDouDto.setRcTypeRegime(taxesRegDou.getRcTypeRegime());
				taxesRegDouDto.setRcCodeRegimeDouanier(taxesRegDou.getRcCodeRegimeDouanier());
				taxesRegDouDto.setRcDateValeur(taxesRegDou.getRcDateValeur());
				taxesRegDouDto.setRcDateCloture(taxesRegDou.getRcDateCloture());
				taxesRegDouDto.setRcCodeTaux(taxesRegDou.getRcCodeTaux());
				taxesRegDouDto.setDelCell(taxesRegDouDto.getPk());
				taxesRegDouDto.setEditCell(taxesRegDouDto.getPk()); 
				}
			return taxesRegDouDto;
		}
	
}
