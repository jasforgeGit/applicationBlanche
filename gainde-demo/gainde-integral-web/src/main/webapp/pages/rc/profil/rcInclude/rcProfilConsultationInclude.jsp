<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcProfilFB.ConsultationProfil" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCCODEPROFIL_OB" /></th>
		<td><s:textfield name="numRcCodeProfilOB" id="TNUM_RCCODEPROFIL_OB" maxlength="15" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCLIBPROFIL_OB" /></th>
		<td><s:textfield name="numRcLibProfilOB" id="TNUM_RCLIBPROFIL_OB" maxlength="255" cssClass="input200" readonly="true"/></td>
	</tr>
	</table>