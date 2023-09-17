package edu.trinity;

import java.time.Year;

public class Car {
    private String make;
    private String model;
    private Year year;
    private boolean running;
    private int distance;

    public Car(String make, String model, Year year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.running = false;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Year getYear() {
        return year;
    }

    public boolean isRunning() {
        return running;
    }

    public void start() {
        running = true;

    }

    public void stop() {
        running = false;
    }

    public void drive(int distance) {
        if(running) this.distance += distance;
    }

    public int getMiles() {
        return distance;
    }
}
