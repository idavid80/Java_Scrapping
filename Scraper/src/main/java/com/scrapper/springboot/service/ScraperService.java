package com.scrapper.springboot.service;

import java.util.Set;

import com.scrapper.springboot.repository.ResponseDTO;

public interface ScraperService {
    Set<ResponseDTO> getVehicleByModel(String vehicleModel);
}