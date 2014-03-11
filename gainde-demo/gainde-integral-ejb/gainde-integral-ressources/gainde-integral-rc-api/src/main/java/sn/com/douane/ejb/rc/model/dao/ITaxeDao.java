package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.TaxeDto;
import sn.com.douane.ejb.rc.model.entities.Taxe;

@Local
public interface ITaxeDao extends IGenericDao<Taxe> {

	/**
	 * Where taxes prelevements.
	 *
	 * @param string the string
	 * @param string2 the string2
	 * @param string3 the string3
	 * @param string4 the string4
	 * @return the string
	 */
	public String whereTaxesPrelevements(String string, String string2,
			String string3, String string4);

	/**
	 * Rechercher by where prelevement.
	 *
	 * @param where the where
	 * @return the list
	 * @throws TwreException the twre exception
	 */
	public List<Taxe> rechercherByWherePrelevement(String where) throws TwreException;

	/**
	 * Where taxes tresor interet de retard.
	 *
	 * @param string the string
	 * @param string2 the string2
	 * @param string3 the string3
	 * @return the string
	 */
	public String whereTaxesTresorInteretDeRetard(String string,
			String string2, String string3);

	 public List<TaxeDto> rechercheByWhereTaxe(String where) throws RcEjbException;
	
}
