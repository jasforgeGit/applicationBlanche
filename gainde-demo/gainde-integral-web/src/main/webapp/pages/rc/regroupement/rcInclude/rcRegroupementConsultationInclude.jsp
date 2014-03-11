<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegroupementFB.ConsultationRegroupement" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegroupementFB.TNUM_RCCODEREGROUP_OB" /></th>
		<td><s:textfield name="numRcCodeRegRoupOB" readonly="true"
				id="TNUM_RCCODEREGROUP_OB" maxlength="10"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegroupementFB.TNUM_RCLIBELLEREGROUP_OB" /></th>
		<td><s:textfield name="numRcLibelleRegRoupOB" readonly="true"
				id="TNUM_RCLIBELLEREGROUP_OB" maxlength="100"
				cssClass="input500" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
</table>
