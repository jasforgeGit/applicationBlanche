package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.exception.TwreException;
import sn.com.douane.ejb.rc.model.dao.IProduitPjtDao;
import sn.com.douane.ejb.rc.model.dto.ProduitPjtDto;
import sn.com.douane.ejb.rc.model.entities.ProduitPjt;


@Stateless(name="IProduitPjtDao")
public class ProduitPjtDaoImpl extends GenericDaoImpl<ProduitPjt> implements IProduitPjtDao{

	@SuppressWarnings("unchecked")
	public List<ProduitPjt> rechercherByArticle(String codeprod, String precisuemoa,
			String precissenegale) throws TwreException {
		Query query1 = entityManager.createNamedQuery("findByArticle");
		query1.setParameter(1, codeprod);
		query1.setParameter(2, precisuemoa);
		query1.setParameter(3, precissenegale);
		return (List<ProduitPjt>) query1.getResultList();
	}
	
	public List<ProduitPjtDto> rechercheByWhereProduitPjt(String where) throws RcEjbException{
		List<ProduitPjtDto> result = new ArrayList<ProduitPjtDto>(); 	
		try {
			List<ProduitPjt> listeProduitPjt = (List<ProduitPjt>) rechercherByWhere(where);
			for (int i=0; i<listeProduitPjt.size(); i++) {
				ProduitPjtDto produitPjtDto = getProduitPjtDto(listeProduitPjt.get(i));
				result.add(produitPjtDto); 
			}	
		}catch(Exception e) {
			throw new RcEjbException(ConstErrCod.rowNotFound); 
		}
		return result;
		
	}	
	public ProduitPjtDto getProduitPjtDto(ProduitPjt produitPjt) {
		ProduitPjtDto produitPjtDto = new ProduitPjtDto();
		if (produitPjt!=null){
			produitPjtDto.setRccodeproduit(produitPjt.getRccodeproduit());
			produitPjtDto.setRcprecuemoaprod(produitPjt.getRcprecuemoaprod());
			produitPjtDto.setRcprecsenprod(produitPjt.getRcprecsenprod());
			produitPjtDto.setRccodepiecejointe(produitPjt.getRccodepiecejointe());
			produitPjtDto.setRcdatepiecejointe(produitPjt.getRcdatepiecejointe());
			produitPjtDto.setRcimportexport(produitPjt.getRcimportexport());
			produitPjtDto.setDatePieceJointe(produitPjt.getDatePieceJointe());
			produitPjtDto.setLibellePj(produitPjt.getLibellePj());
			produitPjtDto.setDelCell(produitPjtDto.getPk());
			produitPjtDto.setEditCell(produitPjtDto.getPk()); 
			}
		return produitPjtDto;
	}
	
	
}
