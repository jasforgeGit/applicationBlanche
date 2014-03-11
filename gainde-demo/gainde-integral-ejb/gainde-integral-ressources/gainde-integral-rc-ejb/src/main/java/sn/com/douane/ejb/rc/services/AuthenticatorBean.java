package sn.com.douane.ejb.rc.services;

import java.util.List;
import org.apache.log4j.Logger;

import javax.ejb.EJB;
import javax.ejb.Stateless;

//import org.apache.log4j.Logger;

import sn.com.douane.ejb.rc.model.dao.IDelegationDao;
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dao.IPpmDao;
import sn.com.douane.ejb.rc.model.dao.IProfilGroupeDao;
import sn.com.douane.ejb.rc.model.dao.IRegroupFonctionsDao;
import sn.com.douane.ejb.rc.model.dao.IUtilisateurDao;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.Ppm;
import sn.com.douane.ejb.rc.model.entities.Profil;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.RegroupFonctions;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.utils.ConstManif;
import sn.com.douane.utils.sysEnv;



@Stateless(name = "IAuthenticator")
public class AuthenticatorBean implements IAuthenticator {
	
	
	@EJB
	private IUtilisateurDao utilisateurDao; 
	
	@EJB
	private IDelegationDao delegationDao;
		
	@EJB
	private IPpmDao ppmDao;
	
	@EJB
	private IFonctionnalitesDao fonctioannaliteDao;
	
	@EJB
	private IGroupeFonctionDao groupefonctionDao;
	
	@EJB
	private IProfilGroupeDao profilGroupeDao;
	
	@EJB
	private IRegroupFonctionsDao regroupFonctionsDao;

	private List<String> listDelegation;
	
	public AuthenticatorBean() {
		super();
	}

	private static final Logger logger = Logger.getLogger(AuthenticatorBean.class); 
	
	public Utilisateur rechercheUtilisateur(String pk) {
		
		Utilisateur rmt = null;
		Utilisateur utilisateurVo = null;
		StringBuffer buffer = new StringBuffer();
				
	        try {
	        	
	            Ppm ppm = null;
	            List<Delegation> delegations = null;
	            long debut = System.currentTimeMillis();
	            rmt = utilisateurDao.findByPrimaryKey(pk);
	            long fin = System.currentTimeMillis();
	            System.out.print("temps de recherche de user dans authenticator bean = "+(fin-debut));
	            utilisateurVo = rmt;
	            
	            listDelegation = delegationDao.recherchelisteFonctDeleguants(rmt.getRcCodUser());
	            
	            logger.debug("type user = "+utilisateurVo.gettypeUser());
	      
	            if  (!utilisateurVo.getRcTypeUser().equals("A") && utilisateurVo.getRcCodUser() !=null 
	            		&& utilisateurVo.getRcCodUser().length() >= 6
						&& utilisateurVo.gettypeUser()!=null

						&& !utilisateurVo.gettypeUser().getRcTypeUser().equals(ConstManif.TYPE_USER_TRESOR)) {

		           
	                String codeppm = utilisateurVo.getRcCodUser().substring(1, 6);
	                long debutppm = System.currentTimeMillis();
	                List<Ppm> listPpm = (List<Ppm>) ppmDao.rechercherByWhere(" from Ppm where rccodeppm ='"+codeppm+"'");
	                long finppm = System.currentTimeMillis();
	                System.out.print("temps de recherche de ppm = "+(finppm-debutppm));
	                ppm = listPpm.get(0);
	                utilisateurVo.setCodeagree(ppm.getRccodeagree());
	                utilisateurVo.setCodeppm(ppm.getRccodeppm());
	                utilisateurVo.setCodecreditaire(ppm.getRccodecreditaire());

	            } 
	            
	            else {	            	
	            	utilisateurVo.setCodeagree("");
	            	utilisateurVo.setCodeppm("");
	            	utilisateurVo.setCodecreditaire("");          	
	            	
	            }	            

	            delegations = delegationDao.recherchelisteFonctDelegues(utilisateurVo.getRcCodUser());
	            
				if (delegations.size() > 0) {	              
					utilisateurVo.setNomxml(utilisateurVo.getRcCodUser());
	            } 

	           Utilisateur utilisateurVO = new Utilisateur(); 	    
	          
	           Profil profil = rmt.getProfilUser();
	           
	           
	           
	           logger.debug(">>>> rechercheUtilisateur ................");
	                
	           buffer.append("<table cellspacing=\"0\" cellpadding=\"0\" border=\"0\" align=\"left\" width=\"100%\" class=\"FORM\">"+"<tr>"+
			   "<td valign=\"top\">"+
			   "<table cellspacing=\"1\" cellpadding=\"1\" border=\"0\" width=\"100%\">"+
			   "<tr><td>"+
			   "<table border=\"0\" cellspacing=\"0\"  align=\"left\" cellpadding=\"0\" width=\"100%\" id=\"treeView0\">");
	              
	           String codeConsignataire = ""; 
	           
	           if (ppm!=null) {
	        	   codeConsignataire =  ppm.getRccodeconsignataire(); 
	           }
	           
	           //ici chargement tableau
	           String chaine1="<script>"+ "\n" + "$(document).ready(function() {"+ "\n" + "    $(\"#treeViewDiv\").jstree({"+"\n"+"            \"json_data\" : {"+"\n"+"			\"data\":["+"\n"+"                           ";
	   		String chaine5=" \"themes\" :" +"\n"
	   			    +"{" +"\n"
	   				+" \"theme\":"+"\"apple\"" +"\n"
	   			    +"}," +"\n" 
	   		        +"\"plugins\" : [  \"themes\","+" \"json_data\""+" , \"ui\"]" +"\n"
	   	           + "}).bind(\"select_node.jstree\" "+" , function(e, data)" +"\n"
	   		        +"{" +"\n"
	   	           +"if(jQuery.data(data.rslt.obj[0], "+" \"href\")) "+"\n"
	   	            +"{" +"\n"
	   	           +"window.location=jQuery.data(data.rslt.obj[0],"+"\"href\");" +"\n"
	   	            +"}" +"\n" 
	   		        +"else" +"\n"
	   	            +"{" +"\n"
	   	            +"}" +"\n"
	   	            +"})"+"\n"
	   	            +"});" +"\n"
	   	            +"</script>" +"\n"
	   	            +"</head>"+"\n"
	   	            +"<body>"+"\n"
	   	               +" <div id=\"treeViewDiv\">"+"\n"
	   	                +"</div>" +"\n"
	   	            +"</body>" +"\n"
	   	            +"<script type=\"text/javscript\">" +"\n"
	   	        	+"$(document).ready(function(){" +"\n"
	   	        	+"});" +"\n"
	   	            +"</script>"+"\n"
	   	           +"</html>";
	   		buffer.append(chaine1);
	           buffer.append(getlistfonction(utilisateurVO.getRcCodUser(), profil.getRcCodeProfil(),codeConsignataire,false));
	           	           
	            List<Delegation> listdel = delegationDao.rechercheDelegants(sysEnv.ToDay());

	            for (int i = 0; i < listdel.size(); i++) {
	            	
	                Delegation delegation = (Delegation) listdel.get(i);
	                
	                if(delegation.getAgentDestinataire() != null && delegation.getAgentDestinataire().equals(rmt.getRcCodUser())){
		               
		                Fonctionnalite fonctionnalite = null;	                    
		                List<Fonctionnalite> listFonctionnalite = ((List<Fonctionnalite>) fonctioannaliteDao.rechercherByWhere(delegation.getCodeFonction()));
		                fonctionnalite = listFonctionnalite.get(0);
		                buffer.append("{\"data\":\" "+ fonctionnalite.getRcLibFonction()+"\""+","+"\"metadata\":{\"href\":\""+fonctionnalite.getRcUrlFonction()+""+fonctionnalite.getRcCodeFonction()+"\"}"+"}"+"\n,");                                        	              	              
	                }
	            }
	            buffer.append("]}, ");
	            buffer.append(chaine5);
	            buffer.append("</tr></table></td></tr></table></td></tr></table>");            
	            
	           
	            utilisateurVo.setXml(buffer.toString());	
	            
	            
	        } catch (Exception e) {
	        	logger.error(e.getMessage());
	        }
	        
	             
	        return utilisateurVo;
	      
	    }
	
	private String getlistfonction(String codeuser, String codeprofil, String codeconsign, boolean isdeleg) {       
        
        String xml = "";
		String treeviewParents[] = new String[300];
        String treeviewFeuilles[][] = new String[300][300];
        String treeviewUrls[][] = new String[300][300];
        String treeviewChildren[][] = new String[300][300];
		
		StringBuffer sb = new StringBuffer ();
        
        try {
                 
            List<ProfilGroupe> vectgrpf = profilGroupeDao.rechercherDetailProfilProfilGroupe(codeprofil);

            for (int i = 0; i < vectgrpf.size(); i++) {
                ProfilGroupe profilgroupe = (ProfilGroupe) vectgrpf.get(i);
                GroupeFonction groupefonction = (GroupeFonction) groupefonctionDao.rechercherByCodeFonctionInOrder(profilgroupe.getRcCodeGroupe());
                treeviewParents [i] = groupefonction.getRcLibGroupe();
               
                if (groupefonction.getRcCodeGrpPere() == null || (groupefonction.getRcCodeGrpPere().toString().compareTo("") == 0)) {
                	  	sb.append("\n 		{\"data\": "+ "\""+treeviewParents[i]+"\","+"\n");   	
              
                    List<RegroupFonctions> vectfonct = regroupFonctionsDao.rechercherByGroupefonction(profilgroupe.getRcCodeGroupe());
                    if(vectfonct!=null){
                    for (int f = 0; f < vectfonct.size(); f++) {              	
                        RegroupFonctions regroupfonctions = (RegroupFonctions) vectfonct.get(f);
                        try {
                            Fonctionnalite fonctionnalite = null;
                            List<Fonctionnalite> listFonctionnalite = (List<Fonctionnalite>) fonctioannaliteDao.rechercherByWhere("from Fonctionnalite where rcCodeFonction ='"+ regroupfonctions.getRcCodeFonction()+"'");
                            fonctionnalite = listFonctionnalite.get(0);
                            String cft = "";                            
                            if(f==0){
                            	sb.append("\"children\":[");
                            }
                            if(!listDelegation.contains(fonctionnalite.getRcCodeFonction())) {
                            if (!fonctionnalite.getRcUrlFonction().equals("") && fonctionnalite.getRcUrlFonction() != null){
                            	
                            if ((fonctionnalite.getRcUrlFonction().substring(0,4)).equals("http")) {                            	
                                cft="?Codeconsign="+codeconsign;                               
                                fonctionnalite.setRcCodeFonction("");
                            } else {
                                cft="&cft=";
                            }
                            
                            }
                            treeviewFeuilles [i][f] = fonctionnalite.getRcLibFonction();
                            treeviewUrls[i][f]=fonctionnalite.getRcUrlFonction();
							
                            sb.append("{\"data\":\" "+ treeviewFeuilles [i][f]+"\""+","+"\"metadata\":{\"href\":\""+treeviewUrls[i][f]+""+cft+""+treeviewUrls[i][f]+"\"}"+"}"+"\n,");
                            }
                            if(f==vectfonct.size()-1){
                        	  sb.append("] \n }, \n");
                          }
                        } catch (Exception e) {
                          logger.error("getlistfonction : "       + e.getMessage());
                        }
                    }
                    // Gestion des menus fils de la fonctionnalite
                    List<GroupeFonction> vectgrpfils = groupefonctionDao.rechercherByCodeGroupePereInOrder(profilgroupe.getRcCodeGroupe());
                    if (vectgrpfils.size() != 0) {
                    	 
                        for (int grp = 0; grp < vectgrpfils.size(); grp++) {
                        	GroupeFonction groupefonctionVOfils = (GroupeFonction) vectgrpfils.get(grp);
                        	treeviewChildren[i][grp] =groupefonctionVOfils.getRcLibGroupe();
                            if(grp==0){
                            	if(vectfonct.size()==0){
                            		sb.append("\"children\":[");
                            	}
                            	sb.append("{\"data\":\" "+ treeviewChildren[i][grp]+"\""+""+" "+" \n,");
                            } else {
                                sb.append("{\"data\":\" "+ treeviewChildren[i][grp]+"\""+" "+" "+" \n,");
							}	
                            
                            List<RegroupFonctions> vectfonct2 = regroupFonctionsDao.rechercherByGroupefonction(groupefonctionVOfils.getRcCodeGroupe());
                            if(vectfonct2==null || vectfonct2.size()==0){
                            	sb.append(" \"children\" : [ ] \n } ,");
                            }
                            
                            if(vectfonct2 != null && vectfonct2.size() != 0){
                            for (int f = 0; f < vectfonct2.size(); f++) {
                                RegroupFonctions regroupfonctionsVO2 = (RegroupFonctions) vectfonct2.get(f);                                                             	
                                Fonctionnalite fonctionnalitesVO2 = null;
                                List<Fonctionnalite> listFonctionnalite = (List<Fonctionnalite>)(fonctioannaliteDao.rechercherByWhere("from Fonctionnalite where rcCodeFonction ='"+regroupfonctionsVO2.getRcCodeFonction()+"'"));                                
                                fonctionnalitesVO2 = listFonctionnalite.get(0);
                                if(f==0) {
                                	sb.append("\"children\":[");
                                } 
                                if(!listDelegation.contains(fonctionnalitesVO2.getRcCodeFonction())) {
                                	treeviewChildren[i][f] =fonctionnalitesVO2.getRcLibFonction();
                                    treeviewUrls[i][f]=fonctionnalitesVO2.getRcUrlFonction();
                                	sb.append("{\"data\":\" "+ treeviewChildren[i][f]+"\""+","+"\"metadata\":{\"href\":\""+treeviewUrls[i][f]+"\"}"+"}"+"  \n  ,  ");
                                }
                                if(f==vectfonct2.size()-1){
                              	  sb.append("] \n } , \n"); 
                                }
                              
                            }
                            
                        }
                            if(grp== vectgrpfils.size()-1 && (vectfonct.size()==0)){
                            	sb.append("] \n } , \n");
                            }
                        }
                    }             
	                if(vectfonct.size()==0 && vectgrpfils.size()==0){
	                	sb.append(" \"children\" : [ ] \n } , \n");
	                }    
                }          
                }
            }
                
        } catch (Exception e1) {
        	logger.error(e1.getMessage());           
        }
        xml=sb.toString();
        return xml;
    }

}


