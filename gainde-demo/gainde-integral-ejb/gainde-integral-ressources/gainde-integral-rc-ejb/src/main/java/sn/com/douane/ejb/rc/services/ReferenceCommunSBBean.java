package sn.com.douane.ejb.rc.services;

import java.math.BigDecimal;

import javax.ejb.EJB;
import javax.ejb.FinderException;
import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICreditaireDao;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.entities.Creditaire;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.utils.ConstDeclaration;
import sn.com.douane.utils.sysEnv;


@Stateless(name = "IReferenceCommunSB")
public class ReferenceCommunSBBean implements IReferenceCommunSB {
	
	
	@EJB
	private ICreditaireDao creditaireDao;
	
	@EJB
	private IPpmDao ppmDao;
	
	
	public BigDecimal controlerCredit(String codeppm, Double montantdecl)
            throws RcEjbException {

        Creditaire creditairesVO = null;
        Ppm ppmVO = null;
       
        try {
            try {
			   ppmVO = ppmDao.findByPrimaryKey(codeppm);
			   if(ppmVO == null){
				   throw new FinderException(ConstErrCod.rowNotFound);
			   }
			   
			   if (ppmVO.getRccodecreditaire() != null) {
			   creditairesVO = creditaireDao.findByPrimaryKey(ppmVO.getRccodecreditaire());
			   }
			   if(creditairesVO == null){
				   throw new FinderException(ConstErrCod.rowNotFound);
			   }
			} catch (FinderException e) {
				throw new RcEjbException(ConstErrCod.rowNotFound);
			}
         
           
            if (creditairesVO.getRcCodeSuspension() != null
                    && creditairesVO.getRcCodeSuspension().equals(
                            ConstDeclaration.Codetypedecisionsuspension)){
                throw new RcEjbException(ConstErrCod.creditsuspond);
            }else if (creditairesVO.getRcMontantResiduel().compareTo(
                    new BigDecimal(montantdecl.intValue())) == 1){
                throw new RcEjbException(ConstErrCod.creditNotDisponible);
            }
            if (sysEnv.differenceFrom2Date(creditairesVO.getRcDateCredit(),
                    sysEnv.ToDay()) < 0){
                throw new RcEjbException(ConstErrCod.creditNotRenouvler);           
            }
        } catch (RcEjbException e) {
            if (e.getMessage() != null
                    && e.getMessage().equals(ConstErrCod.rowNotFound)){
                throw new RcEjbException(ConstErrCod.codcrediterr);
            }
        }
        return creditairesVO.getRcMontantResiduel();
    }

}
