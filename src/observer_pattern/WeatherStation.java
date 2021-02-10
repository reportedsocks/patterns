package observer_pattern;

import observer_pattern.subject.WeatherData;
import observer_pattern.ui.CurrentConditionsDisplay;
import observer_pattern.ui.HeatIndexDisplay;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        // add other observers

        weatherData.setMeasurements(80, 65, 32.4f);
        weatherData.setMeasurements(78, 54, 67.1f);
        weatherData.setMeasurements(91, 43, 36.9f);
    }
}
