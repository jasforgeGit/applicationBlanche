<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/typeregimedouane/rcInclude/rcTyperegimedouaneRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultTypeRegimeDouaneLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcTyperegimedouane.action?pk="+cellvalue+
    "&pageContext=consultationRcTyperegimedouane'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteTypeRegimeDouaneLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcTyperegimedouane.action?pk="+cellvalue+
         "&pageContext=rechercheRcTyperegimedouane'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editTypeRegimeDouaneLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcTyperegimedouane.action?pk="+cellvalue+
         "&pageContext=modificationRcTyperegimedouane'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcTyperegimedouane','rechercheRcTyperegimedouane')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",
						request.getLocale())%>" />

<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="typeRegimeDouaneGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcTyperegimedouane" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editTypeRegimeDouaneLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteTypeRegimeDouaneLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultTypeRegimeDouaneLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rcTypeRegime" title="%{getText('listeRcTyperegimedouane.rctyperegime')}" />
		    	<sjg:gridColumn name="rcLibelleRegime"  title="%{getText('listeRcTyperegimedouane.rclibelleregime')}" />
	    </sjg:grid>
	 </div>	
</s:form>