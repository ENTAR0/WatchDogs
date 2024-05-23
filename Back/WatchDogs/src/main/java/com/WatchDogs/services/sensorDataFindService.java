package com.WatchDogs.services;

import com.WatchDogs.entities.SensorDataForDB;
import com.WatchDogs.repository.SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class sensorDataFindService {
    @Autowired
    private SensorDataRepository sensorDataRepository;

    public List<SensorDataForDB> getAllSensorData() {
        return sensorDataRepository.findAll();
    }

    public SensorDataForDB getSensorDataById(Long id) {
        return sensorDataRepository.findById(id).orElse(null);
    }
}
