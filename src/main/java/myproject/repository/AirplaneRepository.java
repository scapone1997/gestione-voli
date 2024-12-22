package myproject.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import myproject.domain.Airplane;

@ApplicationScoped
public class AirplaneRepository implements PanacheRepository<Airplane> {
    // Metodi CRUD già disponibili grazie a Panache
}