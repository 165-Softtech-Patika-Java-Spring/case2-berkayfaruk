package com.example.odev2.dataAccess;

import com.example.odev2.entities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDao extends JpaRepository<City,Long> {

}
