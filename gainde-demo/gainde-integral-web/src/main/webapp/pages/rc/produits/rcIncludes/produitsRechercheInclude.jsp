<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="8"><s:text
				name="RechercheRcFB.CriteresRecherche" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcCodeProdRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcCodeProdRech"
				id="TNUM_rcCodeProdRech" maxlength="6"
				cssClass="input100" /></div></td>
	</tr>
	<tr>					
		<th><s:text name="RcProduitsFB.TNUM_rcPrecUemoaRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecUemoaRech" id="TNUM_rcPrecUemoaRech"
				maxlength="2" cssClass="input100" /></div></td>
	</tr>
	<tr>
		<th><s:text name="RcProduitsFB.TNUM_rcPrecSenegalRech" /></th>
		<td><div style="float: left;"><s:textfield name="numRcPrecSenegalRech"
				id="TNUM_rcPrecSenegalRech" maxlength="2"
				cssClass="input100" /></div></td>
	</tr>
	<tr>					
		<th><s:text name="RcProduitsFB.NUM_LIST_rcValChapitreRech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcValChapitreRech" id="NUM_LIST_rcValChapitreRech"
				maxlength="2" cssClass="input100" onkeyup="f9_ChapitreSection(this,event)"/></div></td>
	</tr>
	<tr>					
		<th><s:text name="RcProduitsFB.TNUM_LIST_rcCodeClasseRech" /></th>
		<td><div style="float: left;"><s:textfield name="numListRcCodeClasseRech" id="TNUM_LIST_rcCodeClasseRech"
				maxlength="4" cssClass="input100" onkeyup="f9_Classe(this,event)"/></div></td>
	</tr>
</table>

