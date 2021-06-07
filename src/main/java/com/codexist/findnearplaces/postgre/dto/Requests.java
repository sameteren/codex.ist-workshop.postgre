package com.codexist.findnearplaces.postgre.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Data
@Entity
@Table(name="Requests")
public class Requests {

    @Id
    @Column(name= "RequestId", nullable = false)
    private UUID requestId;
    @Column(name= "Longitude", nullable = false)
    private String longitude;
    @Column(name= "Latitude", nullable = false)
    private String latitude;
    @Column(name= "Radius", nullable = false)
    private String radius;

}
