<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text name="RcTauxFB.SaisieTaux" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.TNUM_RCCODETAUX_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeTauxOB" id="TNUM_RCCODETAUX_OB"
				maxlength="3" cssClass="input100" /></div></td>
		<th><s:text name="RcTauxFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxeOB"
				onkeyup="f9_Taxes(this,event)" id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEVALEUR_OB"
				name="datRcDateValeurOB" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcTauxFB.DAT_RCDATECLOTURE" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.NUM_RCVALEURTAUX_OB" /></th>
		<td><div style="float: left;"><s:textfield name="tauxRcValeurTauxOB"
				id="NUM_RCVALEURTAUX_OB" maxlength="9" cssClass="input100" /></div></td>
		<th><s:text name="RcTauxFB.TNUM_LIBELLETAUX" /></th>
		<td><div style="float: left;"><s:textfield name="numLibelleTaux" id="TNUM_LIBELLETAUX"
				maxlength="255" cssClass="input300" /></div></td>
	</tr>
</table>
