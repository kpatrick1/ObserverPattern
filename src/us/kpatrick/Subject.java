package us.kpatrick;
import java.util.ArrayList;
import java.util.List;
/**
 * Subject class - does some stuff
 *
 * @author kpatrick
 * @version 1.00
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int state;

    /**
     * get the current state
     * @return current state as int
     */
    public int getState() {
        return state;
    }

    /**
     * set the state
     * @param state as int
     */
    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    /**
     * add a new observer
     * @param observer new observer
     */
    public void attach(Observer observer){
        observers.add(observer);
    }

    /**
     * detach an observer
     * @param observer remove observer
     */
    public void detach(Observer observer){
        observers.remove(observer);
    }

    /**
     * update all Observers when status changes
     */
    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }



}
