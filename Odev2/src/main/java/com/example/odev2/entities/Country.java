package com.example.odev2.entities;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name="country")
public class Country  {
    @Id
    @GeneratedValue
    @Column(name="country_id")
    private long id;

    @Column(name="country_name")
    private String name;

    @Column(name="country_code")
    private int countryCode;
}
