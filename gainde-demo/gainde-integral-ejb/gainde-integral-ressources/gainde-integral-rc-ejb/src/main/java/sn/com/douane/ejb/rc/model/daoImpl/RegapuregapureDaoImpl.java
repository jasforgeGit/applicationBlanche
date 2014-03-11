package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IRegapuregapureDao;
import sn.com.douane.ejb.rc.model.dto.AgreeDto;
import sn.com.douane.ejb.rc.model.dto.RegapuregapureDto;
import sn.com.douane.ejb.rc.model.entities.Agree;
import sn.com.douane.ejb.rc.model.entities.Regapuregapure;
import sn.com.douane.ejb.rc.model.entities.Regime;

@Stateless(name="IRegapuregapureDao")
public class RegapuregapureDaoImpl extends GenericDaoImpl<Regapuregapure> implements IRegapuregapureDao{

	public List<Regime> rechercheRegimeApurant(String where) {
		List<Regime> vector = new ArrayList<Regime>();

			String table = "Regapuregapure R";
			String req = "", sql = "";
			req = where.toUpperCase().trim();
			if (req.indexOf("SELECT") != -1 && req.indexOf("SELECT") == 0)
				sql = req;
			else
				sql = "SELECT R.*, regimee.rcLibelleRegime FROM "
						+ table + ", Regime regime WHERE 1=1 " + where;
			Query query = entityManager.createQuery(sql);
			List<Object []> result = query.getResultList(); 
//			 PreparedStatement pst= tcon.preparedStatement(sql);
//			 ResultSet rs = pst.executeQuery();
			Regime vo;
			
			for( int i=0; i<result.size(); i++){
				vo = new Regime();
				
				vo.setRcCodeRegimeDouanier(result.get(i)[0].toString());
				vo.setRcCodeRegimeFiscal(result.get(i)[3].toString());
				vo.setRcLibelleRegime(result.get(i)[4].toString());
				
				vector.add(vo);
			}
			
//			while (rs.next()) {
//				vo = new Regime();
//				vo.setRcCodeRegimeDouanier(rs.getString(rs.getString("RCREGDOUAPURANT")+
//						rs.getString("RCTYPEREGAPURANT")));
//				vo.setRccoderegimefiscal(rs.getString("RCCODEREGIMEFISCAL"));
//				vo.setRclibelleregime(rs.getString("RCLIBELLEREGIME"));
//				vector.add(vo);
//			}

		return vector;
	}
	
	 public List<RegapuregapureDto> rechercheByWhereRegapuregapure(String where) throws RcEjbException{
			List<RegapuregapureDto> result = new ArrayList<RegapuregapureDto>(); 	
			try {
				List<Regapuregapure> listeRegapuregapure = (List<Regapuregapure>) rechercherByWhere(where);
				for (int i=0; i<listeRegapuregapure.size(); i++) {
					RegapuregapureDto regapuregapureDto = getRegapuregapureDto(listeRegapuregapure.get(i));
					result.add(regapuregapureDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public RegapuregapureDto getRegapuregapureDto(Regapuregapure regapuregapure) {
			RegapuregapureDto regapuregapureDto = new RegapuregapureDto();
			if (regapuregapure!=null){
				regapuregapureDto.setRcTypeRegApure(regapuregapure.getRcTypeRegApure());
				regapuregapureDto.setRcRegDouApure(regapuregapure.getRcRegDouApure());
				regapuregapureDto.setRcTypeRegApurant(regapuregapure.getRcTypeRegApurant());
				regapuregapureDto.setRcRegDouApurant(regapuregapure.getRcRegDouApurant());
				regapuregapureDto.setDelCell(regapuregapureDto.getPk());
				regapuregapureDto.setEditCell(regapuregapureDto.getPk()); 
				}
			return regapuregapureDto;
		}
}
