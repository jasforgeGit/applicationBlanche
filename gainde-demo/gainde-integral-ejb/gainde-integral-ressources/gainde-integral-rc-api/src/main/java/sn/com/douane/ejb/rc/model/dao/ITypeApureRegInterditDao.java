package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.model.entities.TypeApurRegInterdit;

public interface ITypeApureRegInterditDao extends IGenericDao<TypeApurRegInterdit>{
	
	public List<TypeApurRegInterdit> rechercheTypeRegimeApureInterdit(String typeApurement, String typeRegime, String codeRegime);

}
