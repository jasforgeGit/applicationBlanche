<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/tarifsUemoa/rcInclude/rcTarifsUemoaSaisieProduitsInclude.jsp"%>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('enregistrerRcAgrementProduit','saisieRcProduitsUemoa')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcAgrementProduit','modificationRcTarifsUemoa')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>

