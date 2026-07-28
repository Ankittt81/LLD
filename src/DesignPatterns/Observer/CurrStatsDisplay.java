package DesignPatterns.Observer;

public class CurrStatsDisplay implements Observer,Display{
    private float temperature;
    private float pressure;
    private float humidity;

    @Override
    public void display() {
        System.out.println("Current Statistics of Weather : ");
        System.out.println("Temperature : " + temperature);
        System.out.println("Pressure : "+ pressure);
        System.out.println("Humidity : " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        display();
    }
}
