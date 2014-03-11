<%@ taglib prefix="s" uri="/struts-tags"%>


<s:form method="post" theme="simple">

<table class="SECTION">
	<tr>
		<th class="ENTETE" colspan="4"><s:text
				name="bl7600.Recherche" /></th>
	</tr>
</table>
<table class="SECTION2">
	<tr>
		<th><s:text name="user.codeuser" /></th>
		<td><s:textfield name="abonne"
				maxlength="7" cssClass="input200"/></td>
		<td><s:submit key="button.search" onclick="doSubmit('rechercherUser','rechercherUser')"></s:submit></td>
	</tr>

</table>


	<%@ include    
		file="/pages/rc/_utilisateur/liberationSignatureInclude.jsp"%>
  
  
  
	<s:submit key="button.libererSignatureAllUser" cssClass="buttonBar" 
						onclick="doSubmit('libererSignatureAll','liberationSignature')"></s:submit>
						
						
	<s:submit key="button.retour" cssClass="buttonBar" 
						onclick="javascript:history.go(-1);return false"></s:submit>
  

  
</s:form>
 