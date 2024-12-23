package myproject.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import myproject.domain.Flight;

@ApplicationScoped
public class FlightRepository implements PanacheRepository<Flight> {
    public Flight save(Flight flight){
        persist(flight);
        return flight;
    }
}
