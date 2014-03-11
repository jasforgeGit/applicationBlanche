<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%  
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>

<s:form method="post" theme="simple" onsubmit="return (false)">

	<%@ include	file="/pages/rc/compagnieAssistee/rcInclude/rcCompagnieassisteeRechercheInclude.jsp" %>
<script type="text/javascript">
    function deleteCompagnieAssisteeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcCompagnieassistee.action?pk="+cellvalue+
         "&pageContext=rechercheRcCompagnieassistee'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editCompagnieAssisteeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcCompagnieassistee.action?pk="+cellvalue+
         "&pageContext=modificationRcCompagnieassistee'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>

<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcCompagnieassistee','rechercheRcCompagnieassistee')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	</div>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />
	
	 <br/>
	<br/>
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="compagnieAssisteeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcCompagnieAssistee" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editCompagnieAssisteeLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteCompagnieAssisteeLink" onclick="confirm(hidden_message.value)" />
		    	<%}%>
		    	<sjg:gridColumn name="codeCieAssistee" title="%{getText('listeRcCompagnieassistee.codecieassistee')}" />
		    	<sjg:gridColumn name="nomCieAssistee"  title="%{getText('listeRcCompagnieassistee.nomcieassistee')}" />
	    </sjg:grid>
	 </div>
</s:form>
