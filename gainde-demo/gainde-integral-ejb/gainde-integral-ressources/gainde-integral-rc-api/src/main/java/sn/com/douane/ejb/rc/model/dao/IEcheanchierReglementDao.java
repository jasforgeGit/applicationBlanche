package sn.com.douane.ejb.rc.model.dao;

import java.math.BigDecimal;
import java.util.List;

import sn.com.douane.ejb.rc.exception.RcEjbException;
import sn.com.douane.ejb.rc.model.dto.EcheancierReglementDto;
import sn.com.douane.ejb.rc.model.entities.EcheancierReglement;
import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;

public interface IEcheanchierReglementDao extends IGenericDao<EcheancierReglement>{

	void insertWithoutCtrl(EcheancierReglement echeancierReglement) throws RcEjbException;

	public List<EcheancierReglement> rechercherBySegGenDec(String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration) throws RcEjbException;
	
	
	public void insert(EcheancierReglement vo) throws RcEjbException;
	
	public void update(EcheancierReglement vo) throws RcEjbException;
	
	public void delete(EcheancierReglementKey objkey) throws RcEjbException;

	public BigDecimal getMontantCredit(String whereRetardsReglement);

	public List<EcheancierReglement> listEcheanciers(String codcrd);

	public List<EcheancierReglement> findByCodeCreditaire(String codcrd);

	public List<EcheancierReglement> rechercherByDossier1(Integer numdossierProv) throws RcEjbException;
	
	public EcheancierReglementDto getEcheancierReglementDto(EcheancierReglement vo);
	
	public List<EcheancierReglementDto> getEcheancierReglementDto(List<EcheancierReglement> 
	listEcheancier);

	public void recupererDeclPcs(int parseInt) throws RcEjbException;
	
	public EcheancierReglement getEcheancierReglementFromDto(EcheancierReglementDto dto);
	
	public EcheancierReglement copyTo(EcheancierReglement vo);


		
	

}
