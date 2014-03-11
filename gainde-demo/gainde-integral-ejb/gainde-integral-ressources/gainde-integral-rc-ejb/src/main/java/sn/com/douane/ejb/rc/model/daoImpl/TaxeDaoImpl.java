package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;


import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.ITaxeDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.TaxeDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Taxe;
import sn.com.douane.utils.ConstDeclaration;
import sn.com.douane.utils.ConstRC;

@Stateless(name = "ITaxeDao")
public class TaxeDaoImpl extends GenericDaoImpl<Taxe> implements ITaxeDao {

	@Override	
	public String whereTaxesPrelevements(String typeregime,
			String coderegime, String regimefiscal, String date) {
		return "SELECT DISTINCT TX.rcCodeTaxe, TX.rcCodeTaux "
				+ "FROM Taxe T,Taux TX "
				+ "WHERE T.rcNatureTaxe ='"
				+ ConstDeclaration.taxePrelevement
				+ "' "
				+ "AND (T.rcCodeTaxe = TX.rcCodeTaxe "
				+ "AND (TX.rcDateValeur  <= "
				+ date
				+ " and ("
				+ date
				+ " <= TX.rcDateCloture OR TX.rcDateCloture IS NULL))) "
				+ "UNION "
				+ "SELECT TRG.rcCodeTaxes, TRG.rcCodeTaux FROM TaxesRegime TRG "
				+ "	WHERE TRG.rcTypeRegime = '"
				+ typeregime
				+ "' AND TRG.rcCodeRegimeDouanier = '"
				+ coderegime
				+ "' AND TRG.rcRegimeFiscal = '"
				+ regimefiscal
				+ "' AND (TRG.rcDateValeur <= CURRENT_DATE "
				+ "AND (CURRENT_DATE <= TRG.rcDateCloture OR TRG.rcDateCloture IS NULL)) ";
				
	}

	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ITaxeDao#rechercherByWherePrelevement(java.lang.String)
	 */
	@Override
	public List<Taxe> rechercherByWherePrelevement(String where)
			throws TwreException {
		List<Taxe> vector = new ArrayList<Taxe>();
		Taxe taxeVo = null;
		
			Query query = entityManager.createQuery(where);
			List<Object[]> rs = query.getResultList();
			for (Object[] object : rs) {
				taxeVo = new Taxe();
				taxeVo.setRcCodeTaxe(object[0].toString());
				taxeVo.setRcCodeTaux(object[1].toString());
				vector.add(taxeVo);
			}		
			
		return vector;
	}
	
	/* (non-Javadoc)
	 * @see sn.com.douane.ejb.rc.model.dao.ITaxeDao#whereTaxesTresorInteretDeRetard(java.lang.String, java.lang.String, java.lang.String)
	 */
	public String whereTaxesTresorInteretDeRetard(String typeregime,
			String coderegime, String regimefiscal) {
		return "select t.rcCodeTaxe, trg.rcCodeTaux from Taxe t, TaxesRegime trg "
				+ "where t.rcNatureTaxe = '"
				+ ConstDeclaration.taxeTresor
				+ "' "
				+ "and t.rcCodeTaxe = trg.rcCodeTaxes "
				+ "and trg.rcTypeRegime = '"
				+ typeregime
				+ "' "
				+ "and trg.rcCodeRegimeDouanier = '"
				+ coderegime
				+ "'"
				+ "and trg.rcRegimeFiscal = '" + regimefiscal 
				+ "'"
				+ "and t.rcCodeTaxe = '"+ConstDeclaration.interetRetard+"'";
	}
	
	 public List<TaxeDto> rechercheByWhereTaxe(String where) throws RcEjbException{
			List<TaxeDto> result = new ArrayList<TaxeDto>(); 	
			try {
				List<Taxe> listeTaxe = (List<Taxe>) rechercherByWhere(where);
				for (int i=0; i<listeTaxe.size(); i++) {
					TaxeDto taxeDto = getTaxeDto(listeTaxe.get(i));
					result.add(taxeDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public TaxeDto getTaxeDto(Taxe taxe) {
			TaxeDto taxeDto = new TaxeDto();
			if (taxe!=null){
				taxeDto.setRcCodeTaxe(taxe.getRcCodeTaxe());
				taxeDto.setRcLibelleTaxe(taxe.getRcLibelleTaxe());
				taxeDto.setRcCodeImpTresor(taxe.getRcCodeImpTresor());
				taxeDto.setRcCodeImpBudget(taxe.getRcCodeImpBudget());
				taxeDto.setRcUniteLiquidation(taxe.getRcUniteLiquidation());
				taxeDto.setRcMinPerceptionTaxe(taxe.getRcMinPerceptionTaxe());
				taxeDto.setRcBaseTaxe1(taxe.getRcBaseTaxe1());
				taxeDto.setRcNatureTaxe(taxe.getRcNatureTaxe());
				taxeDto.setRcOrdreEvalTaxe(taxe.getRcOrdreEvalTaxe());
				taxeDto.setRcFormuleTaxe(taxe.getRcFormuleTaxe());
				taxeDto.setRcIndComptant(taxe.getRcIndComptant());
				taxeDto.setDelCell(taxeDto.getPk());
				taxeDto.setEditCell(taxeDto.getPk()); 
				}
			return taxeDto;
		}
	
}
