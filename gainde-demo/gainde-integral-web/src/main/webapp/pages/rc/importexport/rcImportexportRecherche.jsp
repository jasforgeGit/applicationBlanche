<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
    String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
<%@ include file="/pages/rc/importexport/rcInclude/rcImportexportRechercheInclude.jsp"%>
	<script type="text/javascript">
    function consultImportExportLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcImportexport.action?pk="+cellvalue+
    "&pageContext=consultationRcImportexport'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteImportExportLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcImportexport.action?pk="+cellvalue+
         "&pageContext=rechercheRcImportexport'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editImportExportLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcImportexport.action?pk="+cellvalue+
         "&pageContext=modificationRcImportexport'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcImportexport','rechercheRcImportexport')"></s:submit>
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
	<s:url id="remoteurl" action="importExportGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcImportexport" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editImportExportLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteImportExportLink" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultImportExportLink" />
		    	<%}%>
		    	<sjg:gridColumn width="160" name="rcNumImportExport" title="%{getText('listeRcImportexport.rcnumimportexport')}" />
		    	<sjg:gridColumn width="80" name="rcCodePpm"  title="%{getText('listeRcImportexport.rccodeppm')}" />
		    	<sjg:gridColumn width="80" name="rcDateCarte" title="%{getText('listeRcImportexport.rcdatecarte')}" />
		    	<sjg:gridColumn width="120" name="rcDateRetraitCredit"  title="%{getText('listeRcImportexport.rcdateretraitcredit')}" />
		    	<sjg:gridColumn width="120" name="rcDateSuspension" title="%{getText('listeRcImportexport.rcdatesuspension')}" />
		    	<sjg:gridColumn width="140" name="rcNineaImpExp"  title="%{getText('listeRcImportexport.rcnineaimpexp')}" />
		    	<sjg:gridColumn width="200" name="rcNumCarteImpExp"  title="%{getText('listeRcImportexport.rcnumcarteimpexp')}" />
	    </sjg:grid>
	 </div>	
</s:form>