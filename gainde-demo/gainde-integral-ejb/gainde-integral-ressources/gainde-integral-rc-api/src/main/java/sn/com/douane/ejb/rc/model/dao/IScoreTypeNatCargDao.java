package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeNatCarg;
import sn.com.douane.utils.LabelValue;

@Local
public interface IScoreTypeNatCargDao extends IGenericDao<ScoreTypeNatCarg> {

	List<LabelValue> getListNatureCargaison () throws TwreException; 
}
