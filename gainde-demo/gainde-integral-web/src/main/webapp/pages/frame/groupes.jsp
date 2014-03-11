<%@ page import="java.io.*" %>
<%
 sn.com.douane.ejb.rc.model.entities.Utilisateur vo=( sn.com.douane.ejb.rc.model.entities.Utilisateur)request.getSession().getAttribute("user");

try{
out.println(vo.getXml());
}catch(Exception e){
e.printStackTrace();
}

%> 