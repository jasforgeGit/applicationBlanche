<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcIndicateurregimeFB.RechercheIndicateurregime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEINDICATEURRech" /></th>
		<td><s:textfield name="numListRcCodeIndicateurRech" onkeyup="f9_Indicateur(this,event)"
				id="TNUM_LIST_RCCODEINDICATEURRech" maxlength="15"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierRech" id="TNUM_LIST_RCCODEREGIMEDOUANIERRech" maxlength="1"
                         onkeyup="f9_RegimeDouanier(this,event)"
				cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalRech" onkeyup="f9_RegimeFiscal(this,event)"
				id="TNUM_LIST_RCCODEREGIMEFISCALRech" maxlength="2"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcIndicateurregimeFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" id="TNUM_LIST_RCTYPEREGIMERech" maxlength="1"
                         onkeyup="f9_TypeRegimedouane(this,event)"
				cssClass="input200" /></td>
	</tr>
	<tr>
		 <th><s:text name="RcIndicateurregimeFB.DAT_RCDATEVALIDITERech" /></th>
	     <td><sj:datepicker id="DAT_RCDATEVALIDITERech" name="datRcDateValiditeRech" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
		 <td style="width: 20%"></td>
		 <td></td>
    </tr>
</table>
	

