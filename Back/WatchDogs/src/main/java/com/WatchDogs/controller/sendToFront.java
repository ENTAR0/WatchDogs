package com.WatchDogs.controller;

import com.WatchDogs.services.sensorDataFindService;
import com.WatchDogs.entities.SensorDataForDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class sendToFront {
    @Autowired
    private sensorDataFindService sensorDataService;

    @GetMapping("/sensordataforAPP")
    public List<SensorDataForDB> getAllSensorData() {
        return sensorDataService.getAllSensorData();
    }

    @GetMapping("/sensordataforAPP/{id}")
    public SensorDataForDB getSensorDataById(@PathVariable Long id) {
        return sensorDataService.getSensorDataById(id);
    }
}
