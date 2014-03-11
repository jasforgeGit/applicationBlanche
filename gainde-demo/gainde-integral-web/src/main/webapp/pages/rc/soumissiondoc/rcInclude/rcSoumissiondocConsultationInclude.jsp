<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcSoumissiondocFB.ConsultationSoumissiondoc" /></th>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_RCCODESOUMDOC_OB" /></th>
		<td><s:textfield name="numRcCodeSoumDocOB" readonly="true"
				id="TNUM_RCCODESOUMDOC_OB" maxlength="2"
				cssClass="input200" cssStyle="float: left;"/></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_LIST_RCCODEPIECEJOINTE_OB" /></th>
		<td><s:textfield name="numListRcCodePieceJointeOB" onkeyup="f9_PiecesJointes(this,event)"
				id="TNUM_LIST_RCCODEPIECEJOINTE_OB" maxlength="3"
				cssClass="input200" cssStyle="float: left;" readonly="true"/></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_RCLIBELLESOUMDOC_OB" /></th>
		<td><s:textfield name="numRcLibelleSoumDocOB" readonly="true"
				id="TNUM_RCLIBELLESOUMDOC_OB" maxlength="100"
				cssClass="input500" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>