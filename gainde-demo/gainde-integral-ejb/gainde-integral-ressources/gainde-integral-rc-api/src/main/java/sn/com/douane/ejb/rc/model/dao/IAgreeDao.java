package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.entities.Agree;

public interface IAgreeDao extends IGenericDao<Agree>{

	List<Agree> findByCodeUserQuery (String rcCodePpm) throws RcEjbException; 
	
	void checkExistance(String key) throws TwreException;
	
	  public List<AgreeDto> rechercheByWhereAgree(String where) throws RcEjbException;
}
