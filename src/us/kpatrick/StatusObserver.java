package us.kpatrick;
/**
 * Status Class - outputs the status
 *
 * @author kpatrick
 * @version 1.00
 */
public class StatusObserver extends Observer{
    /**
     * class constructor - does some stuff
     * @param subject
     */
    public StatusObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    /**
     * output some stuff
     */
    @Override
    public void update() {
        if (subject.getState() < 0) {
            System.out.println("StatusObserver: Negative");
        } else if (subject.getState() == 0) {
            System.out.println("StatusObserver: Equals 0");
        } else if (subject.getState() > 0) {
            System.out.println("Status Observer: Positive");
        }
    }
}
