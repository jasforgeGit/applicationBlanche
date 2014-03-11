<%@taglib uri="/struts-tags" prefix="s"%>

<s:form method="post" theme="simple">
	<table class="SECTION">
		<tr>
			<th class="ENTETE" colspan="4"><s:text
					name="RcCompagnieassisteeFB.RechercheCompagnieassistee" /></th>
		</tr>
		<tr>
			<th><s:text
					name="RcCompagnieassisteeFB.NUM_CODECIEASSISTEERech" /></th>
			<td><div style="float: left;"><s:textfield name="numCodeCieAssisteeRech"
					id="NUM_CODECIEASSISTEERech" maxlength="4" /></div></td>
			<th><s:text
					name="RcCompagnieassisteeFB.TNUM_NOMCIEASSISTEERech" /></th>
			<td><div style="float: left;"><s:textfield name="numNomCieAssisteeRech"
					id="TNUM_NOMCIEASSISTEERech" maxlength="100" /></div></td>
		</tr>
	</table>
</s:form>



