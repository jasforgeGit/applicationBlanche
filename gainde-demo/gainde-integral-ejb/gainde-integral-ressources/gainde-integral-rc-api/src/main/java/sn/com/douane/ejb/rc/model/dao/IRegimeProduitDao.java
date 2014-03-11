package sn.com.douane.ejb.rc.model.dao;

import java.util.List;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.RegimeProduitDto;
import sn.com.douane.ejb.rc.model.entities.RegimeProduit;

public interface IRegimeProduitDao extends IGenericDao<RegimeProduit>{

	 public List<RegimeProduitDto> rechercheByWhereRegimeProduit(String where) throws RcEjbException;
}
