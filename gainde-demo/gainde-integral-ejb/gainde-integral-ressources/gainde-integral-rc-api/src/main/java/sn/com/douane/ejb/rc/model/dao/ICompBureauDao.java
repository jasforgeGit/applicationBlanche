package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.CompBureauDto;
import sn.com.douane.ejb.rc.model.entities.CompBureau;

public interface ICompBureauDao extends IGenericDao<CompBureau>{     
	/**
	 * methode d'ajout d'un nouveau CompBureau
	 * @param objVo
	 * @throws TwreException
	 */
	public void insert(CompBureau objVo) throws TwreException; 
	
	/**
	 * methode pour le contrÃ´le de l'ajout et de mise Ã  jour 
	 * d'un CompBureau
	 * @param key
	 * @throws TwreException
	 */
	public void ctrlInsertUpdate(CompBureau objVo) throws TwreException; 
	
	/**
	 * 
	 * @param vo
	 * @throws TwreException
	 */
	public void update(CompBureau vo) throws TwreException, RcEjbException ; 
	
	/**
	 * 
	 * @param key
	 * @throws TwreException
	 */
	public void delete (String key) throws TwreException, RcEjbException; 
	
	List<CompBureau> findAll() throws FinderException;

	/**
	 * Gets the list of {@link CompBureau}.
	 * 
	 * @return list of {@link CompBureau}.
	 * @throws FinderException
	 *             thrown if error occurred when trying to find requested objects.
	 */
	List<CompBureau> getListCompBureau() throws FinderException;
	
	public List<CompBureauDto> rechercheByWhereCompBureau(String where) throws RcEjbException;
		
}
