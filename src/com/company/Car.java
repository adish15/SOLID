package com.company;

public class Car implements EngineInstallation, TyresInstallation, BodyInstallation{

    @Override
    public void engineInstallation() {
        System.out.println("Car engine installation");
    }

    @Override
    public void tyresInstallation() {
        System.out.println("Car 4 tyres installation");
    }

    @Override
    public void bodyInstallation() {
        System.out.println("Car body installation");
    }
}
