package observer_pattern.weatherstation;

public interface Observer {

    public void update(float temp, float humidity, float pressure);

}
