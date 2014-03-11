<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBureaudouaneFB.SaisieBureaudouane" /></th>
	</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCCODEBURDOUANE_OB" /></th>
					<td><s:textfield name="numRcCodeBurDouaneOB" cssStyle="text-align: left;float: left;"
							id="numRcCodeBurDouane_OB" maxlength="3" cssClass="input200" readonly="true" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text
							name="RcBureaudouaneFB.NUM_LIST_RCTYPEBURDOUANE_OB" /></th>
					<td><s:select name="numListRcTypeBurDouaneOB"
							id="numListRcTypeBurDouane_OB" list="listTypeBurDouane"
							listKey="value" listValue="label" emptyOption="true" cssStyle="width:200px;float: left;"/></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCCOMPETENCE_OB" /></th>
					<td><s:select name="numListRcCompetenceOB"
							id="numListRcCompetence_OB" list="listCompBureau" listKey="value"
							listValue="label" emptyOption="true" cssStyle="width:200px;float: left;"/></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCGENREBUR_OB" /></th>
					<td><s:select name="numListRcGenreBurOB"
							id="numListRcGenreBur_OB" list="listGenreBureau" listKey="value"
							listValue="label" emptyOption="true" cssStyle="width:200px;float: left;" /></td>
					<td style="width: 60%;"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCLIBELLEBURDOUANE_OB" /></th>
					<td><s:textfield name="numRcLibelleBurDouaneOB" style="text-align: left;"
							id="numRcLibelleBurDouane_OB" maxlength="100"
							cssClass="input400" /></td>
					<td style="width: 60%"></td>
				</tr>

</table>
