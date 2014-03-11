<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
	String action_url;
	if (ctxmenu.equals("SM"))
		action_url = "rcBurmoddeclACT.do?reqCode=afficherRcBurmoddecl&page=modificationRcBurmoddecl";
	else
		if (ctxmenu.equals("C"))
			action_url = "rcBurmoddeclACT.do?reqCode=afficherRcBurmoddecl&page=consultationRcBurmoddecl";
		else action_url = "";
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/burmoddecl/rcInclude/rcBurmoddeclRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultBurModDeclLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcBurmoddecl.action?pk="+cellvalue+
    "&pageContext=consultationRcBurmoddecl'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteBurModDeclLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcBurmoddecl.action?pk="+cellvalue+
         "&pageContext=rechercheRcBurmoddecl'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editBurModDeclLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcBurmoddecl.action?pk="+cellvalue+
         "&pageContext=modificationRcBurmoddecl'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcBurmoddecl','rechercheRcBurmoddecl')"></s:submit>
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
	<s:url id="remoteurl" action="burModDeclGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcBurmoddecl" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editBurModDeclLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteBurModDeclLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultBurModDeclLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeBurDecl" title="%{getText('listeRcBurmoddecl.rccodeburdecl')}" />
		    	<sjg:gridColumn name="rcModeDecl"  title="%{getText('listeRcBurmoddecl.rcmodedecl')}" />
	    </sjg:grid>
	 </div>
</s:form>