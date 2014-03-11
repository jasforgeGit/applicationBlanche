<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcCompbureauFB.RechercheCompbureau" /></th>
	</tr>
	<tr>
		<th><s:text name="RcCompbureauFB.TNUM_RCCODECOMPETENCERech" /></th>
		<td><s:textfield name="numRcCodeCompetenceRech"
				id="TNUM_RCCODECOMPETENCERech" maxlength="2"
				cssClass="input200" /></td>
		<td style="width: 60%"></td>
	</tr>
	<tr>
		<th><s:text name="RcCompbureauFB.TNUM_RCDESCOMPETENCESRech" /></th>
		<td><s:textfield name="numRcDesCompetencesRech"
				id="TNUM_RCDESCOMPETENCESRech" maxlength="100"
				cssClass="input500" /></td>
		<td style="width: 60%"></td>
	</tr>
</table>

