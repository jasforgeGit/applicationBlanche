<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/regime/rcInclude/rcRegimeRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultRegimeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegime.action?pk="+cellvalue+
    "&pageContext=consultationRcRegime'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegimeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegime.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegime'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegimeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegime.action?pk="+cellvalue+
         "&pageContext=modificationRcRegime'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegime','rechercheRcRegime')"></s:submit>
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
	<s:url id="remoteurl" action="regimeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegime" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegimeLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegimeLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegimeLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rcCodeRegimeDouanier" title="%{getText('listeRcRegime.rccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('listeRcRegime.rccoderegimefiscal')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcRegime.rctyperegime')}" />
		    	<sjg:gridColumn name="rcLibelleRegime"  title="%{getText('listeRcRegime.rclibelleregime')}" />
	    </sjg:grid>
	 </div>	
</s:form>