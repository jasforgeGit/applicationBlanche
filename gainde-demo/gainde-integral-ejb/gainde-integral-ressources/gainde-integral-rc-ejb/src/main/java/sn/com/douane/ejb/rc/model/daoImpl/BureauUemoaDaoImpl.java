package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IBureauUemoaDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.BureauUemoaDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BureauUemoa;

@Stateless(name="IBureauUemoaDao")
public class BureauUemoaDaoImpl extends GenericDaoImpl<BureauUemoa> implements IBureauUemoaDao {
	
	public List<BureauUemoaDto> rechercheByWhereBureauUemoa(String where) throws RcEjbException {
		List<BureauUemoaDto> result = new ArrayList<BureauUemoaDto>(); 	
		try {
			List<BureauUemoa> listeBureauUemoa = (List<BureauUemoa>) rechercherByWhere(where);
			for (int i=0; i<listeBureauUemoa.size(); i++) {
				BureauUemoaDto bureauUemoaDto = getBureauUemoaDto(listeBureauUemoa.get(i));
				result.add(bureauUemoaDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public BureauUemoaDto getBureauUemoaDto(BureauUemoa bureauUemoa) {
		BureauUemoaDto bureauUemoaDto = new BureauUemoaDto();
		if (bureauUemoa!=null){
			bureauUemoaDto.setRcCodeBurUemoa(bureauUemoa.getRcCodeBurUemoa());
			bureauUemoaDto.setRcLibelleBurUemoa(bureauUemoa.getRcLibelleBurUemoa());
			bureauUemoaDto.setDelCell(bureauUemoaDto.getPk());
			bureauUemoaDto.setEditCell(bureauUemoaDto.getPk()); 
			}
		return bureauUemoaDto;
	}

}
