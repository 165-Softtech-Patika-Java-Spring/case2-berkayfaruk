package com.example.odev2.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="district")
public class District  {
    @Id
    @GeneratedValue
    @Column(name="district_id")
    private long id;

    @Column(name="district_name")
    private String name;
}
