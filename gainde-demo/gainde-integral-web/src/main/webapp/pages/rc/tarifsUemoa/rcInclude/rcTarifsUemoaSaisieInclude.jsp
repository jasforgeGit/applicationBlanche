<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcAgrementEntrepriseFB.SaisieEntreprise" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCAGRENT_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAgrentOB"
				id="TNUM_RCAGRENT_OB" maxlength="4"
				cssClass="input100" /></div></td>
        <th><s:text name="RcAgrementEntrepriseFB.TNUM_RCRGRPAYS_OB" /></th>
		<td><div style="float: left;"><s:select list="listeRegroupement" name="numRcRgrPaysOB"
				listKey="value" listValue="label" id="TNUM_RCRGRPAYS_OB" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODPAYS_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodPaysOB"
				id="TNUM_LIST_RCCODPAYS_OB" maxlength="3" onkeyup="f9_pays(this)"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCTITREENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcTitreEnt" id="TNUM_RCTITREENT"
				maxlength="3" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCRSOCIALECENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcrSocialeCent"
				id="TNUM_RCRSOCIALECENT" maxlength="30" 
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCADRESSEENT" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAdresseEnt" id="TNUM_RCADRESSEENT"
				maxlength="60" cssClass="input100" /></div></td>
	</tr>
<tr>
		<th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATEAGREMENT" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEAGREMENT" name="datRcDateAgrement"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.DAT_RCDATCLOTURE" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATCLOTURE" name="datRcDatCloture"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></div></td>
	</tr>
</table>	
