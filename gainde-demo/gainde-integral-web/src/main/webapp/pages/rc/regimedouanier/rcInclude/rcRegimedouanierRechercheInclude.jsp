<%@ taglib prefix="s" uri="/struts-tags"%>
<%@taglib prefix="sj" uri="/struts-jquery-tags"%>

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcRegimedouanierFB.RechercheRegimedouanier" /></th>
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_RCCODEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numRcCodeRegimeDouanierRech"
				id="TNUM_RCCODEREGIMEDOUANIERRech" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_LIST_RCTYPEREGIMERech" /></th>
		<td><s:textfield name="numListRcTypeRegimeRech" onkeyup="f9_TypeRegimeDouane(this,event)"
				id="TNUM_LIST_RCTYPEREGIMERech" maxlength="1"
				cssClass="input200" cssStyle="float: left;"/></td>
       <td style="width: 60%"></td> 
	</tr>
	<tr>
		<th><s:text name="RcRegimedouanierFB.TNUM_RCLIBELLEREGIMEDOUANIERRech" /></th>
		<td><s:textfield name="numRcLibelleRegimeDouanierRech" 
				id="TNUM_RCLIBELLEREGIMEDOUANIERRech" maxlength="250"
				cssClass="input500" /></td>
       <td style="width: 60%"></td> 
	</tr>
</table>


