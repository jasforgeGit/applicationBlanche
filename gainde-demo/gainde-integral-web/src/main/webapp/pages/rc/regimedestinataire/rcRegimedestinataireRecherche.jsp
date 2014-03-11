<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/regimedestinataire/rcInclude/rcRegimedestinataireRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultRegimeDestinataireLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegimedestinataire.action?pk="+cellvalue+
    "&pageContext=consultationRcRegimedestinataire'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegimeDestinataireLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegimedestinataire.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegimedestinataire'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegimeDestinataireLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegimedestinataire.action?pk="+cellvalue+
         "&pageContext=modificationRcRegimedestinataire'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegimedestinataire','rechercheRcRegimedestinataire')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regimeDestinataireGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegimedestinataire" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegimeDestinataireLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegimeDestinataireLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegimeDestinataireLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodePpm" title="%{getText('listeRcRegimedestinataire.rccodeppm')}" />
		    	<sjg:gridColumn name="rcCodeRegimeDouanier"  title="%{getText('listeRcRegimedestinataire.rccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('listeRcRegimedestinataire.rccoderegimefiscal')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcRegimedestinataire.rctyperegime')}" />
	    </sjg:grid>
	 </div>	
</s:form>