package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegDouModeDeclDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.RegDouModeDeclDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.RegDouModeDecl;

@Stateless(name="IRegDouModeDeclDao")
public class RegDouModeDeclDaoImpl extends GenericDaoImpl<RegDouModeDecl> implements IRegDouModeDeclDao{

	
	@Override
	@SuppressWarnings("unchecked")
	public List<RegDouModeDecl> findDeclarationByRegimedouanierQuery(String typereg,
			String codereg) throws RcEjbException {
		Query query1 = entityManager.createNamedQuery("findDeclarationByRegimedouanier");
		query1.setParameter(1, typereg);
		query1.setParameter(2, codereg);
		return (List<RegDouModeDecl>) query1.getResultList();
	}
	
	 public List<RegDouModeDeclDto> rechercheByWhereRegDouModeDecl(String where) throws RcEjbException{
			List<RegDouModeDeclDto> result = new ArrayList<RegDouModeDeclDto>(); 	
			try {
				List<RegDouModeDecl> listeRegDouModeDecl = (List<RegDouModeDecl>) rechercherByWhere(where);
				for (int i=0; i<listeRegDouModeDecl.size(); i++) {
					RegDouModeDeclDto regDouModeDeclDto = getRegDouModeDeclDto(listeRegDouModeDecl.get(i));
					result.add(regDouModeDeclDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegDouModeDeclDto getRegDouModeDeclDto(RegDouModeDecl regDouModeDecl) {
			RegDouModeDeclDto regDouModeDeclDto = new RegDouModeDeclDto();
			if (regDouModeDecl!=null){
				regDouModeDeclDto.setRcTypeRegime(regDouModeDecl.getRcTypeRegime());
				regDouModeDeclDto.setRcCodeRegimeDouanier(regDouModeDecl.getRcCodeRegimeDouanier());
				regDouModeDeclDto.setRcCodeModeDeclaration(regDouModeDecl.getRcCodeModeDeclaration());
				regDouModeDeclDto.setDelCell(regDouModeDeclDto.getPk());
				regDouModeDeclDto.setEditCell(regDouModeDeclDto.getPk()); 
				}
			return regDouModeDeclDto;
		}
}
