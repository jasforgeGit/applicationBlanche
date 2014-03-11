<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimeFB.ConsultationRegime" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" readonly="true"
				id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB" id="TNUM_LIST_RCCODEREGIMEFISCAL_OB"
				maxlength="2" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeFB.TNUM_RCCIRCUITVISITE_OB" /></th>
		<td><s:textfield name="numRcCircuitVisiteOB" id="TNUM_RCCIRCUITVISITE_OB"
				maxlength="1" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_RCINDICMUTAT_OB" /></th>
		<td><s:textfield name="numRcIndicMutatOB" readonly="true"
				id="TNUM_RCINDICMUTAT_OB" maxlength="1"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimeFB.TNUM_RCREGIMETAXABLE_OB" /></th>
		<td><s:textfield name="numRcRegimeTaxableOB" id="TNUM_RCREGIMETAXABLE_OB"
				maxlength="1" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.NUM_RCDUREEENTREPOT" /></th>
		<td><s:textfield name="numRcDureeEntrepot" readonly="true"
				id="NUM_RCDUREEENTREPOT" maxlength="4"
				cssClass="input200" cssStyle="float: left;"/></td>
		<td width="20%"></td>
		<td></td>
		<td></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimeFB.TNUM_RCLIBELLEREGIME_OB" /></th>
		<td><s:textfield name="numRcLibelleRegimeOB" id="TNUM_RCLIBELLEREGIME_OB"
				maxlength="250" cssClass="input500" readonly="true"/></td>
		<td width="20%"></td>
		<td></td>
		<td></td>
	</tr>
</table>