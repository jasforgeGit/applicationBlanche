// rc.js

//D�claration des variables globales
var rcMsgDelete = "�tes-vous s�r de vouloir effectuer la suppression ?";
var rcMsgUpdate = "etes-vous sur de vouloir effectuer la modification ?";
var rcMsgFormatDateIncorrect = "Format de dates incorrect !";
var rcMsgOrdreDateIncorrect = "La date de d�but doit pr�c�d�e la date de fin !";
var rcMsgExclusionQuittance="�tes-vous s�r de vouloir exclure le N� de quittance?";
var rcMsgArchive="�tes-vous s�r de vouloir effectuer l'archivage?";
var rcMsgDesarchive="�tes-vous s�r de vouloir effectuer le desarchivage?";




//Fonction de demande de confirmation enregistrement desarchivage
function confirmRcDesarchivage()
{	
	msg = rcMsgDesarchive;
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}

//Fonction de demande de confirmation  enregistrement archivage
function confirmRcArchivage()
{	
	msg = rcMsgArchive;
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}






//Fonction de demande de confirmation exclusion quittanced'un enregistrement
function confirmRcExclusion()
{	
	msg = rcMsgExclusionQuittance;
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}

//Fonction de demande de confirmation de suppression d'un enregistrement
function confirmRcDelete()
{	
	msg = rcMsgDelete;
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}

//Fonction de demande de confirmation de modification d'un enregistrement
function confirmRcUpdate()
{
	var msg = rcMsgUpdate;
    var ans = confirm(msg);    
    if (ans) {
        return true;
    } else {
        return false;
    }
}

//retourne -2 si format des dates incorrect, -1 si dateDebut<dateFin, 0 si dateDebut=dateFin, 1 si dateDebut>dateFin
function ComparerDate (dateDebut,dateFin) //Format de la date jj/mm/yyyy
{
	/*var frm=document.forms[0];
	var dateDebut=frm.DAT_rcDDebutSensVoy_OB.value;
	var dateFin=frm.DAT_rcDFinSensVoy.value;	
	alert ("date d�but = "+dateDebut+" et date fin = "+dateFin);*/
	if (dateDebut.length!=10 || dateFin.length!=10)
		test=-2;								
	else
	{			
		//Jour, mois et date de la date de d�but
		jdd = parseInt(dateDebut.substr(0,2));
		mdd = parseInt(dateDebut.substr(3,2));				
		ydd = parseInt(dateDebut.substr(6,4)); 

		//Jour, mois et date de la date de fin
		jdf = parseInt(dateFin.substr(0,2));
		mdf = parseInt(dateFin.substr(3,2));				
		ydf = parseInt(dateFin.substr(6,4)); 

		//Comparaison des dates			
		if (ydd<ydf)	test=-1;
		else
			if (ydd>ydf)	test=1;
			else
				if (mdd<mdf)	test=-1;
				else
					if (mdd>mdf)	test=1;
					else
						if (jdd<jdf)	test=-1;
						else
							if (jdd>jdf)	test=1;
							else	test=0;								
	}
	
	return test;
}

function resetFieldsDestinataire(){
	var form = document.forms('rcMessagesFB');

	form.TNUM_rcLibSocBurDest.value="";
	form.TNUM_rcLibPosteDest.value="";
	form.TNUM_rcLibSectionDest.value="";
} 

function openWinPPM() {
	var x = (window.screen.availwidth/2)-400;
	var y = (window.screen.availheight/2)-150;
	var url="ppmRecherche.do?reqCode=search";
	var myWin= window.open(url, "listePpms","width=700,height=350,scrollbars=1,status=1,toolbar=0,menubar=0,top="+x+",left="+y);
  	myWin.focus();
}	

//Fonction d'envoi appel�e dans les pages contenant des dates de d�but et fin 
//(effectue une comparaison des dates avant envoi)
function doSubmitRc (dateDebut,dateFin,requestCode,page)
{	
	if (vForms()==false) return;
	
	//La comparaison ne se fait que si les deux champs sont renseign�s
	if (dateDebut!="" && dateFin!="")
	{
		test = ComparerDate(dateDebut,dateFin); //Fonction d�finie dans rc.js
		if (test==-2) 
		{	alert (rcMsgFormatDateIncorrect);
			return false;
		}
		else
			if (test!=-1) 
			{	alert (rcMsgOrdreDateIncorrect);
				return false;
			}	
	}
			
	return true;	
}


//Fonction pour actualiser les listes
function actualiserListe (requestCode,page)
{	
	document.forms[0].reqCode.value =requestCode;
	document.forms[0].action = document.forms[0].action+'?page='+page;
	document.forms[0].submit();
	
}


var rcMsgNewPage = "Confirmer la nouvelle saisie ?";
//Fonction d'affichage d'une nouvelle page
function newPage(requestCode,page)
{
	if (!confirm(rcMsgNewPage)) return false;
	
	document.forms[0].reqCode.value =requestCode;
	document.forms[0].action = document.forms[0].action+'?page='+page;
	document.forms[0].submit();

}

//Fonction qui permet d'aller � une page
function gotoUrl(actionAExecuter, forwardPage){
	document.forms[0].action = actionAExecuter+'?page='+forwardPage;
	document.forms[0].submit();
	
 }
function gotoUrll(actionAExecuter, forwardPage){
	document.forms[0].action = actionAExecuter+'?pageContext='+forwardPage;
	document.forms[0].submit();
	
 }
//Fonction qui v�rifie si un radio est s�lectionn� avant envoi
function controleRadio (nomPk){
	var frm = document.forms.item(0);
	var selectedRadio = '';
		
	for (var i=0; i<frm.length; i++) {
		if (frm.elements[i].name == nomPk && frm.elements[i].checked == true) {
			selectedRadio = frm.elements[i].value;
			i = frm.length;
		}
	}
	if (selectedRadio=='') {
		return false;
	}	
	else {
		frm.pkSelected.value = selectedRadio;		
		return true;
	}	
}
 
function lister (requestCode,page)
{
	document.forms[0].action = requestCode+'?page='+page;
	document.forms[0].submit();	
}

function lister2 (requestCode,page)
{
	document.forms[0].action = requestCode+'?pageContext='+page;
	document.forms[0].submit();	
}

function listerModeReglement(requestCode,page){

document.forms[0].reqCode.value =requestCode;
document.forms[0].action = document.forms[0].action+'?page='+page;
document.forms[0].submit();

}
//****//

function ShowHideUtilisateurFields(){

	var form = document.forms[0];
	//alert('form = '+document.getElementById("TNUM_TYPUSER_OB").value);
	var   selectedIndex = document.getElementById("TNUM_TYPUSER_OB").selectedIndex;
	var selectedIndexValue = document.getElementById("TNUM_TYPUSER_OB")[selectedIndex].value;
	alert('selectedIndexValue = '+selectedIndexValue);
	if(selectedIndexValue == 'D'){
	document.getElementById("TNUM_LIST_AGDOUAN_OB" + "F").style.visibility = "hidden";
	document.getElementById("TNUM_CODPPM_OB" + "F").style.visibility = "hidden"; 
	
	document.getElementById("TNUM_LIST_AGDOUAN_OB" + "L").style.visibility = "hidden";
	document.getElementById("TNUM_CODPPM_OB" + "L").style.visibility = "hidden"; 
	
	document.getElementById("TNUM_LIST_AGDOUAN_OB" + "F").value = "";
	document.getElementById("TNUM_CODPPM_OB" + "F").value = ""; 
	
	}
}
function openwindow(form) {
	var xx, yy;
	xx = (window.screen.availwidth/2)-350;
    yy = (window.screen.availheight/2)-200;
	
	window.open(form, 'popup', 'directories=0, location=0, menubar=0, status=0, toolbar=0, width=800, height=370, top=' + yy + ', left=' + xx); 	
		
	return false;
}
function addListFonct(code,lib){
 var j=Number(window.opener.document.getElementsByName('TNUM_CODEFONCT_OB')[0].options.length)+1;
 alert(window.opener.document.getElementsByName('TNUM_CODEFONCT_OB')[0].options.length+' addlistfonct='+lib+'   '+code+' '+lib);
 window.opener.document.getElementsByName('TNUM_CODEFONCT_OB')[0].options[j]=new Option('lib','code lib');
 alert('fin');
}

/*Cyril Niang*/
function computeFoncByGroupe(comboGroupeFonction,comboFonctionnalite){
	// r�cuperer les index du groupe de fonctionnalit� s�l�ctionn� et la fonctionnalit�
	var idxGroupeSelected = document.getElementsByName(comboGroupeFonction)[0].selectedIndex;
	var idxFoncSelected = document.getElementsByName(comboFonctionnalite)[0].selectedIndex;
	
	// r�cuperer les valeurs du groupe de fonction s�l�ctionn� et de la fonctionnalit�
	var groupeSelectedValue = document.getElementsByName(comboGroupeFonction)[0][idxGroupeSelected].value.split(" - ");
		
	if(idxFoncSelected!=-1){
		var foncValue = document.getElementsByName(comboFonctionnalite)[0][idxFoncSelected].value;
	}
	var j=1;
	// aucun groupe de fonction dans la liste box
	if(idxGroupeSelected==-1)
		return;

	// aucune groupe de fonction s�lectionn�
	if(idxGroupeSelected==0){
		getLibelleAllFonc(comboFonctionnalite);
		return;
	}
	// un groupe s�lectionn� avec index = idxGroupeSelected et valeur = typeSelectedValue
	var foncByGroupeList = document.getElementsByName('regroupfonction')[0].value.split("##");
	
	//vider la liste box fonctionnalit�
	document.getElementsByName(comboFonctionnalite)[0].options.length=0;
		
	for(var i=0; i<foncByGroupeList.length; i++){
		var foncByGroupe = foncByGroupeList[i].split("~~");
		if(parseInt(foncByGroupe[0]) == parseInt(groupeSelectedValue[0])){
			document.getElementsByName(comboFonctionnalite)[0].options[j]=new Option(getLibelleFonctionnalite(foncByGroupe[1]),getLibelleFonctionnalite(foncByGroupe[1]));
			j++;
		}
	}
	// r�cup�rer les valeurs 
	document.getElementsByName(comboFonctionnalite)[0].value=foncValue;
}

/*Cyril Niang*/
/********************* r�cuperer le libelle d'une fonctionnalit�  *********************/
function getLibelleFonctionnalite(codeFonc){
	var FoncList = document.getElementsByName('fonctionnalites')[0].value.split("##");
		
	for(var i=0; i<FoncList.length; i++){
		var Fonc = FoncList[i].split("~~");
			if(Fonc[0]==codeFonc){
				return Fonc[0] + " - " + Fonc[1];
				break;
		}
	}
	return "";
}

/*Cyril Niang*/
/********************* r�cuperer le libelle de toutes les fonctionnalit�s  **********************/
function getLibelleAllFonc(comboFonctionnalite){
	var FoncList = document.getElementsByName('fonctionnalites')[0].value.split("##");
	document.getElementsByName(comboFonctionnalite)[0].options[0]= new Option('','');
	
	for(var i=0; i<FoncList.length; i++){
		var Fonc = FoncList[i].split("~~");
		document.getElementsByName(comboFonctionnalite)[0].options[i+1]=new Option(Fonc[0] + " - " + Fonc[1],Fonc[0] + " - " + Fonc[1]);
	}
}
