package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Local;

import sn.com.douane.ejb.rc.model.entities.ScoreTypeNavire;

@Local
public interface IScoreTypeNavireDao extends IGenericDao<ScoreTypeNavire> {

	public List<ScoreTypeNavire> getListTypeNavire() throws FinderException;
}
