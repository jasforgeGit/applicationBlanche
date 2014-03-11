<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/bureauuemoa/rcInclude/rcBureauuemoaRechercheInclude.jsp"%>
		
		
		<script type="text/javascript">
    function consultBureauUemoaLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcBureauuemoa.action?pk="+cellvalue+
    "&pageContext=consultationRcBureauuemoa'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteBureauUemoaLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcBureauuemoa.action?pk="+cellvalue+
         "&pageContext=rechercheRcBureauuemoa'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editBureauUemoaLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcBureauuemoa.action?pk="+cellvalue+
         "&pageContext=modificationRcBureauuemoa'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>

<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcBureauuemoa','rechercheRcBureauuemoa')"></s:submit>
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
	<s:url id="remoteurl" action="bureauUemoaGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcBureauuemoa" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editBureauUemoaLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteBureauUemoaLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultBureauUemoaLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeBurUemoa" title="%{getText('listeRcBureauuemoa.rccodeburuemoa')}" />
		    	<sjg:gridColumn name="rcLibelleBurUemoa"  title="%{getText('listeRcBureauuemoa.rclibelleburuemoa')}" />
	    </sjg:grid>
	 </div>
	 </s:form>
