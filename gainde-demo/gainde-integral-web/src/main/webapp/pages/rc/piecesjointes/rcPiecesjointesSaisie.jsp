<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/piecesjointes/rcInclude/rcPiecesjointesSaisieInclude.jsp"%>
<br/>
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar"  validate="true"
					onclick="doSubmit2('enregistrerRcPiecesjointes','saisieRcPiecesjointes')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrll('rechercherRcPiecesjointes','rechercheRcPiecesjointes')"></s:submit></td>
		</tr>
	</table>
</div>
</s:form>

