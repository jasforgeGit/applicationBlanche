<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%
		String onClick = "if (controleRadio('pk')) lister('afficherHistorique','consultationHistorique');"
				+ "else alert ('"
				+ tn.com.tw.java.exception.ConstErrCodRC.radioNotSelected
				+ "');";
%>
<s:form method="post" theme="simple">

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="ConsultationDevises.RechercheDevises" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationDevises.TNUM_RCCODEDEVISERech" /></th>
		<td><s:textfield name="numRcCodeDeviseRech"
				id="TNUM_RCCODEDEVISERech" maxlength="3" cssClass="input100" cssStyle="float: left;"/></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="ConsultationDevises.TNUM_RCLIBELLEDEVISERech" /></th>
		<td><s:textfield name="numRcLibelleDeviseRech"
				id="TNUM_RCLIBELLEDEVISERech" maxlength="100" cssClass="input400" /></td>
        <td style="width: 60%;"></td>
	</tr>
</table>

<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherDevises','rechercheDevises')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit>
				<s:submit key="button.ListeHistorique" cssClass="buttonBar" cssStyle="width: 200px;"
					onclick="alert('Fonctionnalité non disponible.');return false;"></s:submit></td>
		</tr>
	</table>
</div>
<s:hidden name="pkSelected" id="pkSelected"></s:hidden>
	
		<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="deviseGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeDevises" sortable="true"
	        width="800">
	          <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
		    	<sjg:gridColumn name="rccodedevise" title="%{getText('listeDevises.rccodedevise')}" />
		    	<sjg:gridColumn name="rclibelledevise"  title="%{getText('listeDevises.rclibelledevise')}" />
		    	<sjg:gridColumn name="rcdatedevise1"  title="%{getText('listeDevises.rcdatedevise')}" />
		    	<sjg:gridColumn name="rcqtedevise"  title="%{getText('listeDevises.rcqtedevise')}" />
		    	<sjg:gridColumn name="rcqtecfa"  title="%{getText('listeDevises.rcqtecfa')}" />
		    	<sjg:gridColumn name="rcprecisiondev"  title="%{getText('listeDevises.rcprecisiondev')}" />
		    	<sjg:gridColumn name="rccoefficient"  title="%{getText('listeDevises.rccoefficient')}" />
	    </sjg:grid>
	 </div>
</s:form>
