<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcLangueFB.ModificationLangue" /></th>
	</tr>
	<tr>
		<th><s:text name="RcLangueFB.TNUM_RCCODELANGUE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCodeLangueOB" readonly="true"
					id="TNUM_RCCODELANGUE_OB" maxlength="3" cssClass="input200" />
			</div></td>
		<th><s:text name="RcLangueFB.TNUM_LIBELLELANGUE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numLibelleLangueOB"
					id="TNUM_LIBELLELANGUE_OB" maxlength="100" cssClass="input200" />
			</div></td>
	</tr>
</table>

