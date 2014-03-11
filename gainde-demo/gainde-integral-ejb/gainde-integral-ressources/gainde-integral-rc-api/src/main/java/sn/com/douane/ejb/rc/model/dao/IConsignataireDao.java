package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.ConsignataireDto;
import sn.com.douane.ejb.rc.model.entities.Consignataire;

public interface IConsignataireDao extends IGenericDao<Consignataire>{
	public List<ConsignataireDto> rechercheByWhereConsignataire(String where) throws RcEjbException;
	
	List<Consignataire> getConsignataireByCodePpm (String codePppm); 
}
