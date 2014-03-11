<%@taglib uri="/struts-tags" prefix="s"%>

<s:form method="post" theme="simple">
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="4"><s:text
					name="RcCircuitvisiteFB.RechercheCircuitvisite" /></th>
		</tr>
		<tr>
			<th><s:text
					name="RcCircuitvisiteFB.TNUM_RCCODECIRCUITRech" /></th>
			<td><div style="float: left;"><s:textfield name="TNUM_RCCODECIRCUITRech"
					id="TNUM_RCCODECIRCUITRech" maxlength="1" /></div></td>
			<th><s:text
					name="RcCircuitvisiteFB.TNUM_RCDESCIRCUITVISITERech" /></th>
			<td><div style="float: left;"><s:textfield name="TNUM_RCDESCIRCUITVISITERech"
					id="TNUM_RCDESCIRCUITVISITERech" maxlength="50" /></div></td>
		</tr>
	</table>
</s:form>

