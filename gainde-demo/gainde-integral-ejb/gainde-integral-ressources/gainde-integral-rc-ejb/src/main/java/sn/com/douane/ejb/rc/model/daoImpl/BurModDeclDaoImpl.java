package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IBurModDeclDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.BurModDeclDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BurModDecl;

@Stateless(name="IBurModDeclDao")
public class BurModDeclDaoImpl extends GenericDaoImpl<BurModDecl> implements IBurModDeclDao{
	
	 public List<BurModDeclDto> rechercheByWhereBurModDecl(String where) throws RcEjbException {
			List<BurModDeclDto> result = new ArrayList<BurModDeclDto>(); 	
			try {
				List<BurModDecl> listeBurModDecl = (List<BurModDecl>) rechercherByWhere(where);
				for (int i=0; i<listeBurModDecl.size(); i++) {
					BurModDeclDto burModDeclDto = getBurModDeclDto(listeBurModDecl.get(i));
					result.add(burModDeclDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public BurModDeclDto getBurModDeclDto(BurModDecl burModDecl) {
			BurModDeclDto burModDeclDto = new BurModDeclDto();
			if (burModDecl!=null){
				burModDeclDto.setRcCodeBurDecl(burModDecl.getRcCodeBurDecl());
				burModDeclDto.setRcModeDecl(burModDecl.getRcModeDecl());
				burModDeclDto.setDelCell(burModDeclDto.getPk());
				burModDeclDto.setEditCell(burModDeclDto.getPk()); 
				}
			return burModDeclDto;
		}

}
