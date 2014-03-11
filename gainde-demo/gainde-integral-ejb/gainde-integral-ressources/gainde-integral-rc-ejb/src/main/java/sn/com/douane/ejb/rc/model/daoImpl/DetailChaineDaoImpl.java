package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IDetailChaineDao;
import sn.com.douane.ejb.rc.model.entities.DetailChaine;

@Stateless(name="IDetailChaineDao")
public class DetailChaineDaoImpl extends GenericDaoImpl<DetailChaine> implements IDetailChaineDao{

	@Override
	public List<DetailChaine> rechercherDetailsChaine(Integer codeChaine)
			throws FinderException {
		// TODO Auto-generated method stub
		return null;
	}
	/*public List<CritereDisplay> rechercherDetailsChaine(Integer codeChaine) throws FinderException
	{  List<CritereDisplay> lstDisplay=new ArrayList();
	   CritereDisplay critere=null;
	  List<DetailChaine> lstchaine =new ArrayList();
	  lstchaine =(List<DetailChaine>) rechercherByWhere("from DetailChaine where rcCodeChaine="+codeChaine+" ");
	  Iterator itr=lstchaine.iterator();
			  while(itr.hasNext())
			  {   critere=new CritereDisplay();
				  DetailChaine detailChaine=(DetailChaine) itr.next();
				  critere.
		        Operateur oper=operateurDao.findByPrimaryKey(detailChaine.getCodeOperateur());
		        
			  }
	  System.out.println("TAILLE DETAIL CHAINE : "+lstchaine.size());
		return lstchaine;
	}*/

}
