package com.oxology.TruckEmpire.controller;

import com.oxology.TruckEmpire.model.Truck;
import com.oxology.TruckEmpire.repository.TruckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/truck")
public class TruckController {
    @Autowired
    private TruckRepository truckRepository;

    @GetMapping("")
    public List<Truck> findAll() {
        return truckRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Truck> find(@PathVariable String id) {
        Truck truck = truckRepository.findById(id).orElseThrow();
        return ResponseEntity.ok(truck);
    }

    @PostMapping("")
    public Truck create(@RequestBody Truck truck) {
        return truckRepository.save(truck);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Truck> update(@PathVariable String id, @RequestBody Truck truckDetail) {
        Truck truck = truckRepository.findById(id).orElseThrow();

        truck.setCondition(truckDetail.getCondition());
        truck.setFuel(truckDetail.getFuel());
        truck.setMileage(truckDetail.getMileage());

        Truck updatedTruck = truckRepository.save(truck);
        return ResponseEntity.ok(updatedTruck);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Boolean>> delete(@PathVariable String id) {
        Truck truck = truckRepository.findById(id).orElseThrow();

        truckRepository.delete(truck);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return ResponseEntity.ok(response);
    }
}
