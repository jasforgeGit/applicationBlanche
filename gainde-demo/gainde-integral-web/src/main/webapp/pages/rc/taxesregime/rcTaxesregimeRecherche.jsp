<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/taxesregime/rcInclude/rcTaxesregimeRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultTaxesRegimeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcTaxesregime.action?pk="+cellvalue+
    "&pageContext=consultationRcTaxesregime'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteTaxesRegimeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcTaxesregime.action?pk="+cellvalue+
         "&pageContext=rechercheRcTaxesregime'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editTaxesRegimeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcTaxesregime.action?pk="+cellvalue+
         "&pageContext=modificationRcTaxesregime'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcTaxesregime','rechercheRcTaxesregime')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="taxesRegimeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcTaxesregime" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editTaxesRegimeLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteTaxesRegimeLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultTaxesRegimeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeTaxes" title="%{getText('listeRcTaxesregime.rccodetaxe')}" width="100"/>
		    	<sjg:gridColumn name="rcCodeRegimeDouanier"  title="%{getText('listeRcTaxesregime.rcregimedouanier')}" />
		    	<sjg:gridColumn name="rcTypeRegime" width="250" title="%{getText('listeRcTaxesregime.rctyperegimedouanier')}" />
		    	<sjg:gridColumn name="rcRegimeFiscal"  title="%{getText('listeRcTaxesregime.rcregimefiscal')}" />
		    	<sjg:gridColumn name="rcDateValeur" formatter="date" title="%{getText('listeRcTaxesregime.rcdatevaleur')}" />
	    </sjg:grid>
	 </div>	
</s:form>