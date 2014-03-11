package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.ScoreSensVoy;
import sn.com.douane.utils.LabelValue;

@Local
public interface IScoreSensVoyDao extends IGenericDao<ScoreSensVoy> {

	List<LabelValue> getListTypeSensVoyage() throws TwreException; 
}
