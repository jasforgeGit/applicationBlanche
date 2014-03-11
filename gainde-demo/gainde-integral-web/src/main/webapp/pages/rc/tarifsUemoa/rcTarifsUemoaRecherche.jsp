<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/tarifsUemoa/rcInclude/rcTarifsUemoaRechercheInclude.jsp"%>
<script type="text/javascript">
    function consultAgrementEntrepriseLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcTarifsUemoa.action?pk="+cellvalue+
    "&pageContext=consultationRcTarifsUemoa'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteAgrementEntrepriseLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcTarifsUemoa.action?pk="+cellvalue+
         "&pageContext=rechercheRcTarifsUemoa'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editAgrementEntrepriseLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcTarifsUemoa.action?pk="+cellvalue+
         "&pageContext=modificationRcTarifsUemoa'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>		
		
	<div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRcTarifsUemoa','rechercheRcTarifsUemoa')"></s:submit>
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
	<s:url id="remoteurl" action="agrementEntrepriseGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcAgrementEntrprise" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editAgrementEntrepriseLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteAgrementEntrepriseLink"  />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultAgrementEntrepriseLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcAgrent" title="%{getText('RcAgrementEntrepriseFB.TNUM_RCAGRENT_OB')}" />
		    	<sjg:gridColumn name="rcRgrPays"  title="%{getText('RcAgrementEntrepriseFB.TNUM_RCRGRPAYS_OB')}" />
		    	<sjg:gridColumn name="rcCodPays"  title="%{getText('RcAgrementEntrepriseFB.TNUM_RCCODPAYS_OB')}" />
		    	<sjg:gridColumn name="rcrSocialeCent" title="%{getText('RcAgrementEntrepriseFB.TNUM_RCRSOCIALECENT')}" />
		    	<sjg:gridColumn name="rcAdresseEnt"  title="%{getText('RcAgrementEntrepriseFB.TNUM_RCADRESSEENT')}" />
		    	<sjg:gridColumn name="rcDateAgrement"  title="%{getText('RcAgrementEntrepriseFB.DAT_RCDATEAGREMENT')}" />
		    	<sjg:gridColumn name="rcDatCloture"  title="%{getText('RcAgrementEntrepriseFB.DAT_RCDATCLOTURE')}" />
	    </sjg:grid>
	 </div>	
	 <s:hidden name="hidden" id="hidden"></s:hidden>	
</s:form>