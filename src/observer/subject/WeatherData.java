package observer.subject;

import java.util.ArrayList;
import observer.observer.Observer;

public class WeatherData implements Subject {

    // Observer 객체들을 저장하기 위한 ArrayList
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observers = new ArrayList();
    }

    /**
     * 옵저버 등록은 리스트의 맨 뒤에 추가하기만 하면 된다.
     * @param observer
     */
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * 옵저버가 탈퇴를 신청하면 목록에서 제거
     * @param observer
     */
    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    /**
     * 상태에 대해 모든 옵저버들에게 알려주는 메소드
     */
    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    /**
     * 기상 스테이션으로부터 갱신된 측정치를 받으면 옵저버들한테 알린다.
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 디스플레이 항목 테스트를 위한 메소드
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    // 기타 추가할 WeatherData 메소드

}
