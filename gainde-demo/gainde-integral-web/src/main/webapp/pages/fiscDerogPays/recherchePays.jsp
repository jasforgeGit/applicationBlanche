<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<table class="SECTION">
		<s:hidden name="hidden" id="hidden"></s:hidden>
		<tr>
			<th class="ENTETE" colspan="3"><s:text
					name="FiscDerogPays.RecherchePays" /></th>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCCODEPAYSRech" /></th>
			<td><s:textfield name="numRcCodePaysRech"
					id="TNUM_RCCODEPAYSRech" maxlength="3" cssClass="input200" /></td>
			<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_LIST_RCCODEDEVISERech" /></th>
			<td><s:textfield name="numListRcCodeDeviseRech"
					id="TNUM_LIST_RCCODEDEVISERech" onkeyup="f9_devise(this,event)"
					maxlength="3" cssClass="input200" /></td>
		<td style="width: 60%;"></td>
		</tr>
		<tr>
			<th><s:text name="FiscDerogPays.TNUM_RCLIBELLEPAYSRech" /></th>
			<td><s:textfield name="numRcLibellePaysRech"
					id="TNUM_RCLIBELLEPAYSRech" maxlength="100" cssClass="input200" /></td>
			<td style="width: 60%;"></td>
		</tr>
	</table>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit('rechercherPays','recherchePays')"></s:submit> <s:submit
					key="button.retour" cssClass="buttonBar" onclick="doReturn()"></s:submit></td>
					<td/><td/><td/>
		</tr>
	</table>
	</div>
	<br/>
	<table class="FORM2" style="width: 100%; margin-top: 0px;">

		<tr>
			<th class="FORM2"></th>
			<th class="FORM2"><s:label key="listePays.rccodepays" /></th>
			<th class="FORM2"><s:label key="listePays.rclibellepays" /></th>
			<th class="FORM2"><s:label key="listePays.rccodedevise" /></th>
		</tr>
		<s:iterator value="listePays">
			<tr>
				<td class="FORM3"><s:set var="key" value="rccodepays" /> <s:url
						var="link"
						action="afficherFiscalite.action?page=consultationFiscalite">
						<s:param name="pk" value="%{key}" />
					</s:url> <s:a href="%{link}">
						<img src="config/edit1.jpg" border="0" />
					</s:a></td>
				<td class="FORM3"><s:property value="rccodepays" /></td>
				<td class="FORM3"><s:property value="rclibellepays" /></td>
				<td class="FORM3"><s:property value="rccodedevise" /></td>
			</tr>
		</s:iterator>
	</table>
</s:form>