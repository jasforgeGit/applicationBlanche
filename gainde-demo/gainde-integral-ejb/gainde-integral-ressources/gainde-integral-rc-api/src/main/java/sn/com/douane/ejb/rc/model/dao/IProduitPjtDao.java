package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.ProduitPjtDto;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;

@Local
public interface IProduitPjtDao extends IGenericDao<ProduitPjt> {

	List<ProduitPjt> rechercherByArticle(String decCodeProd,
			String decPrecuemoa, String decPrecSenegal) throws TwreException;

	public List<ProduitPjtDto> rechercheByWhereProduitPjt(String where) throws RcEjbException;
	
}
