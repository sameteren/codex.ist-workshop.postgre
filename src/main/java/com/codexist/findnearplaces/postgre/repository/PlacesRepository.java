package com.codexist.findnearplaces.postgre.repository;


import com.codexist.findnearplaces.postgre.dto.Places;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PlacesRepository extends JpaRepository<Places, UUID> {
    List<Places> getPlacesByRequestId(UUID requestId);
}
