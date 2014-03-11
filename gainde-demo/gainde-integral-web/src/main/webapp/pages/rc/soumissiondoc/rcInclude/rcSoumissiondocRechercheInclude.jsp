<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcSoumissiondocFB.RechercheSoumissiondoc" /></th>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_RCCODESOUMDOCRech" /></th>
		<td><s:textfield name="numRcCodeSoumDocRech" 
				id="TNUM_RCCODESOUMDOCRech" maxlength="2"
				cssClass="input200" cssStyle="float: left;"/></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_LIST_RCCODEPIECEJOINTERech" /></th>
		<td><s:textfield name="numListRcCodePieceJointeRech" onkeyup="f9_PiecesJointes(this,event)"
				id="TNUM_LIST_RCCODEPIECEJOINTERech" maxlength="3"
				cssClass="input200" cssStyle="float: left;"/></td>
        <td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcSoumissiondocFB.TNUM_RCLIBELLESOUMDOCRech" /></th>
		<td><s:textfield name="numRcLibelleSoumDocRech" 
				id="TNUM_RCLIBELLESOUMDOCRech" maxlength="100"
				cssClass="input500" /></td>
        <td style="width: 60%"></td>
	</tr>
</table>


