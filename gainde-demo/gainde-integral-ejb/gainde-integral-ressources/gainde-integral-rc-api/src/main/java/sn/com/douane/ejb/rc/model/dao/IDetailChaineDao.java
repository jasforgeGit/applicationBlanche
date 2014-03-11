package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.model.entities.DetailChaine;

public interface IDetailChaineDao extends IGenericDao<DetailChaine> {
	public List<DetailChaine> rechercherDetailsChaine(Integer codeChaine) throws FinderException;

}
