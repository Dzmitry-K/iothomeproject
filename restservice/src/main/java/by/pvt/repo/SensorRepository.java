package by.pvt.repo;

import by.pvt.pojo.Sensor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

public interface SensorRepository extends CrudRepository<Sensor, Long> {
    Optional<Sensor> findBySerialnumber(String str);
    Sensor getById(Long id);
}
