package com.company;

public class Bike implements VehicleInstallation{
    String tyre="2";
    String engine="Bike Engine";
    String type="Bike";

    @Override
    public void engineInstallation() {
        System.out.println(engine+"installation");
    }

    @Override
    public void tyresInstallation() {
        System.out.println(tyre+" tyres installation");
    }

    @Override
    public void bodyInstallation() {
        System.out.println(type+" body installation");
    }

    @Override
    public void assembleVehicle() {

        this.bodyInstallation();
        this.engineInstallation();
        this.tyresInstallation();
    }
}
