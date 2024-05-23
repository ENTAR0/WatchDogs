package com.WatchDogs.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SensorData {
    @JsonProperty("SensorData")
    private String sensorData;

    @JsonProperty("date")
    private String date;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("PORT")
    private int port;

    // Getters and Setters
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    // toString method override
    @Override
    public String toString() {
        return "SensorDataDTO{" +
                "sensorData='" + sensorData + '\'' +
                ", date='" + date + '\'' +
                ", type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", port=" + port +
                '}';
    }
}
