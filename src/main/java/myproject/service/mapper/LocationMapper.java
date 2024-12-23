package myproject.service.mapper;

import myproject.domain.Location;
import myproject.service.dto.LocationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "cdi")
public interface LocationMapper {
    LocationDTO toDto(Location location);
    Location toEntity(LocationDTO locationDTO);

    default Integer map(Location location){
        if(location == null)
            return null;
        return location.getLocationId();
    }

    default Location map(Integer value){
        Location location = new Location();
        location.setLocationId(value);
        return location;
    }
}
