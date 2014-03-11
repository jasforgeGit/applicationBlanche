package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.entities.EtatDossier;
import sn.com.douane.utils.LabelValue;

public interface IEtatDossierDao extends IGenericDao<EtatDossier>{

	List<LabelValue> getListeEtatDossier() throws RcEjbException, FinderException; 
}
