<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">

	<%@ include
		file="/pages/rc/produits/rcIncludes/produitsModificationInclude.jsp"%>
	
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.save" cssClass="buttonBar" validate="true"
					onclick="if (confirmRcUpdate()!=false) {doSubmit2('modifierRcProduits','modificationProduits');}"></sj:submit>
		   <sj:submit key="button.cancel" cssClass="buttonBar" 
					onclick="gotoUrl('returnPrecedentProduit','rechercheProduits')"></sj:submit></td>
		</tr>
	</table>
	</div>
	 <s:hidden name="hidden" id="hidden"></s:hidden>
</s:form>
