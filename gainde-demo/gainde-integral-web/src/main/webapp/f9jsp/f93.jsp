<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<TITLE><s:text name="titre1"/></TITLE>

<html>
<HEAD>
<script type="text/javascript">

function TYPDEP_ondblclick() {

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
// 			}
// 	}

selectedRadio1=selectedRadio.substring(selectedRadio.indexOf("²")+1,selectedRadio.length);
selectedRadio2=selectedRadio1.substring(selectedRadio1.indexOf("²")+1,selectedRadio1.length);
selectedRadio3=selectedRadio2.substring(selectedRadio2.indexOf("²")+1,selectedRadio2.length);

 window.opener.document.getElementById(libm1).value = selectedRadio.substring(0,selectedRadio.indexOf("²"));
 window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>.value = selectedRadio1.substring(0,selectedRadio1.indexOf("²"));
 window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm3()%>.value = selectedRadio2.substring(0,selectedRadio2.indexOf("²"));
 window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm4()%>.value = selectedRadio3.substring(0,selectedRadio3.indexOf("²"));
 window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm5()%>.value = selectedRadio3.substring(selectedRadio3.indexOf("²")+1,selectedRadio3.length);
 
 window.opener.document.getElementById(libm1).focus();

window.close();
 
}
function ctest(){

frm = document.forms.item(0);
var selectedRadio = '';
var selectedRadio1 ='';
var j=0;
for (var i=0; i<frm.length; i++) {
	if (frm.elements[i].name == 'pk' ){
	 selectedRadio = frm.elements[i].value;
	 i = frm.length;
	 j++;
	}			
}
selectedRadio1=selectedRadio.substring(selectedRadio.indexOf("²")+1,selectedRadio.length);
selectedRadio2=selectedRadio1.substring(selectedRadio1.indexOf("²")+1,selectedRadio1.length);
selectedRadio3=selectedRadio2.substring(selectedRadio2.indexOf("²")+1,selectedRadio2.length);


if( selectedRadio==""){
	/*window.close();
 	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.background = '#00FFFF';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.color = '#CC0000';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.focus();
	window.opener.alert("Code erroné");*/

}
if(i==3){
	window.close();
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.background = '#F8F9FA';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.style.color = '';
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm1()%>.value = selectedRadio.substring(0,selectedRadio.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm2()%>.value = selectedRadio1.substring(0,selectedRadio1.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm3()%>.value = selectedRadio2.substring(0,selectedRadio2.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm4()%>.value = selectedRadio3.substring(0,selectedRadio3.indexOf("²"));
	window.opener.document.forms.item(window.opener.document.forms.length-1).<%=sn.com.douane.web.f9.form.F9Form.getLibm5()%>.value = selectedRadio3.substring(selectedRadio3.indexOf("²")+1,selectedRadio3.length);
}

}
function clickespace(){
if(window.event.keyCode==32){
frm = document.forms.item(0);
for (var i=0; i<frm.length;i++) { 
if (frm.elements[i].checked == true) {
TYPDEP_ondblclick();
}else{
frm.finder.focus();
}
}
}
}

function  formatLink(cellValue, option, rowObject) {
    return '<input type="radio" name="radio_' + option.gid + '" />';
}

$.subscribe('popup', function(event, data) {
	var key = $("#gridtable").jqGrid('getGridParam','selrow');
	var pk = $("#gridtable").jqGrid('getCell', key, 'pk');
	document.forms.item(0).pk.value=pk;
	TYPDEP_ondblclick();})
</script>
</HEAD>

<BODY onload="" onblur="this.focus();" onkeypress="document.forms.item(0).finder.focus();"
	onkeydown="clickespace()">

<s:form method="post" theme="simple" >

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
<%-- 			<th class="FORM2"><s:label name="lib3"/></th> --%>
<%-- 			<th class="FORM2"><s:label name="lib4"/></th> --%>
<%-- 			<th class="FORM2"><s:label name="lib5"/></th> --%>
<!-- 		    </tr> -->
<%-- 	<s:iterator value="vf9" > --%>
<!-- 		<tr> -->
<%-- 			<s:set var="num" value ="%{pk}"/> --%>
<!-- 			<td class="FORM3">						  -->
<%-- 				<s:radio name="pk" list="#{#num:''}" ondblclick="TYPDEP_ondblclick()"/>					 --%>
<!-- 			</td> -->
<%-- 			<td class="FORM3"><s:property value="col1" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col2" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col3" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col4" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col5" /></td> --%>
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
	        rowNum="5"
	        rowList="5,10,15"
	        onDblClickRowTopics="popup"
	        gridModel="vf9" sortable="true"
	        width="800">
	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
<%-- 	            <sjg:gridColumn name=""  title="Select" formatter="formatLink" align="center" /> --%>
		    	<sjg:gridColumn name="col1" title="%{lib1}" />
		    	<sjg:gridColumn name="col2"  title="%{lib2}"/>
		    	<sjg:gridColumn name="col3"  title="%{lib3}" />
		        <sjg:gridColumn name="col4"  title="%{lib4}" />
		    	<sjg:gridColumn name="col5"  title="%{lib5}" />
	    </sjg:grid>
	 </div>	
<s:hidden name="pk" id="pk"></s:hidden>
</s:form>
</BODY>
</html>
