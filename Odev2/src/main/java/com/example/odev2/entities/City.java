package com.example.odev2.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="city")
public class City  {
    @Id
    @GeneratedValue
    @Column(name="city_id")
    private long id;

    @Column(name="city_name")
    private String name;

    @Column(name="plate")
    private String plate;


}
