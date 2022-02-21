package com.example.odev2.entities;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="street")
public class Street  {
    @Id
    @GeneratedValue
    @Column(name="street_id")
    private long id;

    @Column(name="street_name")
    private String name;

    @Column(name="door_umber")
    private String doorNumber;

    @Column(name="aperment_number")
    private String apermentNumber;
}
