package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.f9.entities.F9Entity;

public interface IF9 extends IGenericDao<F9Entity>{

	 public List f9Recherche(String pks, String where, String tableName, List vFieldTyp, String field);
}
