<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/indicateurregime/rcInclude/rcIndicateurregimeRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultIndicateurRegimeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcIndicateurregime.action?pk="+cellvalue+
    "&pageContext=consultationRcIndicateurregime'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteIndicateurRegimeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcIndicateurregime.action?pk="+cellvalue+
         "&pageContext=rechercheRcIndicateurregime'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editIndicateurRegimeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcIndicateurregime.action?pk="+cellvalue+
         "&pageContext=modificationRcIndicateurregime'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcIndicateurregime','rechercheRcIndicateurregime')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>
    <s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="indicateurRegimeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcIndicateurregime" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editIndicateurRegimeLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteIndicateurRegimeLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultIndicateurRegimeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeIndicateur" title="%{getText('listeRcIndicateurregime.rccodeindicateur')}" />
		    	<sjg:gridColumn name="rcCodeRegimeDouanier"  title="%{getText('listeRcIndicateurregime.rccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('listeRcIndicateurregime.rccoderegimefiscal')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcIndicateurregime.rctyperegime')}" />
		    	<sjg:gridColumn name="rcDateValidite" formatter="date" title="%{getText('listeRcIndicateurregime.rcdatevalidite')}" />
	    </sjg:grid>
	 </div>	
</s:form>
