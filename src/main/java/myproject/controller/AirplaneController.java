package myproject.controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import myproject.service.AirplaneService;
import myproject.service.dto.AirplaneDTO;

import java.util.List;

@Path("/api/v1")
public class AirplaneController {

    @Inject
    AirplaneService airplaneService;

    @GET
    @Path("/airplanes")
    public List<AirplaneDTO> getAllAirplanes(){
        return airplaneService.getAirplanes();
    }
}
