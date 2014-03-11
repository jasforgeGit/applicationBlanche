<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/regroupement/rcInclude/rcRegroupementRechercheInclude.jsp"%>

	<script type="text/javascript">
    function consultRegroupementLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegroupement.action?pk="+cellvalue+
    "&pageContext=consultationRcRegroupement'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegroupementLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegroupement.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegroupement'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegroupementLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegroupement.action?pk="+cellvalue+
         "&pageContext=modificationRcRegroupement'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegroupement','rechercheRcRegroupement')"></s:submit>
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
	<s:url id="remoteurl" action="regroupementGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegroupement" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegroupementLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegroupementLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegroupementLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rcCodeRegroup" title="%{getText('listeRcRegroupement.rccoderegroup')}" />
		    	<sjg:gridColumn name="rcLibelleRegroup"  title="%{getText('listeRcRegroupement.rclibelleregroup')}" />
	    </sjg:grid>
	 </div>		
</s:form>