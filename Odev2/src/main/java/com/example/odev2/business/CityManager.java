package com.example.odev2.business;

import com.example.odev2.dataAccess.CityDao;
import com.example.odev2.entities.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityManager implements CityService {

    private CityDao cityDao;

    @Autowired
    public CityManager(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    @Override
    public List<City> getAll() {
        return cityDao.findAll();
    }


}
