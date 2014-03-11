/* Remplacer toutes les occurrences d'une sous-cha�ne 
Cette fonction recherche dans une cha�ne expr toutes les occurrences 
d'une sous-cha�ne a et les remplace par une sous-cha�ne b.*/
function remplace(expr,a,b) {
	var i=0
	while (i!=-1) {
		i=expr.indexOf(a,i);
		if (i>=0) {
        	expr=expr.substring(0,i)+b+expr.substring(i+a.length);
        	i+=b.length;
		}
	}
	return expr;
}
   
/* Cette fonction permet de traiter le tableau tab 
contenant la liste des fonctionnalit�s.*/
function traitementTableau(tab){ 
	tab = remplace(tab,"[","");
	tab = remplace(tab,"]","");
	var tabNom=tab.split(",");
	return tabNom;
}

/* Cette fonction permet de vider une liste.*/
function raz(liste){
	l=document.forms[0].elements[liste].length;
	for (i=l; i>=0; i--)
	   document.forms[0].elements[liste].options[i]=null;
}


function AJAXReloadFonction(url,nameOfFormToPost) {
	//Do the Ajax call
	if (window.XMLHttpRequest) {// Non-IE browsers
		req = new XMLHttpRequest();
		req.onreadystatechange = function () {
						if (req.readyState == 4) {
							if (req.status == 200) {
								var tr = new Array();
								var tr = ""+req.responseText;
								
								//alert(tr);
								tr = traitementTableau(tr);
								raz("ids1");
								for (i=0; i<tr.length; i++){
									var temp = tr[i].split("|");
									alert("temp[1] : " +unescape(temp[1]));
         							new_option = new Option(temp[1],temp[0]);
						        	document.forms[0].elements["ids1"].options[document.forms[0].elements["ids1"].length]=new_option;
						        }
							}
						}
					};
		try {
			req.open("POST", url, true); //was get
		} catch (e) {
		  //
		}
		req.send();
	} else if (window.ActiveXObject) { // IE 
		req = new ActiveXObject("Microsoft.XMLHTTP");
		if (req) {
			req.onreadystatechange = function () {
					if (req.readyState == 4) {
							if (req.status == 200) {
								var tr = new Array();
								var tr = ""+req.responseText;
								tr = traitementTableau(tr);
								raz("ids1");
								for (i=0; i<tr.length; i++){
									var temp = tr[i].split(", ");
         							new_option = new Option(temp[0],temp[1]);
						        	document.forms[0].elements["ids1"].options[document.forms[0].elements["ids1"].length]=new_option;
						        }
							}
						}
					};
			req.open("POST", url, true);
			req.send();
		}
	}
}

function AJAXCalculateField(url,type,nameOfFormToPost) {
	//Do the Ajax call
	if (window.XMLHttpRequest) {// Non-IE browsers
		req = new XMLHttpRequest();
		req.onreadystatechange = function () {
						if (req.readyState == 4) {
							if (req.status == 200) {
								var tr = ""+req.responseText;
								if (tr != "") {
									var calc = tr.split("|");
									if (type == "FOB")
										document.getElementById('MNT_declCFAFob').value=calc[0];
									else if (type == "FACT")
										document.getElementById('MNT_declCFAFacture').value=calc[0];
									else if (type == "FRET")
										document.getElementById('MNT_declCFAFret').value=calc[0];
									else if (type == "ASS")
										document.getElementById('MNT_declCFAAssurance').value=calc[0];
									else if (type == "AUT")
										document.getElementById('MNT_declCFAAutres').value=calc[0];
									
									if (document.getElementById('MNT_declValeurCAF') != null)
										document.getElementById('MNT_declValeurCAF').value=calc[1];
										
									if (document.getElementById('MNT_declValeurMercuriale') != null)
										document.getElementById('MNT_declValeurMercuriale').value=calc[1];
										
									if (document.getElementById('MNT_declValeurDouane') != null){
										document.getElementById('MNT_declValeurDouane').value=calc[1];
									}
								}else{
									if (type == "FOB")
										document.getElementById('MNT_declCFAFob').value="";
									else if (type == "FACT")
										document.getElementById('MNT_declCFAFacture').value="";
									else if (type == "FRET")
										document.getElementById('MNT_declCFAFret').value="";
									else if (type == "ASS")
										document.getElementById('MNT_declCFAAssurance').value="";
									else if (type == "AUT")
										document.getElementById('MNT_declCFAAutres').value="";
										
									if (document.getElementById('MNT_declValeurCAF') != null)
										document.getElementById('MNT_declValeurCAF').value="";
										
									if (document.getElementById('MNT_declValeurMercuriale') != null)
										document.getElementById('MNT_declValeurMercuriale').value="";
										
									if (document.getElementById('MNT_declValeurDouane') != null){
										document.getElementById('MNT_declValeurDouane').value="";
									}
								}
							}
						}
					}
		try {
			req.open("POST", url, true); //was get
		} catch (e) {//
		}
		req.send(null);
	} else if (window.ActiveXObject) { // IE 
		req = new ActiveXObject("Microsoft.XMLHTTP");
		if (req) {
			req.onreadystatechange = function () {
				if (req.readyState == 4) {
						if (req.status == 200) {
							var tr = ""+req.responseText;
							if (tr != "") {
								var calc = tr.split("|");
								if (type == "FOB")
									document.getElementById('MNT_declCFAFob').value=calc[0];
								else if (type == "FACT")
									document.getElementById('MNT_declCFAFacture').value=calc[0];
								else if (type == "FRET")
									document.getElementById('MNT_declCFAFret').value=calc[0];
								else if (type == "ASS")
									document.getElementById('MNT_declCFAAssurance').value=calc[0];
								else if (type == "AUT")
									document.getElementById('MNT_declCFAAutres').value=calc[0];

								if (document.getElementById('MNT_declValeurCAF') != null)
									document.getElementById('MNT_declValeurCAF').value=calc[1];
									
								if (document.getElementById('MNT_declValeurMercuriale') != null)
									document.getElementById('MNT_declValeurMercuriale').value=calc[1];
									
								if (document.getElementById('MNT_declValeurDouane') != null){
									document.getElementById('MNT_declValeurDouane').value=calc[1];
								}
							}else{
								if (type == "FOB")
									document.getElementById('MNT_declCFAFob').value="";
								else if (type == "FACT")
									document.getElementById('MNT_declCFAFacture').value="";
								else if (type == "FRET")
									document.getElementById('MNT_declCFAFret').value="";
								else if (type == "ASS")
									document.getElementById('MNT_declCFAAssurance').value="";
								else if (type == "AUT")
									document.getElementById('MNT_declCFAAutres').value="";

								if (document.getElementById('MNT_declValeurCAF') != null)
									document.getElementById('MNT_declValeurCAF').value="";
									
								if (document.getElementById('NUM_declValeurMercuriale') != null)
									document.getElementById('NUM_declValeurMercuriale').value="";
									
								if (document.getElementById('MNT_declValeurDouane') != null){
									document.getElementById('MNT_declValeurDouane').value="";
								}
							}
						}
					}
				}
			try {
				req.open("POST", url, true); //was get
			} catch (e) {	//
			}
			req.send();
		}
	}
}

  function retrieveURL(url,nameOfFormToPost) {
			//alert('urllllllll='+url);
			//get the (form based) params to push up as part of the get request
			//////url=url+getFormAsString(nameOfFormToPost);
			//alert('urllllllll='+url);
			//Do the Ajax call
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();
			  req.onreadystatechange = processStateChange;
			  try {
				req.open("POST", url, true); //was get
			  } catch (e) {
			//  alert("RetrieveURL" + e)
				//alert("Problem Communicating with Server\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = processStateChange;
				req.open("POST", url, true);
				req.send();
			  }
			}//alert('fin retrieceURL');
		  }
		
		   
		  function processStateChange() {
			  tick2 = document.getElementById("tick2");
			  if (req.readyState == 4) {//alert('req.readyState =4'); // Complete
			  if (req.status == 200) { // OK response
				var tr=""+req.responseText;
			//	alert('tr='+trim(tr.substring(tr.indexOf('#')+1,tr.length))+"-");
				if(trim(tr.substring(tr.indexOf('#')+1,tr.length))!="")
				tick2.innerHTML = tr.substring(0,tr.indexOf('#'));
				else
				tick2.innerHTML ="";
				///alert("Ajaxx response:"+tr);
				
				
			  } else {
				//alert("Problem with server response:\n " + req.statusText);
			  }
			}
		  }
		  
 		function submitAjaxURL(url,nameOfFormToPost) {
			//alert('urllllllll='+url);
			//get the (form based) params to push up as part of the get request
			//////url=url+getFormAsString(nameOfFormToPost);
			//alert('urllllllll='+url);
			//Do the Ajax call
 			alert(url);
			if (window.XMLHttpRequest) {//alert('deb retrieveURL'); // Non-IE browsers
			  req = new XMLHttpRequest();
			  req.onreadystatechange = process;
			  try {
				req.open("POST", url, true); //was get
			  } catch (e) {
				alert("Problem Communicating with Server\n"+e);
			  }
			  req.send(null);
			} else if (window.ActiveXObject) { // IE
			  
			  req = new ActiveXObject("Microsoft.XMLHTTP");
			  if (req) {
				req.onreadystatechange = process;
				req.open("POST", url, true);
				req.send();
			  }
			}//alert('fin retrieceURL');
		  }
		   
		  function process() {
		  
			  if (req.readyState == 4) {//alert('req.readyState =4'); // Complete
			  if (req.status == 200) { // OK response		
				//alert("Ajaxx responseqq:"+req.responseText);
				var tr=req.responseText;
				//alert('tr = '+tr);
				
				//recuperation du pk mere coch�
				
				var pkstr=tr.split("|");
				
			/*	for(var j=0;j<pkstr.length;j++){
				//alert(pk+'pk[j] '+pk.length);
			   	var pkfils=pkstr[j].split("~~");
				//alert('pkfils = '+pkfils);
				var pk=pkstr[0].split("~~");
				for(var k=0;k<pkfils.length;k++){
				//alert('pk = '+pk);
			   	if((pk[0]==pkfils[0])&&(pk[1]==pkfils[1])&&(pk[2]==pkfils[2])
			   		&&(pk[3]==pkfils[3])&&(pk[4]==pkfils[4])&&pkfils[5]!="0")
				{
				  for(var i=0;i<document.forms[0].length;i++){
				  
				  if(document.forms[0].elements[i].type=="checkbox"){
				//  alert('[i]'+i+' '+document.forms[0].elements[i].value);
				  if(tr.indexOf(document.forms[0].elements[i].value)!=-1){//alert('ii');
				    if(pkstr[0]!=document.forms[0].elements[i].value&&document.forms[0].elements[i].checked==false)
				    {//alert('kk');
				    document.forms[0].elements[i].checked=true;
				     }else{
				     if(pkstr[0]!=document.forms[0].elements[i].value&&document.forms[0].elements[i].checked==true)
				     {//alert('uu');
				     document.forms[0].elements[i].checked=false;
				    
				    }
				   }
				  }
				}
				
				}
			   
			  // alert('FIN FILS');
			   }
			  }*/
				document.getElementById("stringPkMere").value=req.responseText;
			//}
			  } else {
				//alert("Problem with server response:\n " + req.statusText);
			  }
			}
		  }
 function doReturnUrl(action,urlforwardPage){
	document.forms[0].action =action+'?page='+urlforwardPage;
	document.forms[0].submit();
 }

 function doReturnUrl2(action,urlforwardPage){
		document.forms[0].action =action+'?pageContext='+urlforwardPage;
		document.forms[0].submit();
	 }
 function doReturnUrlLogOut(){
	document.forms[0].action='login.do';
	document.forms[0].action +='?reqCode=logout';
	document.forms[0].submit();
 }
 
function submitForward(button) {	
	if (button.name == "calDevPJ") {
		document.forms[0].action = "calculDevisPiecesJointes?pageContext=calculDevisPieces";
	} else if (button.name == "PJRep") {
		document.forms[0].action = "piecesAJoindreRep.action?pageContext=piecesAJoindre";
	} else if (button.name == "DevArt") {
		document.forms[0].action = "devisArticleAction?pageContext=devisart";
	} else if (button.name == "PJArt") {		
		document.forms[0].action = "piecesAJoindreArtAction.action?pageContext=piecesAJoindre";
	} else if (button.name == "LiqTot") {
		document.forms[0].action = "liquidationTotale?pageContext=liquidtotal";
	} else if (button.name == "LiqTotArt") {
		document.forms[0].action = "?reqCode=liquidationTotaleByArticle&page=liquidtotal";
	} else if(button.name == "AttCont") {
		document.forms[0].action = "editAttachementConteneurByArticleAction.action?pageContext=editAttachementConteneur";
	} else if (button.name == "DevArt1") {
		document.forms[0].action = "devisArticle?pageContext=devisart";
	} else if (button.name == "PJArt1") {		
		document.forms[0].action = "piecesAJoindreArt.action?pageContext=piecesAJoindre";	
	} else if (button.name == "PJRep1") {
		document.forms[0].action = "piecesAJoindreRepAction.action?pageContext=piecesAJoindre";
	} else if (button.name == "LiqTot1") {
		document.forms[0].action = "liquidationTotaleAction?pageContext=liquidtotal";
	} else if (button.name == "calDevPJ1") {
			document.forms[0].action = "calculDevisPiecesJointesAction?pageContext=calculDevisPieces";
	} 
	
	document.forms[0].submit();
	
				
	
}

function EnableChamp (eChamp) { // Active un champ du formulaire
  if(eChamp){
	eChamp.readOnly = false;
	eChamp.style.background = "#ffffff";
  }
}

function DisableChamp (eChamp) { // D�sactive un champ du formulaire
  if(eChamp){
	eChamp.readOnly = true;
	eChamp.style.background = "#e6e6e6";
  }
}

function EnableChampZoneListe (eChamp) { // Active un champ du formulaire
  if(eChamp)
	eChamp.disabled = false;
}

function DisableChampZoneListe (eChamp) { // D�sactive un champ du formulaire
  if(eChamp)
	eChamp.disabled = true;
}

function onlyFirstToUpper(mot) {
	var m=mot.charAt(0).toUpperCase() +
	mot.substring(1).toLowerCase();
	return m;
}

/*****************************/
function doSubmitWithaoutValidate(action,page,champs){
	vFormUpperCase();
	if(page=='rechercheManifeste' && document.getElementById('actionSearch')!=null )
		document.getElementById('actionSearch').value='search';

	//document.forms[0].reqCode.value =requestCode;
	if(champs)
	  document.forms[0].action = action+'?page='+page+'&champs='+champs;
	  else
	  document.forms[0].action = action+'?page='+page;	 
	document.forms[0].submit();
}

function doSubmitWithaoutValidate2(action,page,champs){
	vFormUpperCase();
	if(page=='rechercheManifeste' && document.getElementById('actionSearch')!=null )
		document.getElementById('actionSearch').value='search';
		
	//document.forms[0].reqCode.value =requestCode;
	if(champs)
	  document.forms[0].action = action+'?pageContext='+page+'&champs='+champs;
	  else
	  document.forms[0].action = action+'?pageContext='+page;	 
	document.forms[0].submit();
}

function doSubmit(action,page){
if(vForms()==false){
	document.forms[0].action = '';
	errorFound=true;
	return false;
}
//if(typbut&&typbut.value.toLowerCase() != 'effacer'&&vForms()==false)return;
//document.forms[0].reqCode.value =requestCode;
errorFound=false;
document.forms[0].action = action+'?page='+page;
document.forms[0].submit();
}

function doSubmit2(action,page){
	if(vForms()==false){
		document.forms[0].action = '';
		return false;
	}
	//if(typbut&&typbut.value.toLowerCase() != 'effacer'&&vForms()==false)return;
	//document.forms[0].reqCode.value =requestCode;
	document.forms[0].action = action+'?pageContext='+page;
	document.forms[0].submit();
	}

function doSubmitSearch(action,page){
	vFormUpperCase();
	if(page=='rechercheManifeste' && document.getElementById('actionSearch')!=null )
		document.getElementById('actionSearch').value='search';
	
	document.forms[0].action = action+'?pageContext='+page;	 
	document.forms[0].submit();
}

function doReturn(){
document.forms[0].action = 'menu?page=menu';
document.forms[0].submit();

}
 
/***********************************************************************	
	Module 			: GESTION DE GROUPES ET FONCTIONNALITES
	Description 	: 
	Auteur 			: Cyril Niang
************************************************************************/

function selectAll() {
	var i = 0;
	if (this.form.ids2.options.length == 0) {
		alert('Vous devez choisir au moins une option');
		return false;
	}
	while (i < this.form.ids2.options.length)
	{
		this.form.ids2.options[i].selected = true;
		i++;
	}
	return true;
}
function doSubmitFonc(requestCode,page){
	if(vForms()==false)return;
	if(selectAll()==false)return;
	document.forms[0].reqCode.value =requestCode;
	document.forms[0].action = document.forms[0].action+'?page='+page;
	document.forms[0].submit();
}
/***********************************************************************	
	Module 			: GESTION DE SOMMIER
	Description 	: 
	Auteur 			: Chatbri Ali
************************************************************************/
// -------- fonction de submit de formulaire -------
function doSubmitSommier(action){	
	if(vForms()==false)return;	
	document.forms[0].action =action;
	document.forms[0].submit();
}
// -------- fonction de submit de formulaire -------
function doSubmitSommierWithaoutValidate(action){
	vFormUpperCase();
	document.forms[0].action = action;
	document.forms[0].submit();
}

var form; 
var dayarray=new Array("Dimanche","Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi")
var montharray=new Array("Janvier","F&eacute;vrier","Mars","Avril","Mai","Juin","Juillet","Ao&ucirc;t","Septembre","Octobre","Novembre","D&eacute;cembre")

function getthedate() {
	tick2 = document.getElementById("tick2");
	var mydate = new Date();
	var year = mydate.getYear();
	var day = mydate.getDay();
	var month = mydate.getMonth();
	var daym = mydate.getDate();
	var hours = mydate.getHours();
	var minutes = mydate.getMinutes();
	var seconds = mydate.getSeconds();

	if (minutes <= 9)	minutes = "0"+minutes;
	if (seconds <= 9)	seconds = "0"+seconds;

	var cdate='<span class=\'Date\'>'+dayarray[day]+',  '+daym+' '+montharray[month]+' '+year+'<br>'+hours+':'+minutes+':'+seconds+'</span>';
  //  var cdate='<span class=\'Date\'>'+'<br>'+hours+':'+minutes+':'+seconds+'</span>';
    retrieveURL('messageEntete.action');
//	if (tick2&&document.all) {
//		//document.all.clock.innerHTML=cdate
//	//	tick2.innerHTML = cdate;
//		}
//	else {
//		document.write(cdate);
//		}
	//	alert(cdate);
}
//if (!document.all) {
//	getthedate();
//}
function GoForIt () {
	if (document.all) {
		setInterval("getthedate()",30000);
		}
}
/***Fonction d'organisation de la form****/
// style obligatoire
function OrganiseForms() {
	for (var fn=0; fn<document.forms.length; fn++) {
		form = document.forms.item(fn);
		
	    var j=0;
	    var hid=0;
		for (i=0; i<form.length; i++) {
			if( form.elements[i].type!='hidden'&&form.elements[i].type!='button'&&form.elements[i].type!='radio'){
//			alert('form1');
				if (form.elements[i].name&&form.elements[i].name.substring(form.elements[i].name.length-3,form.elements[i].name.length)=='_OB') {				
				//alert(document.getElementsByTagName("span")[i].sourceIndex-1);
					if (document.getElementsByTagName("span")[i]&&document.all[document.getElementsByTagName("span")[i].sourceIndex-1].tagName.toLowerCase()=="th") {
						//alert('form2');            
						j=(Number(i)- Number(hid)+1);
  			            document.getElementsByTagName("span")[j].style.fontWeight="bold"; 
				    }else{
				    j=(Number(i)- Number(hid)+1);
				     document.getElementsByTagName("span")[j].style.fontWeight="bold"; 
				     }
			    }
			    if (form.elements[i].name&&form.elements[i].name.indexOf('_LIST_')!=-1) {	
			   		form.elements[i].title="Aide � la saisie! Appuyer sur F9."; 
			    }
			}else{
				hid++;
			}
		}	 
	}
}

function checkUncheck(fild){

	var frm=document.forms.item(document.forms.length-1);
	
	for (i=0; i<frm.length; i++) {
	 	if(frm.elements[i].type=="checkbox"&&frm.elements[i].name.indexOf('array')!=-1){	 	
	 	 if(frm.elements[i].checked==true){
	        frm.elements[i].checked=false;
	        fild.value='Selectionner Tout';
	        }else{
	        frm.elements[i].checked=true;
	        fild.value='D�selectionner Tout';
	        }
	     }
		}
}
function f9t(tabname,forward,fieldstypes,where,lib,tit,textboxs,textboxs1,textboxs2,textboxs3,textboxs4,textboxs5,textboxs6,textboxs7,textboxs8,textboxs9){
	var frm=document.forms.item(document.forms.length-1);
	var txt=textboxs.name;
	var pk='';
	var x = (window.screen.availwidth/2)-350;
	var y = (window.screen.availheight/2)-200;
	
	if(textboxs2==undefined){
	 	winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0, width=800, height=370, modal=yes, left='+x+', top='+y);
	}else{
	 	if(textboxs3==undefined)
	   		winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&lib='+lib+'&titre='+tit,'Titre', 'toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370,  modal=yes, left='+x+', top='+y);
	    else{
	    	if(textboxs4==undefined)
	     		winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=1, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370,  modal=yes, left='+x+', top='+y);
	       	else{
	        	if(textboxs5==undefined)
	           		winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370,  modal=yes, left='+x+', top='+y);
	           	else{
	            	if(textboxs6==undefined)
	             		winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtbox5='+textboxs5.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&txtboxname5='+textboxs5.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370,  modal=yes, left='+x+', top='+y);
	            	else{
	             		if(textboxs7==undefined)
	             			winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtbox5='+textboxs5.value+'&txtbox6='+textboxs6.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&txtboxname5='+textboxs5.name+'&txtboxname6='+textboxs6.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370, modal=yes,  left='+x+', top='+y);
	               		else{
	                		if(textboxs8==undefined)
	                 			winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtbox5='+textboxs5.value+'&txtbox6='+textboxs6.value+'&txtbox7='+textboxs7.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&txtboxname5='+textboxs5.name+'&txtboxname6='+textboxs6.name+'&txtboxname7='+txtboxname7.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370, modal=yes,  left='+x+', top='+y);
	                  		else{
	                   			if(textboxs9==undefined)
	                   				winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtbox5='+textboxs5.value+'&txtbox6='+textboxs6.value+'&txtbox7='+textboxs7.value+'&txtbox8='+textboxs8.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&txtboxname5='+textboxs5.name+'&txtboxname6='+textboxs6.name+'&txtboxname7='+txtboxname7.name+'&txtboxname8='+txtboxname8.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370,  modal=yes, left='+x+', top='+y);
	                      		else                      
	                 	 			winName = window.open('f9Action.action?TableName='+tabname+'&Forward='+forward+'&pk='+pk+'&where='+where+'&FieldsTypes='+fieldstypes+'&txtbox0='+textboxs.value+'&txtbox1='+textboxs1.value+'&txtbox2='+textboxs2.value+'&txtbox3='+textboxs3.value+'&txtbox4='+textboxs4.value+'&txtbox5='+textboxs5.value+'&txtbox6='+textboxs6.value+'&txtbox7='+textboxs7.value+'&txtbox8='+textboxs8.value+'&txtbox9='+textboxs9.value+'&txtboxname0='+textboxs.id+'&txtboxname1='+textboxs1.name+'&txtboxname2='+textboxs2.name+'&txtboxname3='+textboxs3.name+'&txtboxname4='+textboxs4.name+'&txtboxname5='+textboxs5.name+'&txtboxname6='+textboxs6.name+'&txtboxname7='+txtboxname7.name+'&txtboxname8='+txtboxname8.name+'&txtboxname9='+txtboxname9.name+'&lib='+lib+'&titre='+tit,'Titre','toolbar=0, location=0, directories=0, status=0, scrollbars=0, resizable=0, copyhistory=0, menuBar=0,  width=800, height=370, modal=yes,  left='+x+', top='+y);
							}
						}
					}
				}
			}
		}
	}
	winName.focus();
}

function menuSubmit(code) {
	menuForm = document.forms.item(0);	
	menuForm.codeOperation.value = code;
	menuForm.submit();
}
function DisablePK (fnForm) { // D�sactive les champs Primary Key
	for (i=0; i<fnForm.length; i++) {
		if (fnForm.elements[i].name.indexOf('PK_')!='-1' && fnForm.elements[i].value!='') {
			DisableChamp(fnForm.elements[i]);
		}
	}
}

var nbrdec=3;
function FirstTime () { // Fonctions � appeler au chargement de la page
 var version=navigator.appMinorVersion;
	var type=navigator.appCodeName;
	//if(navigator.javaEnabled()==false)navigator.javaEnabled()=true;
	//alert(navigator.appVersion);
	////if (version!=";SP1;"&&type=="Mozilla") 
	 ////   alert("Il faut installer de pr�f�rence la Version 6 d'INTERNET EXPLORER car �a peut caus� des Probl�me");
	try{
		//GoForIt();
		for (var fn=0; fn<document.forms.length; fn++){
			fnForm = document.forms.item(fn);
			DisablePK(fnForm);

			FormatInputs(fnForm);
			for (var i=0; i<fnForm.length; i++) {
				if (fnForm.elements[i].name=='HB_NBRDEC'&&fnForm.elements[i].value!='') {nbrdec=fnForm.elements[i].value;}
				fnForm.elements[i].onkeypress = function GTN(){					
				/*	if((this.style.background == '#ffffe6'||this.style.background == '#FFFFE6')&& this.value=='')
			           this.style.background ='#f8f9fa';
	                if((this.style.background == '#00ffff'||this.style.background == '#00FFFF')&& this.value=='')
	                   this.style.background ='#f8f9fa';*/
				  GoToNext(this.form,this);
				}
				fnForm.elements[i].onfocusout = function GTV_VALIDE(){
				 if(this.style.background !='#EEEEEE'&&this.style.background !='#eeeeee'&& this.style.background !='#EDEDED'&&this.style.background !='#ededed'){
				       if((this.style.background == '#00ffff'||this.style.background == '#00FFFF')&& this.value!=''){
						   alert('Code erron�');
						   this.focus();
						   return;
					   }
					 if( Validate(this.form,this,13)==false){
					  this.focus();
					  return;
					  }//Validate(this.form,this,13);
					/*   if((this.style.background == '#ffffe6'||this.style.background == '#FFFFE6')&& this.value=='')
						  {this.style.background ='#f8f9fa';}
				       if((this.style.background == '#00ffff'||this.style.background == '#00FFFF')&& this.value=='')
				               this.style.background ='#f8f9fa';*/
 	                   }/*else{alert('YYYY');
 	                     this.style.background ='#EEEEEE'
       	                 this.style.background ='#eeeeee'
 	                   }*/

				}
			}
		}
if(document.forms.length>0)
		form = document.forms.item(document.forms.length-1);
    else
        form= document.forms.item(0);
	 if (form&&form.length>0) 
             SelectFirst();
		OrganiseForms();
	}catch(Exception){
		// alert('+-Votre session est expir�e Veuillez aller � la Page login');
	     return;		
    }
}
function FirstTimeForLogin () { // Fonctions � appeler au chargement de la page
 var version=navigator.appMinorVersion;
	var type=navigator.appCodeName;
	//if(navigator.javaEnabled()==false)navigator.javaEnabled()=true;
	try{
		for (var fn=0; fn<document.forms.length; fn++){
			fnForm = document.forms.item(fn);
			DisablePK(fnForm);

			FormatInputs(fnForm);
			for (var i=0; i<fnForm.length; i++) {
				 fnForm.elements[i].onkeypress = function GTN(){					
				 GoToNext(this.form,this);
				}
				fnForm.elements[i].onfocusout = function GTI_VALIDE(){
				 if(this.style.background !='#EEEEEE'&&this.style.background !='#eeeeee'&& this.style.background !='#EDEDED'&&this.style.background !='#ededed'){
				       if((this.style.background == '#00ffff'||this.style.background == '#00FFFF')&& this.value!=''){
						   alert('Code erron�');
						   this.focus();
						   return;
					   }
					   Validate(this.form,this,13);
					   if((this.style.background == '#ffffe6'||this.style.background == '#FFFFE6')&& this.value=='')
						  {this.style.background ='#f8f9fa';}
				       if((this.style.background == '#00ffff'||this.style.background == '#00FFFF')&& this.value=='')
				           this.style.background ='#f8f9fa';
 	                   }

				}
			}
		}
if(document.forms.length>0)
		form = document.forms.item(document.forms.length-1);
    else
        form= document.forms.item(0);
	 if (form&&form.length>0) 
             SelectFirst();
		OrganiseForms();
	}catch(Exception){
		// alert('+-Votre session est expir�e Veuillez aller � la Page login');
	     return;		
    }
}

function SelectFirst () { // Fonction qui, au chargement de la page, selectionne le premier champ du formulaire
if(document.getElementById("tabs0head0")==null){
	for (i=0; i<form.length; i++) {
		if(form.elements[i]&&form.elements[i].disabled==false && form.elements[i].readOnly==false && form.elements[i].type!='hidden' && form.elements[i].type!='radio' && form.elements[i].className!="hasDatepicker"){
			form.elements[i].focus();
			//form.elements[i].select();
			break;
		}
	}
}
}

function Validate (ThisForm,fieldV,key) { // Fonction validation des type des champs
	
	
	form = ThisForm;
	
	var errdate=0;		
	var errnum=0;	
	var errtnum=0;
	var errmnt=0;	
	var errtaux=0;	
	//if(fieldV.style.background == '#FFFFE6' &&	fieldV.style.color == '#CC0000') 	UnsetInvalidStyle_n(fieldV);
	Formater(fieldV);
	//******************************************************************	
//alert('  window  '+ window.event.keyCode+'  key  '+key);
		
	if (window.event.keyCode == 13 || window.event.keyCode==9 || (key==13 && window.event.keyCode!=13 && window.event.keyCode!=9)  ) {	
		
		if (fieldV.name.indexOf('DAT_') != '-1' ) {
				
				if (fieldV.value!=''){
				
					if (ValidateDate(ThisForm,fieldV,key)==false) errdate++;
					else if (isDt(fieldV)==false) errdate++;
				}else{
				//if(fieldV.style.background == '#FFFFE6' &&	fieldV.style.color == '#CC0000')
					UnsetInvalidStyle_n(fieldV);
				}
			
		}
		
		if (fieldV.name.indexOf('NUM_') != '-1'&&fieldV.name.indexOf('TNUM_') == '-1' && isNum(fieldV) == false) errnum++;
		if (fieldV.name.indexOf('TNUM_') != '-1' &&  isAlphanum(fieldV.value,fieldV) == false) errtnum++;
		
		if (fieldV.name.indexOf('MNT_') != '-1'&& fieldV.value!='' ) {
			if (isMnt(fieldV) == false) errmnt++;
			else FormatMNT(fieldV);
		}
		if (fieldV.name.indexOf('TAUX_') != '-1') {
			if (isTx(fieldV) == false) errtaux++;
			else FormaterTaux(fieldV);
		}
		if (errdate > 0) {
			alert ("La Date saisie est invalide  !!!");
			SetInvalidStyle_n(fieldV);
			//fieldV.value = "";
			fieldV.focus();
			
			return false;
		}		
		if (errnum > 0) {
			alert ("Seuls les caract�res num�riques sont valides !!! ");
			SetInvalidStyle_n(fieldV);
			//fieldV.value = "";
			fieldV.focus();
			return false;
		}	
		if (errtnum > 0) {
			alert ("Seuls les caract�res Alphanum�riques sont valides  !!! ");
			SetInvalidStyle_n(fieldV);
			//fieldV.value = "";
			fieldV.focus();
			return false;
		}			
		if (errmnt > 0) {
			alert ("Ce Montant est invalide  !!! ");
			SetInvalidStyle_n(fieldV);
			//fieldV.value = "";
			fieldV.focus();
			return false;
		}		
		if (errtaux > 0) {
			alert ("Ce Taux est invalide  !!! ");
			SetInvalidStyle_n(fieldV);
			//fieldV.value = "";
			fieldV.focus();
			return false;
		}	
		
		if (errdate==0 && errnum==0 && errmnt==0 && errtaux==0 &&errtnum==0){
			//if(fieldV.style.background == '#FFFFE6' &&	fieldV.style.color == '#CC0000') 	
			
			if(fieldV.type!= 'reset'&&fieldV.type!= 'submit'&&fieldV.type!= 'button')
			{
			UnsetInvalidStyle_n(fieldV);
			return true;
			}
		}
	}
	
}
function GoToNext (ThisForm,fieldG) {

var posch1=0;
form = ThisForm;
//alert(' debut key');
Formater(fieldG); FormatMNT(fieldG);
/////////////////////////////////////////////////////////////////
		
		if (window.event.keyCode == 13 || window.event.keyCode==9 ) {
		//alert(' debut go');
			//if (Validate(ThisForm,fieldG,0)==true) {
				try{
				   
					posch1=0;
					for (i=0; i<form.length; i++) {		
						if (form.elements[i].name==fieldG.name) {	
							if (i==form.length-1) {posch1=0;}
							else posch1=i+1;
						}
					}
					var d=form.elements[posch1].name;
					
					while ((document.getElementById( form.elements[posch1].name+"F")&&document.getElementById( form.elements[posch1].name+"F").style.visibility=="hidden")||form.elements[posch1].disabled==true || form.elements[posch1].readOnly==true || form.elements[posch1].type=='hidden' || form.elements[posch1].className=='hidden') {
						if (posch1==form.length-1) posch1=0;
						else posch1++;	
						//if (posch1=posch) break;
					}
					FNEXT=form.elements[posch1];
					if (FNEXT&&fieldG.type.toLowerCase()!='textarea')	{
						//UnsetInvalidStyle_n(fieldG);
						FNEXT.focus();
					}					
				}catch (Exception) {
				//	alert('gonext apres exception ');
				if(document.getElementById("tabs0head1")){
					selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
					FNEXT.focus();
				}else
				fieldG.focus();
				}
			//}
		}
			
}

 function ValidateDate(theForm,fieldVD,key){
	var err=0;
	var comp = '';
	var mMonth = "";
	var mDay = "";
	var mYear = "";
	var mToday = new Date();
	var checkYear = mToday.getFullYear() + 50;
	var mCheckYear = '';
	var i=0;
	var nbr=0;
	//***************************************************************
	var iField = fieldVD;
	var iValue = fieldVD.value;
	var strCheck = '48,49,50,51,52,53,54,55,56,57';
	var whichCode = window.event.keyCode; 
	//alert('  date '+fieldVD);
	//alert(' valid date '+iValue);
	//alert ('Valider date '+iValue+'  key  '+window.event.keyCode);
	//FormaterDate(theForm,elpos);
	if (window.event.keyCode == 13 || window.event.keyCode==9 || key==13){
	//alert(' code key ');
		if (iValue.indexOf('/') == '-1'){				    				    
	    	comp = '';
	    	if (iValue.length == 5){
				comp = '200';
			}else if (iValue.length == 6){
				if (mCheckYear >= checkYear) comp = '19';
				else comp = '20';
			}else if (iValue.length == 7) {
				comp = '2';
			}else if (iValue.length<=5 || iValue.length >= 9) {
			 	err++;	
			}
			iValue = iValue.substring(0,2) + '/' + iValue.substring(2,4) + '/' + comp + iValue.substring(4,iValue.length);					
	    }else {
	    	nbr=0;
	    	for (i=0;i<iValue.length;i++){
	    		if (iValue.charAt(i)=='/') nbr++;
	       	}
	       
	    	if (nbr!=2) err++;
	    	
	    	if (iValue.indexOf('/')!=2 || iValue.lastIndexOf('/')!=5) err++;
	    	//***************
	    	comp = '';
			if (iValue.length == 7){
				comp = '200';
			}else if (iValue.length == 8){
				if (mCheckYear >= checkYear) comp = '19';
				else comp = '20';
			}else if (iValue.length == 9) {
				comp = '2';
			}else if (iValue.length<=7 || iValue.length >= 11) {
			 	err++;	
			}
			if (comp!=''&&err==0){
				iValue = iValue.substring(0,6)  + comp + iValue.substring(6,iValue.length);					
				fieldVD.value=iValue;
			}
	    
	    }
    if(err>0){   
    	fieldVD.focus();
    	return false;   	
    }else{    	
    	UnsetInvalidStyle_n(fieldVD);
    	return true;
    }
    
    }
 }
 
function FormatInputs(theForm) {
	form = theForm;

	for (var i=0; i<form.length; i++) {

		var iValue = form.elements[i].value;

		var iName = form.elements[i].name;

		var iClassName = form.elements[i].className.toLowerCase;

		var iType = form.elements[i].type;

		var iReadOnly = form.elements[i].readOnly;
if(iName.indexOf('.initialValues')!=-1){
  form.elements[i].style.background = '#EDEDED';
  form.elements[i].readOnly=true;
  }
		if (iType != 'hidden' && iType != 'button' && iType != 'submit' && iType != 'reset' && iClassName != 'hidden') {
			if (iName.indexOf('TAUX_') != '-1' && iValue == '') {
				form.elements[i].value = '0';
				}
			if (iName.indexOf('TAUX_') != '-1' && iValue.indexOf('%') == '-1') {
				form.elements[i].value = form.elements[i].value + '%';
				}
			if (((iName.indexOf('LIST_') != '-1')||(iName.indexOf('List') != '-1'))&&iReadOnly==false) {
				SetListStyle(i);
				}
			if (iType == 'checkbox' || iType == 'radio') {
				SetNoBorderStyle(i);
				}
			if (iReadOnly == true || iReadOnly == 'readonly') {
				form.elements[i].style.background = '#EDEDED';
				}
				
		/*	if (iName.indexOf('NUM_') != '-1'&& iName.indexOf('NUM_') == '0') {
					if (iValue!='')
					     form.elements[i].value=format(iValue,"0"," ");
			}
			*/
			if (iName.indexOf('MNT_') != '-1') { 
			
				form.elements[i].style.textAlign = 'right';
				 if(iValue.indexOf('.')!=-1)
				     form.elements[i].value=format(remplace(iValue," ",""),"2"," ");
				     else
				     form.elements[i].value=format(remplace(iValue," ",""),"0"," "); 
			}
			if (iName.indexOf('TXT_') != '-1') {
				form.elements[i].style.textAlign = 'left';
				}
			if (iName.indexOf('TNUM_') != '-1') {
			form.elements[i].style.textAlign = 'left';
			}
			}
			if (iType == 'button' || iType == 'submit' || iType == 'reset') {
			form.elements[i].className="buttonBar";
			//form.elements[i].style.textAlign = 'center';
			//form.elements[i].style.background = '#DDDDDD';
			}
			
			
			if ((form.elements[i].readOnly==true&&form.elements[i].value!='')) {
				var errdate=0;		
				var errnum=0;	
				var errmnt=0;	
				var errtaux=0;	
			
			/*if (form.elements[i].name.indexOf('DAT_') != '-1' ) {
				if (form.elements[i].value!=''){
					if (ValidateDate(form,form.elements[i],13)==false) errdate++;
					else if (isDt(form.elements[i])==false) errdate++;
					if (errdate>0) UnsetInvalidStyle_n(form.elements[i]);
				}
			}*/
			
		}
	}
}
/******Fonction g�n�ral permet de formater un nombre ou decimal******************/
/*function format(valeur,decimal,separateur) {
	// formate un chiffre avec 'decimal' chiffres apr�s la virgule et un separateur
	var deci=Math.round( Math.pow(10,decimal)*(Math.abs(valeur)-Math.floor(Math.abs(valeur)))) ; 
	var val=Math.floor(Math.abs(valeur));
	if ((decimal==0)||(deci==Math.pow(10,decimal))) {val=Math.floor(Math.abs(valeur)); deci=0;}
	var val_format=val+"";
	var nb=val_format.length;
	for (var i=1;i<4;i++) {
		if (val>=Math.pow(10,(3*i))) {
			val_format=val_format.substring(0,nb-(3*i))+separateur+val_format.substring(nb-(3*i));
		}
	}
	if (decimal>0) {
		var decim=""; 
		for (var j=0;j<(decimal-deci.toString().length);j++) {decim+="0";}
		deci=decim+deci.toString();
		val_format=val_format+"."+deci;
	}
	if (parseFloat(valeur)<0) {val_format="-"+val_format;}
	
	return val_format;
}
*/

function format(valeur,decimal,separateur) { //alert(valeur+'deb');
	// formate un chiffre avec 'decimal' chiffres apr�s la virgule et un separateur
	var spc=valeur.split(separateur);
	var val="";
	
	for(var j=0;j<spc.length;j++)
		val+=spc[j];
		
	if(val!="")
		valeur=val
 	 
	var deci=Math.round(Math.pow(10,decimal)*(Math.abs(valeur)-Math.floor(Math.abs(valeur)))); 
	var val=Math.floor(Math.abs(valeur));

	if ((decimal==0)||(deci==Math.pow(10,decimal))) {
		if(valeur=="")
			val="";
	 	else 
	 		val=Math.floor(Math.abs(valeur)); 
	 	deci=0;
	}
	
	var val_format=val+"";
	var nb=val_format.length;
	
	for (var i=1;i<4;i++) {
		if (val>=Math.pow(10,(3*i))) {
			val_format=val_format.substring(0,nb-(3*i))+separateur+val_format.substring(nb-(3*i));
		}
	}
	
	if (decimal>0) {
		var decim=""; 
		for (var j=0;j<(decimal-deci.toString().length);j++) {
			//decim+="0";
		}
		deci=decim+deci.toString();
		val_format=val_format+"."+deci;
	}
	
	if (parseFloat(valeur)<0) {
		val_format="-"+val_format;
	}
	
	if(val_format!=NaN)	
	return val_format;
}

/********************************************************************************/
function SetInvalidStyle(posS) {	
	form.elements[posS].style.background = '#ffff80';//'#FFFFE6';
	//form.elements[posS].style.color = '#CC0000';
	}
function SetInvalidStyle_n(fieldS) {
	fieldS.style.background = '#ffff80';//'#FFFFE6';
	//fieldS.style.color = '#CC0000';
	}
function SetErrField(field){
	field.focus();
	field.style.background = '#00FFFF';
	field.style.color = '#CC0000';
	field.style.fontWeight="bold"; 
	}
	function SetFieldColor(field,colorf){
//	'#CC0000'
	field.style.color = colorf;
	}
	/***BSB: Fonction permettant de positionner le contenu d'un champs*****/
	/***param�tres: (champ, position {left,center,right})******************/
	function SetFieldAlign(field,position){
	field.style.textAlign = position;
	}
	
function UnsetInvalidStyle(posU) {	
	form.elements[posU].style.background = '#F8F9FA';
	form.elements[posU].style.color = '';
	}
function UnsetInvalidStyle_n(fieldU) {
	//fieldU.style.background = '#F8F9FA';
	//fieldU.style.color = '';
	}
function SetListStyle(posL) {
	form.elements[posL].style.borderColor = '#003399';
	form.elements[posL].style.borderWidth = 2;
	}
function SetNoBorderStyle(posB) {
	form.elements[posB].style.borderWidth = 0;
	form.elements[posB].style.width = 15;
	}
function dateValid(objName) {
		var strDate;
		var strDateArray;
		var strDay;
		var strMonth;
		var strYear;
		var intday;
		var intMonth;
		var intYear;
		var booFound = false;
		var datefield = objName;
		var strSeparatorArray = new Array("-", " ", "/", ".");
		var intElementNr;
		// var err = 0;
		var strMonthArray = new Array(12);
		strMonthArray[0] = "Jan";
		strMonthArray[1] = "Feb";
		strMonthArray[2] = "Mar";
		strMonthArray[3] = "Apr";
		strMonthArray[4] = "May";
		strMonthArray[5] = "Jun";
		strMonthArray[6] = "Jul";
		strMonthArray[7] = "Aug";
		strMonthArray[8] = "Sep";
		strMonthArray[9] = "Oct";
		strMonthArray[10] = "Nov";
		strMonthArray[11] = "Dec";
		//strDate = datefield.value;
		strDate = objName;
		if (strDate.length < 1) {
			return true;
		}
		for (intElementNr = 0; intElementNr < strSeparatorArray.length;	intElementNr++) {
			if (strDate.indexOf(strSeparatorArray[intElementNr]) != -1) {
				strDateArray = strDate.split(strSeparatorArray[intElementNr]);
				if (strDateArray.length != 3) {
					err = 1;
					return false;					
				} else {
					strDay = strDateArray[0];
					strMonth = strDateArray[1];
					strYear = strDateArray[2];
									
				}
				booFound = true;
			}
		}
		
		if (booFound == false) {
			if (strDate.length > 5) {
				strDay = strDate.substr(0, 2);
				strMonth = strDate.substr(2, 2);
				strYear = strDate.substr(4);				

			}
		}
		//Adjustment for short years entered
		if (strYear.length == 2) {
			strYear = '20'+strYear;
		}
	
		intday = parseInt(strDay, 10);
		if (isNaN(intday)) {
			err = 2;
			return false;
		}
		
		intMonth = parseInt(strMonth, 10);
		if (isNaN(intMonth)) {
			for (i = 0; i < 12; i++) {
				if (strMonth.toUpperCase() == strMonthArray[i].toUpperCase()) {
					intMonth = i + 1;
					strMonth = strMonthArray[i];
					i = 12;
				}
			}
			if (isNaN(intMonth)) {
				err = 3;
				return false;
			}
		}
		
		intYear = parseInt(strYear, 10);
		if (isNaN(intYear)) {
			err = 4;
			return false;
		}
		if (intMonth > 12 || intMonth < 1) {
			err = 5;
			return false;
		}
		if ((intMonth == 1 || intMonth == 3	|| intMonth == 5 || intMonth == 7 || intMonth == 8 || intMonth == 10 || intMonth == 12) && (intday > 31 || intday < 1)) {
			err = 6;
			return false;
		}
		if ((intMonth == 4 || intMonth == 6 || intMonth == 9 || intMonth == 11)	&& (intday > 30 || intday < 1)) {
			err = 7;
			return false;
		}
		if (intMonth == 2) {
			if (intday < 1) {
				err = 8;
				return false;
			}
			if (LeapYear(intYear) == true) {
				if (intday > 29) {
					err = 9;
					return false;
				}
			} else {					
				if (intday > 28) {
					err = 10;
					return false;
				}
			}
		}
		return true;
}

function LeapYear(intYear) {
		if (intYear % 100 == 0) {
			if (intYear % 400 == 0) {
				return true;
			}
		} else {
			if ((intYear % 4) == 0) {
				return true;
			}
		}
		return false;
}

function disableRightClick(e){
  var message = "Right click disabled";
  
  if(!document.rightClickDisabled) // initialize
  {
    if(document.layers) 
    {
      document.captureEvents(Event.MOUSEDOWN);
      document.onmousedown = disableRightClick;
    }
    else document.oncontextmenu = disableRightClick;
    return document.rightClickDisabled = true;
  }
  if(document.layers || (document.getElementById && !document.all))
  {
    if (e.which==2||e.which==3)
    {
      alert(message);
      return false;
    }
  }
  else
  {
    alert(message);
    return false;
  }
}
function isDatenew(value) {
	if (value=="") return false;
	
	var pos = value.indexOf("/");
	if (pos == -1) return false;
	var d = (value.substring(0,pos));
	value = value.substring(pos+1, 999);
	pos = value.indexOf("/");
	if (pos==-1) return false;
	var m = (value.substring(0,pos));
	value = value.substring(pos+1, 999);
	var y = (value);	
	if (isNaN(d)) 
	   return false;	
	if (isNaN(m)) 
	    return false;	
	if (isNaN(y)) 
	    return false;	
	
	var type=navigator.appName;
	if (type=="Netscape") var lang = navigator.language;
	else var lang = navigator.userLanguage;
	lang = lang.substr(0,2);

	if (lang == "fr") var date = new Date(y, m-1, d);
	else var date = new Date(d, m-1, y);
	if (isNaN(date)) 
	 return false;	
	else
	 return true;
 }

function isNum(fieldN) { // ok

	var str=fieldN.value;
	if(str.length!=0){
		if (isNumber(str) == false) {
			SetInvalidStyle_n(fieldN);
			return false;
		}else {
			UnsetInvalidStyle_n(fieldN);
			return true;
		}
	}
}
function isNumber(value) { // ok
var str=value;

	var espace = new Array();
	if(str.length!=0){
		espace.unshift('0','1','2','3','4','5','6','7','8','9','-',' ','.');
		var err = 0;
		for (var i=0; i<str.length; i++) {
			charInEspace = 0;
			if((str.indexOf('-')!=-1&&str.indexOf('-')!=0)||(str.indexOf('-')==0&&str.length==1))err++;
			for (var j=0; j<espace.length; j++) {
				if (str.charAt(i) == espace[j]) charInEspace = 1;
			}
			if (charInEspace == 0) err++;
		}
		//if (str.indexOf('.') != str.lastIndexOf('.')) err++;
		if (err > 0) {
			return false;
		}else {
			return true;
		}
	}else 
		return true;
	
}

/*function isAlphanum(str,fieldD) { // ok
	var espace = new Array();
	if(str.length!=0){
		espace.unshift('',' ','-','/','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
		var err = 0;
		for (var i=0; i<str.length; i++) {
			charInEspace = 0;
			for (var j=0; j<espace.length; j++) {
			 if (str.charAt(i).toLowerCase() == espace[j]) charInEspace = 1;
		    }
		    if (charInEspace == 0) err++;
		}
		if (err > 0) {
		//SetInvalidStyle(posA);
		return false;
		}else {
		//if (str != '') 
		UnsetInvalidStyle_n(fieldD);
		return true;
		}
	}
}*/

function isAlphanum(str,fieldD) { // ok
	var espace = new Array();
	if(str.length!=0){
		//espace.unshift('',' ','-','/','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');
		var err = 0;
		for (var i=0; i<str.length; i++) {
			charInEspace = 0;
			for (var j=0; j<espace.length; j++) {
			 if (str.charAt(i).toLowerCase() != espace[j]) charInEspace = 1;
		    }
		    if (charInEspace != 0) err++;
		}
		if (err > 0) {
		//SetInvalidStyle(posA);
		return false;
		}else {
		//if (str != '') 
		UnsetInvalidStyle_n(fieldD);
		return true;
		}
	}
}

function vForms() { // ok
	try{
		var err = 0;
		//for (var fn=0; fn<document.forms[0].length; fn++) {	
		
			form = document.forms.item(0);
			if (form.name != "menuFormBean") {	
				ReplaceDots(form);					
				for (var i=0; i<form.length; i++) {
					var iPos = i;				
					var iName = form.elements[i].id;
					//var iName1 = form.elements[i+1].name;
					//var iClassName = form.elements[i].className.toLowerCase();
					var iType = form.elements[i].type;
				
					var iValue = form.elements[i].value;
					
					// Commentaire Cyril 280707 sur la mise en majuscule des champs du formulaire
					 if(iType != 'button' && iType != 'submit' && iType != 'reset'&&iName!="TXT_EMAIL_OB"&&iName!="TNUM_CODEGROUPE_OB"&&iName!="TNUM_CODEFONCTION_OB" )
	 					 form.elements[i].value=form.elements[i].value.toUpperCase();
	 					 
	 				/*if (form.name.indexOf("rc",0) != -1 ){
	 					if ((form.name == "rcFonctionnalitesFB")||(form.name == "rcGroupefonctionFB")){
	 						if (iName.indexOf("_RCCODE") != -1 ){
	 							if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
			 						form.elements[i].value=form.elements[i].value.toUpperCase();
			 					}
			 				}
	 					}else {
	 						if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
		 						form.elements[i].value=form.elements[i].value.toUpperCase();
		 					}
	 					}
	 				}else {
	 					if (iName.indexOf("_LIST_") != -1 ){
	 						if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
		 						form.elements[i].value=form.elements[i].value.toUpperCase();
		 					}
	 					}
	 				}*/

					//var ivalue1="";				
					//var i1=0;
					//var deb=0;
					//var fin=iValue.length;
					var iReadOnly = form.elements[i].readOnly;
					var iHid ='';
					
					if(iName.length!=0){
						var str = iName.lastIndexOf("F");
						if(str == (iName.length-1)){
							if(document.getElementById(iName) != null){
								iHid= document.getElementById(iName).style.visibility;
							}		
						}
						
					}
						
						if (iName.substring(iName.length-11,iName.length)=='_OBF_widget'){
							iHid= document.getElementById(iName).style.visibility;
						} 
						
					

						
							
					if ( iType != 'checkbox' && iType != 'hidden' && iType != 'button' && iType != 'submit' && iType != 'reset' && iName.indexOf('_add_') == '-1' && iName.indexOf('PK_') == '-1' && iName.indexOf('pk_') == '-1') {
						/*********************************
						
						ar=new Array(50);
						var jj=0;
						for(i1=0;i1<iValue.length;i1++){
						   if(iValue.charAt(i1)=="'"){
						      ar[jj]=iValue.substring(deb,i1)+"''";
						      jj++;
						      deb=i1+1;
						   }							   
						}
						ar[jj]=iValue.substring(deb,i1);				   				   
						
						i1=0;
						for(i1=0;i1<ar.length;i1++){
						 if(ar[i1]!=""&&ar[i1]!=undefined)
						    ivalue1=ivalue1+ar[i1]
						}
						//*********************************/
					
						//form.elements[i].value=ivalue;	
						if((form.elements[i].type=='radio'&&(form.elements[i+1]!=null)&&form.elements[i+1].type=='radio'&&form.elements[i].checked==false&&form.elements[i+1].checked==false
								&&(iName.substring(iName.length-3,iName.length)=='_OB' || iName.substring(iName.length-4,iName.length)=='_OBF' 
									|| iName.substring(iName.length-10,iName.length)=='_OB_widget'|| iName.substring(iName.length-11,iName.length)=='_OBF_widget')
								&&form.elements[i].name==form.elements[i+1].name&&iReadOnly==false))	{					
						  SetInvalidStyle(iPos);
						  err++;
						} 	
						//alert('iName='+iName+'---hid='+iHid);				
						if ((iName.substring(iName.length-3,iName.length)=='_OB' || iName.substring(iName.length-4,iName.length)=='_OBF' 
							|| iName.substring(iName.length-10,iName.length)=='_OB_widget'|| iName.substring(iName.length-11,iName.length)=='_OBF_widget')
							&& iHid!='hidden' && (iValue == ''||iValue == null) &&  iReadOnly!=true) {
								SetInvalidStyle(iPos);							
								err++;
								try{
								form.elements[iPos].focus();
								}catch(Exception){
//								 if(document.getElementById("tabs0head1")){
								// alert(document.getElementById("tabs0tab1").style.display);
//								 if(document.getElementById("tabs0tab1").style.display == "none"){
//									selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
//								 }else{
//								  selectTab(0,2,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
//								 }
//								}
							  }					
						}else {
								UnsetInvalidStyle(iPos);						
						}
					}
				}
			
			}
		//}
			
		if (err > 0) {
			alert ("Veuillez remplir les champs Obligatoire SVP! ");
			return false;
		}else{		
			return true;
		}
	 }catch(Exception){
		 alert(Exception);	
		// alert('Votre session est expir�e Veuillez aller � la Page login');
		 return false;	
	 }	

	}


function vFormUpperCase() { // ok 
	for (var i=0; i<document.forms[0].length; i++) {
		var iType = document.forms[0].elements[i].type;
		var iName = document.forms[0].elements[i].name;
		
		/* Gestion de la casse au niveau des formulaires 
		if (form.name.indexOf("rc",0) != -1 ){
 			if ((form.name == "rcFonctionnalitesFB")||(form.name == "rcGroupefonctionFB")){
 				if (iName.indexOf("_RCCODE") != -1 ){
 					if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
							form.elements[i].value=form.elements[i].value.toUpperCase();
						}
					}
 			}else {
 				if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
	 				form.elements[i].value=form.elements[i].value.toUpperCase();
	 			}
 			}
 		}else {
 			if (iName.indexOf("_LIST_") != -1 ){
 				if(iType != 'button' && iType != 'submit' && iType != 'radio' && iType != 'reset'&&iName!="TXT_EMAIL_OB" ){
	 				form.elements[i].value=form.elements[i].value.toUpperCase();
	 			}
 			}
 		}*/ 

		if(iType != 'button' && iType != 'submit' && iType != 'reset' )
 			document.forms[0].elements[i].value = document.forms[0].elements[i].value.toUpperCase();
	}
}


function isNum(fieldN) { // ok

	var str=fieldN.value;
	if(str.length!=0){
		if (isNumber(str) == false) {
			SetInvalidStyle_n(fieldN);
			return false;
		}else {
			UnsetInvalidStyle_n(fieldN);
			return true;
		}
	}
}
/*function isNumber(value) { // ok
var str=value;

	var espace = new Array();
	if(str.length!=0){
		espace.unshift('0','1','2','3','4','5','6','7','8','9','-');
		var err = 0;
		for (var i=0; i<str.length; i++) {
			charInEspace = 0;
			if((str.indexOf('-')!=-1&&str.indexOf('-')!=0)||(str.indexOf('-')==0&&str.length==1))err++;
			for (var j=0; j<espace.length; j++) {
				if (str.charAt(i) == espace[j]) charInEspace = 1;
			}
			if (charInEspace == 0) err++;
		}
		if (str.indexOf('.') != str.lastIndexOf('.')) err++;
		if (err > 0) {
			return false;
			}else {
			return true;
			}
	}else 
	return true;
	
}
*/


function isTx(fieldT) { // ok
var str=fieldT.value;
//alert('  ttt '+str);
	if(str.length!=0 && str!='0%'){
	//alert('  ttt 111'+str);
		var LastPos = str.length - 1;
		if (str.charAt(str.length-1) == '%') {
			str = str.substring(0,str.length - 1);
			}
		
		if ((isNumber(str) == false) ||(str == '' && fieldT.name.indexOf('_OB') != '-1')) {
			SetInvalidStyle_n(fieldT);
			return false;
		}else {
			if (str>100){
				SetInvalidStyle_n(fieldT);
				alert('Le Taux ne doit pas d�pass� 100%');
				return false;
			}else if (str<0){
				SetInvalidStyle_n(fieldT);
				alert('Le Taux doit �tre Positif');
				return false;
			}else{	
				if (str != '') UnsetInvalidStyle_n(fieldT);
				return true;
			}
		}
	}
}

function isDt(fieldD) { // ok
	var str=fieldD.value;
	var err = 0;
	/**/
	var value=str;
	var pos = value.indexOf("/");
	var d = parseInt(value.substring(0,pos+1));
	value = value.substring(pos+1, 999);
	pos = value.indexOf("/");
	var m = parseInt(value.substring(0,pos+1));
	value = value.substring(pos+1, 999);
	var y = (value);	
	/**/
	if(str.length!=0){
	   if (isDatenew(str)==false){
		   	fieldD.focus();
	   		return false;
	   }else{
	   	  
	    if (Number(str.substring(0,2))<1 ) err++;
	    if ((str.substring(3,5) == '01' || str.substring(3,5) == '03' || str.substring(3,5) == '05' || str.substring(3,5) == '07' || str.substring(3,5) == '08' || str.substring(3,5) == '10' || str.substring(3,5) == '12') && Number(str.substring(0,2)) > 31 ) err++;
		if ((str.substring(3,5) == '04' || str.substring(3,5) == '06' || str.substring(3,5) == '09' || str.substring(3,5) == '11') && Number(str.substring(0,2)) > 30) err++;
		if (str.substring(3,5) == '02' && str.substring(6,10) % 4 == 0 && Number(str.substring(0,2)) > 29) err++;
		if (str.substring(3,5) == '02' && str.substring(6,10) % 4 != 0 && Number(str.substring(0,2)) > 28) err++;
		if (Number(str.substring(3,5)) < 1 || Number(str.substring(3,5)) > 12) err++;
		if (str.length != 10) err++;
		
		}
	}
	if (err==0){
			
			UnsetInvalidStyle_n(fieldD);
			return true;
	}else {
			fieldD.focus();
			return false;
	}
}

function isMnt(fieldM) { // ok
	var str=fieldM.value;
	var err = 0;
	
	if(str.length!=0){
			var LastVirPos = str.lastIndexOf('.');
			if (str.indexOf('.') != str.lastIndexOf('.')) err++;
			var str1=str.substring(0,LastVirPos);
			if (str == '.000' || (str.substring(0,LastVirPos)!='' && isNumber(str.substring(0,LastVirPos)) == false) || (str.substring(LastVirPos,str.length)!='' && isNumber(str.substring(LastVirPos+1,str.length)) == false)) err++;
			if (err > 0) {
				SetInvalidStyle_n(fieldM);
				return false;
			}else {
				if (str<0){
					fieldM.focus();
					SetInvalidStyle_n(fieldM);
					alert('Montant doit �tre Positif');
					return false;
				}else{
					if (str != '') UnsetInvalidStyle_n(fieldM);
					return true;
				}
			}
	}
}

function ReplaceDots(theForm) { // ok
	for (var i=0; i<theForm.length; i++) {
		var iValue = theForm.elements[i].value;
		var iName = theForm.elements[i].id;
		//var iClassName = theForm.elements[i].className.toLowerCase;
		var iType = theForm.elements[i].type;
		//alert(' replace '+iValue);
		if (iType != 'hidden' && iType != 'button' && iType != 'submit' && iType != 'reset' && (iName.indexOf('NUM_') != '-1' || iName.indexOf('TAUX_') != '-1' || iName.indexOf('MNT_') != '-1')) {
			var newValue = '';
			for (var j=0; j<iValue.length; j++) {
				if (iValue.charAt(j) == '.') {
					newValue += '.';
				}else {
					newValue += iValue.charAt(j);
				}
			}
		theForm.elements[i].value = newValue;
		}
	}
}

function FormatMNT(fieldF){
	//if(window.event.keyCode!=8){
		var ivalue=fieldF.value;
		if (fieldF.id.indexOf('MNT_') != '-1' ) {	
			if (ivalue!=''){
				if(ivalue.indexOf('.')!=-1)
					fieldF.value=format(remplace(ivalue," ",""),"2"," ");			     			     
				else
					fieldF.value=format(remplace(ivalue," ",""),"0"," ");
			}
		}
	//}				  
}


function FormaterTaux(fieldFT){
	if (fieldFT.name.indexOf('TAUX_') != '-1')
		if (fieldFT.value == null ||fieldFT.value =='') fieldFT.value = '0';
		if (fieldFT.value.indexOf('%') == '-1') fieldFT.value = fieldFT.value + '%';
	}
	
function Formater (fieldF){	
	if (fieldF.id.indexOf('NUM_') != '-1' ) {
			if (fieldF.value!='')	
			  format(remplace(fieldF.value," ",""),"0"," ");
	}
	if (fieldF.id.indexOf('DAT_') != '-1' ) {
			if (fieldF.value!='')	FormaterDate(fieldF);
	}
	
}

function FormaterDate(fieldFD){
	var err=0;
	var comp = '';
	var mMonth = "";
	var mDay = "";
	var mYear = "";
	var mToday = new Date();
	var checkYear = mToday.getFullYear() + 50;
	var mCheckYear = '';
	var i=0;
	var nbr=0;
	//***************************************************************
	var iField = fieldFD;
	var iValue = fieldFD.value;
	var strCheck = '48,49,50,51,52,53,54,55,56,57';
	var whichCode = window.event.keyCode; 
	if (window.event.keyCode != 13 && window.event.keyCode!=9 ) {
		if (strCheck.indexOf(whichCode) != -1) {
			newValue = iValue;
			if(iValue.length==2){
				newValue=iValue+"/";
	 		}else if(iValue.length==5){
				newValue=iValue+"/";
	 		}			
			fieldFD.value = newValue;
			iValue=newValue;
			newValue;
		}else{
			err++;
			return false;
		}
	}
 }
 
 
  
 



/***********************Fonctions Demande de Mise En Depot***********************/

function isNumPositif(fieldN) { // ok

	var str=fieldN.value;
	if(str.length!=0){
		if (isNumberPositif(str) == false) {
			return false;
		}
	}
}

function isNumberPositif(value) { // ok
var str=value;

	var espace = new Array();
	if(str.length!=0){
		espace.unshift('0','1','2','3','4','5','6','7','8','9');
		var err = 0;
		for (var i=0; i<str.length; i++) {
			charInEspace = 0;
			for (var j=0; j<espace.length; j++) {
				if (str.charAt(i) == espace[j]) charInEspace = 1;
			}
			if (charInEspace == 0) err++;
		}
		if (str.indexOf('.') != str.lastIndexOf('.')) err++;
		if (err > 0) {
			return false;
		}else {
			return true;
		}
	}else 
	return true;	
}

function compareTo(fieldN1,fieldN2){
	if(Number(fieldN2)>0){
		if(Number(fieldN1)>Number(fieldN2)){
			return "1";
		}else{
		  	return "-1";
		  }
		}
	
	}
function enableButton(buttonname,disable){
	document.getElementsByName(buttonname)[0].disabled=disable;
	
}

function jumpToTab(){
 var i=0;
 
 while(document.getElementById("tabs0head"+i)!=null){
   i++;
 }
  if(document.forms.item(0).TXT_INDEXTABOPEN_FB&&document.forms.item(0).TXT_INDEXTABOPEN_FB.value==""){
     document.forms.item(0).TXT_INDEXTABOPEN_FB.value="0";
  }
 if(document.forms.item(0).TXT_INDEXTABOPEN_FB){
   if(event.keyCode==38){
     if(Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)<i){
       selectTab(0,i,Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)+1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
       document.forms.item(0).TXT_INDEXTABOPEN_FB.value=Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)+1;
     }else{
      selectTab(0,i,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
      document.forms.item(0).TXT_INDEXTABOPEN_FB.value=0;
     }
   }
    if(event.keyCode==40){
      if(Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)!=0){
       selectTab(0,i,Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)-1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
       document.forms.item(0).TXT_INDEXTABOPEN_FB.value=Number(document.forms.item(0).TXT_INDEXTABOPEN_FB.value)-1;
     }else{
      selectTab(0,i,i-1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
      document.forms.item(0).TXT_INDEXTABOPEN_FB.value=Number(i-1);
     }
    }
 }else{
 if(document.getElementById("tabs0head0")!=null&&document.getElementById("tabs0head1")!=null){
   if(event.keyCode==38){
     if(document.getElementById("tabs0head1")!=null)
      selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
      SelectFirst();
   }
   if(event.keyCode==40){
    if(document.getElementById("tabs0head0")!=null)
      selectTab(0,2,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
      SelectFirst();
    }
  }
 } 
}

function ltrim (chaine) {
 chaine = unescape(chaine);
 return chaine.replace(/(^\s*)/, "");
}
function rtrim (chaine) {
 chaine = unescape(chaine);
 return chaine.replace(/(\s*$)/, "");
}

function openReport(reportForm,task){
	w = screen.width;
	h = screen.height;
	x = 0;
	y = 0;
	
	fileName = reportForm.fileName.value;
	parameters = '';

	if (reportForm.param0name) parameters+='&param0name='+reportForm.param0name.value+'&param0value='+reportForm.param0value.value;
	if (reportForm.param1name) parameters+='&param1name='+reportForm.param1name.value+'&param1value='+reportForm.param1value.value;
	if (reportForm.param2name) parameters+='&param2name='+reportForm.param2name.value+'&param2value='+reportForm.param2value.value;
	if (reportForm.param3name) parameters+='&param3name='+reportForm.param3name.value+'&param3value='+reportForm.param3value.value;
	if (reportForm.param4name) parameters+='&param4name='+reportForm.param4name.value+'&param4value='+reportForm.param4value.value;
	if (reportForm.param5name) parameters+='&param5name='+reportForm.param5name.value+'&param5value='+reportForm.param5value.value;
	if (reportForm.param6name) parameters+='&param6name='+reportForm.param6name.value+'&param6value='+reportForm.param6value.value;
	if (reportForm.param7name) parameters+='&param7name='+reportForm.param7name.value+'&param7value='+reportForm.param7value.value;
	if (reportForm.param8name) parameters+='&param8name='+reportForm.param8name.value+'&param8value='+reportForm.param8value.value;
	if (reportForm.param9name) parameters+='&param9name='+reportForm.param9name.value+'&param9value='+reportForm.param9value.value;
	if (reportForm.param10name) parameters+='&param10name='+reportForm.param10name.value+'&param10value='+reportForm.param10value.value;
	if (reportForm.param11name) parameters+='&param11name='+reportForm.param11name.value+'&param11value='+reportForm.param11value.value;
	if (reportForm.param12name) parameters+='&param12name='+reportForm.param12name.value+'&param12value='+reportForm.param12value.value;
	if (reportForm.param13name) parameters+='&param13name='+reportForm.param13name.value+'&param13value='+reportForm.param13value.value;
	if (reportForm.param14name) parameters+='&param14name='+reportForm.param14name.value+'&param14value='+reportForm.param14value.value;
	if (reportForm.param15name) parameters+='&param15name='+reportForm.param15name.value+'&param15value='+reportForm.param15value.value;
				
	window.open('editionDeclarationAction.action?fileName='+fileName+parameters+"&task="+task,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1');
}
function openReportManifeste(reportForm){
	w = screen.width;
	h = screen.height;
	x = 0;
	y = 0;
	
	fileName = reportForm.fileName.value;
	parameters = '';
	
	if (reportForm.param0name) parameters+='&param0name='+reportForm.param0name.value+'&param0value='+reportForm.param0value.value;
	if (reportForm.param1name) parameters+='&param1name='+reportForm.param1name.value+'&param1value='+reportForm.param1value.value;
	if (reportForm.param2name) parameters+='&param2name='+reportForm.param2name.value+'&param2value='+reportForm.param2value.value;
	if (reportForm.param3name) parameters+='&param3name='+reportForm.param3name.value+'&param3value='+reportForm.param3value.value;
	if (reportForm.param4name) parameters+='&param4name='+reportForm.param4name.value+'&param4value='+reportForm.param4value.value;
	if (reportForm.param5name) parameters+='&param5name='+reportForm.param5name.value+'&param5value='+reportForm.param5value.value;
	if (reportForm.param6name) parameters+='&param6name='+reportForm.param6name.value+'&param6value='+reportForm.param6value.value;
	if (reportForm.param7name) parameters+='&param7name='+reportForm.param7name.value+'&param7value='+reportForm.param7value.value;
	if (reportForm.param8name) parameters+='&param8name='+reportForm.param8name.value+'&param8value='+reportForm.param8value.value;
	if (reportForm.param9name) parameters+='&param9name='+reportForm.param9name.value+'&param9value='+reportForm.param9value.value;
	if (reportForm.param10name) parameters+='&param10name='+reportForm.param10name.value+'&param10value='+reportForm.param10value.value;
	if (reportForm.param11name) parameters+='&param11name='+reportForm.param11name.value+'&param11value='+reportForm.param11value.value;
	if (reportForm.param12name) parameters+='&param12name='+reportForm.param12name.value+'&param12value='+reportForm.param12value.value;
	if (reportForm.param13name) parameters+='&param13name='+reportForm.param13name.value+'&param13value='+reportForm.param13value.value;
	if (reportForm.param14name) parameters+='&param14name='+reportForm.param14name.value+'&param14value='+reportForm.param14value.value;
	if (reportForm.param15name) parameters+='&param15name='+reportForm.param15name.value+'&param15value='+reportForm.param15value.value;
	
	
	window.open('editionManifesteAction.action?fileName='+fileName+parameters+"&task=print",'Etat','toolbar=1, location=0, directories=0, status=1, scrollbars=1, resizable=1, copyhistory=0, menuBar=1, width='+w+', height='+h+', left='+x+', top='+y);
}

function openReportBae(reportForm,task){
	w = screen.width;
	h = screen.height;
	x = 0;
	y = 0;
	
	fileName = reportForm.fileName.value;
	taskName = task;
	parameters = '';
	
	if (reportForm.param0name) parameters+='&param0name='+reportForm.param0name.value+'&param0value='+reportForm.param0value.value;
	if (reportForm.param1name) parameters+='&param1name='+reportForm.param1name.value+'&param1value='+reportForm.param1value.value;
	if (reportForm.param2name) parameters+='&param2name='+reportForm.param2name.value+'&param2value='+reportForm.param2value.value;
	if (reportForm.param3name) parameters+='&param3name='+reportForm.param3name.value+'&param3value='+reportForm.param3value.value;
	if (reportForm.param4name) parameters+='&param4name='+reportForm.param4name.value+'&param4value='+reportForm.param4value.value;
	if (reportForm.param5name) parameters+='&param5name='+reportForm.param5name.value+'&param5value='+reportForm.param5value.value;
	if (reportForm.param6name) parameters+='&param6name='+reportForm.param6name.value+'&param6value='+reportForm.param6value.value;
	if (reportForm.param7name) parameters+='&param7name='+reportForm.param7name.value+'&param7value='+reportForm.param7value.value;
	if (reportForm.param8name) parameters+='&param8name='+reportForm.param8name.value+'&param8value='+reportForm.param8value.value;
	if (reportForm.param9name) parameters+='&param9name='+reportForm.param9name.value+'&param9value='+reportForm.param9value.value;
	if (reportForm.param10name) parameters+='&param10name='+reportForm.param10name.value+'&param10value='+reportForm.param10value.value;
	if (reportForm.param11name) parameters+='&param11name='+reportForm.param11name.value+'&param11value='+reportForm.param11value.value;
	if (reportForm.param12name) parameters+='&param12name='+reportForm.param12name.value+'&param12value='+reportForm.param12value.value;
	if (reportForm.param13name) parameters+='&param13name='+reportForm.param13name.value+'&param13value='+reportForm.param13value.value;
	if (reportForm.param14name) parameters+='&param14name='+reportForm.param14name.value+'&param14value='+reportForm.param14value.value;
	if (reportForm.param15name) parameters+='&param15name='+reportForm.param15name.value+'&param15value='+reportForm.param15value.value;
				
	window.open('editionBaeAction.action?fileName='+fileName+parameters+"&task="+task,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1, width='+w+', height='+h+', left='+x+', top='+y);
}

/*EDITION DLPP*/
function openReportDlpp(reportForm,task){
	w = screen.width;
	h = screen.height;
	x = 0;
	y = 0;
	
	fileName = reportForm.fileName.value;
	taskName = task;
	parameters = '';
	
	if (reportForm.param0name) parameters+='&param0name='+reportForm.param0name.value+'&param0value='+reportForm.param0value.value;
	if (reportForm.param1name) parameters+='&param1name='+reportForm.param1name.value+'&param1value='+reportForm.param1value.value;
	if (reportForm.param2name) parameters+='&param2name='+reportForm.param2name.value+'&param2value='+reportForm.param2value.value;
	if (reportForm.param3name) parameters+='&param3name='+reportForm.param3name.value+'&param3value='+reportForm.param3value.value;
	if (reportForm.param4name) parameters+='&param4name='+reportForm.param4name.value+'&param4value='+reportForm.param4value.value;
	if (reportForm.param5name) parameters+='&param5name='+reportForm.param5name.value+'&param5value='+reportForm.param5value.value;
	if (reportForm.param6name) parameters+='&param6name='+reportForm.param6name.value+'&param6value='+reportForm.param6value.value;
	if (reportForm.param7name) parameters+='&param7name='+reportForm.param7name.value+'&param7value='+reportForm.param7value.value;
	if (reportForm.param8name) parameters+='&param8name='+reportForm.param8name.value+'&param8value='+reportForm.param8value.value;
	if (reportForm.param9name) parameters+='&param9name='+reportForm.param9name.value+'&param9value='+reportForm.param9value.value;
	if (reportForm.param10name) parameters+='&param10name='+reportForm.param10name.value+'&param10value='+reportForm.param10value.value;
	if (reportForm.param11name) parameters+='&param11name='+reportForm.param11name.value+'&param11value='+reportForm.param11value.value;
	if (reportForm.param12name) parameters+='&param12name='+reportForm.param12name.value+'&param12value='+reportForm.param12value.value;
	if (reportForm.param13name) parameters+='&param13name='+reportForm.param13name.value+'&param13value='+reportForm.param13value.value;
	if (reportForm.param14name) parameters+='&param14name='+reportForm.param14name.value+'&param14value='+reportForm.param14value.value;
	if (reportForm.param15name) parameters+='&param15name='+reportForm.param15name.value+'&param15value='+reportForm.param15value.value;
				

	window.open('TWREReportDlpp?fileName='+fileName+'&taskName='+taskName+parameters,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1, width='+w+', height='+h+', left='+x+', top='+y)
}
/* This function is used to set cookies */
function setCookie(name,value,expires,path,domain,secure) {
  document.cookie = name + "=" + escape (value) +
    ((expires) ? "; expires=" + expires.toGMTString() : "") +
    ((path) ? "; path=" + path : "") +
    ((domain) ? "; domain=" + domain : "") + ((secure) ? "; secure" : "");
}

/* This function is used to get cookies */
function getCookie(name) {
	var prefix = name + "=" 
	var start = document.cookie.indexOf(prefix) 

	if (start==-1) {
		return null;
	}
	
	var end = document.cookie.indexOf(";", start+prefix.length) 
	if (end==-1) {
		end=document.cookie.length;
	}

	var value=document.cookie.substring(start+prefix.length, end) 
	return unescape(value);
}

/* This function is used to delete cookies */
function deleteCookie(name,path,domain) {
  if (getCookie(name)) {
    document.cookie = name + "=" +
      ((path) ? "; path=" + path : "") +
      ((domain) ? "; domain=" + domain : "") +
      "; expires=Thu, 01-Jan-70 00:00:01 GMT";
  }
}

// This function is for stripping leading and trailing spaces
function trim(str) { 
    if (str != null) {
        var i; 
        for (i=0; i<str.length; i++) {
            if (str.charAt(i)!=" ") {
                str=str.substring(i,str.length); 
                break;
            } 
        } 
    
        for (i=str.length-1; i>=0; i--) {
            if (str.charAt(i)!=" ") {
                str=str.substring(0,i+1); 
                break;
            } 
        } 
        
        if (str.charAt(0)==" ") {
            return ""; 
        } else {
            return str; 
        }
    }
} 

function isEmpty0REqualZero(value){
	var str = trim(value);
	if(str=='' || str.length <= 0)
		return true;
	return false;
}

function titleAfficher(element, value) {	
	element.title=value;
}
function titleEffacer(element) {	
	element.title="";
}

function printReport(){	
	var numDecl=document.forms[0].elements['numDeclaration'].value; 
    var param0value = numDecl.substring(0,numDecl.indexOf(" "));
    var param1value = numDecl.substring(numDecl.indexOf(" ")+1,numDecl.lastIndexOf(" "));
    var param2value = numDecl.substring(numDecl.lastIndexOf(" ")+1,numDecl.length);
	window.open('editionDeclarationAction.action?fileName=EditionDeclaration&param0value='+param0value+'&param1value='+param1value+'&param2value='+param2value,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1');
}

function printBAEReport(){	
	var numDecl=document.forms[0].elements['numDeclaration'].value; 
    var param0value = numDecl.substring(0,numDecl.indexOf(" "));
    var param1value = numDecl.substring(numDecl.indexOf(" ")+1,numDecl.lastIndexOf(" "));
    var param2value = numDecl.substring(numDecl.lastIndexOf(" ")+1,numDecl.length);
	window.open('editionBaeAction.action?fileName=EditionBAE&param0value='+param0value+'&param1value='+param1value+'&param2value='+param2value,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1');
}

function printManifesteReport(){	
    var param0value = document.forms[0].elements['annee'].value;
    var param1value = document.forms[0].elements['consignataire'].value;
    var param2value = document.forms[0].elements['numRep'].value;
	window.open('editionManifesteAction.action?fileName=EditionManifeste&param0value='+param0value+'&param1value='+param1value+'&param2value='+param2value,'Etat','toolbar=1, location=0, directories=0, status=0, scrollbars=1, resizable=1, copyhistory=0, menuBar=1');
}