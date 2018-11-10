package us.kpatrick;
/**
 * Binary Class - outputs as binary
 *
 * @author kpatrick
 * @version 1.00
 */
public class BinaryObserver extends Observer {
    /**
     * class constructor - does some stuff
     * @param subject
     */
    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }
    /**
     * output some stuff
     */
    @Override
    public void update() {
        System.out.println("Binary String: " +
                Integer.toBinaryString(subject.getState()));
    }
}
