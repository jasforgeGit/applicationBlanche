<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBurmoddeclFB.RechercheBurmoddecl" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBurmoddeclFB.TNUM_LIST_RCCODEBURDECLRech" /></th>
		<td><s:textfield name="numListRcCodeBurDeclRech" onkeyup="f9_BureauDouane(this,event)"
				id="TNUM_LIST_RCCODEBURDECLRech" maxlength="3"
				cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
		</tr>
		<tr>
		<th><s:text name="RcBurmoddeclFB.TNUM_LIST_RCMODEDECLRech" /></th>
		<td><s:textfield name="numListRcModeDeclRech" id="TNUM_LIST_RCMODEDECLRech" onkeyup="f9_Modedeclaration(this,event)"
				maxlength="4" cssClass="input100" cssStyle="float: left;"/></td>
		<td style="width: 60%"></td>
	</tr>
</table>

