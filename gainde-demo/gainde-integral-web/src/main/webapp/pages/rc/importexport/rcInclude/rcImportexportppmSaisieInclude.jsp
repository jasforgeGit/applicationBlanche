
<%
//Mise à jour du champ code PPM avec la valeur provenant de la page  des PPM
String codePpm = (String) request.getSession().getAttribute("codePpm");
sn.com.douane.web.rc.form.RcImportexportForm rcImportexportForm=
	 (sn.com.douane.web.rc.form.RcImportexportForm ) pageContext.findAttribute("rcImportexportForm");
rcImportexportForm.setNumListRcCodePPM(codePpm);
 %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcImportexportFB.SaisieImportexport" /></th>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMIMPORTEXPORT_OB" /></th>
		<td><s:textfield name="numRcNumImportExportOB"
				id="TNUM_RCNUMIMPORTEXPORT_OB" maxlength="10" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_LIST_RCCODEPPM" /></th>
		<td><s:textfield name="numListRcCodePPM" id="TNUM_LIST_RCCODEPPM"
				readonly="true" maxlength="5" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNINEAIMPEXP" /></th>
		<td><s:textfield name="numRcNineaImpExp" id="TNUM_RCNINEAIMPEXP"
				maxlength="11" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMCARTEIMPEXP" /></th>
		<td><s:textfield name="numRcNumCarteImpExp"
				id="TNUM_RCNUMCARTEIMPEXP" maxlength="6" cssClass="input100" /></td>

	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATECARTE" /></th>
		<td><sj:datepicker id="DAT_RCDATECARTE" name="datRcDateCarte"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.DAT_RCDATERETRAITCREDIT" /></th>
		<td><sj:datepicker id="DAT_RCDATERETRAITCREDIT"
				name="datRcDateRetraitCredit" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></td>
	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMDECISION" /></th>
		<td><s:textfield name="numRcNumDecision" id="TNUM_RCNUMDECISION"
				maxlength="6" cssClass="input100" /></td>
		<th><s:text name="RcImportexportFB.TNUM_RCNUMSUSPENSION" /></th>
		<td><s:textfield name="numRcNumSuspension"
				id="TNUM_RCNUMSUSPENSION" maxlength="6" cssClass="input100" /></td>


	</tr>
	<tr>
		<th><s:text name="RcImportexportFB.DAT_RCDATESUSPENSION" /></th>
		<td><sj:datepicker id="DAT_RCDATESUSPENSION"
				name="datRcDateSuspension" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></td>
	</tr>
</table>