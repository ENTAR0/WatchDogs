package com.WatchDogs.controller;

import com.WatchDogs.models.SensorData;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class receiveFromArudino {
    @PostMapping("/sensorData")
    public String receiveSensorData(@RequestBody SensorData sensorData) {
        // 클라이언트로부터 받은 센서 데이터 처리
        System.out.println("Received sensor data: " + sensorData);

        // 여기서 데이터 처리 로직을 수행하고 필요에 따라 응답을 반환할 수 있습니다.
        return "Received sensor data: " + sensorData.getSensorData() +
                ", date: " + sensorData.getDate() +
                ", sensor type: " + sensorData.getType() +
                ", PORT: " + sensorData.getPort();
    }
}