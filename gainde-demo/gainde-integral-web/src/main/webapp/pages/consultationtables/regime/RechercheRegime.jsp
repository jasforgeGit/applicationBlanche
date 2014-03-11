<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<s:form method="post" theme="simple">

<script type="text/javascript">
	function choixPk(){
	
		var frm = document.forms.item(0);
		var selectedRadio = '';
		
		for (var i=0; i<frm.length; i++) {
			if (frm.elements[i].name == 'pk' && frm.elements[i].checked == true) {
				selectedRadio = frm.elements[i].value;
				i = frm.length;
			}
		}
		frm.pkSelected.value = selectedRadio;
	}
	function controleCaseCocher(boutonClick){	
 
		var frm = document.forms.item(0);
		var action='';

		if (frm.pkSelected.value != '') {
			if(boutonClick=='Apurement')
				action= "apurementRegime?pageContext=apurementRegime";
			else
				if(boutonClick=='Informations générales')
					action= "informationsRegime?pageContext=consultationRegime";
				else
					action= "bureauxAutorisesRegime?pageContext=bureauxAutorisesRegime";
				
			frm.action = action;
			frm.submit();			
		}else{
			alert("Selectionnez un régime!");
		}
	}
	
	function nonRealise(){
		alert("Fonctionnalité non disponible");
		}
	
	$.subscribe('rowselect', function(event, data) {
		 document.forms.item(0).pk.value=event.originalEvent.id;
		 document.forms.item(0).pkSelected.value=event.originalEvent.id;});
</script>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="ConsultationTables.RechercheRegime" /></th>
	</tr>
	<tr>
		<th><s:text name="ConsultationTables.TNUM_LIST_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeDounierRech" onkeyup="f9_RegimeDouanier(this, event)"
				id="TNUM_LIST_RCCODEREGIMEDOUANIERRech" maxlength="2" cssClass="input200" /></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="ConsultationTables.TNUM_LIST_RCCODEREGIMEFISCALRech" /></th>
		<td><s:textfield name="numListRcCodeRegimeFiscalRech" onkeyup="f9_RegimeFiscal1(this, event)"
				id="TNUM_LIST_RCCODEREGIMEFISCALRech" maxlength="2" cssClass="input200" /></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="ConsultationTables.TNUM_RCLIBELLEREGIMERech" /></th>
		<td><s:textfield name="numRcLibelleRegimeRech" 
				id="TNUM_RCLIBELLEREGIMERech" maxlength="250" cssClass="input200" /></td>
        <td style="width: 60%;"></td>
	</tr>
</table>


<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar" 
					onclick="doSubmit2('rechercherRegime','rechercheRegime')"></s:submit>
				<s:submit key="button.regimeInformations" cssClass="buttonBar"  cssStyle="width: 170px;"
					onclick="nonRealise()"></s:submit>
				<s:submit key="button.regimeBureauxAutorises" cssClass="buttonBar" cssStyle="width: 150px;"
					onclick="nonRealise()"></s:submit>
				<s:submit key="button.regimeApurement" cssClass="buttonBar" 
					onclick="controleCaseCocher(this.value)"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>

<s:hidden name="pkSelected" id="pkSelected"></s:hidden>
<s:hidden name="pk" id="pk"></s:hidden>
<s:hidden name="hidden" id="hidden"></s:hidden>


	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="regimeGrid"/>
	    <sjg:grid 
	        id="gridtable" 
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="5"
	        rowList="5,10,15"
	        gridModel="listeRcRegime" sortable="true"
	        onSelectRowTopics="rowselect"
	        width="800">
	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
		    	<sjg:gridColumn name="typeRegimeCodeDouanier" title="%{getText('ConsultationTables.Listerccoderegimedouanier')}" />
		    	<sjg:gridColumn name="rcCodeRegimeFiscal"  title="%{getText('ConsultationTables.Listerccoderegimefiscal')}" />
		    	<sjg:gridColumn name="rcLibelleRegime"  title="%{getText('ConsultationTables.Listerclibelleregime')}" />
	    </sjg:grid>
	 </div>
</s:form>

<!-- 	<layout:pager maxPageItems="12"> -->
<!-- 		<layout:collection property="listeRcRegime" id="pk" width="100%" -->
<!-- 			styleClass="FORM2" styleClass2="FORM3" selectType="radio" -->
<!-- 			selectName="pk" selectProperty="pk" onClick="choixPk()" title=""> -->
<!-- 		</layout:collection> -->
<!-- 	</layout:pager> -->

