<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/tarifsUemoa/rcInclude/rcTarifsUemoaConsultationProduitsInclude.jsp"%>
	<div style="float: left;">	
	<table>
		<tr>
				<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcAgrementProduit','consultationRcTarifsUemoa')"></s:submit></td>
		</tr>
	</table>
	</div>	
</s:form>

