package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ISoumissionDocDao;
import sn.com.douane.ejb.rc.model.dto.SoumissionDocDto;
import sn.com.douane.ejb.rc.model.entities.SoumissionDoc;

@Stateless(name = "ISoumissionDocDao")
public class SoumissionDocDaoImpl extends GenericDaoImpl<SoumissionDoc>
		implements ISoumissionDocDao {

	@Override
	public List<SoumissionDoc> getListSoumissionDoc() throws FinderException {
		List<SoumissionDoc> listSoumissionDoc = new ArrayList<SoumissionDoc>();
		//listSoumissionDoc.add(new SoumissionDoc("",""));
		listSoumissionDoc.addAll(findAll());
		return listSoumissionDoc;
	}

	  public List<SoumissionDocDto> rechercheByWhereSoumissionDoc(String where) throws RcEjbException{
			List<SoumissionDocDto> result = new ArrayList<SoumissionDocDto>(); 	
			try {
				List<SoumissionDoc> listeSoumissionDoc = (List<SoumissionDoc>) rechercherByWhere(where);
				for (int i=0; i<listeSoumissionDoc.size(); i++) {
					SoumissionDocDto soumissionDocDto = getSoumissionDocDto(listeSoumissionDoc.get(i));
					result.add(soumissionDocDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public SoumissionDocDto getSoumissionDocDto(SoumissionDoc soumissionDoc) {
			SoumissionDocDto soumissionDocDto = new SoumissionDocDto();
			if (soumissionDoc!=null){
				soumissionDocDto.setRccodesoumdoc(soumissionDoc.getRccodesoumdoc());
				soumissionDocDto.setRclibellesoumdoc(soumissionDoc.getRclibellesoumdoc());
				soumissionDocDto.setRccodepiecejointe(soumissionDoc.getRccodepiecejointe());
				soumissionDocDto.setDelCell(soumissionDocDto.getPk());
				soumissionDocDto.setEditCell(soumissionDocDto.getPk()); 
				}
			return soumissionDocDto;
		}
	
}
