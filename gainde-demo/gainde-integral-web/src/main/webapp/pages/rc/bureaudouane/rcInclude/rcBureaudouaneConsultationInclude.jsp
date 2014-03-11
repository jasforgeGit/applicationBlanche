<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBureaudouaneFB.ConsultationBureaudouane" /></th>
	</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCCODEBURDOUANE_OB" /></th>
					<td><s:textfield name="numRcCodeBurDouaneOB" readonly="true" cssStyle="text-align: left;float: left;"
							id="numRcCodeBurDouane_OB" maxlength="3" cssClass="input200" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text
							name="RcBureaudouaneFB.NUM_LIST_RCTYPEBURDOUANE_OB" /></th>
					<td><s:select name="numListRcTypeBurDouaneOB" disabled="true" cssStyle="width:200px;float: left;"
							id="numListRcTypeBurDouane_OB" list="listTypeBurDouane"
							listKey="value" listValue="label" emptyOption="true" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCCOMPETENCE_OB" /></th>
					<td><s:select name="numListRcCompetenceOB" disabled="true" cssStyle="width:200px;float: left;"
							id="numListRcCompetence_OB" list="listCompBureau" listKey="value"
							listValue="label" emptyOption="true" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_LIST_RCGENREBUR_OB" /></th>
					<td><s:select name="numListRcGenreBurOB" disabled="true" cssStyle="width:200px;float: left;"
							id="numListRcGenreBur_OB" list="listGenreBureau" listKey="value"
							listValue="label" emptyOption="true" /></td>
					<td style="width: 60%"></td>
				</tr>
				<tr>
					<th><s:text name="RcBureaudouaneFB.TNUM_RCLIBELLEBURDOUANE_OB" /></th>
					<td><s:textfield name="numRcLibelleBurDouaneOB" readonly="true"
							id="numRcLibelleBurDouane_OB" maxlength="100" style="text-align: left;"
							cssClass="input400" /></td>
					<td style="width: 60%"></td>
				</tr>
</table>
