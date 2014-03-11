<%@ taglib prefix="s" uri="/struts-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="RcGroupefonctionFB.ConsultationGroupefonction" /></th>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.NUM_RCCODEGROUPE_OB" /></th>
		<td><s:textfield name="numRcCodeGroupeOB" id="NUM_RCCODEGROUPE_OB" maxlength="15" cssClass="input200" readonly="true"/></td>
		<th><s:text name="RcGroupefonctionFB.TNUM_RCLIBGROUPE_OB" /></th>
		<td><s:textfield name="numRcLibGroupeOB" id="TNUM_RCLIBGROUPE_OB" maxlength="255" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
	<th><s:text name="RcGroupefonctionFB.TNUM_LIST_RCCODEGRPPERE" /></th>
	<td>
		<table class="SECTION2">
		  <tr>
		    <td><s:textfield name="numListRcCodeGrpPere" id="NUM_LIST_RCCODEGRPPERE" maxlength="3" cssClass="TNUM_manifCodeBur" onkeyup="f9_Groupefonction(this,TNUM_RCLIBGRPPERE,event)" readonly="true"/></td>
	        <td><s:textfield name="numRcLibGrpPere" id="TNUM_RCLIBGRPPERE" maxlength="50" cssClass="inputLibFunction" readonly="true"/></td>
	      </tr>
	    </table>
	</td>
	<th><s:text name="RcGroupefonctionFB.TNUM_RCORDREAFFICHAGE_OB" /></th>
	<td><s:textfield name="numRcOrdreAffichageOB" id="TNUM_RCORDREAFFICHAGE_OB" maxlength="15" cssClass="input200" readonly="true"/></td>
	</tr>
	<tr>
		<th><s:text name="RcGroupefonctionFB.TNUM_LIST_RCMODULE" /></th>
		<td><s:select list="listModule" name="numListRcModule"
				listKey="value" listValue="label" id="TNUM_LIST_RCMODULE" style="width:200px" disabled="true"/></td><td/>
	</tr>
</table>
