package com.oxology.TruckEmpire.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "trucks")
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "distance_max")
    private int maxDistance;
    @Column(name = "fuel_max")
    private int maxFuel;
    @Column(name = "top_speed")
    private int topSpeed;

    private Date bought;
    private int mileage;
    private int fuel;
    private int power;
    private float economy;
    private float condition;

    public Truck() {}

    public Truck(int maxDistance, int maxFuel, int topSpeed, Date bought, int mileage, int fuel, int power, float economy, float condition) {
        this.maxDistance = maxDistance;
        this.maxFuel = maxFuel;
        this.topSpeed = topSpeed;
        this.bought = bought;
        this.mileage = mileage;
        this.fuel = fuel;
        this.power = power;
        this.economy = economy;
        this.condition = condition;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Date getBought() {
        return bought;
    }

    public void setBought(Date bought) {
        this.bought = bought;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public float getEconomy() {
        return economy;
    }

    public void setEconomy(float economy) {
        this.economy = economy;
    }

    public float getCondition() {
        return condition;
    }

    public void setCondition(float condition) {
        this.condition = condition;
    }
}