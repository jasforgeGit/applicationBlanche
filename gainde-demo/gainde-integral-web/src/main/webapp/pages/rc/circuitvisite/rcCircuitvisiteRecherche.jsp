<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%  
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>

<s:form method="post" theme="simple" onsubmit="return (false)">

	<%@ include	file="/pages/rc/circuitvisite/rcInclude/rcCircuitvisiteRechercheInclude.jsp" %>
<script type="text/javascript">
    function deleteCircuitVisiteLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcCircuitvisite.action?pk="+cellvalue+
         "&pageContext=rechercheRcCircuitvisite'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editCircuitVisiteLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcCircuitvisite.action?pk="+cellvalue+
         "&pageContext=modificationRcCircuitvisite'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>

<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcCircuitvisite','rechercheRcCircuitvisite')"></s:submit>
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
	<s:url id="remoteurl" action="circuitVisiteGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcCircuitvisite" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editCircuitVisiteLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteCircuitVisiteLink" onclick="confirm(hidden_message.value)" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodecircuit" title="%{getText('listeRcCircuitvisite.rccodecircuit')}" />
		    	<sjg:gridColumn name="rcdescircuitvisite"  title="%{getText('listeRcCircuitvisite.rcdescircuitvisite')}" />
	    </sjg:grid>
	 </div>
</s:form>

