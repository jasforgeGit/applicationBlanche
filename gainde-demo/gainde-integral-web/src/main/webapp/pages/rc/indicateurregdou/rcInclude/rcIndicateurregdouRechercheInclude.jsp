<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcIndicateurregdouFB.RechercheIndicateurregdou" /></th>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregdouFB.TNUM_LIST_RCCODEINDICATEURRech" /></th>
		<td><s:textfield name="numListRcCodeIndicateurRech" onkeyup="f9_Indicateur(this, event)"
				id="TNUM_LIST_RCCODEINDICATEURRech" maxlength="15"
				cssClass="input100" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcIndicateurregdouFB.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierRech" id="TNUM_LIST_RCCODEREGIMEDOUANIERRech"
				maxlength="2" cssClass="input100" onkeyup="f9_RegimeDouanier(this, event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregdouFB.DAT_RCDATEVALIDITERech" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALIDITERech" name="datRcDateValiditeRech"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></td>
		<td style="width: 20%"></td>
        <td/>
	</tr>
</table>


