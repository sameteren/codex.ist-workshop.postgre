package com.codexist.findnearplaces.postgre.controller;


import com.codexist.findnearplaces.postgre.Service.PlacesService;
import com.codexist.findnearplaces.postgre.response.FindPlacesResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api")
public class PlacesController {
    @Autowired
    PlacesService placesService;

    @RequestMapping(value="findPlaces/{longitude}/{latitude}/{radius}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<FindPlacesResponse> getPlaces(@PathVariable("longitude") String longitude, @PathVariable("latitude") String latitude, @PathVariable("radius") String radius ){
        FindPlacesResponse findPlacesResponse = placesService.findNearlyPlaces(longitude,latitude,radius);
        return ResponseEntity.ok(findPlacesResponse);
    }

}
