package observer_pattern.weatherstation;


import java.util.ArrayList;
import java.util.List;


public class WeatherData implements Subject{
    private final List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(temperature,humidity,pressure);
        }
    }

    // 가상의 물리 스테이션으로부터 변화를 감지 하면 notify 함!!!
    public void measurementsChanged() {
        notifyObservers();
    }

    // 가상의 변화 함수
    public void setMeasurements(float temperature,float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
