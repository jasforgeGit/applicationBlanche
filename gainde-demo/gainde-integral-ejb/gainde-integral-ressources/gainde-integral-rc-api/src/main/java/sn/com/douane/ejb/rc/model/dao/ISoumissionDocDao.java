package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.SoumissionDocDto;
import sn.com.douane.ejb.rc.model.entities.SoumissionDoc;

public interface ISoumissionDocDao extends IGenericDao<SoumissionDoc> {

	public List<SoumissionDoc> getListSoumissionDoc() throws FinderException;
	
	public List<SoumissionDocDto> rechercheByWhereSoumissionDoc(String where) throws RcEjbException;
}
