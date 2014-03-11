<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>

<s:form method="post" theme="simple" onsubmit="return (false)">
<%@ include
		file="/pages/rc/langue/rcInclude/rcLangueSaisieInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr>
				<td><s:submit key="button.save" cssClass="buttonBar"
						validate="true"
						onclick="doSubmit2('enregistrerRcLangue','saisieRcLangue')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcLangue','rechercheRcLangue')"></s:submit></td>
			</tr>
		</table>
	</div>
</s:form>