<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/consignataires/rcInclude/rcConsignatairesRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultConsignataireLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcConsignataires.action?pk="+cellvalue+
    "&pageContext=consultationRcConsignataires'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteConsignataireLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcConsignataires.action?pk="+cellvalue+
         "&pageContext=rechercheRcConsignataires'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editConsignataireLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcConsignataires.action?pk="+cellvalue+
         "&pageContext=modificationRcConsignataires'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcConsignataires','rechercheRcConsignataires')"></s:submit>
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
	<s:url id="remoteurl" action="consignataireGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcConsignataires" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editConsignataireLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deleteConsignataireLink" onclick="confirm(hidden_message.value)" />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="consultConsignataireLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeConsignataire" title="%{getText('listeRcConsignataires.rccodeconsignataire')}" />
		    	<sjg:gridColumn name="rcCodePpm"  title="%{getText('listeRcConsignataires.rccodeppm')}" />
		    	<sjg:gridColumn name="rcDateCreationConsig" formatter="date" title="%{getText('listeRcConsignataires.rcdatecreationconsig')}" />
		    	<sjg:gridColumn name="rcDateSuspension" formatter="date"  title="%{getText('listeRcConsignataires.rcdatesuspension')}" />
	    </sjg:grid>
	 </div>
</s:form>