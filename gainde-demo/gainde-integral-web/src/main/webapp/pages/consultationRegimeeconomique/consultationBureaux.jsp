<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" width="100%" theme="simple" onsubmit="return (false)">

	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationRegimeeconomique.Regimeeconomique" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationRegimeeconomique.rcanneeregeco" /></th>
			<td><s:textfield name="rcanneeregeco" maxlength="4"
					cssClass="input100" readonly="true" /></td>

			<th><s:text name="ConsultationRegimeeconomique.rcnumregeco" /></th>
			<td><s:textfield name="rcnumregeco" readonly="true"
					maxlength="6" cssClass="input100" /></td>
			<th><s:text name="ConsultationRegimeeconomique.rccodeppm" /></th>
			<td><s:textfield name="rccodeppm" readonly="true" maxlength="5"
					cssClass="input100" /></td>
		</tr>
	</table>

	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="6"><s:text
					name="ConsultationRegimeeconomique.Produitfini" /></th>
		</tr>
		<tr>
			<th><s:text name="ConsultationRegimeeconomique.rccodeprod" /></th>
			<td><s:textfield name="rccodeprod" readonly="true" maxlength="6"
					cssClass="input100" /></td>
			<th><s:text name="ConsultationRegimeeconomique.rcprecuemoa" /></th>
			<td><s:textfield name="rcprecuemoa" maxlength="2"
					cssClass="input100" readonly="true" /></td>
			<th><s:text name="ConsultationRegimeeconomique.rcprecsen" /></th>
			<td><s:textfield name="rcprecsen" maxlength="2"
					cssClass="input100" readonly="true" /></td>
		</tr>
	</table>
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmitWithaoutValidate2('rechercherProduitsfinis','rechercheProduitsfinis')"></s:submit>
			</td>
		</tr>
	</table>
	<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"><s:label key="listeBureaux.rccodeburdouane" /></th>
			<th class="FORM2"><s:label key="listeBureaux.rclibelleburdouane" /></th>
		</tr>
		<s:iterator value="listeBureaux">
			<tr>
				<td class="FORM3"><s:property value="rccodeburdouane" /></td>
				<td class="FORM3"><s:property value="rclibelleburdouane" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>