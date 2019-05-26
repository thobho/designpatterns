package com.sda.designpatterns.structural.adapter.exercises;

public class WheterApp {
    private TemperatureProvider temperatureProvider;

    public WheterApp(TemperatureProvider temperatureProvider) {
        this.temperatureProvider = temperatureProvider;
    }

    public void showTemperature(String cityName){
        System.out.println(temperatureProvider.getTemperatureForCityInCelcius(cityName));
    }

    public static void main(String[] args) {

        WheterService wheterService = new WheterService();
        TemperatureProvider temperatureProvider = new WheterServiceArapter(wheterService);
        WheterApp wheterApp = new WheterApp(temperatureProvider);

    }
}
