var shemaBD="G2010D."; 
/**********************************************/
/*	Prototypes des fonctions f9 de ce fichier */ 
/*  (par ordre alphab�tique)                  */
/**********************************************/
/**********************************************/
/*	f9_Ambassadeorganisme(input)
/*	f9_Ambassadeorganismeppm(input)
/*	f9_Agree(input)
/*	f9_Agreeppm(input)
/*  f9_Bareme(input)
/*  f9_BureauDouane(input)
/*	f9_Bureaufranchise(input)
/*	f9_CatRegroup(input)
/*	f9_Chaine (input)
/*	f9_Chapitre (input)
/*	f9_CircuitVisite(input)
/*	f9_Classe (input)
/*	f9_CompBureau(input)
/*	f9_Consignataires (input)
/*	f9_Consignatairesppm (input)
/*	f9_Creditaires (input)
/*	f9_Creditairesppm (input)
/*	f9_Critere (input)
/*	f9_devise(input)
/*  f9_Depotpetrolier(input1,input2,input3,input4)
/*  f9_dispenses(input)
/*	f9_Fonctionnalites(input)	
/*	f9_GenreBureau(input)
/*	f9_Importexport(input)
/*	f9_Importexportppm(input)
/*  f9_Indicateur(input)
/*	f9_Langue(input)
/*	f9_LieuDepot(input)
/*	f9_LieuEmbarquement(input)
/*	f9_Mad(input)
/*	f9_ModeConditionnement(input)
/*	f9_Modedeclaration(input)
/*	f9_ModeTransport(input)
/*	f9_NatureFiscalite(input)
/*	f9_NaturePieceJointe(input)
/*	f9_Operateur(input)
/*	f9_Originecritere(input)
/*	f9_pays(input)
/*	f9_PiecesJointes(input)
/*	f9_PPM(input)  : particuli�re
/*	f9_PPM1(input)  : g�n�rale
/*  f9_PPM2(input1,input2,input3):particuli�re pour PPM A ordre de
/*  f9_Profil(input)
/*  f9_Produits(codeprod,precuemoa,precsen)
/*  f9_Regime(typeregime,regimedouanier,regimefiscal)
/*  f9_Regime1(input1, input2)
/*  f9_Regimeeconomique(input1, input2)
/*	f9_RegimeDouanier1(input)
/*	f9_RegimeDouanier(coderegimedouanier,typeregime)
/*  f9_RegimeFiscal(input)
/*  f9_RecevGroup(input)
/*  function f9_RegimeDouanier(input1, input2)
/*	f9_RegimeFiscal (input)
/*  f9_Regroupement (input)
/*  f9_Tarifs()
/*	f9_Taux(input1,input2) 
/*  f9_Taxes (input)
/*	f9_TypeApurement(input)
/*	f9_TypeBurDouane(input)
/*	f9_Typecredit(input)
/*	f9_Typeindicateur(input)
/*	f9_TypeLieuEmbarquement(input)
/*	f9_Typemanifeste(input)
/*	f9_TypeRegimeDouane(input)
/*	f9_TypeSoumission(input)
/*	f9_Typevoie(input)
/*	f9_Typeutilisateur(input)
/*	f9_Utilisateur(input)
/*
/**********************************************/

/*------------------FONCTION POUR DESACTIVER LA FONCTION F9-------------------------------*/
var IS_F9_DISABLED_FOR_PERF=0;
function f9_message_perf(){ 
	if(window.event.keyCode==120){
		alert('fonction indisponible provisoirement pour ce champ');
		return;
	}
}

/************ Agree **********/
function f9_Agree(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Agree','f91'
     				 		,'rcCodeAgree*String-rcCodePpm*String-rcEtatAgree*String'
     				 		,' ','Code agr��-Code PPM-Etat agr��','Les agr��s',input
     				 		,frm.hidden,frm.hidden)
   						}
	
}
/************ Agreeppm pour la modification d'un ppm **********/
function f9_Agreeppm(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Agree','f9'
     				 		,'rcCodeAgree*String-rcEtatAgree*String'
     				 		,' and (rcCodePpm is null or rcCodePpm=\'\')','Code agr��-Etat agr��','Les agr��s',input
     				 		,frm.hidden)
   			}			
}
/************ Ambassadeorganisme **********/
function f9_Ambassadeorganisme(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('AmbassadeOrganisme','f91'
     				 		,'rcNumRegimePref*String-rcCodePpm*String-rcNatRegimePref*String'
     				 		,'','Code r�gime pr�f�rentietiel-Code PPM-Nature r�gime','Les ambassades / organismes',input
     				 		,frm.hidden,frm.hidden)
   						}
	
}
/************ Ambassadeorganiseppm pour la modification d'un ppm **********/
function f9_Ambassadeorganismeppm(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('AmbassadeOrganisme','f9'
     				 		,'rcNumRegimePref*String-rcNatRegimePref*String'
     				 		,' and (rcCodePpm is null or rcCodePpm=\'\')','Code r�gime pr�f�rentietiel-Nature r�gime','Les ambassades / organismes',input
     				 		,frm.hidden)
   				}		
}

/************ Bareme **********/
function f9_Bareme(input,input1,input2,input3,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
    burdouane = document.getElementById('TNUM_ecorcodebureau').value;
		if(touche==120){input.value='';input1.value='';input2.value='';input3.value='';
					frm.hidden.value='';
     				 f9t('Bareme','f92'
     				 		,'rccodeprod*String-rcprecuemoa*String-rcprecsen*String-rcvaleurunitaire*String'
     				 		,'and rccodebureau='+"'"+burdouane+"'"+' order by 1','Code Produit-Pr�cision UEMOA-Pr�cision S�n�gal-Valeur','BAREME',input
     				 		,input1,input2,input3)
   						}
	
}
/************ BureauDouane **********/
function f9_BureauDouane(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
   if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('BureauDouane','f9'
     				 		,'rccodeburdouane*String-rclibelleburdouane*String-rcTypeBurDouane*Integer-rcCompetence*String-rcGenreBur*String-manifesteobligatoire*String'
     				 		,'order by 1','Code-Libell�-Type-Comp�tence-Genre-Manifeste obligatoire','Liste des bureaux',input
     				 		,frm.hidden)
   						}
	
}
/************ Bureaufranchise **********/
function f9_Bureaufranchise(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('BureauFranchise','f9'
     				 		,'rcCodeBurFranchise*String-rcLibBurFranchise*String'
     				 		,'','Code-Libell�','Liste des bureaux franchise',input
     				 		,frm.hidden)
   						}
	
}

/************ CatRegroup **********/
function f9_CatRegroup(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('CatreGroup','f9'
     				 		,'rcCodeCatreGroup*String-rcLibCatreGroup*String'
     				 		,'','Code-Libell�','Liste des cat�gories regroup�es',input
     				 		,frm.hidden)
   		}
}
/************ Chaine **********/
function f9_Chaine(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Chaine','f9'
     				 		,'rcCodeChaine*Integer-rcLibelleChaine*String'
     				 		,'','Code-Libell�','Liste des cha�nes',input
     				 		,frm.hidden)
   		}
}
/************ ChapitreSection **********/
function f9_ChapitreSection(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('ChapitreSection','f9'
     				 		,'rccodechapitre*String-rclibellechapitre*String'
     				 		,'','Code chapitre-Libell� chapitre','Liste des chapitres',input
     				 		,frm.hidden)
   		}
}

/************ CircuitVisite **********/
function f9_CircuitVisite(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('CircuitVisite','f9'
     				 		,'rccodecircuit*String-rcdescircuitvisite*String'
     				 		,'','Code circuit-Description circuit','Circuit visite',input
     				 		,frm.hidden)
   		}
}

/************ Classe **********/
function f9_Classe(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Classe','f9'
     				 		,'rccodeclasse*Integer-rclibelleclasse*String'
     				 		,'','Code-Libell�','Liste des classes',input
     				 		,frm.hidden)
   		}
}

/************ CompBureau **********/
function f9_CompBureau(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('CompBureau','f9'
     				 		,'rccodecompetence*String-rcdescompetences*String'
     				 		,'','Code-Description','Comp�tence bureau',input
     				 		,frm.hidden)
   						}
	
}

/************ Consignataires **********/
function f9_Consignataires (input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if (touche==120)	{	
		frm.hidden.value='';
		f9t('Consignataire',
				'f91',
				'rcCodeConsignataire*String-rcCodePpm*String-rcDateCreationConsig*date',
				'','Code consignataire-Code PPM-Date cr�ation','Consignataires',
				input,frm.hidden,frm.hidden)				
	} 
}
/************ Consignataires pour la modification des PPM**********/
function f9_Consignatairesppm(input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
		frm.hidden.value='';
		f9t('Consignataire',
				'f9',
				'rcCodeConsignataire*String-rcDateCreationConsig*date',
				' and (rcCodePpm is null or rccodeppm=\'\')','Code consignataire-Date cr�ation','Consignataires',
				input,frm.hidden)				
	}
}
/************ Cr�ditaires **********/
function f9_Creditaires (input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if (touche==120)	{	
		frm.hidden.value='';
		f9t('Creditaire c,TypeCredit t',
				'f91',
				'c.rcCodeCreditaire*String-c.rcCodePpm*String-t.rcLibelleTypeCredit*String',
				' and c.rcTypeCreditaire = t.rcCodeTypeCredit ','Code cr�ditaire-Code PPM-Type cr�dit','Cr�ditaires',
				input,frm.hidden,frm.hidden)				
	} 
}
/************ Cr�ditaires pour la modification des PPM**********/
function f9_Creditairesppm(input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if(touche==120){input.value='';
		frm.hidden.value='';
		f9t('Creditaire c,TypeCredit t',
				'f9',
				'c.rcCodeCreditaire*String-t.rcLibelleTypeCredit*String',
				' and (c.rcCodePpm is null or c.rccodeppm=\'\') and ((c.rcTypeCreditaire = t.rcCodeTypeCredit)or(t.rcCodeTypeCredit is null or t.rcCodeTypeCredit=\'\'))','Code cr�ditaire-Type cr�dit','Cr�ditaires',
				input,frm.hidden)		
	}
}
/************ Cr�ditaires **********/
function f9_Critere (input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if (touche==120)	{	
		frm.hidden.value='';
		f9t('Critere','f91',
				'rcCodeCritere*String-rcLibelleCritere*String-rcNomTable*String',
				'','Code-Libell�-Nom table','Crit�res',
				input,frm.hidden,frm.hidden)				
	} 
}

/************ DEPOTPETROLIER ***********/
function f9_Depotpetrolier(input1,input2,input3,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';input3.value='';					
     				 f9t('DepotPetrolier','f91'
     				 		,'rcCodeDepot*String-rcLibelleDepot*String-rcAdresseDepot*String-rcPpmConcess*String'
     				 		,'order by 1','Code-Libell�-Adresse-Concessionnaire','Liste des d�p�ts p�trolier',input1
     				 		,input2,input3)
   						}
	
}

/*************  Devise **************/
function f9_devise(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Devises','f91'
     				 		,'rccodedevise*String-rclibelledevise*String-(rcqtecfa/rcqtedevise)*Double'
     				 		,' order by 1','Code devise-Libell� devise-Cours devise','Liste des devises',input
     				 		,frm.hidden,frm.hidden)
   		}
}

/*************  Dispenses **************/
function f9_Dispenses(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Dispense','f91'
     				 		,'rccodedispense*String-rcdesdispense*String-rcCodeTaxe*String'
     				 		,'','Code dispense-Libell� dispense-Code taxe','Liste des dispenses',input
     				 		,frm.hidden,frm.hidden)
   		}
}

/*************  Etatmodereglement **************/
function f9_Etatmodereglement(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('EtatModeReglement','f9'
     				 		,'rcCodEtatModeReglement*String-rcLibEtatModeReglement*String'
     				 		,'','Code-Libell�','Liste des Etatmodereglement',input
     				 		,frm.hidden)
   		}
}
/*************  Exceptions **************/
function f9_Exceptions(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Exceptions','f9'
     				 		,'rcCodeException*String-rcLibelleException*String'
     				 		,'','Code exception-Libell�','Liste des exceptions',input
     				 		,frm.hidden,frm.hidden)
   		}
}
/*********  Fonctionnalites **********/
function f9_Fonctionnalites(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Fonctionnalite','f9'
     				 		,'rcCodeFonction*String-rcLibFonction*String'
     				 		,'','Code-Libell�','Liste des fonctionnalit�s',input
     				 		,frm.hidden)
   		}
}

/************ GenreBureau **********/
function f9_GenreBureau(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('GenreBureau','f9'
     				 		,'rcgenrebureau*String-rcdesgenrebureau*String'
     				 		,'','Code-Description','Genre bureau',input
     				 		,frm.hidden)
   						}
	
}

/*************  Groupefonction ***************/
function f9_Groupefonction(input,input2,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';input2.value='';
					frm.hidden.value='';
     				 f9t('GroupeFonction','f9'
     				 		,'rcCodeGroupe*String-rcLibGroupe*String'
     				  		,'order by 1','Code groupe-Libell� groupe','Liste des groupes',input
     				 		,input2)
   		}
}

/************ Importexport **********/
function f9_Importexport (input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if (touche==120)	{	
		frm.hidden.value='';
		f9t('ImportExport',
				'f91',
				'rcNumImportExport*String-rcCodePpm*String-rcNineaImpExp*String',
				' ','Num�ro import export-Code PPM-NINEA import export','Importateur / Exportateur',
				input,frm.hidden,frm.hidden)				
	} 
}
/************ Importexport pour la modification des PPM**********/
function f9_Importexportppm(input,evenement)
{	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	if(touche==120){input.value='';	
		frm.hidden.value='';
		f9t('ImportExport',
				'f9',
				'rcNumImportExport*String-rcNineaImpExp*String',
				' and (rcCodePpm is null or rccodeppm=\'\')','Num�ro import export-NINEA import export','Importateur / Exportateur',
				input,frm.hidden)				
	 }
}
/************ Indicateur **********/
function f9_Indicateur(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Indicateur','f91'
     				 		,'rcCodeIndicateur*String-rcLibelleIndicateur*String-rcTypeIndicateur*String'
     				 		,'','Code-Libell�-Type','Liste des indicateurs',input
     				 		,frm.hidden,frm.hidden)
   						}
	
}

/*************  Langue ***************/
function f9_Langue(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Langue','f91'
     				 		,'rccodelangue*String-libellelangue*String'
     				 		,'','Code langue-Libell� langue','Liste des langues',input
     				 		,frm.hidden,frm.hidden)
   		}
}

/************ LieuDepot **********/
function f9_LieuDepot(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('LieuDepot','f9'
     				 		,'rcCodeLieuDepot*String-rcLibelleLieuDepot*String'
     				 		,'','Code Lieu depot-Libell�','Lieu de D�p�t',input
     				 		,frm.hidden)
   						}

}

/************ LieuEmbarquement **********/
function f9_LieuEmbarquement(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	if(IS_F9_DISABLED_FOR_PERF == 1){
		f9_message_perf();
		return;
	}   
	
	var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('LieuEmbarquement LE,Pays P,TypeLieuEmb TL','f92'
     				 		,'LE.rccodelieuemb*String-LE.rclibellelieuemb*String-P.rclibellepays*String-TL.libelletypelieuemb*String'
     				 		,' and LE.rccodepays=P.rccodepays and LE.rctypelieuemb=TL.codetypelieuemb','Code-Libell�-Pays-Type','Lieux embarquement',input
     				 		,frm.hidden,frm.hidden,frm.hidden)
   						}
	
}

/************ Mad **********/
function f9_Mad(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Mad','f9'
     				 		,'codeMad*String-designationMad*String'
     				 		,'order by 1','Code Mad-Libell�','MAD',input
     				 		,frm.hidden)
   						}

}

/************ Mad1 **********/
function f9_Mad1(input,input1,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';input1.value='';
					frm.hidden.value='';
     				 f9t('Mad','f91'
     				 		,'codeMad*String-designationMad*String'
     				 		,'order by 1','Code Mad-Libell�','MAD',input,input1
     				 		,frm.hidden)
   						}

}

/************ ModeConditionnement **********/
function f9_ModeConditionnement(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('ModeConditionnement','f9'
     				 		,'rcCodeModeCond*String-rcLibelleModeCond*String'
     				 		,'order by 1','Code Mode-Libell�','Mode conditionnement',input
     				 		,frm.hidden)
   						}

}

/************ ModeDeclaration **********/
function f9_Modedeclaration(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('ModeDeclaration','f9'
     				 		,'rcCodeModeDec*String-rcLibelleModeDec*String'
     				 		,'','Code-Libell�','Liste des modes de d�claration',input
     				 		,frm.hidden)
   						}
	
}

/************ ModeTransport **********/
function f9_ModeTransport(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('ModeTransport','f9'
     				 		,'rcCodeModeTrans*String-rcLibelleModeTrans*String'
     				 		,'','Code-Libell�','Mode transport',input
     				 		,frm.hidden)
   						}
	
}

/************ NatureFiscalite **********/
function f9_NatureFiscalite(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('NatureFiscalite','f9'
     				 		,'rccodefiscalite*String-rcdesfiscalite*String'
     				 		,'','Code-Description','Nature fiscalit�',input
     				 		,frm.hidden)
   		}
}

/************ NaturePieceJointe **********/
function f9_NaturePieceJointe(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('NaturePieceJointe','f9'
     				 		,'rccodepiecejointe*String-rclibpiecejointe*String'
     				 		,'','Code-Libell�','Nature pi�ce jointe',input
     				 		,frm.hidden)
   						}
	
}

/************ NatureRegEco **********/
function f9_NatureRegEco(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('NatureRegEco','f9'
     				 		,'rcCodeNatRegEco*String-rcLibNatRegEco*String'
     				 		,'order by 1','Code-Libell�','Liste des natures de r�gime �conomique',input
     				 		,frm.hidden)
   						}
	}
/************ Operateur **********/
function f9_Operateur(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Operateur','f91'
     				 		,'rcCodeOperateur*String-rcSymboleOperateur*String-rcLibelleOperateur*String'
     				 		,'','Nom-Symbole-Libell�','Les op�rateurs',input
     				 		,frm.hidden,frm.hidden)
   						}
	
}
/************ Originecritere **********/
function f9_Originecritere(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('OrigineCritere','f9'
     				 		,'rcNomTable*String-rcLibelleTable*String'
     				 		,'','Nom-Libell�','Origine crit�re',input
     				 		,frm.hidden)
   						}
	
}

/*************  Pays ***************/
function f9_pays(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Pays','f91'
     				 		,'rccodepays*String-rclibellepays*String-rccodedevise*String'
     				  		,'order by 1','Code Pays-D�signation-Code devise','Liste des pays',input
     				 		,frm.hidden,frm.hidden)
   		}
}

/*************  Pi�ces jointes ***************/
function f9_PiecesJointes(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('PieceJointe','f9'
     				 		,'rcCodePieceJointe*String-rcDesPieceJointe*String'
     				  		,'','Code-Description','Liste des pi�ces jointes',input
     				 		,frm.hidden)
   		}
}
/************ PPM (Particuli�re) **********/

/*---------------------------------------------------------------------------------------*/

function f9_PPM(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	if(IS_F9_DISABLED_FOR_PERF == 1){
		f9_message_perf();
		return;
	}
	
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Ppm','f93'
     				 		,'rccodeppm*String-rctitreppm*String-rcnomppm*String-rcprenomppm*String-rcraisonsociale*String'
     				 		,'order by 1','Code-Titre-Nom-Pr�nom-Nom ou raison sociale','Liste PPM',input
     				 		,frm.hidden,frm.hidden,frm.TNUM_manifNomDestinataire,frm.hidden)
   						}	
}
/************ PPM (Particuli�re, utils�e � la saisie/mise � jour de l'article dans la section A ORDRE DE) ***********/
function f9_PPM2(input1,input2,input3,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	if(IS_F9_DISABLED_FOR_PERF == 1){
		f9_message_perf();
		return;
	}
	
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){				
		input1.value='';input2.value='';input3.value='';frm.hidden.value='';
     				 f9t('Ppm','f93'
     				 		,'rccodeppm*String-rctitreppm*String-rcprenomppm ||chr(32)||chr(32)|| rcnomppm*String-rcraisonsociale*String-rctypevoieppm || chr(32) || '+ 
							 'rcnomvoieppm || chr(32) || rcquartierppm || chr(32) || rcvilleppm*String'
     				 		,'order by 1','Code-Titre-Pr�nom/Nom-Nom ou raison sociale-Ville','Liste PPM',input1
     				 		,frm.hidden,input2,frm.hidden,input3)
   						}
   						
	
}
/************ PPM1 (G�n�rale) **********/
function f9_PPM1(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	if(IS_F9_DISABLED_FOR_PERF == 1){
		f9_message_perf();
		return;
	}
	
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					 frm.hidden.value='';
     				 f9t('Ppm','f93'
     				 		,'rccodeppm*String-rctitreppm*String-rcnomppm*String-rcprenomppm*String-rcraisonsociale*String'
     				 		,'order by 1','Code-Titre-Nom-Pr�nom-Nom ou raison sociale','Liste PPM',input
     				 		,frm.hidden,frm.hidden,frm.hidden,frm.hidden);
   						}
	
}

/************ Profil **********/
function f9_Profil(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Profil','f9'
     				 		,'rcCodeProfil*String-rcLibelleProfil*String'
     				 		,'','Code-Libell�','Liste des profils',input
     				 		,frm.hidden)
   						}	
}

/************ Produits ***********/
function f9_Produits(input1,input2,input3,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	if(IS_F9_DISABLED_FOR_PERF == 1){
		f9_message_perf();
		return;
	}	
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';input3.value='';					
     				 f9t('Produit','f91'
     				 		,'rccodeprod*String-rcprecuemoa*String-rcprecsenegal*String'
     				 		,'and rcactif =\'O\' order by 1','Code produit-Pr�cision UEMOA-Pr�cision S�n�gal','PRODUITS',input1
     				 		,input2,input3)
   						}
	
}

/************ Produits ***********/
function f9_ProduitsPetroliers(input1,input2,input3,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';input3.value='';					
     				 f9t('Produit','f91'
     				 		,'rccodeprod*String-rcprecuemoa*String-rcprecsenegal*String'
     				 		,'and rcindprodpetrolier=\'1\' and rcactif =\'O\' order by 1','Code produit-Pr�cision UEMOA-Pr�cision S�n�gal','PRODUITS',input1
     				 		,input2,input3)
   						}
	
}

/************ Regime ***********/
function f9_Regime(input1,input2,input3,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';input3.value='';
					//frm.hidden.value='';					
     				 f9t('Regime','f91'
     				 		,'rcTypeRegime*String-rcCodeRegimeDouanier*String-rcCodeRegimeFiscal*String-rcLibelleRegime*String-rcRegimeTaxable*String'
     				 		,'order by 1','Type r�gime-Code r�gime douanier-Code r�gime fiscal-Libell� r�gime-R�gime taxable','REGIME',input1
     				 		,input2,input3)
   						}
	
}

/************ Regime1 ***********/
function f9_Regime1(input1,input2,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';
					frm.hidden.value='';					
     				 f9t('Regime','f91'
     				 		,'rcTypeRegime||rcCodeRegimeDouanier*String-rcCodeRegimeFiscal*String-rcLibelleRegime*String-rcRegimeTaxable*String'
     				 		,'order by 1','r�gime douanier-Code r�gime fiscal-Libell� r�gime-R�gime taxable','REGIME',input1
     				 		,input2,frm.hidden)
   						}
	
}

/************ RegimeDouanier **********/
function f9_RegimeDouanier(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('RegimeDouanier','f9'
     				 		,'rcTypeRegime||rcCodeRegimeDouanier*String-rcLibelleRegimeDouanier*String'
     				 		,'order by 1','Code r�gime-Libell� r�gime','R�gime douanier',input
     				 		,frm.hidden)
   						}
	
}
/************ RegimeDouanier **********/
function f9_RegimeDouanier(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('RegimeDouanier','f91'
     				 		,'rcTypeRegime || rcCodeRegimeDouanier*String-rcLibelleRegimeDouanier*String'
     				 		,'order by 1','R�gime douanier-Libell�','Liste des r�gimes douaniers',input
     				 		,frm.hidden,frm.hidden)
   						}	
}
/************ RegimeDouanier **********/
function f9_RegimeDouanier1(input1, input2,evenement){
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value=''
					frm.hidden.value='';
     				 f9t('RegimeDouanier','f91'
     				 		,'rcCodeRegimeDouanier*String-rcTypeRegime*String-rcLibelleRegimeDouanier*String'
     				 		,'order by 1','Code r�gime-Type r�gime-Libell�','Liste des r�gimes douaniers',input1
     				 		,input2,frm.hidden)
   						}	
}
/************ RegimeEconomique **********/
function f9_Regimeeconomique(input1, input2,evenement){
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';
					frm.hidden.value='';
     				 f9t('RegimeEconomique r,NatureRegEco n','f91'
     				 		,'r.rcanneeregeco*String-r.rcnumregeco*String-n.rcLibNatRegEco*String'
     				 		,' and r.rccodenatregeco=n.rcCodeNatRegEco','Ann�e-Num�ro-Libell�','Liste des r�gimes �conomique',input1
     				 		,input2,frm.hidden)
   						}	
}
/************ RegimeEconomiqueByBureau **********/
/*function f9_Regimeeconomique(input1, input2){
   var frm = document.forms.item(document.forms.length-1);
   alert('1111'+document.getElementById('TNUM_LIST_declCodePPM').value)
   codeppm = document.getElementById('TNUM_LIST_declCodePPM').value;

   if(codeppm!=''){
		if(window.event.keyCode==120){input1.value='';input2.value='';
					frm.hidden.value='';
     				 f9t(	shemaBD+'regimeeconomique r, '+shemaBD+'natureregeco n','f91'
     				 		,'r.rcanneeregeco*String-r.rcnumregeco*String-n.rclibnatregeco*String'
     				 		,' and r.rccodenatregeco=n.rccodenatregeco and rcppmbeneficiaire='+codeppm+','Ann�e-Num�ro-Libell�','Liste des r�gimes �conomique',input1
     				 		,input2,frm.hidden)
   						}	
   }else{
   		if(window.event.keyCode==120){input1.value='';input2.value='';
					frm.hidden.value='';
     				 f9t(	shemaBD+'regimeeconomique r, '+shemaBD+'natureregeco n','f91'
     				 		,'r.rcanneeregeco*String-r.rcnumregeco*String-n.rclibnatregeco*String'
     				 		,' and r.rccodenatregeco=n.rccodenatregeco','Ann�e-Num�ro-Libell�','Liste des r�gimes �conomique',input1
     				 		,input2,frm.hidden)
   						}	
   }						
  
}*/
/************ RegimeFiscal **********/
function f9_RegimeFiscal1(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
  // regdou = frm.TNUM_LIST_declCodeRegimeDouanier_OB.value;
   //alert('regdou = '+regdou)
 // alert('first = '+regdou.substring(0,1));
  // alert('second = '+regdou.substring(1,2));
		if(touche==120){input.value='';
					frm.hidden.value='';					
     				 f9t('RegimeFiscal','f9'
     				 		,'rcCodeRegimeFiscal*String-rcLibelleRegimeFiscal*String'
     				 		,'order by 1','Code r�gime-Libell� r�gime','R�gime fiscal',input
     				 		,frm.hidden)
   						}	
}
/*********Faisant aussi le filtre sur le regime douanier si saisi******/


function f9_RegimeFiscal(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
   //regdou = frm.TNUM_LIST_declCodeRegimeDouanier_OB.value;
   regdou = document.getElementById('TNUM_LIST_declCodeRegimeDouanier_OB').value;
   //alert('regdou = '+regdou);
   if(regdou!=''){
   		first = "'"+regdou.substring(0,1)+"'";
   		second ="'"+regdou.substring(1,2)+"'";
		if(touche==120){input.value='';
			frm.hidden.value='';					
     		f9t('Regime','f9'
 				,'rcCodeRegimeFiscal*String-rcLibelleRegime*String'
 				,'and rcTypeRegime='+first+' and rcCodeRegimeDouanier='+second+'order by 1','Code r�gime-Libell� r�gime','R�gime fiscal',input
 				,frm.hidden);
   		}
   	}else{
   		if(touche==120){input.value='';
			frm.hidden.value='';					
     		f9t('RegimeFiscal','f9'
     			,'rcCodeRegimeFiscal*String-rcLibelleRegimeFiscal*String'
     			,'order by 1','Code r�gime-Libell� r�gime','R�gime fiscal',input
     			,frm.hidden)
   		}	
   	}	
}
/************R�gime fiscal non exo*******/
/************ RegimeFiscal **********/
function f9_RegimeFiscalNonExo(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
  // regdou = frm.TNUM_LIST_declCodeRegimeDouanier_OB.value;
   //alert('regdou = '+regdou)
 // alert('first = '+regdou.substring(0,1));
  // alert('second = '+regdou.substring(1,2));
  regfiscalactuel = "'"+frm.regimefiscalactuel.value+"'";
		if(touche==120){input.value='';
					frm.hidden.value='';					
     				 f9t('RegimeFiscal','f9'
     				 		,'rcCodeRegimeFiscal*String-rcLibelleRegimeFiscal*String'
     				 		, 'and rcCodeRegimeFiscal!='+regfiscalactuel+' order by 1','Code r�gime-Libell� r�gime','R�gime fiscal',input
     				 		,frm.hidden)
   						}	
}

/************ Regroupement **********/
function f9_Regroupement(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Regroupement','f9'
     				 		,'rcCodeRegroup*String-rcLibelleRegroup*String'
     				 		,'','Code regroupement-Libell� regroupement','Regroupement',input
     				 		,frm.hidden)
   						}
	
}
/******** Tarifs************/
function f9_Tarifs(){
   var frm = document.forms.item(document.forms.length-1);
	//	if(window.event.keyCode==120){input.value='';
					frm.hidden.value='';
     				 f9t('Tarif','f93'
     				 		,'rcCodeProd*String-rcPrecueMoa*String-rcPrecSenegal*String-rcCodeTaxe*String-rcCodeTaux*String'
     				 		,' order by 1','Code Produit-Pr�cisUEMOA-Pr�cisSEN-Taxe-Taux ','Liste des Tarifs',frm.hidden
     				 		,frm.hidden,frm.hidden,frm.hidden,frm.hidden)
   	//	}
}
/************ Taux **********/
function f9_Taux(input1,input2,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input1.value='';input2.value='';
					frm.hidden.value='';					
     				 f9t('Taux','f91'
     				 		,'rcCodeTaux*String-rcCodeTaxe*String-libelleTaux*String'
     				 		,'','Code taux-Code taxe-Libell� taux','TAUX',input1
     				 		,input2,frm.hidden)
   						}
	
}
/************ Taxes **********/
function f9_Taxes(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Taxe','f9'
     				 		,'rcCodeTaxe*String-rcLibelleTaxe*String'
     				 		,'','Code-Libell�','Les taxes',input
     				 		,frm.hidden)
   						}
	
}

/************ TypeApurement **********/
function f9_TypeApurement(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeApurement','f9'
     				 		,'rcCodeApurement*String-rcLibelleApurement*String'
     				 		,'','Code-Libell�',"Les types d'apurement",input
     				 		,frm.hidden)
   						}
	
}

/************ TypeBurDouane **********/
function f9_TypeBurDouane(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeBureau','f9'
     				 		,'rccodetypebur*String-rclibelletypebur*String'
     				 		,'','Code-Libell�','Type bureau douane',input
     				 		,frm.hidden)
   						}
	
}
/************ Typecredit **********/
function f9_Typecredit(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeCredit','f9'
     				 		,'rcCodeTypeCredit*String-rcLibelleTypeCredit*String'
     				 		,'','Code-Libell�','Type cr�ditaire',input
     				 		,frm.hidden)
   						}
	
}
/************ Typeindicateur **********/
function f9_Typeindicateur(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeIndicateur','f91'
     				 		,'rcCodeTypeIndicateur*String-rcLibTypeIndicateur*String-rcNomTableUtilisee*String'
     				 		,'','Code-Libell�-Table utilis�e','Type indicateur',input
     				 		,frm.hidden,frm.hidden)
   						}
	
}
/************ TypeLieuEmbarquement **********/
function f9_TypeLieuEmbarquement(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeLieuEmb','f9'
     				 		,'codetypelieuemb*String-libelletypelieuemb*String'
     				 		,'','Code-Libell�','Type de lieu d\'embarquement',input
     				 		,frm.hidden)
   						}
	
}

/************ Typemanifeste **********/
function f9_Typemanifeste(input,evenement) {
 var touche = window.event ? evenement.keyCode : evenement.which;
 var frm = document.forms.item(document.forms.length-1);
	if(touche==120){input.value='';
		frm.hidden.value='';
     		f9t('typemanifeste','f9'
     			,'rccodetypemanif*Integer-rclibelletypemanif*String'
     			,'','Code-Libell�','Type manifeste',input
     			,frm.hidden)
}
}

/************ TypeRegimeDouane **********/
function f9_TypeRegimeDouane(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeRegimeDouane','f9'
     				 		,'rcTypeRegime*String-rcLibelleRegime*String'
     				 		,'','Code type r�gime-Libell� type r�gime','Liste des types de r�gime douanier',input
     				 		,frm.hidden)
   		}
}

/************ TypeSoumission **********/
function f9_TypeSoumission(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeSoumission','f91'
     				 		,'rccodesoumiss*Integer-rclibellesoumiss*String-rcscoretypesoum*Integer'
     				 		,'','Code soumission-Libell� soumission-Score type soumission','Liste des types de soumissions',input
     				 		,frm.hidden,frm.hidden)
   		}
}
/************ TypeVoie **********/
function f9_Typevoie(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeVoie','f9'
     				 		,'codetypevoie*String-libelletypevoie*String'
     				 		,'','Code-Libell�','Liste des types de voie',input
     				 		,frm.hidden)
   		}
}
/************ Typeutilisateur **********/
function f9_Typeutilisateur(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('TypeUtilisateur','f9'
     				 		,'rcTypeUser*String-rcLibelleUser*String'
     				 		,'','Code-Libell�','Liste des types d\'utilisateur',input
     				 		,frm.hidden)
   		}
}
/********  Utilisateur ************/
function f9_Utilisateur(input,evenement) {
   var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){input.value='';
					frm.hidden.value='';
     				 f9t('Utilisateur','f91'
     				 		,'rcCodUser*String-login*String-nomuser*String'
     				 		,'','Code-Login-Nom','Liste des utilisateurs',input
     				 		,frm.hidden,frm.hidden)
   		}
}

function f9_UtilisateurDelegations(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
	var frm = document.forms.item(document.forms.length-1);
	var bureau = document.getElementById('buragent').value;
	if(touche==120){
		input.value='';
		frm.hidden.value='';					
     	f9t('Utilisateur U,AgentDouane A','f9'
     		,'U.rcCodUser*String-U.rcIdentification*String'
     		,'and U.rcCodUser=A.rcCodeUser and A.rcCodeBurAct=\''+bureau+'\'','Code-Nom utilisateur','Liste des utilisateurs',input
     		,frm.hidden)
   	}
}

/********  Utilisateur ************/
function f9_UtilisateurDouan(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
   var frm = document.forms.item(document.forms.length-1);
		if(touche==120){
					frm.hidden.value='';
     				 f9t("Utilisateur","f9"
     				 		,"rcCodUser*String-rcIdentification*String"
     				 		,"and rcTypeUser='D'",'Code-Nom','Liste des utilisateurs',input
     				 		,frm.hidden);
   		}
}
/*************Utilisateur Verificateur***********/
function f9_UtilisateurVerificateur(input,evenement) {
	var touche = window.event ? evenement.keyCode : evenement.which;
   	var frm = document.forms.item(document.forms.length-1);
	var bureau = document.getElementById('TNUM_decBurTitrePrec').value;
	var IV='IV';
	if(touche==120){
		input.value='';
		frm.hidden.value='';					
     	f9t('Utilisateur U,AgentDouane A','f9'
     		,'A.rcCodeAgent*String-U.rcIdentification*String'
     		,'and U.rcCodUser=A.rcCodeUser and A.rcCodeBurAct=\''+bureau+'\' and A.rcCodeProfil in (\''+IV+'\')','Code-Nom V�rificateur','Liste des v�rificateurs du bureau '+bureau,input
     		,frm.hidden)
   	}
}
/*******  recevgroup *******/
function f9_RecevGroup(input,evenement){
 var touche = window.event ? evenement.keyCode : evenement.which;
 var frm = document.forms.item(document.forms.length-1);
		if(touche==120){
		   input.value="";frm.TNUM_Libelle_OB.value="";
     				 f9t('recevgroup','f9'
     				 		,'codegroup*String-libelle*String'
     				 		,'','Code-Libell�','Liste des groupe recevabilit�',input
     				 		,frm.TNUM_Libelle_OB)
   		}
}
/*******  recevgroup *******/
function f9_Params(input,evenement){
 var touche = window.event ? evenement.keyCode : evenement.which;
 var frm = document.forms.item(document.forms.length-1);
		if(touche==120){
		   frm.hidden.value="";
     				 f9t('parametrerecevabilite','f9'
     				 		,'code*String-libelle*String'
     				 		,'','Code-Libell�','Liste des Param�tres Recevabilit�',input
     				 		,frm.hidden);
     				 		
   		}
   		//input.value=tr.value+input.value ;
		
		
}