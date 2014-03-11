<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimeburinterditFB.ModificationRegimeburinterdit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCCODEBUREAU_OB" /></th>
		<td><s:textfield name="numListRcCodeBureauOB" readonly="true"
				id="TNUM_LIST_RCCODEBUREAU_OB" maxlength="3"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcRegimeDouanierOB" readonly="true"
				id="TNUM_LIST_RCREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>