<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE"><s:text name="AutorisationFB.MAJAutorisation" /></th>
	</tr>
	<tr>
		<td>
			<table class="PANEL">
				<tr>
					<th style="width :35%;"><s:text name="AutorisationFB.codeUser" /></th>
					<td style="width :15%;"><div style="float: left;">
							<s:textfield name="pk" id="pk" readonly="true"
								style="width: 140px;" />
						</div></td>
					<td style="width :35%;"></td>
					<td style="width :15%;"></td>
				</tr>
				<tr>
					<th style="width :35%;"><s:text name="AutorisationFB.indEnreg" /></th>
					<td style="width :15%;"><s:select list="#{'0':'Non', '1':'Oui' }" cssClass="input100"
							name="numIndEnreg" id="numIndEnreg" /></td>
					<th style="width :35%;"><s:text name="AutorisationFB.indPreReg" /></th>
					<td style="width :15%;"><s:select list="#{'0':'Non', '1':'Oui' }" cssClass="input100"
							name="numIndPreReg" id="numIndPreReg" /></td>
				</tr>
			</table>
		<td>
	</tr>
</table>
