<%@taglib prefix="s" uri="/struts-tags" %>
<%@taglib prefix="sj" uri="/struts-jquery-tags" %>

<s:form method="post" theme="simple" onsubmit="return (false)">
<%@ include
		file="/pages/rc/genrebureau/rcInclude/rcGenrebureauSaisieInclude.jsp"%>
	<div style="float: left;">
		<table>
			<tr>
				<td><s:submit key="button.save" cssClass="buttonBar"
						validate="true"
						onclick="doSubmit2('enregistrerRcGenrebureau','saisieRcGenrebureau')"></s:submit>
					<sj:submit key="button.retour" cssClass="buttonBar"
					onclick="gotoUrll('rechercherRcGenrebureau','rechercheRcGenrebureau')"></sj:submit></td>
			</tr>
		</table>
	</div>
</s:form>