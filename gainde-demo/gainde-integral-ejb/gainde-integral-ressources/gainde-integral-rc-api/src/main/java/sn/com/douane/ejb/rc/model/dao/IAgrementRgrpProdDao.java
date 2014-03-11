package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.AgrementRgrpProdDto;
import sn.com.douane.ejb.rc.model.entities.AgrementRgrpProd;

public interface IAgrementRgrpProdDao extends IGenericDao<AgrementRgrpProd>{

	public List<AgrementRgrpProdDto> rechercherByWhereAgrementRgrpProd(String where) throws RcEjbException;
}
