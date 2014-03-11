<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/fonctionnalites/rcInclude/rcFonctionnalitesRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultFonctionnaliteLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcFonctionnalites.action?pk="+cellvalue+
    "&pageContext=consultationRcFonctionnalites'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteFonctionnaliteLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcFonctionnalites.action?pk="+cellvalue+
         "&pageContext=rechercheRcFonctionnalites'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editFonctionnaliteLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcFonctionnalites.action?pk="+cellvalue+
         "&pageContext=modificationRcFonctionnalites'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcFonctionnalites','rechercheRcFonctionnalites')"></s:submit>
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
	<s:url id="remoteurl" action="fonctionnaliteGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcFonctionnalites" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editFonctionnaliteLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteFonctionnaliteLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultFonctionnaliteLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeFonction" title="%{getText('listeRcFonctionnalites.rccodefonction')}" />
		    	<sjg:gridColumn name="rcCodeProfil"  title="%{getText('listeRcFonctionnalites.rccodeprofil')}" />
		    	<sjg:gridColumn name="rcLibFonction"  title="%{getText('listeRcFonctionnalites.rclibfonction')}" />
		    	<sjg:gridColumn name="rcDescription"  title="%{getText('listeRcFonctionnalites.rcdescription')}" />
	    </sjg:grid>
	 </div>	
</s:form>