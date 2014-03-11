<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcCatregroupFB.RechercheCatregroup" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCatregroupFB.TNUM_RCCODECATREGROUPRech" /></th>
		<td><s:textfield name="numRcCodeCatRegroupRech"
				id="TNUM_RCCODECATREGROUPRech" maxlength="3" cssClass="input100" cssStyle="float: left;"/></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcCatregroupFB.TNUM_RCLIBCATREGROUPRech" /></th>
		<td><s:textfield name="numRcLibCatRegroupRech"
				id="TNUM_RCLIBCATREGROUPRech" maxlength="100" cssClass="input300" /></td>
        <td style="width: 60%;"></td>
	</tr>
</table>


