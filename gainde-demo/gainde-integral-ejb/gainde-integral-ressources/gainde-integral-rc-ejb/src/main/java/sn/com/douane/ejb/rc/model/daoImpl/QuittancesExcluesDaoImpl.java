package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.List;
import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IQuittancesExcluesDao;
import sn.com.douane.ejb.rc.model.dto.SaisieQuittanceExclueDto;
import sn.com.douane.ejb.rc.model.entities.QuittancesExclues;
import sn.com.douane.utils.sysEnv;



@Stateless(name = "IQuittancesExcluesDao")
public class QuittancesExcluesDaoImpl extends GenericDaoImpl<QuittancesExclues> implements IQuittancesExcluesDao{
	
	private transient final Log log = LogFactory.getLog(getClass());
	
	public boolean existQuittanceexclue(String numquitt) {
		boolean test = false;
		int nb=0;

		  try{

		  List<QuittancesExclues> list=(List<QuittancesExclues>) rechercherByWhere("from QuittancesExclues where numeroQuittance = '"+numquitt+"'");
			  nb=list.size();
          }catch(Exception e1){ }
		 
          if(nb!=0){
	     	
	        test=true;
	        }
		return test;

	}
	public void insertQuittanceExclue(SaisieQuittanceExclueDto objvo)
			throws RcEjbException {
		SaisieQuittanceExclueDto vo = objvo;
		try {
			QuittancesExclues quittances = new QuittancesExclues();
			quittances.setNumeroQuittance(vo.getTrNumQuittanceExclue());
			quittances.setDateAjout(sysEnv.ToDayTimeStamp());
			create(quittances);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
	}
	
	public boolean supprimerQuittanceExclue(String num){		
		boolean test = false;
		try {
			remove(num);
			test = true;
		} catch (FinderException e) {
			log.error(e.getMessage(),e);
		} catch (RemoveException e) {
			log.error(e.getMessage(),e);
		}		
		return test;
	}
}
