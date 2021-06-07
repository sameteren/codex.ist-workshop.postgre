package com.codexist.findnearplaces.postgre.dto;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;


@Data
@Entity
@Table(name="Places")
public class Places {

    @Id
    @Column(name= "placesId", length = 100, nullable = false)
    private UUID placesId;
    @Column(name= "requestId", length = 100, nullable = false)
    private UUID requestId;
    @Column(name= "name", length = 100, nullable = false)
    private String name;
    @Column(name= "vicinity", length = 100, nullable = false)
    private String vicinity;
    @Column(name= "longitude", length = 100, nullable = false)
    private String longitude;
    @Column(name= "latitude", length = 100, nullable = false)
    private String latitude;

}
