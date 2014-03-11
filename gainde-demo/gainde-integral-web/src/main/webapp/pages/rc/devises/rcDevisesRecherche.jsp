<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(
			sn.com.douane.utils.ConstManif.CTXMENU);

%>
<s:form method="post"  theme="simple">
<%@ include
		file="/pages/rc/devises/rcInclude/rcDevisesRechercheInclude.jsp"%>
		
<script type="text/javascript">
    function consultDevisesLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcDevises.action?pk="+cellvalue+
    "&pageContext=consultationRcDevises'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteDevisesLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcDevises.action?pk="+cellvalue+
         "&pageContext=rechercheRcDevises'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editDevisesLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcDevises.action?pk="+cellvalue+
         "&pageContext=modificationRcDevises'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcDevises','rechercheRcDevises')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>


	

	<input id="hidden" type="hidden" name="hidden">
	<s:hidden id="etat" name="etat" />

	<input id="hidden_message" type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

	<div style="float: left; margin-top: 5px; margin-down: 10px;">
		<s:url id="remoteurl" action="devisesGrid" />
		 <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcDevises" sortable="true"
	        width="800">
 	<sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editDevisesLink" width="40" />
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="deleteDevisesLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="consultDevisesLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodedevise" title="%{getText('listeRcDevises.rccodedevise')}" />
		    	<sjg:gridColumn name="rccoefficient"  title="%{getText('listeRcDevises.rccoefficient')}" />
		    	<sjg:gridColumn name="rcdatedevise" formatter="date" title="%{getText('listeRcDevises.rcdatedevise')}" />
		    	<sjg:gridColumn name="rclibelledevise"  title="%{getText('listeRcDevises.rclibelledevise')}" />
		    	<sjg:gridColumn name="rcprecisiondev"  title="%{getText('listeRcDevises.rcprecisiondev')}" />
		    	<sjg:gridColumn name="rcqtecfa"  title="%{getText('listeRcDevises.rcqtecfa')}" />
		    	<sjg:gridColumn name="rcqtedevise"  title="%{getText('listeRcDevises.rcqtedevise')}" />
		    	<sjg:gridColumn name="rcqtedevise"  title="%{getText('listeRcDevises.rcqtedevise')}" />
				<sjg:gridColumn name="rcusermodif"  title="%{getText('listeRcDevises.rcusermodif')}" />
		    	
	    </sjg:grid>
	 </div>		        
</s:form>
