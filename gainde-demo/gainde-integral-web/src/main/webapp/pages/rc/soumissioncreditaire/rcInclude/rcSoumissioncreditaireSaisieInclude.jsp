<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcSoumissioncreditaireFB.SaisieSoumissioncreditaire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODECREDITAIRE_OB" /></th>
		<td><s:textfield name="numListRcCodeCreditaireOB" onkeyup="f9_Creditaires(this,event)"
				id="TNUM_LIST_RCCODECREDITAIRE_OB" maxlength="3"
				cssClass="input200" /></td>
	</tr>
	<tr>		
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODEINDICATEUR_OB" /></th>
		<td><s:textfield name="numListRcCodeIndicateurOB" id="TNUM_LIST_RCCODEINDICATEUR_OB" onkeyup="f9_Indicateur(this,event)"
				maxlength="15" cssClass="input200" /></td>
	</tr>
</table>
