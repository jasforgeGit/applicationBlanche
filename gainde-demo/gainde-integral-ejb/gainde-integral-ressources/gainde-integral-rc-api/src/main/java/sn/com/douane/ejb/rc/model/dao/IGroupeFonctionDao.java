package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dto.GroupefonctionDto;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.utils.LabelValue;
import sn.com.douane.utils.ListeGroupe;

public interface IGroupeFonctionDao extends IGenericDao<GroupeFonction> {
	
	 void insert(GroupeFonction objVo) throws RcEjbException; 
	
	 void ctrlInsertUpdate(GroupeFonction vo) throws RcEjbException; 
	
	 void update(GroupeFonction objvo) throws RcEjbException; 
	
	 void delete(Integer objkey) throws RcEjbException; 
	
	 List<GroupeFonction> rechercherDetailGroupefonctionGroupefonction(Integer key) throws RcEjbException; 
	
	 List<ProfilGroupe> rechercherDetailGroupefonctionProfilgroupe(Integer key) throws RcEjbException; 
	
	 List<RegroupFonctions> rechercherDetailGroupefonctionRegroupfonctions(Integer key) throws RcEjbException; 

	 List<LabelValue> getListeGroupefonction() throws RcEjbException; 
	
	GroupeFonction findCodegroupeOrderQuery (Integer codeGroup)  throws RcEjbException;
	
	List<GroupeFonction> findByCodegrpePereQuery(Integer rccodegrppere) throws RcEjbException;	
	
	GroupeFonction rechercherByCodeFonctionInOrder(Integer codegroupe) throws RcEjbException;
	
	List<GroupeFonction> rechercherByCodeGroupePereInOrder(Integer codegrppere)
			throws RcEjbException;
	public List<GroupefonctionDto> rechercheByWhereGroupefonction(String where) throws RcEjbException;
	
	public GroupefonctionDto getGroupefonctionDto(GroupeFonction groupefonction);
	
	 public ListeGroupe getListeGroupe(String codeprofil) throws Exception;
	
	    public List getListeGroupefonctionDelegations(String codeprofil) throws TwreException, RcEjbException;
}
