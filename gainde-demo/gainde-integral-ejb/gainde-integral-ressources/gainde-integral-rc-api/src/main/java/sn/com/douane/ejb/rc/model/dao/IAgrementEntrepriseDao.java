package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.AgrementEntrepriseDto;
import sn.com.douane.ejb.rc.model.entities.AgrementEntreprise;

@Local
public interface IAgrementEntrepriseDao extends IGenericDao<AgrementEntreprise>{

	public boolean createAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws RcEjbException;
	public boolean updateAgrementEntreprise(AgrementEntreprise agrementEntreprise) throws RcEjbException;
	public boolean removeAgrementEntreprise(String rcagrent,String rcrgrpays,String rccodpays) throws RcEjbException;
	public List<AgrementEntrepriseDto> rechercherByWhereAgrementEntreprise(String where) throws RcEjbException;
	AgrementEntreprise rechercheByCodeAgrePays (String codePays, String codeAgree); 
}
