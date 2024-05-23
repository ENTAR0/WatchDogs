package com.WatchDogs.services;

import com.WatchDogs.entities.SensorDataForDB;
import com.WatchDogs.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class sensorDataSaveService {
    @Autowired
    private SensorDataRepository sensorDataRepository;

    public SensorDataForDB saveSensorData(SensorDataForDB sensorData) {
        return sensorDataRepository.save(sensorData);
    }
}
