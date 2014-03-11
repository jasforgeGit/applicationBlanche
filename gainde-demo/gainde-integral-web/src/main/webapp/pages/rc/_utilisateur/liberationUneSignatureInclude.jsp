<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	sn.com.douane.web.frame.action.manager.ListeUtilisateurActifForm fbRech = (sn.com.douane.web.frame.action.manager.ListeUtilisateurActifForm) pageContext
				.findAttribute("listeUserActifForm");
%> 
<input id="hidden_message" type="hidden" name="hidden_message" value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>">

	
