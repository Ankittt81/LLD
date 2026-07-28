package DesignPatterns.Observer;

public class ForecastDisplay implements Observer,Display{
    private float temperature;
    private float humidity;
    private float pressure;
    @Override
    public void display() {
        System.out.println("Forecast statistics of Weather : ");
        System.out.println("Temperature : " + temperature);
        System.out.println("Pressure : "+ pressure);
        System.out.println("Humidity : " + humidity);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
