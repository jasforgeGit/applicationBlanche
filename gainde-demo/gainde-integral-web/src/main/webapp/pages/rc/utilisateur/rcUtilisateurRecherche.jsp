<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>

<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/utilisateur/rcInclude/rcUtilisateurRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultUtilisateurLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcUtilisateur.action?pk="+cellvalue+
    "&pageContext=consultationRcUtilisateur'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteUtilisateurLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcUtilisateur.action?pk="+cellvalue+
         "&pageContext=rechercheRcUtilisateur'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editUtilisateurLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcUtilisateur.action?pk="+cellvalue+
         "&pageContext=modificationRcUtilisateur'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcUtilisateur','rechercheRcUtilisateur')"></s:submit>
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
	<s:url id="remoteurl" action="utilisateurGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcUtilisateur" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editUtilisateurLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteUtilisateurLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultUtilisateurLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccoduser" title="%{getText('listeRcUtilisateur.rccoduser')}" />
		    	<sjg:gridColumn name="rccodeprofil"  title="%{getText('listeRcUtilisateur.rccodeprofil')}" />
		    	<sjg:gridColumn name="rctypeuser"  title="%{getText('listeRcUtilisateur.rcidentification')}" />
		    	<sjg:gridColumn name="rcidentification"  title="%{getText('listeRcUtilisateur.rctypeuser')}" />
	    </sjg:grid>
	 </div>	
</s:form>