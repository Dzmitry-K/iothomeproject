package by.pvt.repo;

import by.pvt.pojo.Sensor;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class SensorRepository {

    private static Logger log = Logger.getLogger("SensorRepository");

    @Autowired
    SessionFactory sessionFactory;

    public List<Sensor> findSensors() {
        log.info("Call findSensors()");
        return sessionFactory.getCurrentSession()
                .createQuery("from sensor", Sensor.class)
                .list();
    }

    public Sensor findSensorById(Long id) {
        return sessionFactory.getCurrentSession()
                .get(Sensor.class, id);
    }

    public Sensor findSensorBySerialNumber(String sn) {
        return sessionFactory.getCurrentSession()
                .get(Sensor.class, sn);
    }


    public List<Sensor> findSensorsBySerialNumber(String sn) {
        log.info("Call findSensorBySerialNumber()");
        return sessionFactory.getCurrentSession()
                .createQuery("from sensor s where s.serialnumber like :param1", Sensor.class)
                .setParameter("param1", "%" + sn + "%")
                .list();
    }

}
