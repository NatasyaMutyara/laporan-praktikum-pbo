/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorencapsulation;

/**
 *
 * @author Natasya Mutyara
 */
public class MotorDemo {
public static void main(String[] args) {
        Motor motor = new Motor();
        
        motor.printStatus();
        motor.kecepatan=50;
        motor.printStatus();
}
}