<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimeburinterditFB.RechercheRegimeburinterdit" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCCODEBUREAURech" /></th>
		<td><s:textfield name="numListRcCodeBureauRech" onkeyup="f9_BureauDouane(this,event)"
				id="TNUM_LIST_RCCODEBUREAURech" maxlength="3"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcRegimeDouanierRech" onkeyup="f9_RegimeDouanier(this,TNUM_LIST_RCTYPEREGIMERech,event)"
				id="TNUM_LIST_RCREGIMEDOUANIERRech" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeburinterditFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" onkeyup="f9_RegimeDouanier(TNUM_LIST_RCREGIMEDOUANIERRech,this,event)"
				id="TNUM_LIST_RCTYPEREGIMERech" maxlength="1"
				cssClass="input200" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>

