package myproject.domain;


import lombok.*;

import jakarta.persistence.*;
import lombok.experimental.Accessors;

@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "airplane_id")
    private Integer airplaneId;

    @Column(nullable = false, length = 50)
    private String model;

    @Column(nullable = false)
    private Integer capacity;

    @Column(name = "crew_capacity", nullable = false)
    private Integer crewCapacity;

    public Integer getAirplaneId() {
        return airplaneId;
    }

    public void setAirplaneId(Integer airplaneId) {
        this.airplaneId = airplaneId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getCrewCapacity() {
        return crewCapacity;
    }

    public void setCrewCapacity(Integer crewCapacity) {
        this.crewCapacity = crewCapacity;
    }
}

