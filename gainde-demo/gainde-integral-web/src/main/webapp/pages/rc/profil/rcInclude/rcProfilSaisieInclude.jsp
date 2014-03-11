<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="2"><s:text
				name="RcProfilFB.SaisieProfil" /></th>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCCODEPROFIL_OB" /></th>
		<td><s:textfield name="numRcCodeProfilOB" id="TNUM_RCCODEPROFIL_OB" maxlength="15" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcProfilFB.TNUM_RCLIBPROFIL_OB" /></th>
		<td><s:textfield name="numRcLibProfilOB" id="TNUM_RCLIBPROFIL_OB" maxlength="255" cssClass="input200" /></td>
	</tr>
	</table>
	
    <div style="float: left;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" validate="true" action="enregistrerRcProfil"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcProfil','rechercheRcProfil')"></s:submit></td>
		</tr>
	</table>
	</div>

   <table>
	<tr valign="top"><th class="FORM2" style="width:100px;">Code groupe</th><th class="FORM2" style="width:100px;">Libellé groupe</th>
	<td></td>
	<th class="FORM2" style="width:100px;">Code groupe</th><th class="FORM2" style="width:100px;">Libellé groupe</th>
	</tr>
	<tr>
	<td colspan="5" style="border:1px;" valign="top">
		<s:optiontransferselect 
			allowUpDownOnLeft="false" 
			allowUpDownOnRight="false"
			allowAddAllToLeft="false" 
			allowAddAllToRight="false"
			allowSelectAll="false"
			multiple="true" 
			headerKey="headerKey"
			buttonCssStyle="font-size: 9pt;font-family: sans-serif;width: 30px;height: 15px;background-color: #004142;color: white;"
			cssStyle="width: 350px"
			doubleCssStyle="width: 350px"
			id="left" 
			doubleId="right"
			name="ids1" 
			list="list1" 
			listKey="rcCodeGroupe"
			listValue="rcLibGroupe"
			doubleName="ids2" 
			doubleList="list2"
			doubleListKey="rcCodeGroupe"
			doubleListValue="rcLibGroupe"
			doubleHeaderKey="doubleHeaderKey" 
			doubleMultiple="true"
			/>
		</td>
		</tr>
	</table>