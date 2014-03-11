<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcCreditairesFB.RechercheCreditaires" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.TNUM_RCCODECREDITAIRERech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeCreditaireRech"
				id="TNUM_RCCODECREDITAIRERech" maxlength="3" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.TNUM_LIST_RCCODEPPMRech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodePPMRech"
				onkeyup="f9_PPM1(this,event)" id="TNUM_LIST_RCCODEPPMRech" maxlength="5"
				cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.DAT_RCDATECREDITRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATECREDITRech"
				name="datRcDateCreditRech" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.DAT_RCDATEEXTENSIONRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATEEXTENSIONRech"
				name="datRcDateExtensionRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcCreditairesFB.DAT_RCDATERETRAITRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATERETRAITRech"
				name="datRcDateRetraitRech" showOn="focus" displayFormat="dd/mm/yy"
				maxlength="10" cssClass="input100" /></div></td>
		<th><s:text name="RcCreditairesFB.DAT_RCDATESUSPENSIONRech" /></th>
		<td><div style="float: left;"><sj:datepicker id="DAT_RCDATESUSPENSIONRech"
				name="datRcDateSuspensionRech" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></div></td>
	</tr>
</table>










