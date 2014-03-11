<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBurmoddeclFB.SaisieBurmoddecl" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBurmoddeclFB.TNUM_LIST_RCCODEBURDECL_OB" /></th>
		<td><s:textfield name="numListRcCodeBurDeclOB"
				id="TNUM_LIST_RCCODEBURDECL_OB" maxlength="3" onkeyup="f9_BureauDouane(this,event)"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
		</tr>
		<tr>
		<th><s:text name="RcBurmoddeclFB.TNUM_LIST_RCMODEDECL_OB" /></th>
		<td><s:textfield name="numListRcModeDeclOB" id="TNUM_LIST_RCMODEDECL_OB"
				maxlength="4" onkeyup="f9_Modedeclaration(this,event)" cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
</table>
