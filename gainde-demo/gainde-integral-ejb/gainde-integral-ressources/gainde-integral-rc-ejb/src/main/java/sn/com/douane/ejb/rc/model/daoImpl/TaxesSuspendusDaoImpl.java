package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.ITaxesSuspendusDao;
import sn.com.douane.ejb.rc.model.entities.TaxesSuspendus;
import sn.com.douane.utils.ConstDeclaration;

@Stateless(name="ITaxesSuspendusDao")
public class TaxesSuspendusDaoImpl extends GenericDaoImpl<TaxesSuspendus> implements ITaxesSuspendusDao{
	
	
	public String getWhereByTaxeIndicateur(String condition,String codetaxe,String indicateur ){
		
		return "from TaxesSuspendus where 1=1 "+
				condition
				+ " and rcCodeTaxe='"
				+ codetaxe
				+ "' and rcCodeIndicateur='"
				+ ConstDeclaration.IndicateurSuspPartiel
				+ "'";
		
	}	


}
