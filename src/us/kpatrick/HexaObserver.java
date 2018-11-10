package us.kpatrick;
/**
 * Hexa Class - outputs as Hex
 *
 * @author kpatrick
 * @version 1.00
 */
public class HexaObserver extends Observer {
    /**
     * class constructor - does some stuff
     * @param subject
     */
    public HexaObserver(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    /**
     * output some stuff
     */
    @Override
    public void update() {
        System.out.println( "Hex String: " + Integer.toHexString(
                subject.getState() ).toUpperCase() );
    }
}
