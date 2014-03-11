package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IChapitreSectionDao;
import sn.com.douane.ejb.rc.model.entities.ChapitreSection;

@Stateless(name = "IChapitreSectionDao")
public class ChapitreSectionDaoImpl extends  GenericDaoImpl<ChapitreSection> implements IChapitreSectionDao {

}