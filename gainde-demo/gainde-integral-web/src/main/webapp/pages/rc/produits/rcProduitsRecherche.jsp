<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
 
	<%@ include
		file="/pages/rc/produits/rcIncludes/produitsRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultProduitLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcProduits.action?pk="+cellvalue+
    "&pageContext=consultationProduits'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteProduitLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcProduits.action?pk="+cellvalue+
         "&pageContext=rechercheProduits'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editProduitLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcProduits.action?pk="+cellvalue+
         "&pageContext=modificationProduits'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
		
		
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcProduits','rechercheProduits')"></s:submit>
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
	<s:url id="remoteurl" action="produitGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcProduits" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editProduitLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteProduitLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultProduitLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodeprod" title="%{getText('listeRcProduits.rcCodeProd')}" />
		    	<sjg:gridColumn name="rcprecuemoa"  title="%{getText('listeRcProduits.rcPrecUemoa')}" />
		    	<sjg:gridColumn name="rcprecsenegal"  title="%{getText('listeRcProduits.rcPrecSenegal')}" />
		    	<sjg:gridColumn name="rcvalchapitre"  title="%{getText('listeRcProduits.rcValChapitre')}" />
		    	<sjg:gridColumn name="rccodeclasse"  title="%{getText('listeRcProduits.rcCodeClasse')}" />
	    </sjg:grid>
	 </div>
	 </s:form>
