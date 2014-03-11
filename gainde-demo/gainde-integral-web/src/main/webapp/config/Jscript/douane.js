//*******************************************************//
//*******************************************************//
// Fichier		: douane.js								 //
// Description	: Fichier Javascript du module DOUANE	 //
// Auteur		: MOUHAMAD KAMARA CFAO TECHNOLOGIES 2006 //
//*******************************************************//
//*******************************************************//

/***********************************************************************	
	Fonction		: variables globales pour la gestion des messages 
					  d'alerte et des constantes utilis�es dans le script
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: Permet de centraliser tous les messages d'alerte
					  et les constantes qui seront utilis�s 
					  et �ventuellement r�utilis�s
	Param�tres 		: 
	Utilis�e dans	: douane.js
************************************************************************/
var FONCTION_NON_DISPONIBLE = "CETTE FONCTION N'EST PAS DISPONIBLE POUR LE MOMENT !!!";
var IMPLEMENTEE_DANS_LE_MODULE = "CETTE FONCTIONNALITE EST IMPLEMENTEE DANS LE MODULE : ";
var BUREAU_MANIFESTE_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE BUREAU DU MANIFESTE.";
var BUREAU_DECLARATION_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE BUREAU DE LA D�CLARATION.";
var LIEU_DEPOT_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE LIEU DE DEPOT.";
var ANNEE_MANIFESTE_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER L'ANNEE DU MANIFESTE.";
var NUMERO_ENREGISTREMENT_MANIFESTE_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE NUMERO D'ENREGISTREMENT DU MANIFESTE.";
var LTA_MANIFESTE_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LA LTA DU MANIFESTE.";
var LIEU_EMBARQUEMENT_MANIFESTE_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE LIEU D'EMBARQUEMENT DU MANIFESTE.";
var POIDS_SUPERIEUR_AU_DISPONIBLE = "LE POIDS EST SUP�RIEUR AU DISPONIBLE.";
var POIDS_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE POIDS A DETRUIRE.";
var NOMBRE_COLIS_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE NOMBRE DE COLIS A DETRUIRE.";
var NOMBRE_COLIS_SUPERIEUR_AU_DISPONIBLE = "LE NOMBRE DE COLIS EST SUP�RIEUR AU DISPONIBLE.";
var DATE_ECOR_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LA DATE DE L'ECOR.";
var CODE_AGENT_ECOREUR_UN_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE PREMIER AGENT ECOREUR.";
var CODE_AGENT_ECOREUR_DEUX_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE SECOND AGENT ECOREUR.";
var ANNEE_PROCES_VERBAL_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER L'ANNEE DU PROCES VERBAL.";
var NUMERO_PROCES_VERBAL_OBLIGATOIRE = "VOUS DEVEZ RENSEIGNER LE NUMERO DU PROCES VERBAL.";
var NOMBRE_DE_COLIS_CONSTATE_OBLIGATOIRE = "NOMBRE DE COLIS CONSTAT� OBLIGATOIRE.";
var POIDS_CONSTATE_OBLIGATOIRE = "POIDS CONSTAT� OBLIGATOIRE.";
var NOMBRE_DE_CONTENEUR_CONSTATE_OBLIGATOIRE = "NOMBRE DE CONTENEUR CONSTAT� OBLIGATOIRE.";
var	REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE = "VOUS DEVEZ REMPLIR LE REGIME FISCAL DEFINITIF D'ABORD.";//"VOUS DEVEZ REMPLIR TOUTES LES RUBRIQUES D'ABORD.";
var	REGULARISATIONEXOEFFECTIVE = "LE REGIME FISCAL DEFINITIF DOIT ETRE DIFFERENT DU REGIME ACTUEL.";
var OUI_MAJ = "OUI";
var OUI_MIN = "oui";
var DOUBLE_DIEZ = "##";
var DOUBLE_TIELD = "~~";
var COULEUR_ERREUR = "#FFFF80";

/***********************************************************************	
	Fonction		: notYetImplemented
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: 
	Param�tres 		: aucun
	Utilis�e dans	: 
************************************************************************/
function notYetImplemented() {
	alert(FONCTION_NON_DISPONIBLE);
}

/***********************************************************************	
	Fonction		: implementedInModule
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: 
	Param�tres 		: le nom du module
	Utilis�e dans	: 
************************************************************************/
function implementedInModule(nomModule) {
	alert(IMPLEMENTEE_DANS_LE_MODULE+nomModule);
}

/***********************************************************************	
	Fonction		: enableButton
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: active un bouton
	Param�tres 		: le bouton a activer
	Utilis�e dans	: 
************************************************************************/
function enableButton(aButton) {
	// bouton 
	if (aButton)
		aButton.disabled = '';		
}

/***********************************************************************	
	Fonction		: disableButton
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: d�sactive un bouton
	Param�tres 		: le bouton a d�sactiver
	Utilis�e dans	: 
************************************************************************/
function disableButton(aButton) {
	// bouton 
	if (aButton)
		aButton.disabled = 'true';		
}

/***********************************************************************	
	Fonction		: splitPkDemandeDeDestruction
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
	Fonction		: splitPkDemandeDeDestruction
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: split un PK suivant un pattern et renvoi le 
					  r�sultat sous forme de tableau 
	Param�tres 		: un PK avec pour derni�re colonne la valeur 
					  sp�cifiant s'il y a apurement comptable
	Utilis�e dans	: 
************************************************************************/
function compare2PkValues(pkOne, pkTwo) {
	if ((pkOne) && (pkTwo)) {
		// les pk doivent avoir la m�me taille
		for (var i=0; i<pkOne.length; i++) {
			if (pkOne[i] != pkTwo[i]) return false;
		}
		return true;			
	}
}

/***********************************************************************	
	Fonction		: checkWhiteSpace
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: v�rifie si le champ est rempli avec des blancs
	Param�tres 		: le champ a tester
	Utilis�e dans	: 
************************************************************************/
function checkWhiteSpace(input) {	
	var whiteSpace = input.value.replace(/\s/g, "");
	if (whiteSpace.length <= 0) {		
		// il y a des blancs
		return true;
	}
	return false;
}

/***********************************************************************	
	Fonction		: setFieldObligatoire
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: affiche un message, donne le focus et marque un 
					  champ d'une couleur pour montrer son caract�re 
					  obligatoire
	Param�tres 		: aFieldName le nom du champ obligatoire, message le 
					  message � afficher
	Utilis�e dans	: 
************************************************************************/
function setFieldObligatoire(aFieldName, message) {	
	alert(message);
	document.getElementById(aFieldName).focus();
	document.getElementById(aFieldName).style.background = COULEUR_ERREUR;
}

/***********************************************************************	
	Fonction		: checkZoneObligatoire
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: v�rifie le caract�re obligatorie d'une zone du 
					  formulaire
	Param�tres 		: nomZone le nom de la zone dans le formulaire, 
					  message le message � afficher au cas ou la zone 
					  n'est pas renseign�e
	Utilis�e dans	: 
************************************************************************/
function checkZoneObligatoire(nomZone, message) {	
	if ((document.getElementById(nomZone)) && (checkWhiteSpace(document.getElementById(nomZone)))) {
		setFieldObligatoire(nomZone, message);
		return false;
	}
	return true;
}

/***********************************************************************	
	Fonction		: yaTilApurementComptable
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: split un PK pour determiner si la demande fait 
					  l'objet d'un apurement comptable ou pas 
	Param�tres 		: un PK avec pour derni�re colonne la valeur 
					  sp�cifiant s'il y a apurement comptable
	Utilis�e dans	: 
************************************************************************/
function yaTilApurementComptable(aPK, aForm) {
	var hidden;
	var hiddens;
	var hide;
	var pk;
	
	//
	//alert(aPK);
	//alert(aForm.hiddenpk.value);	
	//
	if (aForm.hiddenpk) {
		hidden = aForm.hiddenpk.value;
	}
	if (aPK) {
		// r�cup�ration et split du PK
		pk = splitPkWithPattern(aPK, DOUBLE_TIELD);
	}
	if (hidden) {
		//
		//alert("hidden = "+hidden);
		// r�cup�ration et split du hidden
		// ex de hidden 2006~~12Y~~5002~~1~~0~~0~~NON~~5555##2006~~10S~~5002~~1~~0~~0~~NON~~5555
		hiddens = splitPkWithPattern(hidden, DOUBLE_DIEZ);
		if (hiddens) {
			// pour chaque hidden on fait une comparaison
			for (var i=0; i<hiddens.length; i++) {
				//
				//alert("hiddens[i] = "+hiddens[i]);
				//
				hide = splitPkWithPattern(hiddens[i], DOUBLE_TIELD);
				//
				//alert("PK = "+pk);
				//alert("HIDE = "+hide);
				//
				if (compare2PkValues(pk, hide)) {
					//
					// alert("hide[6] = "+hide[6]);
					//
					if ((hide[6] == OUI_MAJ) || (hide[6] == OUI_MIN)) {
						// il ya apurement comptable
						return true;
					} else {
						// il n'ya pas d'apurement comptable
						return false;
					}
				}
			}		
		}
	}
	return false;
}

/***********************************************************************	
	Fonction		: getNumeroMessageDemande
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: split un PK pour r�cup�rer un num�ro 
					  (message ou depot)
	Param�tres 		: un PK avec pour derni�re colonne la valeur 
					  sp�cifiant s'il y a apurement comptable
	Utilis�e dans	: 
************************************************************************/
function getNumeroDemande(aPK, aForm) {
	var hidden;
	var hiddens;
	var hide;
	var pk;
	
	if (aForm.hiddenpk) {
		hidden = aForm.hiddenpk.value;
	}
	// alert(hidden);
	if (aPK) {
		// r�cup�ration et split du PK
		pk = splitPkWithPattern(aPK, DOUBLE_TIELD);
	}
	// alert(pk);
	if (hidden) {
		// r�cup�ration et split du hidden
		// ex de hidden 2006~~12Y~~5002~~1~~0~~0~~NON~~5555##2006~~10S~~5002~~1~~0~~0~~NON~~5555
		hiddens = splitPkWithPattern(hidden, DOUBLE_DIEZ);
		if (hiddens) {
			// pour chaque hidden on fait une comparaison
			for (var i=0; i<hiddens.length; i++) {
				hide = splitPkWithPattern(hiddens[i], DOUBLE_TIELD);
				// alert(hide);
				if (compare2PkValues(pk, hide)) {
					// si on trouve le bon pk on r�cup�re le num�ro message correspondant
					// correspond toujours au dernier �l�ment du tableau
					return hide[hide.length - 1];
				}
			}		
		}
	}
	return false;
}

/***********************************************************************	
	Fonction		: enableDisableActionButton
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: active ou d�sactive les boutons au niveau de la
					  page de recherche des demandes sur le manifeste
	Param�tres 		: un objet radio option
	Utilis�e dans	: 
************************************************************************/
function enableDisableActionButton(aRadio) {
	var form = document.forms[0];
	var pkdmdrecond = null;
	
	// R�cup�ration du pk pour la demande
	// de reconditionnement au niveau du manifeste
	//if (form.hiddenpk) {
	//	if (aRadio != null) {
	//		form.hiddenpk.value = aRadio.value;
	//		pkdmdrecond = splitPkWithPattern(form.hiddenpk.value, DOUBLE_TIELD);
	//	}
	//}	
	if (aRadio != null) {
		//alert(aRadio.value);
		if (aRadio.value) {		
			//
			//alert(form.name);
			//alert(form.hiddenpk.value);			
			// (y a t il apurement comptable ou pas 
			if (yaTilApurementComptable(aRadio.value, form)) {
				// bouton apurement physique
				if (form.apurementPhysique)
						enableButton(form.apurementPhysique);		
				// bouton apurement comptable
				if (form.apurementComptable)
						disableButton(form.apurementComptable);		
			} else {
				// bouton apurement physique
				if (form.apurementPhysique)
						disableButton(form.apurementPhysique);		
				// bouton apurement comptable
				if (form.apurementComptable)
						enableButton(form.apurementComptable);		
			}
			// bouton accepter demande
			if (form.accepter)
					enableButton(form.accepter);		
			// bouton consultation message
			if (form.consulterMessage)
					enableButton(form.consulterMessage);		
			// bouton rejetter
			if (form.rejetter)
					enableButton(form.rejetter);		
			// bouton consulter declaration
			if (form.consulterDeclaration)
					enableButton(form.consulterDeclaration);		
			// bouton saisie des quantites ecorees
			if (form.saisirQuantitesEcorees)
					enableButton(form.saisirQuantitesEcorees);		
			// bouton consulter segment g�n�ral
			if (form.consulterSegmentGeneral)
					enableButton(form.consulterSegmentGeneral);		
			// bouton consulter article
			if (form.consulterArticle)
					enableButton(form.consulterArticle);	
			// bouton consulter ancien etat et nouvel etat
			if (form.ancienEtatNouvelEtat)
					enableButton(form.ancienEtatNouvelEtat);	
			// bouton valider Confirmation
			if (form.validerConfirmation)
					enableButton(form.validerConfirmation);	
			//				
			if ((document.getElementById("TNUM_ManifCodeLieuStockage")) && (checkWhiteSpace(document.getElementById("TNUM_ManifCodeLieuStockage")))) {
				//disableButton(form.miseEnDepot);
				//
				//disableButton(form.rejetter);
				//
				enableButton(form.miseEnDepot);
				//
				setFieldObligatoire("TNUM_ManifCodeLieuStockage", LIEU_DEPOT_OBLIGATOIRE);				
			} else {
				// bouton mise en depot
				if (form.miseEnDepot)
						enableButton(form.miseEnDepot);
			}
			// bouton consulter valider
			if (form.consulterValider)
					enableButton(form.consulterValider);
			// bouton main lev�e 
			if (form.mainLevee)
					enableButton(form.mainLevee);
			// bouton main lev�e depuis d�claration
			if (form.mainLeveeDepuisDeclaration)
					enableButton(form.mainLeveeDepuisDeclaration);
			// bouton bae DEP / DES
			if (form.bae)
					enableButton(form.bae);
			// bouton cotation DEP / DES
			if (form.cotation)
					enableButton(form.cotation);
			// bouton regulariser DEP / DES
			if (form.regulariser)
					enableButton(form.regulariser);
			// bouton modifierSelectionCotation
			if (form.modifierSelectionCotation)
					enableButton(form.modifierSelectionCotation);
			// bouton consultationChaine
			if (form.consultationChaine)
					enableButton(form.consultationChaine);
			// bouton suppressionChaine
			if (form.suppressionChaine)
					enableButton(form.suppressionChaine);
			// bouton modifier
			if (form.modifier)
					enableButton(form.modifier);
			// bouton supprimer
			if (form.supprimer)
					enableButton(form.supprimer);
			// bouton envoyer
			if (form.envoyer)
					enableButton(form.envoyer);
			// 2006~~10S~~2~~2~~0~~0~~null~~null
			//if (pkdmdrecond != null) {
			//	if ((pkdmdrecond[6] != 'null') && (pkdmdrecond[7] != 'null')) {
			//		// bouton modifier
			//		if (form.modifier)
			//				enableButton(form.modifier);
			//		// bouton supprimer
			//		if (form.supprimer)
			//				enableButton(form.supprimer);
			//		// bouton envoyer
			//		if (form.envoyer)
			//				enableButton(form.envoyer);
			//	}
			//}
			// r�cup�ration du num�ro
			if (form.hiddennum) 
				form.hiddennum.value = getNumeroDemande(aRadio.value, form);
			//alert(form.hiddennum.value);
		}		
	} else {
		// bouton apurement physique
		if (form.apurementPhysique)
				disableButton(form.apurementPhysique);		
		// bouton apurement comptable
		if (form.apurementComptable)
				disableButton(form.apurementComptable);		
		// bouton accepter demande
		if (form.accepter)
				disableButton(form.accepter);		
		// bouton consultation message
		if (form.consulterMessage)
				disableButton(form.consulterMessage);		
		// bouton rejetter
		if (form.rejetter)
				disableButton(form.rejetter);		
		// bouton consulter declaration
		if (form.consulterDeclaration)
				disableButton(form.consulterDeclaration);		
		// bouton saisie des quantites ecorees
		if (form.saisirQuantitesEcorees)
				disableButton(form.saisirQuantitesEcorees);		
		// bouton consulter segment g�n�ral
		if (form.consulterSegmentGeneral)
				disableButton(form.consulterSegmentGeneral);		
		// bouton consulter article
		if (form.consulterArticle)
				disableButton(form.consulterArticle);						
		// bouton consulter ancien etat et nouvel etat
		if (form.ancienEtatNouvelEtat)
				disableButton(form.ancienEtatNouvelEtat);	
		// bouton valider Confirmation
		if (form.validerConfirmation)
				disableButton(form.validerConfirmation);	
		// bouton mise en depot
		if (form.miseEnDepot)
				disableButton(form.miseEnDepot);
		// bouton consulter valider
		if (form.consulterValider)
				disableButton(form.consulterValider);
		// bouton main lev�e 
		if (form.mainLevee)
				disableButton(form.mainLevee);						
		// bouton bae DEP / DES
		if (form.bae)
				disableButton(form.bae);
		// bouton cotation DEP / DES
		if (form.cotation)
				disableButton(form.cotation);
		// bouton regulariser DEP / DES
		if (form.regulariser)
				disableButton(form.regulariser);
		// bouton modifierSelectionCotation
		if (form.modifierSelectionCotation)
				disableButton(form.modifierSelectionCotation);
		// bouton consultationChaine
		if (form.consultationChaine)
				disableButton(form.consultationChaine);
		// bouton suppressionChaine
		if (form.suppressionChaine)
				disableButton(form.suppressionChaine);
		// bouton modifier
		if (form.modifier)
				disableButton(form.modifier);
		// bouton supprimer
		if (form.supprimer)
				disableButton(form.supprimer);
		// bouton envoyer
		if (form.envoyer)
				disableButton(form.envoyer);
		// 2006~~10S~~2~~2~~0~~0~~null~~null
		if (pkdmdrecond != null) {
			if ((pkdmdrecond[6] == 'null') && (pkdmdrecond[7] == 'null')) {
				// bouton modifier
				if (form.modifier)
						disableButton(form.modifier);
				// bouton supprimer
				if (form.supprimer)
						disableButton(form.supprimer);
				// bouton envoyer
				if (form.envoyer)
						disableButton(form.envoyer);
			}
		}
		// bouton main lev�e depuis d�claration
		if (form.mainLeveeDepuisDeclaration)
				disableButton(form.mainLeveeDepuisDeclaration);						
	}	
}

/***********************************************************************	
	Fonction		: checkCriteresRechercheDemande
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: v�rifie que au moins un crit�re est saisie 
					  pour la recherche de demande 
	Param�tres 		: aucun
	Utilis�e dans	: 
************************************************************************/
function checkCriteresRechercheDemande() {
	if (!checkZoneObligatoire("TNUM_manifBurEnregManif", BUREAU_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("TNUM_manifBurEnregDec", BUREAU_DECLARATION_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("bureau", BUREAU_DECLARATION_OBLIGATOIRE)) 
		return false;
	
	/*
	if (!checkZoneObligatoire("TNUM_manifAnneeEnregManif", ANNEE_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("NUM_manifNumEnregManif", NUMERO_ENREGISTREMENT_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("TNUM_ManifNumTitreTrans", LTA_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("TNUM_ManifLieuEmb", LIEU_EMBARQUEMENT_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("TNUM_ManifCodeLieuStockage", LIEU_DEPOT_OBLIGATOIRE)) 
		return false;
	*/
	return true;
}

/***********************************************************************	
	Fonction		: validerApurementPhysique
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: lance une action de recherche sur les demandes de
					  manifeste
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function validerApurementPhysique(reqCode, page) {	
	var form = document.forms[0];
	var nombreColisDetruit = 0;
	var poidsDetruit = 0;
	var nombreColisResult = 0;
	var poidsResult = 0;
	var nombreColisEcore = 0;
	var poidsEcore = 0;	
	var isValid = true;
	
	// v�rification que les zones ne soient pas vident
	if (checkWhiteSpace(document.getElementById("NUM_nbrecolisdetruits"))) {
		setFieldObligatoire("NUM_nbrecolisdetruits", NOMBRE_COLIS_OBLIGATOIRE);
		isValid = false;
	} else {
		if (checkWhiteSpace(document.getElementById("NUM_poidsdetruit"))) {
			setFieldObligatoire("NUM_poidsdetruit", POIDS_OBLIGATOIRE);
			isValid = false;
		}
	}
	// r�cup�ration du nombre de colis et poids saisie
	if (document.getElementById("NUM_nbrecolisdetruits")) {
		nombreColisDetruit = document.getElementById("NUM_nbrecolisdetruits").value;
	} 
	if (document.getElementById("NUM_poidsdetruit")) {
		poidsDetruit = document.getElementById("NUM_poidsdetruit").value;
	}
	// r�cup�ration du nombre de colis ecore et du poids ecore
	if (form.hiddenNombreColisEcore) {
		nombreColisEcore = parseInt(form.hiddenNombreColisEcore.value);
	}
	if (form.hiddenPoidsEcore) {
		poidsEcore = parseFloat(form.hiddenPoidsEcore.value);
	}
	// r�cup�ration du nombre de colis declare, du nombre de colis � d�truire
	// et du poids declare et du poids � d�truire
	if (form.hiddenNombreColisEcore) {
		
		nombreColisResult = parseInt(form.hiddenNombreColisEcore.value) - parseInt(nombreColisDetruit);
	}
	if (form.hiddenPoidsEcore) {
	
		poidsResult = parseFloat(form.hiddenPoidsEcore.value)  - parseFloat(poidsDetruit);
	}
	// v�rification du poids et nombre de colis			
	if ((isValid) && (poidsResult < 0)) {
		alert(POIDS_SUPERIEUR_AU_DISPONIBLE);
		isValid = false;
	} else if ((isValid) && (nombreColisResult < 0)) {
		alert(NOMBRE_COLIS_SUPERIEUR_AU_DISPONIBLE);
		isValid = false;
	}
	if (isValid) {
		doSubmitWithaoutValidate(reqCode, page);
	}
}

/***********************************************************************	
	Fonction		: validerIdentificationEcor
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: valide les informations d'identification ecor
					  et 
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function validerIdentificationEcor(reqCode, page) {
	if (!checkZoneObligatoire("TNUM_manifAnneeEnregManif", ANNEE_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("TNUM_manifBurEnregManif", BUREAU_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("NUM_manifNumEnregManif", NUMERO_ENREGISTREMENT_MANIFESTE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("DAT_dateEcor", DATE_ECOR_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("codeagentecoreurun", CODE_AGENT_ECOREUR_UN_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("codeagentecoreurdeux", CODE_AGENT_ECOREUR_DEUX_OBLIGATOIRE)) 
		return false;

	if (!checkZoneObligatoire("anneepvecor", ANNEE_PROCES_VERBAL_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("numeropvecor", NUMERO_PROCES_VERBAL_OBLIGATOIRE)) 
		return false;
	
	doSubmitWithaoutValidate(reqCode, page);
	return true;
}

/***********************************************************************	
	Fonction		: validerSaisieQuantiteEcoree
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: valide la saisie des quantit�s �cor�es et passe 
					  � l'�cran de saisie/modification des conteneurs
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function validerSaisieQuantiteEcoree(reqCode, page) {		
	if (!checkZoneObligatoire("codeagentecoreurun", CODE_AGENT_ECOREUR_UN_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("codeagentecoreurdeux", CODE_AGENT_ECOREUR_DEUX_OBLIGATOIRE)) 
		return false;
		
	if (!checkZoneObligatoire("NUM_NombreColisConstate", NOMBRE_DE_COLIS_CONSTATE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("NUM_PoidsConstate", POIDS_CONSTATE_OBLIGATOIRE)) 
		return false;
	
	if (!checkZoneObligatoire("NUM_NombreConteneurConstate", NOMBRE_DE_CONTENEUR_CONSTATE_OBLIGATOIRE)) 
		return false;
	
	doSubmitWithaoutValidate(reqCode, page);
	return true;
}

/***********************************************************************	
	Fonction		: rechercherDemandeSurManifeste
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: lance une action de recherche sur les demandes de
					  manifeste
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function rechercherDemandeSurManifeste(reqCode, page) {	
	if (checkCriteresRechercheDemande()) 
		doSubmitWithaoutValidate(reqCode, page);
}

/***********************************************************************	
	Fonction		: rechercherDemandeSurDeclaration
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: lance une action de recherche sur les demandes de
					  d�claration
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function rechercherDemandeSurDeclaration(reqCode, page) {	
	if (checkCriteresRechercheDemande()) 
		doSubmitWithaoutValidate(reqCode, page);
}

/***********************************************************************	
	Fonction		: rechercherDep
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: lance une action de recherche sur les dep/des
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function rechercherDep(reqCode, page) {
    if(document.getElementById('NUM_depAnneeDecl_Rech').value==''){
       alert('Remplir l\'ann�e pour affiner la recherche');
       document.getElementById('NUM_depAnneeDecl_Rech').focus();
       }else
 		doSubmitWithaoutValidate(reqCode, page);
}

/***********************************************************************	
	Fonction		: regularisationExoEffective
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: effectue la regularisation des titres exos
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function regularisationExoEffective(reqCode, page) {
	if (!checkZoneObligatoire("TNUM_LIST_regimefiscaldefinitif", REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE)) 
		return false;
	/*if (!checkZoneObligatoire("anneeexo", REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE)) 
		return false;
	if (!checkZoneObligatoire("brepexo", REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE)) 
		return false;
	if (!checkZoneObligatoire("numexo", REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE)) 
		return false;
	if (!checkZoneObligatoire("utilisateurfinal", REGULARISATIONEXOEFFECTIVE_OBLIGATOIRE)) 
		return false;*/

	if(document.getElementById("TNUM_LIST_regimefiscaldefinitif").value==document.getElementById("regimefiscalactuel").value)
	{
		setFieldObligatoire("TNUM_LIST_regimefiscaldefinitif", REGULARISATIONEXOEFFECTIVE);
		return false;
	}
	doSubmitWithaoutValidate(reqCode, page);
	return true;
}

/***********************************************************************	
	Fonction		: rechercherDeclarationCotation
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: lance une action de recherche sur les d�clarations 
					  pour la s�lection/cotation
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function rechercherDeclarationCotation(reqCode, page) {	
	if (!checkZoneObligatoire("TNUM_decBurEnregDec", BUREAU_DECLARATION_OBLIGATOIRE)) 
		return false;
	doSubmitWithaoutValidate(reqCode, page);
	return true;
}

function rechercherDeclarationCotation2(reqCode, page) {	
	if (!checkZoneObligatoire("TNUM_decBurEnregDec", BUREAU_DECLARATION_OBLIGATOIRE)) 
		return false;
	doSubmitWithaoutValidate2(reqCode, page);
	return true;
}

/***********************************************************************	
	Fonction		: remplirChampUV
	Auteur 			: Cyril NIANG CFAO TECHNOLOGIES 2008
	Description 	: Remplit le champs UV en fonction du circuit choisi
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function remplirChampUV(reqCode, page){
	doSubmitWithaoutValidate(reqCode, page);
}

/***********************************************************************	
	Fonction		: modifier
	Auteur 			: Mouhamad KAMARA CFAO TECHNOLOGIES 2006
	Description 	: affiche l'ecran pour la modification de la s�lection 
					  cotation
	Param�tres 		: reqCode, page
	Utilis�e dans	: 
************************************************************************/
function modifier(reqCode, page) {	
	doSubmitWithaoutValidate(reqCode, page);
}
