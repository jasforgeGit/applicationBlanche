<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/regimedouanier/rcInclude/rcRegimedouanierRechercheInclude.jsp"%>

<script type="text/javascript">
    function consultRegimeDouanierLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcRegimedouanier.action?pk="+cellvalue+
    "&pageContext=consultationRcRegimedouanier'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteRegimeDouanierLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcRegimedouanier.action?pk="+cellvalue+
         "&pageContext=rechercheRcRegimedouanier'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editRegimeDouanierLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcRegimedouanier.action?pk="+cellvalue+
         "&pageContext=modificationRcRegimedouanier'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcRegimedouanier','rechercheRcRegimedouanier')"></s:submit>
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
	<s:url id="remoteurl" action="regimeDouanierGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegimedouanier" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%
	            	if (ctxmenu.equals("SM")) {
	            %>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editRegimeDouanierLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteRegimeDouanierLink" onclick="confirm(hidden_message.value)" />
		    	<%
		    		} else {
		    	%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultRegimeDouanierLink" />
		    	<%
		    		}
		    	%>
		    	<sjg:gridColumn name="rcCodeRegimeDouanier" title="%{getText('listeRcRegimedouanier.rccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcTypeRegime"  title="%{getText('listeRcRegimedouanier.rctyperegime')}" />
		    	<sjg:gridColumn name="rcLibelleRegimeDouanier"  title="%{getText('listeRcRegimedouanier.rclibelleregimedouanier')}" />
	    </sjg:grid>
	 </div>	
	 </s:form>