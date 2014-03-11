<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/profil/rcInclude/rcProfilRechercheInclude.jsp"%>
	<script type="text/javascript">
    function consultProfilLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcProfil.action?pk="+cellvalue+
    "&pageContext=consultationRcProfil'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteProfilLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcProfil.action?pk="+cellvalue+
         "&pageContext=rechercheRcProfil'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editProfilLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcProfil.action?pk="+cellvalue+
         "&pageContext=modificationRcProfil'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcProfil','rechercheRcProfil')"></s:submit>
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
	<s:url id="remoteurl" action="profilGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcProfil" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editProfilLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteProfilLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultProfilLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeProfil" title="%{getText('listeRcProfil.rclibprofil')}" />
		    	<sjg:gridColumn name="rcLibelleProfil"  title="%{getText('listeRcProfil.rccodeprofil')}" />
	    </sjg:grid>
	 </div>	
</s:form>