<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBurdouanetypemanFB.SaisieBurdouanetypeman" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBurdouanetypemanFB.TNUM_LIST_RCCODEBURDOUANE_OB" /></th>
		<td><s:textfield name="numListRcCodeBurDouaneOB"
				id="TNUM_LIST_RCCODEBURDOUANE_OB" maxlength="3" onkeyup="f9_BureauDouane(this,event)"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcBurdouanetypemanFB.NUM_LIST_RCCODETYPEMANIF_OB" /></th>
		<td><s:select list="listTypeManifeste" name="numListRcCodeTypeManifOB" cssStyle="width:200px;float: left;"
				listKey="rccodetypemanif" listValue="rccodetypemanif" id="NUM_LIST_RCCODETYPEMANIF_OB" /></td>
		<td style="width: 60%"></td>
</tr>
</table>