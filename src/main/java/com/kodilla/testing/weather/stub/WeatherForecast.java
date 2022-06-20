package com.kodilla.testing.weather.stub;


import java.util.*;

public class WeatherForecast {
    private  Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String,Double> calculateForecast(){
        Map<String,Double> resultMap=new HashMap<>();
        for (Map.Entry<String,Double> temperature:
        temperatures.getTemperatures().entrySet()) {
            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0);
        }
        return resultMap;
    }
    public double calculateAverageTemperatures(){
        double averageTemperatures=0;
        for (Map.Entry<String,Double> temperature:
                temperatures.getTemperatures().entrySet()) {
            averageTemperatures=temperature.getValue()+averageTemperatures;
        }
        //return averageTemperatures=averageTemperatures/5;
        return averageTemperatures=averageTemperatures/temperatures.getTemperatures().size();
    }
    public double calculateMedianTemperatures(){
        List<Double> seriesTemperatures = new ArrayList<>();
        double medianTemperatures=0;
        for (Map.Entry<String,Double> temperature:
                temperatures.getTemperatures().entrySet()) {
                seriesTemperatures.add(temperature.getValue());
            }
        Collections.sort(seriesTemperatures);
        if (seriesTemperatures.size() % 2 == 0) {
            medianTemperatures = (seriesTemperatures.get((seriesTemperatures.size() - 1) / 2) + seriesTemperatures.get(seriesTemperatures.size() / 2)) / 2;
        } else {
            medianTemperatures = seriesTemperatures.get((seriesTemperatures.size() - 1) / 2);
        }
        return medianTemperatures;
    }
}



