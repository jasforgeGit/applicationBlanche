<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="6"><s:text
				name="RcGroupefonctionFB.ModificationGroupefonction" /></th>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.NUM_RCCODEGROUPE_OB" /></th>
		<td><s:textfield name="numRcCodeGroupeOB" id="NUM_RCCODEGROUPE_OB" maxlength="15" cssClass="input200" readonly="true"/></td>
		<th><s:text name="RcGroupefonctionFB.TNUM_RCLIBGROUPE_OB" /></th>
		<td><s:textfield name="numRcLibGroupeOB" id="TNUM_RCLIBGROUPE_OB" maxlength="255" cssClass="input200" /></td>
	</tr>
	<tr>
	<th><s:text name="RcGroupefonctionFB.TNUM_LIST_RCCODEGRPPERE" /></th>
	<td>
		<table class="SECTION2">
		  <tr>
		    <td><s:textfield name="numListRcCodeGrpPere" id="NUM_LIST_RCCODEGRPPERE" maxlength="3" cssClass="TNUM_manifCodeBur" onkeyup="f9_Groupefonction(this,TNUM_RCLIBGRPPERE,event)"/></td>
	        <td><s:textfield name="numRcLibGrpPere" id="TNUM_RCLIBGRPPERE" maxlength="50" cssClass="inputLibFunction" readonly="true"/></td>
	      </tr>
	    </table>
	</td>
	<th><s:text name="RcGroupefonctionFB.TNUM_RCORDREAFFICHAGE_OB" /></th>
	<td><s:textfield name="numRcOrdreAffichageOB" id="TNUM_RCORDREAFFICHAGE_OB" maxlength="15" cssClass="input200" /></td>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.TNUM_LIST_RCMODULE" /></th>
		<td><s:select list="listModule" name="numListRcModule"
				listKey="value" listValue="label" id="TNUM_LIST_RCMODULE" style="width:200px" /></td><td/>
	</tr>
</table>

	
	<table>
		<tr>
			<td><s:submit key="button.edit" cssClass="buttonBar" validate="true" action="modifierRcGroupefonction"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrll('rechercherRcGroupefonction','rechercheRcGroupefonction')"></s:submit></td>
		</tr>
	</table>
	

	<table>
	<tr valign="top"><th class="FORM2" style="width:100px;">Code fonction</th><th class="FORM2" style="width:100px;">Libellé fonction</th>
	<td></td>
	<th class="FORM2" style="width:100px;">Code fonction</th><th class="FORM2" style="width:100px;">Libellé fonction</th>
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
			listKey="rcCodeFonction"
			listValue="rcLibFonction"
			doubleName="ids2" 
			doubleList="list2"
			doubleListKey="rcCodeFonction"
			doubleListValue="rcLibFonction"
			doubleHeaderKey="doubleHeaderKey" 
			doubleMultiple="true"
			
			/>

		</td>
		</tr>
	</table>
