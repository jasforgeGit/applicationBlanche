function showHideSection() {
	var categ = document.forms[0].RC_Categ_CodeBis.value;
	var mens = document.forms[0].CF_Ab_Mensualise.value;
	if(categ.substring(0,1) == "3") {

		AGENT.style.display = '';
		MENSUALISATION.style.display = 'none';
		COMPTE.style.display = 'none';
		ADRESSEPAYEUR.style.display = '';
		CODEPAYEUR.style.display = 'none';
		
	}else if (categ.substring(0,1) == "2")  {

		AGENT.style.display = 'none';
		MENSUALISATION.style.display = 'none';
		COMPTE.style.display = '';
		CODEPAYEUR.style.display = '';
		ADRESSEPAYEUR.style.display = '';
		
		
	}else if (categ.substring(1,2) == "2")  {
	
		MENSUALISATION.style.display = 'none';
		AGENT.style.display = 'none';
		COMPTE.style.display = 'none';
		ADRESSEPAYEUR.style.display = '';
		CODEPAYEUR.style.display = 'none';
		
	}else if (categ == "11")  {
		MENSUALISATION.style.display = 'none';
		AGENT.style.display = 'none';
		COMPTE.style.display = 'none';
		ADRESSEPAYEUR.style.display = 'none';
		CODEPAYEUR.style.display = 'none';
	}
	else if (categ == "13")  {
		AGENT.style.display ='none';
		COMPTE.style.display = '';
		ADRESSEPAYEUR.style.display = 'none';
		CODEPAYEUR.style.display = 'none';
		if(mens=="1"){
			MENSUALISATION.style.display = '';
		}else{
			MENSUALISATION.style.display = 'none';
		}
	}
	if(categ == "32") {

		AGENT.style.display = '';
		MENSUALISATION.style.display = 'none';
		COMPTE.style.display = 'none';
		ADRESSEPAYEUR.style.display = '';
		CODEPAYEUR.style.display = '';
	}
	if(categ == "33") {

		AGENT.style.display = '';
		MENSUALISATION.style.display = 'none';
		COMPTE.style.display = '';
		ADRESSEPAYEUR.style.display = '';
		CODEPAYEUR.style.display = 'none';
	}
	var relance = document.forms[0].RC_Rlce_Code.value;
	if((relance == null)||(relance == "")) {
			RELANCE.style.display = 'none';
	}else{
			RELANCE.style.display = '';
	}
	var cF_Exo_Num = document.forms[0].CF_Exo_Num.value;
	if(cF_Exo_Num == "1") {
			EXONERATION.style.display = '';
	}else{
			EXONERATION.style.display = 'none';
	}
	
}
function showResiliationSection() {
	var rc_etat_code = document.forms[0].RC_Etat_Code.value;
	
	if(rc_etat_code == "1") {
			RESILIE.style.display = '';
	}else{
			RESILIE.style.display = 'none';
	}
}
function showObjetSection(){
	var codeg = document.forms[0].GDA_Etd_Codeg.value;
	if((codeg == "")||(codeg == null)) {
			ObJETELEC.style.display = 'none';
			ObJETGAZ.style.display = 'none';
			
	}else if(codeg == "E"){
			ObJETELEC.style.display = '';
			ObJETGAZ.style.display = 'none';
	}else {
			ObJETELEC.style.display = 'none';
			ObJETGAZ.style.display = '';
	}
}
function showCauseReclamationSection() {
	var codeRelance = document.forms[0].RC_Rlce_Code.value;
	if((codeRelance == "")||(codeRelance == null)) {
			RELANCE.style.display = 'none';
	}else{
			RELANCE.style.display = '';
	}
	
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}

function MM_swapImgRestore() { //v3.0
  var i,x,a=document.MM_sr; for(i=0;a&&i<a.length&&(x=a[i])&&x.oSrc;i++) x.src=x.oSrc;
}

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_swapImage() { //v3.0
  var i,j=0,x,a=MM_swapImage.arguments; document.MM_sr=new Array; for(i=0;i<(a.length-2);i+=3)
   if ((x=MM_findObj(a[i]))!=null){document.MM_sr[j++]=x; if(!x.oSrc) x.oSrc=x.src; x.src=a[i+2];}
}

/* This function is used to change the style class of an element */
function swapClass(obj, newStyle) {
    obj.className = newStyle;
}

function isUndefined(value) {   
    var undef;   
    return value == undef; 
}

/* Function for showing and hiding elements that use 'display:none' to hide */
function toggleDisplay(targetId)
{
    if (document.getElementById) {
        target = document.getElementById(targetId);
    	if (target.style.display == "none"){
    		target.style.display = "";
    	} else {
    		target.style.display = "none";
    	}
    }
}

// toggle visibility 
function toggleVisibility(targetId) {
    if (document.getElementById) {
        target = document.getElementById(targetId);
    	if (target.style.visibility == "hidden"){
    		target.style.visibility = "visible";
    	} else {
    		target.style.visibility = "hidden";
    	}
    }
}

function checkAll(theForm) { // check all the checkboxes in the list
  for (var i=0;i<theForm.elements.length;i++) {
    var e = theForm.elements[i];
		var eName = e.name;
    	if (eName != 'allbox' && 
            (e.type.indexOf("checkbox") == 0)) {
        	e.checked = theForm.allbox.checked;		
		}
	} 
}

/* Function to clear a form of all it's values */
function clearForm(frmObj) {
	for (var i = 0; i < frmObj.length; i++) {
        var element = frmObj.elements[i];
		if(element.type.indexOf("text") == 0 || 
				element.type.indexOf("password") == 0) {
					element.value="";
		} else if (element.type.indexOf("radio") == 0) {
			element.checked=false;
		} else if (element.type.indexOf("checkbox") == 0) {
			element.checked = false;
		} else if (element.type.indexOf("select") == 0) {
			for(var j = 0; j < element.length ; j++) {
				element.options[j].selected=false;
			}
            element.options[0].selected=true;
		}
	} 
}

/* Function to get a form's values in a string */
function getFormAsString(frmObj) {
    var query = "";
	for (var i = 0; i < frmObj.length; i++) {
        var element = frmObj.elements[i];
        if (element.type.indexOf("checkbox") == 0 || 
            element.type.indexOf("radio") == 0) { 
            if (element.checked) {
                query += element.name + '=' + escape(element.value) + "&";
            }
		} else if (element.type.indexOf("select") == 0) {
			for (var j = 0; j < element.length ; j++) {
				if (element.options[j].selected) {
                    query += element.name + '=' + escape(element.value) + "&";
                }
			}
        } else {
            query += element.name + '=' 
                  + escape(element.value) + "&"; 
        }
    } 
    return query;
}

/* Function to hide form elements that show through
   the search form when it is visible */
function toggleForm(frmObj, iState) // 1 visible, 0 hidden 
{
	for(var i = 0; i < frmObj.length; i++) {
		if (frmObj.elements[i].type.indexOf("select") == 0 || frmObj.elements[i].type.indexOf("checkbox") == 0) {
            frmObj.elements[i].style.visibility = iState ? "visible" : "hidden";
		}
	} 
}

/* Helper function for re-ordering options in a select */
function opt(txt,val,sel) {
    this.txt=txt;
    this.val=val;
    this.sel=sel;
}

/* Function for re-ordering <option>'s in a <select> */
function move(list,to) {     
    var total=list.options.length;
    index = list.selectedIndex;
    if (index == -1) return false;
    if (to == +1 && index == total-1) return false;
    if (to == -1 && index == 0) return false;
    to = index+to;
    var opts = new Array();
    for (i=0; i<total; i++) {
        opts[i]=new opt(list.options[i].text,list.options[i].value,list.options[i].selected);
    }
    tempOpt = opts[to];
    opts[to] = opts[index];
    opts[index] = tempOpt
    list.options.length=0; // clear
    
    for (i=0;i<opts.length;i++) {
        list.options[i] = new Option(opts[i].txt,opts[i].val);
        list.options[i].selected = opts[i].sel;
    }
    
    list.focus();
} 

/*  This function is to select all options in a multi-valued <select> */
function selectAll(elementId) {
    var element = document.getElementById(elementId);
	len = element.length;
	if (len != 0) {
		for (i = 0; i < len; i++) {
			element.options[i].selected = true;
		}
	}
}

/* This function is used to select a checkbox by passing
 * in the checkbox id
 */
function toggleChoice(elementId) {
    var element = document.getElementById(elementId);
    if (element.checked) {
        element.checked = false;
    } else {
        element.checked = true;
    }
}

/* This function is used to select a radio button by passing
 * in the radio button id and index you want to select
 */
function toggleRadio(elementId, index) {
    var element = document.getElementsByName(elementId)[index];
    element.checked = true;
}


/* This function is used to open a pop-up window */
function openWindow(url, winTitle, winParams) {
	winName = window.open(url, winTitle, winParams);
    winName.focus();
}


/* This function is to open search results in a pop-up window */
function openSearch(url, winTitle) {
    var screenWidth = parseInt(screen.availWidth);
    var screenHeight = parseInt(screen.availHeight);

    var winParams = "width=" + screenWidth + ",height=" + screenHeight;
        winParams += ",left=0,top=0,toolbar,scrollbars,resizable,status=yes";

    openWindow(url, winTitle, winParams);
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

// This function is used by the login screen to validate user/pass
// are entered. 
function validateRequired(form) {                                    
    var bValid = true;
    var focusField = null;
    var i = 0;                                                                                          
    var fields = new Array();                                                                           
    oRequired = new required();                                                                         
                                                                                                        
    for (x in oRequired) {                                                                              
        if ((form[oRequired[x][0]].type == 'text' || form[oRequired[x][0]].type == 'textarea' || form[oRequired[x][0]].type == 'select-one' || form[oRequired[x][0]].type == 'radio' || form[oRequired[x][0]].type == 'password') && form[oRequired[x][0]].value == '') {
           if (i == 0)
              focusField = form[oRequired[x][0]]; 
              
           fields[i++] = oRequired[x][1];
            
           bValid = false;                                                                             
        }                                                                                               
    }                                                                                                   
                                                                                                       
    if (fields.length > 0) {
       focusField.focus();
       alert(fields.join('\n'));                                                                      
    }                                                                                                   
                                                                                                       
    return bValid;                                                                                      
}

// This function is a generic function to create form elements
function createFormElement(element, type, name, id, value, parent) {
    var e = document.createElement(element);
    e.setAttribute("name", name);
    e.setAttribute("type", type);
    e.setAttribute("id", id);
    e.setAttribute("value", value);
    parent.appendChild(e);
}

function confirmDelete(obj) {   
    var msg = "Voulez-vous supprimer  " + obj + "?";
    ans = confirm(msg);
    if (ans) {
        return true;
    } else {
        return false;
    }
}

function highlightTableRows(tableId, urlBase, nbPk) {
    var previousClass = null;
    var table = document.getElementById(tableId); 
    if(table == null) return
    
    var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
    var rows = tbody.getElementsByTagName("tr");
    // add event handlers so rows light up and are clickable
    for (i=0; i < rows.length; i++) {
        rows[i].onmouseover = function() { previousClass=this.className;this.className+=' over' };
        rows[i].onmouseout = function() { this.className=previousClass };
        rows[i].onclick = function() {
        		var listPK = "";
        		for(var i=0; i<nbPk; i++) {
        			var cell = this.getElementsByTagName("td")[i].innerText;
        			listPK += (i==0 && urlBase.indexOf("?")==-1) ? "?pk1=" + cell : "&pk" + (i+1) + "=" + cell;
        		}
    	        
        	    var url = urlBase + listPK;
            	location.href = url;
	            this.style.cursor="wait";
    	    }
    }
}

function clickTableRows(tableId, urlBase, nbGroup, nbPk) {
    var previousClass = null;
    var table = document.getElementById(tableId); 
    if(table == null) return
    
    var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
    var rows = tbody.getElementsByTagName("tr");
    if(rows.length >0)
    	var nbCells = rows[0].getElementsByTagName("td").length
    // add event handlers so rows light up and are clickable
    for (i=0; i < rows.length; i++) {
   		rows[i].onmouseover = function() { previousClass=this.className;this.className+=' over' };
        rows[i].onmouseout = function() { this.className=previousClass };
        rows[i].onclick = function() {
        				var firstRow;
        				var firstGroupRow;
        				var keyArray = new Array();
        				
        				for(var i=0; i < rows.length; i++){
	        				var nb = rows[i].getElementsByTagName("td").length;
        					if(nb == nbCells){
        						firstRow = rows[i]
        					}
        					
        					if(nb > (nbCells - nbGroup)){
        						firstGroupRow = rows[i]
        					}
        					
        					if(rows[i] == this){
        						var nbFirstGroupRow = firstGroupRow.getElementsByTagName("td").length;
        						var k=0;
        						for(var j=0; j<(nbCells - nbFirstGroupRow); j++){
        							keyArray[k] = firstRow.getElementsByTagName("td")[j].innerText;
        							k++;
        						}
        						for(var j=0; j<(nbGroup - (nbCells - nbFirstGroupRow)); j++){
        							keyArray[k] = firstGroupRow.getElementsByTagName("td")[j].innerText;
        							k++;
        						}
        						        
        						break;
        					}
        				}

        				var listPK = "";
        				for(var i=0; i<nbPk; i++) {
        					listPK += (i==0 && urlBase.indexOf("?")==-1) ? "?pk1=" + keyArray[i] : "&pk" + (i+1) + "=" + keyArray[i];
	    	    		}
    		        
        			    var url = urlBase + listPK;
        	    		location.href = url;
	    	        	this.style.cursor="wait";
    		    }
    }
}

function highlightFormElements() {
    // add input box highlighting 
    addFocusHandlers(document.getElementsByTagName("input"));
    addFocusHandlers(document.getElementsByTagName("textarea"));
}

function addFocusHandlers(elements) {
    for (i=0; i < elements.length; i++) {
        if (elements[i].type != "button" && elements[i].type != "submit" &&
            elements[i].type != "reset" && elements[i].type != "checkbox") {
            elements[i].onfocus=function() {this.className='focus';this.select()};
            elements[i].onclick=function() {this.select()};
            elements[i].onblur=function() {this.className=''};
        }
    }
}

function radio(clicked){
    var form = clicked.form;
    var checkboxes = form.elements[clicked.name];
    if (!clicked.checked || !checkboxes.length) {
        clicked.parentNode.parentNode.className="";
        return false;
    }

    for (i=0; i<checkboxes.length; i++) {
        if (checkboxes[i] != clicked) {
            checkboxes[i].checked=false;
            checkboxes[i].parentNode.parentNode.className="";
        }
    }

    // highlight the row    
    clicked.parentNode.parentNode.className="over";
}

function getToolTip(listName){
	var idx = eval("document.forms[0]." + listName + ".selectedIndex");	
	var listToolTip = eval(listName + "ToolTip");

	var div = document.getElementById("sh" + listName + "ToolTip"); 
	div.innerHTML = listToolTip[idx];
}	

function openAbonneInfo(urlBase){
	var form = document.forms[0]
	var ab_Code = form.CF_Ab_Code.value
	var ab_Ref = form.CF_Ab_Ref.value
	url = urlBase + "&pk1=" + ab_Code + "&pk2=" + ab_Ref
	location.href = url;
}
function searchAbonne(urlBase) {
   
    
	var listPK = "";
	
	var val1 = document.forms[0].CF_Ab_Ref.value;
	var val2 = document.forms[0].CF_Ab_Code.value;


   		listPK +="&val1=" + val1+ "&val2=" + val2;

    
         
    var url = urlBase + listPK;
    location.href = url;
	
  }
function searchAffaire(urlBase) {
   
    
	var listPK = "";

	var val1 = document.forms[0].GDA_Aff_Numpol.value;
	


   		listPK +="&val1=" + val1;

    
         
    var url = urlBase + listPK;
    location.href = url;
	
  }
  

  function searchMode_Enc(urlBase) {
   
    
	var listPK = "";

	var val1 = document.forms[0].typeEncaissement.value;
	


   		listPK +="&ctx=" + val1;

    
         
    var url = urlBase + listPK;
    
    location.href = url;
	
  }
 
function setCF_Ab_RefValue(){ 
	var form = document.forms[0];
	form.CF_Ab_Ref.value = form.CF_Ab_Code[form.CF_Ab_Code.selectedIndex].value;
}

function writePageHeadTitle(title){ 
	var divHeaderTitle = document.all.divHeaderTitle;
	divHeaderTitle.innerHTML = title;
}

function doSubmit(url){ 
	document.forms[0].action = url 
	document.forms[0].submit();
}

function maxReference(maxlen) {
	 
	 var form = document.forms[0]
	 var ref = form.CF_Ab_Ref.value;
	 
	 if(ref.length > maxlen){
	 
	 	var msg = " la reference ne depasse pas "+maxlen+" caracteres !!!";
     	alert(msg);
       	return false;
     	
	 }else{
	 	return true;
	 }
     
}
function genRapport(url){
	winName = window.open(url)
    winName.focus();	
}
function editionAffaire(url){
	var ur = document.forms[0].RC_Ur_Code.value;
	var numPol = document.forms[0].GDA_Aff_Numpol.value;
	url += "&pk1=" + ur+ "&pk2="+numPol;
	winName = window.open(url)
    winName.focus();	
}
function compteRendu(url){
	var datepec = document.forms[0].GDA_Aff_Datpec.value;
	var uf = document.forms[0].GDA_Aff_UF_Code.value;
	url += "&pk1=" + datepec+ "&pk2="+uf;
	winName = window.open(url)
    winName.focus();	
}
function doExport(type){
	var url = location.href;
	var idxExp = url.indexOf("export");
	var idxInt = url.indexOf("?");
	if(idxExp == -1){
		if(idxInt == -1){
			url = url + "?export=" + type;
		}else{	
			url = url + "&export=" + type;
		}
	}else{
		var str1 = url.substring(0, (idxExp + 6));
		var str2 = url.substring((idxExp + 6), url.length);
		var idx = str2.indexOf("&");
		if(idx == -1) {
			url = str1 + "=" + type;
		}else{
			var str3 = str2.substring(idx, str2.length);
			url = str1 + "=" + type + str3;
		}
	}
	
	location = url;
}

function changerIndex(tableId, url, idxEditList){
   	var form = document.forms[0]
	var table = document.getElementById(tableId); 
   	if(table == null) return
   
   	var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
   	var rows = tbody.getElementsByTagName("tr");
   	var params = "";
   	for(var i=0; i<rows.length; i++){
   		var rowCells = rows[i].getElementsByTagName("td");
   		var selField = rowCells[0].getElementsByTagName("INPUT")[0];
   		if(selField.checked){
   			var rowParams = "";
   			for(var j=0; j<idxEditList.length; j++){
   				var idx = parseInt(idxEditList[j])
				var fieldValue = eval("document.forms[0].TDField" + i + "_" + idx);
	   			rowParams += (rowParams == "") ? i + "_" + fieldValue.value : "_" + fieldValue.value;
   			}
   			params += (params == "") ? rowParams : "," + rowParams;
    	}
   	}
	url += "&pk1=" + params;
	doSubmit(url);
}
function changerObjet(tableId, url, idxEditList){
   	var form = document.forms[0]
	var table = document.getElementById(tableId); 
   	if(table == null) return
   
   	var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
   	var rows = tbody.getElementsByTagName("tr");
   	var params = "";
   	for(var i=0; i<rows.length; i++){
   		var rowCells = rows[i].getElementsByTagName("td");
   		var selField = rowCells[0].getElementsByTagName("INPUT")[0];
   		if(selField.checked){
   			var rowParams = "";
   			for(var j=0; j<idxEditList.length; j++){
   				var idx = parseInt(idxEditList[j])
				var fieldValue = eval("document.forms[0].TDField" + i + "_" + idx);
				if((fieldValue.value == "")||(fieldValue.value == null)){
				
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
					
	   			}else{
	   				rowParams += (rowParams == "") ? i + "_" + fieldValue.value : "_" + fieldValue.value;
	   			}
   			}
   			params += (params == "") ? rowParams : "," + rowParams;
    	}
   	}
	url += "&pk1=" + params;
	doSubmit(url);
}
function changerEtude(tableId1,tableId2,url,idxEditList1,idxEditList2){
   	var form = document.forms[0]
	var table1 = document.getElementById(tableId1); 
	var table2 = document.getElementById(tableId2); 
   	if((table1 == null)&&(table2 == null)) return
   
   	var tbodys1 = table.getElementsByTagName("tbody");
    var tbody1 = tbodys1[(tbodys1.length + 1)];
   	var rows1 = tbody1.getElementsByTagName("tr");
   	
   	var tbodys2 = table.getElementsByTagName("tbody");
    var tbody2 = tbodys2[(tbodys2.length + 1)];
   	var rows2 = tbody2.getElementsByTagName("tr");
   	var params = "";
   	  	
   	for(var i=0; i<rows1.length; i++){
   	
   		var rowCells1 = rows1[i].getElementsByTagName("td");
   		var selField1 = rowCells1[0].getElementsByTagName("INPUT")[0];
   		var rowCells2 = rows2[i].getElementsByTagName("td");
   		var selField2 = rowCells2[0].getElementsByTagName("INPUT")[0];
   		var rowParams = "";
   		if((selField1.checked)&&(selField2.checked)){
   			
   			for(var j=0; j<idxEditList1.length; j++){
   				var idx1 = parseInt(idxEditList1[j])
				var fieldValue1 = eval("document.forms[0].TDField" + i + "_" + idx1);
				if((fieldValue1.value == "")||(fieldValue1.value == null)){
				
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
					
	   			}else{
	   				rowParams += (rowParams == "") ? i + "_" + fieldValue1.value : "_" + fieldValue1.value;
	   			}
   			}
   			for(var k=0; k<idxEditList2.length; k++){
   				var idx2 = parseInt(idxEditList2[k])
				var fieldValue2 = eval("document.forms[0].TDField" + i + "_" + idx2);
				if((fieldValue2.value == "")||(fieldValue2.value == null)){
				
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
					
	   			}else{
	   				rowParams += (rowParams == "") ? i + "_" + fieldValue2.value : "_" + fieldValue2.value;
	   			}
   			}
   			params += (params == "") ? rowParams : "," + rowParams;
    	}else if(selField1.checked){
    	
    		for(var j=0; j<idxEditList1.length; j++){
   				var idx1 = parseInt(idxEditList1[j])
				var fieldValue1 = eval("document.forms[0].TDField" + i + "_" + idx1);
				if((fieldValue1.value == "")||(fieldValue1.value == null)){
				
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
					
	   			}else{
	   				rowParams += (rowParams == "") ? i + "_" + fieldValue1.value : "_" + fieldValue1.value;
	   			}
   			}
   			for(var k=0; k<idxEditList2.length; k++){
   				var idx2 = parseInt(idxEditList2[k])
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
			}
    	params += (params == "") ? rowParams : "," + rowParams;
    	}else if(selField2.checked){
    	
    		for(var k=0; k<idxEditList1.length; k++){
   				var idx1 = parseInt(idxEditList1[k])
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
			}
			
    		for(var j=0; j<idxEditList2.length; j++){
   				var idx2 = parseInt(idxEditList2[j])
				var fieldValue2 = eval("document.forms[0].TDField" + i + "_" + idx2);
				if((fieldValue2.value == "")||(fieldValue2.value == null)){
				
					rowParams += (rowParams == "") ? i + "_0"  : "_0";
					
	   			}else{
	   				rowParams += (rowParams == "") ? i + "_" + fieldValue2.value : "_" + fieldValue2.value;
	   			}
   			}
   		params += (params == "") ? rowParams : "," + rowParams;	    	
    	}
   	}
	url += "&pk1=" + params;
	doSubmit(url);
}
function listFonct(url,obj){

	var form = document.forms[0]
	var pk = form.UH_Profil_Code.value;
	form.RC_UH_Act_Code.value = obj.value; 
	url+="&pk1="+pk+"&activite="+obj.value;
	doSubmit(url);
}

function selectList(tableId,url){
	var form = document.forms[0]
	var table = document.getElementById(tableId); 
   	if(table == null) return
   
   	var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
   	var rows = tbody.getElementsByTagName("tr");
   	var params = "";
   	for(var i=0; i<rows.length; i++){
   		var rowCells = rows[i].getElementsByTagName("td");
   		var selField = rowCells[0].getElementsByTagName("INPUT")[0];
   		if(selField.checked){
   			params += (params == "") ? i : "," + i;
   		}
    }
	url += "&pk1=" + params;
	doSubmit(url);
}
function getSelectedElem(tableId,url){
	var form = document.forms[0]
	var table = document.getElementById(tableId); 
   	if(table == null) return
   
   	var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
   	var rows = tbody.getElementsByTagName("tr");
   	var params = "";
   	for(var i=0; i<rows.length; i++){
   		var rowCells = rows[i].getElementsByTagName("td");
   		var selField = rowCells[0].getElementsByTagName("INPUT")[0];
   		if(selField.checked){
   			params =  i;
   		}
    }
	url += "&pk1=" + params;
	doSubmit(url);
}
function selectTwoList(tableId1,tableId2,url){
	var form = document.forms[0]
	var table1 = document.getElementById(tableId1); 
	var table2 = document.getElementById(tableId2);
   	if((table1 == null)||(table2 == null)) return
   
   	var tbody1 = table1.getElementsByTagName("tbody")[0];
   	var tbody2 = table2.getElementsByTagName("tbody")[0];
   	
   	var rows1 = tbody1.getElementsByTagName("tr");
   	var rows2 = tbody2.getElementsByTagName("tr");
   	
   	var params1 = "";
   
   	for(var i=0; i<rows1.length; i++){
   		var rowCells1 = rows1[i].getElementsByTagName("td");
   		var selField1 = rowCells1[0].getElementsByTagName("INPUT")[0];
   		if(selField1.checked){
   			params1 += (params1 == "") ? i : "," + i;
   		}
    }
    var params2 = "";
    for(var j=0; j<rows2.length; j++){
   		var rowCells2 = rows2[j].getElementsByTagName("td");
   		var selField2 = rowCells2[0].getElementsByTagName("INPUT")[0];
   		if(selField2.checked){
   			params2 += (params2 == "") ? j : "," + j;
   		}
    }
	url += "&pk1=" + params1+"_"+params2;
	doSubmit(url);
}

function highlightTableRowsForEdit(tableId, idxEditList, sizeEditList) {
	var form = document.forms[0];
    var previousClass = null;
    var previousValues = new Array();
    var table = document.getElementById(tableId); 
    if(table == null) return
    
    var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
    var rows = tbody.getElementsByTagName("tr");
    // add event handlers so rows light up and are clickable
    for (var i=0; i < rows.length; i++) {
    	var rowCells = rows[i].getElementsByTagName("td");
    	if(rowCells[1].innerText != ">"){
    		rowCells[0].getElementsByTagName("INPUT")[0].disabled = true;
    	}
    	
        rows[i].onmouseover = function() { previousClass=this.className;this.className+=' over' };
        rows[i].onmouseout = function() { this.className=previousClass };
        rows[i].getElementsByTagName("td")[0].getElementsByTagName("INPUT")[0].onclick = function(){
        		var rowIdx = parseInt(this.value);
        		var selRow = rows[rowIdx];
        		var cells = selRow.getElementsByTagName("td");
        		
        		if(cells[1].innerText != ">"){
        			return;
        		}	
        		
        		if(this.checked){
        			var rowValues = new Array();        			
        			for(var j=0; j < idxEditList.length; j++){
        				var idx = idxEditList[j];
        				var size = sizeEditList[j];
						var TDFieldValue = cells[idx].innerText;
						var TDFieldName = "TDField" + rowIdx + "_" + idx;
						var TDField = "<INPUT Type='text' Name='" + TDFieldName + "' Value='" + TDFieldValue + "' size='" + size + "'/>";
						cells[idx].innerHTML = TDField;
						rowValues[j] = TDFieldValue;
					}
					previousValues[previousValues.length] = new Array(rowIdx, rowValues);
        		}else{
        			var rowValues = getList(previousValues, rowIdx);
        			previousValues = removeList(previousValues, rowIdx);
        			for(var j=0; j < idxEditList.length; j++){
						var idx = idxEditList[j];
						cells[idx].innerHTML = rowValues[j];
					}
        		} 
			}
    }
}

function getList(listElem, idx){
	for(var i=0; i<listElem.length; i++){
		if(listElem[i][0] == idx){
			return listElem[i][1];
		}
	}
}

function removeList(listElem, idx){
	var temp = new Array();
	var j = 0;
	for(var i=0; i<listElem.length; i++){
		if(listElem[i][0] != idx){
			temp[j] = listElem[i];
			j++;
		}
	}
	
	return temp;
}

function computeMTEch(){
	var form = document.forms[0];
	var str_mt = form.CF_Abdette_Montotal.value;
	var str_nb = form.CF_Abdette_Nbrech.value;		

	var mt = parseInt((str_mt=="")? "0" : str_mt);
	var nb = parseInt((str_nb=="")? "0" : str_nb);		
	var mtEch = (nb != 0) ? (mt/nb) : 0;
	
	form.CF_Abdette_Montech.value = mtEch;
}
function textLimit(field, maxlen) {
	if (field.value.length > maxlen + 1)
	var msg = "la longueur du champs ne depasse pas";
	alert(msg);
	if (field.value.length > maxlen)
	field.value = field.value.substring(0, maxlen);
}

function getParameter(paramName){
	var url = location.href;
	
	var idx = url.indexOf(paramName);
	if(idx == -1){
		return "";
	}else{
		url = url.substring((idx + paramName.length), url.length);

		var idx2 = url.indexOf("&");
		if(idx2 == -1){
			return url.substring(1, url.length);
		}else{
			url = url.substring(0, idx2);
			return url.substring(1, url.length);
		}
	}	
}

function parseTableToBackupField(tableId, fieldName, uid){
	var form = document.forms[0];
	
	var backupField = eval("document.forms[0]." + fieldName);	
    var table = document.getElementById(tableId); 
    
    if(backupField == null || table == null){
    	return
    }
   
   	var tbodys = table.getElementsByTagName("tbody");
    var tbody = tbodys[(tbodys.length - 1)];
   	var rows = tbody.getElementsByTagName("tr");
   	var rowTemp = "";

   		for(var i=0; i<rows.length; i++){
   		var rowCells = rows[i].getElementsByTagName("td");
   		var cellTemp = "";
   		
   		for(var j=0; j<rowCells.length; j++){
   			var fieldValue = rowCells[j].innerHTML;
   			var fieldValueSeted = false;
   			
	   		var inputFields = rowCells[j].getElementsByTagName("INPUT");
	   		if(inputFields.length > 0 && !fieldValueSeted){
	   			var firstField = inputFields[0];
	   			if(firstField.type == "text"){
					fieldValue = firstField.value;
				}else if(firstField.type == "checkbox" || firstField.type == "radio"){
					fieldValue = firstField.checked;
				}				
				fieldValueSeted = true;
	   		}
	   		
	   		var selectFields = rowCells[j].getElementsByTagName("SELECT");
	   		if(selectFields.length > 0 && !fieldValueSeted){
	   			var firstField = selectFields[0];
				fieldValue = firstField.value;	   			
				fieldValueSeted = true; 					
	   		}
  		
			cellTemp += (cellTemp == "") ? fieldValue : "~~" + fieldValue;
   		}
   		
   		rowTemp += (rowTemp == "") ? cellTemp : "##" + cellTemp;
   	}
   	
   	var page = getParameter("p" + uid);
      	
	backupField.value = (page == "") ? "1=" + rowTemp : page + "=" + rowTemp;	
}
function modePaiement(url) {
	 
	 var form = document.forms[0]
	 var mode = form.RC_Modenc_Code.value;
	 var rib = form.CF_Encmvts_RIB.value;
	 var numCheq = form.CF_Encmvts_Numchqe.value;
	 		
	 if(mode=="C"){
	  	if((rib==null)||(rib.length==0)||(numCheq==null)||(numCheq.length==0)){
	  	
	 		var msg = " Les champs Num cheque et RIB sont obligatoires pour ce mode de paiement!!!";
     		alert(msg);
       }else{
       	doSubmit(url);
       }	
	 }else{
	 	doSubmit(url);
	 }
     
}
function division(obj){

	var form = document.forms[0]
	var mode = obj.value;
	if(mode=="C"){
		RIB.style.display = '';
		
	}else{
		RIB.style.display = 'none';
	}
	
}

function doSubmitWithValidate(url){
	if(validateRE_FicheInterventionForm(document.forms[0])){
		doSubmit(url)
	}
}

function computeDateEcheance(){
	var form = document.forms[0];

	var idx1 = form.rc_Nat_Interv_Cod.selectedIndex;

	if(idx1 == -1)
		return;


	var rc_Nat_Interv_Cod = form.rc_Nat_Interv_Cod[idx1].value;
		
	var idx2 = form.rc_Div_Parent_Code.selectedIndex;

	if(idx2 == -1)
		return;


	var rc_Div_Parent_Code = form.rc_Div_Parent_Code[idx2].value;
		
	var re_Nat_Interv_UrList = form.re_Nat_Interv_Ur.value.split("##");
	var delai = 0;
	for(var i=0; i<re_Nat_Interv_UrList.length;i++){
		var re_Nat_Interv_Ur = re_Nat_Interv_UrList[i].split("~~");
		
		if(parseInt(re_Nat_Interv_Ur[0]) == rc_Nat_Interv_Cod && parseInt(re_Nat_Interv_Ur[1]) == rc_Div_Parent_Code){
			delai = parseInt(re_Nat_Interv_Ur[2]);
		}
	}	
		
	var datePattern = "dd/MM/yyyy";
	var one_Day = 86400000;
	var dateNow = formatDate(new Date(), datePattern);
	var dateNowLong = getDateFromFormat(dateNow, datePattern)
	var dateEcheance = new Date(dateNowLong + (one_Day * delai));
	dateEcheance = formatDate(dateEcheance, datePattern);
		
	document.all.dateEcheance.innerText = dateEcheance;
	form.re_Date_Echeance.value = dateEcheance;
}

	
function computeGlobalDateEcheance(){
	var form = document.forms[0];

	var idx = form.rc_Nature_Reclam_Cod.selectedIndex;

	if(idx == -1)
		return;


	var rc_Nature_Reclam_Cod = form.rc_Nature_Reclam_Cod[idx].value;
				
	var rc_Nature_Reclam_DelaiList = form.rc_Nature_Reclam_DelaiList.value.split("##");
	var delai = 0;
	for(var i=0; i<rc_Nature_Reclam_DelaiList.length;i++){
		var rc_Nature_Reclam_Delai = rc_Nature_Reclam_DelaiList[i].split("~~");
		
		if(parseInt(rc_Nature_Reclam_Delai[0]) == rc_Nature_Reclam_Cod){
			delai = parseInt(rc_Nature_Reclam_Delai[1]);
		}
	}	
		
	var datePattern = "dd/MM/yyyy";
	var one_Day = 86400000;
	var dateNow = formatDate(new Date(), datePattern);
	var dateNowLong = getDateFromFormat(dateNow, datePattern)
	var dateEcheance = new Date(dateNowLong + (one_Day * delai));
	dateEcheance = formatDate(dateEcheance, datePattern);
		
	document.all.re_Fi_DateEcheanceDiv.innerText = dateEcheance;
	form.re_Fi_DateEcheance.value = dateEcheance;
}

function computeResponsableFils(disabled){
	var form = document.forms[0];

	var idx1 = form.rc_Div_Parent_Code.selectedIndex;

	if(idx1 == -1)
		return;


	var rc_Div_Parent_Code = form.rc_Div_Parent_Code[idx1].value;
		
	var rc_ResponsableFilsList = form.rc_ResponsableFils.value.split("##");

	var htmlTemp = "<select name='rc_Div_Code'>\n\r";
	for(var i=0; i<rc_ResponsableFilsList.length;i++){
		var rc_ResponsableFils = rc_ResponsableFilsList[i].split("~~");
			
		if(parseInt(rc_ResponsableFils[2]) == rc_Div_Parent_Code){
			htmlTemp += "<option value='" + rc_ResponsableFils[0] + "'>" + rc_ResponsableFils[1] + "</option>"
		}
	}	
	htmlTemp += "</select>"

	document.all.responsableFils.innerHTML = htmlTemp

	var rc_Resp_Code = form.rc_Resp_Code.value
	for(var i=0; i<form.rc_Div_Code.length; i++){
		if(parseInt(form.rc_Div_Code[i].value) == parseInt(rc_Resp_Code)){
			form.rc_Div_Code.selectedIndex = i;
		}
	}

	form.rc_Div_Code.disabled = disabled;
}

	
function setSelectedValues(){
	var form = document.forms[0]
		
	var rc_Resp_Code = form.rc_Resp_Code.value
	var rc_ResponsableFilsList = form.rc_ResponsableFils.value.split("##");
	var rc_Div_Parent_Code = "";		
	for(var i=0; i<rc_ResponsableFilsList.length;i++){
		var rc_ResponsableFils = rc_ResponsableFilsList[i].split("~~");
			
		if(parseInt(rc_ResponsableFils[0]) == rc_Resp_Code){
			rc_Div_Parent_Code = rc_ResponsableFils[2];
		}
	}

	for(var i=0; i<form.rc_Div_Parent_Code.length; i++){
		if(parseInt(form.rc_Div_Parent_Code[i].value) == parseInt(rc_Div_Parent_Code)){
			form.rc_Div_Parent_Code.selectedIndex = i;
		}
	}	
}
	
function computeCausesReclamtion(){
	var form = document.forms[0];

	var idx1 = form.rc_Nature_Reclam_Cod.selectedIndex;

	if(idx1 == -1)
		return;


	var rc_Nature_Reclam_Cod = form.rc_Nature_Reclam_Cod[idx1].value;

	var rc_CauseReclamationList = form.rc_Categorie_Reclam_CodList.value.split("##");

	var htmlTemp = "<select name='rc_Categorie_Reclam_Cod'>\n\r";
	for(var i=0; i<rc_CauseReclamationList.length;i++){
		var rc_CauseReclamation = rc_CauseReclamationList[i].split("~~");
		
		if(parseInt(rc_CauseReclamation[2]) == rc_Nature_Reclam_Cod){
			htmlTemp += "<option value='" + rc_CauseReclamation[0] + "'>" + rc_CauseReclamation[1] + "</option>"
		}
	}	
	htmlTemp += "</select>"

	document.all.rc_Categorie_Reclam_CodDiv.innerHTML = htmlTemp

	var rc_Categorie_Reclam = form.rc_Categorie_Reclam.value
	for(var i=0; i<form.rc_Categorie_Reclam_Cod.length; i++){
		if(parseInt(form.rc_Categorie_Reclam_Cod[i].value) == parseInt(rc_Categorie_Reclam)){
			form.rc_Categorie_Reclam_Cod.selectedIndex = i;
		}
	}
}


function showHideNature(disabled){
	var form = document.forms[0]

	var re_Fi_Br_Reclam_Prestation = form.re_Fi_Br_Reclam_Prestation;
	if(re_Fi_Br_Reclam_Prestation[0].checked){
		re_Fi_NatureDiv.style.display = "";
		computeCausesReclamtion();
		computeGlobalDateEcheance();
		form.rc_Categorie_Reclam_Cod.disabled = disabled;
	}else{
		re_Fi_NatureDiv.style.display = "none";
	}	
}

function showHideNatureODR(disabled){
	var form = document.forms[0]

	var re_ODR_Br_Reclam_Prestation = form.re_ODR_Br_Reclam_Prestation;
	if(re_ODR_Br_Reclam_Prestation[0].checked){
		re_ODR_NatureDiv.style.display = "";
		
	}else{
		re_ODR_NatureDiv.style.display = "none";
	}	
}

function showHideDemandeur(disabled){
	if(disabled)
		return

	var form = document.forms[0]
	var re_Fi_Br_Demandeur = form.re_Fi_Br_Demandeur
	if(re_Fi_Br_Demandeur[0].checked){
		form.re_Fi_Unite_Demandeur.disabled = true;
		form.re_Fi_Motif.disabled = true;
	}else if(re_Fi_Br_Demandeur[1].checked){
		form.re_Fi_Unite_Demandeur.disabled = false;
		form.re_Fi_Motif.disabled = false;
	}
}	
function showHideDemandeurODR(disabled){
	if(disabled)
		return

	var form = document.forms[0]
	var re_ODR_Br_Demandeur = form.re_ODR_Br_Demandeur
	if(re_ODR_Br_Demandeur[0].checked){
		form.re_ODR_Unite_Demandeur.disabled = true;
		form.re_ODR_Motif.disabled = true;
	}else if(re_ODR_Br_Demandeur[1].checked){
		form.re_ODR_Unite_Demandeur.disabled = false;
		form.re_ODR_Motif.disabled = false;
	}
}
	
function computeCompteurProp(){
	var form = document.forms[0]

	var idx = form.re_Fi_Compteur_Num.selectedIndex;

	if(idx == -1){
		document.all.rc_Ccpteur_CodeDiv.innerText = '';
		document.all.re_Fi_Compteur_IndexDiv.innerText = '';
		document.all.rc_Tarif_CodeDiv.innerText = '';

		form.rc_Ccpteur_Code.value = '';
		form.re_Fi_Compteur_Index.value = '';
		form.rc_Tarif_Code.value = ''; 
		return;
	}
	
	var re_Fi_Compteur_Num = form.re_Fi_Compteur_Num[idx].value;

	var rc_Cptr_PropList = form.rc_Cptr_Prop.value.split("##");
	var rc_Ccpteur_Code = "";
	var re_Fi_Compteur_Index = "";
	var rc_Tarif_Code = "";

	for(var i=0; i<rc_Cptr_PropList.length; i++){
		var propList = rc_Cptr_PropList[i].split("~~");
		if(re_Fi_Compteur_Num == propList[0]){
			rc_Ccpteur_Code = propList[1];
			rc_Tarif_Code = propList[2];
			re_Fi_Compteur_Index = propList[3];

			break;
		}
	}

	document.all.rc_Ccpteur_CodeDiv.innerText = rc_Ccpteur_Code;
	document.all.re_Fi_Compteur_IndexDiv.innerText = re_Fi_Compteur_Index;
	document.all.rc_Tarif_CodeDiv.innerText = rc_Tarif_Code;

	form.rc_Ccpteur_Code.value = rc_Ccpteur_Code;
	form.re_Fi_Compteur_Index.value = re_Fi_Compteur_Index;
	form.rc_Tarif_Code.value = rc_Tarif_Code;        
}

function computeCompteurElecGaz(disabled){
	var form = document.forms[0];

	
	var rc_CpteurList = form.rc_Cptr_String.value.split("##");
	
	if(rc_CpteurList.length==0){
		return;
	}
	
	var htmlTemp = "<select name='re_Fi_Compteur_Num' onchange = 'computeCompteurProp();'>\n\r";
	
	
		
		if(form.re_Fi_Br_Elec_Gaz[0].checked){
			for(var i=0; i<rc_CpteurList.length;i++){
				var rc_Cpteur = rc_CpteurList[i].split("~~");
				
				if(parseInt(rc_Cpteur[1]) < 40){
					htmlTemp += "<option value='" + rc_Cpteur[0] +
					 "'> " + rc_Cpteur[0] + "</option>"
				}
			}
		}else if(form.re_Fi_Br_Elec_Gaz[1].checked){
			for(var i=0; i<rc_CpteurList.length;i++){
				var rc_Cpteur = rc_CpteurList[i].split("~~");
				
				if(parseInt(rc_Cpteur[1]) >= 40){
					htmlTemp += "<option value='" + rc_Cpteur[0] +
					 "'> " + rc_Cpteur[0] + "</option>"
				}
			}
		}
		htmlTemp += "</select>"
		document.all.rc_Ccpteur_NumDiv.innerHTML = htmlTemp
		
		form.re_Fi_Compteur_Num.disabled = disabled;
		
		
		computeCompteurProp();
		
}

function computeCompteurElecGazODR(disabled){
	var form = document.forms[0];

	
	var rc_CpteurList = form.rc_Cptr_String.value.split("##");
	
	if(rc_CpteurList.length==0){
		return;
	}
	
	var htmlTemp = "<select name='re_ODR_Compteur_Num' onchange = 'computeCompteurPropODR();'>\n\r";
	
	
		
		if(form.re_ODR_Br_Elec_Gaz[0].checked){
			for(var i=0; i<rc_CpteurList.length;i++){
				var rc_Cpteur = rc_CpteurList[i].split("~~");
				
				if(parseInt(rc_Cpteur[1]) < 40){
					htmlTemp += "<option value='" + rc_Cpteur[0] +
					 "'> " + rc_Cpteur[0] + "</option>"
				}
			}
		}else if(form.re_ODR_Br_Elec_Gaz[1].checked){
			for(var i=0; i<rc_CpteurList.length;i++){
				var rc_Cpteur = rc_CpteurList[i].split("~~");
				
				if(parseInt(rc_Cpteur[1]) >= 40){
					htmlTemp += "<option value='" + rc_Cpteur[0] +
					 "'> " + rc_Cpteur[0] + "</option>"
				}
			}
		}
		htmlTemp += "</select>"
		document.all.rc_Ccpteur_NumDiv.innerHTML = htmlTemp
		
		form.re_ODR_Compteur_Num.disabled = disabled;
		
		
		computeCompteurPropODR();
		
}

function computeCompteurPropODR(){
	var form = document.forms[0]

	var idx = form.re_ODR_Compteur_Num.selectedIndex;

	if(idx == -1){
		document.all.rc_Ccpteur_CodeDiv.innerText = '';
		document.all.re_ODR_Compteur_IndexDiv.innerText = '';
		document.all.rc_Tarif_CodeDiv.innerText = '';
	
		form.rc_Ccpteur_Code.value = '';
		form.re_ODR_Compteur_Index.value = '';
		form.rc_Tarif_Code.value = '';
		return;
	}
	var re_ODR_Compteur_Num = form.re_ODR_Compteur_Num[idx].value;

	var rc_Cptr_PropList = form.rc_Cptr_Prop.value.split("##");
	var rc_Ccpteur_Code = "";
	var re_ODR_Compteur_Index = "";
	var rc_Tarif_Code = "";

	for(var i=0; i<rc_Cptr_PropList.length; i++){
		var propList = rc_Cptr_PropList[i].split("~~");
		if(re_ODR_Compteur_Num == propList[0]){
			rc_Ccpteur_Code = propList[1];
			rc_Tarif_Code = propList[2];
			re_ODR_Compteur_Index = propList[3];

			break;
		}
	}

	document.all.rc_Ccpteur_CodeDiv.innerText = rc_Ccpteur_Code;
	document.all.re_ODR_Compteur_IndexDiv.innerText = re_ODR_Compteur_Index;
	document.all.rc_Tarif_CodeDiv.innerText = rc_Tarif_Code;

	form.rc_Ccpteur_Code.value = rc_Ccpteur_Code;
	form.re_ODR_Compteur_Index.value = re_ODR_Compteur_Index;
	form.rc_Tarif_Code.value = rc_Tarif_Code;        
}

function showHideCauses(){
		var form = document.forms[0];
		var idx = document.forms[0].re_TraitEtat.selectedIndex;
		if(idx==0){
			form.buttonfintrait.style.display = 'none';
			causesReclam.style.display = 'none';
			etapeSuivante.style.display = 'none';
			rempCompteur.style.display = 'none';
			document.forms[0].re_TraitRaisonNonTraitCode.disabled='';
			showHideCpteur('none');
			
		}else{
			form.buttonfintrait.style.display = '';
			causesReclam.style.display = '';
			etapeSuivante.style.display = '';
			document.forms[0].re_TraitRaisonNonTraitCode.disabled='false';
			showHideCpteur('');
			 computeResponsableFils(false);
			 computeDateEcheance();
		}
		
		
}

function computeIntervenantFils(disabled){
	var form = document.forms[0];

	var idx1 = form.rc_Intervenant_Parent_Code.selectedIndex;

	if(idx1 == -1)
		return;


	var rc_Intervenant_Parent_Code = form.rc_Intervenant_Parent_Code[idx1].value;
		
	var rc_IntervenantFilsList = form.rc_IntervenantFils.value.split("##");

	var htmlTemp = "<select name='rc_Intervenant_Select'>\n\r";
	for(var i=0; i<rc_IntervenantFilsList.length;i++){
		var rc_IntervenantFils = rc_IntervenantFilsList[i].split("~~");
			
		if(parseInt(rc_IntervenantFils[2]) == rc_Intervenant_Parent_Code){
			htmlTemp += "<option value='" + rc_IntervenantFils[0] + "'>" + rc_IntervenantFils[1] + "</option>"
		}
	}	
	htmlTemp += "</select>"

	document.all.IntervenantFils.innerHTML = htmlTemp

	var rc_Intervenant_Code = form.rc_Intervenant_Code.value
	for(var i=0; i<form.rc_Intervenant_Select.length; i++){
		if(parseInt(form.rc_Intervenant_Select[i].value) == parseInt(rc_Intervenant_Code)){
			form.rc_Intervenant_Select.selectedIndex = i;
		}
	}

	form.rc_Intervenant_Select.disabled = disabled;
}

function showHideCpteur(param){
	
		var nature_interv_code = document.forms[0].rc_LastEtape_Interv_Cod.value;
		if(nature_interv_code=="2"){
			rempCompteur.style.display = param;
		}
		
}
function hideCauseRetard(){
		
		var form = document.forms[0];
		var reste = form.re_TraitReste.value;
		if(parseInt(reste)>=0){
			form.re_TraitCauseRetardCode.disabled='false';
			}
		
}
function computeCompteurPropRealisODR(){
	var form = document.forms[0]

	var idx = form.re_ODR_Compteur_Num.selectedIndex;

	if(idx == -1)
		return;

	var re_ODR_Compteur_Num = form.re_ODR_Compteur_Num[idx].value;

	var rc_Cptr_PropList = form.rc_Cptr_Prop.value.split("##");
	var rc_Ccpteur_Code = "";
	var re_ODR_Compteur_Index = "";
	var rc_Tarif_Code = "";

	for(var i=0; i<rc_Cptr_PropList.length; i++){
		var propList = rc_Cptr_PropList[i].split("~~");
		if(re_ODR_Compteur_Num == propList[0]){
			rc_Ccpteur_Code = propList[1];
			rc_Tarif_Code = propList[2];
			re_ODR_Compteur_Index = propList[3];

			break;
		}
	}

	document.all.rc_Ccpteur_CodeDiv.innerText = rc_Ccpteur_Code;
	document.all.re_ODR_Compteur_IndexDiv.innerText = re_ODR_Compteur_Index;
	document.all.rc_Tarif_CodeDiv.innerText = rc_Tarif_Code;

	form.rc_Ccpteur_Code.value = rc_Ccpteur_Code;
	form.re_ODR_Compteur_Index.value = re_ODR_Compteur_Index;
	form.rc_Tarif_Code.value = rc_Tarif_Code;        
}

	
//window.onload = highlightFormElements;

// Show the document's title on the status bar
window.defaultStatus=document.title;

