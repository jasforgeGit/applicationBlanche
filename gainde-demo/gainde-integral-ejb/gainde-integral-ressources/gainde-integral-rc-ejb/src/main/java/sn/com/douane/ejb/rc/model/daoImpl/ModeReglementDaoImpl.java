package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IModeReglementDao;
import sn.com.douane.ejb.rc.model.entities.ModeReglement;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;



@Stateless(name = "IModeReglementDao")
public class ModeReglementDaoImpl extends GenericDaoImpl<ModeReglement>
		implements IModeReglementDao {
	



	@Override
	public List<LabelValue> getListeModereglementWithLibelle() throws RcEjbException {
		List<ModeReglement> modeReglementList = null;
		List<LabelValue> labelValueList = new ArrayList<LabelValue>();
		ModeReglement modeReglement = null;
		try {
			modeReglementList = findAll();		
			
		for (int i = 0; i < modeReglementList.size(); i++) {
			modeReglement = (ModeReglement) modeReglementList.get(i);
			labelValueList.add(new LabelValue(ConvertUtil
					.converToString(modeReglement.getRcCodeModeReg())
					+ " - " + modeReglement.getRcLibReglement(),
					ConvertUtil.converToString(modeReglement
							.getRcCodeModeReg())
							+ " - "
							+ modeReglement.getRcLibReglement()
							+ " - "
							+ modeReglement.getJourTresModReg().getTrCodeJournal()));
		}
		} catch (FinderException e) {
			throw new RcEjbException(e.getMessage());
		}
		return labelValueList;
	}


	@Override
	public List<ModeReglement> rechercherByJournalTresor(String codejrnal) {
		return (List<ModeReglement>) rechercherByWhere(" FROM ModeReglement WHERE jourTresModReg='"+codejrnal+"'");
	}


}
