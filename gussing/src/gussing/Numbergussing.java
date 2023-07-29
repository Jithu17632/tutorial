package gussing;
 import javax.swing.*;
public class Numbergussing {
	 public static void main(String args[]) {
int computerNumber = (int) (Math.random()*100 + 1);
 int userAnswer = 0;
 
 System.out.println("the correct gusse would be "+ computerNumber);
  int count = 1;
  
		 while(userAnswer !=computerNumber) {
			 String response = JOptionPane.showInputDialog(null,
					 "enter a gussing between 1 to 100","gussing game",3);
			 userAnswer = Integer.parseInt(response);
			 JOptionPane.showMessageDialog(null, args, response, count, null);
			 count++;
		 }
	 }
       public static String determineGuess(int userAnswer, int computerNumber, int count) {
    	 if(userAnswer <=0 || userAnswer >100) {
             return "Your guess is invalid";
    	 }
    	 else if (userAnswer == computerNumber) {
    		 return "correct\n total gusses" + count;
    	 }
    	 else if (userAnswer > computerNumber) {
    		 return "the gusss is higher\n try again" + count;
    		 
    	 }
    	 else {
    		 return "your guss is inccorect\n try again" +count;
    	 }
       }
}
