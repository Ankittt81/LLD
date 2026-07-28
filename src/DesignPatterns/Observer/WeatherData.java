package DesignPatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Observer> observers;

    public WeatherData(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        observers = new ArrayList<Observer>();
        measurementsChanged();
    }

    public void setObservers(List<Observer> observers){
        this.observers = observers;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            o.update(temperature, humidity, pressure);
        }
        System.out.println("Observers Notified");
    }

    public void measurementsChanged(){
        //pre-computation
        System.out.println("******* Measurements Changed ********");
        notifyObservers();
    }

    public void setAttributes(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
