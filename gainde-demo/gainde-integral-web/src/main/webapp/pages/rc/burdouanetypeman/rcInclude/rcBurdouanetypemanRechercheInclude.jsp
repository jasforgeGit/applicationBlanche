<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBurdouanetypemanFB.RechercheBurdouanetypeman" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBurdouanetypemanFB.TNUM_LIST_RCCODEBURDOUANERech" /></th>
		<td><s:textfield name="numListRcCodeBurDouaneRech"
				id="TNUM_LIST_RCCODEBURDOUANERech" maxlength="3" onkeyup="f9_BureauDouane(this,event)"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcBurdouanetypemanFB.NUM_LIST_RCCODETYPEMANIFRech" /></th>
		<td><s:select list="listTypeManifeste" name="numListRcCodeTypeManifRech" cssStyle="width:200px;float: left;"
				listKey="rccodetypemanif" listValue="rccodetypemanif" id="NUM_LIST_RCCODETYPEMANIFRech" /></td>
		<td style="width: 60%"></td>
</tr>
</table>

