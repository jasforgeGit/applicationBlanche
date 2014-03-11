<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcBureauuemoaFB.ConsultationBureauuemoa" /></th>
	</tr>
	<tr>
		<th><s:text name="RcBureauuemoaFB.TNUM_RCCODEBURUEMOA_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeBurUemoaOB" readonly="true"
				id="TNUM_RCCODEBURUEMOA_OB" maxlength="4" cssClass="input100" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcBureauuemoaFB.TNUM_RCLIBELLEBURUEMOA_OB" /></th>
		<td><div style="float: left;"><s:textfield 
			 maxlength="100" id="TNUM_RCLIBELLEBURUEMOA_OB" readonly="true"
			name="numRcLibelleBurUemoaOB" cssClass="input400"/></div></td>
		<td style="width: 60%;"></td>

	</tr>
</table>
