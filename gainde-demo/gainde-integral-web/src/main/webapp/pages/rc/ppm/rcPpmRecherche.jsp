<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String ctxmenu = (String) request.getSession().getAttribute(sn.com.douane.utils.ConstManif.CTXMENU);
%>
<s:form method="post" theme="simple">
		<%@ include file="/pages/rc/ppm/rcInclude/rcPpmRechercheInclude.jsp"%>
	<table>
		<tr>
			<td><s:submit key="button.search" cssClass="buttonBar"
					onclick="doSubmit('rechercherRcPpm','rechercheRcPpm')"></s:submit>
				<s:submit key="button.retour" cssClass="buttonBar"
					onclick="doReturn()"></s:submit></td>
		</tr>
	</table>
	<s:hidden name="hidden" id="hidden"></s:hidden>
	<input type="hidden" name="hidden_message"
		value="<%=sn.com.douane.web.rc.Session.getMessageProperties("message.confirmDelete",request.getLocale())%>" />
       
       <table class="FORM2" style="width: 100%; margin-top: 0px;">
		<tr>
			<th class="FORM2"><s:label /></th>
			<% if (ctxmenu.equals("SM")) {%>
			<th class="FORM2"><s:label /></th>
			<%}%>
			<th class="FORM2"><s:label key="listeRcPpm.rccodeppm" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rcnomppm" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rcprenomppm" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rccodeagree" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rccodeconsignataire" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rccodecontribuable" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rcnumimportexport" /></th>
			<th class="FORM2"><s:label key="listeRcPpm.rcninea" /></th>
		</tr>
		<s:iterator value="listeRcPpm">
			<tr>
				<td class="FORM3"><s:set var="key" value="rccodeppm" />

					<%if (ctxmenu.equals("SM")){%> <s:url var="link"
						action="afficherRcPpm.action?page=modificationRcPpm">
						<s:param name="pk" value="%{key}" />
					</s:url> <%	}else if (ctxmenu.equals("C")){%> <s:url var="link"
						action="afficherRcPpm.action?page=consultationRcPpm">
						<s:param name="pk" value="%{key}" />
					</s:url> <% }else {%> <s:url var="link" action="">
						<s:param name="pk" value="%{key}" />
					</s:url> <%}%> <s:a href="%{link}">
						<img src="config/edit1.jpg" border="0" />
					</s:a></td>
				<% if (ctxmenu.equals("SM"))
					{
						%>
				<td class="FORM3"><s:set var="key" value="rccodeppm" />
					<s:url var="remove"
						action="supprimerRcPpm.action?page=rechercheRcPpm">
						<s:param name="pk" value="%{key}" />
					</s:url> <s:a href="%{remove}"
						onclick="return confirm(hidden_message.value)">
						<img src="config/delete.jpg" border="0" />
					</s:a></td>
				<%}%>
				<td class="FORM3"><s:property value="rccodeppm" /></td>
				<td class="FORM3"><s:property value="rcnomppm" /></td>
				<td class="FORM3"><s:property value="rcprenomppm" /></td>
				<td class="FORM3"><s:property value="rccodeagree" /></td>
				<td class="FORM3"><s:property value="rccodeconsignataire" /></td>
				<td class="FORM3"><s:property value="rccodecontribuable" /></td>
				<td class="FORM3"><s:property value="rcnumimportexport" /></td>
				<td class="FORM3"><s:property value="rcninea" /></td>
			</tr>
		</s:iterator>
	</table>

				<% /*
				<layout:collectionItem title="listeRcPpm.rcnumppm"
					property="rcnumppm" />
				<layout:collectionItem title="listeRcPpm.rccodeamborg"
					property="rccodeamborg" />
				<layout:collectionItem title="listeRcPpm.rcdatesuspensionadm"
					property="rcdatesuspensionadm" />
				<layout:collectionItem title="listeRcPpm.rcindshipsandler"
					property="rcindshipsandler" />
				<layout:collectionItem title="listeRcPpm.rcindusineexercee"
					property="rcindusineexercee" />
				<layout:collectionItem title="listeRcPpm.rcindzonefrindust"
					property="rcindzonefrindust" />
				<layout:collectionItem title="listeRcPpm.rcnomppm"
					property="rcnomppm" />
				<layout:collectionItem title="listeRcPpm.rcnomvoieetablsec"
					property="rcnomvoieetablsec" />
				<layout:collectionItem title="listeRcPpm.rcnomvoieppm"
					property="rcnomvoieppm" />
				<layout:collectionItem title="listeRcPpm.rcnumvoieetablsec"
					property="rcnumvoieetablsec" />
				<layout:collectionItem title="listeRcPpm.rcprenomppm"
					property="rcprenomppm" />
				<layout:collectionItem title="listeRcPpm.rcquartieretablsec"
					property="rcquartieretablsec" />
				<layout:collectionItem title="listeRcPpm.rcquartierppm"
					property="rcquartierppm" />
				<layout:collectionItem title="listeRcPpm.rcraisonsociale"
					property="rcraisonsociale" />
				<layout:collectionItem title="listeRcPpm.rcsuspensionadm"
					property="rcsuspensionadm" />
				<layout:collectionItem title="listeRcPpm.rctitreppm"
					property="rctitreppm" />
				<layout:collectionItem title="listeRcPpm.rctypevoieetablsec"
					property="rctypevoieetablsec" />
				<layout:collectionItem title="listeRcPpm.rctypevoieppm"
					property="rctypevoieppm" />
				<layout:collectionItem title="listeRcPpm.rcvilleetablsec"
					property="rcvilleetablsec" />
				<layout:collectionItem title="listeRcPpm.rcvilleppm"
					property="rcvilleppm" />
				<layout:collectionItem title="listeRcPpm.rcboitepostaleppm"
					property="rcboitepostaleppm" />
				<layout:collectionItem title="listeRcPpm.rcbpetablsec"
					property="rcbpetablsec" />
				<layout:collectionItem title="listeRcPpm.rccircuitvisite"
					property="rccircuitvisite" />
				*/ %>
</s:form>