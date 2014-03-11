<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcCatregroupFB.ConsultationCatregroup" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCatregroupFB.TNUM_RCCODECATREGROUP_OB" /></th>
		<td><s:textfield name="numRcCodeCatRegroupOB" readonly="true"
				id="TNUM_RCCODECATREGROUP_OB" maxlength="3" cssClass="input100" cssStyle="float: left;"/></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcCatregroupFB.TNUM_RCLIBCATREGROUP_OB" /></th>
		<td><s:textfield name="numRcLibCatRegroupOB" readonly="true"
				id="TNUM_RCLIBCATREGROUP_OB" maxlength="100" cssClass="input300" /></td>
        <td style="width: 60%;"></td>
	</tr>
</table>


