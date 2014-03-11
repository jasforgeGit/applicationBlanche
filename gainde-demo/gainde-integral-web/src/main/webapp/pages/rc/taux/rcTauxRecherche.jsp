<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(
			sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/taux/rcInclude/rcTauxRechercheInclude.jsp"%>
	<script type="text/javascript">
    function consultTauxLink(cellvalue, options, rowObject) {
        return "<a href='afficherRcTaux.action?pk="+cellvalue+
        "&pageContext=consultationRcTaux'><img src='config/edit1.jpg' border='0' /></a>";
    }
	function deleteTauxLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcTaux.action?pk="+cellvalue+
         "&pageContext=rechercheRcTaux'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editTauxLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcTaux.action?pk="+cellvalue+
         "&pageContext=modificationRcTaux'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcTaux','rechercheRcTaux')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	<s:hidden name="hidden" id="hidden"></s:hidden>
	</div>
	<input type="hidden" name="etat">
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties(
						"message.confirmDelete", request.getLocale())%>" />
	<br/>
	<br/>
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="tauxRcGrid"/>
	    <sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcTaux" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editTauxLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteTauxLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultTauxLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeTaux" title="%{getText('listeRcTaux.rccodetaux')}" />
		    	<sjg:gridColumn name="rcCodeTaxe"  title="%{getText('listeRcTaux.rccodetaxe')}" />
		    	<sjg:gridColumn name="rcDateValeur"  title="%{getText('listeRcTaux.rcdatevaleur')}" />
		    	<sjg:gridColumn name="libelleTaux"  title="%{getText('listeRcTaux.libelletaux')}" />
	    </sjg:grid>
	 </div>
</s:form>