<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:form method="post" theme="simple">
<%
	//Récupération de la clé
		String pk = request.getParameter(sn.com.douane.utils.ConstManif.PK);
System.out.println("jsp 1 : "+pk);
		String [] pkTab = pk.split(sn.com.douane.utils.ConstManif.TIELD);
		
		//Récupération des critères saisis
		String rccoderegimedouanier = pkTab[0]+pkTab[1];
		String rccoderegimefiscal = pkTab[2];
%>
<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="ConsultationTables.RegimesApurants" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationTables.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="rccoderegimedouanier" readonly="true"
				id="rccoderegimedouanier" maxlength="1" 
				cssClass="input100" /></td>
		<td style="width: 60%;"></td>
		</tr>
		<tr>
		<th><s:text name="ConsultationTables.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="rccoderegimefiscal" id="rccoderegimefiscal"
				maxlength="2" readonly="true" cssClass="input100" /></td>
		<td style="width: 60%;"></td>
	</tr>
</table>
<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrl('returnPrecedent','rechercheRegime')"></s:submit></td>
		</tr>
	</table>
</div>

	<input type="hidden" name="pkSelected">
	<input type="hidden" name="hidden">



	<table class="FORM2" style="width: 100%; margin-top: 5px;">
		<tr>
			<th class="FORM2"><s:text name="ConsultationTables.Listerccoderegimedouanier" /></th>
			<th class="FORM2"><s:text name="ConsultationTables.Listerccoderegimefiscal" /></th>
			<th class="FORM2"><s:text name="ConsultationTables.Listerclibelleregime" /></th>
		</tr>
	
		<s:iterator value="listeRcRegime">
			<tr>
					<td class="FORM3"><s:property value="typeRegimeCodeDouanier" /></td>
					<td class="FORM3"><s:property value="rcCodeRegimeFiscal" /></td>
					<td class="FORM3"><s:property value="rcLibelleRegime" /></td>
			</tr>
		</s:iterator>
	</table>	


<!-- 	<div style="float:left; margin-top:5px; margin-down:10px;"> -->
<%-- 	<s:url id="remoteurl" action="regimeApurementGrid"/> --%>
<%-- 	    <sjg:grid  --%>
<%-- 	        id="gridtable"  --%>
<%-- 	        dataType="json" --%>
<%-- 	        href="%{remoteurl}" --%>
<%-- 	        pager="true"  --%>
<%-- 	        rowNum="5" --%>
<%-- 	        rowList="5,10,15" --%>
<%-- 	        gridModel="listeRcRegime" sortable="true" --%>
<%-- 	        onSelectRowTopics="rowselect" --%>
<%-- 	        width="800"> --%>
<%-- 	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/> --%>
<%-- 		    	<sjg:gridColumn name="typeRegimeCodeDouanier" title="%{getText('ConsultationTables.Listerccoderegimedouanier')}" /> --%>
<%-- 		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('ConsultationTables.Listerccoderegimefiscal')}" /> --%>
<%-- 		    	<sjg:gridColumn name="rcLibelleRegime"  title="%{getText('ConsultationTables.Listerclibelleregime')}" /> --%>
<%-- 	    </sjg:grid> --%>
<!-- 	 </div> -->
</s:form>
