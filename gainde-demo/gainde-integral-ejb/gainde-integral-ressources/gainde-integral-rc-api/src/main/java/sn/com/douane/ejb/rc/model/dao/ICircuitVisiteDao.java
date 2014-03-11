package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.CircuitVisiteDto;
import sn.com.douane.ejb.rc.model.entities.CircuitVisite;
import sn.com.douane.utils.LabelValue;

@Local
public interface ICircuitVisiteDao extends IGenericDao<CircuitVisite> {  
	
	public void insert(CircuitVisite circuitVisite) throws RcEjbException;	
	
	public void update(CircuitVisite circuit) throws RcEjbException;
	
	public String getLibelleCircuit(String codecircuit) throws RcEjbException;
	
	public List<LabelValue> getListCircuitVisite() throws RcEjbException;
	
	public List<CircuitVisiteDto> rechercheByWhereCircuitVisite(String where) throws RcEjbException;
	
	
}
