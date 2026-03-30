package com.harshit.quantitymeasurement.repository;

import com.harshit.quantitymeasurement.entity.QuantityMeasurementEntity;

public interface IQuantityMeasurementRepository {
	
	void save(QuantityMeasurementEntity entity);
	
}