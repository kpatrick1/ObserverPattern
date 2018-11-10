package us.kpatrick;
/**
 * Main start of the observer pattern
 *
 * @author kpatrick
 * @version 1.00
 */
public class Main {

    public static void main(String[] args) {
        Subject subject = new Subject();

        Observer hex = new HexaObserver(subject);
        Observer oct =  new OctalObserver(subject);
        Observer bin = new BinaryObserver(subject);
        Observer sta = new StatusObserver(subject);

        subject.detach(bin);
        System.out.println("First state change: 0");
        subject.setState(0);
        System.out.println("Second state change: -10");
        subject.setState(-10);

    }
}
