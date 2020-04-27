/*
 * @author Hanny Abdullah
 * @since 04-26-2020 
 * @version 1.0
 * 
 * Description: This is my assignment number eleven program which uses event 
 * listeners to create a textbox which accepts a string input. The goal of this
 * program is to create a textbox which accepts a string input and checks if 
 * input is a valid credit card number. The program utilizes the Luhn Algorithm,
 * which is used to detect if a credit card number is a valid number. If the 
 * input string is a valid credit card number, it will tell the user that it 
 * is a valid number. If the number is not a valid credit card number, the 
 * program will tell the user it is an invalid number. 
 * 
 */

package ccapp;
import javax.swing.JFrame;


public class CcApp {

    public static void main(String[] args) throws Exception {
       
            
        ccClass newInput = new ccClass(); 
        
        newInput.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        newInput.setSize(650, 100); 
        newInput.setVisible(true); 
        newInput.setLocationRelativeTo(null); 
        
    }
    
}
