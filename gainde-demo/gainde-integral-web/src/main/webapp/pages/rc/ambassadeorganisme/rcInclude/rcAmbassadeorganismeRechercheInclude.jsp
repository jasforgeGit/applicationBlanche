<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcAmbassadeorganismeFB.RechercheAmbassadeorganisme" /></th>
	</tr>
	<tr>
		<th><s:text
				name="RcAmbassadeorganismeFB.TNUM_RCNUMREGIMEPREFRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNumRegimePrefRech"
				id="TNUM_RCNUMREGIMEPREFRech" maxlength="5" cssClass="input100" /></div></td>
		<th><s:text name="RcAmbassadeorganismeFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPMRech"
				onkeyup="f9_PPM1(this,event)" id="TNUM_LIST_RCCODEPPMRech" maxlength="5"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text
				name="RcAmbassadeorganismeFB.DAT_RCDATEREGIMEPREFRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEREGIMEPREFRech"
				name="datRcDateRegimePrefRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></div></td>
		<th><s:text
				name="RcAmbassadeorganismeFB.TNUM_RCNATREGIMEPREFRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcNatRegimePrefRech"
				id="TNUM_RCNATREGIMEPREFRech" maxlength="1" cssClass="input100" /></div></td>
	</tr>
</table>
