package myproject.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import myproject.domain.Staff;
import myproject.repository.StaffRepository;
import myproject.service.dto.StaffDTO;
import myproject.service.mapper.StaffMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
@Transactional
public class StaffService {

    @Inject
    StaffRepository staffRepository;

    @Inject
    StaffMapper staffMapper;

    public List<StaffDTO> getAllStaff(){
        return staffRepository.findAll()
                .stream()
                .map(staffMapper::toDTO)
                .collect(Collectors.toList());
    }


    public StaffDTO createStaff(StaffDTO staffDTO) {
        Staff staff = staffRepository.save(staffMapper.toEntity(staffDTO));
        return staffMapper.toDTO(staff);
    }
}
