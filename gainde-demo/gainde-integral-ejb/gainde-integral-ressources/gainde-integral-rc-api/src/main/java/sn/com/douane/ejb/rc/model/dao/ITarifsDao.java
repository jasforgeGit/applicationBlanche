package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.TarifDto;
import sn.com.douane.ejb.rc.model.entities.Tarif;

@Local
public interface ITarifsDao extends IGenericDao<Tarif> {

	public String whereTarifJoinTaux(String dateCalcul);

	public String whereIsNormal(String codprod, String precmuoa, String impexp);

	public String whereNotNormal(String codprod, String precmuoa,
			String precsenegal, String impexp);

	public String getOrderByTaxeAndTarif();
	
	public String whereTarifJoinTauxWithDateAT(String dateCalcul);
	
	public String whereTaxe(String codDroitDouane,String codDroitFiscal, String codTVA);

	 public List<TarifDto> rechercheByWhereTarif(String where) throws RcEjbException;
	
}
