<%
request.getSession().setAttribute("pageRetour","saisieRcPpm");
String etatPpm=(String) request.getSession().getAttribute("ppmExiste");
%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/ppm/rcInclude/rcPpmSaisieInclude.jsp " %>
	<table>
		<tr>
		<%if(etatPpm==null){ %>
			<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit('enregistrerRcPpm','saisieRcPpm')"></s:submit>
		<%} else { %>		
				<td><s:submit key="button.save" cssClass="buttonBar"
					onclick="doSubmit('modifierRcPpm','saisieRcPpm')"></s:submit></td>
		<%} %>			
				<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('unspecified','rechercheRcPpm')"></s:submit></td>
		
		</tr>
	</table>
</s:form>