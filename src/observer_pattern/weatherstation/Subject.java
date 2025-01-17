package observer_pattern.weatherstation;

// 주제! - 상태를 관리하고 실시간으로 상태를 옵저버에게 알려주는 역할
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();

}


