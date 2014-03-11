package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IAgrementRgrpProdDao;
import sn.com.douane.ejb.rc.model.dto.AgrementRgrpProdDto;
import sn.com.douane.ejb.rc.model.entities.AgrementRgrpProd;

@Stateless(name="IAgrementRgrpProdDao")
public class AgrementRgrpProdDaoImpl extends GenericDaoImpl<AgrementRgrpProd> implements IAgrementRgrpProdDao {

	 public List<AgrementRgrpProdDto> rechercherByWhereAgrementRgrpProd(String where) throws RcEjbException{
			List<AgrementRgrpProdDto> result = new ArrayList<AgrementRgrpProdDto>(); 	
			try {
				List<AgrementRgrpProd> listeAgrementRgrpProd = (List<AgrementRgrpProd>) rechercherByWhere(where);
				for (int i=0; i<listeAgrementRgrpProd.size(); i++) {
					AgrementRgrpProdDto agrementRgrpProdDto = getAgrementRgrpProdDto(listeAgrementRgrpProd.get(i));
					result.add(agrementRgrpProdDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public AgrementRgrpProdDto getAgrementRgrpProdDto(AgrementRgrpProd agrementRgrpProd) {
			AgrementRgrpProdDto agrementRgrpProdDto = new AgrementRgrpProdDto();
			if (agrementRgrpProd!=null){
				agrementRgrpProdDto.setRcCodeImpExp(agrementRgrpProd.getRcCodeImpExp());
				agrementRgrpProdDto.setRcCodePays(agrementRgrpProd.getRcCodePays());
				agrementRgrpProdDto.setRcCodeProd(agrementRgrpProd.getRcCodeProd());
				agrementRgrpProdDto.setRcCodeRegroupement(agrementRgrpProd.getRcCodeRegroupement());
				agrementRgrpProdDto.setRcCodeTaux(agrementRgrpProd.getRcCodeTaux());
				agrementRgrpProdDto.setRcCodeTaxe(agrementRgrpProd.getRcCodeTaxe());
				agrementRgrpProdDto.setRcDateApplication(agrementRgrpProd.getRcDateApplication());
				agrementRgrpProdDto.setRcDateCloture(agrementRgrpProd.getRcDateCloture());
				agrementRgrpProdDto.setRcNumEntreprise(agrementRgrpProd.getRcNumEntreprise());
				agrementRgrpProdDto.setRcPrecSenProd(agrementRgrpProd.getRcPrecSenProd());
				agrementRgrpProdDto.setRcPrecUemoaProd(agrementRgrpProd.getRcPrecUemoaProd());
				agrementRgrpProdDto.setRcValQuotite(agrementRgrpProd.getRcValQuotite());
				agrementRgrpProdDto.setDelCell(agrementRgrpProdDto.getPk());
				agrementRgrpProdDto.setEditCell(agrementRgrpProdDto.getPk()); 
				}
			return agrementRgrpProdDto;
		}	
}
