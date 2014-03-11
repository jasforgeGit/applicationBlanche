<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="5"><s:text name="RcGenrebureauFB.RechercheGenrebureau" /></th>
	</tr>

	<tr>

		<th><s:text name="RcGenrebureauFB.TNUM_RCGENREBUREAURech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcGenreBureauRech" id="TNUM_RCGENREBUREAURech"
					maxlength="3" cssClass="input200" />
			</div></td>
			<td style="width: 20%;"></td>
		<th><s:text name="RcGenrebureauFB.TNUM_RCDESGENREBUREAURech" /></th>
		<td><div style="float: left;">
				<s:textfield name="numRcDesGenreBureauRech" id="TNUM_RCDESGENREBUREAURech"
					maxlength="4" cssClass="input200" />
			</div></td>

	</tr>
</table>
