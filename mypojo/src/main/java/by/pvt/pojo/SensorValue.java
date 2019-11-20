package by.pvt.pojo;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "sensor_value")
public class SensorValue implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    private Sensor sensor;

    private LocalDateTime date;

    private Double value;



    public Sensor getSensor() {
        return sensor;
    }

    public void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public SensorValue() {
    }

    public SensorValue(Sensor sensor, LocalDateTime date, Double value) {
        this.sensor = sensor;
        this.date = date;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SensorValue{" +
                "id=" + id +
                ", sensor=" + sensor +
                ", date=" + date +
                ", value=" + value +
                '}';
    }
}
