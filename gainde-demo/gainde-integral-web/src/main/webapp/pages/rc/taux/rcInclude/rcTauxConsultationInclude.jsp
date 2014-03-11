<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text name="RcTauxFB.ConsultationTaux" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.TNUM_RCCODETAUX_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeTauxOB" id="TNUM_RCCODETAUX_OB" readonly="true"
				maxlength="3" cssClass="input100" /></div></td>

		<th><s:text name="RcTauxFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeTaxeOB" readonly="true"
				 id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><div style="float: left;"><s:textfield id="DAT_RCDATEVALEUR_OB"
				name="datRcDateValeurOB" readonly="true"
				maxlength="10" cssClass="input100" /></div></td>

		<th><s:text name="RcTauxFB.DAT_RCDATECLOTURE" /></th>
		<td><div style="float: left;"><s:textfield id="DAT_RCDATECLOTURE" name="datRcDateCloture"
				readonly="true" maxlength="10"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.NUM_RCVALEURTAUX_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcValeurTauxOB" readonly="true"
				id="NUM_RCVALEURTAUX_OB" maxlength="9" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcTauxFB.TNUM_LIBELLETAUX" /></th>
		<td><div style="float: left;"><s:textfield name="numLibelleTaux" id="TNUM_LIBELLETAUX" readonly="true"
				maxlength="255" cssClass="input300" /></div></td>
	</tr>
</table>
