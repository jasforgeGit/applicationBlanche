<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/piecesjointes/rcInclude/rcPiecesjointesConsultationInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('rechercherRcPiecesJointes','rechercheRcPiecesjointes')"></s:submit></td>
		</tr>
	</table>
</s:form>
