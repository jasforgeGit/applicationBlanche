package sn.com.douane.ejb.rc.services;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.model.entities.Utilisateur;

@Local
public interface IAuthenticator {
	
	/**
	 * This methods searches for a user having its primary key and its path.
	 * 
	 * @param pk user's primary key
	 * @param path user's path
	 * @return the found user matched the passed parameters 
	 */
	public Utilisateur rechercheUtilisateur(String pk);
}
