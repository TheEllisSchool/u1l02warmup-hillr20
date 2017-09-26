import javax.swing.JOptionPane;

//Ricarda Hill
//September 15, 2017
//U1L02: Making Change + Committing (That part didn't work for me, but oh well)

 /*public class MakingChange2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Enter an amount."
				+ "Use dollars and cents. \nExample: 1.56");
		double num = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		int cents = (int) (num * 100);
		int quarters = cents/25;
		int dimes = (cents - quarters * 25)/10;
		int nickels = (cents - (quarters * 25 + dimes * 10))/5; 
				//cents - quarters)/10))/5;
		int pennies = cents - (quarters * 25 + dimes * 10 + nickels * 5); 
		//int pennies = cents - nickels * 5;
		//JOptionPane.showMessageDialog(null, "$" + num + " is " + nickels + " nickels and "
				//+ pennies + " pennies.");
		JOptionPane.showMessageDialog(null, "Number of quarters: " + quarters + 
				" \nNumber of dimes: " 
				+ dimes
				+ " \nNumber of nickels: " + nickels + " \nNumber of pennies: " + pennies); 
				
	}

}
*/

/*public class MakingChange2 {

	public static void main(String[] args) {
		String cents1 = JOptionPane.showInputDialog(null, "Enter an amount of cents in whole" 
				+ " numbers. \nExample is $0.43 is 43.");
		double num = Double.parseDouble(cents1);
		String cents2 = JOptionPane.showInputDialog(null, "Enter another amount of cents "
				+ "in whole" + " numbers.");
		JOptionPane.showMessageDialog(null, "cents1 = " + cents1 + "\ncents2 = " + cents2);
		int centsAvg = (cents1 + cents2)/2);
		JOptionPane.showMessageDialog(null, "The average of the two amounts is " + centsAvg);
		/*double num = Double.parseDouble(input);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		int cents = (int) (num * 100);
		int quarters = cents/25;
		int dimes = (cents - quarters * 25)/10;
		int nickels = (cents - (quarters * 25 + dimes * 10))/5; 
				//cents - quarters)/10))/5;
		int pennies = cents - (quarters * 25 + dimes * 10 + nickels * 5); 
		//int pennies = cents - nickels * 5;
		//JOptionPane.showMessageDialog(null, "$" + num + " is " + nickels + " nickels and "
				//+ pennies + " pennies.");
		JOptionPane.showMessageDialog(null, "Number of quarters: " + quarters + 
				" \nNumber of dimes: " 
				+ dimes
				+ " \nNumber of nickels: " + nickels + " \nNumber of pennies: " + pennies); 
				*/
		
//	}
	
//}	

public class MakingChange2 {

	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null, "Please enter an amount."
				+ "Use dollars and cents. \nExample: 1.56");
		String input2 = JOptionPane.showInputDialog(null, "Please enter a second amount.");
		double num = Double.parseDouble(input);
		double num2 = Double.parseDouble(input2);
		//JOptionPane.showMessageDialog(null, "You entered " + num);
		double centsAvg = (num + num2)/2; 
		int cents = (int) (num * 100);
		int cents2 = (int)(num2 * 100);
		JOptionPane.showMessageDialog(null, "The average of your two amounts is: " + centsAvg);
		int quarters = cents/25;
		int dimes = (cents%25)/10;
		int nickels = (cents%25%10)/5;
		int pennies = cents%25%10%5;
		//int nickels = (cents - (quarters * 25 + dimes * 10))%5; 
				//cents - quarters)/10))/5;
		//int pennies = cents - (quarters * 25 + dimes * 10 + nickels * 5); 
		//int pennies = cents - nickels * 5;
		//JOptionPane.showMessageDialog(null, "$" + num + " is " + nickels + " nickels and "
				//+ pennies + " pennies.");
		JOptionPane.showMessageDialog(null, "The first amount equals: "
				+ "\nNumber of quarters: " + quarters +
				" \nNumber of dimes: " + dimes 
				+ " \nNumber of nickels: " + nickels + " \nNumber of pennies: " + pennies); 
		int quarters2 = cents2/25;
		int dimes2 = (cents2%25)/10;
		int nickels2 = (cents2%25%10)/5;
		int pennies2 = cents2%25%10%5;
		//int nickels = (cents - (quarters * 25 + dimes * 10))%5; 
				//cents - quarters)/10))/5;
		//int pennies = cents - (quarters * 25 + dimes * 10 + nickels * 5); 
		//int pennies = cents - nickels * 5;
		//JOptionPane.showMessageDialog(null, "$" + num + " is " + nickels + " nickels and "
				//+ pennies + " pennies.");
		JOptionPane.showMessageDialog(null, "The second amount equals: "
				+ "\nNumber of quarters: " + quarters2 +
				" \nNumber of dimes: " + dimes2 
				+ " \nNumber of nickels: " + nickels2 + " \nNumber of pennies: " + pennies2); 
		
	}
	
}