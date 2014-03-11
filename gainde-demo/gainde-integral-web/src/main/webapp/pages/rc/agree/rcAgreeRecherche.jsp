<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/agree/rcInclude/rcAgreeRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultAgreeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcAgree.action?pk="+cellvalue+
    "&pageContext=consultationRcAgree'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteAgreeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcAgree.action?pk="+cellvalue+
         "&pageContext=rechercheRcAgree'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editAgreeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcAgree.action?pk="+cellvalue+
         "&pageContext=modificationRcAgree'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcAgree','rechercheRcAgree')"></s:submit>
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
	<s:url id="remoteurl" action="agreeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcAgree" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editAgreeLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteAgreeLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultAgreeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeAgree" title="%{getText('listeRcAgree.rccodeagree')}" />
		    	<sjg:gridColumn name="rcCodePpm"  title="%{getText('listeRcAgree.rccodeppm')}" />
		    	<sjg:gridColumn name="rcEtatAgree"  title="%{getText('listeRcAgree.rcetatagree')}" />
	    </sjg:grid>
	 </div>	
</s:form>