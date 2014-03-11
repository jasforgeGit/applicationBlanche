<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text
				name="RcIndicateurregdouFB.SaisieIndicateurregdou" /></th>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregdouFB.TNUM_LIST_RCCODEINDICATEUR_OB" /></th>
		<td><s:textfield name="numListRcCodeIndicateurOB" onkeyup="f9_Indicateur(this, event)"
				id="TNUM_LIST_RCCODEINDICATEUR_OB" maxlength="15"
				cssClass="input100" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcIndicateurregdouFB.TNUM_LIST_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numListRcCodeRegimeDouanierOB" id="TNUM_LIST_RCCODEREGIMEDOUANIER_OB"
				maxlength="2" cssClass="input100" onkeyup="f9_RegimeDouanier(this, event)"/></td>
	</tr>
	<tr>
		<th><s:text name="RcIndicateurregdouFB.DAT_RCDATEVALIDITE_OB" /></th>
		<td><sj:datepicker id="DAT_RCDATEVALIDITE_OB" name="datRcDateValiditeOB"
				showOn="focus" displayFormat="dd/mm/yy" maxlength="10"
				cssClass="input100" /></td>
		<td style="width: 20%"></td>
		<th><s:text name="RcIndicateurregdouFB.DAT_RCDATECLOTURE" /></th>
		<td><sj:datepicker id="DAT_RCDATECLOTURE"
				name="datRcDateCloture" showOn="focus"
				displayFormat="dd/mm/yy" maxlength="10" cssClass="input100" /></td>
	</tr>
</table>


