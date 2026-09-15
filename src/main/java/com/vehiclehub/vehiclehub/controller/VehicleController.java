package com.vehiclehub.vehiclehub.controller;

import com.vehiclehub.vehiclehub.entity.Vehicle;
import com.vehiclehub.vehiclehub.service.VehicleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    
    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }
}
