package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.PaysDto;
import sn.com.douane.ejb.rc.model.entities.Pays;
@Local
public interface IPaysDao extends IGenericDao<Pays>{
	
	public String findCvByPays(String codePayOrigine);

	void checkExistance(String key) throws TwreException;
	
	public List<PaysDto> rechercheByWherePays(String where) throws RcEjbException;
    
}