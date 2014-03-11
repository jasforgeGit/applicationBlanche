package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.CompagnieassisteeDto;
import sn.com.douane.ejb.rc.model.entities.CompagnieAssistee;

public interface ICompagnieAssisteeDao extends IGenericDao<CompagnieAssistee> {

	public List<CompagnieAssistee> getListCompagnieassistee () throws FinderException;
	public List<CompagnieassisteeDto> rechercheByWhereCompagnieAssistee(String where) throws RcEjbException;
}
