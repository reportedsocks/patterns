package observer_pattern.ui;

import observer_pattern.subject.Subject;
import observer_pattern.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temp;
    private float humidity;
    private Observable subject;

    public CurrentConditionsDisplay(Observable weatherData) {
        this.subject = weatherData;
        subject.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temperature is " + temp + "F degrees and humidity is " + humidity + "%");
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temp = ((WeatherData) o).getTemp();
            this.humidity = ((WeatherData) o).getHumidity();
            display();
        }
    }
}
