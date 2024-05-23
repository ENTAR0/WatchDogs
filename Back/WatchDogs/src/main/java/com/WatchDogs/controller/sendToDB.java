package com.WatchDogs.controller;

import com.WatchDogs.services.sensorDataSaveService;
import com.WatchDogs.entities.SensorDataForDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sensorDataStore")
public class sendToDB {

    @Autowired
    private sensorDataSaveService sensorDataService;

    @PostMapping
    public SensorDataForDB createSensorData(@RequestBody SensorDataForDB sensorData) {
        String tmp = "Received sensor data: " + sensorData.getSensorData() +
                ", date: " + sensorData.getDate() +
                ", sensor type: " + sensorData.getSensorType() +
                ", sensor ID: " + sensorData.getSensorId() +
                ", PORT: " + sensorData.getPort();
        System.out.println(tmp);
        return sensorDataService.saveSensorData(sensorData);
    }

}

