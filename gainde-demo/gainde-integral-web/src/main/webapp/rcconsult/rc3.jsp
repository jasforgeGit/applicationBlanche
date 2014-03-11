<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sjg" uri="/struts-jquery-grid-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<TITLE><s:text name="titre1"/></TITLE>

<html>
<HEAD>
</HEAD>

<BODY onload="" onblur="this.focus();" 
	onkeypress="document.forms.item(0).finder.focus();">


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
<%-- 			<th class="FORM2"><s:label name="lib1"/></th> --%>
<%-- 			<th class="FORM2"><s:label name="lib2"/></th> --%>
<%-- 			<th class="FORM2"><s:label name="lib3"/></th> --%>
<!-- 		    </tr> -->
<%-- 	<s:iterator value="vf9" > --%>
<!-- 		<tr> -->
<%-- 			<td class="FORM3"><s:property value="col1" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col2" /></td> --%>
<%-- 			<td class="FORM3"><s:property value="col3" /></td> --%>
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
	        gridModel="vf9" sortable="true"
	        width="800">
	            <sjg:gridColumn name="pk" title="pk" key="true" hidden="true"/>
		    	<sjg:gridColumn name="col1" title="%{lib1}" />
		    	<sjg:gridColumn name="col2"  title="%{lib2}"/>
		    	<sjg:gridColumn name="col3"  title="%{lib3}"/>
	    </sjg:grid>
	 </div>	

	<div style="float: left;">
	<table>
		<tr>
			<td><s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	</div>
</s:form>
</BODY>
</html>