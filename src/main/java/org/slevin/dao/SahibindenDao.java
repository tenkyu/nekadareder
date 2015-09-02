package org.slevin.dao;

import org.slevin.common.BinaQueryItem;
import org.slevin.common.SahibindenItem;



public interface SahibindenDao extends EntityDao<SahibindenItem> {
	public BinaQueryItem getDataForCreditSuitable(String urlTemp,Boolean creditSuitable,Long itemIndex) throws Exception;
	public long complatedCount() throws Exception;
	public void insertSehir() throws Exception;
	public void insertIlce() throws Exception;
	public void insertSemt() throws Exception;

	
	public void daireTapuluUpdate(String sorting) throws Exception;
	public void rezidansTapuluUpdate() throws Exception;
	public void mustakilEvTapuluUpdate() throws Exception;
	public void villaTapuluUpdate() throws Exception;
	public void ciftlikEviTapuluUpdate() throws Exception;
	public void koskTapuluUpdate() throws Exception;
	public void yaliTapuluUpdate() throws Exception;
	public void yaliDairesiTapuluUpdate() throws Exception;
	public void yazlikDairesiTapuluUpdate() throws Exception;
	public void prefabrikTapuluUpdate() throws Exception;
	public void kooperatifTapuluUpdate() throws Exception;
	
	public void daireTapusuzUpdate() throws Exception;
	public void rezidansTapusuzUpdate() throws Exception;
	public void mustakilEvTapusuzUpdate() throws Exception;
	public void villaTapusuzUpdate() throws Exception;
	public void ciftlikEviTapusuzUpdate() throws Exception;
	public void koskTapusuzUpdate() throws Exception;
	public void yaliTapusuzUpdate() throws Exception;
	public void yaliDairesiTapusuzUpdate() throws Exception;
	public void yazlikDairesiTapusuzUpdate() throws Exception;
	public void prefabrikTapusuzUpdate() throws Exception;
	public void kooperatifTapusuzUpdate() throws Exception;
	
	public void daireTapuluIlceUpdate(String sorting) throws Exception;
	public void daireTapuluLast24Hours() throws Exception;
	
	public void exportToFile() throws Exception;
}