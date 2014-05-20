package observer;

import java.util.Observable;

public class RadioTimes extends Observable {

    private String issue;

    public void newIssue(String issue) {
        this.issue = issue;
        setChanged();
        notifyObservers();
    }

    public String getIssue() {
        return issue;
    }
}
