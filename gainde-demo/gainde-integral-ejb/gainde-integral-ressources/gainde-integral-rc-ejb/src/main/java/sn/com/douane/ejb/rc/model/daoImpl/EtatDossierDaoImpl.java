package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IEtatDossierDao;
import sn.com.douane.ejb.rc.model.entities.EtatDossier;
import sn.com.douane.utils.LabelValue;

@Stateless(name="IEtatDossierDao")
public class EtatDossierDaoImpl extends GenericDaoImpl<EtatDossier> implements IEtatDossierDao{

	
	public List<LabelValue> getListeEtatDossier() throws RcEjbException, FinderException {
		List<EtatDossier> listEtatDossier = null;
		List<LabelValue> result=new ArrayList<LabelValue>();
		result.add(new LabelValue("", ""));
		EtatDossier etatdossierVO = null;
		listEtatDossier = findAll();
		for (int i = 0; i < listEtatDossier.size(); i++) {
			etatdossierVO = (EtatDossier) listEtatDossier.get(i);
			result.add(new LabelValue(etatdossierVO.getRcLibEtatDossier(), 
					etatdossierVO.getRcCodEtatDossier()));
		}
		return result; 
	}
}
