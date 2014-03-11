<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/creditaires/rcInclude/rcCreditairesRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultCreditaireLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcCreditaires.action?pk="+cellvalue+
    "&pageContext=consultationRcCreditaires'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteCreditaireLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcCreditaires.action?pk="+cellvalue+
         "&pageContext=rechercheRcCreditaires'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editCreditaireLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcCreditaires.action?pk="+cellvalue+
         "&pageContext=modificationRcCreditaires'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcCreditaires','rechercheRcCreditaires')"></s:submit>
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
	<s:url id="remoteurl" action="creditaireGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcCreditaires" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editCreditaireLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteCreditaireLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultCreditaireLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeCreditaire" title="%{getText('listeRcCreditaires.rccodecreditaire')}" />
		    	<sjg:gridColumn name="rcCodePpm"  title="%{getText('listeRcCreditaires.rccodeppm')}" />
		    	<sjg:gridColumn name="rcDateCredit" formatter="date"  title="%{getText('listeRcCreditaires.rcdatecredit')}" />
		    	<sjg:gridColumn name="rcDateExtension" formatter="date" title="%{getText('listeRcCreditaires.rcdateextension')}" />
		    	<sjg:gridColumn name="rcDateRetrait" formatter="date" title="%{getText('listeRcCreditaires.rcdateretrait')}" />
		    	<sjg:gridColumn name="rcDateSuspension" formatter="date" title="%{getText('listeRcCreditaires.rcdatesuspension')}" />
	    </sjg:grid>
	 </div>
</s:form>