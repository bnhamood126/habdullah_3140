package ccapp;
import java.awt.FlowLayout; 
import java.awt.event.ActionListener; 
import java.awt.event.ActionEvent;  
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JOptionPane; 


public class ccClass extends JFrame{

    public JTextField item1;
    public JTextField item2;
    boolean result; 
   
    
    public ccClass(){
        
        super("Credit Card Number Verification");
        setLayout(new FlowLayout()); 
        
        
        item1= new JTextField("Please enter credit card #:",15); 
        item1.setEditable(false);
        add(item1); 
        
        item2 = new JTextField(16);
        add(item2); 
        
        thehandler handler = new thehandler(); 
        item1.addActionListener(handler); 
        item2.addActionListener(handler);
         
    } // end of ccClass constructor
    
    
        
    
    public static boolean validateCreditCardNumber(String input){
        
         int[] creditCardInt = new int[input.length()];
         
         if(input.length() < 15 || input.length() > 19){
             
             return false; 
             
        } // If the digit is less than 16 or greater than 19 it will not check
          // if the number is valid because CC#'s are between 16 - 19 digits. 
         
          
         for(int i = 0; i<input.length();i++){
             creditCardInt[i]= Integer.parseInt(input.substring(i, i+1)); 
         }
         
         for(int i = creditCardInt.length - 2; i >= 0; i = i - 2){
             
             int tempValue = creditCardInt[i];
             tempValue = tempValue * 2; 
             
             if(tempValue > 9){
                 tempValue = (tempValue % 10) + 1; 
                 
             }
             
             creditCardInt[i] = tempValue; 
         }
                
         int total = 0; 
         
         for (int i = 0; i< creditCardInt.length; i++){
             
             total += creditCardInt[i];
        
          }
         
         if(total % 10 == 0 ){
             
             return true;
         }
         
         else {
             return false; 
         }
                
    }
    
    private class thehandler implements ActionListener{
    
        public void actionPerformed (ActionEvent event){
            
            String string = ""; 
            String isValid = ""; 
            
            String str = event.getActionCommand(); 
            //converts the input into a string value in order to pass the 
            //value onto the validateCreditCardNumber method. 
            
            result = validateCreditCardNumber(str);
            
             
                if(result == true){
                    isValid = "This number is valid";
                }
                else{
                    isValid = "This number is invalid";
                }
                
            string = isValid; 
                
            JOptionPane.showMessageDialog(null, string); 
            
        } //end of actionPerformed method
       
    
    } // end of thehandler class
   
    
} //end of class ccClass
   


