<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="3"><s:text
				name="RcDelegationsFB.SaisieDelegations" /></th>
	</tr>
	<tr>
		<th><s:text name="RcDelegationsFB.TNUM_LIST_AGENTEMETTEUR_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListAgentEmetteurOB" readonly="true"
				id="TNUM_LIST_AGENTEMETTEUR_OB" maxlength="7" cssClass="input200" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcDelegationsFB.TNUM_LIST_AGENTDESTINATAIRE_OB" /></th>
		<td><div style="float: left;"><s:textfield name="numListAgentDestinataireOB" onkeyup="f9_UtilisateurDelegations(this,event)"
				id="TNUM_LIST_AGENTDESTINATAIRE_OB" maxlength="7" cssClass="input200" /></div></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcDelegationsFB.DAT_DATEDEBUT_OB" /></th>
		<td><sj:datepicker id="DAT_DATEDEBUT_OB"
				name="datDateDebutOB"
				showOn="focus" displayFormat="dd/mm/yy" cssClass="input200"/></td>
        <td style="width: 60%;"></td>
	</tr>
	<tr>
		<th><s:text name="RcDelegationsFB.DAT_DATEFIN" /></th>
		<td><sj:datepicker id="DAT_DATEFIN"
				name="datDateFin"
				showOn="focus" displayFormat="dd/mm/yy" cssClass="input200"/></td>
	</tr>
    <tr>
		<th><s:label key="RcDelegationsFB.NUM_LIST_CODEGROUPE_OB"></s:label></th>
		<td><s:select id="TNUM_CODEGROUPE_OB"
					name="numCodeGroupeOB" onchange="computeFoncByGroupe('numCodeGroupeOB','numCodeFonctionOB');"
					list="listGroupeFonc" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
    </tr>
    <tr>
		<th><s:label key="RcDelegationsFB.TNUM_LIST_CODEFONCTION_OB"></s:label></th>
		<td><s:select id="TNUM_CODEFONCTION_OB"
					name="numCodeFonctionOB"
					list="listFonctionnalite" listKey="value"
					listValue="label" cssStyle="width:200px;"/></td>
    </tr>
</table>

<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.add" cssClass="buttonBar" validate="true"
					onclick="return doSubmit('ajouterDelegations','saisieRcDelegations')"></s:submit></td>
		</tr>
	</table>
</div>

<table class="SECTION">
		<tr>
			<th class="ENTETE"><s:text name="listeDelegations.listDelegations" /></th>
		</tr>
</table>
<table class="FORM2" style="width:100%; margin-top: 0px;">
		
		<tr>
		    <th class="FORM2"></th>
			<th class="FORM2"><s:label key="listeDelegations.AgentDest"/></th>
			<th class="FORM2"><s:label key="listeDelegations.CodeGroupe"/></th>
			<th class="FORM2"><s:label key="listeDelegations.CodeFonc"/></th>
			<th class="FORM2"><s:label key="listeDelegations.DateDebut"/></th>
			<th class="FORM2"><s:label key="listeDelegations.DateFin"/></th>
			<th/>
		</tr>
		<s:iterator value="listeDelegations">
			<tr>
			<td class="FORM3">
				
				<s:set var="PK" value ="%{agentDestinataire +'~~'+ agentEmetteur +'~~'+ codeGroupe +'~~'+ codeFonction +'~~'+ datedebutformat}"></s:set>
				<s:url  var="urlDelete" action="supprimerDelegations?page=saisieRcDelegations" >
				    <s:param name="pk"  value="%{#PK}" />
				</s:url>
				<s:a href="%{urlDelete}"><img src="config/delete.jpg" /></s:a>
			</td>				
				<td class="FORM3"><s:property value="agentDestinataire" /></td>
				<td class="FORM3"><s:property value="libgroupe" /></td>
				<td class="FORM3"><s:property value="libfonction" /></td>
				<td class="FORM3"><s:property value="datedebutformat" /></td>
				<td class="FORM3"><s:property value="datefinformat" /></td>
			</tr>
		</s:iterator>	
</table>

<div style="float:left; margin-top:10px;">	
	<table>
		<tr>
			<td><s:submit key="button.save" cssClass="buttonBar" 
					onclick="doSubmitWithaoutValidate('enregistrerRcDelegations','saisieRcDelegations')"></s:submit>
			<s:submit key="button.retour" cssClass="buttonBar" 
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
</div>

<s:hidden name="regroupfonction" id="regroupfonction"></s:hidden>
<s:hidden name="fonctionnalites" id="fonctionnalites"></s:hidden>
<s:hidden name="buragent" id="buragent"></s:hidden>
<%--  <s:textarea mode="N,H,R" property="regroupfonction" />  --%>
<!--  <layout:textarea mode="N,H,R" property="fonctionnalites" />  -->
<!--  <layout:textarea mode="N,H,R" property="buragent" />  -->
<script>
	computeFoncByGroupe('numCodeGroupeOB','numCodeFonctionOB');
</script>
