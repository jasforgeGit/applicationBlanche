package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.ProduitDto;
import sn.com.douane.ejb.rc.model.entities.Produit;

public interface IProduitDao extends IGenericDao<Produit> {
	
	public String getLibelleTarifProduit(String codeprod, String precuemoa, String precSenegal) throws RcEjbException;
	
	List<Produit> getListProduitsPetroliers() throws RcEjbException;
	
	public List<ProduitDto> rechercheByWhereProduits(String where) throws RcEjbException;
}
