<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>

<%@page import="sn.com.douane.web.f9.form.F9Form" %>
<%@page import="sn.com.douane.web.declaration.form.SaisieDeclarationForm" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<TITLE><s:label name="titre1"/></TITLE>
<html>
<HEAD>


<script>
function TYPDEP_ondblclick(){

	var libm1 = '<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>';
	frm = document.forms.item(0);
	var selectedRadio = document.getElementById ('pk').value;
	var selectedRadio1 = '';
	var selectedRadio2 = '';
	var j=0;
// 	for (var i=0; i<frm.length; i++) {
// 		if (frm.elements[i].name == 'pk' && frm.elements[i].checked == true) {
// 			selectedRadio = frm.elements[i].value;
// 			i = frm.length;
// 		}
// 	}

	window.opener.document.getElementById(libm1).value = selectedRadio.substring(0,selectedRadio.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>.value = selectedRadio.substring(selectedRadio.indexOf("²")+1,selectedRadio.length);
	window.opener.document.getElementById(libm1).focus();
 	window.close();
}

function ctest(){
frm = document.forms.item(0);
var selectedRadio = '';
var j=0;
var focu='<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>';
var curField='<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>';
for (var i=0; i<frm.length; i++) {
	if (frm.elements[i].name == 'pk' ){
	 selectedRadio = frm.elements[i].value;
	 i = frm.length;
	 j++;
	}			
}
if( selectedRadio==""){
		/*window.close();
	 	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.background = '#00FFFF';
		window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.color = '#CC0000';
		window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.focus();
		window.opener.alert("Code erroné");*/
}
if(i==3){
	window.close();
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.background = '#f8f9fa';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.color = '';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.value = selectedRadio.substring(0,selectedRadio.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>.value = selectedRadio.substring(selectedRadio.indexOf("²")+1,selectedRadio.length);
	/*if(j>0){
	 if(focu.type!='hidden') window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>.focus();
	}*/
	     
}
}
function clickespace(){
if(window.event.keyCode==32){
frm = document.forms.item(0) ;
for (var i=0; i<frm.length;i++) { 
if (frm.elements[i].checked == true) {
TYPDEP_ondblclick();
}
}
}
if(window.event.keyCode==9)frm.finder.focus();
}

$.subscribe('popup', function(event, data) {
	var key = $("#gridtable").jqGrid('getGridParam','selrow');
	var pk = $("#gridtable").jqGrid('getCell', key, 'pk');
	document.forms.item(0).pk.value=pk;
	TYPDEP_ondblclick();})

</script>
</HEAD>

<BODY onload="" onblur="this.focus();" 
	onkeypress="document.forms.item(0).finder.focus();"
	onkeydown="clickespace()">


<s:form method="post" theme="simple"  >

	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="document.forms.item(0).submit();"></s:submit></td>
		    <td><s:textfield name="finder" id="finder" cssClass="input300" onkeydown="if(window.event.keycode==13)document.forms.item(0).submit();"/></td>
		</tr>
	</table>
	</div>

<!-- <table class="SECTION"> -->
<!-- 		<tr> -->
<%-- 			<th class="ENTETE" colspan="9"><s:text name="titre1"/></th> --%>
<!-- 		</tr> -->
<!-- </table> -->
<!-- <table class="FORM2" width="100%"> -->
<!-- 		<tr> -->
<!-- 			<th class="FORM2"></th> -->
<%-- 			<th class="FORM2"><s:label name="lib1"/></th> --%>
<%-- 			<th class="FORM2"><s:label name="lib2"/></th> --%>
<!-- 		    </tr> -->
<%-- 	<s:iterator value="vf9" > --%>
<!-- 		<tr> -->
<%-- 			<s:set var="num" value ="%{pk}"/> --%>
<!-- 			<td class="FORM3">						  -->
<%-- 				<s:radio name="pk" list="#{#num:''}" ondblclick="TYPDEP_ondblclick()"/>					 --%>
<!-- 			</td> -->
<%-- 			<td class="FORM3"><s:property value="col1" /> --%>
<%-- 			<td class="FORM3"><s:property value="col2" /></td> --%>
<!-- 		</tr> -->
<%-- 	</s:iterator> --%>
<!-- </table> -->

	<div style="float:left; margin-top:5px; margin-down:10px;">
	<s:url id="remoteurl" action="f9Grid"/>
	    <sjg:grid 
	        id="gridtable" 
	        caption="%{titre1}"
	        dataType="json"
	        href="%{remoteurl}"
	        pager="true" 
	        rowNum="10"
	        rowList="10,15,20"
	        onDblClickRowTopics="popup"
	        gridModel="vf9" sortable="true"
	        width="800">
	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
		    	<sjg:gridColumn name="col1" title="%{lib1}" />
		    	<sjg:gridColumn name="col2"  title="%{lib2}"/>
	    </sjg:grid>
	 </div>	
<s:hidden name="pk" id="pk"></s:hidden>
</s:form>
</BODY>
</html>
