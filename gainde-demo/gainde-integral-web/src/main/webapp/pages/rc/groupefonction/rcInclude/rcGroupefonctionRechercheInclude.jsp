<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcGroupefonctionFB.RechercheGroupefonction" /></th>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.NUM_RCCODEGROUPERech" /></th>
		<td><s:textfield name="numRcCodeGroupeRech" id="NUM_RCCODEGROUPERech" maxlength="3" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.TNUM_RCLIBGROUPERech" /></th>
		<td><s:textfield name="numRcLibGroupeRech" id="TNUM_RCLIBGROUPERech" maxlength="100" cssClass="input400" /></td>
	</tr>
</table>
