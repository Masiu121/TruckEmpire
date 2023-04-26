package com.oxology.TruckEmpire.repository;

import com.oxology.TruckEmpire.model.Truck;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TruckRepository extends JpaRepository<Truck, String> {}
