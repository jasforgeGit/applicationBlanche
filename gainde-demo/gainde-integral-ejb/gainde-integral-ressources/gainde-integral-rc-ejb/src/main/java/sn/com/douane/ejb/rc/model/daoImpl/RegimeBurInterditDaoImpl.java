package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegimeBurInterditDao;
import sn.com.douane.ejb.rc.model.dto.RegimeBurInterditDto;
import sn.com.douane.ejb.rc.model.entities.RegimeBurInterdit;

@Stateless(name = "IRegimeBurInterditDao")
public class RegimeBurInterditDaoImpl extends GenericDaoImpl<RegimeBurInterdit>
		implements IRegimeBurInterditDao {


    public List<RegimeBurInterditDto> rechercheByWhereRegimeBurInterdit(String where) throws RcEjbException{
		List<RegimeBurInterditDto> result = new ArrayList<RegimeBurInterditDto>(); 	
		try {
			List<RegimeBurInterdit> listeRegimeBurInterdit = (List<RegimeBurInterdit>) rechercherByWhere(where);
			for (int i=0; i<listeRegimeBurInterdit.size(); i++) {
				RegimeBurInterditDto regimeBurInterditDto = getRegimeBurInterditDto(listeRegimeBurInterdit.get(i));
				result.add(regimeBurInterditDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public RegimeBurInterditDto getRegimeBurInterditDto(RegimeBurInterdit regimeBurInterdit) {
		RegimeBurInterditDto regimeBurInterditDto = new RegimeBurInterditDto();
		if (regimeBurInterdit!=null){
			regimeBurInterditDto.setRcTypeRegime(regimeBurInterdit.getRcTypeRegime());
			regimeBurInterditDto.setRcCodeBurDouane(regimeBurInterdit.getRcCodeBurDouane());
			regimeBurInterditDto.setRcCodeRegimeDouanier(regimeBurInterdit.getRcCodeRegimeDouanier());
			regimeBurInterditDto.setDelCell(regimeBurInterditDto.getPk());
			regimeBurInterditDto.setEditCell(regimeBurInterditDto.getPk()); 
			}
		return regimeBurInterditDto;
	}
	
}
