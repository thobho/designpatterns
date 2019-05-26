package com.sda.designpatterns.structural.adapter.exercises;

public class WheterServiceArapter implements TemperatureProvider{
    private WheterService wheterService;

    public WheterServiceArapter(WheterService wheterService) {
        this.wheterService = wheterService;
    }

    @Override
    public int getTemperatureForCityInCelcius(String cityName) {
        double temperatureInKelvins = this.wheterService.getTemperatureForCity(cityName);
        return (int) (temperatureInKelvins + 272);
    }
}
