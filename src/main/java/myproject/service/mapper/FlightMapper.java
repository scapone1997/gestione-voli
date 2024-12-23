package myproject.service.mapper;

import myproject.domain.Flight;
import myproject.service.dto.FlightDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "cdi", uses = {AirplaneMapper.class, LocationMapper.class})
public interface FlightMapper {

    @Mapping(source = "airplane", target = "airplaneId")
    @Mapping(source = "origin", target = "originId")
    @Mapping(source = "destination", target = "destinationId")
    FlightDTO toDto(Flight flight);

    @Mapping(source = "airplaneId", target = "airplane")
    @Mapping(source = "originId", target = "origin")
    @Mapping(source = "destinationId", target = "destination")
    Flight toEntity(FlightDTO flightDTO);


}
