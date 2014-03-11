<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/groupefonction/rcInclude/rcGroupefonctionRechercheInclude.jsp"%>
	<script type="text/javascript">
    function consultGroupefonctionLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcGroupefonction.action?pk="+cellvalue+
    "&pageContext=consultationRcGroupefonction'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteGroupefonctionLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcGroupefonction.action?pk="+cellvalue+
         "&pageContext=rechercheRcGroupefonction'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editGroupefonctionLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcGroupefonction.action?pk="+cellvalue+
         "&pageContext=modificationRcGroupefonction'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcGroupefonction','rechercheRcGroupefonction')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />


<br/>
	<br/>
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="groupefonctionGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcGroupefonction" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editGroupefonctionLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteGroupefonctionLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultGroupefonctionLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeGroupe" title="%{getText('listeRcGroupefonction.rccodegroupe')}" />
		    	<sjg:gridColumn name="rcCodeGrpPere"  title="%{getText('listeRcGroupefonction.rccodegrppere')}" />
		    	<sjg:gridColumn name="rcLibGroupe"  title="%{getText('listeRcGroupefonction.rclibgroupe')}" />
	    </sjg:grid>
	 </div>	
</s:form>
