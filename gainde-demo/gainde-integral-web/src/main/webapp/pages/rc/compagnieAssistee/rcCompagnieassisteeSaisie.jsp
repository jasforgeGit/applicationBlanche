<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form method="post" theme="simple" onsubmit="return (false)">
	<%@ include
		file="/pages/rc/compagnieAssistee/rcInclude/rcCompagnieassisteeSaisieInclude.jsp"%>
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="doSubmit2('rcCompagnieassisteeSaisie','saisieRcCompagnieassistee')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcCompagnieassistee','rechercheRcCompagnieassistee')"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>






