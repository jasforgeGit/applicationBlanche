<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcRegimedeclarantFB.ModificationRegimedeclarant" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numListRcCodePpmOB" readonly="true"
				id="TNUM_LIST_RCCODEPPM_OB" maxlength="5"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcRegimeDouanierOB" id="TNUM_LIST_RCREGIMEDOUANIER_OB"
				maxlength="1" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcRegimeFiscalOB"
				id="TNUM_LIST_RCREGIMEFISCAL_OB" maxlength="2" readonly="true"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB"
		readonly="true" maxlength="1" cssClass="input200" /></td>
	</tr>
</table>