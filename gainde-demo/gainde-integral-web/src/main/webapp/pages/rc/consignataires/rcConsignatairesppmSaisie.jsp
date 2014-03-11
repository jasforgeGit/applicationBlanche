<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="sj" uri="/struts-jquery-tags"%>
<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/consignataires/rcInclude/rcConsignatairesppmSaisieInclude.jsp"%>
	<div style="float: left;">
	<table>
		<tr>
			<td><sj:submit key="button.save" cssClass="buttonBar" validate="true" 
					onclick="doSubmit2('enregistrerRcConsignataires','saisieRcPpm')"></sj:submit>
				<sj:submit key="button.retour" cssClass="buttonBar" 
					onclick="gotoUrll('unspecified','saisieRcPpm')"></sj:submit></td>
		</tr>
	</table>
	</div>
</s:form>