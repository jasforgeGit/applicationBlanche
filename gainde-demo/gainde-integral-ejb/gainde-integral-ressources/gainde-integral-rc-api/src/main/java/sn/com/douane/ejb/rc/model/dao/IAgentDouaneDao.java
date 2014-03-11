package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.AgentDouane;
import sn.com.douane.utils.LabelValue;

public interface IAgentDouaneDao extends IGenericDao<AgentDouane> {

	List<AgentDouane> findAgentByCodeprofilBurActQuery (String codeProfil, String codeBurAct) throws RcEjbException; 
	
	List<AgentDouane> findVerifBurAffQuery (String rcCodeBurAff, String rcCodeProfil, String rcCodeAgent) throws RcEjbException; 
	
	List<AgentDouane> findVerifBurActiviteQuery (String rcCodeBurAct, String rcCodeProfil, String rcCodeAgent) throws RcEjbException; 

	String getCodeUserRecepteur(String codeFonction, String codebur) throws RcEjbException;

	List<LabelValue> getListAgentdouane() throws FinderException, RcEjbException;
	
	int getVerificateurBureauActivite(String codeagent, String codeburactivite,
            String codeprofil) throws RcEjbException;

	List<AgentDouane> getAgentDouaneByCodeUser(String codeUser); 
}
