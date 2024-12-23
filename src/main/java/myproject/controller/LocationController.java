package myproject.controller;


import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import myproject.service.LocationService;
import myproject.service.dto.LocationDTO;

import java.util.List;

@Path("api/v1")
public class LocationController {

    @Inject
    LocationService locationService;

    @GET
    @Path("/location")
    public List<LocationDTO> getAllLocation(){
        return locationService.getAllLocations();
    }

    @POST
    @Path("/location")
    public Response createLocation(LocationDTO locationDTO){
        locationDTO = locationService.createLocation(locationDTO);
        return Response
                .status(Response.Status.CREATED)
                .entity(locationDTO)
                .build();
    }
}
