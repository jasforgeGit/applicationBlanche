<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RcRegimedeclarantFB.SaisieRegimedeclarant" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCCODEPPM_OB" /></th>
		<td><s:textfield name="numListRcCodePpmOB" onkeyup="f9_PPM1(this,event)"
				id="TNUM_LIST_RCCODEPPM_OB" maxlength="5"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcRegimeDouanierOB" id="TNUM_LIST_RCREGIMEDOUANIER_OB"
		onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,this,TNUM_LIST_RCREGIMEFISCAL_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCREGIMEFISCAL_OB" /></th>
		<td><s:textfield name="numListRcRegimeFiscalOB"
				id="TNUM_LIST_RCREGIMEFISCAL_OB" maxlength="2"
				onkeyup="f9_Regime(TNUM_LIST_RCTYPEREGIME_OB,TNUM_LIST_RCREGIMEDOUANIER_OB,this,event)"
				cssClass="input200" /></td>
		<td width="20%"></td>
		<th><s:text name="RcRegimedeclarantFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" id="TNUM_LIST_RCTYPEREGIME_OB"
		onkeyup="f9_Regime(this,TNUM_LIST_RCREGIMEDOUANIER_OB,TNUM_LIST_RCREGIMEFISCAL_OB,event)"
				maxlength="1" cssClass="input200" /></td>
	</tr>
</table>

