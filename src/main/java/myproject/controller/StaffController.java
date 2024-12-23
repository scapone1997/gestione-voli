package myproject.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import myproject.service.StaffService;
import myproject.service.dto.StaffDTO;

import java.util.List;

@Path("/api/v1")
public class StaffController {

    @Inject
    StaffService staffService;

    @GET
    @Path("/staff")
    public List<StaffDTO> getAllStaff(){
        return staffService.getAllStaff();
    }
}
