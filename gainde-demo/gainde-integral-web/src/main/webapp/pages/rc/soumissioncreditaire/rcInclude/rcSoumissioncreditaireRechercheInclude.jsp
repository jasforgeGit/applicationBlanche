<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcSoumissioncreditaireFB.RechercheSoumissioncreditaire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODECREDITAIRERech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeCreditaireRech" onkeyup="f9_Creditaires(this,event)"
				id="TNUM_LIST_RCCODECREDITAIRERech" maxlength="3"
				cssClass="input200" /></div></td>
	</tr>
	<tr>		
		<th><s:text name="RcSoumissioncreditaireFB.TNUM_LIST_RCCODEINDICATEURRech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeIndicateurRech" id="TNUM_LIST_RCCODEINDICATEURRech" onkeyup="f9_Indicateur(this,event)"
				maxlength="15" cssClass="input200" /></div></td>
	</tr>
</table>
