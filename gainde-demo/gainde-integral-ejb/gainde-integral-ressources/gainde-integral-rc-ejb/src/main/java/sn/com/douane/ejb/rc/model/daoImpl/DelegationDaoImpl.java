package sn.com.douane.ejb.rc.model.daoImpl;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.DuplicateKeyException;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.RemoveException;
import javax.ejb.Stateless;
import javax.persistence.Query;

import sn.com.douane.ejb.rc.exception.ConstErrCodRC;
import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dao.IDelegationDao;
import sn.com.douane.ejb.rc.model.dao.IFonctionnalitesDao;
import sn.com.douane.ejb.rc.model.dao.IGroupeFonctionDao;
import sn.com.douane.ejb.rc.model.dao.IProfilGroupeDao;
import sn.com.douane.ejb.rc.model.dao.IUtilisateurDao;
import sn.com.douane.ejb.rc.model.entities.Delegation;
import sn.com.douane.ejb.rc.model.entities.Fonctionnalite;
import sn.com.douane.ejb.rc.model.entities.GroupeFonction;
import sn.com.douane.ejb.rc.model.entities.ProfilGroupe;
import sn.com.douane.ejb.rc.model.entities.Utilisateur;
import sn.com.douane.ejb.rc.model.keys.DelegationKey;
import sn.com.douane.ejb.rc.model.keys.ProfilGroupeKey;
import sn.com.douane.utils.sysEnv;

@Stateless(name = "IDelegationDao")
public class DelegationDaoImpl extends GenericDaoImpl<Delegation> implements
		IDelegationDao {

	@EJB
	private IUtilisateurDao utilisateurDao;

	@EJB
	private IFonctionnalitesDao fonctionnaliteDao;

	@EJB
	private IGroupeFonctionDao groupeFonctionDao;

	@EJB
	private IProfilGroupeDao profilGroupeDao;

	@SuppressWarnings("unchecked")
	@Override
	public List<Delegation> findfctdelegueQuery(Date dateDebut,
			String agentDestinataire) throws RcEjbException {
		Query qry = entityManager.createNamedQuery("findfctdelegue");
		qry.setParameter(1, dateDebut);
		qry.setParameter(2, agentDestinataire);
		return (List<Delegation>) qry.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Delegation> finddelegueQuery(Date dateDebut)
			throws RcEjbException {
		Query qry = entityManager.createNamedQuery("finddelegue");
		qry.setParameter(1, dateDebut);
		return (List<Delegation>) qry.getResultList();
	}

	public List<Delegation> recherchelisteFonctDelegues(String codeuser)
			throws RcEjbException {
		List<Delegation> delegations = null;
		delegations = findfctdelegueQuery(sysEnv.ToDay(), codeuser);
		return delegations;
	}

	public List<Delegation> rechercheDelegants(Date sysdate)
			throws RcEjbException {
		List<Delegation> delegations = null;
		delegations = finddelegueQuery(sysEnv.ToDay());
		return delegations;
	}

	@Override
	public void insert(Delegation objVo) throws RcEjbException {

		try {
			ctrlInsertUpdate(objVo);
			create(objVo);

		//	String table = "PROFILGROUPE";
//			String req = "", sql = "";
//			if (req.indexOf("SELECT") != -1 && req.indexOf("SELECT") == 0)
//				sql = req;
//			else
//				sql = "select d.agentDestinataire,d.codeGroupe,d.agentEmetteur,s.rcCodeProfil"
//						+ " from Delegation d, Utilisateur s"
//						+ "	where s.rcCodUser ='"+ objVo.getAgentDestinataire()
//						+ "' AND s.rcCodUser=d.agentDestinataire "
//						+ " AND d.codeGroupe=" + objVo.getCodeGroupe() + "";
//			//System.out.println("sql1 " + sql);
//
//			Query qry = entityManager.createQuery(sql);
			//List<Object> result = qry.getResultList();
			
			profilGroupeDao.insert(
					new ProfilGroupe(objVo.getCodeProfil(),
							objVo.getCodeGroupe()));

		} catch (DuplicateKeyException e1) {
			throw new RcEjbException(ConstErrCodRC.DUPKEYINSERT);
		} catch (CreateException e1) {
			throw new RcEjbException(ConstErrCodRC.INSERTEXP);
		}

	}

	@Override
	public void update(Delegation objVo) throws RcEjbException {
		ctrlInsertUpdate(objVo);
		merge(objVo);
	}

	@Override
	public void ctrlInsertUpdate(Delegation vo) throws RcEjbException {
		if (vo.getAgentDestinataire() == null
				|| vo.getAgentDestinataire().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.AGENTDESTINATAIRE_OB);}
		if (vo.getAgentEmetteur() == null
				|| vo.getAgentEmetteur().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.AGENTEMETTEUR_OB);}
		if (vo.getCodeGroupe() == null){
			throw new RcEjbException(ConstErrCodRC.RCCODEGROUPE_OB);}
		if (vo.getCodeFonction() == null
				|| vo.getCodeFonction().trim().equals("")){
			throw new RcEjbException(ConstErrCodRC.CODEFONCTION_OB);}
		if (vo.getDateDebut() == null){
			throw new RcEjbException(ConstErrCodRC.DATEDEBUT_OB);}
		try {
			if (vo.getAgentDestinataire() != null
					&& !vo.getAgentDestinataire().trim().equals("")) {

				Utilisateur utilisateurLocal = (Utilisateur) utilisateurDao
						.findByPrimaryKey(vo.getAgentDestinataire());
				vo.setDestdelegation(utilisateurLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.UTILISATEURKEY);
		}
		try {
			if (vo.getAgentEmetteur() != null
					&& !vo.getAgentEmetteur().trim().equals("")) {

				Utilisateur utilisateurLocal = (Utilisateur) utilisateurDao
						.findByPrimaryKey(vo.getAgentEmetteur());
				vo.setEmetDelegation(utilisateurLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.UTILISATEURKEY);
		}
		try {
			if (vo.getCodeFonction() != null
					&& !vo.getCodeFonction().trim().equals("")) {

				Fonctionnalite fonctionnalitesLocal = (Fonctionnalite) fonctionnaliteDao
						.findByPrimaryKey(vo.getCodeFonction());
				vo.setFoncDelegation(fonctionnalitesLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.FONCTIONNALITESKEY);
		}
		try {
			if (vo.getCodeGroupe() != null) {
				GroupeFonction groupefonctionLocal = (GroupeFonction) groupeFonctionDao
						.findByPrimaryKey(vo.getCodeGroupe());
				vo.setGrpfctDelegation(groupefonctionLocal);
			}
		} catch (FinderException e2) {
			throw new RcEjbException(ConstErrCodRC.GROUPEFONCTIONKEY);
		}

	}

	@Override
	public void delete(DelegationKey objKey) throws RcEjbException {
		try {
			remove(objKey);
		} catch (EJBException e) {
			throw new RcEjbException(ConstErrCodRC.EJBEXP);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.ROWNOTFOUND);
		}

	}

	@Override
	public void deleteProfilGroupe(String agentDest, Integer codeGroupe)
			throws RcEjbException {	
		try {
			
			Utilisateur user = utilisateurDao.findByPrimaryKey(agentDest);		
			profilGroupeDao.remove(new ProfilGroupeKey(codeGroupe, user.getRcCodeProfil()));
			
		} catch (FinderException e) {
			throw new RcEjbException(ConstErrCodRC.UTILISATEURKEY);
		} catch (RemoveException e) {
			throw new RcEjbException(ConstErrCodRC.REMOVEEXP);
		}

	}
	
	public List<Delegation> supfctdelegantQuery(Date dateDebut,
			String agentEmetteur) throws RcEjbException {
		Query qry = entityManager.createNamedQuery("supfctdelegant");
		qry.setParameter(1, dateDebut);
		qry.setParameter(2, agentEmetteur);
		return (List<Delegation>) qry.getResultList();
	}
	
	public List<String> recherchelisteFonctDeleguants(String codeuser)
			throws RcEjbException {
		List<Delegation> delegations = null;
		List<String> listDelegation = new ArrayList<String>();
		delegations = supfctdelegantQuery(sysEnv.ToDay(), codeuser);
		for (Delegation delegation : delegations) {
			listDelegation.add(delegation.getCodeFonction());
		}
		return listDelegation;
	}
}
