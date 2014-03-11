<%@ taglib prefix="s" uri="/struts-tags"%>

<s:form method="POST" theme="simple">
	
	<%@ include file="/pages/rc/_utilisateur/reinitialisationPWDInclude.jsp"%>

	<s:submit key="button.search" onclick="doSubmit('reinitialiserPWD','reinitialiserPWD')"></s:submit>
	<s:submit key="button.retour" onclick="javascript:history.go(-1);return false;" cssClass="buttonBar" ></s:submit>					
 
</s:form>
