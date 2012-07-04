package chapter9;

/**
 * Created with IntelliJ IDEA.
 * User: neet_orz
 * Date: 12/07/04
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class StateLogging extends State{
    @Override public int getTypeCode() {
        return Logger.STATE_LOGGING;
    }
}
