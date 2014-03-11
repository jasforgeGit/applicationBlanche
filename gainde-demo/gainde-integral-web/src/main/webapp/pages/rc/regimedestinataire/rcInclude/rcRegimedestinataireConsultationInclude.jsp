<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimedestinataireFB.ConsultationRegimedestinataire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numListRcCodePpmOB" readonly="true"
				id="TNUM_LIST_RCCODEPPM_OB" maxlength="5"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" 
		readonly="true" maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB" readonly="true"
				id="TNUM_LIST_RCCODEREGIMEFISCAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB" readonly="true"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>