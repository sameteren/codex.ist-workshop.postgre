package com.codexist.findnearplaces.postgre.Service;


import com.codexist.findnearplaces.postgre.response.FindPlacesResponse;

public interface PlacesService {

    public FindPlacesResponse findNearlyPlaces(String longitude, String latitude, String radius );
}
