<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%
		String ctxmenu = (String) request.getSession().getAttribute(
				sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/piecesjointes/rcInclude/rcPiecesjointesRechercheInclude.jsp"%>
<script type="text/javascript">
    function deletePieceJointeLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcPieceJointe.action?pk="+cellvalue+
         "&pageContext=rechercheRcPiecesJointes'><img src='config/delete.jpg' border='0' onclick='confirm(hidden_message.value)'/></a>";
    }
    function editPieceJointeLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcPieceJointe.action?pk="+cellvalue+
         "&pageContext=modificationRcPiecesJointes'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit2('rechercherRcPiecesJointes','rechercheRcPiecesjointes')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
    </div>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />
	<br/>
	<br/>
<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="PieceJointeGrid" />
	<sjg:grid
	        id="gridtable"
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcPieceJointe" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editPieceJointeLink" width="10" />
		    	<sjg:gridColumn name="delCell" title=" " width="10" formatter="deletePieceJointeLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rccodepiecejointe" title="%{getText('listeRcPiecesjointes.rccodepiecejointe')}" />
		    	<sjg:gridColumn name="rcnaturepiecejointe"  title="%{getText('listeRcPiecesjointes.rcnaturepiecejointe')}" />
		    	<sjg:gridColumn name="rcdatepiecejointe1" title="%{getText('listeRcPiecesjointes.rcdatepiecejointe')}" />
		    	<sjg:gridColumn name="rcdespiecejointe"  title="%{getText('listeRcPiecesjointes.rcdespiecejointe')}" />
	    </sjg:grid>
	 </div>
</s:form>


