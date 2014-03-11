<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout"%>
<script language="javascript">
		url_retour = "/GAINDE2005Web/rcCatregroupACT.do?reqCode=rechercherRcCatregroup&page=rechercheRcCatregroup";
	</script>

<layout:form action="/rcCatregroupACT" method="post" reqCode=""
	width="100%">
	<%@ include
		file="/pages/rc/catregroup/rcInclude/rcCatregroupModificationInclude.jsp"%>
	<layout:grid width="100%" cols="5">

		<!-- Modifier -->
		<layout:button styleClass="buttonBar"
			onclick="if (confirmRcUpdate()!=false) {doSubmit('modifierRcCatregroup','modificationRcCatregroup');}">
			<layout:message key="button.edit" />
		</layout:button>

		<!-- Annuler -->
		<layout:button styleClass="buttonBar"
			onclick="gotoUrl('rechercherRcCatregroup','rechercheRcCatregroup')">
			<layout:message key="button.retour" />
		</layout:button>

		<layout:cell width="50%" />
		<layout:cell width="50%" />
	</layout:grid>
</layout:form>
