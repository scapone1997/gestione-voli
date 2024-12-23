package myproject.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "flight_crew")
public class FlightCrew {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gestioniVoliSequenza")
    @SequenceGenerator(name = "gestioniVoliSequenza", allocationSize = 1)
    @Column(name= "crew_id")
    private Integer crewId;

    @ManyToOne
    @JoinColumn(name = "flight_id", nullable = false)
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;

    public Integer getCrewId() {
        return crewId;
    }

    public void setCrewId(Integer crewId) {
        this.crewId = crewId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
}
