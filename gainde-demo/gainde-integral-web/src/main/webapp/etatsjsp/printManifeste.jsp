<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<style type="text/css">
@import url(config/default.css);
</style>
<title>Print Declaration</title>
<script src="<%= request.getContextPath()%>/config/Jscript/functions.js"
	type="text/javascript"></script>
</head>

<body>

	<s:form method="post" width="100%" theme="simple" onsubmit="return (false)">
	
		<table cellspacing='0' cellpadding='0' border='0' width='1024' align='center'>
			<tr>
				<td align="center" style='height:45px'>
					<s:submit key="Imprimer" cssClass="buttonBar" onclick="printManifesteReport()" />
				</td>
			</tr>
			<s:iterator value="listSegGen">
				<tr>
					<td>
						<!-- ENTETE  -->
						<table border='0' style='background-image: url(<%= request.getContextPath()%>/Etats/Entete_Man.gif); background-repeat: no-repeat;'
							WIDTH='1024' HEIGHT='100%'>
							<tr height='70px' valign='bottom'>
								<td valign='center' align='right' style='padding-right: 90px; padding-top: 25px; padding-bottom: 15px;width: 8%'>
										<font size='2' face='tahoma'> 
											<s:property value="nbrePage" /> / <s:property value="totalPages" />
										</font>
								</td>
							</tr>
							<tr height='40px' valign='center'>
								<td>
									<table border='0' width='1024' height='100%'>
										<tr>
											<td align='left' style='padding-left: 10px; width: 15%'>
												<font size='2' face='tahoma'> <s:property
														value="bureauEnregLib" />
											</font>
											</td>
											<td align='left' style='padding-left: 15px; width: 11%'>
												<font size='2' face='tahoma'> <s:property
														value="numenregmanif" />
											</font>
											</td>
											<td align='left' style='width: 8%'><font size='2'
												face='tahoma'> <s:property
														value="manifdateenregmanif" />
											</font></td>
											<td align='left' style='width: 15%'><font size='2'
												face='tahoma'> <s:property
														value="manifmoyentransport" />
											</font></td>
											<td align='left' style='width: 10%'><font size='2'
												face='tahoma'> <s:property
														value="manifpavillonnavire" />
											</font></td>
											<td align='left' style='width: 9%'><font size='2'
												face='tahoma'> <s:property value="manifdatearrivee" />
											</font></td>
											<td align='left' style='width: 10%'><font size='2'
												face='tahoma'> <s:property value="manifjaugebrute" />
											</font></td>
											<td align='left' style='width: 9%'><font size='2'
												face='tahoma'> <s:property value="manifJaugeNette" />
											</font></td>
											<td align='left' style='width: 9%'><font size='2'
												face='tahoma'> <s:property
														value="numListManifCodePaysProvenanceOB" />
											</font></td>
										</tr>
									</table>
								</td>
							</tr>
							<tr height='41px' valign='center'>
								<td>
									<table border='0' width='1024' height='100%'>
										<tr>
											<td valign='bottom' align='left'
												style='padding-left: 10px; width: 15%'><font size='2'
												face='tahoma'> <s:property
														value="manifCodeConsignataire" /> / <s:property
														value="prenomPpm" />
											</font></td>
											<td valign='bottom' align='center' style='width: 13%'><font
												size='2' face='tahoma'></font></td>
											<td valign='bottom' align='center' style='width: 13%'><font
												size='2' face='tahoma'></font></td>
											<td valign='bottom' align='left'
												style='padding-left: 10px; width: 18%'><font size='2'
												face='tahoma'> <s:property value="manifValeurApprox" />
											</font></td>
											<td valign='bottom' align='left' style='width: 3%'><font
												size='2' face='tahoma'> <s:property
														value="manifDernierArticle" />
											</font></td>
											<td valign='bottom' align='left' style='width: 15%'><font
												size='2' face='tahoma'> <s:property
														value="codeLieuEmb" />
											</font></td>
											<td valign='bottom' align='left' style='width: 10%'><font
												size='2' face='tahoma'> <s:property
														value="dateEmbarq" />
											</font></td>
										</tr>
									</table>
								</td>
							</tr>
						</table>
						<!-- Details articles manifeste -->

						<table border='0' align='center'
							style='background-image: url(<%= request.getContextPath()%>/Etats/Detail_Man.gif);background-repeat: no-repeat;'
							WIDTH='100%' HEIGHT='560px'>
							<s:iterator value="listSegGen" >
								<tr>
									<td height='20px'></td>
								</tr>
								<tr valign='top'>
									<td>
										<table WIDTH='100%' border='0'>
											<tr>
												<td valign='top' align='center'
													style='padding-left: 8px; width: 10%'><font size='2'
													face='tahoma'> <s:property value="numArticleLong" />
												</font></td>
												<td valign='top' align='center' style='width: 10%'><font
													size='2' face='tahoma'> <s:property
															value="titreTransp" />
												</font></td>
												<td valign='top' style='padding-left: 10px; width: 28%'>
													<font size='2' face='tahoma'> <s:property
															value="expediteur" /> / <s:property value="destinataire" />
												</font>
												</td>
												<td valign='top' style='padding-left: 5px; width: 15%'>
													<font size='2' face='tahoma'> <s:property
															value="marquesColis" />
												</font>
												</td>
												<td valign='top' style='padding-left: 5px; width: 17%'>
													<font size='2' face='tahoma'> <s:property
															value="designationCom" />
												</font>
												</td>
												<td valign='top' align='left' style='width: 10%'><font
													size='2' face='tahoma'> <s:property value="nbrColis" />
												</font></td>
												<td valign='top' align='left' style='padding-left: 10px;'>
													<font size='2' face='tahoma'><s:property
															value="pdsBrut" />
												</font>
												</td>
											</tr>
											<s:iterator value="listConteneur">
												<tr >
													<td valign='top' align='center'
														style='padding-left: 8px; width: 10%'><font size='2'
														face='tahoma'>&nbsp; </font></td>
													<td valign='top' align='center' style='width: 10%'><font
														size='2' face='tahoma'>&nbsp;</font></td>
													<td valign='top' style='padding-left: 10px; width: 28%'>
														<font size='2' face='tahoma'>&nbsp; </font>
													</td>
													<td valign='top' style='padding-left: 0px; width: 15%'>
														<font size='2' face='tahoma'> <s:property
																value="manifNumConteneurs" /> &nbsp; <s:property
																value="manifNumPlomb" />
													</font>
													</td>
													<td valign='top' style='padding-left: 5px; width: 17%'>
														<font size='2' face='tahoma'>&nbsp; </font>
													</td>
													<td valign='top' align='left' style='width: 10%'><font
														size='2' face='tahoma'>&nbsp; </font></td>
													<td valign='top' align='left' style='padding-left: 10px;'>
														<font size='2' face='tahoma'>&nbsp; </font>
													</td>
												</tr>
											</s:iterator>
										</table>
									</td>
								</tr>
							</s:iterator>
						</table>
			</s:iterator>
		</table>

		<s:hidden id="annee" name="annee" value="%{anneeengmanif}" />
		<s:hidden id="consignataire" name="consignataire" value="%{manifCodeConsignataire}" />
		<s:hidden id="numRep" name="numRep" value="%{manifnumrep}" />

		

	</s:form>

</body>

</html>