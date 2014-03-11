<%@ taglib prefix="s" uri="/struts-tags"%>


<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcGenrebureauFB.ConsultationGenrebureau" /></th>
	</tr>
	<tr>
		<th><s:text name="RcGenrebureauFB.TNUM_RCGENREBUREAU_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcGenreBureauOB" id="TNUM_RCGENREBUREAU_OB"
					maxlength="3" readonly="true" cssClass="input200" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcGenrebureauFB.TNUM_RCDESGENREBUREAU_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcDesGenreBureauOB"
					id="TNUM_RCDESGENREBUREAU_OB" maxlength="4" readonly="true"
					cssClass="input200" />
			</div></td>
	</tr>
</table>