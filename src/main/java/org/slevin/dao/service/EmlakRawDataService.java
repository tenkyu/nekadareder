package org.slevin.dao.service;


import org.slevin.common.EmlakRawData;
import org.slevin.dao.EmlakRawDataDao;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;


@Component
@Transactional
public class EmlakRawDataService extends EntityService<EmlakRawData> implements EmlakRawDataDao {

	
}

