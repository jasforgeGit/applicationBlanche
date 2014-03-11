<%@ page import="java.io.*" %>
<html>
<head>
 <title>Gainde jsTree</title>
<script src="<%= request.getContextPath()%>/frame/jquery.js">
</script>
<script src="<%= request.getContextPath()%>/frame/jquery.jstree.js">
</script>
 
<%
 sn.com.douane.ejb.rc.model.entities.Utilisateur vo=( sn.com.douane.ejb.rc.model.entities.Utilisateur)request.getSession().getAttribute("user");

try{
out.println(vo.getXml());
}catch(Exception e){
e.printStackTrace();
}

%> 
