<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/regimeburinterdit/rcInclude/rcRegimeburinterditRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultRegimeBurInterditLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegimeburinterdit.action?pk="+cellvalue+
    "&pageContext=consultationRcRegimeburinterdit'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegimeBurInterditLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegimeburinterdit.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegimeburinterdit'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegimeBurInterditLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegimeburinterdit.action?pk="+cellvalue+
         "&pageContext=modificationRcRegimeburinterdit'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegimeburinterdit','rechercheRcRegimeburinterdit')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

	
<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regimeBurInterditGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegimeburinterdit" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegimeBurInterditLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegimeBurInterditLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegimeBurInterditLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeBurDouane" title="%{getText('listeRcRegimeburinterdit.rccodebureau')}" />
		    	<sjg:gridColumn name="rcCodeRegimeDouanier"  title="%{getText('listeRcRegimeburinterdit.rcregimedouanier')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcRegimeburinterdit.rctyperegime')}" />
	    </sjg:grid>
	 </div>	
</s:form>