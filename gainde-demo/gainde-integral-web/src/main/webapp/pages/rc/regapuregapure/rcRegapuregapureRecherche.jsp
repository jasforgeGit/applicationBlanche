<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/regapuregapure/rcInclude/rcRegapuregapureRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultRegapuregapureLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegapuregapure.action?pk="+cellvalue+
    "&pageContext=consultationRcRegapuregapure'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegapuregapureLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegapuregapure.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegapuregapure'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegapuregapureLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegapuregapure.action?pk="+cellvalue+
         "&pageContext=modificationRcRegapuregapure'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegapuregapure','rechercheRcRegapuregapure')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regapuregapureGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegapuregapure" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegapuregapureLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegapuregapureLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegapuregapureLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcRegDouApurant" title="%{getText('listeRcRegapuregapure.rcregdouapurant')}" />
		    	<sjg:gridColumn name="rcTypeRegApurant"  title="%{getText('listeRcRegapuregapure.rctyperegapurant')}" />
		    	<sjg:gridColumn name="rcRegDouApure"  title="%{getText('listeRcRegapuregapure.rcregdouapure')}" />
		    	<sjg:gridColumn name="rcTypeRegApure"  title="%{getText('listeRcRegapuregapure.rctyperegapure')}" />
	    </sjg:grid>
	 </div>	
</s:form>