<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcDispensesFB.ConsultationDispenses" /></th>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_RCCODEDISPENSE_OB" /></th>
		<td><s:textfield name="numRcCodeDispenseOB" readonly="true"
				id="TNUM_RCCODEDISPENSE_OB" maxlength="5"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" readonly="true"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcDispensesFB.TNUM_RCDESDISPENSE_OB" /></th>
		<td><s:textfield name="numRcDesDispenseOB" readonly="true"
				id="TNUM_RCDESDISPENSE_OB" maxlength="100"
				cssClass="input400" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
</table>