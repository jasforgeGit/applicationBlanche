<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcDevisesFB.ModificationDevises" /></th>
	</tr>
	<tr>
		<th><s:text name="RcDevisesFB.TNUM_RCCODEDEVISE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCodeDeviseOB" 
					id="TNUM_RCCODEDEVISE_OB" maxlength="3" cssClass="input200" />
			</div></td>
		<th><s:text name="RcDevisesFB.TNUM_RCLIBELLEDEVISE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcLibelleDeviseOB"
					id="TNUM_RCLIBELLEDEVISE_OB" maxlength="100" cssClass="input200" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcDevisesFB.DAT_RCDATEDEVISE_OB" /></th>
		<td><div style="float: left;">
				<sj:datepicker id="DAT_RCDATEDEVISE_OB" name="datRcDateDeviseOB"
					showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
					cssClass="input200" />
			</div></td>
		<th><s:text name="RcDevisesFB.NUM_RCCOEFFICIENT_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcCoefficientOB" id="NUM_RCCOEFFICIENT_OB"
					maxlength="4" cssClass="input200" />
			</div></td>
	</tr>

	<tr>
		<th><s:text name="RcDevisesFB.NUM_RCPRECISIONDEV_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcPrecisionDevOB" id="NUM_RCPRECISIONDEV_OB"
					maxlength="4" cssClass="input200" />
			</div></td>
		<th><s:text name="RcDevisesFB.NUM_RCQTECFA_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcQteCFaOB" id="NUM_RCQTECFA_OB" maxlength="9"
					cssClass="input200" />
			</div></td>
	</tr>
	<tr>
		<th><s:text name="RcDevisesFB.NUM_RCQTEDEVISE_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcQteDeviseOB" id="NUM_RCQTEDEVISE_OB"
					maxlength="9" cssClass="input200" />
			</div></td>
		<th><s:text name="RcDevisesFB.TNUM_RCUSERMODIF_OB" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcUserModifOB" id="TNUM_RCUSERMODIF_OB"
					maxlength="8" cssClass="input200" />
			</div></td>
	</tr>
</table>

