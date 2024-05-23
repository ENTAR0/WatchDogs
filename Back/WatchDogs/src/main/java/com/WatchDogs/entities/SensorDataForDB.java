package com.WatchDogs.entities;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "SensorData")
public class SensorDataForDB {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sensor_data")
    private String sensorData;

    @Column(name = "date")
    private String date;

    @Column(name = "sensor_type")
    private String sensorType;

    @Column(name = "sensor_id")
    private String sensorId;

    @Column(name = "port")
    private int port;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSensorData() {
        return sensorData;
    }

    public void setSensorData(String sensorData) {
        this.sensorData = sensorData;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public String getSensorId() {
        return sensorId;
    }

    public void setSensorId(String sensorId) {
        this.sensorId = sensorId;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}