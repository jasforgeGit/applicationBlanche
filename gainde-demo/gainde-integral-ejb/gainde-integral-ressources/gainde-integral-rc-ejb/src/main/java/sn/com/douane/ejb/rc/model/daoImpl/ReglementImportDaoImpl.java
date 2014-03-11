package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IReglementImportDao;
import sn.com.douane.ejb.rc.model.entities.ReglementImport;
import sn.com.douane.ejb.rc.model.keys.ReglementImportKey;

@Stateless(name="IReglementImportDao")
public class ReglementImportDaoImpl extends GenericDaoImpl<ReglementImport> implements IReglementImportDao{

	private transient final Log log = LogFactory.getLog(getClass());	
	
	/**
	 * cette methode permet de rechercher le circuit
	 * de visite dans la table REGLEMENTIMPORT à partir de son clé primaire
	 * @throws SQLException 
	 */	
	public String findCvByReglementImport(String codeProduit,String precisionMoa,
					String precisionSen,String codeImp) {
	
		String circuitVisite = null;		  
		ReglementImportKey reglementImportKey = new ReglementImportKey(codeProduit,precisionMoa,precisionSen,codeImp);
		try {
			ReglementImport reglementImport = findByPrimaryKey(reglementImportKey);
			if(reglementImport == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}else {
				circuitVisite = reglementImport.getRcCircuitVisite();
			}
		} catch (FinderException e) {
			log.error(e.getMessage(),e);
		}
		
		return circuitVisite;		
	}	

	
}
