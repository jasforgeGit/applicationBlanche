package sn.com.douane.ejb.rc.model.daoImpl;

import javax.ejb.Stateless;

import sn.com.douane.ejb.rc.model.dao.IDocumentDao;
import sn.com.douane.ejb.rc.model.entities.Document;

@Stateless(name="IDocumentDao")
public class DocumentDaoImpl extends GenericDaoImpl<Document> implements IDocumentDao {

}
