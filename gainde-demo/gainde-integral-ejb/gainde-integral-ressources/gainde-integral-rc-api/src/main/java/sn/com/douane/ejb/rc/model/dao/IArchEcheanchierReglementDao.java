package sn.com.douane.ejb.rc.model.dao;

import java.math.BigDecimal;

import javax.ejb.Local;


import sn.com.douane.ejb.rc.exception.RcEjbException;

import sn.com.douane.ejb.rc.model.entities.ArchEcheancierReglement;

import sn.com.douane.ejb.rc.model.keys.EcheancierReglementKey;

@Local
public interface IArchEcheanchierReglementDao extends IGenericDao<ArchEcheancierReglement>{

	void insertWithoutCtrl(ArchEcheancierReglement echeancierReglement) throws RcEjbException;

	/*public List<EcheancierReglement> rechercherBySegGenDec(String decAnneeEnregDec,
			String decBurEnregDec, Integer decNumDeclaration) throws RcEjbException;*/
	
	
	public void insert(ArchEcheancierReglement vo) throws RcEjbException;
	
	public void update(ArchEcheancierReglement vo) throws RcEjbException;
	
	public void delete(EcheancierReglementKey objkey) throws RcEjbException;

	public BigDecimal getMontantCredit(String whereRetardsReglement);

	/*public List<EcheancierReglement> listEcheanciers(String codcrd);

	public List<EcheancierReglement> findByCodeCreditaire(String codcrd);

	public List<EcheancierReglement> rechercherByDossier1(Integer numdossierProv) throws RcEjbException;
	
	public EcheancierReglementDto getEcheancierReglementDto(EcheancierReglement vo);
	
	public List<EcheancierReglementDto> getEcheancierReglementDto(List<EcheancierReglement> 
	listEcheancier);

	public void recupererDeclPcs(int parseInt) throws RcEjbException;
	
	public EcheancierReglement getEcheancierReglementFromDto(EcheancierReglementDto dto);*/


		
	

}
