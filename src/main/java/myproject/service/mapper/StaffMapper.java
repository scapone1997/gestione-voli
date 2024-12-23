package myproject.service.mapper;

import myproject.domain.Staff;
import myproject.service.dto.StaffDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "cdi")
public interface StaffMapper {

    StaffMapper INSTANCE = Mappers.getMapper(StaffMapper.class);

    Staff toEntity(StaffDTO staffDTO);
    StaffDTO toDTO(Staff staff);
}
