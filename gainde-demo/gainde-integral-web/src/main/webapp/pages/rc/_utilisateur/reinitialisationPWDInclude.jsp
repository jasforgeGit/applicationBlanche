<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
<body>
<s:form method="post" theme="simple">
				<tr>
		<th class="ENTETE" colspan="1"><s:text
				name="user.listeUserActif" /></th>
	</tr>
	<tr>
		<th><s:text name="user.codeuser" /></th>
		<td><s:textfield name="abonne"
				maxlength="7" cssClass="input200"/></td>
				</tr>
</s:form>
</body>
</html> 
