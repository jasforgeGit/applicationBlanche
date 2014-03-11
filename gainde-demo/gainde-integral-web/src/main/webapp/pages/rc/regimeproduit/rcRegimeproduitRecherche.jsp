<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/regimeproduit/rcInclude/rcRegimeproduitRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultRegimeProduitLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegimeproduit.action?pk="+cellvalue+
    "&pageContext=consultationRcRegimeproduit'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegimeProduitLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegimeproduit.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegimeproduit'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegimeProduitLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegimeproduit.action?pk="+cellvalue+
         "&pageContext=modificationRcRegimeproduit'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegimeproduit','rechercheRcRegimeproduit')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />


<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regimeProduitGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegimeproduit" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegimeProduitLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteRegimeProduitLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultRegimeProduitLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeProd" title="%{getText('listeRcRegimeproduit.rccodeprod')}" />
		    	<sjg:gridColumn name="rcCodeRegimeDouanier" width="250" title="%{getText('listeRcRegimeproduit.rccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('listeRcRegimeproduit.rccoderegimefiscal')}" />
		    	<sjg:gridColumn name="rcPrecSenegal" title="%{getText('listeRcRegimeproduit.rcprecsenegal')}" />
		    	<sjg:gridColumn name="rcPrecuemoa"  title="%{getText('listeRcRegimeproduit.rcprecuemoa')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcRegimeproduit.rctyperegime')}" />
	    </sjg:grid>
	 </div>	
</s:form>
