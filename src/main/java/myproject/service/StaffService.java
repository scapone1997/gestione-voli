package myproject.service;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import myproject.repository.StaffRepository;
import myproject.service.dto.StaffDTO;
import myproject.service.mapper.StaffMapper;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
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


}
