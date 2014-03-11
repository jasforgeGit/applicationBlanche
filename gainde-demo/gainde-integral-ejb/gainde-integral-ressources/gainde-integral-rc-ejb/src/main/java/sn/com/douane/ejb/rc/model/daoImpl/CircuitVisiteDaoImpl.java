package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.FinderException;
import javax.ejb.Stateless;
import sn.com.douane.ejb.rc.exception.ConstErrCod;
import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.ICircuitVisiteDao;
import sn.com.douane.ejb.rc.model.dto.CircuitVisiteDto;
import sn.com.douane.ejb.rc.model.entities.CircuitVisite;
import sn.com.douane.utils.ConvertUtil;
import sn.com.douane.utils.LabelValue;

@Stateless(name = "ICircuitVisiteDao")
public class CircuitVisiteDaoImpl extends GenericDaoImpl<CircuitVisite>
		implements ICircuitVisiteDao {

	@Override
	public void insert(CircuitVisite circuit) throws RcEjbException {
		try {
			ctrlInsertUpdate(circuit);
			create(circuit);
		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}
	}

	private void ctrlInsertUpdate(CircuitVisite vo) throws RcEjbException {
		if (vo.getRccodecircuit() == null
				|| vo.getRccodecircuit().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCCODECIRCUIT_OB);
		}
		if (vo.getRcdescircuitvisite() == null
				|| vo.getRcdescircuitvisite().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.RCDESCIRCUITVISITE_OB);
		}
	}

	@Override
	public void update(CircuitVisite circuit) throws RcEjbException {
		ctrlInsertUpdate(circuit);
		merge(circuit);
	}

	public List<LabelValue> getListCircuitVisite() throws RcEjbException {
		List<CircuitVisite> vector = null;
		List<LabelValue> vector2 = new ArrayList<LabelValue>();

		try {
			CircuitVisite circuitvisiteVO = null;
			vector = findAll();
			vector2.add(new LabelValue("", ""));
			for (int i = 0; i < vector.size(); i++) {
				circuitvisiteVO = vector.get(i);
				vector2.add(new LabelValue(ConvertUtil
						.converToString(circuitvisiteVO.getRccodecircuit())
						+ " - " + circuitvisiteVO.getRcdescircuitvisite(),
						ConvertUtil.converToString(circuitvisiteVO
								.getRccodecircuit())));
			}
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}
		return vector2;
	}

	public String getLibelleCircuit(String codecircuit) throws RcEjbException {
		String libelle = "";
		List<CircuitVisite> vector = null;
		CircuitVisite circuitvisiteVO = null;
		vector = (List<CircuitVisite>) rechercherByWhere(" from CircuitVisite where rccodecircuit ='"
				+ codecircuit + "'");
		circuitvisiteVO = vector.get(0);
		libelle = circuitvisiteVO.getRcdescircuitvisite();
		return libelle;
	}

	 public List<CircuitVisiteDto> rechercheByWhereCircuitVisite(String where) throws RcEjbException{
			List<CircuitVisiteDto> result = new ArrayList<CircuitVisiteDto>(); 	
			try {
				List<CircuitVisite> listeCircuitVisite = (List<CircuitVisite>) rechercherByWhere(where);
				for (int i=0; i<listeCircuitVisite.size(); i++) {
					CircuitVisiteDto circuitVisiteDto = getCircuitVisiteDto(listeCircuitVisite.get(i));
					result.add(circuitVisiteDto); 
				}	
			}catch(Exception e) {
				throw new RcEjbException(ConstErrCod.rowNotFound); 
			}
			return result;
			
		}	
		public CircuitVisiteDto getCircuitVisiteDto(CircuitVisite circuitVisite) {
			CircuitVisiteDto circuitVisiteDto = new CircuitVisiteDto();
			if (circuitVisite!=null){
				circuitVisiteDto.setRccodecircuit(circuitVisite.getRccodecircuit());
				circuitVisiteDto.setRcdescircuitvisite(circuitVisite.getRcdescircuitvisite());
				circuitVisiteDto.setRccouleur(circuitVisite.getRccouleur());
				circuitVisiteDto.setRcpriorite(circuitVisite.getRcpriorite());
				circuitVisiteDto.setDelCell(circuitVisiteDto.getPk());
				circuitVisiteDto.setEditCell(circuitVisiteDto.getPk()); 
				}
			return circuitVisiteDto;
		}
	
}
