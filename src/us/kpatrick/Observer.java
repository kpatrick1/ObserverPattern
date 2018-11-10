package us.kpatrick;
/**
 * abstract Observer Class
 *
 * @author kpatrick
 * @version 1.00
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
