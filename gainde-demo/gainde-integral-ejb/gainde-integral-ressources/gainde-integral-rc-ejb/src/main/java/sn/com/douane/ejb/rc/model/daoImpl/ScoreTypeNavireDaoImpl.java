package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IScoreTypeNavireDao;
import sn.com.douane.ejb.rc.model.entities.ScoreTypeNavire;


@Stateless(name="IScoreTypeNavireDao")
public class ScoreTypeNavireDaoImpl extends GenericDaoImpl<ScoreTypeNavire> implements IScoreTypeNavireDao {

	public List<ScoreTypeNavire> getListTypeNavire() throws FinderException {
		
		List<ScoreTypeNavire> listTypeNavire = new ArrayList<ScoreTypeNavire>();
		listTypeNavire.add(new ScoreTypeNavire(null,""));
		listTypeNavire.addAll(1, findAll());
		return listTypeNavire;		
	}
}
