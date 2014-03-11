package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IAgreeDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.CreditaireDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Creditaire;

@Stateless(name="IAgreeDao")
public class AgreeDaoImpl extends GenericDaoImpl<Agree> implements IAgreeDao{

	@SuppressWarnings("unchecked")
	@Override
	public List<Agree> findByCodeUserQuery(String rcCodePpm) throws RcEjbException {
		 Query qry = entityManager.createNamedQuery("findByCodeUser");
	        qry.setParameter(1, rcCodePpm);
	        return (List<Agree>) qry.getResultList(); 
	}

	 /**
     * permet de verifier l'existance de l'element passé en paramètre
     * 
     * @param key
     * @return
     * @throws TwreException
     */
    public void checkExistance(String codeAgree) throws TwreException {
        Agree agree = null;
        try {
            agree = findByPrimaryKey(codeAgree);
            if(agree == null){
            	throw new FinderException(ConstErrCod.rowNotFound);
            }
        } catch (FinderException e) {
            throw new TwreException(ConstErrCod.agreeKey);
        } 
    }
	
    public List<AgreeDto> rechercheByWhereAgree(String where) throws RcEjbException{
		List<AgreeDto> result = new ArrayList<AgreeDto>(); 	
		try {
			List<Agree> listeAgree = (List<Agree>) rechercherByWhere(where);
			for (int i=0; i<listeAgree.size(); i++) {
				AgreeDto agreeDto = getAgreeDto(listeAgree.get(i));
				result.add(agreeDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public AgreeDto getAgreeDto(Agree agree) {
		AgreeDto agreeDto = new AgreeDto();
		if (agree!=null){
			agreeDto.setRcCodeAgree(agree.getRcCodeAgree());
			agreeDto.setRcCodePpm(agree.getRcCodePpm());
			agreeDto.setRcDateDecision(agree.getRcDateDecision());
			agreeDto.setRcEtatAgree(agree.getRcEtatAgree());
			agreeDto.setRcNumDecision(agree.getRcNumDecision());
			agreeDto.setRcRetrait(agree.getRcRetrait());
			agreeDto.setRcSuspendu(agree.getRcSuspendu());
			agreeDto.setRcTypeDecision(agree.getRcTypeDecision());
			agreeDto.setDelCell(agreeDto.getPk());
			agreeDto.setEditCell(agreeDto.getPk()); 
			}
		return agreeDto;
	}
}
