package myproject.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import myproject.service.FlightService;
import myproject.service.dto.FlightDTO;
import myproject.service.dto.FlightDTO;

import java.util.Set;

@Path("/v1")
public class FlightController {

    @Inject
    FlightService flightService;

    @GET
    @Path("/flight")
    public Response getAllFlights(){
        Set<FlightDTO> flightDTO = flightService.getAllFlights();
        return Response.status(Response.Status.CREATED)
                .entity(flightDTO)
                .build();
    }

    @POST
    @Path("/flight")
    public Response createLocation(FlightDTO flightDTO){
        flightDTO = flightService.createFlight(flightDTO);
        return Response
                .status(Response.Status.CREATED)
                .entity(flightDTO)
                .build();
    }
}
