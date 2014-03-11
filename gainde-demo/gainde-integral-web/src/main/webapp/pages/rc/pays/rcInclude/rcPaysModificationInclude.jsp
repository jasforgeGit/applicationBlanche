<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcPaysFB.ModificationPays" /></th>
	</tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_RCCODEPAYS_OB" /></th>
		<td><s:textfield name="numRcCodePaysOB" readonly="true"
				id="TNUM_RCCODEPAYS_OB" maxlength="3"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:label key="RcPaysFB.TNUM_LIST_RCCIRCUITVISITE_OB"></s:label></th>
		<td><s:select id="TNUM_LIST_RCCIRCUITVISITE_OB"
					name="numListRcCircuitVisiteOB" 
					list="listCircuitVisite" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
	</tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_LIST_RCCODEDEVISE_OB" /></th>
		<td><s:textfield name="numListRcCodeDeviseOB" onkeyup="f9_devise(this, event)"
				id="TNUM_LIST_RCCODEDEVISE_OB" maxlength="3"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcPaysFB.TNUM_LIST_RCCODELANGUE_OB" /></th>
		<td><s:textfield name="numListRcCodeLangueOB" onkeyup="f9_Langue(this, event)"
				id="TNUM_LIST_RCCODELANGUE_OB" maxlength="3"
				cssClass="input200" /></td>
    </tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_RCCODEMONNETAIRE" /></th>
		<td><s:textfield name="numRcCodeMonnetaire" 
				id="TNUM_RCCODEMONNETAIRE" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcPaysFB.TNUM_RCCODEPROHIBITION" /></th>
		<td><s:textfield name="numRcCodeProhibition" 
				id="TNUM_RCCODEPROHIBITION" maxlength="1"
				cssClass="input200" /></td>
    </tr>
	<tr>
		 <th><s:text name="RcPaysFB.DAT_RCDATEFISCALITE" /></th>
	     <td><sj:datepicker id="DAT_RCDATEFISCALITE" name="datRcDateFiscalite" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
		 <td style="width: 20%"></td>
		 <th><s:text name="RcPaysFB.DAT_RCDATEPROHIBITION" /></th>
	     <td><sj:datepicker id="DAT_RCDATEPROHIBITION" name="datRcDateProhibition" showOn="focus" displayFormat="dd/mm/yy" cssStyle="width: 200px;"/></td>
    </tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_RCLIBELLEPAYS_OB" /></th>
		<td><s:textfield name="numRcLibellePaysOB"
				id="TNUM_RCLIBELLEPAYS_OB" maxlength="100"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:label key="RcPaysFB.TNUM_LIST_RCNATUREFISCALITE_OB"></s:label></th>
		<td><s:select id="TNUM_LIST_RCNATUREFISCALITE_OB"
					name="numListRcNatureFiscaliteOB" 
					list="listNatureFiscalite" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
	</tr>
	<tr>
		<th><s:text name="RcPaysFB.TNUM_RCPAYSALPHABETIQUE_OB" /></th>
		<td><s:textfield name="numRcPaysAlphabetiqueOB"
				id="TNUM_RCPAYSALPHABETIQUE_OB" maxlength="3"
				cssClass="input200" /></td>
    </tr>
</table>