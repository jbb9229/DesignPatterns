package observer.observer;

public interface Observer {

    /**
     * Observer 인터페이스는 모든 옵저버 클래스에서 구현해야 한다.
     * 따라서 모든 옵저버는 update() 메소드를 구현해야 한다.
     * @param temp      온도
     * @param humidity  습기
     * @param perssure  기압
     */
    public void update(float temp, float humidity, float perssure);

}
