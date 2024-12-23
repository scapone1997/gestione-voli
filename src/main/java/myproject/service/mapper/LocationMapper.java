package myproject.service.mapper;

import myproject.domain.Location;
import myproject.service.dto.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface LocationMapper {
    LocationDTO toDto(Location location);
    Location toEntity(LocationDTO locationDTO);
}
