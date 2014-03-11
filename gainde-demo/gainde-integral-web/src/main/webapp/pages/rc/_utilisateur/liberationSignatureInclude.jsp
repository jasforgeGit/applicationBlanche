<%@ taglib prefix="s" uri="/struts-tags"%>
<%
sn.com.douane.web.frame.action.manager.ListeUtilisateurActifForm fbRech = (sn.com.douane.web.frame.action.manager.ListeUtilisateurActifForm) pageContext
				.findAttribute("listeUserActifForm");
%>

<table class="SECTION">
	<tr>
		<th class="ENTETE"><s:text name="user.listeUserActif" /></th>
	</tr>
</table>

<input type="hidden" name="hidden_message"
	value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />

<table class="FORM2" style="width: 100%; margin-top: 0px;">

	<tr>
		<th class="FORM2"></th>
		<th class="FORM2"><s:label key="user.codeuser" /></th>
		<th class="FORM2"><s:label
				key="RcMessagerieFB.TNUM_rcLibSocBurUser" /></th>
		<th />
	</tr>
	<s:iterator value="listeUser">
		<tr>
			<td class="FORM3"><s:set var="key" value="abonne" /> <s:url
					var="xxx"
					action="libererSignature.action?page=liberationSignature">
					<s:param name="pk" value="%{key}" />
				</s:url> <s:a href="%{xxx}">
					<img src="config/edit1.jpg" border="0" />
				</s:a></td>

			<td class="FORM3"><s:property value="abonne" /></td>
			<td class="FORM3"><s:property value="adresseIp" /></td>

		</tr>
	</s:iterator>
</table>

