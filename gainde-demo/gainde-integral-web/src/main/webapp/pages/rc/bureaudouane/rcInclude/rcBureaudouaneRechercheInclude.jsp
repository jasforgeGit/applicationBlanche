<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBureaudouaneFB.RechercheBureaudouane" /></th>
	</tr>

				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCCODEBURDOUANERech" /></th>
					<td><s:textfield name="numRcCodeBurDouaneRech" cssStyle="text-align: left;float: left;"
							id="numRcCodeBurDouaneRech" maxlength="3" cssClass="input200" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text
							name="RcBureaudouaneFB.NUM_LIST_RCTYPEBURDOUANERech" /></th>
					<td><s:select name="numListRcTypeBurDouaneRech"
							id="numListRcTypeBurDouaneRech" list="listTypeBurDouane"
							listKey="value" listValue="label" emptyOption="true" cssStyle="width:200px;float: left;"/></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCCOMPETENCERech" /></th>
					<td><s:select name="numListRcComptenceRech"
							id="numListRcComptenceRech" list="listCompBureau" listKey="value"
							listValue="label" emptyOption="true" cssStyle="width:200px;float: left;"/></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCGENREBURRech" /></th>
					<td><s:select name="numListRcGenreBurRech"
							id="numListRcGenreBurRech" list="listGenreBureau" listKey="value"
							listValue="label" emptyOption="true" cssStyle="width:200px;float: left;"/></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCLIBELLEBURDOUANERech" /></th>
					<td><s:textfield name="numRcLibelleBurDouaneRech" style="text-align: left;"
							id="numRcLibelleBurDouaneRech" maxlength="100"
							cssClass="input400" /></td>
					<td style="width: 60%"></td>
				</tr>
</table>
