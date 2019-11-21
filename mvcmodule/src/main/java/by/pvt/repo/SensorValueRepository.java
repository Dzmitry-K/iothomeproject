package by.pvt.repo;

import by.pvt.pojo.SensorValue;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class SensorValueRepository {

    private static Logger log = Logger.getLogger("SensorValueRepository");

    @Autowired
    SessionFactory sessionFactory;

    public List<SensorValue> findValuesBySensorId(Long id) {
        log.info("Call findValuesBySensorId()");
        return sessionFactory.getCurrentSession()
                .createQuery("from SensorValue where sensorid like :param1", SensorValue.class)
                .setParameter("param1", "%" + id + "%")
                .list();
    }
}
