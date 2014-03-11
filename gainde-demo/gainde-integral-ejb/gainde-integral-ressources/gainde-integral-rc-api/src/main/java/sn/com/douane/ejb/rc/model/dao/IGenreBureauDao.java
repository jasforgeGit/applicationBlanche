package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.GenreBureau;


public interface IGenreBureauDao extends IGenericDao<GenreBureau>{

	/**
	 * Gets the list of {@link GenreBureau}.
	 * 
	 * @return list of {@link GenreBureau}.
	 * @throws FinderException
	 *             thrown if error occurred when trying to find requested objects.
	 */
	List<GenreBureau> getListGenreBureau() throws FinderException;
  
	public List rechercherByWhereGenreBureau(String condition) throws RcEjbException;
}
