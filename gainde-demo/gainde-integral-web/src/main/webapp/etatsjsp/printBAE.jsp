<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
	<head>
		<style type="text/css"> @import url(config/default.css);</style>
		<title>Print Declaration</title>
		<script src="<%= request.getContextPath()%>/config/Jscript/functions.js" type="text/javascript"></script>
	</head>

<body>

<s:form method="post" width="100%" theme="simple"  onsubmit="return (false)">

<!-- ENTETE  -->

<table width="790px">
	<tr>
		<td align="center" style='height:45px'>
			<s:submit key="Imprimer" cssClass="buttonBar" onclick="printBAEReport()" />
		</td>
	</tr>
	<s:iterator value="listSegGenDec" >
		<tr>
			<td>	
				<table border='0' align='center' style='background-image: url(<%= request.getContextPath()%>/Etats/enteteDcl1.gif); background-repeat: no-repeat;'
					WIDTH='100%' HEIGHT='255px'>
					<tr height='8px' valign='top'>
						<td>
							<table border='0' width='740'>
								<tr>
									<td valign='top'>
										<font size='2' face='Arial Narrow'>
										</font>
									</td>
									<td valign='top' style='padding-left: 180px; width: 90%'>
										<font size='2' face='Arial Narrow'><s:property value="libelleRegimeDouanier" /></font>
									</td>
									<td valign='top' style='padding-left: 60px; width: 10%'>
										<font size='2' face='Arial Narrow'><s:property value="nbrePages" /></font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height='10px'>
						<td></td>
					</tr>
					<tr height='50px' valign='top'>
						<td>
							<table border='0' width='740'>
								<tr valign='top'>
									<td valign='top' style='padding-left: 10px; width: 20%'>
										<font size='2' face='Arial Narrow'>
										<s:property value="TNUM_LIST_declCodePPM"/>&nbsp;&nbsp;
										<s:property value="NUM_declppm"/>
										</font>
									</td>
									<td valign='top' align='center' style='width: 15%'>
										<font size='2' face='Arial Narrow'><s:property value="TNUM_declContribuableDestinataire"/></font>
									</td>
									<td valign='top' align='center' style=' width: 7%'>
										<font size='2' face='Arial Narrow'><s:property  value="TNUM_LIST_declCodeRegimeDouanier_OB"/> </font>
									</td>
									<td valign='top' align='center' style='width: 7%'>
										<font size='2' face='Arial Narrow'><s:property value="TNUM_declDossier"/></font>
									</td>
									<td valign='top' align='center' style='padding-left: 10px; width: 12%'>
										<font size='2'	face='Arial Narrow'><s:property value="DAT_declDateEnregistrement"/></font>
									</td>
									<td valign='top' align='right'	style='padding-right: 20px; width: 10%'>
										<font size='2' face='Arial Narrow'> <s:property value="TNUM_declNumeroRepertoire" /></font>
									</td>
									<td valign='top' align='right' style='width: 10%'>
										<font size='2' face='Arial Narrow'><s:property value="numDeclaration"/></font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height='40px'>
						<td>
							<table border='0' width='740'>
								<tr>
									<td valign='top' style='padding-left: 10px; width: 50%;'>
										<font size='2' face='Arial Narrow'>
											<!-- voPrint.getP_decnomdestinataire()+"+voPrint.getP_adrcompletedest()-->
											<s:property value="nomPpm" /><br/><s:property value="adrCompleteDeclarant" /></font>
									</td>
									<td valign='top' style='padding-left: 10px; width: 46%;'>
										<font size='2' face='Arial Narrow'>
											<s:property value="ppmDecl"/>&nbsp;&nbsp;
											<s:property value="nomDeclarant"/><br/>
											<s:property  value="adrcompletedeclarant"/>
										</font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height='50px' valign='top'>
						<td>
							<table border='0' width='740'>
								<tr>
									<td valign='top' rowspan='2' valign='top' style='padding-left: 10px; width: 44%'>
										<font size='2'	face='Arial Narrow'>
											<s:property value="typeApur"/>&nbsp;<s:property value="numApurement" /><br/>
											<s:property value="modeTransport" /><br/>
											<s:property value="nomNavire"/>
											<s:property value="manifNumVoyage"/><br/>
											<s:property value="dateArrivee" />
										</font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 10px; '>
										<font size='2' face='Arial Narrow'>
											<s:property value="decRefDecl" />
										</font>
									</td>
									<td valign='bottom' align='right' style='padding-left: 5px; '>
										<font size='2' face='Arial Narrow'>
											<s:property value="decCodeCreditaire" />
										</font>
									</td>
									<td valign='bottom' align='right'style='padding-left: 10px; '>
										<font size='2' face='Arial Narrow'>
											<s:property value="decCodeAgree" /> 
										</font>
									</td>
									<td valign='bottom' style='padding-left: 5px; ' align='right'>
										<font size='2' face='Arial Narrow'>
											<s:property value="TNUM_declBureauFrontiere" />
										</font>
									</td>
									<td valign='bottom'	style='padding-left: 10px; ' align='right'>
										<font size='2' face='Arial Narrow'>
											<s:property value="TNUM_declNbreArticles" />
										</font>
									</td>
								</tr>
								<tr height="45px">
									<td valign='bottom' align='center'
										style='padding-left: 10px;' width="20%"><font
										size='2' face='Arial Narrow'>
											<s:property value="decMontCfaFacture" />
									</font></td>
									<td valign='bottom' align='center'
										style='padding-right: 30px;' colspan='2'  width="20%">
										<font size='2' face='Arial Narrow'>
											<s:property value="totalFob" /></font>
									</td>
									<td valign='bottom' align='center' style=' padding-left: 10px;' width="20%" colspan='2'>
										<font size='2' face='Arial Narrow'>
											<s:property value="totalDouane" /></font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
					<tr height='50px'>
						<td>
							<table border='0' width='740'>
								<tr>
									<td valign='bottom' align='center' style='padding-left: 10px; width: 10%'>
										<font size='2' face='Arial Narrow'>
											<s:property value="TNUM_LIST_declPaysProvenance" />
										</font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 10px; width: 10%'>
										<font size='2' face='Arial Narrow'>
											<s:property value="paysDestination" /> </font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 18px; width: 10%'>
										<font size='2'	face='Arial Narrow'>
											<s:property value="TNUM_declCodeBur" /> </font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 10px; width: 15%'>
										<font size='2'	face='Arial Narrow'>
											<s:property value="TNUM_declModePaiement" />
										</font>
									</td>
									<td valign='bottom' align='center' style='padding-right: 5px; width: 18%'>
										<font size='2' face='Arial Narrow'>
											<s:property value="totalAssurCfa" /> 
										</font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 5px;' colspan='2'>
										<font size='2' face='Arial Narrow'>
											<s:property value="montCfaFret" /> 
										</font>
									</td>
									<td valign='bottom' align='center' style='padding-left: 10px;' colspan='2'>
										<font size='2' face='Arial Narrow'>
											<s:property value="totalAutres" /> 
										</font>
									</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			
			<!-- Article 1 -->
 			<table border='0' align='center' style='background-image: url(<%= request.getContextPath()%>/Etats/articleBAE.gif);background-repeat:no-repeat;' WIDTH='100%' HEIGHT='255px'>
                <tr valign='center' height='50px' >
                	<td>
                		<table height='100%' border='0' width='100%'>
                			<tr height='10%'> 
                				<td valign='top' style='padding-left:120px;'>
                					<FONT size='2' face='tahoma'>
						                 <s:property value="decNumArtDec" />
						             </FONT>
                				</TD>
                			</tr>
                			<tr height='90%'> 
                				<td valign='top'><FONT size='2' face='tahoma'>
                					<s:property value="stringProduit" /><br/>
                					<s:property value="stringMatPrem" /><br/>
                					<s:property value="stringAutres" /><br/>
   						            <s:iterator value="listSegContDec">
					             		<b><s:property value="decNumConteneur" />&nbsp;&nbsp;&nbsp;
					             		<s:property value="decNumeroPlomb" /></b> 
					               	</s:iterator>
				 				 </FONT>
                				</td>
                			</tr>
               			</table>
                	</td>
                </tr>
             </table>
                		
<!-- Article 2 -->
	<table border='0' align='center' style='background-image: url(<%= request.getContextPath()%>/Etats/articleBAE.gif);background-repeat:no-repeat;' WIDTH='100%' HEIGHT='255px'>
                <tr valign='center' height='50px' >
                	<td>
                		<table height='100%' border='0' width='100%'>
                			<tr height='10%'> 
                				<td valign='top' style='padding-left:120px;'>
                					<FONT size='2' face='tahoma'>
						                 <s:property value="decNumArtDec2" />
						             </FONT>
                				</TD>
                			</tr>
                			<tr height='90%'> 
                				<td valign='top'><FONT size='2' face='tahoma'>
                					<s:property value="stringProduit2" /><br/>
                					<s:property value="stringMatPrem2" /><br/>
                					<s:property value="stringAutres2" /><br/>
   						            <s:iterator value="listSegContDec2">
					             		<b><s:property value="decNumConteneur" />&nbsp;&nbsp;&nbsp;
					             		<s:property value="decNumeroPlomb" /></b> 
					               	</s:iterator>
				 				 </FONT>
                				</td>
                			</tr>
               			</table>
                	</td>
                </tr>
             </table>
<!-- Taxe -->

	<table align='center' border='0' style='background-image: url(<%= request.getContextPath()%>/Etats/__pied.gif);background-repeat:no-repeat;' WIDTH='100%' HEIGHT='255px'>
		<tr valign='top' height='15px'>
			<td>
				<table height='40px' border='0' width='740'>
					<tr height='20px'> 
						<td valign='center' style='padding-bottom:15px;padding-left:115px;width:52%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decNumArtDec" />
							</font>
						</td>
						<td valign='center'  style='padding-bottom:15px;padding-left:15px;width:48%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decNumArtDec2" />&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
								<s:property value="codeSecret" />
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='80px'>
			<td>
				<table height='160px' border='0' width='740'>
					<tr height='20px'> 
						<td valign='top' align='center' style='padding-top:5px;width:5%'>
							<table>
						 		<s:iterator value="listCodeTaxes">
						 		<tr>
							 		<td>
							 			<font size='2' face='Arial Narrow'>
							 				<s:property value="codetaxe"/>
							 			</font>
							 		</td>
						 		</tr>
						 		</s:iterator>	
						 	</table>
						</td>
						<td colspan="3" valign='top' style='padding-top:5px;width:30%'>
							<table width="100%">
						 		<s:iterator value="listLiquidArtDecl1">
							 		<tr>
								 		<td valign='top' align='center' style='padding-top:5px;width:35%'>
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decBaseTaxeLiq"/>
								 			</font>
								 		</td>
								 		<td valign='top' align='center' style='padding-top:5px;width:35%' width="35%">
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decQuotiteLiq"/>
								 			</font>
								 		</td>
								 		<td valign='top' align='left' style='padding-right:5px;padding-top:5px;width:40%'>
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decMtTaxeLiq"/>
								 			</font>
								 		</td>
							 		</tr>
						 		</s:iterator>	
						 	</table>
						</td>
						<td colspan="3" valign='top' style='padding-top:5px;width:30%'>
							<table width="100%">
						 		<s:iterator value="listLiquidArtDecl2">
							 		<tr>
								 		<td valign='top' align='center' style='padding-top:5px;width:35%'>
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decBaseTaxeLiq"/>
								 			</font>
								 		</td>
								 		<td valign='top' align='center' style='padding-top:5px;width:35%'>
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decQuotiteLiq"/>
								 			</font>
								 		</td>
								 		<td valign='top' align='center' style='padding-right:5px;padding-top:5px;width:40%'>
								 			<font size='2' face='Arial Narrow'>
								 				<s:property value="decMtTaxeLiq"/>
								 			</font>
								 		</td>
							 		</tr>
						 		</s:iterator>	
						 	</table>
						</td>
						<td valign='top' align='right' style='padding-right:5px;padding-top:5px;' width="10%">
							 <table>
						 		<s:iterator value="listReportTotal">
						 		<tr>
							 		<td>
							 			<font size='2' face='Arial Narrow'>
							 				<s:property value="totalMnttaxLiq"/>
							 			</font>
							 		</td>
						 		</tr>
						 		</s:iterator>	
						 	</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='50px'>
			<td>
				<table height='30px' border='0' width='740'>
					<tr height='30px'> 
						<td valign='top' style='padding-top:5px;' align='right'>
							<font size='2' face='Arial Narrow'>
								<s:property value="totalTaxes" /> 
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>				
			</td>
		</tr>
	</s:iterator>
</table>
	<s:hidden id="numDeclaration" name="numDeclaration" value="%{numDeclaration}"></s:hidden>			

	

</s:form>

</body>

</html>