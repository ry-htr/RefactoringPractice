/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter1;

public class Robot {
    private final String _name;

    public Robot(String _name) {
        this._name = _name;
    }

    public void order(int command) {
        if (command == 0) {
            System.out.println(_name + " walks");
        } else if (command == 1) {
            System.out.println(_name + " stops");
        } else if (command == 2) {
            System.out.println(_name + " jumps");
        } else {
            System.out.println("Command error. command = " + command);
        }
    }
}
