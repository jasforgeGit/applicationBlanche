<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/produitspjt/rcInclude/rcProduitspjtRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultProduitPjtLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcProduitspjt.action?pk="+cellvalue+
    "&pageContext=consultationRcProduitspjt'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteProduitPjtLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcProduitspjt.action?pk="+cellvalue+
         "&pageContext=rechercheRcProduitspjt'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editProduitPjtLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcProduitspjt.action?pk="+cellvalue+
         "&pageContext=modificationRcProduitspjt'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcProduitspjt','rechercheRcProduitspjt')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="produitPjtGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcProduitspjt" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editProduitPjtLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteProduitPjtLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultProduitPjtLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodepiecejointe" title="%{getText('listeRcProduitspjt.rccodepiecejointe')}" />
		    	<sjg:gridColumn name="rccodeproduit"  title="%{getText('listeRcProduitspjt.rccodeproduit')}" />
		    	<sjg:gridColumn name="rcprecsenprod"  title="%{getText('listeRcProduitspjt.rcprecsenprod')}" />
		    	<sjg:gridColumn name="rcprecuemoaprod"  title="%{getText('listeRcProduitspjt.rcprecuemoaprod')}" />
		    	<sjg:gridColumn name="datepiecejointe"  title="%{getText('listeRcProduitspjt.rcdatepiecejointe')}" />
	    </sjg:grid>
	 </div>	
</s:form>