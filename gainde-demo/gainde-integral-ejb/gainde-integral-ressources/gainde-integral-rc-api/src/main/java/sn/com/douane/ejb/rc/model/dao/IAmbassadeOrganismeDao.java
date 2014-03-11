package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.AmbassadeOrganismeDto;
import sn.com.douane.ejb.rc.model.entities.AmbassadeOrganisme;

public interface IAmbassadeOrganismeDao extends IGenericDao<AmbassadeOrganisme>{
	
	public boolean isAmbassadeByPpm(String deccodedestinataire);
	public List<AmbassadeOrganismeDto> rechercheByWhereAmbassadeOrganisme(String where) throws RcEjbException;
}
