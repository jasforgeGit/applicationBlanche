<%@ taglib uri="/WEB-INF/struts-layout.tld" prefix="layout"%>
<layout:grid cols="1" styleClass="SECTION" space="false" width="100%">

	<layout:message key="RcCatregroupFB.SaisieCatregroup"
		styleClass="ENTETE" />
	<layout:cell width="100%" styleClass="SPACE" />

	<layout:grid cols="3" styleClass="PANEL" space="false" width="100%">

		<layout:text property="TNUM_RCCODECATREGROUP_OB" styleClass="input200"
			key="RcCatregroupFB.TNUM_RCCODECATREGROUP_OB" maxlength="3" />
		<layout:cell />
		<layout:cell />
		<layout:text property="TNUM_RCLIBCATREGROUP_OB" styleClass="input400"
			key="RcCatregroupFB.TNUM_RCLIBCATREGROUP_OB" maxlength="100" />

	</layout:grid>
	<layout:cell width="100%" styleClass="SPACE" />

</layout:grid>
