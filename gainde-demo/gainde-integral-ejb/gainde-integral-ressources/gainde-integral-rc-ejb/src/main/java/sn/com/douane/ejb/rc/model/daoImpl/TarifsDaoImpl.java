package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ITarifsDao;
import sn.com.douane.ejb.rc.model.dto.TarifDto;
import sn.com.douane.ejb.rc.model.entities.Tarif;

@Stateless(name = "ITarifsDao")
public class TarifsDaoImpl extends GenericDaoImpl<Tarif> implements ITarifsDao {
	
	
	 public String whereTarifJoinTaux(String dateCalcul) {
			return "select tr from Tarif tr,Taux tx where 1=1 " +
					"and tr.rcCodeTaxe = tx.rcCodeTaxe " +
					"and tr.rcCodeTaux = tx.rcCodeTaux " +
					"and (tr.rcDateValeur <= " + dateCalcul + " " +
					"and (" + dateCalcul + " <= tr.rcDateCloture or tr.rcDateCloture is null)) " +
					"and (tx.rcDateValeur <= tr.rcDateValeur " +
					"and (tr.rcDateValeur <= tx.rcDateCloture or tx.rcDateCloture is null)) ";  
		}
	    
	    public String whereIsNormal(String codprod, String precmuoa, String impexp) {
			return "and tr.rcCodeProd='" + codprod + "' and tr.rcPrecueMoa='"
					+ precmuoa + "' and tr.rcPrecSenegal='00' " +
					" and tr.rcCodeCimex = '" + impexp + "'" ;
		}
	    
	    public String whereNotNormal(String codprod, String precmuoa,
				String precsenegal, String impexp) {
			return "and tr.rcCodeProd='" + codprod + "' and tr.rcPrecueMoa='"
					+ precmuoa + "' and tr.rcPrecSenegal='" + precsenegal + "'" +
					" and tr.rcCodeCimex = '" + impexp + "'" ;
		}
	    
	    public String getOrderByTaxeAndTarif(){
	    	
	    	return " order by tr.rcCodeTaxe asc, tr.rcDateValeur desc, tx.rcDateValeur desc ";
	    	
	    }
	    
	    public String whereTarifJoinTauxWithDateAT(String dateCalcul) {
			return "select tr from Tarif tr,Taux tx where 1=1 " +
					"and tr.rcCodeTaxe = tx.rcCodeTaxe " +
					"and tr.rcCodeTaux = tx.rcCodeTaux " +
					"and (tr.rcDateValeur <= '" + dateCalcul + "' " +
					"and ('" + dateCalcul + "' <= tr.rcDateCloture or tr.rcDateCloture is null)) " +
					"and (tx.rcDateValeur <= tr.rcDateValeur " +
					"and (tr.rcDateValeur <= tx.rcDateCloture or tx.rcDateCloture is null)) "; 
		}
	    
	    public String whereTaxe(String codDroitDouane,String codDroitFiscal, String codTVA) {
			return " and (tr.rcCodeTaxe='" + codDroitDouane + "' or tr.rcCodeTaxe='"
					+ codDroitFiscal + "' or tr.rcCodeTaxe='" + codTVA + "' ) ";
		}    

	    public List<TarifDto> rechercheByWhereTarif(String where) throws RcEjbException{
			List<TarifDto> result = new ArrayList<TarifDto>(); 	
			try {
			      entityManager.getProperties();
			      Query query = entityManager.createQuery(where);
			      List<Tarif> listeTarif = query.setMaxResults(300).getResultList();
				//List<Tarif> listeTarif = (List<Tarif>) rechercherByWhere(where);
				for (int i=0; i<listeTarif.size(); i++) {
					TarifDto tarifDto = getTarifDto(listeTarif.get(i));
					result.add(tarifDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public TarifDto getTarifDto(Tarif tarif) {
			TarifDto tarifDto = new TarifDto();
			if (tarif!=null){
				tarifDto.setRcCodeProd(tarif.getRcCodeProd());
				tarifDto.setRcPrecueMoa(tarif.getRcPrecueMoa());
				tarifDto.setRcPrecSenegal(tarif.getRcPrecSenegal());
				tarifDto.setRcCodeTaxe(tarif.getRcCodeTaxe());
				tarifDto.setRcCodeTaux(tarif.getRcCodeTaux());
				tarifDto.setRcDateValeur(tarif.getRcDateValeur());
				tarifDto.setRcDateCloture(tarif.getRcDateCloture());
				tarifDto.setRcCodeCimex(tarif.getRcCodeCimex());
				tarifDto.setDateValeurTaux(tarif.getDateValeurTaux());
				tarifDto.setLibelleTaux(tarif.getLibelleTaux());
				tarifDto.setRcValeurTaux(tarif.getRcValeurTaux());
				tarifDto.setDelCell(tarifDto.getPk());
				tarifDto.setEditCell(tarifDto.getPk()); 
				}
			return tarifDto;
		}
}
