<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text name="RcDevisesFB.RechercheDevises" /></th>
	</tr>

	<tr>

		<th><s:text name="RcDevisesFB.TNUM_RCCODEDEVISERech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCodeDeviseRech" id="TNUM_RCCODEDEVISERech"
					maxlength="3" cssClass="input200" />
			</div></td>
			<td style="width: 20%;"></td>
		<th><s:text name="RcDevisesFB.NUM_RCCOEFFICIENTRech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCoefficientRech" id="NUM_RCCOEFFICIENTRech"
					maxlength="4" cssClass="input200" />
			</div></td>

	</tr>

	<tr>
		<th><s:text name="RcDevisesFB.NUM_RCPRECISIONDEVRech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcPrecisionDevRech" id="NUM_RCPRECISIONDEVRech" 
				maxlength="4" cssClass="input200" />
				</div></td>
		<td style="width: 20%;"></td>
		<th><s:text name="RcDevisesFB.NUM_RCQTECFARech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcQteCFaRech" maxlength="9"
					cssClass="input200" />
			</div></td>
	</tr>

	<tr>
		<th><s:text name="RcDevisesFB.NUM_RCQTEDEVISERech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcQteDeviseRech"
				 maxlength="9" cssClass="input200" /></div></td>
		<td style="width: 20%;"></td>
		<th><s:text name="RcDevisesFB.TNUM_RCUSERMODIFRech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcUserModifRech" maxlength="9"
					cssClass="input200" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcDevisesFB.DAT_RCDATEDEVISERech" /></th>
		<td><div style="float: left;">
				<sj:datepicker name="datRcDateDeviseRech" showOn="focus"
					displayFormat="dd/mm/yy" maxlength="10" cssClass="input200" />
			</div></td>
	<td style="width: 20%;"></td>
		<th><s:text name="RcDevisesFB.TNUM_RCLIBELLEDEVISERech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcLibelleDeviseRech" maxlength="100"
					cssClass="input200" />
			</div></td>
	</tr>
</table>
