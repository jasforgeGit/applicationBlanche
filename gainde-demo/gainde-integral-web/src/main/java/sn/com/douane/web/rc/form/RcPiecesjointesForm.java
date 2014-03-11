package sn.com.douane.web.rc.form;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import sn.com.douane.ejb.rc.model.entities.PieceJointe;
import sn.com.douane.utils.DateUtil;



/**
 * @author Taher
 *
 */
public class RcPiecesjointesForm implements Serializable {

	private static final long serialVersionUID = -7205246480851120434L;
	
	private String pk;
	private String etat;

	/*** Attributs Table PIECESJOINTES ***/
	//Champs de saisie
	private String TNUM_RCCODEPIECEJOINTE_OB;
	private String DAT_RCDATEPIECEJOINTE_OB;
	private String TNUM_RCDESPIECEJOINTE_OB;
	private String TNUM_LIST_RCNATUREPIECEJOINTE;

	//Champs de recherche
	private String TNUM_RCCODEPIECEJOINTERech;
	private String DAT_RCDATEPIECEJOINTERech;
	private String TNUM_RCDESPIECEJOINTERech;
	private String TNUM_LIST_RCNATUREPIECEJOINTERech;

	List<PieceJointe> listeRcPiecesjointes = new ArrayList<PieceJointe>();
	PieceJointe piecesjointesvo = new PieceJointe();

	/*** Methode getNewPIECESJOINTESVO () ***/
	public PieceJointe getNewRcPiecesjointesVO() {
		PieceJointe piecesjointesvo = new PieceJointe();

		piecesjointesvo.setRcCodePieceJointe(getTNUM_RCCODEPIECEJOINTE_OB());
		if (getDAT_RCDATEPIECEJOINTE_OB()!=null && !getDAT_RCDATEPIECEJOINTE_OB().equals(""))
			piecesjointesvo.setRcDatePieceJointe(new Date(DateUtil.convertStringToDate(getDAT_RCDATEPIECEJOINTE_OB()).getTime()));
		piecesjointesvo.setRcDesPieceJointe(getTNUM_RCDESPIECEJOINTE_OB());
		piecesjointesvo.setRcNaturePieceJointe(getTNUM_LIST_RCNATUREPIECEJOINTE());

		return piecesjointesvo;
	}

	/*** Methode setPiecesjointes () ***/
	public void setPiecesjointes (PieceJointe piecesjointesvo) {

		setTNUM_RCCODEPIECEJOINTE_OB (piecesjointesvo.getRcCodePieceJointe());
		if (piecesjointesvo.getRcDatePieceJointe()!=null)
			setDAT_RCDATEPIECEJOINTE_OB (DateUtil.getDate(new Date(piecesjointesvo.getRcDatePieceJointe().getTime())));
		setTNUM_RCDESPIECEJOINTE_OB (piecesjointesvo.getRcDesPieceJointe());
		setTNUM_LIST_RCNATUREPIECEJOINTE (piecesjointesvo.getRcNaturePieceJointe());

	}

	/*** Methodes reset ***/
	public void reset() {
		TNUM_RCCODEPIECEJOINTE_OB="";
		DAT_RCDATEPIECEJOINTE_OB="";
		TNUM_RCDESPIECEJOINTE_OB="";
		TNUM_LIST_RCNATUREPIECEJOINTE="";
	}
	public void resetChampsRecherche() {
		TNUM_RCCODEPIECEJOINTERech="";
		DAT_RCDATEPIECEJOINTERech="";
		TNUM_RCDESPIECEJOINTERech="";
		TNUM_LIST_RCNATUREPIECEJOINTERech="";
	}

	/*** Methodes get et set ***/
	public String getTNUM_RCCODEPIECEJOINTE_OB () {
		return TNUM_RCCODEPIECEJOINTE_OB;
	}

	public void setTNUM_RCCODEPIECEJOINTE_OB (String tnum_rccodepiecejointe_ob) {
		TNUM_RCCODEPIECEJOINTE_OB = tnum_rccodepiecejointe_ob;
	}

	public String getDAT_RCDATEPIECEJOINTE_OB () {
		return DAT_RCDATEPIECEJOINTE_OB;
	}

	public void setDAT_RCDATEPIECEJOINTE_OB (String dat_rcdatepiecejointe_ob) {
		DAT_RCDATEPIECEJOINTE_OB = dat_rcdatepiecejointe_ob;
	}

	public String getTNUM_RCDESPIECEJOINTE_OB () {
		return TNUM_RCDESPIECEJOINTE_OB;
	}

	public void setTNUM_RCDESPIECEJOINTE_OB (String tnum_rcdespiecejointe_ob) {
		TNUM_RCDESPIECEJOINTE_OB = tnum_rcdespiecejointe_ob;
	}

	public String getTNUM_LIST_RCNATUREPIECEJOINTE () {
		return TNUM_LIST_RCNATUREPIECEJOINTE;
	}

	public void setTNUM_LIST_RCNATUREPIECEJOINTE (String tnum_list_rcnaturepiecejointe) {
		TNUM_LIST_RCNATUREPIECEJOINTE = tnum_list_rcnaturepiecejointe;
	}

	public String getTNUM_RCCODEPIECEJOINTERech () {
		return TNUM_RCCODEPIECEJOINTERech;
	}

	public void setTNUM_RCCODEPIECEJOINTERech (String tnum_rccodepiecejointerech) {
		TNUM_RCCODEPIECEJOINTERech = tnum_rccodepiecejointerech;
	}

	public String getDAT_RCDATEPIECEJOINTERech () {
		return DAT_RCDATEPIECEJOINTERech;
	}

	public void setDAT_RCDATEPIECEJOINTERech (String dat_rcdatepiecejointerech) {
		DAT_RCDATEPIECEJOINTERech = dat_rcdatepiecejointerech;
	}

	public String getTNUM_RCDESPIECEJOINTERech () {
		return TNUM_RCDESPIECEJOINTERech;
	}

	public void setTNUM_RCDESPIECEJOINTERech (String tnum_rcdespiecejointerech) {
		TNUM_RCDESPIECEJOINTERech = tnum_rcdespiecejointerech;
	}

	public String getTNUM_LIST_RCNATUREPIECEJOINTERech () {
		return TNUM_LIST_RCNATUREPIECEJOINTERech;
	}

	public void setTNUM_LIST_RCNATUREPIECEJOINTERech (String tnum_list_rcnaturepiecejointerech) {
		TNUM_LIST_RCNATUREPIECEJOINTERech = tnum_list_rcnaturepiecejointerech;
	}

	public PieceJointe getPiecesjointesVO () {
		return piecesjointesvo;
	}

	public void setPiecesjointesVO (PieceJointe piecesjointesvo) {
		this.piecesjointesvo = piecesjointesvo;
	}

	public List<PieceJointe> getListeRcPiecesjointes () {
		return listeRcPiecesjointes;
	}

	public void setListeRcPiecesjointes (List<PieceJointe> listeRcPiecesjointes2) {
		this.listeRcPiecesjointes = listeRcPiecesjointes2;
	}

	public String getPk () {
		return pk;
	}

	public void setPk (String pk) {
		this.pk = pk;
	}

	public String getEtat () {
		return etat;
	}

	public void setEtat (String etat) {
		this.etat = etat;
	}
}