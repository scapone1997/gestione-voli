package myproject.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import myproject.domain.Staff;
import myproject.service.dto.StaffDTO;

import java.util.List;

@ApplicationScoped
public class StaffRepository implements PanacheRepository<Staff> {
}
