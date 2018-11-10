package us.kpatrick;
/**
 * Octal  Class - outputs as Octal
 *
 * @author kpatrick
 * @version 1.00
 */
public class OctalObserver extends Observer {
    /**
     * class constructor - does some stuff
     * @param subject
     */
    public OctalObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    /**
     * output some stuff
     */
    @Override
    public void update() {
        System.out.println("Octal: " +
                Integer.toOctalString(subject.getState() ) );
    }
}
