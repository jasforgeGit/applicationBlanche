package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.RgepFinImp;

public interface IRgepFinImpDao extends IGenericDao<RgepFinImp> {

	List<RgepFinImp> findControlProduitFiniQuery (String rcCodePpm, String rcAnneeRegEco,
            String rcNumRegEco, String rcCodeProd, String rcPrecUemoa, String rcPrecSen, 
            Integer rcNumeroGamme) throws RcEjbException; 
}
