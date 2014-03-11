<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="post" theme="simple">
	<%@ include
		file="/pages/rc/bureaudouane/rcInclude/rcBureaudouaneConsultationInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr height="25px">
				<td><s:submit cssClass="buttonBar" key="button.retour"
						onclick="gotoUrll('rechercherRcBureaudouane','rechercheRcBureaudouane')">
					</s:submit></td>
			</tr>
		</table>
	</div>
</s:form>

