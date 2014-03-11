<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcProduitspjtFB.ModificationProduitspjt" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.TNUM_LIST_RCCODEPIECEJOINTE_OB" /></th>
		<td><s:textfield name="numListRcCodePieceJointeOB" readonly="true"
				id="TNUM_LIST_RCCODEPIECEJOINTE_OB" maxlength="3"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitspjtFB.TNUM_RCCODEPRODUIT_OB" /></th>
		<td><s:textfield name="numRcCodeProduitOB" id="TNUM_RCCODEPRODUIT_OB" readonly="true"
				maxlength="6" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.TNUM_RCPRECSENPROD_OB" /></th>
		<td><s:textfield name="numRcPrecSenProdOB" readonly="true"
				id="TNUM_RCPRECSENPROD_OB" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitspjtFB.TNUM_RCPRECUEMOAPROD_OB" /></th>
		<td><s:textfield name="numRcPrecUemoaProdOB" id="TNUM_RCPRECUEMOAPROD_OB" readonly="true"
				maxlength="2" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitspjtFB.DAT_RCDATEPIECEJOINTE" /></th>
		<td><sj:datepicker id="DAT_RCDATEPIECEJOINTE" name="datRcDatePieceJointe"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcProduitspjtFB.TNUM_RCIMPORTEXPORT" /></th>
		<td><s:textfield name="numRcImportExport" id="TNUM_RCIMPORTEXPORT"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>