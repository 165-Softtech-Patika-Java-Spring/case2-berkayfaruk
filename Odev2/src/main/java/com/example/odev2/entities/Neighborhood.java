package com.example.odev2.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="neighborhood")
public class Neighborhood  {
    @Id
    @GeneratedValue
    @Column(name="neighborhood_id")
    private long id;

    @Column(name="neighborhood_name")
    private String name;
}