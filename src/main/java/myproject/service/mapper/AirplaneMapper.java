package myproject.service.mapper;

import myproject.domain.Airplane;
import myproject.service.dto.AirplaneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface AirplaneMapper {

    AirplaneMapper INSTANCE = Mappers.getMapper(AirplaneMapper.class);

    AirplaneDTO airplaneToAirplaneDTO(Airplane airplane);
    Airplane airplaneDTOToAirplane(AirplaneDTO airplaneDTO);
}