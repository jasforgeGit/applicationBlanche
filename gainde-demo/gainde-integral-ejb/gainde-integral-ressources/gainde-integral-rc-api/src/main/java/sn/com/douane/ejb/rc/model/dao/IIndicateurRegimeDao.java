package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.IndicateurRegimeDto;
import sn.com.douane.ejb.rc.model.entities.IndicateurRegime;

public interface IIndicateurRegimeDao extends IGenericDao<IndicateurRegime> {
	
	public String getWhereClauseByRegime();

	public String whereRegimeOuvraison();
	
	public  List<IndicateurRegime> whereRegime(String rccoderegimedouanier, String rctyperegime, String indicateur);

	public String whereRegimeOuvraison(String rccoderegimefiscal,
			String rccoderegimedouanier, String rctyperegime,
			String rcCodeIndicateur);
	 public List<IndicateurRegimeDto> rechercheByWhereIndicateurRegime(String where) throws RcEjbException;
}
