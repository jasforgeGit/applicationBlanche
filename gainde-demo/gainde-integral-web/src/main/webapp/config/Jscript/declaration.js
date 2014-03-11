var errorFound;
function enableButton_demandeModifForm(value,form){
	
	var etatvalue = form.etatsDeclarationsString.value;	
	var etatList = etatvalue.split('##');
	var etat;
	var index; 
	
	for(var i=0;i<etatList.length;i++){
		etat = etatList[i].split('~~');
		index = etat[0]; 
		if(value==index){
			computeEtatsButton(etat,form);
			break; 
		}
	}		
}
function computeEtatsButton(etat,form){
	var etatdecl = etat[1];
	var typemessage = etat[2];
	var dateenlev = etat[3];
	var datebae = etat[4];
	var naturesegment = etat[5];
	var numerosegment = etat[6];
	
	if(etatdecl=='C' || etatdecl=='T' || etatdecl=='R' || etatdecl=='A' || dateenlev!=''){
		
		if(etatdecl=='T') alert("Traitement en cours ou problï¿½me systï¿½me. La modification est interdite");
		if(etatdecl=='R') alert("Rectfication sur dï¿½claration. La modification est interdite");
		if(etatdecl=='A') alert("Annulation sur dï¿½claration. La modification est interdite");
		if(dateenlev!='') alert("Dï¿½claration dï¿½jï¿½ enlevï¿½e. La modification est interdite");
		if(etatdecl=='C') alert("Dï¿½claration sur registre dï¿½pï¿½t. La modification est interdite");
		
					
		doDisable(true,'',true,true,form);
	}
	else if(etatdecl=='M'){
		if(typemessage=='M'){
			alert("Modification sur dï¿½claration envoyï¿½e");
			doDisable(true,'',true,true,form);
		}
		else{
			if(naturesegment == "G" && form.name == "demandeModifSegGenForm"){
				//alert("Modification sur dï¿½claration non envoyï¿½e");
				doDisable('','','','',form);	
			}
			else if(naturesegment == "A" && form.name == "demandeModifSegGenForm"){
				alert("La modification porte sur le segment article numï¿½ro " + numerosegment);
				doDisable(true,'',true,true,form);	
			}
			else if(naturesegment == "A" && form.name == "demandeModifSegArtForm"){
				//alert("La modification porte sur le segment article numï¿½ro " + numerosegment);
				doDisable('','','','',form);	
			}			
			else if(naturesegment == "G" && form.name == "demandeModifSegArtForm"){
				alert("La modification porte sur le segment gï¿½nï¿½ral " + numerosegment);
				doDisable(true,'',true,true,form);	
			}
		}
	}
	else if(etatdecl==''){
		doDisable('','',true,true,form);
	}
	else{
		if(typemessage!=''){
			alert("Demande envoyï¿½e");
			doDisable(true,'',true,true,form);
		}
		else
			doDisable('','',true,true,form);
	}
}


	
function doDisable(disb1,disb2,disb3,disb4,form){	
	form.saisirdemande.disabled=disb1;
	form.editdeclaration.disabled=disb2; 
	if(form.envoyerdemande != null)
		form.envoyerdemande.disabled=disb3; 
	if(form.supprimerdemande != null)
		form.supprimerdemande.disabled=disb4;
}

function compareFieldsFormDemandeModifSeg(form,fields1,fields2){
	//var form = document.forms('demandeModifSegGenForm');
	
	
	//var fields1 = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');
	//var fields1 = new Array('decSegGenCodePPMDestinataire','decSegGenNomDestinataire','decSegGenTypeVoieDestinataire','decSegGenNumVoieDestinataire','decSegGenNomVoieDestinataire','decSegGenVilleDestinataire','decSegGenQuartierDestinataire','decSegGenBpDestinataire','decSegGenNumContribuableDestinataire','decSegGenNumNineaDestinataire',
	//						'decSegGenCodePPMExpediteur','decSegGenNomExpediteur','decSegGenTypeVoieExpediteur','decSegGenNumVoieExpediteur','decSegGenNomVoieExpediteur','decSegGenVilleExpediteur','decSegGenQuartierExpediteur','decSegGenBpExpediteur','decSegGenNumContribuableExpediteur','decSegGenNumNineaExpediteur',
	//						'decSegGenModeTransport','decSegGenMoyenTransport','decSegGenReferenceDeclaration','decSegGenPaysDestination','decSegGenBureauDestination','decSegGenBureauFrontiere');
	
	//var fields2 = new Array('TNUM_LIST_declCodePPM','TNUM_declNomDestinataire','TNUM_declTypeVoieDestinataire','TNUM_declNumVoieDestinataire','TNUM_declNomVoieDestinataire','TXT_declVilleDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumContribuable','TNUM_declNumNineaDestinataire',
	//						'TNUM_LIST_declCodePPMExpediteur','TNUM_declNomExpediteur','TNUM_declTypeVoieExpediteur','TNUM_declNumVoieExpediteur','TNUM_declNomVoieExpediteur','TXT_declVilleExpediteur','TNUM_declQuartierExpediteur','NUM_declBpExpediteur','TNUM_declNumContribuableExpediteur','TNUM_declNumNineaExpediteur',
	//						'TNUM_declModeTransport','TNUM_declMoyenTransport','TNUM_declRefDeclarant','TNUM_LIST_declPaysDestination','TNUM_LIST_declBureauDestination','TNUM_LIST_declBureauxFrontieres_OB');
	
	compareFields(form,fields1,fields2,'#FF0000');		
}

function compareFields(form,tabFields1,tabFields2,color){
	var field1;
	var field2;	
	if(tabFields1!=null)
	
	for( i = 0;i<tabFields1.length;i++){
		field1 = document.getElementsByName(tabFields1[i])[0];
		field2 = document.getElementsByName(tabFields2[i])[0];	
		
		if(field1 != null && field2 != null && field1.value != field2.value){			
			field2.style.color=color;
		}
	}	
}
		
function ctrQuittance(field){
if(field.value!='SUSPEND' && field.value!='suspend'){ 
  if(isNum(field)==false){
     alert('Seuls les caractï¿½res numï¿½riques sont valides ou la valeur SUSPEND !!!'); 
     field.focus();
     return;
  }
  }
}
function styleRadio(){
 var form = document.forms.item(0);
	for (var i=0; i<form.length; i++) {			
	    if(form.elements[i].type=='radio'){
	       form.elements[i].style.background = '#e5f2f4';
	      if(document.getElementById("TNUM_tresorCodeDossier_OBF"))
		     document.getElementById("TNUM_tresorCodeDossier_OBF").style.fontWeight="bold";
	    }
	}
}
function afficheArticleManifAjax(){
 return getArticleAjax('articleManifAjax?getArticleManifAjax&numart='+document.getElementById('NUM_manifNumArt').value
		 +'&prec='+document.getElementById('NUM_manifPrecArt').value
		 +'&prec2='+document.getElementById('NUM_manifPrecArt2').value
		 +'&annee='+document.getElementById('NUM_manifAnnee_OB').value
		 +'&bur='+document.getElementById('TNUM_manifCodeBur_OB').value
		 +'&num='+document.getElementById('NUM_manifNumSeq_OB').value);
}

function controleCritere() {
	 var frm = document.forms.item(0);	
	 checkPeriode('checkPeriodeAction?dat1='+frm.DAT_somDateDebut_Rech.value+'&dat2='+frm.DAT_somDateFin_Rech.value);
}

function checkPeriode(url){
 //Do the Ajax call	
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();
			  req.onreadystatechange = getDiff2Date;
			  try {
				req.open("POST", url, true); //was get
			  } catch (e) {
			
				alert("Problï¿½me de communication au serveur\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = getDiff2Date;
				req.open("POST", url, true);
				req.send();
			  }
			}
}
function getDiff2Date(){	
  //if (req.readyState == 4) { // Complete
	//		  if (req.status == 200) { // OK response
			    var frm = document.forms.item(0);
			    //var tr=""+req.responseText;
				
		 var ok='true';
		 if(frm.NUM_somAnnee_Rech.value==''){
			alert("Il faut renseigner l'annee comme critï¿½re de recherche");
			frm.NUM_somAnnee_Rech.focus();
			ok='false';
		}else
		if(frm.TNUM_somBureau_Rech.value==''){
			alert("Il faut renseigner le bureau comme critï¿½re de recherche");
			frm.TNUM_somBureau_Rech.focus();
			ok='false';
		}else
		if(frm.DAT_somDateDebut_Rech.value=='' && (frm.NUM_somAnnee_Rech.value=='' || frm.TNUM_somBureau_Rech.value=='' || frm.NUM_somNumero_Rech.value=='' ||  frm.NUM_somArticle_Rech.value=='' )){
			alert("Il faut renseigner periode comme critï¿½re de recherche");
			frm.DAT_somDateDebut_Rech.focus();
			ok='false';
		}else
		if(frm.DAT_somDateFin_Rech.value=='' && (frm.NUM_somAnnee_Rech.value=='' || frm.TNUM_somBureau_Rech.value=='' || frm.NUM_somNumero_Rech.value=='' ||  frm.NUM_somArticle_Rech.value=='' )){
			alert("Il faut renseigner periode comme critï¿½re de recherche");
			frm.DAT_somDateFin_Rech.focus();
			ok='false';
		}else
//		  if(frm.hiddenDate.value=='pm'){
//		  //  alert('La periode ne doit pas dï¿½passer un mois');
//		    alert('La periode ne doit pas dï¿½passer un an');
//		    frm.hidden.value='false';
//		  }else
//		    frm.hidden.value='true';
		  
		  if( ok=='true'){
			  doSubmitWithaoutValidate('rechercheSommiersAction','rechercheSommier');
			  if(frm.hiddenDate.value=='pm'){
				    alert('La periode ne doit pas dï¿½passer un an');
			  }
		  }
		   
		//}// else {
				//alert("Problem with server response:\n " + req.statusText);
//			  }
//			}
}
function getArticleAjax(url) {

			//Do the Ajax call
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();
			  req.onreadystatechange = getArticleManifAjax;
			  try {
				req.open("POST", url, true); //was get
			  } catch (e) {
			
				alert("Problï¿½me de communication au serveur\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = getArticleManifAjax;
				req.open("POST", url, true);
				req.send();
			  }
			}//alert('fin retrieceURL');
 }
 function getArticleManifAjax() {
			  if (req.readyState == 4) { // Complete
			  if (req.status == 200) { // OK response

			    var marq='',designcom='',modcond='', lta='';
				var tr=""+req.responseText;
				var str=tr.split('##');

				if(str!='PrdNF'){
				    marq= str[0];
				    designcom= str[1];
				    modcond= str[2];
				    lta= str[3];
			    }

			   if(document.getElementById('TNUM_declNumTitreTrans')){
			     document.getElementById('TNUM_declNumTitreTrans').value=lta;
			     DisableChamp(document.getElementById('TNUM_declNumTitreTrans'));
					//alert(document.getElementById('TNUM_declNumTitreTrans').value);
			    }
			    document.getElementById('TNUM_declMarqueNumero').value=marq;
			    //alert(document.getElementById('TNUM_declMarqueNumero').value);
			    DisableChamp(document.getElementById('TNUM_declMarqueNumero'));
			    document.getElementById('TNUM_declDesignationCommerciale').value=designcom;
			    //alert(document.getElementById('TNUM_declDesignationCommerciale').value);
			    DisableChamp(document.getElementById('TNUM_declDesignationCommerciale'));
				document.getElementById('TXT_LIST_declModeConditionnement_OB').value=modcond;
				//alert(document.getElementById('TXT_LIST_declModeConditionnement_OB').value);
				DisableChamp(document.getElementById('TXT_LIST_declModeConditionnement_OB'));
				if(str=='PrdNF'){
				   EnableChamp(document.getElementById('TNUM_declMarqueNumero'));
				   EnableChamp(document.getElementById('TNUM_declDesignationCommerciale'));
				   EnableChamp(document.getElementById('TXT_LIST_declModeConditionnement_OB'));
				   EnableChamp(document.getElementById('TNUM_declNumTitreTrans'));
				}
			  } else {
				//alert("Problem with server response:\n " + req.statusText);
			  }
			}
}
function afficheProduitModCondPays(){
	 //alert();
	 if(document.getElementById('NUM_LIST_decCodeProd_OB').value=='' && document.getElementById('NUM_LIST_decPrecUemoa_OB').value=='' && document.getElementById('NUM_LIST_decPrecSen_OB').value=='')
	   return getProduitCondPaysAjax('getProduitCondPays?anneesom='+document.getElementById('NUM_decAnneeTitrePrec').value+'&bursom='+document.getElementById('TNUM_decBurTitrePrec').value+'&numtitsom='+document.getElementById('NUM_decNumTitrePrec').value+'&numartsom='+document.getElementById('TNUM_declNumArtManifApure').value);
}
function getProduitCondPaysAjax(url) {
		
			//Do the Ajax call
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();
			  req.onreadystatechange = getProduitCondPays;
			  try {
				req.open("POST", url, true); //was get
			  } catch (e) {
			
				alert("ProblÃ¨me de communication au serveur\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = getProduitCondPays;
				req.open("POST", url, true);
				req.send();
			  }
			}//alert('fin retrieceURL');
 }
		
		   
		  function getProduitCondPays() {
		  
			  if (req.readyState == 4) { // Complete
			  if (req.status == 200) { // OK response
			    
			    var pay='',prod='',precu='',precsen='',modpay='';
				var tr=""+req.responseText;
				var str=tr.split('##');
				//alert(str);
				if(str!='PrdNF'){
			    modpay=str[1];
			    pay=str[2];
			    prod=str[0].split('_')[0];
			    precu=str[0].split('_')[1];
			    precsen=str[0].split('_')[2];
			    }
			    //alert(prod+precu+precsen+modpay+pay);
			    document.getElementById('NUM_LIST_decCodeProd_OB').value=prod;
			    document.getElementById('NUM_LIST_decPrecUemoa_OB').value=precu;
				document.getElementById('NUM_LIST_decPrecSen_OB').value=precsen;
				document.getElementById('TXT_LIST_declModeConditionnement_OB').value=modpay;
				document.getElementById('TXT_LIST_declPaysOrigine_OB').value=pay;
				
				//return 'tr';
			//	alert('tr='+trim(tr.substring(tr.indexOf('#')+1,tr.length))+"-");
				/*if(trim(tr.substring(tr.indexOf('#')+1,tr.length))!="")
				tick2.innerHTML = tr.substring(0,tr.indexOf('#'));
				else
				tick2.innerHTML ="";
				///alert("Ajaxx response:"+tr);*/
				
				
			  } else {
				//alert("Problem with server response:\n " + req.statusText);
			  }
			}
}
function getTypeProduitAjax(url) {
		
			//Do the Ajax call
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();			  
			  req.onreadystatechange = getTypeProduit;
			  try {
				req.open("POST", url, false); //was get
			  } catch (e) {
			
				alert("Probl\u00E9me de communication au serveur\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  //alert('IEEEEE'+url);
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = getTypeProduit;
				req.open("POST", url, false);				
				req.send(null);
			  }
			}
			//alert('fin retrieceURL');
 }
		
		   
function getTypeProduit() {
	errorFound=true;
	if (req.readyState == 4) { // Complete
		if (req.status == 200) { // OK response
			//alert(parseInt(document.getElementById('MNT_declValeurFob').value));
			var tr=""+req.responseText;
		var tb=tr.split('##');
		//alert(tb);
		//alert(tb[0]);
		var tb2 = ""+tb;
		var tbval=tb2.split('~~');
		//alert(tbval);
		var fob=tbval[1];
		//alert('fob before='+fob);
		var fobt=fob.split(' ');
		fob='';
		for(var i=0;i<fobt.length;i++)fob+=fobt[i];
		//alert('fob after='+fob);
		//alert('petrolier='+tb[0]+'--prod exo='+tb[1]+'--ppm exo='+tb[2]+'--error dpi ou av='+tb[3]+'  exemption='+document.getElementById('exemption').value+' valfob='+parseInt(fob)+' ou '+Number(fob));
		var reg=document.getElementById("TNUM_LIST_declCodeRegimeDouanier_OB").value;
		var regfisc=document.getElementById("TNUM_LIST_declRegimeFiscal_OB").value;		
		var valreg=reg+''+regfisc;
		var typeapurement=document.getElementById('TNUM_declTypeApurement_OB').value;
		//Le PVI ne s?applique pas aux r�gimes E, R, au transit (S1,S2) et aux sorties de r�gimes de suspensifs (type apurement ='titre pr�c�dent'.
		if(reg.indexOf('E')!=-1||reg.indexOf('R')!=-1 || reg.indexOf('S1')!=-1 || reg.indexOf('S2')!=-1 || typeapurement=='3'){
			DisableChamp(document.getElementById('TNUM_declNumDPIAn'));
			DisableChamp(document.getElementById('TNUM_declModeExped'));
			DisableChamp(document.getElementById('TNUM_declNumDPIBanque'));
			DisableChamp(document.getElementById('TNUM_declNumDPINumero'));
			DisableChamp(document.getElementById('TNUM_declNumDPIAV'));
			DisableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
			DisableChamp(document.getElementById('exemption'));
			if(controleValeursObligatoires())
			{
				if(document.getElementById("buttonclick").value=='enreg')
					doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
				else if(document.getElementById("buttonclick").value=='controle')
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				else if(document.getElementById("buttonclick").value=='modif')
					doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
				else
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				// alert('test1');
			}
			return;
		}
		//Le pvi ne s?applique pas aux r�gimes S sauf les r�gimes suspensifs d?importation directe (s300,s310,s320,s510,s520)
		if(valreg.indexOf('S')!=-1&&(valreg.indexOf('S300')==-1 || valreg.indexOf('S310')==-1 || valreg.indexOf('S320')==-1 || valreg.indexOf('S510')==-1 || valreg.indexOf('S520')==-1)){
			DisableChamp(document.getElementById('TNUM_declNumDPIAn'));
			DisableChamp(document.getElementById('TNUM_declModeExped'));
			DisableChamp(document.getElementById('TNUM_declNumDPIBanque'));
			DisableChamp(document.getElementById('TNUM_declNumDPINumero'));
			DisableChamp(document.getElementById('TNUM_declNumDPIAV'));
			DisableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
			DisableChamp(document.getElementById('exemption'));

			if(controleValeursObligatoires())
			{
				if(document.getElementById("buttonclick").value=='enreg')
					doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
				else if(document.getElementById("buttonclick").value=='controle')
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				else if(document.getElementById("buttonclick").value=='modif')
					doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
				else
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				// alert('test1');
			}
			//alert('test2');
			return;
		}
		//Le pvi ne s?applique pas aux r�gimes de mise � la consommation d?exon�ration : 
		//regime fiscal 21,22,23,24,25,26,30,31,32,33,38,39,10,11,12,13,40,80,90 
		//alert('regfisc : '+regfisc+', button :'+document.getElementById("buttonclick").value);
		if(regfisc.indexOf('21')!=-1 || regfisc.indexOf('22')!=-1 || regfisc.indexOf('23')!=-1 || regfisc.indexOf('24')!=-1 || regfisc.indexOf('25')!=-1 || regfisc.indexOf('26')!=-1 || regfisc.indexOf('30')!=-1 || regfisc.indexOf('31')!=-1 || regfisc.indexOf('32')!=-1 || regfisc.indexOf('33')!=-1 || regfisc.indexOf('38')!=-1 || regfisc.indexOf('39')!=-1 || regfisc.indexOf('10')!=-1 || regfisc.indexOf('11')!=-1 || regfisc.indexOf('12')!=-1 || regfisc.indexOf('13')!=-1 || regfisc.indexOf('40')!=-1 || regfisc.indexOf('80')!=-1 || regfisc.indexOf('90')!=-1){
			DisableChamp(document.getElementById('TNUM_declNumDPIAn'));
			DisableChamp(document.getElementById('TNUM_declModeExped'));
			DisableChamp(document.getElementById('TNUM_declNumDPIBanque'));
			DisableChamp(document.getElementById('TNUM_declNumDPINumero'));
			DisableChamp(document.getElementById('TNUM_declNumDPIAV'));
			DisableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
			DisableChamp(document.getElementById('exemption'));

			if(controleValeursObligatoires())
			{
				if(document.getElementById("buttonclick").value=='enreg')
					doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
				else if(document.getElementById("buttonclick").value=='controle')
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				else if(document.getElementById("buttonclick").value=='modif')
					doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
				else
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				// alert('test1');
			}
			//alert('test3');
			return;
		}
		//v�rifier si code produit saisie est existant ou non
		if(tb[0]=='devkey'){
			alert('Code devise FOB erron\u00E9');
			document.getElementById('TXT_LIST_declDeviseFob').focus();
			document.getElementById('pvi').value='false';
			if(controleValeursObligatoires()&&document.getElementById('pvi').value=='true')
				doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			//alert('test4');
			return;
		}
		if(tb[0]=='PrdNF'){
			alert('Code Produit erron\u00E9');
			//selectTab(0,2,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.getElementById('NUM_LIST_decCodeProd_OB').focus();
			document.getElementById('pvi').value='false';
			if(controleValeursObligatoires()&&document.getElementById('pvi').value=='true'){
				//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');

				if(document.getElementById("buttonclick").value=='enreg')
					doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
				else if(document.getElementById("buttonclick").value=='controle')
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				else if(document.getElementById("buttonclick").value=='modif')
					doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
				else
					doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
				// alert('test1');
			}
			//alert('test5');
			return;
		}
		//alert('BEFORE ');
		//alert('exempt '+document.getElementById('exemption').value);
		//alert('AFTER ');
		if(document.getElementById('exemption').value=='1'){ //maj valeur exemption � 1
			document.getElementById('pvi').value='true' ;
		if(controleValeursObligatoires() && document.getElementById('pvi').value=='true'){
			//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			if(document.getElementById("buttonclick").value=='enreg')
				doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
			else if(document.getElementById("buttonclick").value=='controle')
				doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			else if(document.getElementById("buttonclick").value=='modif')
				doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
			else
				doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			// alert('test1');
		}
		//alert('test6');
		return;
		}
		//si produit petrolier , controler DPI
		//alert('tb[0] '+tb[0]);
		if(tb[0]=='1'){
			if(parseInt(fob)<1500000 || document.getElementById('exemption').value=='1'){ //maj valeur exemption � 1
				// alert('produit petrolier ou exemption oui et valfob< 1500000');
				if(controleValeursObligatoires()) {
					//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
					if(document.getElementById("buttonclick").value=='enreg')
						doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
					else if(document.getElementById("buttonclick").value=='controle')
						doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
					else if(document.getElementById("buttonclick").value=='modif')
						doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
					else
						doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
					//alert('test12222');
					return;
				}

			}else
				if(parseInt(fob)>=1500000&&parseInt(fob)<=3000000){ 
					//  alert('produit petrolier ou exemption oui et 1500000<=valfob<=3000000 ');
					if(document.getElementById('TNUM_declNumDPINumero').value==''){//alert('dpi vide');
					alert('Le champs num�ro DPI est obligatoire');
					//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
					document.getElementById('TNUM_declNumDPINumero').focus();
					document.getElementById('pvi').value='false';

					if(controleValeursObligatoires()&&document.getElementById('pvi').value=='true'){
						//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						if(document.getElementById("buttonclick").value=='enreg')
							doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
						else if(document.getElementById("buttonclick").value=='controle')
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						else if(document.getElementById("buttonclick").value=='modif')
							doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
						else
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						// alert('test1');
					}
					return;
					}else
						if(document.getElementById('TNUM_declNumDPIAn').value==''){
							alert('Le champs Ann\u00E9e DPI est obligatoire');
							if(document.getElementById('TNUM_declNumDPIAn').readOnly==true)
								document.getElementById('TNUM_declNumDPIAn').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declNumDPIAn').focus();
							document.getElementById('pvi').value='false';
							return;
						}else
							if(document.getElementById('TNUM_declModeExped').value==''){
								alert('Le champs Mode exp\u00E9dition DPI est obligatoire');
								if(document.getElementById('TNUM_declModeExped').readOnly==true)
									document.getElementById('TNUM_declModeExped').readOnly=false;
								//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
								document.getElementById('TNUM_declModeExped').focus();
								document.getElementById('pvi').value='false';
								return;
							}else
								if(document.getElementById('TNUM_declNumDPIBanque').value==''){
									alert('Le champs Banque DPI est obligatoire');
									if(document.getElementById('TNUM_declNumDPIBanque').readOnly==true)
										document.getElementById('TNUM_declNumDPIBanque').readOnly=false;
									//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
									document.getElementById('TNUM_declNumDPIBanque').focus();
									document.getElementById('pvi').value='false';
									return;
								}else
									if(tb[3]=='errorDpi'){//alert('dpi error')
										alert('Le num\u00E9ro dpi saisi ne correspond pas au num\u00E9ro dpi sur l\'av');
									return;
									}
					if(controleValeursObligatoires()){
						//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						if(document.getElementById("buttonclick").value=='enreg')
							doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
						else if(document.getElementById("buttonclick").value=='controle')
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						else if(document.getElementById("buttonclick").value=='modif')
							doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
						else
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						// alert('test1');
					}

				}
		}else 
			if(document.getElementById('exemption').value=='0'&& tb[0]=='0'){//::si produit non p�trolier et si exemption non  control DPI et AV
				// alert('valfob '+fob);
				if(parseInt(fob)<1500000){
					//	alert('produit non petrolier et exemption non et valfob<1500000<==>'+parseInt(fob));
					if(controleFCL(tb) == false){
						return;
					}
				}else
					if(parseInt(fob)>=1500000&&parseInt(fob)<=3000000){
						//alert('produit non petrolier et exemption non et 1500000<=valfob<=3000000   dpi='+document.getElementById('TNUM_declNumDPINumero').value);
						if(controleFCL(tb) == false){
							return;
						}
						if(document.getElementById('TNUM_declNumDPINumero').value==''){
							alert('Le champs num\u00E9ro DPI est obligatoire');
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declNumDPINumero').focus();
							document.getElementById('pvi').value='false';
							return;
						}
						else if(document.getElementById('TNUM_declNumDPIAn').value==''){
							alert('Le champs Ann\u00E9e DPI est obligatoire');
							if(document.getElementById('TNUM_declNumDPIAn').readOnly==true)
								document.getElementById('TNUM_declNumDPIAn').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declNumDPIAn').focus();
							document.getElementById('pvi').value='false';
							return;
						}
						else if(document.getElementById('TNUM_declModeExped').value==''){
							alert('Le champs Mode exp\u00E9dition DPI est obligatoire');
							if(document.getElementById('TNUM_declModeExped').readOnly==true)
								document.getElementById('TNUM_declModeExped').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declModeExped').focus();
							document.getElementById('pvi').value='false';
							return;
						}
						else if(document.getElementById('TNUM_declNumDPIBanque').value==''){
							alert('Le champs Banque DPI est obligatoire');
							if(document.getElementById('TNUM_declNumDPIBanque').readOnly==true)
								document.getElementById('TNUM_declNumDPIBanque').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declNumDPIBanque').focus();
							document.getElementById('pvi').value='false';
							return;
						}
					}
			//controle AV
			if(parseInt(fob)>3000000){
				//alert('produit non petrolier et exemption non et valfob>3000000');
				if(document.getElementById('TNUM_declNumDPINumero').value==''){
					alert('Le champs num\u00E9ro DPI est obligatoire');
					if(document.getElementById('TNUM_declNumDPINumero').readOnly==true)
						document.getElementById('TNUM_declNumDPINumero').readOnly=false;
					////selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
					document.getElementById('TNUM_declNumDPINumero').focus();
					document.getElementById('pvi').value='false';
					return;
				}else
					if(document.getElementById('TNUM_declNumDPIAn').value==''){
						alert('Le champs Ann\u00E9e DPI est obligatoire');
						if(document.getElementById('TNUM_declNumDPIAn').readOnly==true)
							document.getElementById('TNUM_declNumDPIAn').readOnly=false;
						////selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
						document.getElementById('TNUM_declNumDPIAn').focus();
						document.getElementById('pvi').value='false';
						return;
					}else
						if(document.getElementById('TNUM_declModeExped').value==''){
							alert('Le champs Mode exp\u00E9dition DPI est obligatoire');
							if(document.getElementById('TNUM_declModeExped').readOnly==true)
								document.getElementById('TNUM_declModeExped').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declModeExped').focus();
							document.getElementById('pvi').value='false';
							return;
						}else
							if(document.getElementById('TNUM_declNumDPIBanque').value==''){
								alert('Le champs Banque DPI est obligatoire');
								if(document.getElementById('TNUM_declNumDPIBanque').readOnly==true)
									document.getElementById('TNUM_declNumDPIBanque').readOnly=false;
								//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
								document.getElementById('TNUM_declNumDPIBanque').focus();
								document.getElementById('pvi').value='false';
								return;
							}else
								if(tb[3])
								{
									//alert('tb[3] 000 tb[3].indexOf(~~) '+tb[3].indexOf('~~'));
									if(tb[3].indexOf('~~')!=-1)
									{
										var tabsplit=tb[3];
										tabsplit = tabsplit.split('~~');
										tb[3]=tabsplit[0];
									}

									//alert('tb[3] '+tb[3]);
									if(tb[3]=='errorDpi'){
										alert('Le num\u00E9ro dpi saisi ne correspond pas au num\u00E9ro dpi sur l\'av');
										return;
									}
									if(document.getElementById('TNUM_declNumDPIAV').value==''&&tb[3]!='exo'){
										alert('Le champs num\u00E9ro AV est obligatoire');
										if(document.getElementById('TNUM_declNumDPIAV').readOnly==true){
											EnableChamp(document.getElementById('TNUM_declNumDPIAV'));
											EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
										}
										//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
										document.getElementById('TNUM_declNumDPIAV').focus();
										document.getElementById('pvi').value='false';
										return;
									}else
										if(document.getElementById('TNUM_LIST_declPaysDPIAV').value=='' &&tb[3]!='exo'){
											alert('Le champs Pays AV est obligatoire');
											if(document.getElementById('TNUM_LIST_declPaysDPIAV').readOnly==true)
												EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
											//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
											document.getElementById('TNUM_LIST_declPaysDPIAV').focus();
											document.getElementById('pvi').value='false';
											return;
										}else
											if(tb[3]=='AvRej'){
												alert('l\'AV est rejet\u00E9 (date de validit\u00E9 expir\u00E9e)');
												return;
											}else
												if(tb[3]=='errorAv'){
													alert('l\'AV est erron\u00E9');
													return;
												}
								} else
								{
									if(document.getElementById('TNUM_declNumDPIAV').value==''){
										alert('Le champs num\u00E9ro AV est obligatoire');
										if(document.getElementById('TNUM_declNumDPIAV').readOnly==true){
											EnableChamp(document.getElementById('TNUM_declNumDPIAV'));
											EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
										}
										//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
										document.getElementById('TNUM_declNumDPIAV').focus();
										document.getElementById('pvi').value='false';
										//alert('Le champs num�ro AV est obligatoire! '+document.getElementById('TNUM_declNumDPIAV').readOnly);

										return;
									}else
										if(document.getElementById('TNUM_LIST_declPaysDPIAV').value=='' ){
											alert('Le champs Pays AV est obligatoire');
											if(document.getElementById('TNUM_LIST_declPaysDPIAV').readOnly==true)
												EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
											//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
											document.getElementById('TNUM_LIST_declPaysDPIAV').focus();
											document.getElementById('pvi').value='false';
											return;
										}else

											if(tb[3]=='AvRej'){
												alert('l\'AV est rejet\u00E9 (date de validit\u00E9 expir\u00E9e)');
												return;
											}else
												if(tb[3]=='errorAv'){
													alert('l\'AV est erron\u00E9');
													return;
												}
								}


			}


			}else// si produit non p�trolier et si exemption oui
				if(document.getElementById('exemption').value=='1'&&tb[0]=='0'){ // alert('produit non petrolier et exemption oui prod exo?'+tb[1]+'  ppm exo?'+tb[2]);
				if(tb[1]=='N' || tb[2]=='N'){
					if(controleValeursObligatoires()){
						//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						if(document.getElementById("buttonclick").value=='enreg')
							doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
						else if(document.getElementById("buttonclick").value=='controle')
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
						else if(document.getElementById("buttonclick").value=='modif')
							doSubmit('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
						else
							doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
					}
					return;
				}else{
					// alert('controle DPI');
					//contr�le DPI
					if(document.getElementById('TNUM_declNumDPINumero').value==''){
						alert('Le champs num\u00E9ro DPI est obligatoire');
						if(document.getElementById('TNUM_declNumDPINumero').readOnly==true)
							document.getElementById('TNUM_declNumDPINumero').readOnly=false;
						//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
						document.getElementById('TNUM_declNumDPINumero').focus();
						document.getElementById('pvi').value='false';
						return;
					}else
						if(document.getElementById('TNUM_declNumDPIAn').value==''){
							alert('Le champs Ann\u00E9e DPI est obligatoire');
							if(document.getElementById('TNUM_declNumDPIAn').readOnly==true)
								document.getElementById('TNUM_declNumDPIAn').readOnly=false;
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_declNumDPIAn').focus();
							document.getElementById('pvi').value='false';
							return;
						}else
							if(document.getElementById('TNUM_declModeExped').value==''){
								alert('Le champs Mode exp\u00E9dition DPI est obligatoire');
								if(document.getElementById('TNUM_declModeExped').readOnly==true)
									document.getElementById('TNUM_declModeExped').readOnly=false;
								//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
								document.getElementById('TNUM_declModeExped').focus();
								document.getElementById('pvi').value='false';
								return;
							}else
								if(document.getElementById('TNUM_declNumDPIBanque').value==''){
									alert('Le champs Banque DPI est obligatoire');
									if(document.getElementById('TNUM_declNumDPIBanque').readOnly==true)
										document.getElementById('TNUM_declNumDPIBanque').readOnly=false;
									//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
									document.getElementById('TNUM_declNumDPIBanque').focus();
									document.getElementById('pvi').value='false';
									return;
								}
								else
									if(tb[3]=='errorDpi'){
										alert('Le num\u00E9ro dpi saisi ne correspond pas au num\u00E9ro dpi sur l\'av');
										return;
									}
					//alert('controle AV');			    
					//contr�le AV			      
					if(document.getElementById('TNUM_declNumDPIAV').value==''&&tb[3]!='exo'){
						alert('Le champs num\u00E9ro AV est obligatoire');
						if(document.getElementById('TNUM_declNumDPIAV').readOnly==true){
							EnableChamp(document.getElementById('TNUM_declNumDPIAV'));
							EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
						}
						//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
						document.getElementById('TNUM_declNumDPIAV').focus();
						document.getElementById('pvi').value='false';
						return;
					}else
						if(document.getElementById('TNUM_LIST_declPaysDPIAV').value=='' &&tb[3]!='exo'){
							alert('Le champs Pays AV est obligatoire');
							if(document.getElementById('TNUM_LIST_declPaysDPIAV').readOnly==true)
								EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
							//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
							document.getElementById('TNUM_LIST_declPaysDPIAV').focus();
							document.getElementById('pvi').value='false';
							return;
						}else
							if(tb[3]=='AvRej'){
								alert('l\'AV est rejet\u00E9 (date de validit\u00E9 expir\u00E9e)');
								return;
							}else
								if(tb[3]=='errorAv'){
									alert('l\'AV est erron\u00E9');
									return;
								}

				}
				}
		//alert('finnnnnnnn'+document.getElementById('pvi').value+"bouton"+document.getElementById("buttonclick").value);
		//alert('Action PVI:'+document.forms[0].action)
		
		if((document.getElementById("buttonclick").value=='enreg') || (document.getElementById("buttonclick").value=='controle')){
			if(document.getElementById('TNUM_declNumTitreTrans2_OB')!=null){
				if(document.getElementById('TNUM_declNumTitreTrans2_OB').value!=""){
					if(document.getElementById('TNUM_declNumTitreTrans').value.toUpperCase() != document.getElementById('TNUM_declNumTitreTrans2_OB').value.toUpperCase()){
						alert("N° de Connaissement non conformes!\nVeuillez v\u00E9rifier le N° article apur\u00E9");
						document.getElementById('TNUM_declNumTitreTrans2_OB').value = "";
						document.getElementById('TNUM_declNumTitreTrans2_OB').focus();
						return;				
					}
				}
			}
		}
		
		if(controleValeursObligatoires()) {
			//doSubmit('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			if(document.getElementById("buttonclick").value=='enreg')
				doSubmit2('enregistrerArticleDeclarationDetail','editDeclarationDetail1');
			else if(document.getElementById("buttonclick").value=='controle')
				doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
			else if(document.getElementById("buttonclick").value=='modif')
				doSubmit2('modifierArticleDeclarationDetail','saisieArticleDetail1_1');
			else
				doSubmit2('verificationRecevabiliteArticle','saisieArticleDetail1_1');
		}

		//	document.getElementById('pvi').value='false';
		//return 'tr';
		//	alert('tr='+trim(tr.substring(tr.indexOf('#')+1,tr.length))+"-");
		/*if(trim(tr.substring(tr.indexOf('#')+1,tr.length))!="")
				tick2.innerHTML = tr.substring(0,tr.indexOf('#'));
				else
				tick2.innerHTML ="";
				///alert("Ajaxx response:"+tr);*/

		} else {
			alert("Problem with server response:\n " + req.statusText);
		}
	}

}

function controleFCL(tb){
	//alert('controle FCL TNUM_declModeExped: '+document.getElementById('TNUM_declModeExped').value);
	// Le mode d'expedition est defferent de FCL
	if(document.getElementById('TNUM_declModeExped').value !='1'){
		return true;
	}

	EnableChamp(document.getElementById('TNUM_declNumDPINumero'))
	EnableChamp(document.getElementById('TNUM_declNumDPIAn'));
	EnableChamp(document.getElementById('TNUM_declNumDPIAV'));
	EnableChamp(document.getElementById('TNUM_LIST_declPaysDPIAV'));
	EnableChamp(document.getElementById('TNUM_declNumDPIBanque'));
	
	// Faire les controles uniquement si le le mode expedition est FCL
	if(document.getElementById('TNUM_declNumDPINumero').value==''){
		alert('Le champs numï¿½ro DPI est obligatoire');
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById('TNUM_declNumDPINumero').focus();
		document.getElementById('pvi').value='false';
		return false;
	}
	else if(document.getElementById('TNUM_declNumDPIAn').value==''){
		alert('Le champs Annï¿½e DPI est obligatoire');
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById('TNUM_declNumDPIAn').focus();
		document.getElementById('pvi').value='false';
		return false;
	}
	else if(document.getElementById('TNUM_declNumDPIBanque').value==''){
		alert('Le champs Banque DPI est obligatoire');
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById('TNUM_declNumDPIBanque').focus();
		document.getElementById('pvi').value='false';
		return false;
	}
	if(document.getElementById('TNUM_declNumDPIAV').value==''){
		alert('Le champs numï¿½ro AV est obligatoire');
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById('TNUM_declNumDPIAV').focus();
		document.getElementById('pvi').value='false';

		return false;
	}
	else if(document.getElementById('TNUM_LIST_declPaysDPIAV').value=='' ){
		alert('Le champs Pays AV est obligatoire');
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById('TNUM_LIST_declPaysDPIAV').focus();
		document.getElementById('pvi').value='false';
		return false;
	}
	else if(tb[3])
	{
		//alert('tb[3] 000 tb[3].indexOf(~~) '+tb[3].indexOf('~~'));
		if(tb[3].indexOf('~~')!=-1)
		{
			var tabsplit=tb[3];
			tabsplit = tabsplit.split('~~');
			tb[3]=tabsplit[0];
		}

		//alert('tb[3] '+tb[3]);
		if(tb[3]=='errorDpi'){
			alert('Le numï¿½ro dpi saisi ne correspond pas au numï¿½ro dpi sur l\'av');
			return false;
		}
		if(document.getElementById('TNUM_declNumDPIAV').value==''&&tb[3]!='exo'){
			alert('Le champs numï¿½ro AV est obligatoire');
			//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.getElementById('TNUM_declNumDPIAV').focus();
			document.getElementById('pvi').value='false';
			return false;
		}
		else if(document.getElementById('TNUM_LIST_declPaysDPIAV').value=='' &&tb[3]!='exo'){
			alert('Le champs Pays AV est obligatoire');
			//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.getElementById('TNUM_LIST_declPaysDPIAV').focus();
			document.getElementById('pvi').value='false';
			return false;
		}
		else if(tb[3]=='AvRej'){
			alert('l\'AV est rejetï¿½ (date de validitï¿½ expirï¿½e)');
			return false;
		}
		else if(tb[3]=='errorAv'){
			alert('l\'AV est erronï¿½');
			return false;
		}
	} 

	return true;
}

function controlePVI(buttonclick){
    //alert(document.getElementById("buttonclick").value);
	document.getElementById("buttonclick").value=buttonclick;
	//alert(document.getElementById("buttonclick").value);
	paysav = document.getElementById('TNUM_LIST_declPaysDPIAV').value;
	if(paysav != null)
		paysav = paysav.toUpperCase();
	getTypeProduitAjax('isProduitPetrolier?codprod='+document.getElementById('NUM_LIST_decCodeProd_OB').value+'&precuemoa='+document.getElementById('NUM_LIST_decPrecUemoa_OB').value+'&precsen='+document.getElementById('NUM_LIST_decPrecSen_OB').value+'&numav='+document.getElementById('TNUM_declNumDPIAV').value+'&paysav='+paysav+'&numdpi='+document.getElementById('TNUM_declNumDPINumero').value+'&valFob='+document.getElementById('MNT_declValeurFob').value+'&valDeviseFob='+document.getElementById('TXT_LIST_declDeviseFob').value+'&typeapurement='+document.getElementById('TNUM_declTypeApurement_OB').value+'&poidsbrut='+document.getElementById('NUM_declPoidsBrut').value+'&poidsnet='+document.getElementById('NUM_declPoidsNet').value+'&numrep='+document.getElementById('TNUM_declNumRepertoire_OB').value+'&annee='+document.getElementById('NUM_manifAnnee_OB').value+'&regdouanier='+document.getElementById('TNUM_LIST_declCodeRegimeDouanier_OB').value+'&regfiscal='+document.getElementById('TNUM_LIST_declRegimeFiscal_OB').value);
	return !errorFound;
}
function openOrbus(){
	var form = document.forms.item(0);
	var dossier = form.TNUM_declDossierOrbus.value;
	var codeppm = form.TNUM_codePPM_Connecte.value;
	var url = "http://10.2.3.150/douane/EtatDossiers.asp?DossierTps="+dossier+"&Personnel="+codeppm;
	if (dossier == ""){
		alert("Vous devez saisir un dossier orbus");
	}else{
		window.open(url);
	}
}

function lienOpenOrbus(dossier,codeppm){
	var url = "http://10.2.3.150/douane/EtatDossiers.asp?DossierTps="+dossier+"&Personnel="+codeppm;
	if (dossier == ""){
		alert("Vous devez saisir un dossier orbus");
	}else{
		window.open(url);
	}
}

function openPopUp(action,page,title){
	var x = (window.screen.availwidth/2)-200;
	var y = (window.screen.availheight/2);

	var option ='toolbar=0,location=0,directories=0,status=0,scrollbars=1,resizable=0,copyhistory=0,menuBar=0,width=800,height=370,left='+x+',top='+y;

	if (action == ""){
		alert("Impossible d'ouvrir la fen�tre");
	}else{
		window.open(action+'?page='+page,title,option);
	}	
	return false;
}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de confirmer l'enregistrement 
					  de la dï¿½claration
	Paramï¿½tres 		: aucun
	Utilisï¿½e dans	: declDeclarationDetailEnreg.jsp
					  lors de l'enregistrement de la dï¿½claration
************************************************************************/
function confirmEnregistrementDeclarationBeforeSubmit() {
	/*
	var form = document.forms[0];
	var modeDeclaration; //form.TNUM_declModeDeclaration_OB.value;
	var modePaiement; //form.TNUM_declModePaiement_OB;
	var modePaiementSelected;
	var result;
	
	// 
	if (modeDeclaration == 'C') {
		result = confirm("ATTENTION !!! \n LA DECLARATION DEVRA ETRE REGULARISEE DANS UN DELAI DE 15 JOURS.");
	} else {
		result = confirm("ATTENTION !!! \n LA DECLARATION ENREGISTREE NE POURRA ETRE MODIFIEE QUE PAR LE SERVICE DES DOUANES.");
	}
	
	// 
	if (!result) {
		return false;
	}
	
	// 
	if (modePaiement(0).checked) { // Mode de rï¿½glement au comptant selectionnï¿½
		modePaiementSelected = 'CO';
	} else if (modePaiement(1).checked) { // Mode de reglement au credit
		modePaiementSelected = 'CR', 
	} else if (modePaiement(2).checked) { // Mode de reglement au comptant credit
		modePaiementSelected = 'CC';
	}
	
	alert('Mï¿½thode doSubmitWithaoutValidate a implï¿½menter dans le fichier declaration.js !');*/
	//
	// doSubmitWithaoutValidate('', '');
}

/***********************************************************************	
	Auteur 			: BSB - PRESTATECH
	Description 	: Fonction permettant de verrouiller les champs Numero et Pays provenance
					  en fonction de la valeur du type d'apurement.	
	Paramï¿½tres 		: aucun
	Utilisï¿½e dans	: declSaisieBrDlpp.jsp
					  lors de la sï¿½lection de la zone de liste type apurement
************************************************************************/
function LockTypeApurementDlppFields(){
	var form = document.forms[0];
	var selectedIndex = form.TNUM_declTypeApurement_OB.selectedIndex;
	var selectedIndexValue = form.TNUM_declTypeApurement_OB[selectedIndex].value;

	if(selectedIndexValue == '0'){
	
	//DisableChamp(form.NUM_manifAnnee_OB);
	//DisableChamp(form.TNUM_manifCodeBur_OB);
	//DisableChamp(form.NUM_manifNumSeq_OB);
	EnableChamp(form.TNUM_declNomTanker);
	

	
	}else{
	
	//EnableChamp(form.NUM_manifAnnee_OB);
	//EnableChamp(form.TNUM_manifCodeBur_OB);
	//EnableChamp(form.NUM_manifNumSeq_OB);
	DisableChamp(form.TNUM_declNomTanker);
	
	}
}

function LockTypeApurementDlppFieldsTransport(){
	var form = document.forms[0];
	var selectedIndex = form.TNUM_declModeTransport_OB.selectedIndex;
	var selectedIndexValue = form.TNUM_declModeTransport_OB[selectedIndex].value;

	if(selectedIndexValue == '10'){
	
	DisableChamp(form.TNUM_declMoyenTransport_OB);
	DisableChamp(form.TNUM_declImmatrVehicule_OB);
	DisableChamp(form.TNUM_declMarqueVehicule_OB);
	
	}else{
	
	EnableChamp(form.TNUM_declMoyenTransport_OB);
	EnableChamp(form.TNUM_declImmatrVehicule_OB);
	EnableChamp(form.TNUM_declMarqueVehicule_OB);
	
	}
}
/***********************************************************************	
	Auteur 			: Cyril NIANG - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de verrouiller les champs Numero et Pays provenance
					  en fonction de la valeur du type d'apurement.	
	Paramï¿½tres 		: aucun
	Utilisï¿½e dans	: declDeclarationrecherche.jsp
					  lors de la sÃ©lection de la zone de liste type apurement
************************************************************************/
function LockTypeApurementFields(){
	var form = document.forms[0];
	var selectedIndex = form.TNUM_declTypeApurement_OB.selectedIndex;
	var selectedIndexValue = form.TNUM_declTypeApurement_OB[selectedIndex].value;

	if(form.nbreArt && form.nbreArt.value!='0' && form.nbreArt.value!='null')
	   DisableChamp(form.TNUM_LIST_declCodeRegimeDouanier_OB);
	if(selectedIndexValue == '3'){
		DisableChamp(form.NUM_manifAnnee_OB);
		DisableChamp(form.TNUM_manifCodeBur_OB);
		DisableChamp(form.NUM_manifNumSeq_OB);
		//DisableChamp(form.TNUM_LIST_declPaysProvenance);

		//form.TNUM_LIST_declPaysProvenance.value = "";
		form.NUM_manifAnnee_OB.value = "";
		form.TNUM_manifCodeBur_OB.value = "";
		form.NUM_manifNumSeq_OB.value = "";
	}
	else if(selectedIndexValue == '4' && form.TNUM_LIST_declCodeRegimeDouanier_OB.value!=null && form.TNUM_LIST_declCodeRegimeDouanier_OB.value.charAt(0)=='E'){
		DisableChamp(form.NUM_manifAnnee_OB);
		DisableChamp(form.TNUM_manifCodeBur_OB);
		DisableChamp(form.NUM_manifNumSeq_OB);
	//	DisableChampZoneListe(form.TNUM_declTypeApurement_OB);
	//	DisableChamp(form.TNUM_LIST_declPaysProvenance);
		
		//DisableChamp(form.TNUM_LIST_declPaysProvenance);

		//form.TNUM_LIST_declPaysProvenance.value = "";
		form.NUM_manifAnnee_OB.value = "";
		form.TNUM_manifCodeBur_OB.value = "";
		form.NUM_manifNumSeq_OB.value = "";
	}
	else {
		EnableChamp(form.NUM_manifAnnee_OB);
		EnableChamp(form.TNUM_manifCodeBur_OB);
		EnableChamp(form.NUM_manifNumSeq_OB);
		EnableChamp(form.TNUM_LIST_declPaysProvenance);
	}
}
function LockTypeApurementFields2(){
	var form = document.forms[0];
	var typeapurement = form.TNUM_declTypeApurement_OB.value;
	if (typeapurement == '4' || typeapurement == '7'){
		DisableChamp(form.NUM_manifNumArt);
		DisableChamp(form.NUM_manifPrecArt);
		DisableChamp(form.NUM_manifPrecArt2);
		form.NUM_manifNumArt.value = '';
		form.NUM_manifPrecArt.value = '';
		form.NUM_manifPrecArt2.value = '';
	}else{
		EnableChamp(form.NUM_manifNumArt);
		EnableChamp(form.NUM_manifPrecArt);
		EnableChamp(form.NUM_manifPrecArt2);
	}
}
/***********************************************************************	
	Auteur 			: Cyril NIANG - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de vï¿½rifier s'il y a des erreurs dans la recevabilitï¿½.	
	Paramï¿½tres 		: Action : String, Dispatcher : String
	Utilisï¿½e dans	: declDeclarationrecherche.jsp
					  lors du contrï¿½le de la recevabilitï¿½
************************************************************************/
function  verifieErreur(action,dispatcher){
	var frm = document.forms[0];
	var x = (window.screen.availwidth/2)-350;
	var y = (window.screen.availheight/2)-200;
	//alert('erreeur '+frm.TNUM_erreurs.value);
	if(document.getElementById('TNUM_erreurs').value!=""){
		if(document.getElementById('TNUM_erreurs').value=="Oui"){
			window.open('afficheListeErreur','Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0, width=800, height=370,  left='+x+', top='+y);
		}else{
			if(frm.dispatcher&&frm.dispatcher.value == dispatcher){
				frm.action = 'siValider';
                frm.dispatcher.value ="";
				frm.submit();
			}					
		}
	}
}

/** Fonction permettant de vï¿½rifier s'il ya des erreurs dans la recevabilitï¿½.
Si c'est le cas, alors un popup s'affiche */
function  verifieErreur2(act){	
	var frm = document.forms.item(0);
	var x = (window.screen.availwidth/2)-350;
	var y = (window.screen.availheight/2)-200;
			
	if(document.getElementById('TNUM_erreurs').value!=""){
		if(document.getElementById('TNUM_erreurs').value=="Oui"){
			
			window.open(act,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0, width=800, height=370,  left='+x+', top='+y);
		}
	}
	frm.validate.disabled = true;
	if(frm.estValide.value == "OUI")
		frm.validate.disabled = false;	
	
	if(act == "listeErreurSegGenAction"){		
		if(frm.estRegimeExp != null && frm.estRegimeExp.value=="OUI")
			frm.TNUM_LIST_declCodePPM.value="";
		else if(frm.estRegimeExp != null && frm.estRegimeExp.value=="NON")
			frm.TNUM_LIST_declCodePPMExpediteur.value="";
	}	
}
function doSubmitppm(action,page){
	vFormUpperCase();
	//document.forms[0].reqCode.value =requestCode;
	//var act=document.forms[0].action;
	if (page=="saisieArticle")
		 document.forms[0].action = action+'?page=saisieArticle';
	else if (page=="editArticle")
		document.forms[0].action = action+'?page=editArticle';
	else 
		document.forms[0].action = action+'?page='+page; 

	//if(act.indexOf('saisieManifesteACT')!=-1)
	//  document.forms[0].action = document.forms[0].action+'?page=saisieArticle';
	//  else 
//	     if(act.indexOf('modificationManifesteACT')!=-1)
//	      document.forms[0].action = document.forms[0].action+'?page=editArticle';
	//  else 
//	     if(act.indexOf('demandeRectificationACT')!=-1)
//	      document.forms[0].action = document.forms[0].action+'?page=editArticleDemandeRectif';
//	      else
//			document.forms[0].action = document.forms[0].action+'?page='+page;
			//alert(document.forms[0].action);
	document.forms[0].submit();

	}
function doSubmitppm2(action,page){
	vFormUpperCase();

	if (page=="saisieArticle")
		 document.forms[0].action = action+'?pageContext=saisieArticle';
	else if (page=="editArticle")
		document.forms[0].action = action+'?pageContext=editArticle';
	else 
		document.forms[0].action = action+'?pageContext='+page; 

	document.forms[0].submit();

	}

function enableppmdest(){
	var form = document.forms[0];
	EnableChamp(form.TNUM_declNomDestinataire);
	form.TNUM_declNomDestinataire.value='';
	EnableChamp(form.TNUM_declNumContribuable);
	form.TNUM_declNumContribuable.value='';
	EnableChampZoneListe(form.TNUM_declTypeVoieDestinataire);
	form.TNUM_declTypeVoieDestinataire.value='';
	EnableChamp(form.TNUM_declNomVoieDestinataire);
	form.TNUM_declNomVoieDestinataire.value='';
	EnableChamp(form.TNUM_declQuartierDestinataire);
	form.TNUM_declQuartierDestinataire.value='';
	EnableChamp(form.NUM_declBpDestinataire);
	form.NUM_declBpDestinataire.value='';
	EnableChamp(form.TNUM_declNumVoieDestinataire);
	form.TNUM_declNumVoieDestinataire.value='';
	EnableChamp(form.TXT_declVilleDestinataire);
	form.TXT_declVilleDestinataire.value='';
	EnableChamp(form.TNUM_declNumNineaDestinataire);
	form.TNUM_declNumNineaDestinataire.value='';
}

function disableppmdest(){
	var form = document.forms[0];
	DisableChamp(form.TNUM_declNomDestinataire);
	DisableChamp(form.TNUM_declNumContribuable);
	DisableChampZoneListe(form.TNUM_declTypeVoieDestinataire);
	DisableChamp(form.TNUM_declNomVoieDestinataire);
	DisableChamp(form.TNUM_declQuartierDestinataire);
	DisableChamp(form.NUM_declBpDestinataire);
	DisableChamp(form.TNUM_declNumVoieDestinataire);
	DisableChamp(form.TXT_declVilleDestinataire);
	DisableChamp(form.TNUM_declNumNineaDestinataire);
}

function enableppmexp(){
	var form = document.forms[0];
	EnableChamp(form.TNUM_declNomExpediteur);
	form.TNUM_declNomExpediteur.value='';
	EnableChamp(form.TNUM_declNumContribuableExpediteur);
	form.TNUM_declNumContribuableExpediteur.value='';
	EnableChamp(form.TNUM_declTypeVoieExpediteur);
	form.TNUM_declTypeVoieExpediteur.value='';
	EnableChamp(form.TNUM_declNomVoieExpediteur);
	form.TNUM_declNomVoieExpediteur.value='';
	EnableChamp(form.TNUM_declQuartierExpediteur);
	form.TNUM_declQuartierExpediteur.value='';
	EnableChamp(form.NUM_declBpExpediteur);
	form.NUM_declBpExpediteur.value='';
	EnableChamp(form.TNUM_declNumVoieExpediteur);
	form.TNUM_declNumVoieExpediteur.value='';
	EnableChamp(form.TXT_declVilleExpediteur);
	form.TXT_declVilleExpediteur.value='';
	EnableChamp(form.TNUM_declNumNineaExpediteur);
	form.TNUM_declNumNineaExpediteur.value='';
}        

function disableppmexp(){
	var form = document.forms[0];
	DisableChamp(form.TNUM_declNomExpediteur);
	DisableChamp(form.TNUM_declNumContribuableExpediteur);
	DisableChamp(form.TNUM_declTypeVoieExpediteur);
	DisableChamp(form.TNUM_declNomVoieExpediteur);
	DisableChamp(form.TNUM_declQuartierExpediteur);
	DisableChamp(form.NUM_declBpExpediteur);
	DisableChamp(form.TNUM_declNumVoieExpediteur);
	DisableChamp(form.TXT_declVilleExpediteur);
	DisableChamp(form.TNUM_declNumNineaExpediteur);
}

function listerModeDeclaration(requestCode,page){
	document.forms[0].reqCode.value =requestCode;
	document.forms[0].action = document.forms[0].action+'?page='+page;
	document.forms[0].submit();
}

/** Fonction permettant de vï¿½rifier s'il ya des erreurs dans la recevabilitï¿½.
Si c'est le cas, alors un popup s'affiche */
function  verifieErreur(){
	var frm = document.forms[0];
	var x = (window.screen.availwidth/2)-350;
	var y = (window.screen.availheight/2)-200;
			
	if(document.getElementById('TNUM_erreurs').value!=""){
		if(document.getElementById('TNUM_erreurs').value=="Oui"){
			window.open('afficheListeErreur','','toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0, width=800, height=370,  left='+x+', top='+y);
		}else{
			if(frm.dispatcher&&frm.dispatcher.value == "saisieDeclarationDetail"){
				frm.action = 'siValider';
                frm.dispatcher.value ="";
				frm.submit();						
			}					
		}
	}
}
/*********Cette fonction permet de rÃ©cupÃ¨rer la liste des  modes dÃ©claration
**********selon le rï¿½gime douanier saisi***********/
function computeModedeclarationByRegime(regimedouane,listmodedeclaration){//alert('001');
	var form = document.forms[0];	
	var idxregime = document.getElementById(regimedouane).value;
	var listDeclByregdouanier = document.getElementById('listModeDeclarationStringId').value.split('##');
	// aucun rÃ©gime  saisi
	if(idxregime==""){
		getLibelleAllModeDeclaration(listDeclByregdouanier,listmodedeclaration);
		return;
	}
	
	var j=0;
	for(var i=0;i<listDeclByregdouanier.length;i++){
		var DeclByregdouanier = listDeclByregdouanier[i].split("~~");
		if(DeclByregdouanier[0] == idxregime.toUpperCase()){
			
		document.getElementById(listmodedeclaration).options[j]=new Option(getLibelleModeDeclaration(DeclByregdouanier[0]),DeclByregdouanier[0]);
		j++;
			
		}
	}
}

function getLibelleAllModeDeclaration(listDeclByregdouanier,listmodedeclaration){
	document.getElementById(listmodedeclaration).options[0]= new Option('','');
	//if(document.getElementsByName(listmodedeclaration)[0]!=null)		
	//	document.getElementsByName(listmodedeclaration)[0].options[0]= new Option('','');
	
	for(var i=0; i<listDeclByregdouanier.length; i++){
		var Bureau = listDeclByregdouanier[i].split("~~");
			document.getElementById(listmodedeclaration).options[i+1]=
					new Option(Bureau[1],Bureau[0]);
		//if(document.getElementsByName(listmodedeclaration)[0]!=null)		
		//	document.getElementsByName(listmodedeclaration)[0].options[i+1]= new Option(Bureau[1],Bureau[0]);
	}
}

function getLibelleModeDeclaration(codeModedec){
	var ModedecList = document.getElementById('listmodedeclarationLibelleId').value.split("##");
	for(var i=0; i<ModedecList.length; i++){
		var Modedec = ModedecList[i].split("~~");
		if(Modedec[0]==codeModedec){
			return onlyFirstToUpper(Modedec[1]);
			break;
		}			
	}
	return "";
}

function computelist2(){
	computeModedeclarationByRegime('TNUM_LIST_declCodeRegimeDouanier_OB','TNUM_declModeDeclaration_OB');
	enableDisableChampByRegime();
}

function enableDisableChampByRegime(){
	var form = document.forms.item(0);
	var regime ='';
	
	if(form.TNUM_LIST_declCodeRegimeDouanier_OB)
	regime=form.TNUM_LIST_declCodeRegimeDouanier_OB.value;
	
	var typeregime = regime;//.charAt(0);
	var fields = new Array('TNUM_LIST_declPaysProvenance','TNUM_declTypeApurement_OB');
	
	if ((typeregime.toUpperCase() == 'E1')||(typeregime.toUpperCase() == 'E2')){
		form.TNUM_LIST_declPaysProvenance.value = 'SN';
		form.TNUM_declTypeApurement_OB.selectedIndex='4';
		DisableChampZoneListe(form.TNUM_declTypeApurement_OB);
		DisableChamp(form.TNUM_LIST_declPaysProvenance);
	}else{	
		disableEnableFields(form,fields,'','#ffffff');
		//form.TNUM_LIST_declPaysProvenance.value = '';
		//form.TNUM_declTypeApurement_OB.selectedIndex='0';
		EnableChampZoneListe(form.TNUM_declTypeApurement_OB);
	}
}

/****************************************************************
Cette fonction permet de cocher le mode de rï¿½glement 
mixte (comptant - crï¿½dit) 
***************************************************************/
function checkComptantCredit (valueChecked){

	for(var i=0;i<document.forms[0].elements['rbDECISCOM'].length;i++){
	//document.getElementById('valeurModeDec').value='';
	if(document.forms[0].elements['rbDECISCOM'][i]){//alert('00---'+document.forms[0].elements['RB_DECISCOM'][i].value+'*****'+document.getElementById("MNT_declMontantAPayer").value);
		document.forms[0].elements['rbDECISCOM'][i].checked = false;
		if(document.forms[0].elements['rbDECISCOM'][i].value==valueChecked 
			&& document.getElementById("MNT_declMontantAPayer").value!='0'){//alert('01');
			//alert('ici');
			document.forms[0].elements['rbDECISCOM'][i].checked=true;
			document.forms[0].elements['rbDECISCOM'][i].disabled=true;
			document.getElementById('valeurModeDec').value='3';
		}else{//alert('02');
					//alert('la');

			if(document.forms[0].elements['rbDECISCOM'][i-1]){//alert(document.forms[0].elements['RB_DECISCOM'][i-1].value);
				document.forms[0].elements['rbDECISCOM'][i-1].checked = true;
				if(document.forms[0].elements['rbDECISCOM'][i-1].value=='2'){
					document.forms[0].elements['rbDECISCOM'][i-1].disabled=false;
				}
				if(document.forms[0].elements['rbDECISCOM'][i-1].value=='1'){
					document.forms[0].elements['rbDECISCOM'][i-1].disabled=false;
				}
			}
			document.forms[0].elements['rbDECISCOM'][i].disabled=true;
			
			//document.getElementById('valeurModeDec').value=document.getElementById('RB_DECISCOM').value;
		}
	}
	//alert('VALUE = '+document.getElementById('RB_DECISCOM').value+'--------------'+document.getElementById('valeurModeDec').value);
	
	}
	}


/***********************************************************************	
	Auteur 			: Cyril NIANG - CFAO TECHNOLOGIES
	Description 	: Diffï¿½rentes fonctions permettant la gestion des infos du PPM	
	
************************************************************************/

function manageDestinataireSection(){
	var form = document.forms.item(0);
	var ppmdest = form.TNUM_LIST_declCodePPM.value;
	
	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');

	if(ppmdest!=''){
		disableEnableFields(form,fields,true,'#ededed');
	}
}

function manageDestinataireSectionModifSegGen(){
	var form = document.forms('demandeModifSegGenForm');	
	var ppmdest = form.TNUM_LIST_declCodePPM.value;
	
	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');
	
	//disableEnableFields(form,fields,false,'#ffffff');
	
	if(ppmdest!='')
		disableEnableFields(form,fields,true,'#ededed');	
	
	var fields2 = new Array('decSegGenCodePPMDestinataire','decSegGenNomDestinataire','decSegGenTypeVoieDestinataire','decSegGenNumVoieDestinataire','decSegGenNomVoieDestinataire','decSegGenVilleDestinataire','decSegGenQuartierDestinataire','decSegGenBpDestinataire','decSegGenNumContribuableDestinataire','decSegGenNumNineaDestinataire',
							'decSegGenCodePPMExpediteur','decSegGenNomExpediteur','decSegGenTypeVoieExpediteur','decSegGenNumVoieExpediteur','decSegGenNomVoieExpediteur','decSegGenVilleExpediteur','decSegGenQuartierExpediteur','decSegGenBpExpediteur','decSegGenNumContribuableExpediteur','decSegGenNumNineaExpediteur',
							'decSegGenModeTransport','decSegGenMoyenTransport','decSegGenReferenceDeclaration','decSegGenPaysDestination','decSegGenBureauDestination','decSegGenBureauFrontiere');
	disableEnableFields(form,fields2,true,'#ededed');	
}

function resetFieldsPPMDest(){
	var form = document.forms.item(0);
 	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomDestinataire.value="";
	form.TNUM_declNumContribuable.value="";
	form.TNUM_declNomVoieDestinataire.value="";
	form.TNUM_declQuartierDestinataire.value="";
	form.NUM_declBpDestinataire.value="";
	form.TNUM_declNumVoieDestinataire.value="";
	form.TXT_declVilleDestinataire.value="";
	form.TNUM_declNumNineaDestinataire.value="";
	form.TNUM_declTypeVoieDestinataire.value="";
} 

function resetFieldsPPMDestModifSegGen(){
	var form = document.forms('demandeModifSegGenForm');
 	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomDestinataire.value="";
	form.TNUM_declNumContribuable.value="";
	form.TNUM_declNomVoieDestinataire.value="";
	form.TNUM_declQuartierDestinataire.value="";
	form.NUM_declBpDestinataire.value="";
	form.TNUM_declNumVoieDestinataire.value="";
	form.TXT_declVilleDestinataire.value="";
	form.TNUM_declNumNineaDestinataire.value="";
	form.TNUM_declTypeVoieDestinataire.value="";
}

function manageExpediteurSection(){
	var form = document.forms.item(0);
	var ppmdest = form.TNUM_LIST_declCodePPMExpediteur.value;
	
	var fields = new Array('TNUM_declNomExpediteur','TNUM_declNumContribuableExpediteur','TNUM_declNomVoieExpediteur','TNUM_declQuartierExpediteur','NUM_declBpExpediteur','TNUM_declNumVoieExpediteur','TXT_declVilleExpediteur','TNUM_declNumNineaExpediteur','TNUM_declTypeVoieExpediteur');

	if(ppmdest!=''){
		disableEnableFields(form,fields,true,'#ededed');
	}
}

function manageExpediteurSectionModifSegGen(){
	var form = document.forms('demandeModifSegGenForm');
	var ppmdexp = form.TNUM_LIST_declCodePPMExpediteur.value;
	
	var fields = new Array('TNUM_declNomExpediteur','TNUM_declNumContribuableExpediteur','TNUM_declNomVoieExpediteur','TNUM_declQuartierExpediteur','NUM_declBpExpediteur','TNUM_declNumVoieExpediteur','TXT_declVilleExpediteur','TNUM_declNumNineaExpediteur','TNUM_declTypeVoieExpediteur');
	
	//if(ppmdexp!='')		
	disableEnableFields(form,fields,true,'#ededed');
		
}

function resetFieldsPPMExp(){
	var form = document.forms.item(0);
 	var fields = new Array('TNUM_declNomExpediteur','TNUM_declNumContribuableExpediteur','TNUM_declNomVoieExpediteur','TNUM_declQuartierExpediteur','NUM_declBpExpediteur','TNUM_declNumVoieExpediteur','TXT_declVilleExpediteur','TNUM_declNumNineaExpediteur','TNUM_declTypeVoieExpediteur');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomExpediteur.value="";
	form.TNUM_declNumContribuableExpediteur.value="";
	form.TNUM_declNomVoieExpediteur.value="";
	form.TNUM_declQuartierExpediteur.value="";
	form.NUM_declBpExpediteur.value="";
	form.TNUM_declNumVoieExpediteur.value="";
	form.TXT_declVilleExpediteur.value="";
	form.TNUM_declNumNineaExpediteur.value="";
	form.TNUM_declTypeVoieExpediteur.value="";
}

function resetFieldsPPMExpModifSegGen(){
	var form = document.forms('demandeModifSegGenForm');
 	var fields = new Array('TNUM_declNomExpediteur','TNUM_declNumContribuableExpediteur','TNUM_declNomVoieExpediteur','TNUM_declQuartierExpediteur','NUM_declBpExpediteur','TNUM_declNumVoieExpediteur','TXT_declVilleExpediteur','TNUM_declNumNineaExpediteur','TNUM_declTypeVoieExpediteur');
 	var listsBox = new Array('');
	
  	//disableEnableFields(form,fields,'','#ffffff');
	//disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomExpediteur.value="";
	form.TNUM_declNumContribuableExpediteur.value="";
	form.TNUM_declNomVoieExpediteur.value="";
	form.TNUM_declQuartierExpediteur.value="";
	form.NUM_declBpExpediteur.value="";
	form.TNUM_declNumVoieExpediteur.value="";
	form.TXT_declVilleExpediteur.value="";
	form.TNUM_declNumNineaExpediteur.value="";
	form.TNUM_declTypeVoieExpediteur.value="";
}
/**Pour la partie DLPP**/

function manageDestinataireDlppSection(){
	var form = document.forms('saisieDlppFB');
	var ppmdest = form.TNUM_LIST_declCodePPM_OB.value;
	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');

	if(ppmdest!=''){
		disableEnableFields(form,fields,true,'#ededed');
	}
}

function resetFieldsPPMDlppDest(){
	var form = document.forms('saisieDlppFB');
 	var fields = new Array('TNUM_declNomDestinataire','TNUM_declNumContribuable','TNUM_declNomVoieDestinataire','TNUM_declQuartierDestinataire','NUM_declBpDestinataire','TNUM_declNumVoieDestinataire','TXT_declVilleDestinataire','TNUM_declNumNineaDestinataire','TNUM_declTypeVoieDestinataire');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomDestinataire.value="";
	form.TNUM_declNumContribuable.value="";
	form.TNUM_declNomVoieDestinataire.value="";
	form.TNUM_declQuartierDestinataire.value="";
	form.NUM_declBpDestinataire.value="";
	form.TNUM_declNumVoieDestinataire.value="";
	form.TXT_declVilleDestinataire.value="";
	form.TNUM_declNumNineaDestinataire.value="";
	form.TNUM_declTypeVoieDestinataire.value="";
} 


/***************Pour Entrepositaire*************************************/

function manageEntrepositaireSection(){
	var form = document.forms('saisieDlppFB');
	var ppmdest = form.TNUM_LIST_declCodePPMEntrep_OB.value;
	
	var fields = new Array('TNUM_declNomEntrepositaire','TNUM_declNumContriEntrepositaire','TNUM_declTypeVoieEntrepositaire','TNUM_declQuartierEntrepositaire','NUM_declBpEntrepositaire','TNUM_declNumVoieEntrepositaire','TXT_declVilleEntrepositaire','TNUM_declNumNineaEntrepositaire','TNUM_declNomVoieEntrepositaire');

	if(ppmdest!=''){
		disableEnableFields(form,fields,true,'#ededed');
	}
}

function resetFieldsPPMEntre(){
	var form = document.forms('saisieDlppFB');
 	var fields = new Array('TNUM_declNomEntrepositaire','TNUM_declNumContriEntrepositaire','TNUM_declTypeVoieEntrepositaire','TNUM_declQuartierEntrepositaire','NUM_declBpEntrepositaire','TNUM_declNumVoieEntrepositaire','TXT_declVilleEntrepositaire','TNUM_declNumNineaEntrepositaire','TNUM_declNomVoieEntrepositaire');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomEntrepositaire.value="";
	form.TNUM_declNumContriEntrepositaire.value="";
	form.TNUM_declTypeVoieEntrepositaire.value="";
	form.TNUM_declQuartierEntrepositaire.value="";
	form.NUM_declBpEntrepositaire.value="";
	form.TNUM_declNumVoieDestinataire.value="";
	form.TXT_declVilleEntrepositaire.value="";
	form.TNUM_declNumNineaEntrepositaire.value="";
	form.TNUM_declNomVoieEntrepositaire.value="";
}

/***************Pour Transporteur**************************/

function manageTransporteurSection(){
	var form = document.forms('saisieDlppFB');
	var ppmtrpteur = form.TNUM_LIST_declCodePPMTrspteur_OB.value;
	
	var fields = new Array('TNUM_declNomTrspteur','TNUM_declNumContribTrspteur','TNUM_declTypeVoieTrspteur','TNUM_declQuartierTrspteur','NUM_declBpTrspteur','TNUM_declNumVoieTrspteur','TXT_declVilleTrspteur','TNUM_declNumNineaTrspteur','TNUM_declNomVoieTrspteur');

	if(ppmtrpteur!=''){
		disableEnableFields(form,fields,true,'#ededed');
	}
}

function resetFieldsPPMTrspteur(){
	var form = document.forms('saisieDlppFB');
 	var fields = new Array('TNUM_declNomTrspteur','TNUM_declNumContribTrspteur','TNUM_declTypeVoieTrspteur','TNUM_declQuartierTrspteur','NUM_declBpTrspteur','TNUM_declNumVoieTrspteur','TXT_declVilleTrspteur','TNUM_declNumNineaTrspteur','TNUM_declNomVoieTrspteur');
 	var listsBox = new Array('');
	
  	disableEnableFields(form,fields,'','#ffffff');
	disableEnableListBox(form,listsBox,'','#ffffff');
	form.TNUM_declNomEntrepositaire.value="";
	form.TNUM_declNumContriEntrepositaire.value="";
	form.TNUM_declTypeVoieEntrepositaire.value="";
	form.TNUM_declQuartierEntrepositaire.value="";
	form.NUM_declBpEntrepositaire.value="";
	form.TNUM_declNumVoieDestinataire.value="";
	form.TXT_declVilleEntrepositaire.value="";
	form.TNUM_declNumNineaEntrepositaire.value="";
	form.TNUM_declNomVoieEntrepositaire.value="";
}
/***********************************************************************	
	Auteur 			: Cyril NIANG - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de vï¿½rifier le contrï¿½le des champs
					  obligatoires par rapport au rï¿½gime douanier
	Paramï¿½tres 		: 
	Utilisï¿½e dans	: declDeclarationSaisie.jsp
					  lors du changement de la valeur
************************************************************************/
function controleChampsRegimeDouanier(){
	var form = document.forms.item(0);
	var regime = form.TNUM_LIST_declCodeRegimeDouanier_OB.value;
	var typeregime = regime.charAt(0);
	var fields = new Array('TNUM_LIST_declPaysProvenance');
	var listbox = new Array('TNUM_declTypeApurement_OB');
	
	// On traite le cas des exportations
	if ((typeregime.toUpperCase() == 'E')||(typeregime.toUpperCase() == 'R')){
	
		// Test pour remplir le type d'apurement et le pays provenance
		if (typeregime.toUpperCase() == 'E'){
			form.TNUM_declTypeApurement_OB.value = '4';
			form.TNUM_LIST_declPaysProvenance.value = 'SN';
			disableEnableFields(form,fields,true,'#ededed');
			disableEnableListBox(form,listbox,true,'#ededed');
		}else{
			form.TNUM_declTypeApurement_OB.value = '3';
			LockTypeApurementFields();
		}
		
		if ((form.TNUM_LIST_declCodePPM.value != '')&&(form.TNUM_LIST_declCodePPM.value != null)){
			alert('Le destinataire ne peut avoir de code PPM');
			return false;
		}
		
		if ((form.TNUM_declNomDestinataire.value == '')||(form.TNUM_declNomDestinataire.value == null)){
			alert('Le nom du destinataire est obligatoire');
			return false;
		}		
		
		if ((form.TNUM_declNomVoieDestinataire.value == '')||(form.TNUM_declNomVoieDestinataire.value == null)){
			alert('Le nom de la voie du destinataire est obligatoire');
			return false;
		}		
		
		if ((form.TXT_declVilleDestinataire.value == '')||(form.TXT_declVilleDestinataire.value == null)){
			alert('La ville du destinataire est obligatoire');
			return false;
		}
		
		if ((form.TNUM_LIST_declCodePPMExpediteur.value == '')||(form.TNUM_LIST_declCodePPMExpediteur.value == null)){
			alert('Le code PPM expï¿½diteur est obligatoire');
			return false;
		}
		
		if ((form.TNUM_declModeTransport.value == '')||(form.TNUM_declModeTransport.value == null)){
			alert('Le mode de transport est obligatoire');
			return false;
		}
		
		if ((form.TNUM_declMoyenTransport.value == '')||(form.TNUM_declMoyenTransport.value == null)){
			alert('Le moyen de transport est obligatoire');
			return false;
		}
		
		if ((form.TNUM_LIST_declPaysDestination.value == '')||(form.TNUM_LIST_declPaysDestination.value == null)){
			alert('Le pays de destination est obligatoire');
			return false;
		}
		
		return true;	
	}else{
		// On traite le cas des importations
		if ((typeregime.toUpperCase() == 'C')||(typeregime.toUpperCase() == 'S')){
		
			if ((form.TNUM_LIST_declCodePPM.value == '')&&(form.TNUM_LIST_declCodePPM.value == null)){
				
				if ((form.TNUM_declNomDestinataire.value == '')||(form.TNUM_declNomDestinataire.value == null)){
					alert('Le nom du destinataire est obligatoire');
					return false;
				}		
				
				if ((form.TNUM_declNomVoieDestinataire.value == '')||(form.TNUM_declNomVoieDestinataire.value == null)){
					alert('Le nom de la voie du destinataire est obligatoire');
					return false;
				}
				
				if ((form.TXT_declVilleDestinataire.value == '')||(form.TXT_declVilleDestinataire.value == null)){
					alert('La ville du destinataire est obligatoire');
					return false;
				}
			}
		}		
		disableEnableFields(form,fields,'','#ffffff');
		disableEnableListBox(form,listbox,'','#ffffff');
	}	
	
	// On traite le cas du transit
	if ((regime.toUpperCase() == 'S1')||(regime.toUpperCase() == 'S2')){
		if ((form.TNUM_LIST_declCodePPM.value != '')&&(form.TNUM_LIST_declCodePPM.value != null)){
			alert('Le destinataire ne peut avoir de code PPM');
			return false;
		}
		
		if ((form.TNUM_declNomDestinataire.value == '')||(form.TNUM_declNomDestinataire.value == null)){
			alert('Le nom du destinataire est obligatoire');
			return false;
		}		
		
		if ((form.TNUM_declNomVoieDestinataire.value == '')||(form.TNUM_declNomVoieDestinataire.value == null)){
			alert('Le nom de la voie du destinataire est obligatoire');
			return false;
		}		
		
		if ((form.TXT_declVilleDestinataire.value == '')||(form.TXT_declVilleDestinataire.value == null)){
			alert('La ville du destinataire est obligatoire');
			return false;
		}
		
		if ((form.TNUM_LIST_declCodePPMExpediteur.value == '')||(form.TNUM_LIST_declCodePPMExpediteur.value == null)){
			alert('Le code PPM expï¿½diteur est obligatoire');
			return false;
		}
		
		if ((form.TNUM_declModeTransport.value == '')||(form.TNUM_declModeTransport.value == null)){
			alert('Le mode de transport est obligatoire');
			return false;
		}
		
		if ((form.TNUM_declMoyenTransport.value == '')||(form.TNUM_declMoyenTransport.value == null)){
			alert('Le moyen de transport est obligatoire');
			return false;
		}
		
		if ((form.TNUM_LIST_declPaysDestination.value == '')||(form.TNUM_LIST_declPaysDestination.value == null)){
			alert('Le pays de destination est obligatoire');
			return false;
		}
		
		if ((form.TNUM_LIST_declBureauDestination.value == '')||(form.TNUM_LIST_declBureauDestination.value == null)){
			alert('Le bureau de destination est obligatoire');
			return false;
		}
	}
	return true;
}

/***********************************************************************	
	Auteur 			: Cyril NIANG - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de vï¿½rifier le contrï¿½le des champs
					  obligatoires lorsque le rï¿½gime douanier = E1 pour l'article	
	Paramï¿½tres 		: 
	Utilisï¿½e dans	: declDeclarationArticleSaisie.jsp
					  lors du changement de la valeur
************************************************************************/
function controleArticleChampsRegimeE1(){
	var form = document.forms.item(0);
	var regime = form.TNUM_LIST_declCodeRegimeDouanier_OB.value;
	if (regime.toUpperCase() == 'E1'){
		if ((form.TNUM_declDesignationCommerciale.value != '')&&(form.TNUM_declDesignationCommerciale.value != null)){
			alert('La dï¿½signation commerciale est obligatoire');
			return false;
		}
		if ((form.TNUM_declMarqueNumero.value == '')||(form.TNUM_declMarqueNumero.value == null)){
			alert('La marque est obligatoire');
			return false;
		}		
		if ((form.NUM_declPoidsNet.value == '')||(form.NUM_declPoidsNet.value == null)){
			alert('Le poids net est obligatoire');
			return false;
		}
		return true;	
	}else{
		return true;
	}
}
/***********************************************************************	
	Auteur 			: Bouna BADIANE - CFAO TECHNOLOGIES
	Description 	: Fonction permettant d'inhiber les champs
					  Numï¿½ro DPI et PAYS DPI lors de la saisie 
					  d'un article dont la valeur CFA FOB est
					  est infï¿½rieure ï¿½ (valmax=3000000)	
	Paramï¿½tres 		: 
	Utilisï¿½e dans	: declDeclarationArticleSaisie1_1.jsp
					  lors du changement de la valeur
************************************************************************/
function LockChampsAV(){
	var form = document.forms.item(0);
	var valcfafob = parseInt(form.MNT_declCFAFob.value);
	if(form.valcfafobmax.value!='')
	var valmax=Number(document.forms.item(0).valcfafobmax.value);
	if(valcfafob<valmax && document.getElementById('TNUM_declModeExped').value !='1'){
		form.TNUM_declNumDPIAV.value='';
		form.TNUM_LIST_declPaysDPIAV.value='';
		DisableChamp(form.TNUM_declNumDPIAV);
		DisableChamp(form.TNUM_LIST_declPaysDPIAV);
	}else{
	EnableChamp(form.TNUM_declNumDPIAV);
	EnableChamp(form.TNUM_LIST_declPaysDPIAV);
	}
}
/***********************************************************************	
	Fonction		: checkZoneObligatoire
	Auteur 			: Bouna BADIANE CFAO TECHNOLOGIES 2006
	Description 	: vï¿½rifie le caractï¿½re obligatorie d'une zone du 
					  formulaire en basculant sur l'onglet de la zone obligatoire
					  et pointant le focus sur celle-ci
					  
	Paramï¿½tres 		: nomZone le nom de la zone dans le formulaire, 
					  message le message ï¿½ afficher au cas ou la zone 
					  n'est pas renseignï¿½e
					  onglet l'index de l'onglet contenant la zone
	Utilisï¿½e dans	: 
************************************************************************/
function checkZoneObligatoireOnglet(nomZone, message,onglet) {	
	if ((document.getElementById(nomZone)) && (checkWhiteSpace(document.getElementById(nomZone)))) {
		if(document.getElementById("tabs0head1"))
		selectTab(0,2,onglet,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		setFieldObligatoire(nomZone, message);
		return false;
	}
	return true;
}

/***********************************************************************	
	Auteur 			: Bouna BADIANE - CFAO TECHNOLOGIES
	Description 	: Fonction permettant de controler la saisie des champs
					  POIDS BRUT,POIDS NET,NBRE DE COLIS,VALEURS ET DEVISE
					  lors de la saisie 
					  d'un article selon le mode de dï¿½claration
					  (vï¿½rification ï¿½ faire si RCINDICATEURVALEUR="0")
					  Cette fonction vï¿½rifie en mï¿½me que si les valeurs
					  Fret ou Autres ï¿½lï¿½ments sont saisies que leur devise 
					  est saisi
	Paramï¿½tres 		: 
	Utilisï¿½e dans	: declDeclarationArticleSaisie1_1.jsp
************************************************************************/
	function controleValeursObligatoires() {
	//alert('INDICATEUR VALEUR = '+document.getElementById("TNUM_IndicateurValeur").value);
	//alert('VALUE = '+checkWhiteSpace(document.getElementById("MNT_declCFAFret")));
//	if (document.getElementById("MNT_declValeurFret")){
//	//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
	
	var regime = document.getElementById("TNUM_LIST_declCodeRegimeDouanier_OB").value;
	var typeregime = regime.charAt(0);
	
	if (document.getElementById("MNT_declValeurFret")&&!checkWhiteSpace(document.getElementById("MNT_declValeurFret"))&&!checkZoneObligatoireOnglet("TXT_LIST_declDeviseFret", "LA DEVISE FRET DOIT ETRE SAISI",1))
		return false;
	
	if (document.getElementById("MNT_declValeurAutres")&&!checkWhiteSpace(document.getElementById("MNT_declValeurAutres"))&&!checkZoneObligatoire("TXT_LIST_declDeviseAutres", "LA DEVISE AUTRES ELEMENTS DOIT ETRE SAISI",1))
		return false;

	if(document.getElementById("TNUM_IndicateurValeur")&&document.getElementById("TNUM_IndicateurValeur").value=='0'){
		if (document.getElementById("NUM_declPoidsBrut") && document.getElementById("TNUM_declNumArticle").value=='1' && !checkZoneObligatoireOnglet("NUM_declPoidsBrut", "LE POIDS BRUT EST OBLIGATOIRE",0))	
			return false;
	
		if (document.getElementById("NUM_declPoidsNet") && document.getElementById("TNUM_declNumArticle").value=='1' && !checkZoneObligatoireOnglet("NUM_declPoidsNet", "LE POIDS NET EST OBLIGATOIRE",0)) 
			return false;
		
		if (document.getElementById("NUM_declNbreColis") && document.getElementById("TNUM_declNumArticle").value=='1' &&!checkZoneObligatoireOnglet("NUM_declNbreColis", "LE NBRE DE COLIS EST OBLIGATOIRE",0)) 
			return false;
		
		if (document.getElementById("MNT_declValeurFob")&&!checkZoneObligatoireOnglet("MNT_declValeurFob", "LA VALEUR FOB EST OBLIGATOIRE",1)) 
			return false;
		
		if (document.getElementById("TXT_LIST_declDeviseFob")&&!checkZoneObligatoireOnglet("TXT_LIST_declDeviseFob", "LA DEVISE FOB EST OBLIGATOIRE",1)) 
			return false;
		
		if (document.getElementById("TXT_LIST_declDeviseFret")&&!checkZoneObligatoireOnglet("TXT_LIST_declDeviseFret", "LA DEVISE FRET EST OBLIGATOIRE",1)) 
			return false;
		
		if (document.getElementById("MNT_declValeurFret")&&!checkZoneObligatoireOnglet("MNT_declValeurFret", "LA VALEUR FRET EST OBLIGATOIRE",1)) 
			return false;
		
		if (document.getElementById("MNT_declValeurAssurance")&&!checkZoneObligatoireOnglet("MNT_declValeurAssurance", "LA VALEUR ASSURANCE EST OBLIGATOIRE",1)) 
			return false;
		
		if (document.getElementById("MNT_declValeurFacture")&&((typeregime!='S')&&(typeregime!='C'))&&!checkZoneObligatoireOnglet("MNT_declValeurFacture", "LA VALEUR FACTURE EST OBLIGATOIRE",1)) 
			return false;
	
		if (document.getElementById("TXT_LIST_declDeviseFacture")&&((typeregime!='S')&&(typeregime!='C'))&&!checkZoneObligatoireOnglet("TXT_LIST_declDeviseFacture", "LA DEVISE FACTURE EST OBLIGATOIRE",1)) 
			return false;
		
		if((regime == 'S3') || (regime == 'S4') || (regime == 'S5') || (regime == 'S6') ){
			if (document.getElementById("TNUM_LIST_declCodeEntrepot")&&!checkZoneObligatoireOnglet("TNUM_LIST_declCodeEntrepot", "LE CODE ENTREPOT EST OBLIGATOIRE",1))
			return false;
		}
		
		return true;
	}else{
		return true;
	}
}


function confirmDeleteArticleDecl(msg) { 
//alert(document.getElementById("pk").value);
		var selectedRadio = '';
		var frm = document.forms.item(0);
		alert('reqcode ='+frm.reqCode.value);
		alert('action ='+frm.action);
		for (var i=0; i<frm.length; i++) {
		alert('name = '+frm.elements[i].name );
			if (frm.elements[i].name == 'pk') {
				selectedRadio = frm.elements[i].value;
				alert('element val= '+frm.elements[i].value);
				i = frm.length;
			}
		}
		
alert('val selected = '+selectedRadio) ;
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}

/*************  Cette fonction permet de vï¿½rifier si au moins************************/
/*************  un critï¿½re de recherche est saisi pour la dï¿½claration niveau douane ******************************/
function isCritereNullOrEmptyDecl(){
	var form = document.forms.item(0);
		return true;
		var elt; var j=0;
		
		//alert(compareTwoDate(form.DAT_manifDateDebut.value,form.DAT_manifDateFin.value));
		if(form.NUM_declAnnee.value!=''&&form.TNUM_declCodeBur.value==''){
		alert('Veuillez saisir le bureau d\'enregistrement de la dï¿½claration');
		return false;
		}
		else if(form.NUM_declNumSeq.value!=''&&(form.TNUM_declCodeBur.value==''||form.NUM_declAnnee.value=='')){
		alert('Veuillez saisir le numï¿½ro de la dï¿½claration (annï¿½e/bureau/numï¿½ro)');
		return false;
		}
		else if(form.TNUM_declCodeBur.value!=''&&form.NUM_declAnnee.value==''){
		alert('Veuillez saisir l\'annï¿½e d\'enregistrement de la dï¿½claration');
		return false;
		}
		else if(form.TNUM_declCodeBur.value!=''&&form.NUM_declAnnee.value!=''&&form.NUM_declNumSeq.value==''&&form.DAT_declDateEnregistrement.value==''){
		alert('Veuillez saisir la date d\'enregistrement');
		return false;
		}
		else if(form.DAT_declDateDebut.value!=''&&form.DAT_declDateFin.value==''){
		alert('Veuillez saisir la date de fin ');
		return false;
		}
		else if(form.DAT_declDateFin.value!=''&&form.DAT_declDateDebut.value==''){
		alert('Veuillez saisir la date de dï¿½but ');
		return false;
		}
		
		for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			if(elt.type=='text'||elt.type=='select-one'){
			if(elt.value!=''){j++;}
			}else if(elt.type=="checkbox"){
			if(elt.checked==true){j++;}
			}
		}
		if(j==0){
		alert('Veuillez saisir au moins un critï¿½re de recherche ');
		return false;
		}else if(j==1&&form.TNUM_LIST_declRegimeDouanier.value!=''){
		alert('Veuillez saisir au moins un autre critï¿½re de recherche ');
		return false;
		}else{
		return true;
		}
}

function isCritereNullOrEmptyDeclEnreg(){
	var form = document.forms[0];

	if((form.NUM_declAnnee.value !='') && (form.TNUM_declCodeBur.value !='') && (form.NUM_declNumSeq.value !='' )) 
	{
		return true;
	}
	else if ((form.NUM_declAnnee.value !='') && (form.TNUM_declCodeBur.value !='') && (form.TNUM_declNumeroRepertoire.value !='' ))
	{
		return true;
	}
	else if ((form.NUM_declAnnee.value !='') && (form.TNUM_declCodeBur.value !='')&& (form.DAT_declDateEnregistrement.value !='' ) )
	{
		return true;
	}
	else if ((form.NUM_declAnnee.value !='') && (form.TNUM_declCodeBur.value !='') &&  (form.DAT_declDateDebut.value !='' ) && (form.DAT_declDateFin.value !='' ) )
	{
		return true;
	}
	alert("Veuillez saisir soit :\n " +
			"- Annee, Bureau et Numero declaration \n " +
			"- ou Annee, Bureau et Numero repertoire \n " +
			"- ou Annee, Bureau et Date d'enregistrement\n  " +
			"- ou Annee, Bureau , Date debut et Date fin");
	return false;
}

function isCritereNullOrEmptyReglCredit(){
	var form = document.forms[0];

	if((form.TNUM_tresorAnneeDecl.value !='') && (form.TNUM_tresorBurDecl.value !='') && (form.TNUM_tresorNumDecl.value !='' )) 
	{
		return true;
	}
	else if ((form.DAT_tresorDateDebut.value !='') && (form.DAT_tresorDateFin.value !=''))
	{
		return true;
	}
	else if (form.TNUM_numDossierDef.value !='') 
	{
		return true;
	}
	else if ((form.TNUM_tresorAnneeDecl.value !='') && (form.TNUM_tresorBurDecl.value !='') &&  (form.DAT_tresorDateDebut.value !='' ) && (form.DAT_tresorDateFin.value !='' ) )
	{
		return true;
	}
	alert("Veuillez saisir soit :\n " +
			"- Annee, Bureau et Numero declaration \n " +
			"- Ou Date debut et Date fin \n " +
			"- Ou Numero dossier definitif \n  " +
			"- Ou Annee, Bureau , Date debut et Date fin");
	return false;
}

function temps(date)
{
var d = new Date(date[2], date[1] - 1, date[0]);
return d.getTime();
}

function periodeUnMois(){
	var form = document.forms.item(0);
	
	var date1=form.DAT_tresorDateDebut_OB.value;
	var date2=form.DAT_tresorDateFin_OB.value;

	var debut = temps(date1.split("/"));
	var fin = temps(date2.split("/"));
	var nb = (fin - debut) / (1000 * 60 * 60 * 24);
if(nb<=10) 
	{
		return true;
	}
else{
	alert("La pï¿½riode ne doit pas dï¿½passer 10 jours !!!");
	return false;
}
}

function isCritereNullOrEmptyDeclRech(){
	var form = document.forms.item(0);
	if((form.NUM_anneeenregdecl.value !='')&& (form.TNUM_burenregdecl.value!='')&& (form.NUM_numenregdecl.value!=''))
	{
		return true;
	}
	else if ((form.NUM_anneeenregdecl.value !='')&& (form.TNUM_burenregdecl.value!='')&& (form.DAT_dateenregdecl.value!=''))
	{
		return true;
	}
	else if ((form.NUM_anneeenregdecl.value !='')&& (form.TNUM_burenregdecl.value!='')&& (form.TNUM_dossierdecl.value!=''))
	{
		return true;
	}
	alert ("Veuiller saisir soit : \n " +
			"- Annï¿½e, Bureau et Numï¿½ro dï¿½claration \n " +
			"- ou Annï¿½e, Bureau et Date d'enregistrement \n " +
			"- ou Annï¿½e, Bureau et Nï¿½ dossier "); 
	return false;
}


function isCritereEmptyDmdModif(){
	var frm_0 = document.forms[0];
	
	//NUM_anneeenregdecl
	if(frm_0.numAnneeEnregDecl.value == "" 
			&& frm_0.numBurEnregDecl.value == ""
			&& frm_0.numEnregDecl.value == ""
			&& frm_0.numDossierDecl.value == ""
			&& frm_0.dateEnregDecl.value == ""
			&& frm_0.declDateDebut.value == ""
			&& frm_0.declDateFin.value == ""
		) {
		alert('Veuillez saisir au moins un critï¿½re de recherche');
		return false;
	}
	else if(frm_0.numAnneeEnregDecl.value != "" && frm_0.numAnneeEnregDecl.value != "" && frm_0.numBurEnregDecl.value != ""){
		return true;
	}	
	else if(frm_0.numAnneeEnregDecl.value != "" && frm_0.numBurEnregDecl.value == "" ){
		alert("Veuillez saisir le numï¿½ro de bureau d'enregistrement");
		return false;
	}
	else if(frm_0.numAnneeEnregDecl.value == "" && frm_0.numBurEnregDecl.value != ""){
		alert("Veuillez saisir l'annï¿½e d'enregistrement");
		return false;
	}
	//else if(frm_0.NUM_numenregdecl.value != "" && frm_0.NUM_anneeenregdecl.value == "" && frm_0.TNUM_burenregdecl.value == ""){
	//	alert("Veuillez saisir au moins l'annï¿½e ou le bureau d'enregistrement");
	//	return false;
	//}
	else if(frm_0.dateEnregDecl.value == "" && frm_0.declDateDebut.value == "" && frm_0.declDateFin.value == ""){
		alert("Veuillez saisir la date d'enregistrement ou une pï¿½riode");
		return false;
	}	
	else if(frm_0.dateEnregDecl.value == "" && frm_0.declDateDebut.value != "" && frm_0.declDateFin.value == ""){
		alert("Veuillez saisir la date fin");
		return false;
	}
	else if(frm_0.dateEnregDecl.value == "" && frm_0.declDateDebut.value == "" && frm_0.declDateFin.value != ""){
		alert("Veuillez saisir la date dï¿½but");
		return false;
	}
	else if(frm_0.declDateDebut.value != "" && frm_0.declDateFin.value != "" && (frm_0.numAnneeEnregDecl.value == "" && frm_0.numBurEnregDecl.value == "") ){
																						//|| (frm_0.NUM_anneeenregdecl.value == "" && frm_0.NUM_numenregdecl.value == "") 
																						//|| (frm_0.TNUM_burenregdecl.value == "" && frm_0.NUM_numenregdecl.value == "") ){
		alert("Veuillez saisir au moins l'annï¿½e ou le bureau de dï¿½claration");
		return false;
	}
	
	return true;
}
	
function effacerFormRechDemandeModifSeg(name){
	var frm_0 = document.forms[0];
	
	frm_0.numAnneeEnregDecl.value = "" ;
	frm_0.numBurEnregDecl.value = "" ;
	frm_0.numEnregDecl.value = "" ;
	frm_0.numDossierDecl.value = "" ;
	frm_0.dateEnregDecl.value = "" ;
	frm_0.declDateDebut.value = "" ;
	frm_0.declDateFin.value = "" ;
}

/*************  Cette fonction permet de vï¿½rifier la saisie des critï¿½res de recherche************************/
/*************  pour la consultation des dï¿½clarations enregistrï¿½es            ******************************/
function controleCriteresConsultationDeclEnreg(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
		if(form.NUM_declAnnee.value!=''&&form.TNUM_declCodeBur.value==''&&form.NUM_declNumSeq.value==''){
		alert('Veuillez saisir le bureau et le numï¿½ro');
		return false;
		}
		else if(form.NUM_declAnnee.value!=''&&form.TNUM_declCodeBur.value!=''&&form.NUM_declNumSeq.value==''&&form.DAT_declDateDebut.value==''&&form.DAT_declDateFin.value==''){
		alert('Veuillez saisir la pï¿½riode');
		return false;
		}
		else if(form.TNUM_declCodeBur.value!=''&&form.NUM_declAnnee.value==''&&form.NUM_declNumSeq.value==''){
		alert('Veuillez saisir l\'annï¿½e et le numï¿½ro ');
		return false;
		}
		else if(form.NUM_declNumSeq.value!=''&&form.NUM_declAnnee.value==''&&form.TNUM_declCodeBur.value==''){
		alert('Veuillez saisir l\'annï¿½e et le bureau ');
		return false;
		}
		else if(form.DAT_declDateDebut.value!=''&&form.DAT_declDateFin.value==''){
		alert('Veuillez saisir la date de fin ');
		return false;
		}
		else if(form.DAT_declDateFin.value!=''&&form.DAT_declDateDebut.value==''){
		alert('Veuillez saisir la date de dï¿½but ');
		return false;
		}
		for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			if(elt.type=='text'||elt.type=='select-one'){
			if(elt.value!=''){j++;}
			}else if(elt.type=="checkbox"){
			if(elt.checked==true){j++;}
			}
		}
		if(j==0 || j==1){
		alert('Veuillez saisir au moins un autre critï¿½re de recherche ');
		return false;
		}else{
		return true;
		}
}
		
		
/*************  Cette fonction permet de vï¿½rifier la saisie des critï¿½res de recherche************************/
/*************  des sommiers ******************************/
function controleCriteresRechSommier(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
//alert('form.rech_numenregDec.value '+form.rech_numenregDec.value);
		//alert(compareTwoDate(form.DAT_manifDateDebut.value,form.DAT_manifDateFin.value));
		if(form.rech_anneeDec.value!=''&&form.rech_burDec.value!=''&&form.rech_nomdeclarant.value!='')
		   return true;
		
		if(form.rech_anneeDec.value!=''&&form.rech_burDec.value==''&&form.rech_numenregDec.value==''){
		  alert('Veuillez saisir le bureau et le numï¿½ro');
		  return false;
		}		
		else if(form.rech_regimedouane.value!=''&&form.rech_regimedouane.value.length!=4){
		alert('Veuillez saisir le rï¿½gime sur quatre (4) positions ');
		return false;
		}
		else if(form.rech_anneeDec.value!=''&&form.rech_burDec.value!=''&&form.rech_numenregDec.value==''&&form.DAT_rech_periodeDebut.value==''&&form.DAT_rech_periodeFin.value==''){
		alert('Veuillez saisir la pï¿½riode');
		return false;
		}
		else if(form.rech_burDec.value!=''&&form.rech_anneeDec.value==''&&form.rech_numenregDec.value==''){
		alert('Veuillez saisir l\'annï¿½e et le numï¿½ro ');
		return false;
		}
		else if(form.rech_numenregDec.value!=''&&form.rech_anneeDec.value==''&&form.rech_burDec.value==''){
		alert('Veuillez saisir l\'annï¿½e et le bureau ');
		return false;
		}
		else if(form.DAT_rech_periodeDebut.value!=''&&form.DAT_rech_periodeFin.value==''){
		alert('Veuillez saisir la date de fin ');
		return false;
		}
		else if(form.DAT_rech_periodeFin.value!=''&&form.DAT_rech_periodeDebut.value==''){
		alert('Veuillez saisir la date de dï¿½but ');
		return false;
		}
		for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			if(elt.type=='text'||elt.type=='select-one'){
			if(elt.value!=''){j++;}
			}else if(elt.type=="checkbox"){
			if(elt.checked==true){j++;}
			}
		}
		if(j==0 || j==1){
		alert('Veuillez saisir au moins un autre critï¿½re de recherche ');
		return false;
		}else{
		return true;
		}
}
/**Controle critï¿½re de recherche de la comptabilitï¿½ annuelle*/
/*L'annï¿½e est obligatoire, si l'annï¿½e est saisie les ï¿½lï¿½ments(jour et mois)*/
/*sont vidï¿½s*/

function controleCriteresComptaBurAnnuelle(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
		if(form.NUM_douAnnee.value==''){
		alert(' Veuillez saisir l\'annï¿½e ');
		return false;
		}else{
		form.NUM_douJour.value='';form.NUM_douMois.value='';
		return true;
		}
}

/**Controle critï¿½re de recherche de la comptabilitï¿½ quotidienne**/
/*tous les ï¿½lï¿½ments(jour,mois,annï¿½e)*****************************/
/*doivent etre saisis*******************************************/

function controleCriteresComptaBurQuotidienne(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
		if(form.NUM_douAnnee.value==''&&form.NUM_douJour.value==''&&form.NUM_douMois.value==''){
		alert(' Veuillez saisir la date ');
		return false;
		}else if(form.NUM_douJour.value==''){
		alert(' Veuillez saisir le jour');
		return false;
		}
		else if(form.NUM_douAnnee.value!=''&&form.NUM_douJour.value!=''&&form.NUM_douMois.value==''){
		alert(' Veuillez saisir le mois ');
		return false;
		}else if(form.NUM_douAnnee.value==''&&form.NUM_douJour.value!=''&&form.NUM_douMois.value!=''){
		alert('Veuillez saisir l\'annï¿½e ');
		return false;
		}else if(form.NUM_douAnnee.value!=''&&form.NUM_douJour.value==''&&form.NUM_douMois.value!=''){
		alert(' Veuillez saisir le jour ');
		return false;
		}else{
		return true;
		}
}

/**Controle critï¿½re de recherche de la comptabilitï¿½ mensuelle**/
/*les ï¿½lï¿½ments(mois,annï¿½e)*****************************/
/*doivent etre saisis*******************************************/

function controleCriteresComptaBurMensuelle(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
		if(form.NUM_douMois.value==''){
		alert(' Veuillez saisir le mois ');
		return false;
		}
		else if(form.NUM_douAnnee.value==''){
		alert(' Veuillez saisir l\'annï¿½e ');
		return false;
		}else if (form.NUM_douAnnee.value!=''&&form.NUM_douMois.value!=''){
		form.NUM_douJour.value='';
		return true;
		}
}
/*************  Cette fonction permet de vï¿½rifier la saisie des critï¿½res de recherche************************/
/*************  des sommiers ******************************/
function controleCriteresRechModificationCotation(){
	var form = document.forms.item(0);
		
		var elt; var j=0;


       if(form.DAT_declDateDebut.value!=''&&form.DAT_declDateFin.value==''){
		alert('Veuillez saisir la date de fin ');
		return false;
		}
		else if(form.DAT_declDateFin.value!=''&&form.DAT_declDateDebut.value==''){
		alert('Veuillez saisir la date de d�but ');
		return false;
		}
		for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			if(elt.type=='text'||elt.type=='select-one'){
			if(elt.value!=''){j++;}
			}else if(elt.type=="checkbox"){
			if(elt.checked==true){j++;}
			}
		}
		if(j==0 || j==3){
		alert('Veuillez saisir au moins un autre crit�re de recherche ');
		return false;
		}else{
		return true;
		}
}
function NotImplemented()
{
alert('En cours de finalisation');
return;
}

function isCritereNullOrEmptyDeclEnregAffichage(){
	 var form = document.forms[0];

	 if((form.NUM_declAnnee.value !='') && (form.TNUM_declCodeBur.value !='') && (form.NUM_declNumSeq.value !='' )) 
	 {
	  return true;
	 }
	 else{
	 alert("Veuillez saisir  :\n " +
	   "- Année, Bureau et Numéro déclaration \n " );
	   
	 return false;}
	}