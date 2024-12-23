package myproject.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import myproject.domain.Flight;
import myproject.repository.FlightRepository;
import myproject.service.dto.FlightDTO;
import myproject.service.mapper.FlightMapper;

import java.util.Set;
import java.util.stream.Collectors;

@ApplicationScoped
@Transactional
public class FlightService {

    @Inject
    FlightRepository flightRepository;

    @Inject
    FlightMapper flightMapper;


    public Set<FlightDTO> getAllFlights() {
        return flightRepository.findAll()
                .stream()
                .map(flightMapper::toDto)
                .collect(Collectors.toSet());
    }

    public FlightDTO createFlight(FlightDTO flightDTO) {
        Flight flight = flightRepository.save(flightMapper.toEntity(flightDTO));
        return flightMapper.toDto(flight);
    }
}
