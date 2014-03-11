<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcDispensespjFB.ModificationDispensespj" /></th>
	</tr>
	<tr>
		<th><s:label key="RcDispensespjFB.TNUM_LIST_RCCODEDISPENSE_OB"></s:label></th>
		<td><s:select id="TNUM_LIST_RCCODEDISPENSE_OB" headerKey="" headerValue=""
					name="numListRcCodeDispenseOB"
					list="listDispenses" listKey="rccodedispense"
					listValue="rccodedispense" cssStyle="width:200px;float: left;"/></td>
		<td style="width: 60%"></td>
    </tr>
	<tr>
		<th><s:text name="RcDispensespjFB.TNUM_LIST_RCCODEPIECEJOINTE_OB" /></th>
		<td><s:textfield name="numListRcCodePieceJointeOB"
				id="TNUM_LIST_RCCODEPIECEJOINTE_OB" maxlength="3" onkeyup="f9_PiecesJointes(this, event)"
				cssClass="input200" cssStyle="float: left;"/></td>
	    <td style="width: 60%"></td>
    </tr>
</table>


