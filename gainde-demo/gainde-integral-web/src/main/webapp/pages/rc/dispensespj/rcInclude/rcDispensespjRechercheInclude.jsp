<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcDispensespjFB.RechercheDispensespj" /></th>
	</tr>
	<tr>
		<th><s:label key="RcDispensespjFB.TNUM_LIST_RCCODEDISPENSERech"></s:label></th>
		<td><s:select id="TNUM_LIST_RCCODEDISPENSERech" headerKey="" headerValue=""
					name="numListRcCodeDispenseRech"
					list="listDispenses" listKey="rccodedispense"
					listValue="rccodedispense" cssStyle="width:200px;float: left;"/></td>
		<td style="width: 60%"></td>
    </tr>
	<tr>
		<th><s:text name="RcDispensespjFB.TNUM_LIST_RCCODEPIECEJOINTERech" /></th>
		<td><s:textfield name="numListRcCodePieceJointeRech" 
				id="TNUM_LIST_RCCODEPIECEJOINTERech" maxlength="3" onkeyup="f9_PiecesJointes(this, event)"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
    </tr>
</table>

