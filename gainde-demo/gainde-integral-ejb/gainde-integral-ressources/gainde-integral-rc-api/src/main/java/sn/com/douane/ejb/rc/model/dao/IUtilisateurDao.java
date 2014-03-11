package sn.com.douane.ejb.rc.model.dao;

import java.util.List;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.UtilisateurDto;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;

public interface IUtilisateurDao extends IGenericDao<Utilisateur> {	
	
	 void insert(Utilisateur user) throws RcEjbException;  
	
	 void update (Utilisateur user) throws RcEjbException; 
	
	 void delete(String objkey) throws RcEjbException; 
	 	 
	 void ctrlInsertUpdate (Utilisateur userVo) throws RcEjbException; 

	 Utilisateur getUtilisateurByLoginPwd(String login, String pwd) throws RcEjbException ;
	 
	 List<UtilisateurDto> rechercheByWhereUtilisateur(String where) throws RcEjbException;
	 
	 Utilisateur rechercheUtilisateur(String codeUser) throws RcEjbException; 
	 
}
