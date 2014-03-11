package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IBureauDouaneTypeManDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.BureauDouaneTypeManifesteDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.BureauDouaneTypeManifeste;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.ConvertUtil;

@Stateless(name = "IBureauDouaneTypeManDao")
public class BureauDouaneTypeManDaoImpl extends GenericDaoImpl<BureauDouaneTypeManifeste> implements IBureauDouaneTypeManDao {

	
	public String getBurDouaneTypeManString() throws FinderException {
		BureauDouaneTypeManifeste burdouanetypemanVO = null;
		List<BureauDouaneTypeManifeste> listBureauTypeMan = findAll();
		String codebur;
		String codeTypeman;
		String temp = "";

		for (int i = 0; i < listBureauTypeMan.size(); i++) {
			burdouanetypemanVO = listBureauTypeMan.get(i);
			codebur = burdouanetypemanVO.getRcCodeBurDouane();
			codeTypeman = ConvertUtil.converToString(burdouanetypemanVO.getRcCodeTypeManif());
			temp += (i == 0) ? (codeTypeman + ConstManif.TIELD + codebur)
					: (ConstManif.DIEZ + codeTypeman + ConstManif.TIELD + codebur);
		}
		return temp;

	}
	 public List<BureauDouaneTypeManifesteDto> rechercheByWhereBureauDouaneTypeManifeste(String where) throws RcEjbException{
			List<BureauDouaneTypeManifesteDto> result = new ArrayList<BureauDouaneTypeManifesteDto>(); 	
			try {
				List<BureauDouaneTypeManifeste> listeBureauDouaneTypeManifeste = (List<BureauDouaneTypeManifeste>) rechercherByWhere(where);
				for (int i=0; i<listeBureauDouaneTypeManifeste.size(); i++) {
					BureauDouaneTypeManifesteDto bureauDouaneTypeManifesteDto = getBureauDouaneTypeManifesteDto(listeBureauDouaneTypeManifeste.get(i));
					result.add(bureauDouaneTypeManifesteDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public BureauDouaneTypeManifesteDto getBureauDouaneTypeManifesteDto(BureauDouaneTypeManifeste bureauDouaneTypeManifeste) {
			BureauDouaneTypeManifesteDto bureauDouaneTypeManifesteDto = new BureauDouaneTypeManifesteDto();
			if (bureauDouaneTypeManifeste!=null){
				bureauDouaneTypeManifesteDto.setRcCodeBurDouane(bureauDouaneTypeManifeste.getRcCodeBurDouane());
				bureauDouaneTypeManifesteDto.setRcCodeTypeManif(bureauDouaneTypeManifeste.getRcCodeTypeManif());
				bureauDouaneTypeManifesteDto.setDelCell(bureauDouaneTypeManifesteDto.getPk());
				bureauDouaneTypeManifesteDto.setEditCell(bureauDouaneTypeManifesteDto.getPk()); 
				}
			return bureauDouaneTypeManifesteDto;
		}
}
 