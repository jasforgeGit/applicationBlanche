<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTaxesregdouFB.ModificationTaxesregdou" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB" readonly="true"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCCODEREGIMEDOUNIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDounierOB" id="TNUM_LIST_RCCODEREGIMEDOUNIER_OB"
		readonly="true" maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregdouFB.TNUM_LIST_RCCODETAUX_OB" /></th>
		<td><s:textfield name="numListRcCodeTxOB" id="TNUM_LIST_RCCODETX_OB"
		onkeyup="f9_Taux(this,TNUM_LIST_RCCODETAXE_OB,event)"
				maxlength="3" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTaxesregdouFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEUR_OB" name="datRcDateValeurOB" disabled="true"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcTaxesregdouFB.DAT_RCDATECLOTURE" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input200" /></td>
	</tr>
</table>