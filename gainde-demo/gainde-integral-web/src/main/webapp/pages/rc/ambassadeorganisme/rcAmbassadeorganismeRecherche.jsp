<%@taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/ambassadeorganisme/rcInclude/rcAmbassadeorganismeRechercheInclude.jsp"%>
	<script type="text/javascript">
    function consultAmbassadeLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcAmbassadeorganisme.action?pk="+cellvalue+
    "&pageContext=consultationRcAmbassadeorganisme'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteAmbassadeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcAmbassadeorganisme.action?pk="+cellvalue+
         "&pageContext=rechercheRcAmbassadeorganisme'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editAmbassadeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcAmbassadeorganisme.action?pk="+cellvalue+
         "&pageContext=modificationRcAmbassadeorganisme'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcAmbassadeorganisme','rechercheRcAmbassadeorganisme')"></s:submit>
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
	<s:url id="remoteurl" action="ambassadeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcAmbassadeorganisme" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editAmbassadeLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteAmbassadeLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultAmbassadeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcNumRegimePref" title="%{getText('listeRcAmbassadeorganisme.rcnumregimepref')}" />
		    	<sjg:gridColumn name="rcCodePpm"  title="%{getText('listeRcAmbassadeorganisme.rccodeppm')}" />
		    	<sjg:gridColumn name="rcNatRegimePref"  title="%{getText('listeRcAmbassadeorganisme.rcnatregimepref')}" />
	            <sjg:gridColumn name="rcDateRegimePref" formatter="date" title="%{getText('listeRcAmbassadeorganisme.rcdateregimepref')}" />
	    </sjg:grid>
	 </div>	
</s:form>
