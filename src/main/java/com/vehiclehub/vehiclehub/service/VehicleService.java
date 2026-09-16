package com.vehiclehub.vehiclehub.service;

import com.vehiclehub.vehiclehub.entity.Vehicle;
import com.vehiclehub.vehiclehub.repository.VehicleRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    private final VehicleRepository vehicleRepository;

    public VehicleService(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }
}
