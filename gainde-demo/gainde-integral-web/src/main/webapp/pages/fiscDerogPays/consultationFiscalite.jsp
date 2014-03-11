<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" width="100%" theme="simple">
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="3"><s:text
					name="FiscDerogPays.consultationFiscalite" /></th>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCCODEPAYS" /></th>
			<td><s:textfield name="numRcCodePays" readonly="true"
					id="TNUM_RCCODEPAYS" maxlength="3" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCCODEDEVISE" /></th>
			<td><s:textfield name="numRcCodeDevise" id="TNUM_RCCODEDEVISE"
					readonly="true" maxlength="3" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCCIRCUITVISITE" /></th>
			<td><s:textfield name="numRcCircuitVisite" readonly="true"
					id="TNUM_RCCIRCUITVISITE" maxlength="1" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCCODEPROHIBITION" /></th>
			<td><s:textfield name="numRcCodeProHibition" readonly="true"
					id="TNUM_RCCODEPROHIBITION" maxlength="1" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_DATEPROHIBITION" /></th>
			<td><s:textfield name="numDateProHibition" readonly="true"
					id="TNUM_DATEPROHIBITION" maxlength="10" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCLIBELLEPAYS" /></th>
			<td><s:textfield name="numRcLibellePays" readonly="true"
					id="TNUM_RCLIBELLEPAYS" maxlength="100" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCDESFISCALITE" /></th>
			<td><s:textfield name="numRcDesfiscalite" readonly="true"
					id="TNUM_RCDESFISCALITE" maxlength="100" cssClass="input700" /></td>
			<td style="width: 60%;"></td>
		</tr>
	</table>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentRecherchePays','recherchePays')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
