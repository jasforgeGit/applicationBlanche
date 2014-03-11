package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.FinderException;
import javax.ejb.Stateless;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IPaysDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.PaysDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Pays;
@Stateless(name="IPaysDao")
public class PaysDaoImpl extends GenericDaoImpl<Pays> implements IPaysDao{

	private transient final Log log = LogFactory.getLog(getClass());	
	
	/**
	 * cette methode permet de rechercher le 
	 * circuit visite d'un pays par son code
	 * @throws SQLException 
	 */
	public String findCvByPays(String codePayOrigine)  {		
		
		String circuitVisite = null;		
	     
		
		try {
			Pays pay = findByPrimaryKey(codePayOrigine);
			if(pay == null){
				throw new FinderException(ConstErrCod.rowNotFound);
			}else {
				circuitVisite = pay.getRccircuitvisite();
			}
		} catch (FinderException e) {
			log.error(e.getMessage(),e);
		}			
		
		return circuitVisite;
	}	



	 /**
     * permet de verifier l'existance de l'element passé en paramètre
     * 
     * @param key
     * @return
     * @throws TwreException
     */
    public void checkExistance(String codePay) throws TwreException {
        Pays pays = null;
        try {
        	pays = findByPrimaryKey(codePay);
        	if(pays == null){
        		throw new FinderException(ConstErrCod.rowNotFound);
        	}
        } catch (FinderException e) {
            throw new TwreException(ConstErrCod.paysKey);
        } 
    }
    public List<PaysDto> rechercheByWherePays(String where) throws RcEjbException{
  		List<PaysDto> result = new ArrayList<PaysDto>(); 	
  		try {
  			List<Pays> listePays = (List<Pays>) rechercherByWhere(where);
  			for (int i=0; i<listePays.size(); i++) {
  				PaysDto paysDto = getPaysDto(listePays.get(i));
  				result.add(paysDto); 
  			}	
  		}catch(Exception e) {
  			throw new RcEjbException(ConstErrCod.rowNotFound); 
  		}
  		return result;
  		
  	}	
  	public PaysDto getPaysDto(Pays pays) {
  		PaysDto paysDto = new PaysDto();
  		if (pays!=null){
  			paysDto.setRccodepays(pays.getRccodepays());
  			paysDto.setRcpaysalphabetique(pays.getRcpaysalphabetique());
  			paysDto.setRclibellepays(pays.getRclibellepays());
  			paysDto.setRccodedevise(pays.getRccodedevise());
  			paysDto.setRccodelangue(pays.getRccodelangue());
  			paysDto.setRccodemonnetaire(pays.getRccodemonnetaire());
  			paysDto.setRccodeprohibition(pays.getRccodeprohibition());
  			paysDto.setRcdateprohibition(pays.getRcdateprohibition());
 			paysDto.setRcnaturefiscalite(pays.getRcnaturefiscalite());
  			paysDto.setRccircuitvisite(pays.getRccircuitvisite());
  			paysDto.setRcdatefiscalite(pays.getRcdatefiscalite());
  			paysDto.setDelCell(paysDto.getPk());
  			paysDto.setEditCell(paysDto.getPk()); 
  			}
  		return paysDto;
  	}
}