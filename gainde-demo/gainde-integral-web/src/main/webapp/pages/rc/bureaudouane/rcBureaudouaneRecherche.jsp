<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(
			sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/bureaudouane/rcInclude/rcBureaudouaneRechercheInclude.jsp"%>
		<script type="text/javascript">
    function editBurDouaneSMLink(cellvalue, options, rowObject) {
    	return "<a href='afficherRcBureaudouane?pk="+cellvalue+
    		"&pageContext=modificationRcBureaudouane'><img src='config/edit1.jpg' border='0' /></a>";
    }
    
    function editBurDouaneCLink(cellvalue, options, rowObject) {
        return "<a href='afficherRcBureaudouane?pk="+cellvalue+
        	"&pageContext=consultationRcBureaudouane'><img src='config/edit1.jpg' border='0' /></a>";
    }
    
    function deleteBurDouaneCLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcBureaudouane?pk="+cellvalue+
            "&pageContext=rechercheRcBureaudouane' onclick='return confirm(hidden_message.value)'><img src='config/delete.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.search"
						onclick="doSubmit2('rechercherRcBureaudouane','rechercheRcBureaudouane')">
					</s:submit></td>
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="doReturn()">
					</s:submit></td>
			</tr>
		</table>
	</div>

	<input type="hidden" name="hidden">
	<s:hidden name="etat" />
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties(
						"message.confirmDelete", request.getLocale())%>" />


	<div style="float: left; margin-top: 5px; margin-down: 10px;">
		<s:url id="remoteurl" action="bureauDouaneGrid" />
		<sjg:grid id="gridtable" dataType="json" href="%{remoteurl}"
			pager="true" rowNum="5" rowList="5,10,15" gridModel="listRcBurDouane"
			sortable="true" width="800">
			<sjg:gridColumn name="pk" title="pk" key="true" hidden="true" />
			<%
				if (ctxmenu.equals("SM")) {
			%>
			<sjg:gridColumn name="editCellSM" title=" " width="16"
				formatter="editBurDouaneSMLink" />
			<sjg:gridColumn name="deleteCell" title=" " width="16"
				formatter="deleteBurDouaneCLink" />
			<%
				}
				if (ctxmenu.equals("C")) {
			%>
			<sjg:gridColumn name="editCellC" title=" " width="16"
				formatter="editBurDouaneCLink" />
			<%
				}
			%>
			<sjg:gridColumn name="rccodeburdouane"
				title="%{getText('listeRcBureaudouane.rccodeburdouane')}" />
			<sjg:gridColumn name="libCompBureau"
				title="%{getText('listeRcBureaudouane.rccompetence')}" />
			<sjg:gridColumn name="libGenreBureau"
				title="%{getText('listeRcBureaudouane.rcgenrebur')}" />
			<sjg:gridColumn name="rclibelleburdouane"
				title="%{getText('listeRcBureaudouane.rclibelleburdouane')}" />
			<sjg:gridColumn name="libTypeBureau"
				title="%{getText('listeRcBureaudouane.rctypeburdouane')}" />
		</sjg:grid>
	</div>


</s:form>
