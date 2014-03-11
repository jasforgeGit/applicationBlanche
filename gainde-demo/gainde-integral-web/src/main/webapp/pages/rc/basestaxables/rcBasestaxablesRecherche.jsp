<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
	String action_url;
	if (ctxmenu.equals("SM"))
		action_url = "rcBasestaxablesACT.do?reqCode=afficherRcBasestaxables&page=modificationRcBasestaxables";
	else
		if (ctxmenu.equals("C"))
			action_url = "rcBasestaxablesACT.do?reqCode=afficherRcBasestaxables&page=consultationRcBasestaxables";
		else action_url = "";
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/basestaxables/rcInclude/rcBasestaxablesRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultBasesTaxableLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcBasestaxables.action?pk="+cellvalue+
    "&pageContext=consultationRcBasestaxables'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteBasesTaxableLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcBasestaxables.action?pk="+cellvalue+
         "&pageContext=rechercheRcBasestaxables'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editBasesTaxableLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcBasestaxables.action?pk="+cellvalue+
         "&pageContext=modificationRcBasestaxables'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
	
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcBasestaxables','rechercheRcBasestaxables')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />	
	
	
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="basesTaxableGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcBasestaxables" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editBasesTaxableLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteBasesTaxableLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultBasesTaxableLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeTaxe" title="%{getText('listeRcBasestaxables.rccodetaxe')}" />
		    	<sjg:gridColumn name="rcCodeTaxeBase"  title="%{getText('listeRcBasestaxables.rccodetaxebase')}" />
		    	<sjg:gridColumn name="rcOrdreCalcul"  title="%{getText('listeRcBasestaxables.rcordrecalcul')}" />
	    </sjg:grid>
	 </div>	
</s:form>