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

<input id="hidden_message" type="hidden" name="hidden_message" value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>">
		<table class="FORM2" style="width:100%; margin-top: 0px;">
		
		<tr>

			<th class="FORM2"><s:label key="user.codeuser"/></th>
			<th class="FORM2"><s:label key="user.adresseIp"/></th>
			<th/>
		</tr>
		<s:iterator value="listeUser">
			<tr>
				<td class="FORM3"><s:property value="abonne" /></td>
				<td class="FORM3"><s:property value="adresseIp" /></td>

			</tr>
		</s:iterator>	
	</table>


	

