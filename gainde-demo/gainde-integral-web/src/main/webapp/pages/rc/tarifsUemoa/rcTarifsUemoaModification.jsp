<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<% 
  	
  		String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);

%>
<s:form method="post" theme="simple">
	<%@ include file="/pages/rc/tarifsUemoa/rcInclude/rcTarifsUemoaModificationInclude.jsp"%>
<script type="text/javascript">
    function consultAgrementRgrpPodLink(cellvalue, options, rowObject) {
    return "<a href='afficherRcTarifsUemoa.action?pk="+cellvalue+
    "&pageContext=consultationRcTarifsUemoa'><img src='config/edit1.jpg' border='0' /></a>";
}
    function deleteAgrementRgrpPodLink(cellvalue, options, rowObject) {
         return "<a href='supprimerRcAgrementProduit.action?pk="+cellvalue+
         "&pageContext=modificationRcTarifsUemoa'><img src='config/delete.jpg' border='0' onclick='if(!confirm(hidden_message.value))return false;'/></a>";
    }
    function editAgrementRgrpPodLink(cellvalue, options, rowObject) {
         return "<a href='afficherRcAgrementProduit.action?pk="+cellvalue+
         "&pageContext=modificationRcProduitsUemoa'><img src='config/edit1.jpg' border='0' /></a>";
    }
</script>	

        <input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />
	
	<br/>
	<br/>
	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="agrementRgrpPodGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcAgrementRgrprpod" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
	            <%if (ctxmenu.equals("SM")) {%>
		    	<sjg:gridColumn name="editCell" title=" " formatter="editAgrementRgrpPodLink" width="25" />
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="deleteAgrementRgrpPodLink"  />
		    	<% }else {%>
		    	<sjg:gridColumn name="delCell" title=" " width="25" formatter="consultAgrementRgrpPodLink" />
		    	<%}%>
		    	<sjg:gridColumn name="rcCodeProd" title="%{getText('RcAgrementEntrepriseFB.TNUM_RCCODEPROD_OB')}" />
		    	<sjg:gridColumn name="rcPrecUemoaProd"  title="%{getText('RcAgrementEntrepriseFB.TNUM_RCPRECUEMOAPROD_OB')}" />
		    	<sjg:gridColumn name="rcPrecSenProd"  title="%{getText('RcAgrementEntrepriseFB.TNUM_RCPRECSENPROD_OB')}" />
		    	<sjg:gridColumn name="libelle" title="%{getText('RcAgrementEntrepriseFB.LIBELLEPRODUIT')}" />
	    </sjg:grid>
	 </div>		
</s:form>