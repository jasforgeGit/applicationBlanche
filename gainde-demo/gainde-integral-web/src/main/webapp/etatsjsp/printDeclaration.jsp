<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
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
			<s:submit key="Imprimer" cssClass="buttonBar" onclick="printReport()" />
		</td>
	</tr>
	<s:iterator value="listSegGenDec" >
		<tr>
			<td>	
				<table border='0' align='center'
					style='background-image: url(<%= request.getContextPath()%>/Etats/EnteteDcl.gif); background-repeat: no-repeat;'
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
					<tr height='50px'>
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
					<tr height='50px' valign='middle'>
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
					<tr height='50px' valign='middle'>
						<td>
							<table border='0' width='740'>
								<tr>
									<td valign='top' rowspan='2' valign='top' style='padding-left: 10px; width: 40%'>
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
									<td valign='bottom' align='center' style='padding-left: 5px; '>
										<font size='2' face='Arial Narrow'>
											<s:property value="decCodeCreditaire" />
										</font>
									</td>
									<td valign='bottom' align='left'style='padding-left: 10px; '>
										<font size='2' face='Arial Narrow'>
											<s:property value="decCodeAgree" /> 
										</font>
									</td>
									<td valign='bottom' style='padding-left: 25px; ' align='left'>
										<font size='2' face='Arial Narrow'>
											<s:property value="TNUM_declBureauFrontiere" />
										</font>
									</td>
									<td valign='bottom'	style='padding-left: 10px; ' align='center'>
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
					<tr height='50px' valign='bottom'>
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
	<table border='0' align='center' style='background-image: url(<%= request.getContextPath()%>/Etats/article.gif); background-repeat: no-repeat;' WIDTH='100%' HEIGHT='255px'>
		<tr valign='center' height='50px'>
			<td>
				<table height='40px' border='0' width='740'>
					<tr>
						<td valign='bottom' style='padding-left: 8px; width: 5%'>
							<font size='2' face='Arial Narrow'> 
								<s:property value="decNumArtDec" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 11%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decRegFiscal" />
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 28%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="numApurementArt" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 12%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decNbreColisDecl" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="nomenclature" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decPoidsBrutDec" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='padding-left: 7px;'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decPdNetDec" /> 
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='90px'>
			<td>
				<table height='90px' border='0' width='740'>
					<tr height='40px'>
						<td valign='top' rowspan='2' style='padding-left: 7px; width: 53%'>
							<font size='2' face='Arial Narrow'>
								<s:set name="decNumTitreTrans" value="decNumTitreTrans" />
								<s:set name="rcLibelleLieuEmb" value="rcLibelleLieuEmb" />
								<s:set name="manifDateEmb" value="manifDateEmb" />
								<s:set name="manifDateValidart" value="manifDateValidart" />
								<s:set name="decDesCommerciale" value="decDesCommerciale" />
								<s:set name="rcLibelleTarif" value="rcLibelleTarif" />
								<s:if test="%{#decNumTitreTrans!=null}">
									CN : <s:property value="decNumTitreTrans" /> </s:if>
								<s:if test="%{#rcLibelleLieuEmb!=null}">/
									<s:property value="rcLibelleLieuEmb" />
								</s:if><br/>
								<s:if test="%{#manifDateEmb!=null}">
									DT EMBT : <s:property value="manifDateEmb" /><br/>
								</s:if>
								<s:if test="%{#manifDateValidart!=null}">
									DATE ENREG ART.MANIF : <s:property value="manifDateValidart" /><br/>
								</s:if>
								<s:if test="%{#decDesCommerciale!=null}">
									DESCRIPTION COMMERCIALE :<s:property value="decDesCommerciale" /> <br/>
								</s:if>
								<s:if test="%{#rcLibelleTarif!=null}">
									LIBELLE DU TARIF : <s:property value="rcLibelleTarif"  />
								</s:if>
							</font>
						</td>
						<td valign='center' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decQteComplement" /> 
							</font>
						</td>
						<td valign='center' align='center'	style='padding-left: 5px; width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decQteMerc" /> 
							</font>
						</td>
						<td valign='center' align='center'	style='padding-left: 40px; width: 5%'>
							<font size='2'	face='Arial Narrow'>
								<s:property value="decPaysOrigine" />
							</font>
						</td>
						<td valign='center' align='right' style=''>
							<font size='2' face='Arial Narrow'></font>
						</td>
					</tr>
					<tr>
						<td valign='center' align='right' style='padding-bottom: 10px; padding-right: 50px; width: 30%'colspan='2'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decMtCfaFob" /> 
							</font>
						</td>
						<td valign='center' align='right' style='padding-bottom: 10px; width: 30%' colspan='2'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decValDouane" /> 
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='90px'>
			<td>
				<table height='90px' border='0' width='740'>
					<tr height='20px'>
						<td valign='top' rowspan='2' style='padding-left: 7px; width: 52%'>
							<font size='2' face='Arial Narrow'>
									CODE PIECES JOINTES PARTICULIERES :  <BR>
									<s:property value="numDPI" /><s:property value="numAV" /><br/>
									<s:property value="numTitreExo" /><br/>
									<s:property value="ppmUserFinal" />
							</font>
						</td>
						<td valign='center' align='left' style='padding-left: 10px; width: 48%'>
							<font size='2' face='Arial Narrow'>
							<s:set name="decAgreeEntCedeao" value="decAgreeEntCedeao" />
							<s:set name="ninea" value="TNUM_declNumNineaDestinataire" />
							<s:if test="%{#decAgreeEntCedeao!=null}">
								<s:property value="typeTaxation" /><br/>
								PRODUIT INDUSTRIEL AGREE<br/>
								AGREMENT N°: <s:property value="decAgreeEntCedeao" /><br/>
							</s:if>
							<s:if test="%{#ninea!=null}">
								NINEA : <s:property value="TNUM_declNumNineaDestinataire" /><br/>
							</s:if>
								<s:property value="rcDesCircuitVisite" />
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
	
<!-- Article 2 -->
	<table border='0' align='center' style='background-image: url(<%= request.getContextPath()%>/Etats/article.gif);  background-repeat: no-repeat;' WIDTH='100%' HEIGHT='255px'>
		<tr valign='center' height='50px'>
			<td>
				<table height='40px' border='0' width='740'>
					<tr>
						<td valign='bottom' style='padding-left: 8px; width: 5%'>
							<font size='2' face='Arial Narrow'> 
								<s:property value="decNumArtDec2" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 11%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decRegFiscal2" />
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 28%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="numApurementArt2" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 12%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decNbreColisDecl2" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="nomenclature2" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decPoidsBrutDec2" /> 
							</font>
						</td>
						<td valign='bottom' align='center' style='padding-left: 7px;'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decPdNetDec2" /> 
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='90px'>
			<td>
				<table height='90px' border='0' width='740'>
					<tr height='40px'>
						<td valign='top' rowspan='2' style='padding-left: 7px; width: 53%'>
							<font size='2' face='Arial Narrow'>
								<s:set name="decNumTitreTrans2" value="decNumTitreTrans2" />
								<s:set name="rcLibelleLieuEmb2" value="rcLibelleLieuEmb2" />
								<s:set name="manifDateEmb2" value="manifDateEmb2" />
								<s:set name="manifDateValidart2" value="manifDateValidart2" />
								<s:set name="decDesCommerciale2" value="decDesCommerciale2" />
								<s:set name="rcLibelleTarif2" value="rcLibelleTarif2" />
								<s:if test="%{#decNumTitreTrans2!=null}">
									CN : <s:property value="decNumTitreTrans2" /> </s:if>
								<s:if test="%{#rcLibelleLieuEmb2!=null}">/
									<s:property value="rcLibelleLieuEmb2" />
								</s:if><br/>
								<s:if test="%{#manifDateEmb2!=null}">
									DT EMBT : <s:property value="manifDateEmb2" /><br/>
								</s:if>
								<s:if test="%{#manifDateValidart2!=null}">
									DATE ENREG ART.MANIF : <s:property value="manifDateValidart2" /><br/>
								</s:if>
								<s:if test="%{#decDesCommerciale2!=null}">
									DESCRIPTION COMMERCIALE :<s:property value="decDesCommerciale2" /> <br/>
								</s:if>
								<s:if test="%{#rcLibelleTarif2!=null}">
									LIBELLE DU TARIF : <s:property value="rcLibelleTarif2"  />
								</s:if>
							</font>
						</td>
						<td valign='center' align='center' style='width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decQteComplement2" /> 
							</font>
						</td>
						<td valign='center' align='center'	style='padding-left: 5px; width: 15%'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decQteMerc2" /> 
							</font>
						</td>
						<td valign='center' align='center'	style='padding-left: 40px; width: 5%'>
							<font size='2'	face='Arial Narrow'>
								<s:property value="decPaysOrigine2" />
							</font>
						</td>
						<td valign='center' align='right' style=''>
							<font size='2' face='Arial Narrow'></font>
						</td>
					</tr>
					<tr>
						<td valign='center' align='right' style='padding-bottom: 10px; padding-right: 50px; width: 30%'colspan='2'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decMtCfaFob2" /> 
							</font>
						</td>
						<td valign='center' align='right' style='padding-bottom: 10px; width: 30%' colspan='2'>
							<font size='2' face='Arial Narrow'>
								<s:property value="decValDouane2" /> 
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr valign='top' height='90px'>
			<td>
				<table height='90px' border='0' width='740'>
					<tr height='20px'>
						<td valign='top' rowspan='2' style='padding-left: 7px; width: 52%'>
							<font size='2' face='Arial Narrow'>
								<s:set name="decNumArtDec2" value="decNumArtDec2" />
								<s:if test="%{#decNumArtDec2!=null}">/
									CODE PIECES JOINTES PARTICULIERES :  <BR>
								</s:if>
									<s:property value="numDPI2" /><s:property value="numAV2" /><br/>
									<s:property value="numTitreExo2" /><br/>
									<s:property value="ppmUserFinal2" />
							</font>
						</td>
						<td valign='center' align='left' style='padding-left: 10px; width: 48%'>
							<font size='2' face='Arial Narrow'>
								<s:set name="decAgreeEntCedeao2" value="decAgreeEntCedeao2" />
								<s:set name="ninea" value="TNUM_declNumNineaDestinataire" />
								<s:if test="%{#decAgreeEntCedeao2!=null}">
									<s:property value="typeTaxation2" /><br/>
									PRODUIT INDUSTRIEL AGREE<br/>
									AGREMENT N°: <s:property value="decAgreeEntCedeao2" /><br/>
								</s:if>
								<s:if test="%{#ninea!=null && #decNumArtDec2!=null}">
									NINEA : <s:property value="TNUM_declNumNineaDestinataire" /><br/>
								</s:if>
								<s:property value="rcDesCircuitVisite2" />
							</font>
						</td>
					</tr>
				</table>
			</td>
		</tr>
	</table>
<!-- Taxe -->

	<table align='center' border='0' style='background-image: url(<%= request.getContextPath()%>/Etats/pied.gif);background-repeat:no-repeat;' WIDTH='100%' HEIGHT='255px'>
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
								<s:property value="decNumArtDec2" />
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
								 		<td valign='top' align='center' style='padding-right:5px;padding-top:5px;width:40%'>
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