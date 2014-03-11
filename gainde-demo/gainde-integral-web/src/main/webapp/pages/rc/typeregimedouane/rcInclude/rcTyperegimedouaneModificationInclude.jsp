<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcTyperegimedouaneFB.ModificationTyperegimedouane" /></th>
	</tr>
	<tr>
		<th><s:text name="RcTyperegimedouaneFB.TNUM_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numRcTypeRegimeOB" readonly="true"
				id="TNUM_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcTyperegimedouaneFB.TNUM_RCIMPORTEXPORT" /></th>
		<td><s:textfield name="numRcImportExport" 
				id="TNUM_RCIMPORTEXPORT" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcTyperegimedouaneFB.TNUM_RCLIBELLEREGIME" /></th>
		<td><s:textfield name="numRcLibelleRegime" 
				id="TNUM_RCLIBELLEREGIME" maxlength="100"
				cssClass="input500" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
</table>