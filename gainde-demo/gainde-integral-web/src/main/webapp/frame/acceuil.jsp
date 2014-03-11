<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page import="sn.com.douane.web.rc.Session"%>
<html>

<tiles:insertAttribute name="begin" />
<body onload="FirstTime();if(document.forms[0]&&document.forms[0].action.indexOf('saisieManifesteACT')!=-1&&document.forms[0].hid){truc();FirstTime();}" onsubmit="return(false)">	<tiles:insertAttribute name="title" />
	
		<%
			String utilis = "";
			String typeuser = "";
			String labelIdentificationUser = "";
			String indicateurConnect = "";
			String codeuser = "";
			String nomEnteteUser = "";
			String nomUser = "";
			String codePpmUser = "";
			String codeCreditaireUser = "";
			String codeIdentification = "";
			String libIdentificationUser = "";
			String libProfil = Session.getlibelleprofil(request);
			String versionConnect = "";
			String bgcolorVersionTest = "";
			String bgimageVersionTest = "";
			String bureau = "";
			String labelBureau = "";
			
			try {
				
				utilis = Session.getUtilisateurSession(request).getRcIdentification();
				typeuser = Session.getUtilisateurSession(request).gettypeUser().getRcTypeUser();
				labelIdentificationUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.identificationUser",	request.getLocale());
				indicateurConnect = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.indicateurConnect",	request.getLocale());
				versionConnect = Session.getUtilisateurSession(request).getRcIndconnect();

				if (typeuser
						.equals(sn.com.douane.utils.ConstManif.TYPE_USER_DECLARANT)) {
					nomEnteteUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.nomEnteteUserDeclarant", request.getLocale());
					nomUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.nomUserDeclarant", request.getLocale());
					codePpmUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.codePpmUser",	request.getLocale());
					codeCreditaireUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.codeCreditaireUser", request.getLocale());
					codeuser = Session.getCodeuser(request);
					codeIdentification = Session.getCodeCreditaire(request);
					libIdentificationUser = Session.getNomppm(request);
				} else if (typeuser.equals(sn.com.douane.utils.ConstManif.TYPE_USER_CONSIGNATAIRE)) {
					nomEnteteUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.nomEnteteUserConsignataire",request.getLocale());
					nomUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.nomUserConsignataire",request.getLocale());
					codePpmUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.codePpmUser",	request.getLocale());
					codeCreditaireUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.codeCreditaireUser", request.getLocale());
					codeuser = Session.getCodeuser(request);
					codeIdentification = Session.getCodeConsignataire(request);
					libIdentificationUser = Session.getNomppm(request);
				} else if (typeuser
						.equals(sn.com.douane.utils.ConstManif.TYPE_USER_DOUANIER)) {
					nomEnteteUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.nomUserDouanier",request.getLocale());
					codePpmUser = sn.com.douane.web.rc.Session.getMessageProperties("EnteteModule.codeAgentUserDouanier",request.getLocale());
					codeCreditaireUser = sn.com.douane.web.rc.Session.getMessageProperties(
									"EnteteModule.codeCreditaireUser",
									request.getLocale());
					codeuser = Session.getCodeuser(request);
					codeIdentification = Session.getCodeagent(request);
					bureau = Session.getCodeBurAct(request);
					libIdentificationUser = libProfil;
					labelBureau = "&nbsp;-&nbsp; Bureau:";
				} else if (typeuser
						.equals(sn.com.douane.utils.ConstManif.TYPE_USER_TRESOR)) {
					nomEnteteUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.nomEnteteUserPercepteur",
									request.getLocale());
					nomUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.nomUserPercepteur",
									request.getLocale());
					codePpmUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.codeUserPercepteur",
									request.getLocale());
					codeCreditaireUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.codeCreditaireUser",
									request.getLocale());
					codeuser = Session.getCodeuser(request);
					codeIdentification = Session.getCodeConsignataire(request);
					libIdentificationUser = utilis;
				} else if (typeuser
						.equals(sn.com.douane.utils.ConstManif.TYPE_USER_RC)) {
					nomEnteteUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.nomEnteteUserRc",
									request.getLocale());
					nomUser = sn.com.douane.web.rc.Session
							.getMessageProperties("EnteteModule.nomUserRc",
									request.getLocale());
					codePpmUser = sn.com.douane.web.rc.Session
							.getMessageProperties("EnteteModule.codeUserRc",
									request.getLocale());
					codeCreditaireUser = sn.com.douane.web.rc.Session
							.getMessageProperties(
									"EnteteModule.codeCreditaireRc",
									request.getLocale());
					codeuser = libProfil;
					codeIdentification = Session.getCodeuser(request);
					libIdentificationUser = utilis;
				}
				bureau = Session.getCodeBurAct(request);
			} catch (Exception e) {
				System.out.println(" Index JSP ERROR = " + e.getMessage());
			}
			if (bureau == null)
				bureau = "";
			if (nomUser == null)
				nomUser = "";
			if (codePpmUser == null)
				codePpmUser = "";
			if (codeCreditaireUser == null)
				codeCreditaireUser = "";
			if (codeuser == null)
				codeuser = "";
			if (codeIdentification == null)
				codeIdentification = "";
			if (libIdentificationUser == null)
				libIdentificationUser = "";
			if (versionConnect != null && versionConnect.equals("T")) {
				bgcolorVersionTest = sn.com.douane.web.rc.Session
						.getMessageProperties("bgcolorVersionTest",
								request.getLocale());
				bgimageVersionTest = sn.com.douane.web.rc.Session
						.getMessageProperties("bgimageVersionTest",
								request.getLocale());
			} else {
				bgcolorVersionTest = sn.com.douane.web.rc.Session
						.getMessageProperties("bgcolorVersionProd",
								request.getLocale());
				;
			}
			String label = "";
			String ctxmenu = (String) request.getSession().getAttribute(
					sn.com.douane.utils.ConstManif.CTXMENU);
			String pageF = request
					.getParameter(sn.com.douane.utils.ConstManif.PAGE);
			String pageAtt = (String) request.getSession().getAttribute(
					sn.com.douane.utils.ConstManif.PAGE);
			String pageForward = (String) request.getParameter("forward");
			System.out.println("ctxmenu 2 = " + ctxmenu + " label 2 = " + label + " pageF 2=" + pageF);
			if (pageF == null || pageF.equals("")) {
				if (pageAtt == null || pageAtt.equals("")) {
					if (pageForward == null || pageForward.equals("")) {
						pageF = ctxmenu;
					} else {
						pageF = pageForward;
					}
				} else {
					pageF = pageAtt;
				}
			}
			System.out.println(" PAGEF 2 = " + pageF);
			if (pageF != null && !pageF.equals("") && !pageF.equals("menu")
					&& !pageF.equals("Transbordement.menu")
					&& !pageF.equals("index")) {
				try {
					if (pageF.equals("rechercheManifeste") && ctxmenu != null
							&& !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu,
										request.getLocale());
					else if (pageF.equals("rechercherCredit")
							&& ctxmenu != null && !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu,
										request.getLocale());
					else if (pageF.equals("rechercherDeclaration")
							&& ctxmenu != null && !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu.trim(),
										request.getLocale());
					else if (pageF.equals("DemandesDeclaration.searchForm")
							&& ctxmenu != null && !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu.trim(),
										request.getLocale());
					else if (pageF.equals("DemandesDeclaration.editSaisieForm")
							&& ctxmenu != null && !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu.trim(),
										request.getLocale());
					else if (pageF
							.equals("DemandesDeclaration.editArticlesForm")
							&& ctxmenu != null && !ctxmenu.equals(""))
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + ctxmenu.trim(),
										request.getLocale());
					else
						label = sn.com.douane.web.rc.Session
								.getMessageProperties("menu." + pageF.trim(),
										request.getLocale());

				} catch (Exception e) {
					label = "menu." + pageF;
				}
				System.out.println("ctxmenu = " + ctxmenu + " label 2 = " + label
						+ " pageF =" + pageF);
				if ((String) request.getSession().getAttribute(
						sn.com.douane.utils.ConstManif.PAGE) != null)
					request.getSession().setAttribute(
							sn.com.douane.utils.ConstManif.PAGE, "");
			} else {
				label = "";
				System.out.println(" LABEL 2 = " + label);
				
			}
		%>
	<table cellspacing="1" cellpadding="0" border="0" width="800" align="center" bgcolor="#336699">
		<tr>
			<td align="left" bgcolor="#fffbff" valign="top" height="15">
					<s:actionerror />
					<s:actionmessage />
			</td>
		</tr>	

		<tr>
			<td bgcolor="#FFFFFF" valign="top">
				<table cellspacing="1" cellpadding="1" border="0" width="100%"
					height="400" align="left" 
					bgcolor="<%=bgcolorVersionTest%>">
					<tr valign="top">
						<td align="left">
						<tiles:insertAttribute name="content" />
			
						</td>
					</tr>
					
				</table></td>
		</tr>
	</table>
</body>

</html>