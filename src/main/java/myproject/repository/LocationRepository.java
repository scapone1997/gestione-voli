package myproject.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import myproject.domain.Location;

@ApplicationScoped
public class LocationRepository implements PanacheRepository<Location> {

    public Location save(Location location){
        persist(location);
        return location;
    }
}
