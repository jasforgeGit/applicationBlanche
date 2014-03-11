<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
 
 		<script>
			url_retour = "/GAINDE2005Web/rcProduitsACT.do?reqCode=rechercherRcProduits&page=rechercheProduits";
		</script>
 
	<%@ include
		file="/pages/rc/produits/rcIncludes/produitsConsultationInclude.jsp"%>

	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrl('returnPrecedentProduit','rechercheProduits')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>
