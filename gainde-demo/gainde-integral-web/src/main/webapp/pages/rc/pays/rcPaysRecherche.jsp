<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/pays/rcInclude/rcPaysRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultPaysLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcPays.action?pk="+cellvalue+
    "&pageContext=consultationRcPays'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deletePaysLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcPays.action?pk="+cellvalue+
         "&pageContext=rechercheRcPays'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editPaysLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcPays.action?pk="+cellvalue+
         "&pageContext=modificationRcPays'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	

<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcPays','rechercheRcPays')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",
						request.getLocale())%>" />


 <br/>
	<br/>
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="paysGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcPays" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editPaysLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deletePaysLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultPaysLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rccodepays" title="%{getText('listeRcPays.rccodepays')}" />
		    	<sjg:gridColumn name="rccircuitvisite"  title="%{getText('listeRcPays.rccircuitvisite')}" />
		    	<sjg:gridColumn name="rccodedevise"  title="%{getText('listeRcPays.rccodedevise')}" />
		    	<sjg:gridColumn name="rccodelangue"  title="%{getText('listeRcPays.rccodelangue')}" />
		    	<sjg:gridColumn name="rcnaturefiscalite"  title="%{getText('listeRcPays.rcnaturefiscalite')}" />
		    	<sjg:gridColumn name="rclibellepays"  title="%{getText('listeRcPays.rclibellepays')}" />
	    </sjg:grid>
	 </div>	
</s:form>