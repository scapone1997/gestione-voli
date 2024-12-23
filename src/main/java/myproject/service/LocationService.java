package myproject.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import myproject.domain.Location;
import myproject.repository.LocationRepository;
import myproject.service.dto.LocationDTO;
import myproject.service.mapper.LocationMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class LocationService {

    @Inject
    LocationRepository locationRepository;

    @Inject
    LocationMapper locationMapper;

    public LocationDTO createLocation(LocationDTO locationDTO) {
        Location location = locationRepository.save(locationMapper.toEntity(locationDTO));
        return locationMapper.toDto(location);
    }

    public List<LocationDTO> getAllLocations() {
        return locationRepository.findAll()
                .stream()
                .map(locationMapper::toDto)
                .collect(Collectors.toList());
    }
}
