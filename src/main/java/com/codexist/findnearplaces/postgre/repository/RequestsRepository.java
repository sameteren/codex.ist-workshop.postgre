package com.codexist.findnearplaces.postgre.repository;


import com.codexist.findnearplaces.postgre.dto.Requests;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RequestsRepository extends JpaRepository<Requests, String> {

     Requests findByLongitudeAndLatitudeAndRadius(String longitute,String Latitude,String Radius);
}
