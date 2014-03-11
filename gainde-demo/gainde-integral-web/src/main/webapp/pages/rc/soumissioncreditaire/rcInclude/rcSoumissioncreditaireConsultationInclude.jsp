<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcSoumissioncreditaireFB.ConsultationSoumissioncreditaire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODECREDITAIRE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeCreditaireOB" readonly="true"
				id="TNUM_LIST_RCCODECREDITAIRE_OB" maxlength="3"
				cssClass="input200" /></div></td>
	</tr>
	<tr>		
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODEINDICATEUR_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeIndicateurOB" id="TNUM_LIST_RCCODEINDICATEUR_OB" readonly="true"
				maxlength="15" cssClass="input200" /></div></td>
	</tr>
</table>