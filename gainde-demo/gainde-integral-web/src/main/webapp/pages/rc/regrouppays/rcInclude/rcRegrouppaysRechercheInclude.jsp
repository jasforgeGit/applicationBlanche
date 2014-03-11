<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegrouppaysFB.RechercheRegrouppays" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegrouppaysFB.TNUM_LIST_RCCODEPAYSRech" /></th>
		<td><s:textfield name="numListRcCodePaysRech"
				id="TNUM_LIST_RCCODEPAYSRech" maxlength="3" onkeyup="f9_pays(this,event)"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegrouppaysFB.TNUM_LIST_RCCODEREGROUPRech" /></th>
		<td><s:textfield name="numListRcCodeRegroupRech" onkeyup="f9_Regroupement(this,event)"
				id="TNUM_LIST_RCCODEREGROUPRech" maxlength="10"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>


