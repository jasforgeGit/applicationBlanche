<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(
			sn.com.douane.utils.ConstManif.CTXMENU);

%>
<s:form method="post"  theme="simple">
<%@ include
		file="/pages/rc/langue/rcInclude/rcLangueRechercheInclude.jsp"%>
		
<script type="text/javascript">
    function consultLangueLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcLangue.action?pk="+cellvalue+
    "&pageContext=consultationRcLangue'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteLangueLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcLangue.action?pk="+cellvalue+
         "&pageContext=rechercheRcLangue'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editLangueLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcLangue.action?pk="+cellvalue+
         "&pageContext=modificationRcLangue'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcLangue','rechercheRcLangue')"></s:submit>
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
		<s:url id="remoteurl" action="langueGrid" />
		 <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcLangue" sortable="true"
	        width="800">
 	<sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editLangueLink" width="40" />
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="deleteLangueLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="consultLangueLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodelangue" title="%{getText('listeRcLangue.rccodelangue')}" />
		    	<sjg:gridColumn name="libellelangue"  title="%{getText('listeRcLangue.libellelangue')}" />
		    	
	    </sjg:grid>
	 </div>		        
</s:form>