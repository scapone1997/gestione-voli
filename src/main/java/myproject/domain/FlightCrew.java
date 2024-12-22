package myproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "flight_crew")
public class FlightCrew {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer crewId;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;
}
