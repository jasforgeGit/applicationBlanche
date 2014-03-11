<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegdoumodedeclFB.ConsultationRegdoumodedecl" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegdoumodedeclFB.TNUM_LIST_RCCODEMODEDECLARATION_OB" /></th>
		<td><s:textfield name="numListRcCodeModeDeclarationOB" readonly="true"
				id="TNUM_LIST_RCCODEMODEDECLARATION_OB" maxlength="4"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegdoumodedeclFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" readonly="true"
				id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegdoumodedeclFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>