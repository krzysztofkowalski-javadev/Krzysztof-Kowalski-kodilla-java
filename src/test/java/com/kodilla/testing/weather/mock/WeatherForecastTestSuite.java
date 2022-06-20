package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.Test;                                            // [5]
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;                                       // [6]
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WeatherForecastTestSuite {                                              // [7]
    @Mock
    private Temperatures temperaturesMock;
    @Test                                                                      // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);// [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]
    }
    @Test                                                                      // [8]
    void testCalculateAverageTemperatures() {                                     // [9]
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 25.0);                                      // [15]
        temperaturesMap.put("Krakow", 24.0);                                       // [16]
        temperaturesMap.put("Wroclaw", 26.0);                                      // [17]
        temperaturesMap.put("Warszawa", 25.0);                                     // [18]
        temperaturesMap.put("Gdansk", 25.0);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);// [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        double averageTemperaturesTest = weatherForecast.calculateAverageTemperatures();     // [12]

        //Then
        Assertions.assertEquals(25.0, averageTemperaturesTest);                          // [13]
    }
    @Test                                                                      // [8]
    void testCalculateMedianTemperatures() {                                     // [9]
        //Given
        Map<String, Double> temperaturesMap = new HashMap<>();                     // [14]
        temperaturesMap.put("Rzeszow", 23.0);                                      // [15]
        temperaturesMap.put("Krakow", 24.0);                                       // [16]
        temperaturesMap.put("Wroclaw", 26.0);                                      // [17]
        temperaturesMap.put("Warszawa", 25.0);                                     // [18]
        temperaturesMap.put("Gdansk", 27.0);                                       // [19]
        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);// [10]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);// [11]

        //When
        double medianTemperaturesTest = weatherForecast.calculateMedianTemperatures();     // [12]

        //Then
        Assertions.assertEquals(25, medianTemperaturesTest);                          // [13]
    }
}
