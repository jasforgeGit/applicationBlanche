<%@ taglib prefix="s" uri="/struts-tags"%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcClasseFB.ConsultationClasse" /></th>
	</tr>
	<tr>
		<th><s:text name="RcClasseFB.NUM_RCCODECLASSE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCodeClasseOB" id="NUM_RCCODECLASSE_OB" readonly="true"
					maxlength="4" cssClass="input100" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcClasseFB.TNUM_RCLIBELLECLASSE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcLibelleClasseOB" readonly="true"
					id="TNUM_RCLIBELLECLASSE_OB" maxlength="255" cssClass="input400" />
			</div></td>
	</tr>
</table>