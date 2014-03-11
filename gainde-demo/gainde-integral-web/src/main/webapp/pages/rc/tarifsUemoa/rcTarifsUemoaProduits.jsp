<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/tarifsUemoa/rcInclude/rcTarifsUemoaProduitsInclude.jsp"%>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('modifierRcAgrementProduit','modificationRcProduitsUemoa')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcAgrementProduit','modificationRcTarifsUemoa')"></s:submit></td>
		</tr>
	</table>
	</div>	
</s:form>

