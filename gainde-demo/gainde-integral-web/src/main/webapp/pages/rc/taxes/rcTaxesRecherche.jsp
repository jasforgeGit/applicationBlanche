<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/taxes/rcInclude/rcTaxesRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultTaxeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcTaxes.action?pk="+cellvalue+
    "&pageContext=consultationRcTaxes'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteTaxeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcTaxes.action?pk="+cellvalue+
         "&pageContext=rechercheRcTaxes'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editTaxeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcTaxes.action?pk="+cellvalue+
         "&pageContext=modificationRcTaxes'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcTaxes','rechercheRcTaxes')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="taxeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcTaxes" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editTaxeLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteTaxeLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultTaxeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeTaxe" title="%{getText('listeRcTaxes.rccodetaxe')}" />
		    	<sjg:gridColumn name="rcNatureTaxe"  title="%{getText('listeRcTaxes.rcnaturetaxe')}" />
		    	<sjg:gridColumn name="rcLibelleTaxe"  title="%{getText('listeRcTaxes.rclibelletaxe')}" />
	    </sjg:grid>
	 </div>	
	 </s:form>