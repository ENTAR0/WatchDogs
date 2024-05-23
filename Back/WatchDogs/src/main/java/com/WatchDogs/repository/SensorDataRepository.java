package com.WatchDogs.repository;


import com.WatchDogs.entities.SensorDataForDB;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface SensorDataRepository extends JpaRepository<SensorDataForDB, Long> {
}