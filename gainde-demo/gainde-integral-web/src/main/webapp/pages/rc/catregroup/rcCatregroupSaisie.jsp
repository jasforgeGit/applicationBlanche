<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout"%>
<layout:form action="/rcCatregroupACT" method="post" reqCode=""
	width="100%">
	<%@ include
		file="/pages/rc/catregroup/rcInclude/rcCatregroupSaisieInclude.jsp "%>
	<layout:grid width="100%" cols="4">
		<layout:button styleClass="buttonBar"
			onclick="doSubmit('enregistrerRcCatregroup','saisieRcCatregroup')">
			<layout:message key="button.save" />
		</layout:button>
		<layout:button styleClass="buttonBar"
			onclick="lister('rechercherRcCatregroup','rechercheRcCatregroup')">
			<layout:message key="button.retour" />
		</layout:button>
		<layout:cell width="50%" />
		<layout:cell width="50%" />
	</layout:grid>
</layout:form>
