package myproject.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column(nullable = false, unique = true, length = 10)
    private String flightNumber;

    @ManyToOne
    @JoinColumn(name = "airplane_id", nullable = false)
    private Airplane airplane;

    @Column(nullable = false)
    private LocalDateTime departureTime;

    @Column(nullable = false)
    private LocalDateTime arrivalTime;

    @ManyToOne
    @JoinColumn(name = "origin_id", nullable = false)
    private Location origin;

    @ManyToOne
    @JoinColumn(name = "destination_id", nullable = false)
    private Location destination;

    @Column(nullable = false, length = 20)
    private String status;

    @OneToMany(mappedBy = "flight")
    private List<FlightCrew> crew;
}