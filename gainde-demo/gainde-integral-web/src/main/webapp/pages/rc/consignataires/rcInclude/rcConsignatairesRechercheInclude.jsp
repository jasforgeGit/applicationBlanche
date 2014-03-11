<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="4"><s:text
					name="RcConsignatairesFB.RechercheConsignataires" /></th>
		</tr>
		<tr>
			<th><s:text
					name="RcConsignatairesFB.TNUM_RCCODECONSIGNATAIRERech" /></th>
			<td><div style="float: left;"><s:textfield name="numRcCodeConsignataireRech"
					id="TNUM_RCCODECONSIGNATAIRERech" maxlength="3" cssClass="input100"/></div></td>
			<th><s:text
					name="RcConsignatairesFB.TNUM_LIST_RCCODEPPMRech" /></th>
			<td><div style="float: left;"><s:textfield name="numListRcCodePPMRech" onkeyup="f9_PPM1(this,event)"
					id="TNUM_LIST_RCCODEPPMRech" maxlength="5" cssClass="input100"/></div></td>
					</tr>
					<tr>
			<th><s:text
					name="RcConsignatairesFB.DAT_RCDATESUSPENSIONRech" /></th>
			<td><div style="float: left;"><sj:datepicker id="DAT_RCDATESUSPENSIONRech" name="datRcDateSuspensionRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
			<th><s:text
					name="RcConsignatairesFB.DAT_RCDATECREATIONCONSIGRech" /></th>
			<td><div style="float: left;"><sj:datepicker id="DAT_RCDATECREATIONCONSIGRech" name="datRcDateCreationConsigRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100"/></div></td>
		</tr>
	</table>