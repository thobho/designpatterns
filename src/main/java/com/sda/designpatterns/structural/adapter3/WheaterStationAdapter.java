package com.sda.designpatterns.structural.adapter3;

public class WheaterStationAdapter implements CelciusToKelvinAdapter {

    private WheaterStation wheaterStation;

    public WheaterStationAdapter(WheaterStation wheaterStation) {
        this.wheaterStation = wheaterStation;
    }

    @Override
    public double convertToKelvin() {
        return wheaterStation.getCelciusTemperature() + 273.15;
    }
}
