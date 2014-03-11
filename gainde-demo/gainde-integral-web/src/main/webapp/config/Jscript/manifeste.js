// manifeste.js

/***********************************************************************	
	Fonction		: variables globales pour la gestion des messages 
					  d'alerte et des constantes utilis�es dans le script
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: Permet de centraliser tous les messages d'alerte
					  et les constantes qui seront utilis�s 
					  et �ventuellement r�utilis�s
	Param�tres 		: 
	Utilis�e dans	: manifeste.js
************************************************************************/
var CONFIRMATION_SUPPRESSION = "Voulez-vous vraiment supprimer cet �l�ment ?";
var CONFIRMATION_ENVOI_DEMANDE = "Vous �tes sur le point d'envoyer la demande.\n Voulez-vous continuer ?";
var DOUBLE_DIEZ = "##";
var DOUBLE_TIELD = "~~";
var STRPKMERESELECTED="";
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: split un PK suivant un pattern et renvoi le 
					  r�sultat sous forme de tableau 
	Param�tres 		: un PK avec pour derni�re colonne la valeur 
					  sp�cifiant s'il y a apurement comptable
	Utilis�e dans	: 
************************************************************************/
	function splitPkWithPattern(aPkToSplit, pattern) {
		if ((aPkToSplit != "") && (pattern != "")) {
			//alert(aPkToSplit);
			// r�cup�ration et split du PK
			return aPkToSplit.split(pattern);	
		}
	}
	
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer la suppression 
					  d'un �l�ment
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
************************************************************************/
	function confirmerSuppression(reqCode, page){
		if(confirm(CONFIRMATION_SUPPRESSION)){
			doSubmitWithaoutValidate(reqCode,page);
		} else {
			return
		}
	}
	
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer l'envoi 
					  de la demande sur le manifeste
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
************************************************************************/
	function confirmerEnvoi(reqCode, page){
		if(confirm(CONFIRMATION_ENVOI_DEMANDE)){
			doSubmitWithaoutValidate(reqCode,page);
		} else {
			return
		}
	}
	
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer la suppression 
					  d'un �l�ment
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
************************************************************************/
	function confirmerSuppressionRecond(){
		return confirm(CONFIRMATION_SUPPRESSION);			
	}
	
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer l'envoi 
					  de la demande sur le manifeste
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
************************************************************************/
	function confirmerEnvoiRecond(reqCode, page){
		var form = document.forms.item(0);
		var hidden;
		var pk;
		//
		if(confirm(CONFIRMATION_ENVOI_DEMANDE)){
			doSubmitWithaoutValidate2(reqCode,page);
		} else {
			return
		}
	}
	
/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de modifier la demande de 
					  reconditionnement sur le manifeste
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
************************************************************************/
	function modifierDmdeRecond(reqCode, page){
		var form = document.forms.item(0);
		var hidden;
		var pk;
		//
		//alert(form.hiddenpk.value);
		// 2006~~10S~~2~~2~~0~~0~~null~~null
		if (form.hiddenpk) {
			hidden = form.hiddenpk.value;
			pk = splitPkWithPattern(hidden, DOUBLE_TIELD);
			//
			if ((pk[6] != 'null') && (pk[7] != 'null')) {
				//
				doSubmitWithaoutValidate(reqCode,page);				
			} else {
				return
			}
		} else {
			return
		}					
	}
function doReturnRechercheManif(){
	//alert('alert1');
	document.forms[0].action = 'rechercheManifesteAction.action?pageContext=rechercheManifeste';

	//alert(document.forms[0].action);
	document.forms[0].submit();
	
 }
 
function doReturnListArticleByLieuEmbarq(){
document.forms[0].action = 'editListArticleByLieuEmbarq.action?pageContext=editListLieuxEmbarq';
document.forms[0].submit();

}
/*author Chatbri Ali*/
/********************* fonction de contr�le dynamiques des champs  *****************
********************** saisie sp�cifiques selon le type du manifeste  *************/
function ShowHideManifesteFields(){
	
	var form = document.forms[0];
	var   selectedIndex = form.TNUM_manifTypeManifeste_OB.selectedIndex;
	var selectedIndexValue = form.TNUM_manifTypeManifeste_OB[selectedIndex].value;
	
if(selectedIndexValue == ''){
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").style.visibility = "hidden";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").style.visibility = "hidden";
	document.getElementById("TNUM_manifCompAssiste_OBF").style.visibility = "hidden"; 
	document.getElementById("TNUM_manifNumTitreTransport_OBF").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBF").style.visibility = "hidden";
	
	
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBL").style.visibility = "hidden"; 
	document.getElementById("TNUM_manifCompAssiste_OBL").style.visibility = "hidden"; 
	document.getElementById("TNUM_manifNumTitreTransport_OBL").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBL").style.visibility = "hidden";
	
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").value = "";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").value = "";
	document.getElementById("TNUM_manifCompAssiste_OBF").value = ""; 
	document.getElementById("TNUM_manifNumTitreTransport_OBF").value = "";
	document.getElementById("manifTypeNavire_OBF").value = "";
}else if(selectedIndexValue == '1' || selectedIndexValue == '4'){
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").style.visibility = "";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").style.visibility = ""; 
	document.getElementById("TNUM_manifCompAssiste_OBF").style.visibility = "hidden"; 
	document.getElementById("TNUM_manifNumTitreTransport_OBF").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBF").style.visibility = "";

	document.getElementById("TNUM_LIST_manifPavillionNavire_OBL").style.visibility = "";
	document.getElementById("TNUM_manifCompAssiste_OBL").style.visibility = "hidden"; 
	document.getElementById("TNUM_manifNumTitreTransport_OBL").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBL").style.visibility = "";
	
	document.getElementById("TNUM_manifCompAssiste_OBF").value = ""; 
	document.getElementById("TNUM_manifNumTitreTransport_OBF").value = "";
	
}else if(selectedIndexValue == '2'){
	document.getElementById("TNUM_manifCompAssiste_OBF").style.visibility = "";
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").style.visibility = "hidden";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").style.visibility = "hidden";
	document.getElementById("TNUM_manifNumTitreTransport_OBF").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBF").style.visibility = "hidden";

	document.getElementById("TNUM_LIST_manifPavillionNavire_OBL").style.visibility = "hidden";
	document.getElementById("TNUM_manifCompAssiste_OBL").style.visibility = "";
	document.getElementById("TNUM_manifNumTitreTransport_OBL").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBL").style.visibility = "hidden";
	
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").value = "";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").value = "";
	document.getElementById("TNUM_manifNumTitreTransport_OBF").value = "";
	document.getElementById("manifTypeNavire_OBF").value = "";
	

}else if(selectedIndexValue =='3' || selectedIndexValue == '7' || selectedIndexValue == '6'){
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").style.visibility = "hidden";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").style.visibility = "hidden";
	document.getElementById("TNUM_manifCompAssiste_OBF").style.visibility = "hidden";
	document.getElementById("TNUM_manifNumTitreTransport_OBF").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBF").style.visibility = "hidden";

	document.getElementById("TNUM_LIST_manifPavillionNavire_OBL").style.visibility = "hidden";
	document.getElementById("TNUM_manifCompAssiste_OBL").style.visibility = "hidden";
	document.getElementById("TNUM_manifNumTitreTransport_OBL").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBL").style.visibility = "hidden";
	
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").value = "";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").value = "";
	document.getElementById("TNUM_manifCompAssiste_OBF").value = "";
	document.getElementById("TNUM_manifNumTitreTransport_OBF").value = "";
	document.getElementById("manifTypeNavire_OBF").value = "";
	
}else if(selectedIndexValue =='5'){
	document.getElementById("TNUM_manifCompAssiste_OBF").style.visibility = "";
	document.getElementById("TNUM_manifNumTitreTransport_OBF").style.visibility = "";
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").style.visibility = "hidden";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").style.visibility = "hidden";
	document.getElementById("manifTypeNavire_OBF").style.visibility = "hidden";

	document.getElementById("TNUM_LIST_manifPavillionNavire_OBL").style.visibility = "hidden";
	document.getElementById("TNUM_manifCompAssiste_OBL").style.visibility = "";
	document.getElementById("TNUM_manifNumTitreTransport_OBL").style.visibility = "";
	document.getElementById("manifTypeNavire_OBL").style.visibility = "hidden";
	
	document.getElementById("TNUM_LIST_manifPavillionNavire_OBF").value = "";
	if (document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget")!=null)
		document.getElementById("TNUM_LIST_manifPavillionNavire_OBF_widget").value = "";
	document.getElementById("manifTypeNavire_OBF").value = "";
	
}
}

/*author Chatbri Ali*/
/********************* fonction de contr�le  *****************
********************** sur la suppression des element ********/
function Supprimer(action,page){
	if(action=='deleteArticle'){
		messageAlerte='Voulez-vous supprimer cet article?\n\rCeci va supprimer tous les conteneurs qui appartiennent � ce dernier';
	}else if(action=='deleteManifeste'){
		messageAlerte='Voulez-vous supprimer ce manifeste?\n\rCeci va supprimer tous les articles et tous les conteneurs qui appartiennent � ce dernier';
	}else if(action=='deleteConteneur'){
		messageAlerte='Voulez-vous supprimer ce conteneur?';
	}else{
		messageAlerte='Etes-vous s�r de vouloir supprimer?';
	}
	if(confirm(messageAlerte)){
		doSubmitWithaoutValidate2(action,page);
	}else{
	return
	}
}

function computeBurByTypeManif(comboTypemanifProperty,comboBurEntreeProperty,comboBurEnregProperty){
	// r�cuperer les index de type manifeste s�l�ctionn�e, du bureau entr�e et bureau enregistrement
	var idxTypeSelected = document.getElementById(comboTypemanifProperty).selectedIndex;
	var idxBurEntree = document.getElementById(comboBurEntreeProperty).selectedIndex;
	if(document.getElementById(comboBurEnregProperty)!=null)
	var idxBurEnreg = document.getElementById(comboBurEnregProperty).selectedIndex;
	
	// r�cuperer les valeurs de type manifeste s�l�ctionn�e, du bureau entr�e et bureau enregistrement
	var typeSelectedValue = document.getElementById(comboTypemanifProperty).options[idxTypeSelected].value;
	if(idxBurEntree!=-1)
	var burEntreeValue = document.getElementById(comboBurEntreeProperty).options[idxBurEntree].value;
	if(document.getElementById(comboBurEnregProperty)!=null){
		if(idxBurEnreg!=-1)
		var burEnregValue = document.getElementById(comboBurEnregProperty).options[idxBurEnreg].value;
	}
			
	var j=1;
// aucune type manifeste dans la liste box
if(idxTypeSelected==-1)
	return;

// aucune type s�lectionn�
if(idxTypeSelected==0){
		getLibelleAllBureau(comboBurEntreeProperty,comboBurEnregProperty);
	return;
}
// un type s�lectionn� avec index = idxTypeSelected et valeur = typeSelectedValue
var burByTypeManifList = document.getElementById('burDouaneTypeManString').value.split("##");

//vider les 2 listes box de bureau entree et enregistrement
if(document.getElementById(comboBurEnregProperty)!=null)
	document.getElementById(comboBurEnregProperty).options.length=0;
	document.getElementById(comboBurEntreeProperty).options.length=0;
	
for(var i=0; i<burByTypeManifList.length; i++){
	var burByTypeManif = burByTypeManifList[i].split("~~");
	if(parseInt(burByTypeManif[0]) == parseInt(typeSelectedValue)){
		document.getElementById(comboBurEntreeProperty).options[j]=new Option(getLibelleBureau(burByTypeManif[1]),burByTypeManif[1]);
		if(document.getElementById(comboBurEnregProperty)!=null)
			document.getElementById(comboBurEnregProperty).options[j]=new Option(getLibelleBureau(burByTypeManif[1]),burByTypeManif[1]);
		j++;
	}
}
// r�cup�rer s'il y a ses valeurs affect�es aux bureaux
document.getElementById(comboBurEntreeProperty).value=burEntreeValue;
if(document.getElementById(comboBurEnregProperty)!=null)
	document.getElementById(comboBurEnregProperty).value=burEnregValue;
}
/*author Chatbri Ali*/
/********************* r�cuperer le libelle d'un nouveau **********************
********************** code de l�l�ment des listes fils  *********************/
function getLibelleBureau(codeTypeBur){
	var BureauList = document.getElementById('typeBurDouaneString').value.split("##");
	
for(var i=0; i<BureauList.length; i++){
	var Bureau = BureauList[i].split("~~");
		if(Bureau[0]==codeTypeBur){
			return Bureau[1];
				break;
	}
		
}
	return "";
}
/*author Chatbri Ali*/
/********************* r�cuperer le libelle d'un nouveau **********************
********************** code de l�l�ment des listes fils ***********************/
function getLibelleAllBureau(comboBurEntreeProperty,comboBurEnregProperty){
var BureauList = document.getElementById('typeBurDouaneString').value.split("##");
document.getElementById(comboBurEntreeProperty).options[0]= new Option('','');
if(document.getElementById(comboBurEnregProperty)!=null)		
	document.getElementById(comboBurEnregProperty).options[0]= new Option('','');

for(var i=0; i<BureauList.length; i++){
	var Bureau = BureauList[i].split("~~");
		document.getElementById(comboBurEntreeProperty).options[i+1]=
				new Option(Bureau[1],Bureau[0]);
	if(document.getElementById(comboBurEnregProperty)!=null)		
		document.getElementById(comboBurEnregProperty).options[i+1]= new Option(Bureau[1],Bureau[0]);
}
}
/*author Chatbri Ali*/
/**************** Fonction appel�e pour activer ou desactiver le bouton *************
**************   enregistrement partiel du segment general manifeste ****************/
function enableDisableEnregButton(aRadio) {
	
	if (aRadio != null) {
			document.forms.item(0).enregistrementDefinitif.disabled = '';
		if(ActivateButton(aRadio)){
				document.forms.item(0).enregistrementPartiel.disabled = '';
		}else{
				document.forms.item(0).enregistrementPartiel.disabled = 'true';
		}
	} else {
		if (document.forms.item(0).enregistrementDefinitif)
				document.forms.item(0).enregistrementDefinitif.disabled = 'true';		
		if (document.forms.item(0).enregistrementPartiel)
				document.forms.item(0).enregistrementPartiel.disabled = 'true';
	}	
}
/*author Chatbri Ali*/
/**************** Fonction appel�e pour savoir le nombre *************
**************   articledu segment general manifeste ****************/
function ActivateButton(element){
	
	var manifElement = document.getElementById('manifPksNbArtString');	
	var manifPksList = manifElement.value.split("##");
	var manifPks = element.value.split("~~");
		
	if(manifPksList.length==0)			
	return false;
	var dateElement = document.getElementById('manifDateCreation');
	
	dateElement.value = manifPks[3];
	
	//alert('manifPksList '+ manifPks[3])
	for(var i=0; i < manifPksList.length;i++){
		var pkmanifnbrArtList = manifPksList[i].split("~~");
		if((pkmanifnbrArtList[0] == manifPks[1])&&(pkmanifnbrArtList[1] == manifPks[0])&&
				(pkmanifnbrArtList[2] == manifPks[2])&&(parseInt(pkmanifnbrArtList[4]) > 0))
			return true;
	}
	return false;
}
/*author Chatbri Ali*/
/**************** Fonction appel�e pour valider le champ   *********************
**************  nbre conteneur de l'article brouillon manifeste ****************/
function validateArticle(){
		var nbrContenuerDirty = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBDirty.value);
		var nbrContenuer = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OB.value);

	if(nbrContenuer<nbrContenuerDirty){
			alert("Le nombre de conteneurs saisis doit �tre sup�rieur ou �gal \n\rau nombre de conteneurs qui existent d�j� pour cet article  :"+nbrContenuerDirty);
			//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.forms.item(0).NUM_manifNbreConteneur_OB.focus();
			return;
	}
		doSubmit2('modifierArticle','editArticle');
}
/*author Chatbri Ali*/
/**************** Fonction appel�e pour contr�ler le nombre  ****************
************** maximum qu'on peut saisir de conteneur article****************/
function permitSaisieConteneur(){
		var nbrContenuerDirty = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBDirty.value);
		var nbrContenuer = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OB.value);

	if(nbrContenuer<nbrContenuerDirty){
			//alert("Vous avez atteint le nombre maximum de conteneurs permis  :"+nbrContenuerDirty+".\n\r Augmenter le nombre de conteneurs ");
			//alert("Le nombre de conteneurs saisis doit �tre sup�rieur ou �gal \n\rau nombre de conteneurs d�ja saisie des articles  :"+nbrContenuerDirty);
			alert("Le nombre de conteneurs saisi dans la rubrique Nombre de conteneurs qui est de :"+nbrContenuer+"\n\rdoit �tre sup�rieur ou �gal au nombre de conteneurs d�ja existant pour cet article qui est de :"+nbrContenuerDirty);
			selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.forms.item(0).NUM_manifNbreConteneur_OB.focus();
			return;
	}
	
		doSubmitWithaoutValidate2('saisieContainerAction','saisieConteneur');
}

/**************** Fonction appel�e pour contr�ler le nombre  ****************
************** maximum qu'on peut saisir de conteneur article****************/
function permitSaisieConteneurRectif(){
		var nbrContenuerDirty = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBDirty.value);
		var nbrContenuer = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OB.value);

	if(nbrContenuer<nbrContenuerDirty){
			//alert("Vous avez atteint le nombre maximum de conteneurs permis  :"+nbrContenuerDirty+".\n\r Augmenter le nombre de conteneurs ");
			//alert("Le nombre de conteneurs saisis doit �tre sup�rieur ou �gal \n\rau nombre de conteneurs d�ja saisie des articles  :"+nbrContenuerDirty);
			alert("Le nombre de conteneurs saisi dans la rubrique Nombre de conteneurs qui est de :"+nbrContenuer+"\n\rdoit �tre sup�rieur ou �gal au nombre de conteneurs d�ja existant pour cet article qui est de :"+nbrContenuerDirty);
			selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.forms.item(0).NUM_manifNbreConteneur_OB.focus();
			return;
	}
	
	doSubmitWithaoutValidate2('newPageConteneur','saisieConteneur');
}
/**************** Fonction appel�e pour contr�ler si l'article a des ****************
***************** conteneurs afin de permettre leur modification***************/
function permitModificationConteneur(){
		var nbrContenuerDirty = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBDirty.value);
		var nbrContenuer = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBSafety.value);

	if(nbrContenuerDirty<=0){
			alert("Vous pouvez pas modifier de conteneur.\n\r Aucun conteneur n'est encore saisi ");
			selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.forms.item(0).NUM_manifNbreConteneur_OB.focus();
			return;
	}
		doSubmitWithaoutValidate2('newPageConteneur','saisieConteneur');
}
/**************** Fonction appel�e pour contr�ler si l'article a des ****************
***************** conteneurs afin de permettre leur modification***************/
/*function permitModificationConteneur(){
		var nbrContenuerDirty = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBDirty.value);
		var nbrContenuer = parseInt(document.forms.item(0).NUM_manifNbreConteneur_OBSafety.value);

	if(nbrContenuerDirty<=0){
			alert("Vous pouvez pas modifier de conteneur.\n\r Aucun conteneur n'est encore saisi ");
			selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.forms.item(0).NUM_manifNbreConteneur_OB.focus();
			return;
	}
		doSubmitWithaoutValidate('newPageConteneur','saisieConteneur');
}*/
/*author Chatbri Ali*/
/**************** Fonction appel�e pour contr�ler le delai de ****************
************** l'enregistrement d'un segment generale manifeste ************/
function validateEnregistrerManifeste(){

 	var datePattern = "dd/MM/yyyy";
	var dateNow = new Date();
	var dateCreationLong = document.forms.item(0).manifDateCreation.value;
	//var difference = Number(document.forms.item(0).sysdate.value - dateCreationLong);
	//un jour = 86 400 secondes = 86 400 000millis � 0h
	//un jour = 172 800 000 millis � 24h
	//var sysdate = Number(document.forms.item(0).sysdate.value);

	if(document.forms.item(0).nbjours.value!=''){
	var nbj=Number(document.forms.item(0).nbjours.value);//*172800000;
	if(Number(dateCreationLong)>nbj){
		alert("Vous avez d�pass� le d�lai de "+document.forms.item(0).nbjours.value+" jours")
		return;
	}
	}	
	if(document.forms.item(0).enregistrementDefinitif){
	if (!confirm("\t\t\t\tATTENTION : \nEn enregistrant un manifeste, vous cr�ez un acte juridique faisant foi jusqu'� inscription de faux. \n\rIl appartient au consignataire de v�rifier qu'il n'effectue pas plusieurs fois l'enregistrement du m�me titre de transport."))
			return;
	else //if(document.forms.item(0).enregistrementDefinitif)
		doSubmitSearch('rechercheNewPageAction','enregManifesteDefinitif');
	}
	
}

/**************** Fonction appel�e pour contr�ler le delai de ****************
************** l'enregistrement lors de l'enregistrement Partiel************/
function validateEnregistrementPartiel(){

 	var datePattern = "dd/MM/yyyy";
	var dateNow = new Date();
	var dateCreationLong = document.forms.item(0).manifDateCreation.value;
	//var difference = Number(document.forms.item(0).sysdate.value - dateCreationLong);
	//un jour = 86 400 secondes = 86 400 000millis � 0h
	//un jour = 172 800 000 millis � 24h
	//var sysdate = Number(document.forms.item(0).sysdate.value);
	if(document.forms.item(0).nbjours.value!=''){
	var nbj=Number(document.forms.item(0).nbjours.value);//*172800000;
	if(Number(dateCreationLong)>nbj){
		alert("Vous avez d�pass� le d�lai de "+document.forms.item(0).nbjours.value+" jours")
		return;
	}
	}
//	else //if(document.forms.item(0).enregistrementDefinitif)
	doSubmitSearch('rechercheNewPageAction','enregManifestePartiel');
//	}
}



function controleDemandeMiseEndepot(fieldN1,fieldN2,fieldN3,fieldN4){
	//Contr�le du champ NOMBRE DE COLIS
	if(isNumPositif(fieldN1)==false){
		alert('Vous devez saisir un nombre sup�rieur � z�ro.');
		fieldN1.focus();
		return false;
	}
	if(compareTo(fieldN1.value,fieldN2.value)=="1"){
		alert('Le nombre de colis � mettre en d�p�t doit �tre inf�rieur ou �gal au nombre de colis �cor�s.');
		fieldN1.focus();
		return false;
	}
	//Contr�le du champ POIDS BRUT
	if(isNumPositif(fieldN3)==false){
		alert('Vous devez saisir un nombre sup�rieur � z�ro.');
		fieldN3.focus();
		return false;
	}
	if(compareTo(fieldN3.value,fieldN4.value)=="1"){
		alert('Le poids � mettre en d�p�t doit �tre inf�rieur ou �gal au poids brut.');
		fieldN3.focus();
		return false;
	}
	}

/*author Chatbri Ali*/
/**************** enregistrement partiel du manifeste  *****************
************** contr�le le bouton de l'enregistrement  ****************/
	function enableEnregistrementButton(aCheckbox) {
		var form = document.forms[0]; 
		
		if (aCheckbox != null) {
			if (aCheckbox.checked) {
				nbarticlecoche++; 
			}else {
				nbarticlecoche--;
			}
			if (nbarticlecoche < 0) nbarticlecoche=0;
			if (nbarticlecoche != 0) {
				form.enregistrementPartielManifeste.disabled = '';
				if(form.codelieuemb.value!="") form.enreglieuemb.disabled = 'true';				
			}else {
				form.enregistrementPartielManifeste.disabled = 'true';
				if(form.codelieuemb.value!="") form.enreglieuemb.disabled = '';
			}
		}
		else {
			
			form.enregistrementPartielManifeste.disabled = 'true';
			if(form.codelieuemb.value!="") form.enreglieuemb.disabled = '';
		}
	}

	function doSubmitSelectedArticle(aCheckbox) {
		if (confirm("\t\t\t\tATTENTION : \nEn enregistrant un manifeste, vous cr�ez un acte juridique faisant foi jusqu'� inscription de faux. \n\rIl appartient au consignataire de v�rifier qu'il n'effectue pas plusieurs fois l'enregistrement du m�me titre de transport.")) {
			doSubmitWithaoutValidate2('enregistrementPartielAction', 'enregManifestePartiel');
		}
	}	

/*author Chatbri Ali*/
/**************** Fonction appel�e pour contr�ler les zones check box des articles *****************
*************  pk[5] est precision de l'article pk[6] est l'indicateur precision *******************
************* pk[5]=0 cad est un article mere, pk[6]=0 cad est en cours de degroupage **************
************* et pk[6]=1 est enti�rement dgroup� ***************************************************/
/*function disablecheckBox(){
	var form = document.forms.item(0);
	var pk;
	for (var i=0;i<form.length;i++){
		if (form.elements[i].type=="checkbox"){
		
			pk = form.elements[i].value.split("~~");
			if(pk[5]=="0" && (pk[6]=="0" || pk[6]=="1")){
				//form.elements[i].checked="false";
				form.elements[i].disabled="true";}
		}
	}

}*/
//////////////Commenter
function disablecheckBox(){
	var form = document.forms[0];
	var pk;
	var tabpkMere = new Array();
	//alert('document.getElementById("stringPkMere").value ds disabled = '+document.getElementById("stringPkMere").value);
	//alert("Ajaxx responseqq:"+req.responseText);
	//Parcourir tous les checkbox et inhiber les articles fils  
	for (var i=0;i<form.length;i++){
		if (form.elements[i].type=="checkbox"){
		 // if(document.getElementById("stringPkMere").value==''){
			pk = form.elements[i].value.split("~~");
			//if(pk[5]=="0" && (pk[6]=="0" || pk[6]=="1")){
			if(pk[5]!="0"){
				//form.elements[i].checked="false";
				form.elements[i].disabled="true";
			}
		  //}
		  // Cocher les articles m�res qui sont recup�r�s dans le champ cach� 
		  	if(document.getElementById("stringPkMere").value!=''&&document.getElementById("stringPkMere").value!=null){
		    pkMere=document.getElementById("stringPkMere").value;
		    if(pkMere.indexOf(form.elements[i].value)!=-1)
		    form.elements[i].checked=true;
		    pkMere=pkMere.split("|");
   		    //alert('pkMere after split ='+pkMere);
   		    tabpkMere=pkMere;
   		   // alert('tabpkMere.length = '+tabpkMere.length);
   		    for(var k=0;k<tabpkMere.length;k++){
   		   // alert('tabpkMere[k] = ');
   		    // alert('tabpkMere[k] = '+tabpkMere[k]);
		    pk=tabpkMere[k].split("~~");
		   //alert('pkMere = '+pk);
		    
		    //if(pk[5]!="0"){
		    try{
			 for(var j=0;j<form.length;j++){
			 if (form.elements[j].type=="checkbox"){
			   var pkfils=form.elements[j].value;
			   pkfils=pkfils.split("~~");
				//alert('PKFILS = '+pkfils);
			
			   if((pk[0]==pkfils[0])&&(pk[1]==pkfils[1])&&(pk[2]==pkfils[2])
			   		&&(pk[3]==pkfils[3])&&(pk[4]==pkfils[4])&&pkfils[5]!="0")
			   {
			   form.elements[j].checked=true;
			  // form.elements[j].disabled="true";
			   }
			  // alert('FIN FILS');
			   
			  }
			 }
			 }catch(Exception){
			   continue;
			 }
				//form.elements[i].checked="false";
			//form.elements[i].disabled="true";
		    
		  //}
		  //fin  if(pk[5]!="0")
		  }//fin for var k 
		}else if(document.getElementById("stringPkMere").value==''){
		 try{
			 for(var j=0;j<form.length;j++){
			 if (form.elements[j].type=="checkbox"){
			   var pkfils=form.elements[j].value;
			   pkfils=pkfils.split("~~");
				//alert('PKFILS = '+pkfils);
			
			   
			   form.elements[j].checked=false;
			  // form.elements[j].disabled="true";
			   
			  // alert('FIN FILS');
			   
			  }
			 }
			 }catch(Exception){
			   continue;
			 }
		
		}
	
	}
 }

}


function checkAll(){

	var form = document.forms.item(0);
	var trouve;
	 var mmm="";
	//alert('document.getElementById("stringPkMere").value ='+document.getElementById("stringPkMere").value);
	for (var i=0;i<form.length;i++){
	//traitement si un article m�re est coch�
		if (form.elements[i].type=="checkbox"){
		   if(form.elements[i].checked==true){
		   
			 pk = form.elements[i].value.split("~~");
			// alert('pkmere ='+form.manifPkMere.value+'\n Fils ='+form.elements[i].value+'\n result = '+form.manifPkMere.value.indexOf(form.elements[i].value));

			 //****traitement permettant de recup�rer les articles m�res coch�s//
			 var result=form.manifPkMere.value.indexOf(form.elements[i].value);
			 
			 if(result!=-1)
			 trouve=true;
			 else
			 trouve=false;
			 if(pk[5]=="0"){
			 if(form.manifPkMere.value!=''&&trouve==false)
			 form.manifPkMere.value=form.manifPkMere.value+"___"+form.elements[i].value;
			 else if(form.manifPkMere.value=='')
			 form.manifPkMere.value=form.elements[i].value;
			 }
			 //**fin recup�ration**//
			// alert('PK = '+pk);
			 try{
			 for(var j=0;j<form.length;j++){
			 if (form.elements[j].type=="checkbox"){
			   var pkfils=form.elements[j].value.split("~~");
				//alert('PKFILS = '+pkfils);
			   if((pk[0]==pkfils[0])&&(pk[1]==pkfils[1])&&(pk[2]==pkfils[2])
			   		&&(pk[3]==pkfils[3])&&(pk[4]==pkfils[4])&&pkfils[5]!="0")
			   form.elements[j].checked=true;
			   
			  // alert('FIN FILS');
			   }
			 }
			 }catch(Exception){
			   continue;
			 }
		   }// FIN traitement si un article m�re est coch�
		   
		   //traitement si un article m�re est d�coch�
		   else{
		   mmm=form.manifPkMere.value;
		  // alert('mmm = '+mmm);
		   	 form.manifPkMere.value=mmm.replace(form.elements[i].value,"");
		//   	alert('form.manifPkMere.value ==='+form.manifPkMere.value);
		   	 pk = form.elements[i].value.split("~~");
		   	  try{
			 for(var j=0;form.length;j++){
			 if (form.elements[j].type=="checkbox"){
			   var pkfils=form.elements[j].value.split("~~");
				//alert('PKFILS = '+pkfils);
			   if((pk[0]==pkfils[0])&&(pk[1]==pkfils[1])&&(pk[2]==pkfils[2])
			   		&&(pk[3]==pkfils[3])&&(pk[4]==pkfils[4])&&pkfils[5]!="0")
			   form.elements[j].checked=false;
			  // alert('FIN FILS');
			   }
			 }
			 }catch(Exception){
			   continue;
			 }
			   
			   //alert('form.manifPkMere.value unchecked = '+form.manifPkMere.value);
			 
		   } //FIN traitement si un article m�re est d�coch�
		}
	}
//alert('manifPkMere ='+form.manifPkMere.value);
//alert('***'+document.getElementById("stringPkMere").value+'**stringPkMere**indexOf()='+document.getElementById("stringPkMere").value.indexOf(form.manifPkMere.value));
//Recup�ration des articles m�res qui sont coch�s	
var recup;
//alert('"stringPkMere")='+form.stringPkMere.value+'XXXXX='+form.manifPkMere.value);
recup=document.getElementById("stringPkMere").value.indexOf(form.manifPkMere.value)
if(recup!=-1)
trouverecup=true;
else
trouverecup=false;
//alert('trouverecup='+trouverecup);
if(document.getElementById("stringPkMere").value!=""&&trouverecup==false){
document.getElementById("manifPkMere").value=document.getElementById("stringPkMere").value+"|"+form.manifPkMere.value;
//alert('Valeur si chaine non vide et valeur inexistant '+document.getElementById("manifPkMere").value);
}
else if(document.getElementById("stringPkMere").value!=""&&trouverecup==true){
var rep=document.getElementById("stringPkMere").value;
//alert('rep='+rep);
document.getElementById("manifPkMere").value=rep.replace(mmm,"");
//alert('Valeur si chaine non vide et valeur existant '+document.getElementById("manifPkMere").value);
}else{
document.getElementById("manifPkMere").value=form.manifPkMere.value;
//alert(document.getElementById("stringPkMere").value+'sinon '+trouverecup);
}
//alert(document.getElementById("manifPkMere").value);
//submitAjaxURL('/gainde/enregistrerManifesteACT.do?reqCode=recuperePkMereSelected&page=enregManifestePartiel&manifpkmere='+document.getElementById('manifPkMere').value);
//STRPKMERESELECTED=form.manifPkMere.value;
}

/*
function getcheckedArticleMere(){
	var form = document.forms.item(0);
	var pk;
	for (var i=0;i<form.length;i++){
		if (form.elements[i].type=="checkbox"){
		
			pk = form.elements[i].value.split("~~");
			//if(pk[5]=="0" && (pk[6]=="0" || pk[6]=="1")){
			if(pk[5]=="0"&&form.elements[i].checked=true){
				//form.elements[i].checked="false";
				
				form.manifPkMere.value=form.manifPkMere.value+"##"+pk;
			}
		}
	}
alert('manifPKMere '+form.manifPkMere.value);
}*/
/*author Chatbri Ali*/
/**************** Fonction appel�e pour contr�ler  *****************
************** l'enregistrementd'une demande de destruction *******/
function controleEnregDemandeDestruction(NbreColisADetruire,NbreColisEcores,NbreColis,PoidsADetruire,PoidsBrutEcore,PoidsBrut){
	//alert();
	var nbrColisADetruire = document.getElementById(NbreColisADetruire).value;
	var nbrColisEcores = document.getElementById(NbreColisEcores).value;
	var nbrColis = document.getElementById(NbreColis).value;
	var PoidADetruire = document.getElementById(PoidsADetruire).value;
	var PoidBrutEcore = document.getElementById(PoidsBrutEcore).value;
	var PoidBrut = document.getElementById(PoidsBrut).value;

	if(nbrColisADetruire==''){
			//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.getElementById(NbreColisADetruire).focus();
			alert("Le nombre de colis � d�truire est obligatoire");
			return;
	}
	if(nbrColisEcores != '' && parseInt(nbrColisEcores)>0){
		if(nbrColisADetruire!='' && parseInt(nbrColisADetruire)>parseInt(nbrColisEcores)){
			alert("Le nombre de colis � d�truire doit �tre inf�rieur au nombre colis �cor�s");
			return;
		}
			
	}else if(nbrColisADetruire != '' && parseInt(nbrColisADetruire)>parseInt(nbrColis)){
			alert("Le nombre de colis � d�truire doit �tre inf�rieure au nombre colis");
			return;
	}
	
	if(PoidADetruire == ''){
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById(PoidsADetruire).focus();
		alert("Le poids � d�truire est obligatoire");
		return;
	}	
	if(PoidBrutEcore != '' && parseInt(PoidBrutEcore)>0){
		if(PoidADetruire != '' && parseInt(PoidADetruire)>parseInt(PoidBrutEcore)){
			alert("Le poids � d�truire doit �tre inf�rieur au poids �cor�");
			return;
		}
			
	}else if(PoidADetruire != '' && parseInt(PoidADetruire)>parseInt(PoidBrut)){
			alert("Le poids � d�truire doit �tre inf�rieur au poids brut");
			return;
	}
	doSubmit2('enregistrerDemandeDest','consulterManifesteDemandeDest');	
}
/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction de controler les champs poids et colis � 
					  modifier dans la demande de destruction
	Param�tres		: aucun
	Utilis�e dans	: manifManifesteDestSaisie.jsp
************************************************************************/

function controleUpdateDemandeDestruction(NbreColisADetruire,NbreColisEcores,NbreColis,PoidsADetruire,PoidsBrutEcore,PoidsBrut){
	//alert();
	var nbrColisADetruire = document.getElementById(NbreColisADetruire).value;
	var nbrColisEcores = document.getElementById(NbreColisEcores).value;
	var nbrColis = document.getElementById(NbreColis).value;
	var PoidADetruire = document.getElementById(PoidsADetruire).value;
	var PoidBrutEcore = document.getElementById(PoidsBrutEcore).value;
	var PoidBrut = document.getElementById(PoidsBrut).value;

	if(nbrColisADetruire==''){
			//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			document.getElementById(NbreColisADetruire).focus();
			alert("Le nombre de colis � d�truire est obligatoire");
			return;
	}
	if(nbrColisEcores != '' && parseInt(nbrColisEcores)>0){
		if(nbrColisADetruire!='' && parseInt(nbrColisADetruire)>parseInt(nbrColisEcores)){
			alert("Le nombre de colis � d�truire doit �tre inf�rieur au nombre colis �cor�s");
			return;
		}
			
	}else if(nbrColisADetruire != '' && parseInt(nbrColisADetruire)>parseInt(nbrColis)){
			alert("Le nombre de colis � d�truire doit �tre inf�rieure au nombre colis");
			return;
	}
	
	if(PoidADetruire == ''){
		//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
		document.getElementById(PoidsADetruire).focus();
		alert("Le poids � d�truire est obligatoire");
		return;
	}	
	if(PoidBrutEcore != '' && parseInt(PoidBrutEcore)>0){
		if(PoidADetruire != '' && parseInt(PoidADetruire)>parseInt(PoidBrutEcore)){
			alert("Le poids � d�truire doit �tre inf�rieur au poids �cor�");
			return;
		}
			
	}else if(PoidADetruire != '' && parseInt(PoidADetruire)>parseInt(PoidBrut)){
			alert("Le poids � d�truire doit �tre inf�rieur au poids brut");
			return;
	}
	doSubmit2('modifierDemandeDest','consulterManifesteDemandeDest');	
}
/*author Chatbri Ali*/
/*********** Fonction contr�le l'activation du bouton ***************
*********** en fonction de la taille de la liste affich�e ***********/
function enableButtonLieuEmbarq(){
	var form = document.forms.item(0);
	form.lieuEmbarquementButton.disabled="true";

	for (var i=0;i<document.images.length;i++){
		if (document.images[i].src.indexOf("edit1.jpg") != -1){
			form.lieuEmbarquementButton.disabled=false;
			return;
		}
	}
}

/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction permettant de tester si l'indicateur partiel est
					  �gal � C ou P
	Param�tres		: aucun
	Utilis�e dans	: manifManifesteModification.jsp
************************************************************************/

function enableButtonValidateDelete(){
	var form = document.forms[0];
	form.validateManifeste.disabled=true;
	//form.deleteManifeste.disabled=true;

	if ((document.getElementById("TNUM_manifIndicateurPartiel").value != 'C')
		&&(document.getElementById("TNUM_manifIndicateurPartiel").value != 'P')){
		form.validateManifeste.disabled=false;
		//form.deleteManifeste.disabled=false;
		return;
	}
}

/***********************************************************************
	Auteur			: Mouhamad KAMARA
	Description 	: Fonction permettant de tester si le num�ro du manifeste 
					a �t� saisi ou non dans le formulaire de recherche
	Param�tres		: aucun
	Utilis�e dans	: listeArticleInclude.jsp
************************************************************************/
	function controlConsultationRegistreDepotIsOk() {	
		if (document.getElementById("NUM_manifAnnee").value == '') { 
			// si l'ann�e est vide NUM_manifAnnee
			alert("Erreur de saisie du Num�ro de Manifeste.\nL'ann�e d'enregistrement du manifeste est OBLIGATOIRE");
			document.getElementById("NUM_manifAnnee").focus();
			return false;
		} else if (document.getElementById("TNUM_manifCodeBur").value == '') { 
			// si le code bureau est vide TNUM_manifCodeBur
			alert("Erreur de saisie du Num�ro de Manifeste.\nLe bureau d'enregistrement du manifeste est OBLIGATOIRE");
			document.getElementById("TNUM_manifCodeBur").focus();
			return false;
		} else if (document.getElementById("NUM_manifNumSeq").value == '') { 
			// si le numeroenregistrement est vide NUM_manifNumSeq
			alert("Erreur de saisie du Num�ro de Manifeste.\nLe num�ro d'enregistrement du manifeste est OBLIGATOIRE");		
			document.getElementById("NUM_manifNumSeq").focus();
			return false;
		} else {
			//
			return true;
		}		
	}

/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction permettant de tester lorsque qu'une information
					du manifeste ou de l'article est saisie, que la saisie des autres
					�l�ments est obligatoire.
	Param�tres		: aucun
	Utilis�e dans	: manifRegulAerienManif.jsp
************************************************************************/
	function controlSaisieChampsRegulAerienIsOk() {
		if (document.getElementById("NumeroPave").value == "1"){
			if ((document.getElementById("TNUM_numRepRegul").value == '')			
					|| (document.getElementById("NUM_manifAnnee").value == '')
					|| (document.getElementById("TNUM_manifCodeBur").value == '')
					|| (document.getElementById("NUM_manifNumSeq").value == '')
					|| (document.getElementById("NUM_numArticle").value == '')
					|| (document.getElementById("NUM_ArtPrecision1").value == '')
					|| (document.getElementById("NUM_ArtPrecision2").value == '')) {
			
				alert("Vous devez saisir toutes les informations concernant le r�pertoire, \nle num�ro du manifeste et le num�ro de l'article");					
			}else{
				return true;
			}
		}else if (document.getElementById("NumeroPave").value == "2"){
			if ((document.getElementById("TNUM_numVolRegul").value == '')			
					|| (document.getElementById("DAT_dateArriveRegul").value == '')
					|| (document.getElementById("TNUM_ltaRegul").value == '')) {
			
				alert("Vous devez saisir les informations le num�ro de vol, \nla date arriv�e et la LTA");					
			}else{
				return true;
			}
		}else {
			alert("Vous devez saisir au moins des crit�res \nconcernant le manifeste de r�gularisation.");	
		}

	}

/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction permettant de vider les champs du pav� 1 lorsque
					qu'un champ du pav� 2 est modifi�.
	Param�tres		: aucun
	Utilis�e dans	: manifRegulAerienManif.jsp
************************************************************************/
	function viderChampPave1() {
		document.getElementById("TNUM_numRepRegul").value="";
		document.getElementById("NUM_manifAnnee").value="";
		document.getElementById("TNUM_manifCodeBur").value="";
		document.getElementById("NUM_manifNumSeq").value="";
		document.getElementById("NUM_numArticle").value="";
		document.getElementById("NUM_ArtPrecision1").value="";
		document.getElementById("NUM_ArtPrecision2").value="";
		document.getElementById("NumeroPave").value="2";
	}

/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction permettant de vider les champs du pav� 2 lorsque
					qu'un champ du pav� 1 est modifi�.
	Param�tres		: aucun
	Utilis�e dans	: manifRegulAerienManif.jsp
************************************************************************/
	function viderChampPave2() {
		document.getElementById("TNUM_numVolRegul").value="";
		document.getElementById("DAT_dateArriveRegul").value="";
		document.getElementById("TNUM_ltaRegul").value="";
		document.getElementById("NumeroPave").value="1";
		
	}

/***********************************************************************
	Auteur 			: Mouhamad KAMARA
	Description		: Fonction permettant de tester que les champs n�cessaire
					� la recherche d'article fractionne sont remplis
	Param�tres		: aucun
	Utilis�e dans	: listeArticleInclude.jsp
************************************************************************/
	function controlRegularisationEnvoiFractionneIsOk() {
		if (document.getElementById("TNUM_manifTitreTransp").value == '') { 
			// si le titre de transport n'est pas renseign�
			alert("Le titre de transport est OBLIGATOIRE !");
			document.getElementById("TNUM_manifTitreTransp").focus();
			return false;
		} else if (document.getElementById("TNUM_manifCodeBur").value == '') { 
			// si le code bureau est vide TNUM_manifCodeBur
			alert("Erreur de saisie du num�ro de manifeste.\nLe bureau d'enregistrement du manifeste est OBLIGATOIRE !");
			document.getElementById("TNUM_manifCodeBur").focus();
			return false;
		} else {
			//
			return true;
		}
	}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant d'activer le bouton de validation 
					de l'envoi fractionn� et de v�rifier que les champs 
					total nb colis et total poids qont remplis
	Param�tres 		: input, un champ html (radio, textbox, button, ....)
	Utilis�e dans	: listeArticleInclude.jsp
************************************************************************/
	function validateRegularisationEnvoiFractionne(input) {		
		var form = document.forms[0]; 		
		// s'il selectionne le manifeste de reception on active le bouton
		if (input.type == "radio") {
			form.validationRegularisationEnvoiFractionne.disabled = '';
		} else {			
			if (form.NUM_manifTotalColis.value != '') {
				if (form.NUM_manifTotalPoids.value != '') {
					doSubmitWithaoutValidate('newPage', 'regulariserArticleManifeste');
				} else {
					alert("Veuillez renseigner le poids total!");
					form.NUM_manifTotalPoids.focus();				
				}
			} else {
				alert("Veuillez renseigner le nombre total de colis!");
				form.NUM_manifTotalColis.focus();
			}			
		}
	}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de tester que tous les champs
					ont �taient saisis avant validation du formulaire
	Param�tres 		: aucun
	Utilis�e dans	: manifApurementManifeste.jsp
************************************************************************/
	function controlerApurement() {
		if (controlManifesteEntreeIsOk()) {
			if (controlManifesteGroupageIsOk()) {
				if (!compareLTAEntreeGroupage()) {
					// les LTAs ne correspondent pas 
					return false;
				} else {
					// les LTAs correspondent et tous les champs ont �t� saisies
					doSubmitWithaoutValidate2('controlerApurement', 'apurerManifeste');
					return true;
				}
			} else {
				// un champ de la section groupage n'a pas �t� saisi
				return false;
			}
		} else {
			// un champ de la section entree n'a pas �t� saisi
			return false;
		}
	}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de tester que les LTas saisies
					sont les mm
	Param�tres 		: aucun
	Utilis�e dans	: manifApurementManifeste.jsp
************************************************************************/
	function compareLTAEntreeGroupage() {
		if (document.getElementById("TNUM_LTAMereEntree").value != document.getElementById("TNUM_LTAMereGroupage").value) {
			alert("LA LTA m�re d'entr�e doit �tre la m�me que celle de groupage !");
			// on vide les champs
			//document.getElementById("TNUM_LTAMereEntree").value = "";
			//document.getElementById("TNUM_LTAMereGroupage").value = "";
			// donne le focus � la zone LTA d'entr�e
			document.getElementById("TNUM_LTAMereEntree").focus();
			return false;
		} else {
			return true;
		}
	}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de tester que les champs du
					manifeste d'entr�e sont saisis
	Param�tres 		: aucun
	Utilis�e dans	: manifApurementManifeste.jsp
************************************************************************/
	function controlManifesteEntreeIsOk() {
		if (document.getElementById("NUM_manifAnneeEntree").value == '') { 
			// si l'ann�e est vide NUM_manifAnneeEntree
			alert("Erreur de saisie du num�ro de manifeste.\nL'ann�e d'enregistrement du manifeste est OBLIGATOIRE");
			document.getElementById("NUM_manifAnneeEntree").focus();
			return false;
		} else if (document.getElementById("TNUM_manifCodeBurEntree").value == '') { 
			// si le code bureau est vide TNUM_manifCodeBurEntree
			alert("Erreur de saisie du num�ro de manifeste.\nLe bureau d'enregistrement du manifeste est OBLIGATOIRE");
			document.getElementById("TNUM_manifCodeBurEntree").focus();
			return false;
		} else if (document.getElementById("NUM_manifNumSeqEntree").value == '') { 
			// si le numeroenregistrement est vide NUM_manifNumSeqEntree
			alert("Erreur de saisie du num�ro de manifeste.\nLe num�ro d'enregistrement du manifeste est OBLIGATOIRE");		
			document.getElementById("NUM_manifNumSeqEntree").focus();
			return false;
		} else if (document.getElementById("TNUM_LTAMereEntree").value == '') {
			// si la LTA est vide TNUM_LTAMereEntree
			alert("La LTA m�re est OBLIGATOIRE");		
			document.getElementById("TNUM_LTAMereEntree").focus();
			return false;
		} else {
			// 
			return true;
		}
	}

/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de tester que les champs du
					manifeste de groupage sont saisis
	Param�tres 		: aucun
	Utilis�e dans	: manifApurementManifeste.jsp
************************************************************************/
	function controlManifesteGroupageIsOk() {
		if (document.getElementById("NUM_manifAnneeGroupage").value == '') { 
			// si l'ann�e est vide NUM_manifAnneeGroupage
			alert("Erreur de saisie du Num�ro de Manifeste.\nL'ann�e d'enregistrement du manifeste est OBLIGATOIRE !");
			document.getElementById("NUM_manifAnneeGroupage").focus();
			return false;
		} else if (document.getElementById("TNUM_manifCodeBurGroupage").value == '') { 
			// si le code bureau est vide TNUM_manifCodeBurGroupage
			alert("Erreur de saisie du Num�ro de Manifeste.\nLe bureau d'enregistrement du manifeste est OBLIGATOIRE !");
			document.getElementById("TNUM_manifCodeBurGroupage").focus();
			return false;
		} else if (document.getElementById("NUM_manifNumSeqGroupage").value == '') { 
			// si le numeroenregistrement est vide NUM_manifNumSeqGroupage
			alert("Erreur de saisie du Num�ro de Manifeste.\nLe num�ro d'enregistrement du manifeste est OBLIGATOIRE !");		
			document.getElementById("NUM_manifNumSeqGroupage").focus();
			return false;
		} else if (document.getElementById("TNUM_LTAMereGroupage").value == '') {
			// si la LTA est vide TNUM_LTAMereGroupage
			alert("La LTA m�re est OBLIGATOIRE !");		
			document.getElementById("TNUM_LTAMereGroupage").focus();
			return false;
		} else {
			// 
			return true;
		}	
	}
	/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer la suppression 
					  d'un �l�ment
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
	************************************************************************/
	function confirmerSuppression(reqCode, page){
		if(confirm("Voulez-vous vraiment supprimer cet �l�ment ?")){
			doSubmitWithaoutValidate(reqCode,page);
		} else {
			return
		}
	}
	
	/***********************************************************************	
	Auteur 			: Mouhamad KAMARA
	Description 	: Fonction permettant de confirmer l'envoi 
					  de la demande sur le manifeste
	Param�tres 		: reqCode et page (Cf. struts-config.xml)
	Utilis�e dans	: 
	************************************************************************/
	function confirmerEnvoi(reqCode, page){
		if(confirm("Vous �tes sur le point d'envoyer la demande. \n Voulez-vous continuer ?")){
			doSubmitWithaoutValidate2(reqCode,page);
		} else {
			return
		}
	}
	/*author Chatbri Ali*/
	/****************************************************************/
	// fonction pour la validation des donn�es manifeste brouillon  //
	/***************************************************************/
	function validateNewManifeste(inputCapaciteBrute,inputCapaciteNette){
		var capaciteBrute = document.getElementById(inputCapaciteBrute).value;
		var capaciteNette = document.getElementById(inputCapaciteNette).value;
		if(parseInt(capaciteNette)>parseInt(capaciteBrute)){
			alert('La capacit� nette doit �tre inf�rieure ou �gale � la capacit� brute');
			document.getElementsById(inputCapaciteNette).focus();
			return false;
		}
			return true;
	}
	/*author Chatbri Ali*/
	/*****************************************************************************/
	// fonction pour la validation des donn�es article brouillon  
	// V�rification des champs obligatoires � la saisie dans les rubriques
	// Destinataire et �ventuellement dans A Ordre de selon le type du manifeste
	// Cette fonction v�rifie si l'un au moins des param�tres pass�s(code ou nom)
	// saisi au niveau interface ainsi que la LTA/Connaissement si elle existe
	/****************************************************************************/
	function validateArticleBrouillon(codeDestinataire,nomdestinataire){
		var codeDestinataireValue = document.getElementById(codeDestinataire).value;
		var nomdestinataireValue = document.getElementById(nomdestinataire).value;
		var ltaarticle = document.getElementById('TNUM_manifNumTitreTransportArticle');
		
		if(ltaarticle!=null)
			if(ltaarticle.value==''){
				alert('LTA/HAWB ou Connaissement obligatoire !');
				//selectTab(0,2,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
				ltaarticle.focus();
				document.getElementById('ongletEmbarq').focus();
				return false; 
			}
		if(codeDestinataireValue == '' && nomdestinataireValue == ''){
			if(codeDestinataire=='TNUM_LIST_manifCodePPMAOrdre'){
				alert('Veuillez saisir les informations de la rubrique A Ordre de !');
				//selectTab(0,2,1,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			} else {
				alert('Veuillez saisir les informations du destinataire !');
				//selectTab(0,2,0,'ongletTextEna','ongletTextDis','ongletTextErr',null,null);
			}
			document.getElementById(codeDestinataire).focus();
			//document.getElementById('ongletMarchandise').focus();
			return false;
		}		
		return true;		
	}

	/*author Chatbri Ali*/
	/******************************************************************/
	// fonction pour r�cuperer la situation initiale et la situation  //
	//  finale de la page saisie demande rectification manifeste //
	/******************************************************************/
	function initializeFieldsDemandeRectif(inputoutput){
		var form = document.forms[0];
		
		var tableInit = new Array();
		var elt; var j=0;
		
		form.TNUM_LIST_manifCodeLieuEmbarquement_OB.readOnly=true;

		for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			
			if(elt.type=='text' || elt.type=='select-one'){
				if(elt.type=='text'){
					tableInit[j]=elt.id+'~~'+elt.value;
				}else{
					var idx = elt.selectedIndex;
					tableInit[j]=elt.id+'~~'+elt[idx].value+'~~'+idx;
				}
				j++;
			}
		}
		if((form.etatDemandeRectif == null) || (form.etatDemandeRectif.value == '')){
			form.etatDemandeRectif.value = 'first';
		}
		//alert(form.etatDemandeRectif.value);
		if((inputoutput == '0')&&((form.etatDemandeRectif.value == 'first')||(form.etatDemandeRectif.value == 'FIRST'))){
			for (var i=0;i<tableInit.length;i++){
				if(i==0)
					form.initialValues.value = tableInit[i];
				else
					form.initialValues.value += '##'+tableInit[i];
			}
			form.etatDemandeRectif.value = 'last';
		}else{
			for (var i=0;i<tableInit.length;i++){
				if(i==0)
					form.inputValue.value = tableInit[i];
				else
					form.inputValue.value += '##'+tableInit[i];
			}		
		}
		//affectation du nbre de conteneur
		if(form.NUM_manifNbreConteneur_OB!=null){
			form.NUM_manifNbreConteneur_OBSafety.value=form.NUM_manifNbreConteneur_OB.value;
		}
	}
	
	/*author Chatbri Ali*/
	/****************************************************************/
	// fonction pour d�gager les diff�rences entre deux situation   //
	// de la page saisie demande rectification manifeste			//
	/***************************************************************/
	function compareFieldsDemandeRectif(){
		var form = document.forms[0];
		var typeManifeste = form.TNUM_manifTypeManifeste_OB.value;
		
		var newFileds;
		var initials; 
		
		if(typeManifeste=='2'||typeManifeste=='5'){
			newFileds = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifNbreConteneur2_OB','NUM_manifVolume2');
			initials= new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifNbreConteneur_OB','NUM_manifVolume');
		}else {
			if(typeManifeste=='3'||typeManifeste=='6'||typeManifeste=='7'){
				newFileds = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifVolume2');
				initials = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifVolume');

			}else {
				if(typeManifeste=='1'){
					newFileds = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifVolume2','NUM_manifNbreConteneur2_OB');
					initials = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifVolume','NUM_manifNbreConteneur_OB');

				}else {
					newFileds = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifVolume2');
					initials = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifVolume');
				}
			}
		}
				
		var initialsFields = form.initialValues.value.split('##');
		var inputedFields = form.inputValue.value.split('##');
		var initialField;
		var inputedField;
		var initialFieldList;
		var inputedFieldList;
		var initialFieldValue;
		var inputedFieldValue;
		var initialFieldName; 
		var newFieldName;
	
		for(var i=0;i<initialsFields.length;i++){
		
			initialFieldList = initialsFields[i].split('~~');
			inputedFieldList = inputedFields[i].split('~~');
			//initialFieldName = initialFieldList[0];
			initialFieldName = initials[0];
			initialFieldValue = initialFieldList[1];
			inputedFieldValue = inputedFieldList[1]; 
			newFieldName = newFileds[i];
			initialField = document.getElementById(initialFieldName);
			inputedField = document.getElementById(newFieldName);
			
			if(inputedField!=null){
				if(inputedField !=null && (inputedField.type == 'text' || inputedField.type == 'select-one')){
					inputedField.value = inputedFieldValue;
					initialField.value = initialFieldValue;
				}				
				if(initialFieldValue.toUpperCase() != inputedFieldValue.toUpperCase()){
					if(inputedField.type != null && (inputedField.type == 'text' || inputedField.type == 'select-one')){
						inputedField.style.fontWeight="bold";
						inputedField.style.color="red";
					}
				}
			}
		}	
	}
	
	/*********************************************************************************/
	/** fonction permettant de mettre en evidence les diff�rences entre les deux  **/
	/** tableaux de conteneurs de la page saisie demande rectification manifeste    **/
	/*********************************************************************************/
	function compareArraysConteneurDemandeRectif() {
	
		var arrayLignes = document.getElementById("ancienConteneurs").rows; 
		var longueur = arrayLignes.length; 
		var arrayLignes2 = document.getElementById("nouvConteneurs").rows; 
		var longueur2 = arrayLignes2.length;
		// parcourir les elements des deux tableaux
		for(var i=0, k=0; i<longueur, k<longueur; i++, k++) { 
			var arrayColonnes = arrayLignes[i].cells;//on récupère les cellules de la ligne du premier tableau
			var arrayColonnes2 = arrayLignes2[k].cells;//on récupère les cellules de la ligne du deuxème tableau
			var largeur = arrayColonnes.length; // nombre de colonnes
			for(var j=0, l=0; j<largeur, l<largeur; j++, l++) {
				// si les deux cases sont différentes mettre la case du 2eme tableau en rouge
				if( arrayColonnes[j].innerHTML != arrayColonnes2[l].innerHTML){
					   arrayColonnes2[l].style.color = "red"; 
					   arrayColonnes2[l].style.fontWeight = "bold"; 
				}
			}  
		 } 
		// si le deuxième tableau est plus grand que le premier
		// changer la couleur de toute les lignes ajoutées an rouge
		 if(k<longueur2){
			 for(k=longueur; k<longueur2; k++){
				arrayColonnes2 = arrayLignes2[k].cells; 
				largeur = arrayColonnes2.length; // nombre de colonnes
				for(var j=0; j<largeur; j++) {
					arrayColonnes2[j].style.color = "red"; 
					arrayColonnes2[j].style.fontWeight = "bold";
				}
			}
		}
	}
	/***********************************************************************
	Auteur			: Cyril NIANG
	Description 	: Fonction permettant de comparer l'ancien et le nouvel �tat
				d'une demande de rectification
	Param�tres		: aucun
	Utilis�e dans	: manifDemandeRectifConsultation.jsp
	************************************************************************/
	function compareFieldsDemandeRectifConsultation(){
		var form = document.forms[0];
		var typeManifeste = form.TNUM_manifTypeManifeste_OB.value;
		
		var oldFields;
		var newFields;
		
		if(typeManifeste=='2'||typeManifeste=='5'){
			oldFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifNbreConteneur_OB','NUM_manifVolume');
			newFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifNbreConteneur2_OB','NUM_manifVolume2');
		}else{
			if(typeManifeste=='3'||typeManifeste=='6'||typeManifeste=='7'){
				oldFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifVolume');
				newFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifVolume2');
			}else{
				if(typeManifeste=='1'){
					oldFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifNbreConteneur_OB','NUM_manifVolume');
					newFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifNbreConteneur2_OB','NUM_manifVolume2');
				}else{
					oldFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement_OB','DAT_manifDateEmbarquement_OB','TNUM_LIST_manifCodePaysDestination_OB','TNUM_manifVilleDefinitive_OB','TNUM_manifNomExpediteur_OB','TNUM_manifNumTitreTransportArticle','TNUM_manifNomDestinataire','TNUM_LIST_manifCodePPM_Dest','TNUM_manifTypeVoieDestinataire','TNUM_manifNomVoieDestinataire','TNUM_manifQuartierDestinataire','TNUM_manifBpDestinataire','TNUM_manifNumVoieDestinataire','TXT_manifVilleDestinataire','TNUM_manifNumNineaDestinataire','TNUM_LIST_manifCodePPM_OB','TXT_manifNomAOrdreDe','TNUM_manifAdresseAOrdreDe','TNUM_manifMarqueColis_OB','TNUM_manifDesigCommerciale_OB','NUM_manifNbreColis_OB','TXT_LIST_manifModeConditionnement_OB','NUM_manifPoidsBrut_OB','NUM_manifVolume');
					newFields = new Array('TNUM_LIST_manifCodeLieuEmbarquement2_OB','DAT_manifDateEmbarquement2_OB','TNUM_LIST_manifCodePaysDestination2_OB','TNUM_manifVilleDefinitive2_OB','TNUM_manifNomExpediteur2','TNUM_manifNumTitreTransportArticle2','TNUM_manifNomDestinataire2','TNUM_LIST_manifCodePPM_Dest2','TNUM_manifTypeVoieDestinataire2','TNUM_manifNomVoieDestinataire2','TNUM_manifQuartierDestinataire2','TNUM_manifBpDestinataire2','TNUM_manifNumVoieDestinataire2','TXT_manifVilleDestinataire2','TNUM_manifNumNineaDestinataire2','TNUM_LIST_manifCodePPM2_OB','TXT_manifNomAOrdreDe2','TNUM_manifAdresseAOrdreDe2','TNUM_manifMarqueColis2_OB','TNUM_manifDesigCommerciale2_OB','NUM_manifNbreColis2_OB','TXT_LIST_manifModeConditionnement2_OB','NUM_manifPoidsBrut2_OB','NUM_manifVolume2');
				}
			}
		}
		var oldField;
		var newField;
		var oldFieldName; 
		var newFieldName;
		var oldFieldValue; 
		var newFieldValue;
		
		for(var i=0;i<oldFields.length;i++){
			
			oldFieldName = oldFields[i];
			newFieldName = newFields[i];
			oldField = document.getElementById(oldFieldName);
			newField = document.getElementById(newFieldName);
			if(newField != null && oldField != null){		
				oldFieldValue = oldField.value;
				newFieldValue = newField.value;
				if(newFieldValue.toUpperCase() != oldFieldValue.toUpperCase()){
					if(newField.type == 'text' || newField.type == 'select-one'){
						newField.style.fontWeight="bold";
						newField.style.color="red";
					}
				}
			}
		}	
	}
	
	// on stand by
	function manageFieldPpmDest(){
		var form = document.forms.item(0);
		var ppmValue = form.TNUM_LIST_manifCodePPM_Dest.value;
		if(ppmValue!='')
			form.TNUM_manifNomDestinataire.readOnly=true;
		else
			form.TNUM_manifNomDestinataire.readOnly=false;
			
			
	}
	
	/************ partie sommier a reporter dans le fichier declaration.js **************
	************* @author : Chatbri Ali .@version : 1.0.0 @param :         **************/
	function enableDisableButtonTransfertSommier(aRadio) {
		if (aRadio != null) {
			document.forms.item(0).transfertButton.disabled = '';
			document.forms.item(0).viewHistSommierButton.disabled = '';
			
		} else {
			if (document.forms.item(0).transfertButton)
					document.forms.item(0).transfertButton.disabled = 'true';		
			if (document.forms.item(0).viewHistSommierButton)
					document.forms.item(0).viewHistSommierButton.disabled = 'true';
		}	
	}
	
	/* ||-- @author : Chatbri Ali @version : 1.0.0 @param :un object check box --||
	**************** cession du sommier  contr�le le bouton de validation *********/
	function enableCessionSommierButton(aCheckbox) {
		var form = document.forms[0]; 
		
		if (aCheckbox != null) {
			if (aCheckbox.checked) {
				nbsommiercoche++; 
			}else {
				nbsommiercoche--;
			}
			if (nbsommiercoche < 0) nbsommiercoche=0;
			if (nbsommiercoche != 0) {
				form.cessionSommierbutton.disabled = '';
			}else {
				form.cessionSommierbutton.disabled = 'true';
			}
		}
		else {
			
			form.enregistrementPartielManifeste.disabled = 'true';
		}
	}
	/* ||-- @author : Chatbri Ali @version : 1.0.0 @param :un form, un tableau de noms des champs text
	    				a inhiber la valeur disable(true,false) puis la couleur si inhiber --|| 
	    --- fonction qui met un ensemble des champ en mode read only -- utilser ds la cas d'envoie fractionee ---*/
	function disableEnableFields(form,tabFields,disable,bgrdcolor){

		var field;
		if(tabFields!=null)
		for( i = 0;i<tabFields.length;i++){
			field=document.getElementById(tabFields[i]);
			if(field!=null){
				field.readOnly=disable;
				if(bgrdcolor==null)
					if(disable==true)
						field.style.background='#ededed';
					else{
						field.style.background='#ffffff';
						field.value = "";
					}
				else
					field.style.background=bgrdcolor;
			}
		}
		
	}
	/* ||-- @author : Chatbri Ali @version : 1.0.0 @param :un form, un tableau de noms des check box text
	    				a inhiber la valeur disable(true,false) puis la couleur si inhiber --|| 
	    --- fonction qui met un ensemble des champ en mode read only -- utilser ds la cas d'envoie fractionee ---*/
	function disableEnableListBox(form,tabFields,disable,bgrdcolor){
		var field;
		for( i = 0;i<tabFields.length;i++){
			field=document.getElementsByName(tabFields[i])[0];
			if(field!=null){
				field.disabled=disable;
				if(bgrdcolor==null)
					if(disable==true)
						field.style.background='#ededed';
					else {
						field.style.background='#ffffff';
						field.value = "";
					}
						
			}
		}
	}
/*************  Cette fonction permet de v�rifier si au moins************************/
/*************  un crit�re de recherche est saisi  ******************************/

function isCritereNullOrEmpty(){
	var form = document.forms.item(0);
		
		var elt; var j=0;
		
		//alert(compareTwoDate(form.DAT_manifDateDebut.value,form.DAT_manifDateFin.value));
		if(form.DAT_manifDateDebut.value!=''&&form.DAT_manifDateFin.value==''){
		alert('Veuillez saisir la Date de Fin');
		return false;
		}
		else if (form.DAT_manifDateFin.value!=''&&form.DAT_manifDateDebut.value==''){
		alert('Veuillez saisir la Date de D�but');
		return false;
		}
		/*for (var i=0; i<form.length; i++){
			elt = form.elements[i];
			if(elt.type=='text'||elt.type=='select-one'){
			if(elt.value!=''){j++;}
			}else if(elt.type=="checkbox"){
			if(elt.checked==true){j++;}
			}
		}*/
		if(form.NUM_manifAnnee.value!=''&&form.TNUM_manifCodeBur&&form.TNUM_manifCodeBur.value!=''&&form.NUM_manifNumSeq&&form.NUM_manifNumSeq.value!='' ||
		form.NUM_manifAnnee.value!=''&&form.TNUM_manifCodeBur&&form.TNUM_manifCodeBur.value!=''&&form.DAT_manifDateEnreg.value!='' || form.NUM_manifAnnee.value!=''&&form.TNUM_manifCodeBur&&form.TNUM_manifCodeBur.value!=''&&form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' ||
		form.NUM_manifAnnee.value!=''&&form.TNUM_manifCodeBur&&form.TNUM_manifCodeBur.value!='' && form.TNUM_LIST_manifLieuEmbarq.value!=''&&form.DAT_manifDateEnreg.value!='' || form.NUM_manifAnnee.value!=''&&form.TNUM_manifCodeBur&&form.TNUM_manifCodeBur.value!=''&&form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' && form.TNUM_LIST_manifLieuEmbarq.value!=''  ||
		form.TNUM_manifTitreTransp.value!='' && form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' || form.TNUM_manifTitreTransp.value!='' && form.DAT_manifDateEnreg.value!=''||
		
		form.NUM_manifAnnee.value!=''&&!form.TNUM_manifCodeBur&&form.DAT_manifDateEnreg.value!='' || form.NUM_manifAnnee.value!=''&&!form.TNUM_manifCodeBur&&form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' ||
		form.NUM_manifAnnee.value!=''&&!form.TNUM_manifCodeBur&& form.TNUM_LIST_manifLieuEmbarq.value!=''&&form.DAT_manifDateEnreg.value!='' || form.NUM_manifAnnee.value!=''&&!form.TNUM_manifCodeBur&&form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' && form.TNUM_LIST_manifLieuEmbarq.value!=''  ||
		form.TNUM_manifTitreTransp.value!='' && form.DAT_manifDateDebut.value!='' &&form.DAT_manifDateFin.value!='' || form.TNUM_manifTitreTransp.value!='' && form.DAT_manifDateEnreg.value!=''
		
		)
		j=1;
				
		if(j==0){
		if(form.TNUM_manifCodeBur&&form.NUM_manifNumSeq)
		alert('Veuillez saisir au moins un crit�re de recherche (Ann�e + Bureau manifeste+num�ro manifeste) ou (Ann�e + Bureau manifeste+Date enregistrement ou p�riode) ou (Ann�e + Bureau manifeste+Lieu enbarquement +Date enregistrement ou p�riode) ou (Titre de transport +Date enregistrement ou p�riode)');
		else
		if(form.TNUM_manifCodeBur&& !form.NUM_manifNumSeq)
		alert('Veuillez saisir au moins un crit�re de recherche (Ann�e + Bureau manifeste) ou (Ann�e + Bureau manifeste+Date enregistrement ou p�riode) ou (Ann�e + Bureau manifeste+Lieu enbarquement +Date enregistrement ou p�riode) ou (Titre de transport +Date enregistrement ou p�riode)');
		else
		alert('Veuillez saisir au moins un crit�re de recherche (Ann�e + Date enregistrement ou p�riode) ou (Ann�e + Lieu enbarquement +Date enregistrement ou p�riode) ou (Titre de transport +Date enregistrement ou p�riode)');
		return false;
		}else{
		return true;
		}
}

function compareTwoDate(date_1, date_2){
alert('date_1 = '+date_1+'date_2 = '+date_2);
	    diff = date_1.getTime()-date_2.getTime();
	    return (diff==0?diff:diff/Math.abs(diff));
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

function enableEnregLieuEmb(){
	var form = document.forms[0];
	form.enreglieuemb.disabled=true;
	if(form.codelieuemb.value!=""){
		form.enreglieuemb.disabled=false;
	}
}

function doSubmitSelectedArticleLieuEmb() {
	if (confirm("\t\t\t\tATTENTION : \nEn enregistrant un manifeste, vous cr�ez un acte juridique faisant foi jusqu'� inscription de faux. \n\rIl appartient au consignataire de v�rifier qu'il n'effectue pas plusieurs fois l'enregistrement du m�me titre de transport.")) {
		doSubmitWithaoutValidate2('enregistrementPartielAction', 'enregManifestePartiel', 'ok');
	}
}