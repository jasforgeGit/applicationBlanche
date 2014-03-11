<%@ page import="java.text.DateFormat,java.text.SimpleDateFormat"%>
<%!String user=""; %>
<% java.util.Date l_date = new java.util.Date(System.currentTimeMillis());
   String l_stFormatDate = new String("E dd MMM yyyy HH:mm:ss");
   DateFormat l_formatDate = new SimpleDateFormat(l_stFormatDate, java.util.Locale.FRENCH);
   String stDate = l_formatDate.format(l_date);
   
   pageContext.setAttribute("stDate", stDate);
%>
