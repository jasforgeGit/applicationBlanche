<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(
			sn.com.douane.utils.ConstManif.CTXMENU);

%>
<s:form method="post"  theme="simple">
<%@ include
		file="/pages/rc/genrebureau/rcInclude/rcGenrebureauRechercheInclude.jsp"%>
				
<script type="text/javascript">
    function consultGenrebureauLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcGenrebureau.action?pk="+cellvalue+
    "&pageContext=consultationRcGenrebureau'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteGenrebureauLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcGenrebureau.action?pk="+cellvalue+
         "&pageContext=rechercheRcGenrebureau'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editGenrebureauLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcGenrebureau.action?pk="+cellvalue+
         "&pageContext=modificationRcGenrebureau'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcGenrebureau','rechercheRcGenrebureau')"></s:submit>
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
		<s:url id="remoteurl" action="genreBureauGrid" />
		 <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcGenrebureau" sortable="true"
	        width="800">
 	<sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editGenrebureauLink" width="40" />
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="deleteGenrebureauLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="40" formatter="consultGenrebureauLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcgenrebureau" title="%{getText('listeRcGenrebureau.rcgenrebureau')}" />
		    	<sjg:gridColumn name="rcdesgenrebureau"  title="%{getText('listeRcGenrebureau.rcdesgenrebureau')}" />
	    </sjg:grid>
	 </div>		        
</s:form>
