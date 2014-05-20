package observer;

import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer {

    private String latestIssue;

    public Subscriber(RadioTimes radioTimes) {
        radioTimes.addObserver(this);
        this.latestIssue = radioTimes.getIssue();
    }

    @Override
    public void update(Observable o, Object arg) {
        RadioTimes radioTimes = (RadioTimes) o;
        latestIssue = radioTimes.getIssue();
        System.out.println("New issue received: " + latestIssue);
    }
}
