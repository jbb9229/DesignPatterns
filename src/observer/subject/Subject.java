package observer.subject;

import observer.observer.Observer;

public interface Subject {

    /**
     * 옵저버 등록
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 옵저버 삭제
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 주변 객체의 상태가 변경되었을 때 모든 옵저버들에게 알리기 위한 메소드
     */
    public void notifyObservers();

}
