package com.company;

public class Bike implements EngineInstallation, TyresInstallation, BodyInstallation{
    @Override
    public void engineInstallation() {
        System.out.println("Bike engine installation");
    }

    @Override
    public void tyresInstallation() {
        System.out.println("Bike 2 tyres installation");
    }

    @Override
    public void bodyInstallation() {
        System.out.println("Bike body installation");
    }
}
