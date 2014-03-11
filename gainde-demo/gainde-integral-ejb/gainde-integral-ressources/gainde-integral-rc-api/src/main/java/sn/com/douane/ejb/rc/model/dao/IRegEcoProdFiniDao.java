package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.RegEcoProdFini;

public interface IRegEcoProdFiniDao extends IGenericDao<RegEcoProdFini>{

	List<RegEcoProdFini> findByRegimeDlppQuery (String rcCodePpm, String rcAnneeRegEco,
			String rcNumRegEco, String rcCodeProd, String rcPrecUemoa, String rcPrecSen) throws RcEjbException;
	
}
