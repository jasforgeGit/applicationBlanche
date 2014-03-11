package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeDestinataireDto;
import sn.com.douane.ejb.rc.model.entities.RegimeDestinataire;

public interface IRegimeDestinataireDao extends IGenericDao<RegimeDestinataire> {

	public List<RegimeDestinataireDto> rechercheByWhereRegimeDestinataire(String where) throws RcEjbException;
	
}
