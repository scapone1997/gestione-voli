package myproject.service.mapper;

import jakarta.enterprise.inject.Default;
import myproject.domain.Airplane;
import myproject.service.dto.AirplaneDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface AirplaneMapper {
    AirplaneDTO airplaneToAirplaneDTO(Airplane airplane);
    Airplane airplaneDTOToAirplane(AirplaneDTO airplaneDTO);

    default Integer map(Airplane value){
        if(value == null)
            return null;
        return value.getAirplaneId();
    }

    default Airplane map(Integer value){
        Airplane airplane = new Airplane();
        airplane.setAirplaneId(value);
        return airplane;
    }
}
