<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimefiscalFB.ConsultationRegimefiscal" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numRcCodeRegimeFiscalOB" readonly="true"
				id="TNUM_RCCODEREGIMEFISCAL_OB" maxlength="2"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_INDREGEXO_OB" /></th>
		<td><s:textfield name="numIndRegExoOB" readonly="true"
				id="TNUM_INDREGEXO_OB" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_RCINDSUSPENSION_OB" /></th>
		<td><s:textfield name="numRcIndSuspensionOB" readonly="true"
				id="TNUM_RCINDSUSPENSION_OB" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimefiscalFB.TNUM_RCLIBELLEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numRcLibelleRegimeFiscalOB" readonly="true"
				id="TNUM_RCLIBELLEREGIMEFISCAL_OB" maxlength="250"
				cssClass="input500" /></td>
       <td style="width: 60%"></td> 
	</tr>
</table>