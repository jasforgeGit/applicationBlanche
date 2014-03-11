
package sn.com.douane.ejb.rc.model.daoImpl;

import java.util.List;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITypeApureRegInterditDao;
import sn.com.douane.ejb.rc.model.entities.TypeApurRegInterdit;

@Stateless(name="ITypeApureRegInterditDao")
public class TypeApureRegInterditDaoImpl extends GenericDaoImpl<TypeApurRegInterdit> implements ITypeApureRegInterditDao {

	@Override
	public List<TypeApurRegInterdit> rechercheTypeRegimeApureInterdit(String typeApurement, String typeRegime, String codeRegime) {
		StringBuilder where = new StringBuilder();
		where.append(" from TypeApurRegInterdit where rcTypeApurement = '").append(typeApurement);
				where.append("' and rcTypeRegime = '").append(typeRegime);
				where.append("' and rcCodeRegimeDouanier = '").append(codeRegime).append("'");
				return (List<TypeApurRegInterdit>) rechercherByWhere(where.toString());
	}

}
