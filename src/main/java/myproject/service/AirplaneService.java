package myproject.service;


import io.quarkus.panache.common.Page;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import myproject.repository.AirplaneRepository;
import myproject.service.dto.AirplaneDTO;
import myproject.service.mapper.AirplaneMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class AirplaneService {

    @Inject
    AirplaneRepository airplaneRepository;

    @Inject
    AirplaneMapper airplaneMapper;

    /**
     * Restituisce una pagina di AirplaneDTO ordinati per modello.
     * @return lista di AirplaneDTO
     */
    public List<AirplaneDTO> getAirplanes() {
        return airplaneRepository.findAll()
                .stream()
                .map(airplaneMapper::airplaneToAirplaneDTO)
                .collect(Collectors.toList());
    }
}

