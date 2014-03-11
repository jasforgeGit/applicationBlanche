<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcTarifsFB.ConsultationTarifs" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODEPROD_OB" /></th>
		<td><s:textfield name="numListRcCodeProdOB"
				id="TNUM_LIST_RCCODEPROD_OB" maxlength="6" readonly="true"
				cssClass="input200" /></td>
				<td style="width: 20%;"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAUX_OB" /></th>
		<td><s:textfield name="numListRcCodeTauxxOB" id="TNUM_LIST_RCCODETAUXX_OB"
				maxlength="3" readonly="true" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCCODETAXE_OB" /></th>
		<td><s:textfield name="numListRcCodeTaxeOB"
				id="TNUM_LIST_RCCODETAXE_OB" maxlength="2" readonly="true"
				cssClass="input200" /></td>
				<td style="width: 20%;"></td>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECSENEGAL_OB" /></th>
		<td><s:textfield name="numListRcPrecSenegalOB" id="TNUM_LIST_RCPRECSENEGAL_OB"
				maxlength="2" readonly="true" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.TNUM_LIST_RCPRECUEMOA_OB" /></th>
		<td><s:textfield name="numListRcPrecUemoaOB"
				id="TNUM_LIST_RCPRECUEMOA_OB" maxlength="2" readonly="true"
				cssClass="input200" /></td>
				<td style="width: 20%;"></td>
		<th><s:text name="RcTarifsFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALEUR_OB" name="datRcDateValeurOB" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;" disabled="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcTarifsFB.DAT_RCDATEVALEUR_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE" name="datRcDateCloture" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;" disabled="true"/></td>
	    <td style="width: 20%;"></td>
	    <td></td>
	    <td></td>
	</tr>
</table>
	
