package com.vehiclehub.vehiclehub.repository;

import com.vehiclehub.vehiclehub.entity.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
}
