package by.pvt.repo;

import by.pvt.pojo.Sensor;
import by.pvt.pojo.SensorValue;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

public interface SensorValueRepository extends CrudRepository<SensorValue, Long> {
    Optional<SensorValue> findSensorValueBySensor(Sensor sensor);
}
