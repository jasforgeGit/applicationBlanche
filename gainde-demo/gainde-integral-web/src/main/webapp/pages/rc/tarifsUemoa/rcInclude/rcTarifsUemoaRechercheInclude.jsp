<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcAgrementEntrepriseFB.rechercheDerogation" /></th>
	</tr>
	<tr>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCAGRENT_OBrech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcAgrentOBrech"
				id="TNUM_RCAGRENT_OBrech" maxlength="4"
				cssClass="input100" /></div></td>
		<th><s:text name="RcAgrementEntrepriseFB.TNUM_RCCODPAYS_OBrech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodPaysOBrech" id="TNUM_LIST_RCCODPAYS_OBrech"
				maxlength="3" cssClass="input100" onkeyup="f9_pays(this,event)"/></div></td>
	</tr>
</table>
