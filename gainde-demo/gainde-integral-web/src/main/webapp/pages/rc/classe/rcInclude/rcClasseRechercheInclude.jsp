<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcClasseFB.RechercheClasse" /></th>
	</tr>
	<tr>
		<th><s:text name="RcClasseFB.NUM_RCCODECLASSERech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCodeClasseRech" id="NUM_RCCODECLASSERech"
					maxlength="4" cssClass="input100" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcClasseFB.TNUM_RCLIBELLECLASSERech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcLibelleClasseRech"
					id="TNUM_RCLIBELLECLASSERech" maxlength="255" cssClass="input400" />
			</div></td>
	</tr>
</table>