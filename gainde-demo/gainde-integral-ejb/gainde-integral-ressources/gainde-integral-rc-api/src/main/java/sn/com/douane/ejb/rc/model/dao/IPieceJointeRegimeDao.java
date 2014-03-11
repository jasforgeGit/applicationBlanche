package sn.com.douane.ejb.rc.model.dao;

import java.util.List;

import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.entities.PieceJointeRegime;

public interface IPieceJointeRegimeDao extends IGenericDao<PieceJointeRegime> {

	List<PieceJointeRegime> rechercherByRepertoire(String typregime,
			String codregdouan, String decRegFiscal) throws TwreException ;

}
