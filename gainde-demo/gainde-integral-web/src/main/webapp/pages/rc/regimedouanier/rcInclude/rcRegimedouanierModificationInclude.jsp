<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimedouanierFB.ModificationRegimedouanier" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_RCCODEREGIMEDOUANIER_OB" /></th>
		<td><s:textfield name="numRcCodeRegimeDouanierOB" readonly="true"
				id="TNUM_RCCODEREGIMEDOUANIER_OB" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_LIST_RCTYPEREGIME_OB" /></th>
		<td><s:textfield name="numListRcTypeRegimeOB" readonly="true"
				id="TNUM_LIST_RCTYPEREGIME_OB" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_RCLIBELLEREGIMEDOUANIER" /></th>
		<td><s:textfield name="numRcLibelleRegimeDouanier" 
				id="TNUM_RCLIBELLEREGIMEDOUANIER" maxlength="250"
				cssClass="input500" /></td>
       <td style="width: 60%"></td> 
	</tr>
</table>
