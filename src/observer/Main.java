package observer;

public class Main {

    public static void main(String[] args) {
        RadioTimes radioTimes = new RadioTimes();

        new Subscriber(radioTimes);

        radioTimes.newIssue("Issue 42");
        radioTimes.newIssue("Issue 43");
        radioTimes.newIssue("Issue 44");
    }
}
