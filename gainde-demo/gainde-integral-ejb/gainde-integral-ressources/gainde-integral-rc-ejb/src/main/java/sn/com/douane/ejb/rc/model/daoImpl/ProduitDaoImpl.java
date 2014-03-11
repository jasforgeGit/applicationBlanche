package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.NoResultException;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IProduitDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.ProduitDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Produit;

@Stateless(name = "IProduitDao")
public class ProduitDaoImpl extends GenericDaoImpl<Produit> implements
		IProduitDao {

	public String getLibelleTarifProduit(String codeprod, String precuemoa, String precSenegal) throws RcEjbException {		
		String libelle="";
		try{
			Query query = entityManager.createQuery(" select p from Produit p where p.rccodeprod = ?1 and p.rcprecuemoa = ?2 and p.rcprecsenegal = ?3 ");
			query.setParameter(1, codeprod);
			query.setParameter(2, precuemoa);
			query.setParameter(3, precSenegal);		
			Produit produit  = (Produit) query.getSingleResult();
			if(produit != null){
				libelle= produit.getRclibelletarif();
			}
		}catch(NoResultException e){
			// no result found
		}
		return libelle;

	}

	@SuppressWarnings("unchecked")
	public List<Produit> getListProduitsPetroliers() throws RcEjbException {
		return (List<Produit>) rechercherByWhere("from Produit where rcindprodpetrolier='1'");
	}
	
	public List<ProduitDto> rechercheByWhereProduits(String where) throws RcEjbException {
		List<ProduitDto> result = new ArrayList<ProduitDto>(); 	
		try {
			List<Produit> listeProduit = (List<Produit>) rechercherByWhere(where);
			for (int i=0; i<listeProduit.size(); i++) {
				ProduitDto produitDto = getProduitDto(listeProduit.get(i));
				result.add(produitDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public ProduitDto getProduitDto(Produit produit) {
		ProduitDto produitDto = new ProduitDto();
		if (produit!=null){
			produitDto.setRccodeprod(produit.getRccodeprod());
			produitDto.setRcprecuemoa(produit.getRcprecuemoa());
			produitDto.setRcprecsenegal(produit.getRcprecsenegal());
			produitDto.setRclibelletarif(produit.getRclibelletarif());
			produitDto.setRccodeposition(produit.getRccodeposition());
			produitDto.setRccommprod(produit.getRccommprod());
			produitDto.setRcindprodpetrolier(produit.getRcindprodpetrolier());
			produitDto.setRccodeprodcru(produit.getRccodeprodcru());
			produitDto.setRccodeprodartisanal(produit.getRccodeprodartisanal());
			produitDto.setRcunitecomp(produit.getRcunitecomp());
			produitDto.setRcsectactprod(produit.getRcsectactprod());
			produitDto.setRccodetransit(produit.getRccodetransit());
			produitDto.setRccodebienequip(produit.getRccodebienequip());
			produitDto.setRcvalequipprod(produit.getRcvalequipprod());
			produitDto.setRccodeentrepot(produit.getRccodeentrepot());
			produitDto.setRccodeprodsocial(produit.getRccodeprodsocial());
			produitDto.setRcvalspecprod(produit.getRcvalspecprod());
			produitDto.setRcvalchapitre(produit.getRcvalchapitre());
			produitDto.setRccodeclasse(produit.getRccodeclasse());
			produitDto.setRccodeperissable(produit.getRccodeperissable());
			produitDto.setRccodesection(produit.getRccodesection());
			produitDto.setRcactif(produit.getRcactif());
			produitDto.setRcexonorepvi(produit.getRcexonorepvi());
			produitDto.setDelCell(produitDto.getPk());
			produitDto.setEditCell(produitDto.getPk()); 
			}
		return produitDto;
	}
}
