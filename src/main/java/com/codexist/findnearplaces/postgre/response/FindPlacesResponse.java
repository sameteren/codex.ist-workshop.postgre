package com.codexist.findnearplaces.postgre.response;



import com.codexist.findnearplaces.postgre.dto.Places;
import lombok.Data;

import java.util.List;

@Data
public class FindPlacesResponse {
    private List<Places> placesList;
}
