package myproject.domain;


import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "airplanes")
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer airplaneId;

    @Column(nullable = false, length = 50)
    private String model;

    @Column(nullable = false)
    private Integer capacity;

    @Column(nullable = false)
    private Integer crewCapacity;

    @OneToMany(mappedBy = "airplane")
    private List<Staff> staff;
}

