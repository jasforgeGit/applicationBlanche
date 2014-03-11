<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegapuregapureFB.SaisieRegapuregapure" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegapuregapureFB.TNUM_LIST_RCREGDOUAPURANT_OB" /></th>
		<td><s:textfield name="numListRcRegDouApurantOB"
				id="TNUM_LIST_RCREGDOUAPURANT_OB" maxlength="2" onkeyup="f9_RegimeDouanier(this, event)"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegapuregapureFB.TNUM_LIST_RCREGDOUAPURE_OB" /></th>
		<td><s:textfield name="numListRcRegDouApureOB"
				id="TNUM_LIST_RCREGDOUAPURE_OB" maxlength="2" onkeyup="f9_RegimeDouanier(this, event)"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
</table>


