package sn.com.douane.ejb.rc.services;

import java.math.BigDecimal;

import javax.ejb.Local;

import sn.com.douane.ejb.rc.exception.RcEjbException;

@Local
public interface IReferenceCommunSB {
	
	public BigDecimal controlerCredit(String codeppm, Double montantdecl)
            throws RcEjbException;

}
