<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcRegimedestinataireFB.SaisieRegimedestinataire" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numListRcCodePpmOB" onkeyup="f9_PPM1(this, event)"
				id="TNUM_LIST_RCCODEPPM_OB" maxlength="5"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB" 
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,this,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCCODEREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalOB" 
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,this,event)"
				id="TNUM_LIST_RCCODEREGIMEFISCAL_OB" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcRegimedestinataireFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB" 
		onkeyup="f9_Regime(this,TNUM_LIST_RCCODEREGIMEDOUANIER_OB,TNUM_LIST_RCCODEREGIMEFISCAL_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>

