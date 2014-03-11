<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/soumissiondoc/rcInclude/rcSoumissiondocRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultSoumissionDocLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcSoumissiondoc.action?pk="+cellvalue+
    "&pageContext=consultationRcSoumissiondoc'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteSoumissionDocLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcSoumissiondoc.action?pk="+cellvalue+
         "&pageContext=rechercheRcSoumissiondoc'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editSoumissionDocLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcSoumissiondoc.action?pk="+cellvalue+
         "&pageContext=modificationRcSoumissiondoc'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcSoumissiondoc','rechercheRcSoumissiondoc')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",
						request.getLocale())%>" />


<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="soumissionDocGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcSoumissiondoc" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editSoumissionDocLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteSoumissionDocLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultSoumissionDocLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rccodesoumdoc" title="%{getText('listeRcSoumissiondoc.rccodesoumdoc')}" />
		    	<sjg:gridColumn name="rccodepiecejointe"  title="%{getText('listeRcSoumissiondoc.rccodepiecejointe')}" />
		    	<sjg:gridColumn name="rclibellesoumdoc"  title="%{getText('listeRcSoumissiondoc.rclibellesoumdoc')}" />
	    </sjg:grid>
	 </div>	
</s:form>